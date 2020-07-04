package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.p027os.C0882d;
import android.support.p022v4.p027os.C0884e;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager */
public class RtlViewPager extends ViewPager {

    /* renamed from: a */
    public boolean f112290a;

    /* renamed from: b */
    private int f112291b;

    /* renamed from: c */
    private HashMap<C0935e, C43351b> f112292c = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = C0882d.m3749a(new C0884e<SavedState>() {
            /* renamed from: b */
            private static SavedState[] m137605b(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public final /* synthetic */ Object[] mo3287a(int i) {
                return m137605b(i);
            }

            /* renamed from: b */
            private static SavedState m137604b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo3286a(Parcel parcel, ClassLoader classLoader) {
                return m137604b(parcel, classLoader);
            }
        });

        /* renamed from: a */
        public final Parcelable f112293a;

        /* renamed from: b */
        public final int f112294b;

        public int describeContents() {
            return 0;
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f112293a = parcelable;
            this.f112294b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f112293a, i);
            parcel.writeInt(this.f112294b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f112293a = parcel.readParcelable(classLoader);
            this.f112294b = parcel.readInt();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager$a */
    class C43350a extends DelegatingFragmentPagerAdapter {
        /* renamed from: a */
        public final Fragment mo2423a(int i) {
            if (RtlViewPager.this.mo105208b()) {
                i = (getCount() - i) - 1;
            }
            return super.mo2423a(i);
        }

        /* renamed from: b */
        public final long mo2424b(int i) {
            if (RtlViewPager.this.mo105208b()) {
                i = (getCount() - i) - 1;
            }
            return super.mo2424b(i);
        }

        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!RtlViewPager.this.mo105208b()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        public final CharSequence getPageTitle(int i) {
            if (RtlViewPager.this.mo105208b()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        public final float getPageWidth(int i) {
            if (RtlViewPager.this.mo105208b()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        C43350a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        public final Object instantiateItem(View view, int i) {
            if (RtlViewPager.this.mo105208b()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (RtlViewPager.this.mo105208b()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        public final void destroyItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo105208b()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        public final void setPrimaryItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo105208b()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo105208b()) {
                i = (getCount() - i) - 1;
            }
            if (i < 0) {
                i = 0;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo105208b()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager$b */
    class C43351b implements C0935e {

        /* renamed from: b */
        private final C0935e f112297b;

        public final void onPageScrollStateChanged(int i) {
            this.f112297b.onPageScrollStateChanged(i);
            if (RtlViewPager.this.f112290a) {
                m137610a(i);
            }
        }

        public final void onPageSelected(int i) {
            PagerAdapter b = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo105208b() && b != null) {
                i = (b.getCount() - i) - 1;
            }
            this.f112297b.onPageSelected(i);
        }

        /* renamed from: a */
        private void m137610a(int i) {
            if (i == 0 && !RtlViewPager.this.mo105208b() && RtlViewPager.this.getCurrentItem() == 0 && RtlViewPager.this.getScrollX() > 0) {
                RtlViewPager.this.setScrollX(0);
            }
        }

        C43351b(C0935e eVar) {
            this.f112297b = eVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            PagerAdapter a = RtlViewPager.super.getAdapter();
            if (!RtlViewPager.this.mo105208b() || a == null) {
                this.f112297b.onPageScrolled(i, f, i2);
                return;
            }
            int count = a.getCount();
            if (i == count - 1 && f == 0.0f) {
                i--;
                i2 = RtlViewPager.this.getWidth();
                f = 1.0f;
            }
            this.f112297b.onPageScrolled((count - (i + 1)) - 1, 1.0f - f, RtlViewPager.this.getWidth() - i2);
        }
    }

    /* renamed from: b */
    public final boolean mo105208b() {
        if (this.f112291b == 1) {
            return true;
        }
        return false;
    }

    public PagerAdapter getAdapter() {
        C43350a aVar = (C43350a) super.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f112227a;
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f112291b);
    }

    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !mo105208b()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    public int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getCount();
    }

    public void setCheckScrollXWhenIdle(boolean z) {
        this.f112290a = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public RtlViewPager(Context context) {
        super(context);
    }

    public void addOnPageChangeListener(C0935e eVar) {
        C43351b bVar = new C43351b(eVar);
        this.f112292c.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    public void removeOnPageChangeListener(C0935e eVar) {
        super.removeOnPageChangeListener((C0935e) this.f112292c.get(eVar));
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C43350a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setOnPageChangeListener(C0935e eVar) {
        super.setOnPageChangeListener(new C43351b(eVar));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f112291b = savedState.f112294b;
        super.onRestoreInstanceState(savedState.f112293a);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            motionEvent.setAction(3);
            return super.onTouchEvent(motionEvent);
        }
    }

    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo105208b()) {
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
        if (i3 != this.f112291b) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f112291b = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    public int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
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
        if (adapter != null && mo105208b()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }
}
