package com.example.mashal.fragment_pager;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by mashal on 2018-02-07.
 */
public class firstFragment extends android.support.v4.app.Fragment{
    public WebView mWebView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.firstfrgment,container,false);
        mWebView = (WebView) view.findViewById(R.id.webview);
        mWebView.loadUrl("https://www.google.com.eg/");
        return view;
    }
}
