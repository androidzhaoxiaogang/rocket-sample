package fast.rocket.sample;

import java.util.UUID;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

public class Utils {
	public static String getDeviceToken(Context context) {
		String device_id = Secure.getString(context.getContentResolver(),
				Secure.ANDROID_ID);
		if (TextUtils.isEmpty(device_id)
				|| device_id.equals("9774d56d682e549c")) {
			TelephonyManager tm = (TelephonyManager) context
					.getSystemService(Context.TELEPHONY_SERVICE);
			device_id = tm.getDeviceId();
		} else {
			return device_id;
		}
		if (TextUtils.isEmpty(device_id)
				|| device_id.equals("9774d56d682e549c")) {
			SharedPreferences token = context.getSharedPreferences("token", 0);
			SharedPreferences.Editor editor = token.edit();
			device_id = token.getString("token", "");
			if (TextUtils.isEmpty(device_id)) {
				UUID uuid = UUID.randomUUID();
				String uniqueId = uuid.toString();
				device_id = uniqueId.replace("-", "");
				editor.putString("token", "");
				editor.commit();
			}
		}
		return device_id;
	}

	public static String getVersionCode(Context context) {
		String versionCode = "";
		try {
			// 获取软件版本号，对应AndroidManifest.xml下android:versionCode
			versionCode = context.getPackageManager().getPackageInfo("com.bench.yylc", 0).versionName;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return versionCode;
	}
}
