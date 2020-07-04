package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.base.ui.RtlCompatViewPager */
public class RtlCompatViewPager extends ViewPager {

    /* renamed from: a */
    private final boolean f61805a;

    /* renamed from: b */
    private int f61806b;

    /* renamed from: c */
    private C23431b f61807c;

    /* renamed from: d */
    private ArrayMap<C0935e, C23430a> f61808d = new ArrayMap<>();

    /* renamed from: com.ss.android.ugc.aweme.base.ui.RtlCompatViewPager$a */
    class C23430a implements C0935e {

        /* renamed from: a */
        C0935e f61809a;

        public final void onPageScrollStateChanged(int i) {
            if (this.f61809a != null) {
                this.f61809a.onPageScrollStateChanged(i);
            }
        }

        public final void onPageSelected(int i) {
            if (this.f61809a != null) {
                this.f61809a.onPageSelected(RtlCompatViewPager.this.mo61019a(i));
            }
        }

        C23430a(C0935e eVar) {
            this.f61809a = eVar;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (this.f61809a != null) {
                int a = RtlCompatViewPager.this.mo61019a(i);
                if (RtlCompatViewPager.this.mo61020a()) {
                    float f2 = ((float) a) - f;
                    int i3 = (int) f2;
                    int i4 = i3;
                    f = f2 - ((float) i3);
                    a = i4;
                }
                this.f61809a.onPageScrolled(a, f, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.RtlCompatViewPager$b */
    static class C23431b extends PagerAdapter {

        /* renamed from: a */
        PagerAdapter f61811a;

        /* renamed from: b */
        private DataSetObserver f61812b = new DataSetObserver() {
            public final void onInvalidated() {
                onChanged();
            }

            public final void onChanged() {
                C23431b.super.notifyDataSetChanged();
            }
        };

        public final int getCount() {
            return this.f61811a.getCount();
        }

        public final void notifyDataSetChanged() {
            this.f61811a.notifyDataSetChanged();
        }

        public final Parcelable saveState() {
            return this.f61811a.saveState();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo61022a() {
            try {
                this.f61811a.unregisterDataSetObserver(this.f61812b);
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        private int m76878a(int i) {
            return (getCount() - i) - 1;
        }

        public final void finishUpdate(ViewGroup viewGroup) {
            this.f61811a.finishUpdate(viewGroup);
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            try {
                this.f61811a.registerDataSetObserver(dataSetObserver);
            } catch (Throwable unused) {
            }
        }

        public final void startUpdate(ViewGroup viewGroup) {
            this.f61811a.startUpdate(viewGroup);
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            try {
                this.f61811a.unregisterDataSetObserver(dataSetObserver);
            } catch (Throwable unused) {
            }
        }

        public final CharSequence getPageTitle(int i) {
            return this.f61811a.getPageTitle(m76878a(i));
        }

        public final float getPageWidth(int i) {
            return this.f61811a.getPageWidth(m76878a(i));
        }

        C23431b(PagerAdapter pagerAdapter) {
            this.f61811a = pagerAdapter;
            pagerAdapter.registerDataSetObserver(this.f61812b);
        }

        public final int getItemPosition(Object obj) {
            int itemPosition = this.f61811a.getItemPosition(obj);
            if (itemPosition == -1 || itemPosition == -2) {
                return itemPosition;
            }
            return m76878a(itemPosition);
        }

        public final boolean isViewFromObject(View view, Object obj) {
            return this.f61811a.isViewFromObject(view, obj);
        }

        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            this.f61811a.restoreState(parcelable, classLoader);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            return this.f61811a.instantiateItem(viewGroup, m76878a(i));
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            this.f61811a.destroyItem(viewGroup, m76878a(i), obj);
        }

        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            this.f61811a.setPrimaryItem(viewGroup, m76878a(i), obj);
        }
    }

    public void setOnPageChangeListener(C0935e eVar) {
    }

    public int getCurrentItem() {
        return super.getCurrentItem();
    }

    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.f61808d.clear();
    }

    public PagerAdapter getAdapter() {
        PagerAdapter adapter = super.getAdapter();
        if (adapter instanceof C23431b) {
            return ((C23431b) adapter).f61811a;
        }
        return adapter;
    }

    public int getCurrentItemCompat() {
        return mo61019a(getCurrentItem());
    }

    /* renamed from: a */
    public final boolean mo61020a() {
        if (this.f61806b == 1) {
            return false;
        }
        if (this.f61805a || this.f61806b == 2) {
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

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setCurrentItem(int i) {
        super.setCurrentItem(mo61019a(i));
    }

    public void addOnPageChangeListener(C0935e eVar) {
        C23430a aVar = new C23430a(eVar);
        this.f61808d.put(eVar, aVar);
        super.addOnPageChangeListener(aVar);
    }

    public void removeOnPageChangeListener(C0935e eVar) {
        C0935e eVar2 = (C0935e) this.f61808d.remove(eVar);
        if (eVar2 != null) {
            super.removeOnPageChangeListener(eVar2);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        m76874a(pagerAdapter);
        if (mo61020a()) {
            setCurrentItem(0, false);
        }
    }

    public RtlCompatViewPager(Context context) {
        super(context);
        this.f61805a = m76875a(context);
    }

    /* renamed from: a */
    private static boolean m76875a(Context context) {
        if (VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m76874a(PagerAdapter pagerAdapter) {
        if (this.f61807c != null) {
            this.f61807c.mo61022a();
            this.f61807c = null;
        }
        if (mo61020a() && pagerAdapter != null) {
            this.f61807c = new C23431b(pagerAdapter);
            pagerAdapter = this.f61807c;
        }
        super.setAdapter(pagerAdapter);
    }

    /* renamed from: a */
    public final int mo61019a(int i) {
        int i2;
        if (!mo61020a()) {
            return i;
        }
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            i2 = 0;
        } else {
            i2 = adapter.getCount();
        }
        if (i < 0 || i >= i2) {
            return i;
        }
        return (i2 - i) - 1;
    }

    public void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(mo61019a(i), z);
    }

    public RtlCompatViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61805a = m76875a(context);
    }
}
