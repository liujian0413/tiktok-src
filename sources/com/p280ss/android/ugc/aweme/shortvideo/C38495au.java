package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.au */
public final class C38495au {
    /* renamed from: b */
    private static boolean m123050b() {
        return C35563c.f93252o.mo83223a("key_first_use_camera", true);
    }

    /* renamed from: c */
    private static void m123051c() {
        C35563c.f93252o.mo83226b("key_first_use_camera", false);
    }

    /* renamed from: a */
    public static void m123049a() {
        if (m123050b()) {
            m123051c();
            if (C35563c.f93231M.mo93305a(Property.RearCamera)) {
                C35563c.f93230L.mo93338a(AVSettings.Property.CameraPosition, 0);
                return;
            }
            C35563c.f93230L.mo93338a(AVSettings.Property.CameraPosition, 1);
        }
    }
}
