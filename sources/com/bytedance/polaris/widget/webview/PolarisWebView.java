package com.bytedance.polaris.widget.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import java.util.Map;

public class PolarisWebView extends SSWebView {
    public /* bridge */ /* synthetic */ void clearFormData() {
        super.clearFormData();
    }

    public /* bridge */ /* synthetic */ void clearHistory() {
        super.clearHistory();
    }

    public /* bridge */ /* synthetic */ void computeScroll() {
        super.computeScroll();
    }

    public /* bridge */ /* synthetic */ void goBack() {
        super.goBack();
    }

    public /* bridge */ /* synthetic */ void goForward() {
        super.goForward();
    }

    public /* bridge */ /* synthetic */ void reload() {
        super.reload();
    }

    public /* bridge */ /* synthetic */ void stopLoading() {
        super.stopLoading();
    }

    public /* bridge */ /* synthetic */ boolean canGoBack() {
        return super.canGoBack();
    }

    public /* bridge */ /* synthetic */ boolean canGoForward() {
        return super.canGoForward();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public /* bridge */ /* synthetic */ String getOriginalUrl() {
        return super.getOriginalUrl();
    }

    public /* bridge */ /* synthetic */ int getProgress() {
        return super.getProgress();
    }

    public /* bridge */ /* synthetic */ String getUrl() {
        return super.getUrl();
    }

    /* renamed from: a */
    private void m36187a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(false);
        settings.setSupportMultipleWindows(false);
        settings.setBuiltInZoomControls(false);
        settings.setAppCacheEnabled(true);
    }

    public /* bridge */ /* synthetic */ void clearCache(boolean z) {
        super.clearCache(z);
    }

    public /* bridge */ /* synthetic */ void goBackOrForward(int i) {
        super.goBackOrForward(i);
    }

    public /* bridge */ /* synthetic */ void loadUrl(String str) {
        super.loadUrl(str);
    }

    public /* bridge */ /* synthetic */ void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
    }

    public /* bridge */ /* synthetic */ void setDownloadListener(DownloadListener downloadListener) {
        super.setDownloadListener(downloadListener);
    }

    public /* bridge */ /* synthetic */ void setNetworkAvailable(boolean z) {
        super.setNetworkAvailable(z);
    }

    public /* bridge */ /* synthetic */ void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
    }

    public /* bridge */ /* synthetic */ void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
    }

    public PolarisWebView(Context context) {
        super(context);
        m36187a();
    }

    public /* bridge */ /* synthetic */ boolean canGoBackOrForward(int i) {
        return super.canGoBackOrForward(i);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void postUrl(String str, byte[] bArr) {
        super.postUrl(str, bArr);
    }

    public /* bridge */ /* synthetic */ void loadUrl(String str, Map map) {
        super.loadUrl(str, map);
    }

    public PolarisWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m36187a();
    }

    public /* bridge */ /* synthetic */ void loadData(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
    }

    public PolarisWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36187a();
    }

    public /* bridge */ /* synthetic */ void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }
}
