package com.p280ss.android.ugc.aweme.effect;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.effect.d */
public final class C27421d {

    /* renamed from: a */
    public static final int f72340a = C35574k.m114861b().getResources().getColor(R.color.ac4);

    /* renamed from: b */
    public static final int f72341b = (C9738o.m28691a((Context) C35574k.m114861b()) - (((int) C9738o.m28708b((Context) C35574k.m114861b(), 16.0f)) * 2));

    /* renamed from: c */
    private static int[] f72342c;

    /* renamed from: b */
    private static int[] m89847b() {
        if (f72342c != null) {
            return f72342c;
        }
        int[] intArray = C35574k.m114861b().getResources().getIntArray(R.array.t);
        f72342c = intArray;
        return intArray;
    }

    /* renamed from: a */
    public static int[] m89846a() {
        List filterColors = C30199h.m98861a().getFilterColors();
        if (filterColors == null || filterColors.isEmpty()) {
            return m89847b();
        }
        int[] iArr = new int[filterColors.size()];
        for (int i = 0; i < filterColors.size(); i++) {
            iArr[i] = m89845a((String) filterColors.get(i));
        }
        return iArr;
    }

    /* renamed from: a */
    private static int m89845a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return -1;
        }
    }
}
