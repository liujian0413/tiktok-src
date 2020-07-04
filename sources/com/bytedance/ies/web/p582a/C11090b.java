package com.bytedance.ies.web.p582a;

import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;

/* renamed from: com.bytedance.ies.web.a.b */
public final class C11090b extends WebView {

    /* renamed from: a */
    public boolean f30165a;

    /* renamed from: b */
    private C11096h f30166b;

    public final boolean canGoBack() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public final void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public final void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    public final int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public final String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public final int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public final String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void goBack() {
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    public final void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public final void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public final void setWebViewUrlFilter(C11096h hVar) {
        this.f30166b = hVar;
    }

    public final boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public final void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    public final void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public final void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private String m32503a(String str) {
        if (this.f30166b != null) {
            return this.f30166b.mo27073a(str);
        }
        return str;
    }

    public final void loadUrl(String str) {
        try {
            C11091c.m32506a(this, m32503a(str));
        } catch (Exception unused) {
        }
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        boolean z;
        try {
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient != null) {
                z = true;
            } else {
                z = false;
            }
            this.f30165a = z;
        } catch (Exception unused) {
            this.f30165a = false;
        }
    }

    public final void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(m32503a(str), bArr);
        } catch (Exception unused) {
        }
    }

    public final void loadUrl(String str, Map<String, String> map) {
        try {
            C11091c.m32507a(this, m32503a(str), map);
        } catch (Exception unused) {
        }
    }

    public final void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
