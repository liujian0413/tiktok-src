package com.p280ss.android.ugc.aweme.main;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.main.experiment.C33004c;
import com.p280ss.android.ugc.aweme.main.experiment.CanShowScrollToFeedFollowGuideExperiment;
import com.p280ss.android.ugc.aweme.main.experiment.FamiliarFeedStrategyExperiment;

/* renamed from: com.ss.android.ugc.aweme.main.bi */
public final class C32904bi {

    /* renamed from: a */
    private static final boolean f85843a = m106505j();

    /* renamed from: a */
    public static boolean m106496a() {
        if (!m106510o() || !f85843a) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m106499d() {
        if (!m106510o() || C33004c.m106654c() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m106501f() {
        if (3 == m106511p()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m106504i() {
        if (C33004c.m106655d() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static boolean m106505j() {
        try {
            return C30199h.m98861a().getMainTabFollowUseLazyViewpager().booleanValue();
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: m */
    private static boolean m106508m() {
        return C6903bc.m21482a().mo84636f();
    }

    /* renamed from: b */
    public static boolean m106497b() {
        if (C6399b.m19944t()) {
            return false;
        }
        if (C33004c.m106652a() == 2 || C33004c.m106652a() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m106498c() {
        if (m106510o() || m106497b()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m106500e() {
        if (m106510o() || m106501f()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m106502g() {
        if (m106510o() || m106497b()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m106506k() {
        if (C6399b.m19944t()) {
            return false;
        }
        if (m106509n() || m106507l()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private static boolean m106510o() {
        if (!C6399b.m19944t() && C33004c.m106652a() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m106503h() {
        if (!m106510o() || C6384b.m19835a().mo15287a(CanShowScrollToFeedFollowGuideExperiment.class, true, "show_scroll_to_feed_follow_guide", C6384b.m19835a().mo15295d().show_scroll_to_feed_follow_guide, 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private static boolean m106507l() {
        if (!C6399b.m19944t() && C6384b.m19835a().mo15287a(FamiliarFeedStrategyExperiment.class, true, "familiar_feed_strategy", C6384b.m19835a().mo15295d().familiar_feed_strategy, 0) == 2 && m106510o()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static boolean m106509n() {
        if (!C6399b.m19944t() && C6384b.m19835a().mo15287a(FamiliarFeedStrategyExperiment.class, true, "familiar_feed_strategy", C6384b.m19835a().mo15295d().familiar_feed_strategy, 0) == 1 && m106510o()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private static int m106511p() {
        if (C6399b.m19944t()) {
            return 10;
        }
        if (m106506k()) {
            return 3;
        }
        if (m106508m()) {
            return 4;
        }
        if (m106510o()) {
            return 1;
        }
        if (m106497b()) {
            return 2;
        }
        return 0;
    }
}
