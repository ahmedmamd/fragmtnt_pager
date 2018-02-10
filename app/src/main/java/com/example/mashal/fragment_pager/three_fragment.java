package com.example.mashal.fragment_pager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by mashal on 2018-02-07.
 */
public class three_fragment extends Fragment {
    public WebView mWebView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.threefragment, container, false);
        mWebView = (WebView) view.findViewById(R.id.webview3);
        mWebView.loadUrl("https://www.instagram.com/");
        return view;
    }
}