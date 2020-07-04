package com.p280ss.android.ugc.aweme.router;

import com.bytedance.router.interceptor.IInterceptor;
import java.util.ArrayList;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.router.a */
public final class C37257a implements IInterceptor {

    /* renamed from: a */
    public static final C37258a f97372a = new C37258a(null);

    /* renamed from: b */
    private final ArrayList<String> f97373b = C7525m.m23468d("mobile/phoneNumber", "password/change");

    /* renamed from: com.ss.android.ugc.aweme.router.a$a */
    public static final class C37258a {
        private C37258a() {
        }

        public /* synthetic */ C37258a(C7571f fVar) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x000e
            android.net.Uri r1 = r6.getUri()
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.getHost()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            if (r6 == 0) goto L_0x001c
            android.net.Uri r6 = r6.getUri()
            if (r6 == 0) goto L_0x001c
            java.lang.String r6 = r6.getPath()
            goto L_0x001d
        L_0x001c:
            r6 = r0
        L_0x001d:
            java.lang.String r6 = kotlin.jvm.internal.C7573i.m23577a(r1, r6)
            java.util.ArrayList<java.lang.String> r1 = r5.f97373b
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "accountUrl"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)
            r4 = 2
            boolean r2 = kotlin.text.C7634n.m23721b(r6, r2, false)
            if (r2 == 0) goto L_0x0027
            r6 = 1
            return r6
        L_0x0042:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37257a.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r5, com.bytedance.router.RouteIntent r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x0046
            r0 = 0
            if (r6 == 0) goto L_0x0013
            android.net.Uri r2 = r6.getUri()
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getHost()
            goto L_0x0014
        L_0x0013:
            r2 = r0
        L_0x0014:
            if (r6 == 0) goto L_0x0021
            android.net.Uri r6 = r6.getUri()
            if (r6 == 0) goto L_0x0021
            java.lang.String r6 = r6.getPath()
            goto L_0x0022
        L_0x0021:
            r6 = r0
        L_0x0022:
            java.lang.String r6 = kotlin.jvm.internal.C7573i.m23577a(r2, r6)
            java.lang.String r2 = "mobile/phoneNumber"
            r3 = 2
            boolean r6 = kotlin.text.C7634n.m23721b(r6, r2, false)
            if (r6 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.ad r6 = com.p280ss.android.ugc.aweme.account.C6861a.m21335d()
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r1 = ""
            r6.bindMobile(r5, r1, r0, r0)
            goto L_0x0044
        L_0x003b:
            com.ss.android.ugc.aweme.at r6 = com.p280ss.android.ugc.aweme.account.C6861a.m21336e()
            android.app.Activity r5 = (android.app.Activity) r5
            r6.changePassword(r5, r0)
        L_0x0044:
            r5 = 1
            return r5
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37257a.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
