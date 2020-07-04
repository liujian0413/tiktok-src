package com.p280ss.android.ugc.aweme.shortvideo.p1551c;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c.h */
public final class C38562h {

    /* renamed from: a */
    static boolean f100204a;

    /* renamed from: a */
    public static void m123244a() {
        f100204a = !C35574k.m114859a().mo70091f().mo93342a(Property.LongVideoPermitted);
    }

    /* renamed from: b */
    public static boolean m123246b() {
        if (!C35574k.m114859a().mo70091f().mo93342a(Property.LongVideoPermitted) || C35574k.m114859a().mo70091f().mo93344c(Property.LongVideoThreshold) <= C40413c.f105051b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m123245a(boolean z) {
        long j;
        C35574k.m114859a().mo70091f().mo93341a(Property.LongVideoPermitted, z);
        AVSettings f = C35574k.m114859a().mo70091f();
        Property property = Property.LongVideoThreshold;
        if (z) {
            j = 60000;
        } else {
            j = 0;
        }
        f.mo93339a(property, j);
    }
}
