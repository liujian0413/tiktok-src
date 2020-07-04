package com.p280ss.android.ugc.aweme.homepage.p1291ui;

import android.support.p022v4.view.ViewPager.C0935e;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.HomePageActivityUIIniterKt$initPagers$3 */
public final class HomePageActivityUIIniterKt$initPagers$3 implements C0935e {

    /* renamed from: a */
    final /* synthetic */ AmeSSActivity f79617a;

    HomePageActivityUIIniterKt$initPagers$3(AmeSSActivity ameSSActivity) {
        this.f79617a = ameSSActivity;
    }

    public final void onPageScrollStateChanged(int i) {
        C30246a.m98970a(this.f79617a).mo79726c(i);
    }

    public final void onPageSelected(int i) {
        C30246a.m98970a(this.f79617a).mo79718b(i);
    }

    public final void onPageScrolled(int i, float f, int i2) {
        C30246a.m98970a(this.f79617a).mo79701a(i, f, i2);
    }
}
