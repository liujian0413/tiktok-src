package com.airbnb.lottie.network;

import android.content.Context;
import android.support.p022v4.util.C0902i;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1761g;
import com.airbnb.lottie.C1783l;
import com.airbnb.lottie.C1784m;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.network.b */
public final class C1835b {

    /* renamed from: a */
    private final Context f6639a;

    /* renamed from: b */
    private final String f6640b;

    /* renamed from: c */
    private final C1834a f6641c;

    /* renamed from: d */
    private C1783l<C1757f> m8600d() {
        try {
            return m8601e();
        } catch (IOException e) {
            return new C1783l<>((Throwable) e);
        }
    }

    /* renamed from: b */
    private C1784m<C1757f> m8598b() {
        return new C1784m<>(new Callable<C1783l<C1757f>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C1783l<C1757f> call() throws Exception {
                return C1835b.this.mo7336a();
            }
        });
    }

    /* renamed from: c */
    private C1757f m8599c() {
        C1783l lVar;
        C0902i a = this.f6641c.mo7333a();
        if (a == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) a.f3154a;
        InputStream inputStream = (InputStream) a.f3155b;
        if (fileExtension == FileExtension.Zip) {
            lVar = C1761g.m8396a(new ZipInputStream(inputStream), this.f6640b);
        } else {
            lVar = C1761g.m8394a(inputStream, this.f6640b);
        }
        if (lVar.f6424a != null) {
            return (C1757f) lVar.f6424a;
        }
        return null;
    }

    /* renamed from: a */
    public final C1783l<C1757f> mo7336a() {
        C1757f c = m8599c();
        if (c != null) {
            return new C1783l<>(c);
        }
        StringBuilder sb = new StringBuilder("Animation for ");
        sb.append(this.f6640b);
        sb.append(" not found in cache. Fetching from network.");
        return m8600d();
    }

    /* renamed from: e */
    private C1783l m8601e() throws IOException {
        FileExtension fileExtension;
        C1783l lVar;
        new StringBuilder("Fetching ").append(this.f6640b);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f6640b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
            String contentType = httpURLConnection.getContentType();
            char c = 65535;
            int hashCode = contentType.hashCode();
            boolean z = true;
            if (hashCode != -1248325150) {
                if (hashCode == -43840953 && contentType.equals("application/json")) {
                    c = 1;
                }
            } else if (contentType.equals("application/zip")) {
                c = 0;
            }
            if (c != 0) {
                fileExtension = FileExtension.Json;
                lVar = C1761g.m8394a((InputStream) new FileInputStream(new File(this.f6641c.mo7334a(C1837c.m8604a(httpURLConnection), fileExtension).getAbsolutePath())), this.f6640b);
            } else {
                fileExtension = FileExtension.Zip;
                lVar = C1761g.m8396a(new ZipInputStream(new FileInputStream(this.f6641c.mo7334a(C1837c.m8604a(httpURLConnection), fileExtension))), this.f6640b);
            }
            if (lVar.f6424a != null) {
                this.f6641c.mo7335a(fileExtension);
            }
            StringBuilder sb = new StringBuilder("Completed fetch from network. Success: ");
            if (lVar.f6424a == null) {
                z = false;
            }
            sb.append(z);
            return lVar;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
                sb2.append(10);
            } else {
                StringBuilder sb3 = new StringBuilder("Unable to fetch ");
                sb3.append(this.f6640b);
                sb3.append(". Failed with ");
                sb3.append(httpURLConnection.getResponseCode());
                sb3.append("\n");
                sb3.append(sb2);
                return new C1783l((Throwable) new IllegalArgumentException(sb3.toString()));
            }
        }
    }

    /* renamed from: a */
    public static C1784m<C1757f> m8596a(Context context, String str) {
        return new C1835b(context, str).m8598b();
    }

    /* renamed from: b */
    public static C1783l<C1757f> m8597b(Context context, String str) {
        return new C1835b(context, str).mo7336a();
    }

    private C1835b(Context context, String str) {
        this.f6639a = context.getApplicationContext();
        this.f6640b = str;
        this.f6641c = new C1834a(this.f6639a, str);
    }
}
