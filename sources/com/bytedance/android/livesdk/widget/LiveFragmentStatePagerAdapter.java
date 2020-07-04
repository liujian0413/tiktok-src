package com.bytedance.android.livesdk.widget;

import android.os.Parcelable;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class LiveFragmentStatePagerAdapter extends PagerAdapter {

    /* renamed from: a */
    private final C0608j f25020a;

    /* renamed from: b */
    private C0633q f25021b;

    /* renamed from: c */
    private Fragment f25022c;

    /* renamed from: a */
    public abstract Fragment mo21541a(int i);

    /* renamed from: c */
    public long mo21544c(int i) {
        return (long) i;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public LiveFragmentStatePagerAdapter(C0608j jVar) {
        this.f25020a = jVar;
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f25021b != null) {
            try {
                this.f25021b.mo2610f();
                this.f25020a.mo2654b();
            } catch (IllegalStateException unused) {
            } catch (NullPointerException unused2) {
            } finally {
                this.f25021b = null;
            }
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m27359a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f25021b == null) {
            this.f25021b = this.f25020a.mo2645a();
        }
        long c = mo21544c(i);
        Fragment a = this.f25020a.mo2644a(m27359a(viewGroup.getId(), c));
        if (a != null) {
            this.f25021b.mo2608e(a);
        } else {
            a = mo21541a(i);
            this.f25021b.mo2586a(viewGroup.getId(), a, m27359a(viewGroup.getId(), c));
        }
        if (a != this.f25022c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f25021b == null) {
            this.f25021b = this.f25020a.mo2645a();
        }
        this.f25021b.mo2587a((Fragment) obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f25022c) {
            if (this.f25022c != null) {
                this.f25022c.setMenuVisibility(false);
                this.f25022c.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f25022c = fragment;
        }
    }
}
