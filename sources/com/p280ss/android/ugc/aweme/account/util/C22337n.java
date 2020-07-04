package com.p280ss.android.ugc.aweme.account.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.common.util.C6776h;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.util.n */
public final class C22337n {
    /* renamed from: a */
    public static void m73944a(Activity activity, boolean z, boolean z2) {
        if (!activity.isFinishing()) {
            Intent intent = null;
            if (activity.isTaskRoot()) {
                intent = C6776h.m20941a((Context) activity, activity.getPackageName());
            }
            activity.finish();
            if (intent != null) {
                activity.startActivity(intent);
                return;
            }
            if (z) {
                activity.overridePendingTransition(R.anim.c2, R.anim.cf);
            }
        }
    }
}
