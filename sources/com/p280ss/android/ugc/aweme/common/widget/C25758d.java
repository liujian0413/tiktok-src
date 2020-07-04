package com.p280ss.android.ugc.aweme.common.widget;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;

/* renamed from: com.ss.android.ugc.aweme.common.widget.d */
public final class C25758d {

    /* renamed from: a */
    public static final C25758d f67926a = new C25758d();

    private C25758d() {
    }

    /* renamed from: a */
    public static final double m84610a() {
        return C10292j.m30480a().mo25011a(RecommendFixSplashBugSetting.class, "recommend_fix_splash_bug", C6384b.m19835a().mo15294c().getRecommendFixSplashBug());
    }

    /* renamed from: a */
    public static final void m84611a(VerticalViewPager verticalViewPager) {
        if (m84610a() > 0.0d) {
            if (verticalViewPager != null) {
                verticalViewPager.setNeedRestrictDeltaY(true);
            }
        } else if (verticalViewPager != null) {
            verticalViewPager.setNeedRestrictDeltaY(false);
        }
    }
}
