package com.bytedance.ies.geckoclient.p570d;

import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.bytedance.ies.geckoclient.C10851d;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* renamed from: com.bytedance.ies.geckoclient.d.d */
public final class C10855d implements C10853b {

    /* renamed from: a */
    private static Builder f29374a = new Builder();

    /* renamed from: b */
    private static Builder f29375b = new Builder();

    /* renamed from: c */
    private static OkHttpClient f29376c;

    /* renamed from: d */
    private static OkHttpClient f29377d;

    public C10855d() {
        f29376c = f29374a.build();
        f29377d = f29375b.build();
    }

    /* renamed from: a */
    private static void m31842a(BufferedSink bufferedSink) {
        if (bufferedSink != null) {
            try {
                bufferedSink.flush();
                bufferedSink.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m31841a(long j, TimeUnit timeUnit) {
        f29375b.readTimeout(j, timeUnit).connectTimeout(j, timeUnit);
    }

    /* renamed from: b */
    public static void m31843b(long j, TimeUnit timeUnit) {
        f29374a.readTimeout(j, timeUnit).connectTimeout(j, timeUnit);
    }

    /* renamed from: a */
    public final String mo26179a(String str, String str2) throws Exception {
        Response execute = f29376c.newCall(new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str2)).build()).execute();
        if (execute.code == 200) {
            return execute.body.string();
        }
        StringBuilder sb = new StringBuilder("net work post failed,status code = ");
        sb.append(execute.code);
        throw new NetworkErrorException(sb.toString());
    }

    /* renamed from: a */
    public final String mo26180a(String str, List<Pair<String, String>> list) throws Exception {
        FormBody.Builder builder = new FormBody.Builder();
        if (list.size() > 0) {
            for (Pair pair : list) {
                builder.add((String) pair.first, (String) pair.second);
            }
        }
        Response execute = f29376c.newCall(new Request.Builder().url(str).post(builder.build()).build()).execute();
        if (execute.code == 200) {
            return execute.body.string();
        }
        StringBuilder sb = new StringBuilder("net work post failed,status code = ");
        sb.append(execute.code);
        throw new NetworkErrorException(sb.toString());
    }

    /* renamed from: b */
    public final boolean mo26181b(String str, String str2) throws Exception {
        Request.Builder builder = new Request.Builder();
        builder.get().url(str);
        Response execute = f29377d.newCall(builder.build()).execute();
        ResponseBody responseBody = execute.body;
        BufferedSource source = responseBody.source();
        long contentLength = responseBody.contentLength();
        new StringBuilder("contentLength:").append(contentLength);
        File file = new File(str2);
        if (file.isDirectory()) {
            C10851d.m31821a(file);
        }
        try {
            BufferedSink buffer = Okio.buffer(Okio.sink(file));
            long j = 0;
            long j2 = -1;
            long j3 = -1;
            while (true) {
                try {
                    long read = source.read(buffer.buffer(), 2048);
                    if (read != j2) {
                        j += read;
                        long j4 = (long) ((int) ((1000 * j) / contentLength));
                        if (j4 - j3 >= 1) {
                            StringBuilder sb = new StringBuilder("download progress:");
                            sb.append(j4 / 10);
                            sb.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb.append(j4 % 10);
                            j3 = j4;
                        }
                        j2 = -1;
                    } else {
                        try {
                            break;
                        } catch (Exception e) {
                            Exception exc = e;
                            m31842a(buffer);
                            throw exc;
                        }
                    }
                } catch (IOException e2) {
                    m31842a(buffer);
                    throw e2;
                }
            }
            buffer.writeAll(source);
            m31842a(buffer);
            if (execute.code == 200) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder("downloadFile failed,status code: ");
            sb2.append(execute.code);
            throw new NetworkErrorException(sb2.toString());
        } catch (FileNotFoundException e3) {
            m31842a(null);
            throw e3;
        }
    }
}
