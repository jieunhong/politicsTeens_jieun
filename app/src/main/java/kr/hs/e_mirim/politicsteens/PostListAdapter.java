package kr.hs.e_mirim.politicsteens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by User on 2017-06-19.
 */

public class PostListAdapter extends BaseAdapter {

    Context context;
    ArrayList<PostItem> postItemArrayList;

    ImageView post_image;

    public PostListAdapter(Context context,ArrayList<PostItem> postItemArrayList)
    {
        this.context=context;
        this.postItemArrayList=postItemArrayList;
    }
    @Override
    public int getCount() {
        return this.postItemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.postItemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(R.layout.listview_item,null);
            post_image=(ImageView)convertView.findViewById(R.id.img);
        }
        post_image.setImageResource(postItemArrayList.get(position).getPost_image());
        return convertView;
    }
}
