package com.p280ss.android.ugc.aweme.app.download.config;

import android.text.TextUtils;
import com.C1642a;
import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.socialbase.downloader.network.C20346e;
import com.p280ss.android.socialbase.downloader.network.C20347f;
import com.p280ss.android.ugc.aweme.app.download.C22968d;
import com.p280ss.android.ugc.aweme.net.C34098r;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.ss.android.ugc.aweme.app.download.config.c */
public final class C22963c implements C20347f {
    /* renamed from: a */
    private static String m75549a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(C1642a.m8034a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final C20346e mo20815a(int i, String str, List<HttpHeader> list) throws IOException {
        OkHttpClient okHttpClient;
        final InputStream inputStream;
        String str2;
        if (!C19929d.m65759a(str)) {
            return null;
        }
        if (C22968d.m75565a(str)) {
            C10114e.m30017a(C6399b.m19921a());
            okHttpClient = C10114e.m30021a();
        } else {
            okHttpClient = C34098r.m109769a().mo86752c();
        }
        Builder url = new Builder().url(str);
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                String str3 = httpHeader.f54980a;
                if (TextUtils.equals(httpHeader.f54980a, "User-Agent")) {
                    str2 = m75549a(httpHeader.f54981b);
                } else {
                    str2 = httpHeader.f54981b;
                }
                url.addHeader(str3, str2);
            }
        }
        final Call newCall = okHttpClient.newCall(url.build());
        final Response execute = newCall.execute();
        if (execute != null) {
            final ResponseBody responseBody = execute.body;
            if (responseBody == null) {
                return null;
            }
            InputStream byteStream = responseBody.byteStream();
            String header = execute.header("Content-Encoding");
            if (header == null || !"gzip".equalsIgnoreCase(header) || (byteStream instanceof GZIPInputStream)) {
                inputStream = byteStream;
            } else {
                inputStream = new GZIPInputStream(byteStream);
            }
            C229641 r1 = new C20346e() {
                /* renamed from: a */
                public final InputStream mo20816a() throws IOException {
                    return inputStream;
                }

                /* renamed from: b */
                public final int mo20818b() throws IOException {
                    return execute.code;
                }

                /* renamed from: c */
                public final void mo20819c() {
                    if (newCall != null) {
                        newCall.cancel();
                    }
                }

                /* renamed from: d */
                public final void mo20820d() {
                    try {
                        if (responseBody != null) {
                            responseBody.close();
                        }
                    } catch (Throwable unused) {
                    }
                }

                /* renamed from: a */
                public final String mo20817a(String str) {
                    return execute.header(str);
                }
            };
            return r1;
        }
        throw new IOException("can't get response");
    }
}
