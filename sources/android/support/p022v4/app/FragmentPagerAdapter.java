package android.support.p022v4.app;

import android.os.Parcelable;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.FragmentPagerAdapter */
public abstract class FragmentPagerAdapter extends PagerAdapter {

    /* renamed from: a */
    private final C0608j f2167a;

    /* renamed from: b */
    private C0633q f2168b;

    /* renamed from: c */
    private Fragment f2169c;

    /* renamed from: a */
    public abstract Fragment mo2423a(int i);

    /* renamed from: b */
    public long mo2424b(int i) {
        return (long) i;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public FragmentPagerAdapter(C0608j jVar) {
        this.f2167a = jVar;
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f2168b != null) {
            this.f2168b.mo2610f();
            this.f2168b = null;
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
    private static String m2294a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f2168b == null) {
            this.f2168b = this.f2167a.mo2645a();
        }
        long b = mo2424b(i);
        Fragment a = this.f2167a.mo2644a(m2294a(viewGroup.getId(), b));
        if (a != null) {
            this.f2168b.mo2608e(a);
        } else {
            a = mo2423a(i);
            this.f2168b.mo2586a(viewGroup.getId(), a, m2294a(viewGroup.getId(), b));
        }
        if (a != this.f2169c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f2168b == null) {
            this.f2168b = this.f2167a.mo2645a();
        }
        this.f2168b.mo2607d((Fragment) obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f2169c) {
            if (this.f2169c != null) {
                this.f2169c.setMenuVisibility(false);
                this.f2169c.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f2169c = fragment;
        }
    }
}
