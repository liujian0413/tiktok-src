package com.p280ss.android.ugc.aweme.proaccount;

import android.support.p022v4.view.ViewPager.C0935e;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeFragment$fillUi$1 */
public final class ProWelcomeFragment$fillUi$1 implements C0935e {

    /* renamed from: a */
    final /* synthetic */ ProWelcomeFragment f93358a;

    public final void onPageScrolled(int i, float f, int i2) {
    }

    ProWelcomeFragment$fillUi$1(ProWelcomeFragment proWelcomeFragment) {
        this.f93358a = proWelcomeFragment;
    }

    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.f93358a.f93348h = "scroll";
        }
    }

    public final void onPageSelected(int i) {
        Boolean bool = this.f93358a.f93349i;
        if (bool == null) {
            C7573i.m23580a();
        }
        if (!bool.booleanValue()) {
            this.f93358a.f93347g = System.currentTimeMillis() - this.f93358a.f93345e;
            int i2 = this.f93358a.f93346f + 1;
            StringBuilder sb = new StringBuilder("welcome screen");
            sb.append(i2);
            ProWelcomeFragment.m115119a(sb.toString(), this.f93358a.f93347g, this.f93358a.f93348h);
            this.f93358a.f93346f = i;
            this.f93358a.f93345e = System.currentTimeMillis();
        }
        this.f93358a.f93349i = Boolean.valueOf(false);
    }
}
