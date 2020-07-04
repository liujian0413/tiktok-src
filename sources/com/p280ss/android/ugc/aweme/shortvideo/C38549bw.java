package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bw */
final class C38549bw implements C38502ay {
    C38549bw() {
    }

    /* renamed from: a */
    public final boolean mo96464a() {
        boolean z;
        if (C35563c.f93231M.mo93305a(Property.RememberLastRecordDuration)) {
            C35622l lVar = (C35622l) C25682d.m84426a(C29960a.m98230a(), C35622l.class);
            boolean a = C35563c.f93230L.mo93342a(AVSettings.Property.DurationMode);
            if (lVar == null || !lVar.mo60364b(false)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return a;
            }
            if (!a) {
                if (lVar != null) {
                    lVar.mo60367c(true);
                }
                return false;
            }
            C35563c.f93230L.mo93341a(AVSettings.Property.DurationMode, C35563c.f93231M.mo93305a(Property.LongVideoDefaultUseLong));
        } else {
            C35563c.f93230L.mo93341a(AVSettings.Property.DurationMode, false);
        }
        return C35563c.f93230L.mo93342a(AVSettings.Property.DurationMode);
    }
}
