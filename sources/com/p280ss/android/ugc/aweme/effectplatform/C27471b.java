package com.p280ss.android.ugc.aweme.effectplatform;

import android.accounts.NetworkErrorException;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43720b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.b */
public final class C27471b implements C43720b {

    /* renamed from: a */
    private OkHttpClient f72463a;

    public C27471b(OkHttpClient okHttpClient) {
        this.f72463a = okHttpClient;
    }

    /* renamed from: a */
    private static Headers m90050a(Map<String, String> map) {
        Builder builder = new Builder();
        if (map != null) {
            for (String str : map.keySet()) {
                builder.add(str, (String) map.get(str));
            }
        }
        return builder.build();
    }

    /* renamed from: a */
    public final InputStream mo70656a(C43707b bVar) {
        try {
            return m90052b(bVar);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("execute fail : ");
            sb.append(e.toString());
            C6921a.m21562b("EffectNetworkerImpl", sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    private InputStream m90052b(C43707b bVar) throws Exception {
        Request.Builder builder = new Request.Builder();
        builder.get().url(bVar.f113169a);
        if (!bVar.f113172d.isEmpty()) {
            builder = builder.headers(m90050a(bVar.f113172d));
        }
        if (bVar.f113170b.equals("GET")) {
            builder = builder.get();
        } else if (!bVar.f113173e.isEmpty()) {
            builder = builder.method(bVar.f113170b, m90051a(bVar.f113174f, bVar.f113173e));
        }
        try {
            final Response execute = this.f72463a.newCall(builder.build()).execute();
            if (execute.code != 200 || execute.body == null) {
                StringBuilder sb = new StringBuilder("request fail code : ");
                sb.append(execute.code);
                C6921a.m21562b("EffectNetworkerImpl", sb.toString());
                StringBuilder sb2 = new StringBuilder("status code = ");
                sb2.append(execute.code);
                throw new NetworkErrorException(sb2.toString());
            }
            bVar.f113171c = execute.body.contentLength();
            return new FilterInputStream(execute.body.source().inputStream()) {
                public final void close() throws IOException {
                    super.close();
                    execute.close();
                }
            };
        } catch (IOException e) {
            bVar.f113175g = e.getMessage();
            throw e;
        }
    }

    /* renamed from: a */
    private static RequestBody m90051a(String str, Map<String, Object> map) {
        return RequestBody.create(MediaType.parse(str), C35574k.m114859a().mo70085S().mo15979b((Object) map));
    }
}
