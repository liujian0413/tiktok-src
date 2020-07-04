package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.support.p022v4.view.ViewPager.C0935e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment$onViewCreated$1 */
public final class PhoneEmailSignUpFragment$onViewCreated$1 implements C0935e {

    /* renamed from: a */
    final /* synthetic */ PhoneEmailSignUpFragment f59123a;

    public final void onPageScrolled(int i, float f, int i2) {
    }

    PhoneEmailSignUpFragment$onViewCreated$1(PhoneEmailSignUpFragment phoneEmailSignUpFragment) {
        this.f59123a = phoneEmailSignUpFragment;
    }

    public final void onPageSelected(int i) {
        String str;
        this.f59123a.f59114g = i;
        C22047a aVar = this.f59123a.f59008j;
        if (aVar == null) {
            C7573i.m23580a();
        }
        if (this.f59123a.mo57299a()) {
            str = "phone_sign_up_homepage";
        } else {
            str = "email_sign_up_homepage";
        }
        aVar.f58969g = str;
    }

    public final void onPageScrollStateChanged(int i) {
        String str;
        if (i == 2) {
            if (!this.f59123a.f59115h) {
                this.f59123a.f59115h = true;
                return;
            }
            RtlViewPager rtlViewPager = (RtlViewPager) this.f59123a.mo58338b(R.id.car);
            C7573i.m23582a((Object) rtlViewPager, "phoneEmailSignUpPager");
            if (rtlViewPager.getCurrentItem() != this.f59123a.f59114g) {
                if (this.f59123a.mo57299a()) {
                    str = "register_switch_phone";
                } else {
                    str = "register_switch_email";
                }
                C6907h.m21524a(str, (Map) new C21102b().mo56946a("enter_method", this.f59123a.mo58341f()).mo56946a("enter_type", "slide").f56672a);
            }
        }
    }
}
