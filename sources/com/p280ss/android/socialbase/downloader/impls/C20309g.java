package com.p280ss.android.socialbase.downloader.impls;

import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.socialbase.downloader.network.C20346e;
import com.p280ss.android.socialbase.downloader.network.C20347f;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.ss.android.socialbase.downloader.impls.g */
public class C20309g implements C20347f {
    /* renamed from: a */
    public final C20346e mo20815a(int i, String str, List<HttpHeader> list) throws IOException {
        final InputStream inputStream;
        OkHttpClient k = C20269b.m66752k();
        if (k != null) {
            Builder url = new Builder().url(str);
            if (list != null && list.size() > 0) {
                for (HttpHeader httpHeader : list) {
                    url.addHeader(httpHeader.f54980a, C20359e.m67600f(httpHeader.f54981b));
                }
            }
            final Call newCall = k.newCall(url.build());
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
                C203101 r0 = new C20346e() {
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
                        if (newCall != null && !newCall.isCanceled()) {
                            newCall.cancel();
                        }
                    }

                    /* renamed from: d */
                    public final void mo20820d() {
                        try {
                            if (responseBody != null) {
                                responseBody.close();
                            }
                            if (newCall != null && !newCall.isCanceled()) {
                                newCall.cancel();
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    /* renamed from: a */
                    public final String mo20817a(String str) {
                        return execute.header(str);
                    }
                };
                return r0;
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
