package com.google.android.gms.ads.p742b;

import android.net.Uri;
import android.net.Uri.Builder;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.b.b */
final class C14736b extends Thread {

    /* renamed from: a */
    private final /* synthetic */ Map f38085a;

    C14736b(C14733a aVar, Map map) {
        this.f38085a = map;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        new C14738d();
        Map map = this.f38085a;
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(buildUpon.build().toString()).openConnection();
            httpURLConnection.getResponseCode();
            httpURLConnection.disconnect();
        } catch (IOException | IndexOutOfBoundsException | RuntimeException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
