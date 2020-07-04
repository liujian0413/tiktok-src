package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.livesdk.utils.ac */
public final class C9033ac {

    /* renamed from: a */
    public static final int c2v = 2131234562;

    /* renamed from: b */
    public static final int ci6 = 2131235165;

    /* renamed from: c */
    private static WeakHashMap<Integer, Bitmap> f24700c = new WeakHashMap<>();

    /* renamed from: a */
    public static Bitmap m26989a(Context context, int i) {
        if (i == c2v || i == ci6) {
            return m26990a(context, i, context.getResources().getDimensionPixelSize(R.dimen.re), context.getResources().getDimensionPixelSize(R.dimen.rd));
        }
        return null;
    }

    /* renamed from: a */
    public static Bitmap m26990a(Context context, int i, int i2, int i3) {
        Bitmap bitmap = (Bitmap) f24700c.get(Integer.valueOf(i));
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        if (decodeResource == null) {
            return null;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i2, i3, false);
        if (createScaledBitmap == null) {
            return null;
        }
        f24700c.put(Integer.valueOf(i), createScaledBitmap);
        return createScaledBitmap;
    }
}
