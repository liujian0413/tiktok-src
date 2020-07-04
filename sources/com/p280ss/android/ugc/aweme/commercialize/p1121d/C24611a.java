package com.p280ss.android.ugc.aweme.commercialize.p1121d;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25363i;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.d.a */
public final class C24611a implements C25965c {

    /* renamed from: c */
    public static final List<JSONObject> f64919c = new ArrayList();

    /* renamed from: d */
    public static final C24612a f64920d = new C24612a(null);

    /* renamed from: f */
    private static final String f64921f = C24611a.class.getSimpleName();

    /* renamed from: a */
    public boolean f64922a;

    /* renamed from: b */
    public boolean f64923b;

    /* renamed from: e */
    private boolean f64924e = false;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.d.a$a */
    public static final class C24612a {
        private C24612a() {
        }

        /* renamed from: a */
        public static List<JSONObject> m80690a() {
            return C24611a.f64919c;
        }

        public /* synthetic */ C24612a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo64463a(String str, int i, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error_code", i);
                jSONObject.put("description", str2);
                m80690a().add(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final boolean mo64225b(WebView webView, String str) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo64462a() {
        return this.f64922a && !this.f64923b;
    }

    public C24611a(boolean z) {
    }

    /* renamed from: a */
    private static boolean m80681a(String str) {
        if (str == null || !str.equals("about:blank")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m80680a(WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            Uri url = webResourceRequest.getUrl();
            if (url != null) {
                String path = url.getPath();
                if (path != null) {
                    return C7634n.m23723c(path, "favicon.ico", false);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo64223a(WebView webView, String str) {
        if (!m80681a(str) && !this.f64922a) {
            this.f64922a = true;
            new StringBuilder("load finish: url=").append(str);
            new StringBuilder("load details: ").append(f64919c);
            C25363i.m83391a(str);
        }
    }

    /* renamed from: a */
    public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        int i;
        C24612a aVar = f64920d;
        if (sslError != null) {
            str = sslError.getUrl();
        } else {
            str = null;
        }
        if (sslError != null) {
            i = sslError.getPrimaryError();
        } else {
            i = 0;
        }
        aVar.mo64463a(str, i, "ssl error");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64221a(android.webkit.WebView r3, android.webkit.WebResourceRequest r4, android.webkit.WebResourceError r5) {
        /*
            r2 = this;
            r3 = 0
            if (r4 == 0) goto L_0x000e
            android.net.Uri r0 = r4.getUrl()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.toString()
            goto L_0x000f
        L_0x000e:
            r0 = r3
        L_0x000f:
            boolean r0 = m80681a(r0)
            if (r0 == 0) goto L_0x0016
            return
        L_0x0016:
            r0 = 1
            r2.f64923b = r0
            com.ss.android.ugc.aweme.commercialize.d.a$a r0 = f64920d
            if (r4 == 0) goto L_0x0028
            android.net.Uri r4 = r4.getUrl()
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = r4.toString()
            goto L_0x0029
        L_0x0028:
            r4 = r3
        L_0x0029:
            if (r5 == 0) goto L_0x0030
            int r1 = r5.getErrorCode()
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            if (r5 == 0) goto L_0x003d
            java.lang.CharSequence r5 = r5.getDescription()
            if (r5 == 0) goto L_0x003d
            java.lang.String r3 = r5.toString()
        L_0x003d:
            r0.mo64463a(r4, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.p1121d.C24611a.mo64221a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64222a(android.webkit.WebView r3, android.webkit.WebResourceRequest r4, android.webkit.WebResourceResponse r5) {
        /*
            r2 = this;
            r3 = 0
            if (r4 == 0) goto L_0x000e
            android.net.Uri r0 = r4.getUrl()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.toString()
            goto L_0x000f
        L_0x000e:
            r0 = r3
        L_0x000f:
            boolean r0 = m80681a(r0)
            if (r0 == 0) goto L_0x0016
            return
        L_0x0016:
            boolean r0 = r2.f64924e
            if (r0 == 0) goto L_0x0023
            boolean r0 = m80680a(r4)
            if (r0 != 0) goto L_0x0023
            r0 = 1
            r2.f64923b = r0
        L_0x0023:
            com.ss.android.ugc.aweme.commercialize.d.a$a r0 = f64920d
            if (r4 == 0) goto L_0x0032
            android.net.Uri r4 = r4.getUrl()
            if (r4 == 0) goto L_0x0032
            java.lang.String r4 = r4.toString()
            goto L_0x0033
        L_0x0032:
            r4 = r3
        L_0x0033:
            if (r5 == 0) goto L_0x003a
            int r1 = r5.getStatusCode()
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r5 == 0) goto L_0x0041
            java.lang.String r3 = r5.getReasonPhrase()
        L_0x0041:
            r0.mo64463a(r4, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.p1121d.C24611a.mo64222a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
    }

    /* renamed from: a */
    public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
        if (!m80681a(str)) {
            this.f64922a = false;
            this.f64923b = false;
            f64919c.clear();
        }
    }

    /* renamed from: a */
    public final void mo64219a(WebView webView, int i, String str, String str2) {
        if (!m80681a(str2)) {
            this.f64923b = true;
            f64920d.mo64463a(str2, i, str);
        }
    }
}
