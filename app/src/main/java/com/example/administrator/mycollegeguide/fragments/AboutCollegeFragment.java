package com.example.administrator.mycollegeguide.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.administrator.mycollegeguide.R;

/**
 * Created by Administrator on 2017/8/11 0011.
 */


/**
 * this class is to inflate the layout
 * that will be made of a web view to display an introduction
 * of the college
 */
public class AboutCollegeFragment extends Fragment {


    private static final String URL_EXTRA_KEY = "key";
    private static String url;


    /**
     * onCreate mthod
     * @param savedInstanceState
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        url = getArguments().getString(URL_EXTRA_KEY);

    }




    /**
     * inflater method
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflate layout
        View view = inflater.inflate(R.layout.about_layout , container , false);

        //gets the webView
        WebView webView = view.findViewById(R.id.about_web_view);

        //loads the url
        webView.loadUrl(url);


        return view;
    }





    /**
     * returns an instance of this fragment
     * together with its argument
     * @param url
     * @return
     */
    public static AboutCollegeFragment getInstance(String url){

        Bundle bundle = new Bundle();
        bundle.putString(URL_EXTRA_KEY , url);
        AboutCollegeFragment fragment = new AboutCollegeFragment();
        fragment.setArguments(bundle);
        return  fragment;
    }
}
