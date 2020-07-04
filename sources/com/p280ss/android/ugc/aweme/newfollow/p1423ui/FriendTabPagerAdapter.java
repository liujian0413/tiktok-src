package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.utils.C42982bn;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabPagerAdapter */
public class FriendTabPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    private ArrayList<Fragment> f89044a = new ArrayList<>();

    public int getCount() {
        return this.f89044a.size();
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        return (Fragment) this.f89044a.get(i);
    }

    public CharSequence getPageTitle(int i) {
        if (i == 0) {
            return AwemeApplication.m21341a().getString(R.string.b_o);
        }
        if (i == 1) {
            return C42982bn.m136452a(R.string.b_p, R.string.b_n);
        }
        return "";
    }

    public FriendTabPagerAdapter(C0608j jVar, ArrayList<Fragment> arrayList) {
        super(jVar);
        this.f89044a = arrayList;
    }
}
