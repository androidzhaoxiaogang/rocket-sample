package fast.rocket.sample;

import fast.rocket.Rocket;
import fast.rocket.cache.CacheImageView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListsApdater extends BaseAdapter {
    private String[] mUrls;
    private LayoutInflater mInflater;

    public ListsApdater(Context context, String[] urls) {
        mUrls = urls;
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

    @Override
    public int getCount() {
        return mUrls.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (null == convertView) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item, null);
            holder.view = (CacheImageView)convertView.findViewById(R.id.image);
            holder.text = (TextView)convertView.findViewById(R.id.text);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.text.setText("item "+position);
        //holder.view.setImageUrl(mUrls[position], imageLoader);
        Rocket.with(holder.view).load(mUrls[position]);
        return convertView;
    }

    public void recycle() {
        mUrls = null;
        mInflater = null;
    }

    static class ViewHolder {
    	CacheImageView view;
        TextView text;
    }
}
