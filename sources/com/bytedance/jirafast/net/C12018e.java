package com.bytedance.jirafast.net;

import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C9738o;
import com.bytedance.jirafast.C11999a;
import com.bytedance.jirafast.net.C12016d.C12017a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.jirafast.net.e */
public final class C12018e {

    /* renamed from: a */
    private OkHttpClient f31955a;

    /* renamed from: b */
    private C12017a f31956b;

    /* renamed from: c */
    private C12016d f31957c;

    /* renamed from: d */
    private int f31958d;

    /* renamed from: b */
    private void m35092b(String str) {
        if (this.f31956b != null) {
            new IllegalArgumentException(str);
        }
    }

    /* renamed from: c */
    private static String m35093c(String str) {
        return URI.create(str).getHost();
    }

    /* renamed from: a */
    public final void mo29668a(C12017a aVar) {
        this.f31956b = aVar;
        if (this.f31957c != null) {
            this.f31957c.f31953a = aVar;
        }
    }

    /* renamed from: a */
    private File m35091a(String str) {
        File file = new File(str);
        if (file.exists() && file.length() != 0) {
            return file;
        }
        m35092b("file not exists");
        return null;
    }

    /* renamed from: a */
    private RequestBody m35090a(File file) {
        MultipartBuilder multipartBuilder = new MultipartBuilder();
        this.f31957c = new C12016d(file, this.f31956b);
        multipartBuilder.addFormDataPart("file", file.getName(), this.f31957c);
        String a = C6306c.m19560a(file);
        String str = "md5";
        if (a == null) {
            a = "";
        }
        multipartBuilder.addFormDataPart(str, a);
        if (this.f31958d == 1) {
            multipartBuilder.addFormDataPart("file_type", "txt");
        }
        return multipartBuilder.build();
    }

    public C12018e(OkHttpClient okHttpClient, int i) {
        this.f31955a = okHttpClient;
        this.f31958d = i;
    }

    /* renamed from: a */
    private Request m35089a(String str, File file) {
        Request build = new Builder().url(str).post(m35090a(file)).addHeader("Host", m35093c(str)).build();
        this.f31955a.setConnectTimeout(60000, TimeUnit.MILLISECONDS);
        this.f31955a.setWriteTimeout(60000, TimeUnit.MILLISECONDS);
        this.f31955a.setReadTimeout(60000, TimeUnit.MILLISECONDS);
        this.f31955a.setRetryOnConnectionFailure(true);
        return build;
    }

    /* renamed from: a */
    public final Response mo29667a(String str, String str2) {
        Response response;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            m35092b("file or url invalid");
            return null;
        }
        File a = m35091a(str);
        if (a == null) {
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    C9738o.m28697a(C11999a.m35070a(), "file does not exist");
                }
            });
            m35092b("file not exists");
            return null;
        }
        try {
            response = this.f31955a.newCall(m35089a(str2, a)).execute();
        } catch (IOException unused) {
            response = null;
        }
        return response;
    }
}
