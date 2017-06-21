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
    View view;
    VideoView videoView;
    static int count=0;

    private static final String MOVIE_URL = "http://sites.google.com/site/ubiaccessmobile/sample_video.mp4";
    PostListAdapter postListAdapter;
    ArrayList<PostItem> postItemArrayList;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);;
        videoView = (VideoView) view.findViewById(R.id.video_View);

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


        // Set video link (mp4 format )
        Uri video = Uri.parse(MOVIE_URL);
        videoView.setVideoURI(video);
        videoView.requestFocus();
        videoView.start();

        videoView.stopPlayback();
        videoView.setBackgroundColor(getResources().getColor(R.color.noColor));

        /*videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(count == 1 ){
                    playVideo();
                    count=0;
                }
                else {
                    stopVideo();
                    count=1;
                }
            }
        });*/


        postListAdapter=new PostListAdapter(getContext(),postItemArrayList);
        listView.setAdapter(postListAdapter);

        return view;
    }

    private void stopVideo() {
        videoView.pause();
    }

    private void playVideo() {
        videoView.start();

    }

}
