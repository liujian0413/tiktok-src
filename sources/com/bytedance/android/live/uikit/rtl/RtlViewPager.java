package com.bytedance.android.live.uikit.rtl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.p027os.C0882d;
import android.support.p022v4.p027os.C0884e;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.HashMap;

public class RtlViewPager extends ViewPager {

    /* renamed from: a */
    private int f10700a;

    /* renamed from: b */
    private HashMap<C0935e, C3580b> f10701b = new HashMap<>();

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = C0882d.m3749a(new C0884e<SavedState>() {
            /* renamed from: b */
            private static SavedState[] m13148b(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public final /* synthetic */ Object[] mo3287a(int i) {
                return m13148b(i);
            }

            /* renamed from: b */
            private static SavedState m13147b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo3286a(Parcel parcel, ClassLoader classLoader) {
                return m13147b(parcel, classLoader);
            }
        });

        /* renamed from: a */
        public final Parcelable f10702a;

        /* renamed from: b */
        public final int f10703b;

        public int describeContents() {
            return 0;
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f10702a = parcelable;
            this.f10703b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10702a, i);
            parcel.writeInt(this.f10703b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f10702a = parcel.readParcelable(classLoader);
            this.f10703b = parcel.readInt();
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.rtl.RtlViewPager$a */
    class C3579a extends DelegatingPagerAdapter {
        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!RtlViewPager.this.mo10931a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        public final CharSequence getPageTitle(int i) {
            if (RtlViewPager.this.mo10931a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        public final float getPageWidth(int i) {
            if (RtlViewPager.this.mo10931a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        public C3579a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        public final Object instantiateItem(View view, int i) {
            if (RtlViewPager.this.mo10931a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (RtlViewPager.this.mo10931a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        public final void destroyItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo10931a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        public final void setPrimaryItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo10931a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo10931a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo10931a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.rtl.RtlViewPager$b */
    class C3580b implements C0935e {

        /* renamed from: b */
        private final C0935e f10706b;

        public final void onPageScrollStateChanged(int i) {
            this.f10706b.onPageScrollStateChanged(i);
        }

        public final void onPageSelected(int i) {
            PagerAdapter b = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo10931a() && b != null) {
                i = (b.getCount() - i) - 1;
            }
            this.f10706b.onPageSelected(i);
        }

        public C3580b(C0935e eVar) {
            this.f10706b = eVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            int width = RtlViewPager.this.getWidth();
            PagerAdapter a = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo10931a() && a != null) {
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
            this.f10706b.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: a */
    public final boolean mo10931a() {
        if (this.f10700a == 1) {
            return true;
        }
        return false;
    }

    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.f10701b.clear();
    }

    public PagerAdapter getAdapter() {
        C3579a aVar = (C3579a) super.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f10698a;
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f10700a);
    }

    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !mo10931a()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    public RtlViewPager(Context context) {
        super(context);
    }

    public void addOnPageChangeListener(C0935e eVar) {
        C3580b bVar = new C3580b(eVar);
        this.f10701b.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    public void removeOnPageChangeListener(C0935e eVar) {
        C3580b bVar = (C3580b) this.f10701b.remove(eVar);
        if (bVar != null) {
            super.removeOnPageChangeListener(bVar);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C3579a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setOnPageChangeListener(C0935e eVar) {
        super.setOnPageChangeListener(new C3580b(eVar));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f10700a = savedState.f10703b;
        super.onRestoreInstanceState(savedState.f10702a);
    }

    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo10931a()) {
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
        if (i3 != this.f10700a) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f10700a = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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
        if (adapter != null && mo10931a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }
}
