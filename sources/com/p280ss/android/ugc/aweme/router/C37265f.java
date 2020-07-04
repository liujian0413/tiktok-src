package com.p280ss.android.ugc.aweme.router;

import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.router.f */
public final class C37265f implements IInterceptor {

    /* renamed from: a */
    public static final C37266a f97392a = new C37266a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.f$a */
    public static final class C37266a {
        private C37266a() {
        }

        public /* synthetic */ C37266a(C7571f fVar) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000e
            android.net.Uri r1 = r5.getUri()
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.getHost()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            if (r5 == 0) goto L_0x001c
            android.net.Uri r5 = r5.getUri()
            if (r5 == 0) goto L_0x001c
            java.lang.String r5 = r5.getPath()
            goto L_0x001d
        L_0x001c:
            r5 = r0
        L_0x001d:
            java.lang.String r5 = kotlin.jvm.internal.C7573i.m23577a(r1, r5)
            java.lang.String r1 = "aweme/challenge/detail"
            r2 = 0
            r3 = 2
            boolean r5 = kotlin.text.C7634n.m23721b(r5, r1, false)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37265f.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r6, com.bytedance.router.RouteIntent r7) {
        /*
            r5 = this;
            java.lang.String r6 = "aweme://challenge/detail"
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            r0 = 0
            if (r7 == 0) goto L_0x0018
            android.net.Uri r1 = r7.getUri()
            if (r1 == 0) goto L_0x0018
            java.util.Set r1 = r1.getQueryParameterNames()
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            if (r2 == 0) goto L_0x0028
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r2 = 0
            goto L_0x0029
        L_0x0028:
            r2 = 1
        L_0x0029:
            if (r2 != 0) goto L_0x004b
            java.util.Iterator r1 = r1.iterator()
        L_0x002f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri r4 = r7.getUri()
            if (r4 == 0) goto L_0x0046
            java.lang.String r4 = r4.getQueryParameter(r2)
            goto L_0x0047
        L_0x0046:
            r4 = r0
        L_0x0047:
            r6.appendQueryParameter(r2, r4)
            goto L_0x002f
        L_0x004b:
            if (r7 == 0) goto L_0x0054
            java.lang.String r6 = r6.toString()
            r7.setUrl(r6)
        L_0x0054:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37265f.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
