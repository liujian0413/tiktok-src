package com.p280ss.android.ugc.aweme.profile.adapter;

import android.support.p022v4.app.C0608j;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.commercialize.profile.AggregationTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.profile.BrandTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25250au;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileFragmentAdapter;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.MyProfileFragmentAdapter */
public class MyProfileFragmentAdapter extends ProfileFragmentAdapter<ProfileListFragment> {

    /* renamed from: a */
    public User f93645a;

    public CharSequence getPageTitle(int i) {
        int b = (int) mo2424b(i);
        switch (b) {
            case 0:
                return C23481i.m77089a().getString(R.string.fsv);
            case 1:
                return C23481i.m77089a().getString(R.string.bz_);
            case 2:
                if (C6399b.m19944t()) {
                    return C23481i.m77089a().getString(R.string.e3f);
                }
                StringBuilder sb = new StringBuilder("unknown aweme list type: ");
                sb.append(b);
                throw new IllegalArgumentException(sb.toString());
            case 3:
                return C23481i.m77089a().getString(R.string.cgx);
            case 5:
                return C23481i.m77089a().getString(R.string.b6g);
            case 6:
                return C23481i.m77089a().getString(R.string.e_w);
            case 7:
                return C25250au.m82998b(this.f93645a);
            case 8:
                return C23481i.m77089a().getString(R.string.d5y);
            case 10:
                BrandTabFragment brandTabFragment = (BrandTabFragment) m115396a(10, BrandTabFragment.class);
                if (brandTabFragment != null) {
                    return brandTabFragment.mo65509g();
                }
                return C23481i.m77089a().getString(R.string.b1h);
            case 12:
                AggregationTabFragment aggregationTabFragment = (AggregationTabFragment) m115396a(12, AggregationTabFragment.class);
                if (aggregationTabFragment != null) {
                    return aggregationTabFragment.mo65506g();
                }
                return C23481i.m77089a().getString(R.string.b1h);
            default:
                StringBuilder sb2 = new StringBuilder("unknown aweme list type: ");
                sb2.append(b);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private <K> K m115396a(int i, Class<K> cls) {
        List<Integer> list = this.f95154c;
        if (list != null) {
            int indexOf = list.indexOf(Integer.valueOf(i));
            if (indexOf >= 0) {
                try {
                    List<T> list2 = this.f95153b;
                    if (cls.isInstance(list2.get(indexOf))) {
                        return list2.get(indexOf);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public MyProfileFragmentAdapter(C0608j jVar, List<ProfileListFragment> list, List<Integer> list2) {
        super(jVar, list, list2);
    }
}
