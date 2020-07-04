package com.p280ss.android.ugc.aweme.setting;

import android.content.Context;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.base.p1062f.C23332a;

/* renamed from: com.ss.android.ugc.aweme.setting.k */
public final class C37656k {
    /* renamed from: a */
    public static boolean m120485a(Context context) {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return C23332a.m76559b("aweme_app", "use_dynamic_cover", z);
    }

    /* renamed from: a */
    public static void m120484a(Context context, boolean z) {
        C23332a.m76557a("aweme_app", "use_dynamic_cover", z);
    }
}
