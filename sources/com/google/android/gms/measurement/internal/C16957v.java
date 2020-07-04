package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.C15322e;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.v */
public final class C16957v extends C16911ec {

    /* renamed from: b */
    private final SSLSocketFactory f47510b;

    public C16957v(C16912ed edVar) {
        super(edVar);
        this.f47510b = VERSION.SDK_INT < 19 ? new C16923en() : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43637d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo44165e() {
        NetworkInfo networkInfo;
        mo43843j();
        try {
            networkInfo = ((ConnectivityManager) mo43581m().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m56368a(java.net.HttpURLConnection r5) throws java.io.IOException {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0025 }
            r1.<init>()     // Catch:{ all -> 0x0025 }
            java.io.InputStream r5 = com.google.android.gms.measurement.internal.C16958w.m56387a(r5)     // Catch:{ all -> 0x0025 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0023 }
        L_0x000e:
            int r2 = r5.read(r0)     // Catch:{ all -> 0x0023 }
            if (r2 <= 0) goto L_0x0019
            r3 = 0
            r1.write(r0, r3, r2)     // Catch:{ all -> 0x0023 }
            goto L_0x000e
        L_0x0019:
            byte[] r0 = r1.toByteArray()     // Catch:{ all -> 0x0023 }
            if (r5 == 0) goto L_0x0022
            r5.close()
        L_0x0022:
            return r0
        L_0x0023:
            r0 = move-exception
            goto L_0x0029
        L_0x0025:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L_0x0029:
            if (r5 == 0) goto L_0x002e
            r5.close()
        L_0x002e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16957v.m56368a(java.net.HttpURLConnection):byte[]");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HttpURLConnection mo44164a(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            if (this.f47510b != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(this.f47510b);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C16919ej mo43639f() {
        return super.mo43639f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C16927er mo43641g() {
        return super.mo43641g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C16933ex mo43643h() {
        return super.mo43643h();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
