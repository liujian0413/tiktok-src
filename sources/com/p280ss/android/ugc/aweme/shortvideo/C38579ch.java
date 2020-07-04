package com.p280ss.android.ugc.aweme.shortvideo;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ch */
public final class C38579ch {
    /* renamed from: a */
    public static boolean m123272a() {
        if (C6399b.m19947w()) {
            return C35563c.f93230L.mo93342a(Property.MusicCopyRightGranted);
        }
        if (!C35563c.f93231M.mo93305a(AVAB.Property.EnableRemove15sCapMusic) && C6399b.m19946v()) {
            return false;
        }
        return true;
    }
}
