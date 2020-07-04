package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.net.Uri;
import bolts.C1591g;
import bolts.C1592h;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.app.bn */
public final class C22905bn extends C23019q {
    public C22905bn(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Uri mo59864a(Uri uri) {
        m75388c(uri);
        return Uri.parse("musically://shortlink");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo59880b(Uri uri) throws Exception {
        return m75387a(uri.toString());
    }

    /* renamed from: c */
    private void m75388c(Uri uri) {
        if (uri != null) {
            C1592h.m7853a((Callable<TResult>) new C22906bo<TResult>(this, uri)).mo6885c((C1591g<TResult, TContinuationResult>) new C22907bp<TResult,TContinuationResult>(this, uri));
        }
    }

    /* renamed from: a */
    private static String m75387a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        C22908bq.m75392a(httpURLConnection, "accept", "*/*");
        C22908bq.m75392a(httpURLConnection, "connection", "Keep-Alive");
        httpURLConnection.setInstanceFollowRedirects(false);
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        return headerField;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo59879a(android.net.Uri r4, bolts.C1592h r5) throws java.lang.Exception {
        /*
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0048
            boolean r1 = r5.mo6889d()
            if (r1 == 0) goto L_0x0011
            java.lang.Exception r5 = r5.mo6891f()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r5)
            goto L_0x0048
        L_0x0011:
            java.lang.Object r5 = r5.mo6890e()     // Catch:{ Exception -> 0x0048 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0048 }
            java.lang.String r1 = "backurl"
            java.lang.String r1 = r4.getQueryParameter(r1)     // Catch:{ Exception -> 0x0048 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0048 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0048 }
            if (r2 != 0) goto L_0x003c
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0048 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0048 }
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ Exception -> 0x0048 }
            java.lang.String r2 = "backurl"
            r5.appendQueryParameter(r2, r1)     // Catch:{ Exception -> 0x0048 }
            android.net.Uri r5 = r5.build()     // Catch:{ Exception -> 0x0048 }
        L_0x003c:
            com.ss.android.ugc.aweme.app.bk r1 = new com.ss.android.ugc.aweme.app.bk     // Catch:{ Exception -> 0x0048 }
            android.content.Context r2 = r3.f60796a     // Catch:{ Exception -> 0x0048 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0048 }
            android.net.Uri r5 = r1.mo59864a(r5)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0049
        L_0x0048:
            r5 = r0
        L_0x0049:
            if (r5 != 0) goto L_0x0065
            android.content.Context r5 = r3.f60796a
            android.net.Uri$Builder r1 = r4.buildUpon()
            java.lang.String r2 = "url"
            java.lang.String r4 = r4.toString()
            android.net.Uri$Builder r4 = r1.appendQueryParameter(r2, r4)
            android.net.Uri r4 = r4.build()
            r1 = 0
            android.content.Intent r4 = com.p280ss.android.ugc.aweme.app.C22912d.m75406a(r5, r4, r1)
            goto L_0x0071
        L_0x0065:
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r1 = r3.f60796a
            java.lang.Class<com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity> r2 = com.p280ss.android.ugc.aweme.app.DeepLinkHandlerActivity.class
            r4.<init>(r1, r2)
            r4.setData(r5)
        L_0x0071:
            if (r4 == 0) goto L_0x0087
            android.app.Activity r5 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()
            if (r5 == 0) goto L_0x007d
            r5.startActivity(r4)
            return r0
        L_0x007d:
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r4.addFlags(r5)
            android.content.Context r5 = r3.f60796a
            r5.startActivity(r4)
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C22905bn.mo59879a(android.net.Uri, bolts.h):java.lang.Object");
    }
}
