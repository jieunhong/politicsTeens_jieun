package kr.hs.e_mirim.politicsteens;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    ListView listView;
    PostListAdapter postListAdapter;
    private static final String MOVIE_URL = "http://sites.google.com/site/ubiaccessmobile/sample_video.mp4";
    ArrayList<PostItem> postItemArrayList;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);


        final ViewPager viewPager=(ViewPager)view.findViewById(R.id.pager);
        CustomAdapter adapter=new CustomAdapter(getActivity().getLayoutInflater());
        viewPager.setAdapter(adapter);
        viewPager.setPageMargin(getResources().getDisplayMetrics().widthPixels/-20);
        viewPager.setOffscreenPageLimit(2);
        listView=(ListView)view.findViewById(R.id.listview);
        postItemArrayList=new ArrayList<PostItem>();

        postItemArrayList.add(new PostItem(R.drawable.popu_1));
        postItemArrayList.add(new PostItem(R.drawable.popu_2));
        postItemArrayList.add(new PostItem(R.drawable.popu_3));


        VideoView videoView = (VideoView) view.findViewById(R.id.video_View);
        MediaController mediaController = new MediaController(getActivity());
        mediaController.setAnchorView(videoView);
        // Set video link (mp4 format )
        Uri video = Uri.parse(MOVIE_URL);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(video);
        videoView.requestFocus();
        videoView.start();


        postListAdapter=new PostListAdapter(getContext(),postItemArrayList);
        listView.setAdapter(postListAdapter);

        return view;
    }

}
