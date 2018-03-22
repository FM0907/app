package com.example.fanzhaoyu.loginapp;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Fan Zhaoyu on 2018/2/26.
 */

public class TextFragment extends Fragment {
    private TextView fragmentTv;
    public static TextFragment getTextFragment(String text){
        Bundle bundle=new Bundle();
        bundle.putString("Text",text);
        TextFragment textFragment= new TextFragment();
        textFragment.setArguments(bundle);
        return textFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view_test,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentTv=view.findViewById(R.id.fragment_tv);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle=getArguments();
        String text = bundle.getString("text");
        fragmentTv.setText(text);
    }
}
