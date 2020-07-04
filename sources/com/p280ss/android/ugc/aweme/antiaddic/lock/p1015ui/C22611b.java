package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p280ss.android.ugc.aweme.router.C37273j;
import com.p280ss.android.ugc.aweme.router.C37286v;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.b */
public final class C22611b implements IInterceptor, C37273j {
    /* renamed from: c */
    private static String m74762c(String str) {
        return C37286v.m119759b(str, "user_id");
    }

    /* renamed from: d */
    private static String m74763d(String str) {
        return C37286v.m119759b(str, "username");
    }

    /* renamed from: a */
    public final boolean mo59315a(String str) {
        return mo59313a(null, str);
    }

    /* renamed from: e */
    private static int m74764e(String str) {
        String b = C37286v.m119759b(str, "time_lock");
        if (TextUtils.isEmpty(b)) {
            return 0;
        }
        try {
            return Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: f */
    private static int m74765f(String str) {
        String b = C37286v.m119759b(str, "teen_mode");
        if (TextUtils.isEmpty(b)) {
            return 0;
        }
        try {
            return Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent == null || routeIntent.getUri() == null) {
            str = null;
        } else {
            str = routeIntent.getUri().getHost();
        }
        return "teen_protection".equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m74761b(java.lang.String r5) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r5 = com.p280ss.android.ugc.aweme.router.C37286v.m119759b(r5, r0)
            int r0 = r5.hashCode()
            r1 = -892246040(0xffffffffcad167e8, float:-6861812.0)
            r2 = 1
            r3 = 0
            r4 = -1
            if (r0 == r1) goto L_0x0022
            r1 = 36430685(0x22be35d, float:1.2628346E-37)
            if (r0 == r1) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            java.lang.String r0 = "time_lock"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x002c
            r5 = 0
            goto L_0x002d
        L_0x0022:
            java.lang.String r0 = "teen_mode"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x002c
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = -1
        L_0x002d:
            switch(r5) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            return r4
        L_0x0031:
            return r2
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22611b.m74761b(java.lang.String):int");
    }

    /* renamed from: a */
    public final boolean mo59313a(Activity activity, String str) {
        return mo59314a(activity, str, null);
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        mo59313a((Activity) context, routeIntent.getOriginUrl());
        return true;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.app.Activity, code=android.content.Context, for r7v0, types: [android.content.Context, android.app.Activity] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59314a(android.content.Context r7, java.lang.String r8, android.view.View r9) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0006
            android.app.Activity r7 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()
        L_0x0006:
            if (r7 != 0) goto L_0x000c
            android.content.Context r7 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
        L_0x000c:
            r0 = r7
            int r7 = m74765f(r8)
            r9 = -1
            r1 = 0
            if (r7 == r9) goto L_0x004c
            java.lang.String r7 = m74762c(r8)
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0020
            goto L_0x004c
        L_0x0020:
            int r7 = m74761b(r8)
            r9 = 1
            if (r7 != 0) goto L_0x002d
            int r2 = m74764e(r8)
            if (r2 > 0) goto L_0x0035
        L_0x002d:
            if (r7 != r9) goto L_0x0037
            int r7 = m74765f(r8)
            if (r7 != r9) goto L_0x0037
        L_0x0035:
            r4 = 1
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            int r1 = m74761b(r8)
            java.lang.String r2 = m74762c(r8)
            java.lang.String r3 = m74763d(r8)
            int r5 = m74764e(r8)
            com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.SetTimeLockActivity.m74747a(r0, r1, r2, r3, r4, r5)
            return r9
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22611b.mo59314a(android.app.Activity, java.lang.String, android.view.View):boolean");
    }
}
