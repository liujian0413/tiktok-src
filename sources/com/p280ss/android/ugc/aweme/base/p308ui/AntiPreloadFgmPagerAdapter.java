package com.p280ss.android.ugc.aweme.base.p308ui;

import android.os.Parcelable;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.PagerAdapter;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AntiPreloadFgmPagerAdapter */
public abstract class AntiPreloadFgmPagerAdapter extends PagerAdapter {

    /* renamed from: a */
    protected final C0608j f61627a;

    /* renamed from: b */
    protected C0633q f61628b;

    /* renamed from: c */
    private Fragment f61629c;

    /* renamed from: d */
    private SparseArray<String> f61630d = new SparseArray<>();

    /* renamed from: b */
    private static long mo79774b(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public abstract Fragment mo60871a(int i);

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public AntiPreloadFgmPagerAdapter(C0608j jVar) {
        this.f61627a = jVar;
    }

    /* renamed from: c */
    private String mo79775c(int i) {
        return String.valueOf(mo79774b(i));
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f61628b != null) {
            try {
                this.f61628b.mo2606d();
                this.f61628b = null;
                this.f61627a.mo2654b();
            } catch (IllegalStateException e) {
                if (!C7163a.m22363a()) {
                    StringBuilder sb = new StringBuilder("finishUpdate ->");
                    sb.append(e);
                    C6921a.m21552a(6, "FragmentPagerAdapter", sb.toString());
                } else {
                    throw e;
                }
            }
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private String m76751a(int i, int i2) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(mo79775c(i2));
        return sb.toString();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f61628b == null) {
            this.f61628b = this.f61627a.mo2645a();
        }
        String a = m76751a(viewGroup.getId(), i);
        Fragment a2 = this.f61627a.mo2644a(a);
        if (a2 != null) {
            this.f61628b.mo2608e(a2);
        } else {
            a2 = mo60871a(i);
            if (a2 == this.f61629c) {
                this.f61628b.mo2586a(viewGroup.getId(), a2, a);
                this.f61630d.put(i, a);
            }
        }
        if (a2 != this.f61629c) {
            a2.setMenuVisibility(false);
            a2.setUserVisibleHint(false);
        }
        return a2;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f61628b == null) {
            this.f61628b = this.f61627a.mo2645a();
        }
        this.f61628b.mo2607d((Fragment) obj);
        this.f61630d.remove(i);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        boolean z;
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f61629c) {
            boolean z2 = !TextUtils.equals(fragment.mTag, (CharSequence) this.f61630d.get(i, ""));
            if (TextUtils.isEmpty(fragment.mTag) || z2) {
                String a = m76751a(viewGroup.getId(), i);
                if (this.f61628b == null) {
                    this.f61628b = this.f61627a.mo2645a();
                }
                Fragment a2 = this.f61627a.mo2644a(a);
                if (a2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f61628b.mo2605c(a2);
                } else {
                    this.f61628b.mo2586a(viewGroup.getId(), fragment, a);
                }
                this.f61630d.put(i, a);
            }
            if (this.f61629c != null) {
                this.f61629c.setMenuVisibility(false);
                this.f61629c.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f61629c = fragment;
        }
    }
}
