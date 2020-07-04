package com.p280ss.android.ugc.aweme.net.p1417b;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;

/* renamed from: com.ss.android.ugc.aweme.net.b.b */
public final class C34041b {

    /* renamed from: b */
    private static Boolean f88794b;

    /* renamed from: a */
    private TextView f88795a;

    /* renamed from: com.ss.android.ugc.aweme.net.b.b$a */
    public static class C34043a {

        /* renamed from: a */
        public static final C34041b f88796a = new C34041b();
    }

    private C34041b() {
    }

    /* renamed from: a */
    public static C34041b m109623a() {
        return C34043a.f88796a;
    }

    /* renamed from: b */
    private static boolean m109624b() {
        boolean z;
        if (f88794b == null) {
            Boolean bool = (Boolean) SharePrefCache.inst().getShowVideoBitrateInfo().mo59877d();
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            f88794b = Boolean.valueOf(z);
        }
        return f88794b.booleanValue();
    }

    /* renamed from: a */
    public final void mo86734a(Activity activity) {
        if (m109624b()) {
            FrameLayout frameLayout = (FrameLayout) activity.findViewById(16908290);
            this.f88795a = new TextView(activity);
            this.f88795a.setLayoutParams(new LayoutParams(-1, -1));
            this.f88795a.setPadding(10, (int) C9738o.m28708b((Context) activity, 30.0f), 0, 0);
            this.f88795a.setTextColor(-65536);
            frameLayout.addView(this.f88795a);
        }
    }
}
