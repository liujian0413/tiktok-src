package com.bytedance.ies.bullet.kit.web;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;

/* renamed from: com.bytedance.ies.bullet.kit.web.n */
public interface C10647n {
    /* renamed from: a */
    void mo25055a(C10641h hVar, int i, String str, String str2);

    /* renamed from: a */
    void mo25056a(C10641h hVar, HttpAuthHandler httpAuthHandler, String str, String str2);

    /* renamed from: a */
    void mo25057a(C10641h hVar, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo25058a(C10641h hVar, C10646m mVar, C10645l lVar);

    /* renamed from: a */
    void mo25059a(C10641h hVar, String str);

    /* renamed from: a */
    void mo25060a(C10641h hVar, String str, Bitmap bitmap);

    /* renamed from: a */
    boolean mo25061a(C10641h hVar, C10646m mVar);

    /* renamed from: b */
    WebResourceResponse mo25062b(C10641h hVar, C10646m mVar);

    /* renamed from: b */
    boolean mo25063b(C10641h hVar, String str);

    /* renamed from: c */
    WebResourceResponse mo25064c(C10641h hVar, String str);
}
