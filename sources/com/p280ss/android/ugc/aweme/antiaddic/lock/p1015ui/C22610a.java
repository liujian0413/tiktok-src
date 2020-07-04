package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p280ss.android.ugc.aweme.router.C37273j;
import com.p280ss.android.ugc.aweme.router.C37286v;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.a */
public final class C22610a implements IInterceptor, C37273j {
    /* renamed from: b */
    private static String m74755b(String str) {
        return C37286v.m119759b(str, "type");
    }

    /* renamed from: c */
    private static String m74756c(String str) {
        return C37286v.m119759b(str, "user_id");
    }

    /* renamed from: a */
    public final boolean mo59315a(String str) {
        return mo59313a(null, str);
    }

    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        return routeIntent.getOriginUrl().contains("privacy/setting/modify");
    }

    /* renamed from: d */
    private static int m74757d(String str) {
        String b = C37286v.m119759b(str, "chat_privacy");
        if (TextUtils.isEmpty(b)) {
            return 0;
        }
        try {
            return Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final boolean mo59313a(Activity activity, String str) {
        return mo59314a(activity, str, null);
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        mo59313a((Activity) context, routeIntent.getOriginUrl());
        return true;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.app.Activity, code=android.content.Context, for r3v0, types: [android.content.Context, android.app.Activity] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59314a(android.content.Context r3, java.lang.String r4, android.view.View r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0006
            android.app.Activity r3 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()
        L_0x0006:
            if (r3 != 0) goto L_0x000c
            android.content.Context r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
        L_0x000c:
            java.lang.String r5 = m74755b(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r0 = 0
            if (r5 != 0) goto L_0x0043
            java.lang.String r5 = m74755b(r4)
            java.lang.String r1 = "chat_privacy"
            boolean r5 = android.text.TextUtils.equals(r5, r1)
            if (r5 == 0) goto L_0x0043
            java.lang.String r5 = m74756c(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x002e
            goto L_0x0043
        L_0x002e:
            com.ss.android.ugc.aweme.setting.serverpush.model.b r5 = com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.m74612a()
            if (r5 == 0) goto L_0x0036
            boolean r0 = r5.f98289y
        L_0x0036:
            int r5 = m74757d(r4)
            java.lang.String r4 = m74756c(r4)
            com.p280ss.android.ugc.aweme.setting.p337ui.ChatControlSettingActivity.m120693a(r3, r5, r0, r4)
            r3 = 1
            return r3
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22610a.mo59314a(android.app.Activity, java.lang.String, android.view.View):boolean");
    }
}
