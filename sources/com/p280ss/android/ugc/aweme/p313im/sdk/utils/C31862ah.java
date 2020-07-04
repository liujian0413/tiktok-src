package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ah */
public final class C31862ah {

    /* renamed from: a */
    public static final C31862ah f83326a = new C31862ah();

    /* renamed from: b */
    private static final int f83327b = C6399b.m19921a().getResources().getDimensionPixelSize(R.dimen.hw);

    /* renamed from: c */
    private static final int f83328c = C6399b.m19921a().getResources().getDimensionPixelSize(R.dimen.hy);

    /* renamed from: d */
    private static final int f83329d = C6399b.m19921a().getResources().getDimensionPixelSize(R.dimen.hx);

    private C31862ah() {
    }

    /* renamed from: a */
    public static final Integer[] m103524a(SimpleDraweeView simpleDraweeView, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = f / f2;
        if (f7 <= 0.5625f) {
            f4 = (float) f83327b;
            f3 = (float) f83329d;
        } else if (f7 <= 0.5625f || f7 > 0.75f) {
            if (f7 > 0.75f && f7 <= 1.0f) {
                f5 = (float) f83328c;
                f6 = f5 / f7;
                if (f6 > ((float) f83329d)) {
                    f6 = (float) f83329d;
                }
            } else if (f7 > 1.0f && f7 < 1.3333334f) {
                f3 = (float) f83328c;
                f4 = f3 / f7;
                if (f4 > ((float) f83329d)) {
                    f3 = (float) f83329d;
                }
            } else if (f7 < 1.3333334f || f7 >= 1.7777778f) {
                f4 = (float) f83329d;
                f3 = (float) f83327b;
            } else {
                f5 = (float) f83329d;
                f6 = f7 * f5;
                if (f6 > ((float) f83328c)) {
                    f6 = (float) f83328c;
                }
            }
            float f8 = f5;
            f3 = f6;
            f4 = f8;
        } else {
            f3 = (float) f83329d;
            f4 = f7 * f3;
            if (f4 > ((float) f83328c)) {
                f4 = (float) f83328c;
            }
        }
        if (simpleDraweeView != null) {
            C13438a aVar = (C13438a) simpleDraweeView.getHierarchy();
            C7573i.m23582a((Object) aVar, "imageView.hierarchy");
            aVar.mo32896a(C13423b.f35599g);
        }
        return new Integer[]{Integer.valueOf((int) f4), Integer.valueOf((int) f3)};
    }
}
