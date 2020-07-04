package com.p280ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.utils.i */
public final class C23481i {
    /* renamed from: b */
    private static Context m77090b() {
        return C6399b.m19921a();
    }

    /* renamed from: a */
    public static Resources m77089a() {
        return m77090b().getResources();
    }

    /* renamed from: a */
    public static int m77088a(int i) {
        return m77089a().getColor(i);
    }

    /* renamed from: b */
    public static String m77091b(int i) {
        return m77089a().getString(i);
    }

    /* renamed from: c */
    public static Drawable m77092c(int i) {
        return m77089a().getDrawable(R.drawable.aax);
    }

    /* renamed from: d */
    public static int m77093d(int i) {
        return m77089a().getInteger(R.integer.j);
    }

    /* renamed from: e */
    public static int m77094e(int i) {
        return m77089a().getDimensionPixelSize(i);
    }
}
