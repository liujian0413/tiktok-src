package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.p280ss.android.ugc.aweme.lancet.network.C32285d;
import com.p280ss.android.ugc.aweme.lancet.network.C7116a;
import com.p280ss.android.ugc.aweme.lancet.network.C7118e;
import com.p280ss.android.ugc.aweme.net.C34068h;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.e */
final class C10131e {
    /* renamed from: a */
    static InputStream m30085a(HttpURLConnection httpURLConnection) throws IOException {
        URLConnection uRLConnection = httpURLConnection;
        if (C7118e.m22232a(uRLConnection)) {
            C7116a.m22226a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
        } else if (C7163a.m22363a()) {
            C7116a.m22230b(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
        }
        return httpURLConnection.getInputStream();
    }

    /* renamed from: a */
    static void m30086a(HttpURLConnection httpURLConnection, C10104a aVar) {
        C10124b.m30068b(httpURLConnection, aVar);
        if (httpURLConnection != null && aVar != null && (aVar instanceof C34068h)) {
            try {
                ((C34068h) aVar).f88840C = C32285d.m104809a(httpURLConnection);
                ((C34068h) aVar).f88841D = C32285d.m104811b(httpURLConnection);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static void m30087a(HttpURLConnection httpURLConnection, String str, String str2) {
        URLConnection uRLConnection = httpURLConnection;
        if (C7118e.m22232a(uRLConnection)) {
            C7116a.m22226a(uRLConnection.getURL(), str, str2, "");
        } else if (C7163a.m22363a()) {
            C7116a.m22230b(uRLConnection.getURL(), str, str2, "");
        }
        httpURLConnection.setRequestProperty(str, str2);
    }
}
