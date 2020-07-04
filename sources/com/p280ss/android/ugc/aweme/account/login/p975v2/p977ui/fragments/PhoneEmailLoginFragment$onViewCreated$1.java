package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.support.p022v4.view.ViewPager.C0935e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment$onViewCreated$1 */
public final class PhoneEmailLoginFragment$onViewCreated$1 implements C0935e {

    /* renamed from: a */
    final /* synthetic */ PhoneEmailLoginFragment f59111a;

    public final void onPageScrolled(int i, float f, int i2) {
    }

    PhoneEmailLoginFragment$onViewCreated$1(PhoneEmailLoginFragment phoneEmailLoginFragment) {
        this.f59111a = phoneEmailLoginFragment;
    }

    public final void onPageSelected(int i) {
        String str;
        this.f59111a.f59102g = i;
        C22047a aVar = this.f59111a.f59008j;
        if (aVar == null) {
            C7573i.m23580a();
        }
        if (this.f59111a.mo58451u()) {
            str = "phone_login_homepage";
        } else {
            str = "email_login_homepage";
        }
        aVar.f58969g = str;
    }

    public final void onPageScrollStateChanged(int i) {
        String str;
        if (i == 2) {
            if (!this.f59111a.f59103h) {
                this.f59111a.f59103h = true;
                return;
            }
            RtlViewPager rtlViewPager = (RtlViewPager) this.f59111a.mo58338b(R.id.cap);
            C7573i.m23582a((Object) rtlViewPager, "phoneEmailLoginPager");
            if (rtlViewPager.getCurrentItem() != this.f59111a.f59102g) {
                if (this.f59111a.mo58451u()) {
                    str = "switch_to_phone";
                } else {
                    str = "switch_to_email";
                }
                C6907h.m21524a(str, (Map) new C21102b().mo56946a("enter_method", this.f59111a.mo58341f()).mo56946a("enter_type", "slide").f56672a);
            }
        }
    }
}
