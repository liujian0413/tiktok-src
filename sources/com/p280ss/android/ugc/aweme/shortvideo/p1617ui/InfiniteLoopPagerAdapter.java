package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.InfiniteLoopPagerAdapter */
public class InfiniteLoopPagerAdapter extends PagerAdapter {

    /* renamed from: a */
    static Field f107072a;

    /* renamed from: b */
    PagerAdapter f107073b;

    /* renamed from: c */
    public boolean f107074c = true;

    public int getItemPosition(Object obj) {
        return -2;
    }

    /* renamed from: c */
    public final int mo101622c() {
        return this.f107073b.getCount();
    }

    public void notifyDataSetChanged() {
        this.f107073b.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        return this.f107073b.saveState();
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f107072a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private void mo88763a() {
        try {
            DataSetObserver dataSetObserver = (DataSetObserver) f107072a.get(this.f107073b);
            if (((DataSetObserver) f107072a.get(this)) == null && dataSetObserver != null) {
                f107072a.set(this.f107073b, null);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public final int getCount() {
        try {
            f107072a.set(this.f107073b, (DataSetObserver) f107072a.get(this));
            if (!this.f107074c || mo101622c() == 1) {
                return mo101622c();
            }
            return Integer.MAX_VALUE;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void finishUpdate(View view) {
        this.f107073b.finishUpdate(view);
    }

    public CharSequence getPageTitle(int i) {
        return this.f107073b.getPageTitle(i);
    }

    public float getPageWidth(int i) {
        return this.f107073b.getPageWidth(i);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f107073b.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f107073b.unregisterDataSetObserver(dataSetObserver);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        this.f107073b.finishUpdate(viewGroup);
    }

    public void startUpdate(View view) {
        mo88763a();
        this.f107073b.startUpdate(view);
    }

    public InfiniteLoopPagerAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            this.f107073b = pagerAdapter;
            return;
        }
        throw new NullPointerException();
    }

    public void startUpdate(ViewGroup viewGroup) {
        mo88763a();
        this.f107073b.startUpdate(viewGroup);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return this.f107073b.isViewFromObject(view, obj);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f107073b.restoreState(parcelable, classLoader);
    }

    public Object instantiateItem(View view, int i) {
        int count = this.f107073b.getCount();
        if (count == 0) {
            return null;
        }
        return this.f107073b.instantiateItem(view, i % count);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        int count = this.f107073b.getCount();
        if (count == 0) {
            return null;
        }
        return this.f107073b.instantiateItem(viewGroup, i % count);
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        this.f107073b.setPrimaryItem(view, i, obj);
    }

    public void destroyItem(View view, int i, Object obj) {
        int count = this.f107073b.getCount();
        if (count != 0) {
            this.f107073b.destroyItem(view, i / count, obj);
        }
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f107073b.setPrimaryItem(viewGroup, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        int count = this.f107073b.getCount();
        if (count != 0) {
            this.f107073b.destroyItem(viewGroup, i / count, obj);
        }
    }
}
