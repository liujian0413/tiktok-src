package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.commercialize.profile.AggregationTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.profile.BrandTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25250au;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter3 */
public class ProfileFragmentAdapter3<T extends AmeBaseFragment> extends FragmentPagerAdapter {

    /* renamed from: a */
    public int f95159a;

    /* renamed from: b */
    public User f95160b;

    /* renamed from: c */
    private List<T> f95161c;

    /* renamed from: d */
    private List<Integer> f95162d;

    public int getCount() {
        return this.f95161c.size();
    }

    /* renamed from: b */
    public final long mo2424b(int i) {
        return (long) ((Integer) this.f95162d.get(i)).intValue();
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        boolean z;
        Fragment fragment = (Fragment) this.f95161c.get(i);
        if (fragment instanceof C36340al) {
            C36340al alVar = (C36340al) fragment;
            if (this.f95159a == i) {
                z = true;
            } else {
                z = false;
            }
            alVar.mo90834f(z);
        }
        return fragment;
    }

    public int getItemPosition(Object obj) {
        if (this.f95161c.contains(obj)) {
            return this.f95161c.indexOf(obj);
        }
        return -2;
    }

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
                return C25250au.m82998b(this.f95160b);
            case 8:
                return C23481i.m77089a().getString(R.string.d5y);
            case 10:
                BrandTabFragment brandTabFragment = (BrandTabFragment) m117219a(10, BrandTabFragment.class);
                if (brandTabFragment != null) {
                    return brandTabFragment.mo65509g();
                }
                return C23481i.m77089a().getString(R.string.b1h);
            case 12:
                AggregationTabFragment aggregationTabFragment = (AggregationTabFragment) m117219a(12, AggregationTabFragment.class);
                if (aggregationTabFragment != null) {
                    return aggregationTabFragment.mo65506g();
                }
                return C23481i.m77089a().getString(R.string.b1h);
            case 13:
                return C23481i.m77089a().getString(R.string.dc0);
            default:
                StringBuilder sb2 = new StringBuilder("unknown aweme list type: ");
                sb2.append(b);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private <K> K m117219a(int i, Class<K> cls) {
        if (this.f95162d != null) {
            int indexOf = this.f95162d.indexOf(Integer.valueOf(i));
            if (indexOf >= 0) {
                try {
                    if (cls.isInstance(this.f95161c.get(indexOf))) {
                        return this.f95161c.get(indexOf);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public ProfileFragmentAdapter3(C0608j jVar, List<T> list, List<Integer> list2, String str) {
        super(jVar);
        this.f95161c = list;
        this.f95162d = list2;
    }
}
