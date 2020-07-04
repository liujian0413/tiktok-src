package com.p280ss.android.ugc.aweme.router;

import com.bytedance.router.interceptor.IInterceptor;

/* renamed from: com.ss.android.ugc.aweme.router.l */
public final class C37276l implements IInterceptor {
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
            java.lang.String r1 = "mix/detail"
            r2 = 0
            r3 = 2
            boolean r5 = kotlin.text.C7634n.m23721b(r5, r1, false)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37276l.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r5, com.bytedance.router.RouteIntent r6) {
        /*
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L_0x0010
            android.content.Intent r0 = r6.getExtra()
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = r0.getStringExtra(r1)
            goto L_0x0011
        L_0x0010:
            r0 = r5
        L_0x0011:
            if (r0 == 0) goto L_0x0040
            android.content.Intent r1 = r6.getExtra()
            if (r1 == 0) goto L_0x0020
            java.lang.String r2 = "mix_id"
            java.lang.String r1 = r1.getStringExtra(r2)
            goto L_0x0021
        L_0x0020:
            r1 = r5
        L_0x0021:
            android.content.Intent r2 = r6.getExtra()
            if (r2 == 0) goto L_0x002e
            java.lang.String r3 = "author_id"
            java.lang.String r2 = r2.getStringExtra(r3)
            goto L_0x002f
        L_0x002e:
            r2 = r5
        L_0x002f:
            android.content.Intent r6 = r6.getExtra()
            if (r6 == 0) goto L_0x003c
            java.lang.String r3 = "event_type"
            java.lang.String r6 = r6.getStringExtra(r3)
            goto L_0x003d
        L_0x003c:
            r6 = r5
        L_0x003d:
            com.p280ss.android.ugc.aweme.feed.p1234j.C28506u.m93700a(r5, r1, r2, r6, r0)
        L_0x0040:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37276l.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
