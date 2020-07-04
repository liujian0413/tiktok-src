package com.p280ss.android.ugc.aweme.feed.guide;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p1685ug.experiment.DoubleTapToLikeStyleExperiment;
import com.p280ss.android.ugc.aweme.p1685ug.experiment.SwipeGuideStyleExperiment;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.f */
public final class C6915f {

    /* renamed from: a */
    public static volatile boolean f19589a;

    /* renamed from: a */
    public static boolean m21542a() {
        if (C6384b.m19835a().mo15287a(DoubleTapToLikeStyleExperiment.class, true, "double_tap_to_like_style", C6384b.m19835a().mo15295d().double_tap_to_like_style, 0) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m21543b() {
        if (C6399b.m19944t()) {
            return true;
        }
        return C6384b.m19835a().mo15292a(SwipeGuideStyleExperiment.class, true, "swipe_guide_style", C6384b.m19835a().mo15295d().swipe_guide_style, false);
    }
}
