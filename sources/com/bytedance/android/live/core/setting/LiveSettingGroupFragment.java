package com.bytedance.android.live.core.setting;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.utils.SlideFinishUtil.SlideFinishPageChangeListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveSettingGroupFragment extends BaseFragment {

    /* renamed from: a */
    public String[] f10062a = {"直播AB", "直播配置", "feed配置"};

    /* renamed from: b */
    public String[][] f10063b = {new String[]{"com.bytedance.android.livesdk.config.LiveSettingKeys"}, new String[]{"com.bytedance.android.livesdk.config.LiveConfigSettingKeys", "com.bytedance.android.live.core.setting.CoreSettingKeys", "com.bytedance.android.live.network.NetworkSettingKeys"}, new String[]{"com.bytedance.android.livesdk.feed.setting.LiveFeedSettings"}};

    /* renamed from: c */
    private TabLayout f10064c;

    /* renamed from: d */
    private ViewPager f10065d;

    /* renamed from: a */
    private void m12411a() {
        this.f10064c = (TabLayout) getView().findViewById(R.id.dfo);
        this.f10065d = (ViewPager) getView().findViewById(R.id.edp);
        this.f10065d.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            public final int getCount() {
                return LiveSettingGroupFragment.this.f10062a.length;
            }

            public final CharSequence getPageTitle(int i) {
                return LiveSettingGroupFragment.this.f10062a[i];
            }

            /* renamed from: a */
            public final Fragment mo2423a(int i) {
                return SettingFragment.m12413a(LiveSettingGroupFragment.this.f10063b[i]);
            }
        });
        this.f10065d.addOnPageChangeListener(new SlideFinishPageChangeListener(this.f10065d));
        this.f10064c.setupWithViewPager(this.f10065d);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m12411a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aps, viewGroup, false);
    }
}
