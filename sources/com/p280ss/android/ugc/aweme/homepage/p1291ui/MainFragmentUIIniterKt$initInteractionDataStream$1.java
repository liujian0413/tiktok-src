package com.p280ss.android.ugc.aweme.homepage.p1291ui;

import android.support.p022v4.view.ViewPager.C0935e;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.MainFragmentUIIniterKt$initInteractionDataStream$1 */
public final class MainFragmentUIIniterKt$initInteractionDataStream$1 implements C0935e {
    MainFragmentUIIniterKt$initInteractionDataStream$1() {
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageSelected(int i) {
        ScrollSwitchStateManager scrollSwitchStateManager = C30283g.f79647c;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.mo79730d(i);
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
        ScrollSwitchStateManager scrollSwitchStateManager = C30283g.f79647c;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.mo79719b(i, f, i2);
        }
    }
}
