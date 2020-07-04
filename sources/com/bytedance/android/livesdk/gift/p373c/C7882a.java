package com.bytedance.android.livesdk.gift.p373c;

import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.gift.c.a */
public final class C7882a implements C7886e {
    /* renamed from: a */
    public final int mo20670a(int i) {
        return i > 1000 ? R.drawable.bus : i > 60 ? R.drawable.buq : R.drawable.buo;
    }

    /* renamed from: b */
    public final int[] mo20671b(int i) {
        int[] iArr = new int[2];
        if (i > 1000) {
            iArr[0] = R.color.ajz;
            iArr[1] = R.color.ajy;
        } else if (i > 60) {
            iArr[0] = R.color.ajv;
            iArr[1] = R.color.aju;
        } else {
            iArr[0] = R.color.ajc;
            iArr[1] = R.color.ajc;
        }
        return iArr;
    }
}
