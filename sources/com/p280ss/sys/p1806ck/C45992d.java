package com.p280ss.sys.p1806ck;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.sys.ck.d */
public class C45992d {

    /* renamed from: a */
    private static Handler f117534a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private String f117535b;

    /* renamed from: c */
    private WeakReference<WebView> f117536c;

    public C45992d(WebView webView, String str) {
        this.f117536c = new WeakReference<>(webView);
        this.f117535b = str;
    }
}
