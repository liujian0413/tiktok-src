package com.p280ss.android.ugc.aweme.shortvideo.p1551c;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c.k */
public final class C38565k implements C38564j {
    /* renamed from: a */
    public static long m123250a(String str) {
        long j;
        if (!TextUtils.isEmpty(str)) {
            j = (long) C35574k.m114859a().mo70086a().mo103862b(str);
        } else {
            j = -1;
        }
        if (j == -1) {
            if (C35574k.m114859a().mo70091f().mo93342a(Property.DurationMode)) {
                return 60000;
            }
            return C40413c.f105051b;
        } else if (C35574k.m114859a().mo70096k().mo93305a(AVAB.Property.EnableRemove15sCapMusic)) {
            return Math.min(60000, j);
        } else {
            return Math.min(C40413c.f105051b, j);
        }
    }
}
