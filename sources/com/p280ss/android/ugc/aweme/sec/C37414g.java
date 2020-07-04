package com.p280ss.android.ugc.aweme.sec;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.sec.C37406c.C37407a;
import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sec.g */
public final class C37414g implements Interceptor {

    /* renamed from: com.ss.android.ugc.aweme.sec.g$a */
    static final class C37416a extends C37412f<Response> {

        /* renamed from: g */
        public Chain f97707g;

        /* renamed from: h */
        public Response f97708h;

        /* renamed from: d */
        public final C37406c<Response> mo94176d() {
            return new C37407a<Response>() {
                /* access modifiers changed from: private */
                /* renamed from: f */
                public Response mo83512a() {
                    return C37416a.this.f97708h;
                }

                /* access modifiers changed from: private */
                /* renamed from: e */
                public Response mo83513b() throws Exception {
                    HttpUrl httpUrl = C37416a.this.f97707g.request().url;
                    return C37414g.m120046a(C37416a.this.f97707g);
                }
            };
        }

        private C37416a(Chain chain, Response response) {
            this.f97707g = chain;
            this.f97708h = response;
        }
    }

    /* renamed from: a */
    public static Response m120046a(Chain chain) throws IOException {
        Request request = chain.request();
        String valueOf = String.valueOf(System.currentTimeMillis());
        Builder url = request.newBuilder().url(request.url);
        m120047a(request, valueOf, url);
        return chain.proceed(url.build());
    }

    public final Response intercept(Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        String header = proceed.header("Content-Type");
        Request request = proceed.request;
        String str = "";
        if (!(request == null || request.url == null)) {
            str = request.url.toString();
        }
        if (TextUtils.isEmpty(header)) {
            return proceed;
        }
        if ((!TextUtils.isEmpty(header) && !header.contains("json")) || (!TextUtils.isEmpty(str) && (str.contains("/effect/api") || str.contains("/model/api")))) {
            return proceed;
        }
        String a = C37411e.m120038a(proceed);
        if (!TextUtils.isEmpty(a)) {
            try {
                JSONObject jSONObject = new JSONObject(a);
                C37416a aVar = new C37416a(chain, proceed);
                if (aVar.mo94178a(chain.request().url.toString(), jSONObject)) {
                    return (Response) aVar.mo94175c();
                }
            } catch (Exception | InterruptedException | JSONException unused) {
            }
        }
        return proceed;
    }

    /* renamed from: a */
    private static void m120047a(Request request, String str, Builder builder) {
        FormBody formBody = (FormBody) request.body;
        if (formBody != null && formBody.size() > 0) {
            FormBody.Builder builder2 = new FormBody.Builder();
            for (int i = 0; i < formBody.size(); i++) {
                if (TextUtils.equals(formBody.encodedName(i), "_rticket")) {
                    builder2.addEncoded(formBody.encodedName(i), str);
                } else {
                    builder2.addEncoded(formBody.encodedName(i), formBody.encodedValue(i));
                }
            }
            builder.method(request.method, builder2.build());
        }
    }
}
