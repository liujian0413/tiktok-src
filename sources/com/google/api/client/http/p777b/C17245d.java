package com.google.api.client.http.p777b;

import com.p280ss.android.ugc.aweme.lancet.network.C7116a;
import com.p280ss.android.ugc.aweme.lancet.network.C7118e;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.google.api.client.http.b.d */
final class C17245d {
    /* renamed from: a */
    static void m57328a(HttpURLConnection httpURLConnection, String str, String str2) {
        URLConnection uRLConnection = httpURLConnection;
        if (C7118e.m22232a(uRLConnection)) {
            C7116a.m22226a(uRLConnection.getURL(), str, str2, "");
        } else if (C7163a.m22363a()) {
            C7116a.m22230b(uRLConnection.getURL(), str, str2, "");
        }
        httpURLConnection.addRequestProperty(str, str2);
    }
}
