package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.utils.co */
public final class C43020co {

    /* renamed from: a */
    private static long f111604a;

    /* renamed from: a */
    public static boolean m136535a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - f111604a;
        f111604a = currentTimeMillis;
        if (j <= 0 || j >= 650) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m136532a(Activity activity) {
        if (VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    /* renamed from: a */
    public static void m136534a(View view) {
        if (VERSION.SDK_INT >= 23) {
            view.setForeground(view.getResources().getDrawable(R.drawable.bb6));
        } else {
            C34626j.m111876a(view);
        }
    }

    /* renamed from: a */
    public static void m136533a(Activity activity, int i) {
        C23487o.m77137a(activity, i);
        C23487o.m77155c(activity);
    }
}
