package com.p280ss.android.ugc.aweme.discover;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonContainerFragment;
import com.p280ss.android.ugc.aweme.discover.activity.C26369a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.HotSearchAndDiscoveryFragment2;
import com.p280ss.android.ugc.aweme.main.base.C32895a;

/* renamed from: com.ss.android.ugc.aweme.discover.DiscoverPageFragment */
public class DiscoverPageFragment extends CommonContainerFragment {
    /* renamed from: a */
    public final String mo60917a() {
        return "tag_fragment_discover";
    }

    /* renamed from: d */
    public final Fragment mo60918d() {
        return new HotSearchAndDiscoveryFragment2();
    }

    /* renamed from: e */
    public final boolean mo60919e() {
        if (this.f61679e == null || !((C26369a) this.f61679e).mo67891c()) {
            return false;
        }
        return true;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f61679e != null) {
            if (z) {
                ((C26369a) this.f61679e).mo67889a("", "");
                return;
            }
            ((C26369a) this.f61679e).mo67890b();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C32895a.m106470a(getActivity()).mo84694a((C0935e) new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageSelected(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
                if (DiscoverPageFragment.this.f61679e != null) {
                    ((C26369a) DiscoverPageFragment.this.f61679e).mo67888a();
                }
            }
        });
    }
}
