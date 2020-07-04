package com.p280ss.android.ugc.aweme.feed.p1234j;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;

/* renamed from: com.ss.android.ugc.aweme.feed.j.y */
public final class C28510y {

    /* renamed from: a */
    public static int f75134a;

    /* renamed from: a */
    public static void m93718a(View view) {
        if (view != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams instanceof LayoutParams) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (layoutParams.gravity != 17) {
                    layoutParams.gravity = 17;
                }
            } else if (marginLayoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                layoutParams2.addRule(13, -1);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams2.removeRule(10);
                }
            }
            if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
            }
        }
    }

    /* renamed from: a */
    private static void m93719a(MarginLayoutParams marginLayoutParams) {
        if (marginLayoutParams instanceof LayoutParams) {
            ((LayoutParams) marginLayoutParams).gravity = 49;
            return;
        }
        if (marginLayoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) marginLayoutParams;
            layoutParams.addRule(14, -1);
            layoutParams.addRule(10, -1);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.removeRule(13);
            }
        }
    }

    /* renamed from: a */
    public static void m93717a(Context context, ViewGroup viewGroup, View view, float f, float f2, int i, int i2) {
        boolean z;
        int i3 = i;
        int i4 = i2;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        if (f == 0.0f) {
            if (marginLayoutParams.width != i3) {
                marginLayoutParams.width = i3;
                marginLayoutParams.height = i4;
                m93718a(view);
                viewGroup.requestLayout();
            }
            return;
        }
        float f3 = (float) i4;
        float f4 = (((float) i3) * 1.0f) / f3;
        float measuredHeight = ((float) viewGroup.getMeasuredHeight()) - f;
        boolean z2 = true;
        int i5 = 0;
        if (((double) f4) > 0.625d) {
            z = true;
        } else {
            z = false;
        }
        if (!C22911a.m75401a(context) || C21085a.m71131d() != 0) {
            z2 = false;
        }
        if (z2) {
            i5 = C21085a.m71116a(context);
        }
        float f5 = f / f2;
        m93719a(marginLayoutParams);
        Context a = C6399b.m19921a();
        if (z) {
            if (f75134a == 0) {
                if (z2) {
                    f75134a = (int) (((float) i5) + (((float) C9738o.m28691a(a)) / 1.7777778f));
                } else {
                    f75134a = (int) ((((float) C9738o.m28709b(a)) - C9738o.m28708b(a, 52.0f)) / 4.0f);
                }
            }
            float measuredHeight2 = (((float) viewGroup.getMeasuredHeight()) - f3) / 2.0f;
            marginLayoutParams.topMargin = (int) (measuredHeight2 + ((((float) i5) - measuredHeight2) * f5));
            marginLayoutParams.height = (int) (Math.min(f3, (float) f75134a) + (Math.max(0.0f, f3 - ((float) f75134a)) * (1.0f - f5)));
            marginLayoutParams.width = (int) (((float) marginLayoutParams.height) * f4);
        } else {
            float measuredHeight3 = (((float) viewGroup.getMeasuredHeight()) - f3) / 2.0f;
            marginLayoutParams.topMargin = (int) (measuredHeight3 + ((((float) i5) - measuredHeight3) * f5));
            marginLayoutParams.height = (int) (measuredHeight - ((float) marginLayoutParams.topMargin));
            marginLayoutParams.width = (int) (f4 * ((float) marginLayoutParams.height));
        }
        view.requestLayout();
    }
}
