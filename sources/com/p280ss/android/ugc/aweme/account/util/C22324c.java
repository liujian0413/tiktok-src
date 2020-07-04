package com.p280ss.android.ugc.aweme.account.util;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.C22689a;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.account.util.c */
public final class C22324c {

    /* renamed from: a */
    public static final C22324c f59596a = new C22324c();

    private C22324c() {
    }

    /* renamed from: a */
    public static void m73916a(Context context, String str, Integer num, String str2, String str3, String str4) {
        if (context != null) {
            SmartRouter.buildRoute(context, "//user/banned").withParam(C22689a.f60407a, str).withParam("banned_code", (Serializable) num).withParam("enter_type", str2).withParam("enter_method", str3).withParam("platfrom", str4).open();
        }
    }
}
