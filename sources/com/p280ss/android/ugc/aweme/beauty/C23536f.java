package com.p280ss.android.ugc.aweme.beauty;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;

/* renamed from: com.ss.android.ugc.aweme.beauty.f */
public final class C23536f {

    /* renamed from: a */
    public static final C23536f f62118a = new C23536f();

    /* renamed from: b */
    private static final Keva f62119b = Keva.getRepo("ulike_repo");

    /* renamed from: c */
    private static boolean f62120c = true;

    private C23536f() {
    }

    /* renamed from: d */
    public static final void m77301d() {
        f62120c = m77303f();
    }

    /* renamed from: a */
    public static final boolean m77298a() {
        if (f62120c || !m77299b()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m77302e() {
        return C35574k.m114859a().mo70096k().mo93305a(Property.ComposerPanelHasTitle);
    }

    /* renamed from: f */
    private static final boolean m77303f() {
        return f62119b.getBoolean("key_beauty_guarantee_strategy", true);
    }

    /* renamed from: b */
    public static final boolean m77299b() {
        if (!C35574k.m114859a().mo70096k().mo93305a(Property.StudioBeautyEffectComposer) || (C6399b.m19946v() && !m77300c())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m77300c() {
        if (!C6399b.m19946v() || !C35574k.m114859a().mo70096k().mo93305a(Property.StudioMBeautyPanel)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m77297a(boolean z) {
        f62119b.storeBoolean("key_beauty_guarantee_strategy", z);
    }
}
