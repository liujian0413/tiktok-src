package android.support.p022v4.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.p027os.C0882d;
import android.support.p022v4.p027os.C0884e;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: android.support.v4.view.DmtRtlViewPager */
public class DmtRtlViewPager extends DmtViewPager {

    /* renamed from: f */
    private int f3172f;

    /* renamed from: g */
    private HashMap<C0935e, C0913c> f3173g = new HashMap<>();

    /* renamed from: android.support.v4.view.DmtRtlViewPager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = C0882d.m3749a(new C0884e<SavedState>() {
            /* renamed from: b */
            private static SavedState[] m3886b(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public final /* synthetic */ Object[] mo3287a(int i) {
                return m3886b(i);
            }

            /* renamed from: b */
            private static SavedState m3885b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo3286a(Parcel parcel, ClassLoader classLoader) {
                return m3885b(parcel, classLoader);
            }
        });

        /* renamed from: a */
        public final Parcelable f3174a;

        /* renamed from: b */
        public final int f3175b;

        public int describeContents() {
            return 0;
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f3174a = parcelable;
            this.f3175b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3174a, i);
            parcel.writeInt(this.f3175b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f3174a = parcel.readParcelable(classLoader);
            this.f3175b = parcel.readInt();
        }
    }

    /* renamed from: android.support.v4.view.DmtRtlViewPager$a */
    static class C0911a extends DataSetObserver {

        /* renamed from: a */
        final C0912b f3176a;

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            if (this.f3176a != null) {
                this.f3176a.mo3470a();
            }
        }

        private C0911a(C0912b bVar) {
            this.f3176a = bVar;
        }
    }

    /* renamed from: android.support.v4.view.DmtRtlViewPager$b */
    class C0912b extends FragmentPagerAdapter {

        /* renamed from: a */
        public final PagerAdapter f3177a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3470a() {
            super.notifyDataSetChanged();
        }

        public final int getCount() {
            return this.f3177a.getCount();
        }

        public final Parcelable saveState() {
            return this.f3177a.saveState();
        }

        public final void finishUpdate(ViewGroup viewGroup) {
            this.f3177a.finishUpdate(viewGroup);
        }

        public final void startUpdate(ViewGroup viewGroup) {
            this.f3177a.startUpdate(viewGroup);
        }

        /* renamed from: a */
        public final Fragment mo2423a(int i) {
            if (DmtRtlViewPager.this.mo3452a()) {
                i = (getCount() - i) - 1;
            }
            return ((FragmentPagerAdapter) this.f3177a).mo2423a(i);
        }

        /* renamed from: b */
        public final long mo2424b(int i) {
            if (DmtRtlViewPager.this.mo3452a()) {
                i = (getCount() - i) - 1;
            }
            return super.mo2424b(i);
        }

        public final int getItemPosition(Object obj) {
            int itemPosition = this.f3177a.getItemPosition(obj);
            if (!DmtRtlViewPager.this.mo3452a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        public final CharSequence getPageTitle(int i) {
            if (DmtRtlViewPager.this.mo3452a()) {
                i = (getCount() - i) - 1;
            }
            return this.f3177a.getPageTitle(i);
        }

        public final float getPageWidth(int i) {
            if (DmtRtlViewPager.this.mo3452a()) {
                i = (getCount() - i) - 1;
            }
            return this.f3177a.getPageWidth(i);
        }

        public final boolean isViewFromObject(View view, Object obj) {
            return this.f3177a.isViewFromObject(view, obj);
        }

        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            this.f3177a.restoreState(parcelable, classLoader);
        }

        C0912b(PagerAdapter pagerAdapter) {
            super(null);
            this.f3177a = pagerAdapter;
            pagerAdapter.registerDataSetObserver(new C0911a(this));
        }

        public final Object instantiateItem(View view, int i) {
            if (DmtRtlViewPager.this.mo3452a()) {
                i = (getCount() - i) - 1;
            }
            return this.f3177a.instantiateItem(view, i);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (DmtRtlViewPager.this.mo3452a()) {
                i = (getCount() - i) - 1;
            }
            return this.f3177a.instantiateItem(viewGroup, i);
        }

        public final void destroyItem(View view, int i, Object obj) {
            if (DmtRtlViewPager.this.mo3452a()) {
                i = (getCount() - i) - 1;
            }
            this.f3177a.destroyItem(view, i, obj);
        }

        public final void setPrimaryItem(View view, int i, Object obj) {
            if (DmtRtlViewPager.this.mo3452a()) {
                i = (getCount() - i) - 1;
            }
            this.f3177a.setPrimaryItem(view, i, obj);
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (DmtRtlViewPager.this.mo3452a()) {
                i = (getCount() - i) - 1;
            }
            if (i < 0) {
                i = 0;
            }
            this.f3177a.destroyItem(viewGroup, i, obj);
        }

        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (DmtRtlViewPager.this.mo3452a()) {
                i = (getCount() - i) - 1;
            }
            this.f3177a.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: android.support.v4.view.DmtRtlViewPager$c */
    class C0913c implements C0935e {

        /* renamed from: b */
        private final C0935e f3180b;

        public final void onPageScrollStateChanged(int i) {
            this.f3180b.onPageScrollStateChanged(i);
        }

        public final void onPageSelected(int i) {
            PagerAdapter b = DmtRtlViewPager.super.getAdapter();
            if (DmtRtlViewPager.this.mo3452a() && b != null) {
                i = (b.getCount() - i) - 1;
            }
            this.f3180b.onPageSelected(i);
        }

        C0913c(C0935e eVar) {
            this.f3180b = eVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            PagerAdapter a = DmtRtlViewPager.super.getAdapter();
            if (!DmtRtlViewPager.this.mo3452a() || a == null) {
                this.f3180b.onPageScrolled(i, f, i2);
                return;
            }
            int count = a.getCount();
            if (i == count - 1 && f == 0.0f) {
                i--;
                i2 = DmtRtlViewPager.this.getWidth();
                f = 1.0f;
            }
            this.f3180b.onPageScrolled((count - (i + 1)) - 1, 1.0f - f, DmtRtlViewPager.this.getWidth() - i2);
        }
    }

    public PagerAdapter getAdapter() {
        C0912b bVar = (C0912b) super.getAdapter();
        if (bVar == null) {
            return null;
        }
        return bVar.f3177a;
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f3172f);
    }

    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !mo3452a()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    /* renamed from: a */
    public final boolean mo3452a() {
        if (this.f3172f == 1) {
            return true;
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public DmtRtlViewPager(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo3451a(C0935e eVar) {
        C0913c cVar = new C0913c(eVar);
        this.f3173g.put(eVar, cVar);
        super.mo3451a((C0935e) cVar);
    }

    /* renamed from: b */
    public final void mo3453b(C0935e eVar) {
        super.mo3453b((C0935e) this.f3173g.get(eVar));
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C0912b(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setOnPageChangeListener(C0935e eVar) {
        super.setOnPageChangeListener(new C0913c(eVar));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f3172f = savedState.f3175b;
        super.onRestoreInstanceState(savedState.f3174a);
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
        if (adapter != null && mo3452a()) {
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
        if (i3 != this.f3172f) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f3172f = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public DmtRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo3450a(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo3452a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.mo3450a(i, z);
    }

    /* access modifiers changed from: protected */
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
}
