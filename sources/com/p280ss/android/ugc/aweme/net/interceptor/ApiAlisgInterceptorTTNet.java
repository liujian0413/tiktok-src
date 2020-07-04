package com.p280ss.android.ugc.aweme.net.interceptor;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import java.util.ArrayList;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet */
public final class ApiAlisgInterceptorTTNet implements C12469a {

    /* renamed from: a */
    public static final C34070a f88842a = new C34070a(null);

    /* renamed from: b */
    private static final ArrayList<String> f88843b = C7525m.m23468d("/service/2/app_log/", "/api/ad/v1/setting/", "/api/ad/splash/", "/aweme/v1/ttregion/test/", "/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v2/category/list/", "/aweme/v1/find/", "/aweme/v1/challenge/history/intervene/");

    /* renamed from: c */
    private static final ArrayList<String> f88844c = C7525m.m23468d("IN", "NP", "PK", "LK");

    /* renamed from: d */
    private static final ArrayList<String> f88845d = C7525m.m23468d("US", "GB", "DE", "IT", "FR", "TR", "ES", "JP", "KR", "BR", "IQ");

    /* renamed from: com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet$a */
    public static final class C34070a {
        private C34070a() {
        }

        public /* synthetic */ C34070a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C34071a.m109742a(this, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.retrofit2.C12534t<?> m109713b(com.bytedance.retrofit2.p638c.C12469a.C12470a r9) throws java.lang.Exception {
        /*
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            com.bytedance.retrofit2.a.c r0 = r9.mo30456a()
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19947w()
            r2 = 0
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = "request"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r1 = r0.f33098b
            okhttp3.HttpUrl r1 = okhttp3.HttpUrl.parse(r1)
            if (r1 == 0) goto L_0x0021
            okhttp3.HttpUrl$Builder r2 = r1.newBuilder()
        L_0x0021:
            if (r2 == 0) goto L_0x0172
            java.lang.String r1 = r1.host
            java.lang.String r3 = "api.tiktokv.com"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "api-h2.tiktokv.com"
            r2.host(r1)
        L_0x0032:
            com.bytedance.retrofit2.a.c$a r0 = r0.mo30443a()
            okhttp3.HttpUrl r1 = r2.build()
            java.lang.String r1 = r1.toString()
            com.bytedance.retrofit2.a.c$a r0 = r0.mo30447a(r1)
            com.bytedance.retrofit2.a.c r0 = r0.mo30449a()
            goto L_0x0172
        L_0x0048:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            if (r1 == 0) goto L_0x0172
            java.util.ArrayList<java.lang.String> r1 = f88844c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.bytedance.ies.ugc.aweme.network.f r3 = com.bytedance.ies.ugc.aweme.network.C10944e.m32115b()
            if (r3 == 0) goto L_0x0063
            com.bytedance.ies.ugc.aweme.network.j<java.lang.String> r3 = r3.f29631m
            if (r3 == 0) goto L_0x0063
            java.lang.Object r3 = r3.mo26439a()
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0064
        L_0x0063:
            r3 = r2
        L_0x0064:
            boolean r1 = kotlin.collections.C7525m.m23496a(r1, r3)
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = "request"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r1 = r0.mo30444b()
            java.util.ArrayList<java.lang.String> r3 = f88843b
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x007b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0172
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "path"
            kotlin.jvm.internal.C7573i.m23582a(r1, r5)
            r5 = 2
            r6 = 0
            boolean r4 = kotlin.text.C7634n.m23721b(r1, r4, false)
            if (r4 == 0) goto L_0x007b
            java.lang.String r4 = "request"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            java.lang.String r4 = r0.f33098b
            okhttp3.HttpUrl r4 = okhttp3.HttpUrl.parse(r4)
            if (r4 == 0) goto L_0x00a6
            okhttp3.HttpUrl$Builder r7 = r4.newBuilder()
            goto L_0x00a7
        L_0x00a6:
            r7 = r2
        L_0x00a7:
            if (r7 == 0) goto L_0x007b
            java.lang.String r4 = r4.host
            java.lang.String r8 = "/service/2/app_log/"
            boolean r5 = kotlin.text.C7634n.m23721b(r1, r8, false)
            if (r5 != 0) goto L_0x00b9
            java.lang.String r4 = "api-h2.tiktokv.com"
            r7.host(r4)
            goto L_0x00d4
        L_0x00b9:
            java.lang.String r5 = "log2.musical.ly"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x00c7
            java.lang.String r4 = "log.tiktokv.com"
            r7.host(r4)
            goto L_0x00d4
        L_0x00c7:
            java.lang.String r5 = "rtlog.musical.ly"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00d4
            java.lang.String r4 = "rtlog.tiktokv.com"
            r7.host(r4)
        L_0x00d4:
            com.bytedance.retrofit2.a.c$a r0 = r0.mo30443a()
            okhttp3.HttpUrl r4 = r7.build()
            java.lang.String r4 = r4.toString()
            com.bytedance.retrofit2.a.c$a r0 = r0.mo30447a(r4)
            com.bytedance.retrofit2.a.c r0 = r0.mo30449a()
            goto L_0x007b
        L_0x00e9:
            java.util.ArrayList<java.lang.String> r1 = f88845d
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.bytedance.ies.ugc.aweme.network.f r3 = com.bytedance.ies.ugc.aweme.network.C10944e.m32115b()
            if (r3 == 0) goto L_0x00fe
            com.bytedance.ies.ugc.aweme.network.j<java.lang.String> r3 = r3.f29631m
            if (r3 == 0) goto L_0x00fe
            java.lang.Object r3 = r3.mo26439a()
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x00ff
        L_0x00fe:
            r3 = r2
        L_0x00ff:
            boolean r1 = kotlin.collections.C7525m.m23496a(r1, r3)
            if (r1 == 0) goto L_0x013c
            java.lang.String r1 = "request"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r1 = r0.f33098b
            okhttp3.HttpUrl r1 = okhttp3.HttpUrl.parse(r1)
            if (r1 == 0) goto L_0x0116
            okhttp3.HttpUrl$Builder r2 = r1.newBuilder()
        L_0x0116:
            if (r2 == 0) goto L_0x0172
            java.lang.String r1 = r1.host
            java.lang.String r3 = "api2.musical.ly"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)
            if (r1 == 0) goto L_0x0172
            java.lang.String r1 = "api2-19-h2.musical.ly"
            r2.host(r1)
            com.bytedance.retrofit2.a.c$a r0 = r0.mo30443a()
            okhttp3.HttpUrl r1 = r2.build()
            java.lang.String r1 = r1.toString()
            com.bytedance.retrofit2.a.c$a r0 = r0.mo30447a(r1)
            com.bytedance.retrofit2.a.c r0 = r0.mo30449a()
            goto L_0x0172
        L_0x013c:
            java.lang.String r1 = "request"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r1 = r0.f33098b
            okhttp3.HttpUrl r1 = okhttp3.HttpUrl.parse(r1)
            if (r1 == 0) goto L_0x014d
            okhttp3.HttpUrl$Builder r2 = r1.newBuilder()
        L_0x014d:
            if (r2 == 0) goto L_0x0172
            java.lang.String r1 = r1.host
            java.lang.String r3 = "api2.musical.ly"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)
            if (r1 == 0) goto L_0x0172
            java.lang.String r1 = "api2-16-h2.musical.ly"
            r2.host(r1)
            com.bytedance.retrofit2.a.c$a r0 = r0.mo30443a()
            okhttp3.HttpUrl r1 = r2.build()
            java.lang.String r1 = r1.toString()
            com.bytedance.retrofit2.a.c$a r0 = r0.mo30447a(r1)
            com.bytedance.retrofit2.a.c r0 = r0.mo30449a()
        L_0x0172:
            com.bytedance.retrofit2.t r9 = r9.mo30457a(r0)
            java.lang.String r0 = "chain.proceed(request)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet.m109713b(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.t");
    }
}
