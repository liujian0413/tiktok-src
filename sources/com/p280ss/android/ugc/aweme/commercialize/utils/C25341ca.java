package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.graphics.drawable.VectorDrawableCompat;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ca */
public final class C25341ca {
    /* renamed from: a */
    public static Drawable m83271a(Resources resources, int i) {
        return m83272a(resources, R.drawable.bdv, null);
    }

    /* renamed from: a */
    private static Drawable m83272a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT > 21) {
            return resources.getDrawable(i, null);
        }
        try {
            return VectorDrawableCompat.m1855a(resources, i, (Theme) null);
        } catch (NotFoundException unused) {
            return null;
        }
    }
}
