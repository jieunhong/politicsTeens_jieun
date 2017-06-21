package kr.hs.e_mirim.politicsteens;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class JustnessFragment extends Fragment {

    ListView listView ;
    PostListAdapter postListAdapter;
    ArrayList<PostItem> postItemArrayList;

    public JustnessFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_justness, container, false);

        CustomAdapter adapter=new CustomAdapter(getActivity().getLayoutInflater());
        listView=(ListView)view.findViewById(R.id.zungdang_list);
        postItemArrayList=new ArrayList<PostItem>();

        postItemArrayList.add(new PostItem(R.drawable.sebin));
        postItemArrayList.add(new PostItem(R.drawable.silverain));
        postItemArrayList.add(new PostItem(R.drawable.zisilver));

        postListAdapter=new PostListAdapter(getContext(),postItemArrayList);
        listView.setAdapter(postListAdapter);
        return view;
    }

}
