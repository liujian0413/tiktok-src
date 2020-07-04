package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.lego.lazy.LazyFragmentPagerAdapter.C32338a;
import com.p280ss.android.ugc.aweme.lego.lazy.LazyPagerAdapter;
import com.p280ss.android.ugc.aweme.setting.C7213d;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ABLazyFragmentPagerAdapter */
public abstract class ABLazyFragmentPagerAdapter extends LazyPagerAdapter<Fragment> {

    /* renamed from: a */
    private final C0608j f69401a;

    /* renamed from: d */
    private C0633q f69402d;

    /* renamed from: e */
    private boolean f69403e = C7213d.m22500a().mo18751aN();

    /* renamed from: b */
    private static long mo67983b(int i) {
        return (long) i;
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public ABLazyFragmentPagerAdapter(C0608j jVar) {
        this.f69401a = jVar;
    }

    /* renamed from: a */
    public final boolean mo67893a(int i) {
        if (!this.f69403e || !super.mo67893a(i)) {
            return false;
        }
        return true;
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f69402d != null) {
            this.f69402d.mo2606d();
            this.f69402d = null;
            this.f69401a.mo2654b();
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m86707a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public final Fragment mo67894b(ViewGroup viewGroup, int i) {
        if (!this.f69403e) {
            return null;
        }
        Fragment fragment = (Fragment) this.f84444b.get(i);
        if (fragment == null) {
            return null;
        }
        String a = m86707a(viewGroup.getId(), mo67983b(i));
        if (this.f69401a.mo2644a(a) == null) {
            if (this.f69402d == null) {
                this.f69402d = this.f69401a.mo2645a();
            }
            this.f69402d.mo2586a(viewGroup.getId(), fragment, a);
            this.f84444b.remove(i);
        }
        return fragment;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f69402d == null) {
            this.f69402d = this.f69401a.mo2645a();
        }
        String a = m86707a(viewGroup.getId(), mo67983b(i));
        Fragment a2 = this.f69401a.mo2644a(a);
        if (a2 != null) {
            this.f69402d.mo2608e(a2);
        } else {
            a2 = (Fragment) mo67985c(viewGroup, i);
            if (!this.f69403e || !(a2 instanceof C32338a)) {
                this.f69402d.mo2586a(viewGroup.getId(), a2, a);
            } else {
                this.f84444b.put(i, a2);
            }
        }
        if (a2 != this.f84445c) {
            a2.setMenuVisibility(false);
            a2.setUserVisibleHint(false);
        }
        return a2;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f69402d == null) {
            this.f69402d = this.f69401a.mo2645a();
        }
        String a = m86707a(viewGroup.getId(), mo67983b(i));
        if (!this.f69403e || this.f69401a.mo2644a(a) == null) {
            this.f69402d.mo2607d((Fragment) obj);
        } else {
            this.f84444b.remove(i);
        }
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (mo67893a(i)) {
            startUpdate(viewGroup);
            mo67894b(viewGroup, i);
            finishUpdate(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f84445c) {
            if (this.f84445c != null) {
                ((Fragment) this.f84445c).setMenuVisibility(false);
                ((Fragment) this.f84445c).setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f84445c = fragment;
        }
    }
}
