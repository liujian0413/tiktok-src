package com.p280ss.android.socialbase.downloader.impls;

import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.socialbase.downloader.network.C20344c;
import com.p280ss.android.socialbase.downloader.network.C20345d;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;

/* renamed from: com.ss.android.socialbase.downloader.impls.f */
public final class C20307f implements C20345d {
    /* renamed from: a */
    public final C20344c mo54518a(String str, List<HttpHeader> list) throws IOException {
        OkHttpClient k = C20269b.m66752k();
        if (k != null) {
            Builder head = new Builder().url(str).head();
            if (list != null && list.size() > 0) {
                for (HttpHeader httpHeader : list) {
                    head.addHeader(httpHeader.f54980a, C20359e.m67600f(httpHeader.f54981b));
                }
            }
            final Call newCall = k.newCall(head.build());
            final Response execute = newCall.execute();
            if (execute != null) {
                if (C20356b.m67535a(2097152)) {
                    execute.close();
                }
                return new C20344c() {
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

                    /* renamed from: a */
                    public final String mo20817a(String str) {
                        return execute.header(str);
                    }
                };
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
