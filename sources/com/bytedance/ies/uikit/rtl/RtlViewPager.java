package com.bytedance.ies.uikit.rtl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.p027os.C0882d;
import android.support.p022v4.p027os.C0884e;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.HashMap;

public class RtlViewPager extends ViewPager {

    /* renamed from: a */
    private int f30047a;

    /* renamed from: b */
    private HashMap<C0935e, C11066b> f30048b;

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = C0882d.m3749a(new C0884e<SavedState>() {
            /* renamed from: b */
            private static SavedState[] m32426b(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public final /* synthetic */ Object[] mo3287a(int i) {
                return m32426b(i);
            }

            /* renamed from: b */
            private static SavedState m32425b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo3286a(Parcel parcel, ClassLoader classLoader) {
                return m32425b(parcel, classLoader);
            }
        });

        /* renamed from: a */
        public final Parcelable f30049a;

        /* renamed from: b */
        public final int f30050b;

        public int describeContents() {
            return 0;
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f30049a = parcelable;
            this.f30050b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f30049a, i);
            parcel.writeInt(this.f30050b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f30049a = parcel.readParcelable(classLoader);
            this.f30050b = parcel.readInt();
        }
    }

    /* renamed from: com.bytedance.ies.uikit.rtl.RtlViewPager$a */
    class C11065a extends DelegatingPagerAdapter {
        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!RtlViewPager.this.mo26912a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        public final CharSequence getPageTitle(int i) {
            if (RtlViewPager.this.mo26912a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        public final float getPageWidth(int i) {
            if (RtlViewPager.this.mo26912a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        public C11065a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        public final Object instantiateItem(View view, int i) {
            if (RtlViewPager.this.mo26912a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (RtlViewPager.this.mo26912a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        public final void destroyItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo26912a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        public final void setPrimaryItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo26912a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo26912a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo26912a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.rtl.RtlViewPager$b */
    class C11066b implements C0935e {

        /* renamed from: b */
        private final C0935e f30053b;

        public final void onPageScrollStateChanged(int i) {
            this.f30053b.onPageScrollStateChanged(i);
        }

        public final void onPageSelected(int i) {
            PagerAdapter b = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo26912a() && b != null) {
                i = (b.getCount() - i) - 1;
            }
            this.f30053b.onPageSelected(i);
        }

        public C11066b(C0935e eVar) {
            this.f30053b = eVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            int width = RtlViewPager.this.getWidth();
            PagerAdapter a = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo26912a() && a != null) {
                int count = a.getCount();
                float f2 = (float) width;
                int pageWidth = ((int) ((1.0f - a.getPageWidth(i)) * f2)) + i2;
                while (i < count && pageWidth > 0) {
                    i++;
                    pageWidth -= (int) (a.getPageWidth(i) * f2);
                }
                i = (count - i) - 1;
                i2 = -pageWidth;
                f = ((float) i2) / (f2 * a.getPageWidth(i));
            }
            this.f30053b.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: a */
    public final boolean mo26912a() {
        if (this.f30047a == 1) {
            return true;
        }
        return false;
    }

    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.f30048b.clear();
    }

    public PagerAdapter getAdapter() {
        C11065a aVar = (C11065a) super.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f30045a;
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f30047a);
    }

    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !mo26912a()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    public void addOnPageChangeListener(C0935e eVar) {
        C11066b bVar = new C11066b(eVar);
        this.f30048b.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    public void removeOnPageChangeListener(C0935e eVar) {
        C11066b bVar = (C11066b) this.f30048b.remove(eVar);
        if (bVar != null) {
            super.removeOnPageChangeListener(bVar);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C11065a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setOnPageChangeListener(C0935e eVar) {
        super.setOnPageChangeListener(new C11066b(eVar));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f30047a = savedState.f30050b;
        super.onRestoreInstanceState(savedState.f30049a);
    }

    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo26912a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        if (i3 != this.f30047a) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f30047a = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i2) == 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo26912a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }
}
