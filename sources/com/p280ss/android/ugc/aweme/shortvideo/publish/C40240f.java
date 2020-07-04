package com.p280ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.f */
public final class C40240f {

    /* renamed from: a */
    public static final C40240f f104570a = new C40240f();

    /* renamed from: b */
    private static boolean f104571b;

    private C40240f() {
    }

    /* renamed from: a */
    public static boolean m128584a() {
        return f104571b;
    }

    /* renamed from: b */
    public static boolean m128585b() {
        if (!C6399b.m19944t() || !C35563c.f93230L.mo93342a(Property.PostDownloadSetting)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo100037c() {
        if (!m128585b() || C35563c.f93231M.mo93306b(AVAB.Property.EnablePublishPrivacySetting) != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m128583a(boolean z) {
        f104571b = z;
    }
}
