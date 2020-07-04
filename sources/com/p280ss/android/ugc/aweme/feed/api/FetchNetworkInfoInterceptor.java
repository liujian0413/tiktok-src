package com.p280ss.android.ugc.aweme.feed.api;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FetchNetworkInfoInterceptor */
public final class FetchNetworkInfoInterceptor implements C12469a {

    /* renamed from: a */
    public volatile boolean f74327a;

    /* renamed from: b */
    public volatile int f74328b;

    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) {
        return C28222j.m92767a(this, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d A[Catch:{ Throwable -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080 A[Catch:{ Throwable -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d A[Catch:{ Throwable -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0097 A[Catch:{ Throwable -> 0x000b }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.C12534t<?> mo71823b(com.bytedance.retrofit2.p638c.C12469a.C12470a r13) {
        /*
            r12 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 0
            if (r13 == 0) goto L_0x000e
            com.bytedance.retrofit2.a.c r4 = r13.mo30456a()     // Catch:{ Throwable -> 0x000b }
            goto L_0x000f
        L_0x000b:
            r4 = move-exception
            goto L_0x00df
        L_0x000e:
            r4 = r3
        L_0x000f:
            if (r13 == 0) goto L_0x0016
            com.bytedance.retrofit2.t r5 = r13.mo30457a(r4)     // Catch:{ Throwable -> 0x000b }
            goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            boolean r6 = com.p280ss.android.ugc.aweme.feed.api.C28216d.m92754a(r4)     // Catch:{ Throwable -> 0x000b }
            if (r6 != 0) goto L_0x001e
            return r5
        L_0x001e:
            if (r5 == 0) goto L_0x0023
            com.bytedance.retrofit2.a.d r6 = r5.f33301a     // Catch:{ Throwable -> 0x000b }
            goto L_0x0024
        L_0x0023:
            r6 = r3
        L_0x0024:
            if (r6 == 0) goto L_0x0029
            java.lang.Object r6 = r6.f33123f     // Catch:{ Throwable -> 0x000b }
            goto L_0x002a
        L_0x0029:
            r6 = r3
        L_0x002a:
            boolean r7 = r6 instanceof com.bytedance.frameworks.baselib.network.http.C10104a     // Catch:{ Throwable -> 0x000b }
            if (r7 == 0) goto L_0x00bc
            r7 = r6
            com.bytedance.frameworks.baselib.network.http.a r7 = (com.bytedance.frameworks.baselib.network.http.C10104a) r7     // Catch:{ Throwable -> 0x000b }
            long r7 = r7.f27500c     // Catch:{ Throwable -> 0x000b }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x003a
            return r5
        L_0x003a:
            com.bytedance.frameworks.baselib.network.http.a r6 = (com.bytedance.frameworks.baselib.network.http.C10104a) r6     // Catch:{ Throwable -> 0x000b }
            java.lang.String r6 = r6.f27521x     // Catch:{ Throwable -> 0x000b }
            if (r4 == 0) goto L_0x0057
            java.lang.String r9 = r4.f33098b     // Catch:{ Throwable -> 0x000b }
            if (r9 == 0) goto L_0x0057
            r10 = r9
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Throwable -> 0x000b }
            java.lang.String r11 = "first_retry"
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ Throwable -> 0x000b }
            boolean r10 = kotlin.text.C7634n.m23776c(r10, r11, false)     // Catch:{ Throwable -> 0x000b }
            if (r10 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r9 = r3
        L_0x0053:
            if (r9 == 0) goto L_0x0057
            r9 = 1
            goto L_0x0058
        L_0x0057:
            r9 = 0
        L_0x0058:
            boolean r10 = r12.f74327a     // Catch:{ Throwable -> 0x000b }
            if (r10 == 0) goto L_0x0075
            if (r4 == 0) goto L_0x0075
            java.lang.String r10 = r4.f33098b     // Catch:{ Throwable -> 0x000b }
            if (r10 == 0) goto L_0x0075
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Throwable -> 0x000b }
            java.lang.String r11 = "pull_type=0"
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ Throwable -> 0x000b }
            boolean r10 = kotlin.text.C7634n.m23776c(r10, r11, false)     // Catch:{ Throwable -> 0x000b }
            if (r10 != r0) goto L_0x0075
            r12.f74327a = r2     // Catch:{ Throwable -> 0x000b }
            r12.f74328b = r2     // Catch:{ Throwable -> 0x000b }
            int r10 = r12.f74328b     // Catch:{ Throwable -> 0x000b }
            int r9 = r9 + r10
        L_0x0075:
            com.ss.android.ugc.aweme.feed.api.k r10 = new com.ss.android.ugc.aweme.feed.api.k     // Catch:{ Throwable -> 0x000b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x000b }
            if (r4 == 0) goto L_0x0080
            java.lang.String r4 = r4.f33098b     // Catch:{ Throwable -> 0x000b }
            goto L_0x0081
        L_0x0080:
            r4 = r3
        L_0x0081:
            r10.<init>(r6, r9, r4)     // Catch:{ Throwable -> 0x000b }
            com.p280ss.android.ugc.aweme.feed.api.C28224l.m92769a(r7, r10)     // Catch:{ Throwable -> 0x000b }
            T r4 = r5.f33302b     // Catch:{ Throwable -> 0x000b }
            boolean r6 = r4 instanceof com.p280ss.android.ugc.aweme.app.api.p1024c.C22824e     // Catch:{ Throwable -> 0x000b }
            if (r6 == 0) goto L_0x0097
            com.ss.android.ugc.aweme.app.api.c.e r4 = (com.p280ss.android.ugc.aweme.app.api.p1024c.C22824e) r4     // Catch:{ Throwable -> 0x000b }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ Throwable -> 0x000b }
            r4.setNetworkInfoKey(r6)     // Catch:{ Throwable -> 0x000b }
            goto L_0x00d6
        L_0x0097:
            boolean r6 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ Throwable -> 0x000b }
            if (r6 != 0) goto L_0x009e
            goto L_0x00d6
        L_0x009e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x000b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x000b }
            java.lang.String r7 = "body is "
            r6.<init>(r7)     // Catch:{ Throwable -> 0x000b }
            java.lang.Class r4 = r4.getClass()     // Catch:{ Throwable -> 0x000b }
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ Throwable -> 0x000b }
            r6.append(r4)     // Catch:{ Throwable -> 0x000b }
            java.lang.String r4 = r6.toString()     // Catch:{ Throwable -> 0x000b }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x000b }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ Throwable -> 0x000b }
            throw r5     // Catch:{ Throwable -> 0x000b }
        L_0x00bc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x000b }
            java.lang.String r7 = "isn't BaseHttpRequestInfo:"
            r4.<init>(r7)     // Catch:{ Throwable -> 0x000b }
            r4.append(r6)     // Catch:{ Throwable -> 0x000b }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x000b }
            r6 = 4
            java.lang.String r7 = "FetchNetworkInfoInterceptor"
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r6, r7, r4)     // Catch:{ Throwable -> 0x000b }
            boolean r6 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ Throwable -> 0x000b }
            if (r6 != 0) goto L_0x00d7
        L_0x00d6:
            return r5
        L_0x00d7:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x000b }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x000b }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ Throwable -> 0x000b }
            throw r5     // Catch:{ Throwable -> 0x000b }
        L_0x00df:
            if (r13 == 0) goto L_0x00e6
            com.bytedance.retrofit2.a.c r13 = r13.mo30456a()
            goto L_0x00e7
        L_0x00e6:
            r13 = r3
        L_0x00e7:
            boolean r5 = com.p280ss.android.ugc.aweme.feed.api.C28216d.m92754a(r13)
            if (r5 == 0) goto L_0x0115
            if (r13 == 0) goto L_0x0115
            java.lang.String r13 = r13.f33098b
            if (r13 == 0) goto L_0x0115
            r5 = r13
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r6 = "is_cold_start=1"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r5 = kotlin.text.C7634n.m23776c(r5, r6, false)
            if (r5 == 0) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r13 = r3
        L_0x0102:
            if (r13 == 0) goto L_0x0115
            r12.f74327a = r0
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            java.lang.String r5 = "first_retry"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r13 = kotlin.text.C7634n.m23776c(r13, r5, false)
            if (r13 == 0) goto L_0x0113
            r0 = 2
        L_0x0113:
            r12.f74328b = r0
        L_0x0115:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.api.FetchNetworkInfoInterceptor.mo71823b(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.t");
    }
}
