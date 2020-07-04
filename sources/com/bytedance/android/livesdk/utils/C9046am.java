package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.utils.am */
public final class C9046am {

    /* renamed from: a */
    private static HashMap<String, Typeface> f24712a = new HashMap<>();

    /* renamed from: a */
    public static Typeface m27012a(Context context) {
        Typeface a = m27013a(context, "fonts/ByteNumber-Bold.ttf");
        if (a != null) {
            return a;
        }
        return m27013a(context, "fonts/DIN_Alternate.ttf");
    }

    /* renamed from: a */
    private static Typeface m27013a(Context context, String str) {
        Typeface typeface;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f24712a.containsKey(str) || context == null) {
            typeface = (Typeface) f24712a.get(str);
        } else {
            try {
                typeface = Typeface.createFromAsset(context.getApplicationContext().getAssets(), str);
            } catch (Throwable unused) {
                typeface = null;
            }
            f24712a.put(str, typeface);
        }
        return typeface;
    }
}
