package com.sujan.esoftwarica.ui.aboutus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.sujan.esoftwarica.R;

public class AboutUsFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_aboutus, container, false);
        WebView webView  = (WebView) view.findViewById(R.id.webView);
        webView.loadUrl("https://softwarica.edu.np/");

        // Enable Javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);
//        webSettings.setAllowContentAccess(true);

        // webSettings.setDomStorageEnabled(true);
//        webSettings.setUseWideViewPort(true);
//        if (Build.VERSION.SDK_INT >= 19) {
//            webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
//        } else if (Build.VERSION.SDK_INT >= 11 && Build.VERSION.SDK_INT < 19) {
//            webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
//        }
        // Force links and redirects to open in the WebView instead of in a browser
        webView.setWebViewClient(new WebViewClient());


        return  view;

    }
}