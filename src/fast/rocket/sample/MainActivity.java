package fast.rocket.sample;

import java.io.File;
import java.util.HashMap;

import fast.rocket.Rocket;
import fast.rocket.cache.CachePolicy;
import fast.rocket.error.RocketError;
import fast.rocket.response.JsonCallback;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity implements JsonCallback<UserInfo>{
	ListView mList;
	ListsApdater mAdapter;
	EditText phone;
	Button ok;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		setupViews();
	}

	private void setupViews() {
		mList = (ListView) findViewById(R.id.list);
		mAdapter = new ListsApdater(this, mUrls);
		mList.setAdapter(mAdapter);

//		phone = (EditText) findViewById(R.id.phone);
//		ok = (Button) findViewById(R.id.ok);
//		
//		
//		ok.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				for(int i = 0; i < 30; i++) {
//					//register();
//					//login();
//					getFund();
//				}
//			}
//		});
		
		login();
	}

	//rest api 
	private void login() {
		final HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("method", "onLogin");
		params.put("account", "csyw");
		params.put("passWord", "111111");

		Rocket.with(this).load(Constants.loginUrl)
				.asJson(UserInfo.class)
				.enableCookie(true)
				.requestParams(params)
				.invoke(this);
	}
	
	//rest api
	@SuppressWarnings("unused")
	private void register() {
		final HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("token", Utils.getDeviceToken(this));
		params.put("phone", phone.getText().toString());
		params.put("vjson", "ANDROID");
		params.put("sign_t", "MD5");
		params.put("sign", Md5Encrypt.md5("", "ANDROID888888"));
		params.put("ver", Utils.getVersionCode(this));
		params.put("_", String.valueOf(System.currentTimeMillis()));
		
		Rocket.with(this)
			.load(Constants.registerUrl)
			.asJson(LoginResult.class)
			.requestParams(params)
			.invoke(new JsonCallback<LoginResult>() {
				public void onCompleted(RocketError error, LoginResult result) {
					if (error != null) {
						System.out.println("========error=======" + error);
					} else {
						System.out.println("========result======" + result);
					}
				}
		});
	}
	
	//rest api
	@SuppressWarnings("unused")
	private void getFund() {
		final HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("token", Utils.getDeviceToken(this));
		params.put("vjson", "ANDROID");
		params.put("sign_t", "MD5");
		params.put("sign", Md5Encrypt.md5("", "ANDROID888888"));
		params.put("ver", Utils.getVersionCode(this));
		params.put("_", String.valueOf(System.currentTimeMillis()));
		
		Rocket.with(this)
			.load(Constants.fundPfofitUrl)
			.asJson(FundResult.class)
			.requestParams(params)
			.invoke(new JsonCallback<FundResult>() {
			public void onCompleted(RocketError error, FundResult result) {
				if (error != null) {
							
					System.out.println("========error=======" + error);
				} else {
					System.out.println("========result======" + result);

							//testCookie();
				}
			}
		});
	}

	//rest api
	private void testCookie() {
		final HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("method", "GetExamInfo");

		Rocket.with(this)
			.load(Constants.getExamInfoUrl)
			.asJson(PaperInfo.class)
			.enableCookie(true)
			.requestParams(params)
			.invoke(new JsonCallback<PaperInfo>() {
			public void onCompleted(RocketError error, PaperInfo result) {
				if (error != null) {
					System.out.println("========error=======" + error);
				} else {
					System.out.println("========result======" + result);
				}
			}
		});
	}
	
	@SuppressWarnings("unused")
	private void uploadTagedPhoto(final PhotoInfo info) {
	JsonCallback<UploadPhotoResp> cb = new JsonCallback<UploadPhotoResp>() {
		public void onCompleted(RocketError error, UploadPhotoResp result) {
		}
	};
	
	HashMap<String, String> params = new HashMap<String, String>();
	params.put("userId", "" + 11111);
	params.put("userName", "aaaa");
	params.put("password", "bbbbb");
	
	
	Rocket.with(this)
	.load("-----" + "/photo/upload/")
	.asFile(UploadPhotoResp.class)
	.addFile("image", getImageUri(this).getPath())
	.addMultipartParam(params)
	.cachePolicy(CachePolicy.NOCACHE)
	.invoke(cb);
	}
	
	private Uri getImageUri(Context context) {
		final String imageName = "test.jpg";
		File dir = getTempCacheDir(context);
		File iamgeFile = new File(dir, imageName);
		return Uri.fromFile(iamgeFile);
	}
	
	public static File getTempCacheDir(Context context) {
		return context.getExternalCacheDir();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	private String[] mUrls = {
			"http://d.hiphotos.baidu.com/image/pic/item/4d086e061d950a7ba9690f4c08d162d9f3d3c9de.jpg",
			"http://d.hiphotos.baidu.com/image/pic/item/e7cd7b899e510fb3f44aab00db33c895d0430cd2.jpg",
			"http://b.hiphotos.baidu.com/image/pic/item/960a304e251f95ca486dba40cb177f3e660952af.jpg",
			"http://c.hiphotos.baidu.com/image/pic/item/f11f3a292df5e0febb0ac8895e6034a85edf7223.jpg",
			"http://e.hiphotos.baidu.com/image/pic/item/1c950a7b02087bf4367b87f1f0d3572c11dfcf17.jpg",
	};

	@Override
	public void onCompleted(RocketError error, UserInfo result) {
		if (error != null) {  
			System.out.println("========error=======" + error);
		} else {
			System.out.println("========result======" + result);
			testCookie();
		}
	}
}
