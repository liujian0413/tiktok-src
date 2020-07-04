package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.squareup.picasso.Downloader.C18792a;
import com.squareup.picasso.Downloader.ResponseException;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.squareup.picasso.ab */
public final class C18803ab implements Downloader {

    /* renamed from: a */
    static volatile Object f50695a;

    /* renamed from: b */
    private static final Object f50696b = new Object();

    /* renamed from: c */
    private static final ThreadLocal<StringBuilder> f50697c = new ThreadLocal<StringBuilder>() {
        /* renamed from: a */
        private static StringBuilder m61422a() {
            return new StringBuilder();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return m61422a();
        }
    };

    /* renamed from: d */
    private final Context f50698d;

    /* renamed from: com.squareup.picasso.ab$a */
    static class C18805a {
        /* renamed from: a */
        static Object m61423a(Context context) throws IOException {
            File b = C18807ad.m61441b(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            if (installed == null) {
                return HttpResponseCache.install(b, C18807ad.m61428a(b));
            }
            return installed;
        }
    }

    public C18803ab(Context context) {
        this.f50698d = context.getApplicationContext();
    }

    /* renamed from: a */
    private static HttpURLConnection m61419a(Uri uri) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(IAVService.MUSIC_LENGTH_FOR_COPYRIGHT);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }

    /* renamed from: a */
    private static void m61420a(Context context) {
        if (f50695a == null) {
            try {
                synchronized (f50696b) {
                    if (f50695a == null) {
                        f50695a = C18805a.m61423a(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public final C18792a mo49974a(Uri uri, int i) throws IOException {
        String str;
        if (VERSION.SDK_INT >= 14) {
            m61420a(this.f50698d);
        }
        HttpURLConnection a = m61419a(uri);
        a.setUseCaches(true);
        if (i != 0) {
            if (NetworkPolicy.isOfflineOnly(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = (StringBuilder) f50697c.get();
                sb.setLength(0);
                if (!NetworkPolicy.shouldReadFromDiskCache(i)) {
                    sb.append("no-cache");
                }
                if (!NetworkPolicy.shouldWriteToDiskCache(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                str = sb.toString();
            }
            C18806ac.m61425a(a, "Cache-Control", str);
        }
        int responseCode = a.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) a.getHeaderFieldInt("Content-Length", -1);
            return new C18792a(C18806ac.m61424a(a), C18807ad.m61440a(a.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        a.disconnect();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(responseCode);
        sb2.append(" ");
        sb2.append(a.getResponseMessage());
        throw new ResponseException(sb2.toString(), i, responseCode);
    }
}
