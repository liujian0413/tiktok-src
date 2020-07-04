package com.bytedance.android.live.core.utils;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import com.bytedance.android.live.uikit.p174b.C3510a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.core.utils.af */
public final class C3361af {
    /* renamed from: a */
    public static void m12533a(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            m12534b(activity);
        }
    }

    /* renamed from: c */
    private static void m12535c(Activity activity) {
        activity.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        m12537e(activity);
    }

    /* renamed from: d */
    private static int m12536d(Activity activity) {
        return activity.getResources().getColor(R.color.ac4);
    }

    /* renamed from: a */
    public static int m12532a(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: e */
    private static void m12537e(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(m12536d(activity));
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C3510a.m12932a(activity, m12536d(activity));
        }
    }

    /* renamed from: b */
    public static void m12534b(Activity activity) {
        if (activity == null || C3387g.m12599a(activity)) {
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            m12535c(activity);
        } else if (VERSION.SDK_INT >= 16) {
            activity.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
            activity.getWindow().getDecorView().setSystemUiVisibility(4);
            ActionBar actionBar = activity.getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
        } else {
            activity.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        }
    }
}
