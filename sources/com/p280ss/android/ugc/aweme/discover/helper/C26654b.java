package com.p280ss.android.ugc.aweme.discover.helper;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchInDetailModeExperiment;
import com.p280ss.android.ugc.aweme.search.C37380c;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.b */
public final class C26654b {

    /* renamed from: a */
    private static AbTestModel f70281a = C7213d.m22500a().mo18803bo();

    /* renamed from: j */
    public static boolean m87582j() {
        return f70281a.isDiscoverMvpEnabled();
    }

    /* renamed from: l */
    private static int m87584l() {
        return C37380c.m119976c();
    }

    /* renamed from: g */
    public static boolean m87579g() {
        if (C7213d.m22500a().mo18728V() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m87581i() {
        if (m87578f() || C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private static int m87585m() {
        if (C6399b.m19944t()) {
            return 0;
        }
        return C37380c.m119977d();
    }

    /* renamed from: a */
    public static boolean m87573a() {
        if (m87582j()) {
            return false;
        }
        if (m87585m() == 2 || m87585m() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m87574b() {
        int Z = C7213d.m22500a().mo18732Z();
        if ((Z == 2 || Z == 1) && !C6399b.m19944t()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m87575c() {
        if (C6399b.m19944t() || C7213d.m22500a().mo18766ad() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m87576d() {
        if (!C6399b.m19944t()) {
            return C7213d.m22500a().mo18729W();
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m87580h() {
        if (!C6399b.m19944t() || C7213d.m22500a().mo18728V() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m87583k() {
        if (C6399b.m19944t() || !C7213d.m22500a().mo18730X()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m87577e() {
        if (C6384b.m19835a().mo15287a(SearchInDetailModeExperiment.class, true, "search_in_detail_mode", C6384b.m19835a().mo15295d().search_in_detail_mode, 0) == 0 && !m87582j() && m87584l() == 0 && m87585m() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m87578f() {
        if (C6399b.m19944t()) {
            return m87579g();
        }
        if (m87582j()) {
            return false;
        }
        if (m87584l() == 2 || m87584l() == 4 || m87584l() == 5 || m87573a() || (f70281a.isGuessUSearchEnabled && m87584l() != 1 && m87584l() != 3)) {
            return true;
        }
        return false;
    }
}
