package com.p280ss.android.ugc.aweme.main;

import android.content.Context;
import android.support.p022v4.app.C0611k;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35664b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.main.dj */
public final class C32988dj implements C33061p {

    /* renamed from: a */
    private Context f85951a;

    /* renamed from: b */
    private ScrollableViewPager f85952b;

    /* renamed from: c */
    private SwitchFragmentPagerAdapter f85953c;

    /* renamed from: d */
    private ScrollSwitchStateManager f85954d;

    /* renamed from: e */
    private HomePageDataViewModel f85955e;

    /* renamed from: c */
    public final boolean mo84700c() {
        return m106630b((Boolean) null);
    }

    /* renamed from: a */
    public final C36340al mo84693a() {
        if (this.f85953c == null) {
            return null;
        }
        CommonPageFragment d = this.f85954d.mo79729d("page_feed");
        if (d != null && (d instanceof MainPageFragment)) {
            return ((MainPageFragment) d).mo84534q();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo84699b() {
        if (this.f85953c == null || !C0611k.m2585a(this.f85953c.f61826d)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m106631d() {
        boolean z;
        boolean b = this.f85954d.mo79723b("page_feed");
        boolean z2 = this.f85954d.mo79729d("page_feed") instanceof MainPageFragment;
        if (this.f85953c == null || !z2) {
            z = false;
        } else {
            z = true;
        }
        if (!b || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo84697a(Boolean bool) {
        m106630b(bool);
    }

    /* renamed from: a */
    public final void mo84695a(Aweme aweme) {
        mo84696a(aweme, "");
    }

    /* renamed from: a */
    public final void mo84694a(C0935e eVar) {
        if (this.f85952b != null) {
            this.f85952b.mo3451a(eVar);
        }
    }

    /* renamed from: b */
    public final void mo84698b(C0935e eVar) {
        if (this.f85952b != null) {
            this.f85952b.mo3453b(eVar);
        }
    }

    /* renamed from: b */
    private boolean m106630b(Boolean bool) {
        C42961az.m136380a(new C35664b());
        if (this.f85952b != null) {
            if (!this.f85954d.mo79723b("page_feed")) {
                if (bool != null) {
                    this.f85954d.mo79713a("page_feed", bool.booleanValue());
                } else {
                    this.f85954d.mo79712a("page_feed");
                }
                return true;
            } else if (!m106631d()) {
                return this.f85954d.mo79729d("page_feed") instanceof MainPageFragment;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo84696a(Aweme aweme, String str) {
        if (this.f85952b != null) {
            this.f85955e.f79571j = true;
            CommonPageFragment d = this.f85954d.mo79729d("page_profile");
            if (d instanceof ProfilePageFragment) {
                ProfilePageFragment profilePageFragment = (ProfilePageFragment) d;
                profilePageFragment.mo90467a(str);
                profilePageFragment.mo90463a(this.f85955e.f79571j);
            }
            this.f85954d.mo79713a("page_profile", true);
        }
    }

    public C32988dj(Context context, ScrollableViewPager scrollableViewPager, SwitchFragmentPagerAdapter switchFragmentPagerAdapter) {
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            this.f85954d = ScrollSwitchStateManager.m98918a(fragmentActivity);
            this.f85955e = HomePageDataViewModel.m98904a(fragmentActivity);
        }
        this.f85951a = context;
        this.f85952b = scrollableViewPager;
        this.f85953c = switchFragmentPagerAdapter;
    }
}
