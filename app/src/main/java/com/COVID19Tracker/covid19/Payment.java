package com.COVID19Tracker.covid19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;


import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.Circle;

import im.delight.android.webview.AdvancedWebView;

public class Payment extends AppCompatActivity implements AdvancedWebView.Listener{
    private AdvancedWebView mWebView;
    ProgressBar progressBar;
    private static final String TAG = "Payment";
    private Toolbar TracToolBar;
    String URL = "//www.bbc.com/arabic/science-and-tech-51802018";//www.bbc.com/arabic/science-and-tech-51802018;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        progressBar = (ProgressBar)findViewById(R.id.spin_kit);
        Sprite doubleBounce = new Circle();
        doubleBounce.setColor(R.color.black);
        progressBar.setIndeterminateDrawable(doubleBounce);
        progressBar.setVisibility(View.VISIBLE);
        mWebView = (AdvancedWebView) findViewById(R.id.webview);
        TracToolBar = findViewById(R.id.TracToolBar);
        TracToolBar.setTitle(getResources().getString(R.string.preventive_healthcare));
        TracToolBar.setTitleTextColor(getColor(R.color.white));
        setSupportActionBar(TracToolBar);

       // mWebView.setListener(Payment.this);
        mWebView.setListener(Payment.this, this);



        mWebView.loadUrl("https://www.bbc.com/arabic/science-and-tech-51802018");
    }



    @SuppressLint("NewApi")
    @Override
    protected void onResume() {
        super.onResume();
        mWebView.onResume();
        // ...
    }

    @SuppressLint("NewApi")
    @Override
    protected void onPause() {
        mWebView.onPause();
        // ...
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        mWebView.onDestroy();
        // ...
        super.onDestroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        mWebView.onActivityResult(requestCode, resultCode, intent);
        // ...
    }

    @Override
    public void onBackPressed() {
        if (!mWebView.onBackPressed()) { return; }
        // ...
        Intent intent = new Intent(Payment.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }

    @Override
    public void onPageStarted(String url, Bitmap favicon) {

        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onPageFinished(String url) {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onPageError(int errorCode, String description, String failingUrl) {

        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) { }

    @Override
    public void onExternalPageRequest(String url) { }
}
