package com.p280ss.android.newmedia.p897ui.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.config.AppConfig;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.util.Map;

/* renamed from: com.ss.android.newmedia.ui.webview.SSWebView */
public class SSWebView extends WebView {
    private static final String TAG = "SSWebView";
    public boolean canTouch = true;
    private long lastCickTime;
    private long startClickTime;
    private int timeInterval = VETransitionFilterParam.TransitionDuration_DEFAULT;

    public boolean canGoBack() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    public int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public void goBack() {
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    public void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public int getTimeInterval() {
        if (this.timeInterval > 0) {
            return this.timeInterval;
        }
        return VETransitionFilterParam.TransitionDuration_DEFAULT;
    }

    public boolean hasClickInTimeInterval() {
        if (System.currentTimeMillis() - this.lastCickTime < ((long) getTimeInterval())) {
            return true;
        }
        return false;
    }

    public void setCanTouch(boolean z) {
        this.canTouch = z;
    }

    public void setTimeInterval(int i) {
        this.timeInterval = i;
    }

    public boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    public void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context) {
        super(context);
    }

    public void loadUrl(String str) {
        try {
            C20004f.m65923a(this, fileterUrl(str));
        } catch (Exception unused) {
        }
    }

    private String fileterUrl(String str) {
        Context context = getContext();
        if (context == null || !isHttpUrl(str)) {
            return str;
        }
        return AppConfig.getInstance(context).filterUrlOnUIThread(str);
    }

    private boolean isHttpUrl(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.canTouch) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.startClickTime = System.currentTimeMillis();
                break;
            case 1:
                if (System.currentTimeMillis() - this.startClickTime < 100) {
                    this.lastCickTime = System.currentTimeMillis();
                    break;
                }
                break;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(fileterUrl(str), bArr);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void loadUrl(String str, Map<String, String> map) {
        try {
            C20004f.m65924a(this, fileterUrl(str), map);
        } catch (Exception unused) {
        }
    }

    public void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
