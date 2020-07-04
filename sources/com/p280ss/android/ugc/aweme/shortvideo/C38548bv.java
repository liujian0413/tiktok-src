package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bv */
final class C38548bv implements C39813et {
    C38548bv() {
    }

    /* renamed from: a */
    public final boolean mo96463a() {
        switch (C35563c.f93230L.mo93343b(Property.BeautificationMode)) {
            case 0:
                return C35563c.f93231M.mo93305a(AVAB.Property.BeautyModeSwitch);
            case 1:
                return true;
            default:
                return false;
        }
    }
}
