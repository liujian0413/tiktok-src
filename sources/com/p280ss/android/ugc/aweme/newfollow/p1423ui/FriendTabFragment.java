package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.discover.base.C26596c;
import com.p280ss.android.ugc.aweme.discover.p1185ui.HotSearchAndDiscoveryFragment2;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment */
public class FriendTabFragment extends AmeBaseFragment {

    /* renamed from: e */
    private ArrayList<Fragment> f89042e = new ArrayList<>();
    ViewPager mViewPager;

    /* renamed from: g */
    private void m110114g() {
        this.mViewPager.setAdapter(new FriendTabPagerAdapter(getChildFragmentManager(), this.f89042e));
        this.mViewPager.setOverScrollMode(2);
        this.mViewPager.setCurrentItem(0);
    }

    /* renamed from: d */
    public final C26596c mo86869d() {
        if (this.f89042e.size() == 0 || !(this.f89042e.get(0) instanceof C26596c)) {
            return null;
        }
        return (C26596c) this.f89042e.get(0);
    }

    /* renamed from: e */
    public final HotSearchAndDiscoveryFragment2 mo86870e() {
        if (this.f89042e.size() == 0 || !(this.f89042e.get(0) instanceof HotSearchAndDiscoveryFragment2)) {
            return null;
        }
        return (HotSearchAndDiscoveryFragment2) this.f89042e.get(0);
    }

    /* renamed from: a */
    public final FollowFeedFragment mo86868a() {
        if (this.f89042e.size() == 0 || !(this.f89042e.get(0) instanceof FollowFeedFragment)) {
            return null;
        }
        return (FollowFeedFragment) this.f89042e.get(0);
    }

    /* renamed from: f */
    private void m110113f() {
        this.f89042e.clear();
        if (C33003b.m106651a()) {
            Bundle bundle = new Bundle();
            bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_follow");
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 1);
            Fragment a = getChildFragmentManager().mo2644a(m110112a(R.id.edp, 0));
            if (a == null) {
                a = new FollowFeedFragment();
                a.setArguments(bundle);
            }
            this.f89042e.add(a);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("i18n_tab_mode", Boolean.valueOf(true));
        Fragment a2 = getChildFragmentManager().mo2644a(m110112a(R.id.edp, 0));
        if (a2 == null) {
            a2 = new HotSearchAndDiscoveryFragment2();
            a2.setArguments(bundle2);
        }
        this.f89042e.add(a2);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        Iterator it = this.f89042e.iterator();
        while (it.hasNext()) {
            ((Fragment) it.next()).setUserVisibleHint(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m110113f();
        m110114g();
    }

    /* renamed from: a */
    private static String m110112a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.edp);
        sb.append(":0");
        return sb.toString();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ob, viewGroup, false);
    }
}
