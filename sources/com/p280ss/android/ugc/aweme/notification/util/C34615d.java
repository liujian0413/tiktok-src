package com.p280ss.android.ugc.aweme.notification.util;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.util.d */
public final class C34615d {

    /* renamed from: a */
    private static float f90357a;

    /* renamed from: b */
    public static void m111862b(Context context) {
        if (context != null) {
            f90357a = m111864c(context);
        }
    }

    /* renamed from: a */
    public static int m111860a(Context context) {
        if (f90357a > 0.0f) {
            return (int) f90357a;
        }
        float c = m111864c(context);
        f90357a = c;
        return (int) c;
    }

    /* renamed from: b */
    public static void m111863b(View view) {
        if (VERSION.SDK_INT >= 23) {
            view.setForeground(null);
        } else {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: a */
    public static void m111861a(View view) {
        if (VERSION.SDK_INT >= 23) {
            view.setForeground(view.getResources().getDrawable(R.drawable.bb6));
        } else {
            C34626j.m111876a(view);
        }
    }

    /* renamed from: c */
    private static float m111864c(Context context) {
        float f = 0.0f;
        if (context == null) {
            return 0.0f;
        }
        int[] iArr = {R.string.cck, R.string.aua, R.string.cfh, R.string.ccq, R.string.cpb, R.string.cq9, R.string.auc};
        Paint paint = new Paint();
        paint.setTextSize(C9738o.m28708b(context, 15.0f));
        float b = C9738o.m28708b(context, 52.0f);
        float b2 = C9738o.m28708b(context, 122.0f);
        for (int i = 0; i < 7; i++) {
            float measureText = paint.measureText(context.getString(iArr[i]));
            if (measureText > f) {
                f = measureText;
            }
        }
        float b3 = f + C9738o.m28708b(context, 12.0f);
        if (b3 > b2) {
            return b2;
        }
        if (b3 < b) {
            return b;
        }
        return b3;
    }
}
