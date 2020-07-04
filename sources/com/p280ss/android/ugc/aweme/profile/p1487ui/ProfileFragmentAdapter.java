package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter */
public class ProfileFragmentAdapter<T extends AmeBaseFragment> extends FragmentPagerAdapter {

    /* renamed from: b */
    public List<T> f95153b;

    /* renamed from: c */
    public List<Integer> f95154c;

    public int getCount() {
        return this.f95153b.size();
    }

    public ProfileFragmentAdapter(C0608j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        return (Fragment) this.f95153b.get(i);
    }

    /* renamed from: b */
    public final long mo2424b(int i) {
        return (long) ((Integer) this.f95154c.get(i)).intValue();
    }

    /* renamed from: e */
    public final int mo92302e(int i) {
        return ((Integer) this.f95154c.get(i)).intValue();
    }

    /* renamed from: f */
    public final int mo92303f(int i) {
        return this.f95154c.indexOf(Integer.valueOf(i));
    }

    /* renamed from: g */
    public final Fragment mo92304g(int i) {
        int indexOf = this.f95154c.indexOf(Integer.valueOf(0));
        if (indexOf < 0 || indexOf >= this.f95153b.size()) {
            return null;
        }
        return (Fragment) this.f95153b.get(indexOf);
    }

    public int getItemPosition(Object obj) {
        if (this.f95153b.contains(obj)) {
            return this.f95153b.indexOf(obj);
        }
        return -2;
    }

    public CharSequence getPageTitle(int i) {
        Integer num = (Integer) this.f95154c.get(i);
        if (this.f95153b.get(i) instanceof C36344am) {
            return ((C36344am) this.f95153b.get(i)).mo63416l();
        }
        int intValue = num.intValue();
        if (intValue == 16) {
            return C23481i.m77091b(R.string.a5w);
        }
        if (intValue == 19) {
            return C23481i.m77091b(R.string.bc1);
        }
        switch (intValue) {
            case 0:
            case 2:
                if (this.f95153b.get(i) == null || !((AmeBaseFragment) this.f95153b.get(i)).f19556I) {
                    return C23481i.m77091b(R.string.beo);
                }
                return C23481i.m77091b(R.string.a_e);
            case 1:
                break;
            case 3:
                if (this.f95153b.get(i) != null && ((AmeBaseFragment) this.f95153b.get(i)).f19556I) {
                    return C23481i.m77091b(R.string.a_e);
                }
            default:
                switch (intValue) {
                    case 8:
                        return C23481i.m77091b(R.string.a65);
                    case 9:
                        return C23481i.m77091b(R.string.cxe);
                    case 10:
                        return C23481i.m77091b(R.string.a5z);
                    case 11:
                        return C23481i.m77091b(R.string.a62);
                    case 12:
                        return C23481i.m77091b(R.string.b6g);
                    default:
                        switch (intValue) {
                            case 21:
                                return C23481i.m77091b(R.string.c94);
                            case 22:
                                return C23481i.m77091b(R.string.c9m);
                            default:
                                return "";
                        }
                }
        }
        return C23481i.m77091b(R.string.b_e);
    }

    /* renamed from: a */
    public final void mo92301a(List<T> list, List<Integer> list2) {
        this.f95153b = list;
        this.f95154c = list2;
    }

    public ProfileFragmentAdapter(C0608j jVar, List<T> list, List<Integer> list2) {
        super(jVar);
        this.f95153b = list;
        this.f95154c = list2;
    }
}
