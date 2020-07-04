package com.bytedance.ies.uikit.rtl;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class DelegatingPagerAdapter extends PagerAdapter {

    /* renamed from: a */
    public final PagerAdapter f30045a;

    /* renamed from: com.bytedance.ies.uikit.rtl.DelegatingPagerAdapter$a */
    static class C11062a extends DataSetObserver {

        /* renamed from: a */
        final DelegatingPagerAdapter f30046a;

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            if (this.f30046a != null) {
                this.f30046a.mo26909a();
            }
        }

        private C11062a(DelegatingPagerAdapter delegatingPagerAdapter) {
            this.f30046a = delegatingPagerAdapter;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26909a() {
        super.notifyDataSetChanged();
    }

    public int getCount() {
        return this.f30045a.getCount();
    }

    public void notifyDataSetChanged() {
        this.f30045a.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        return this.f30045a.saveState();
    }

    public void finishUpdate(View view) {
        this.f30045a.finishUpdate(view);
    }

    public int getItemPosition(Object obj) {
        return this.f30045a.getItemPosition(obj);
    }

    public CharSequence getPageTitle(int i) {
        return this.f30045a.getPageTitle(i);
    }

    public float getPageWidth(int i) {
        return this.f30045a.getPageWidth(i);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f30045a.registerDataSetObserver(dataSetObserver);
    }

    public void startUpdate(View view) {
        this.f30045a.startUpdate(view);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f30045a.unregisterDataSetObserver(dataSetObserver);
    }

    public DelegatingPagerAdapter(PagerAdapter pagerAdapter) {
        this.f30045a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C11062a());
    }

    public void finishUpdate(ViewGroup viewGroup) {
        this.f30045a.finishUpdate(viewGroup);
    }

    public void startUpdate(ViewGroup viewGroup) {
        this.f30045a.startUpdate(viewGroup);
    }

    public Object instantiateItem(View view, int i) {
        return this.f30045a.instantiateItem(view, i);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return this.f30045a.isViewFromObject(view, obj);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f30045a.restoreState(parcelable, classLoader);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f30045a.instantiateItem(viewGroup, i);
    }

    public void destroyItem(View view, int i, Object obj) {
        this.f30045a.destroyItem(view, i, obj);
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        this.f30045a.setPrimaryItem(view, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f30045a.destroyItem(viewGroup, i, obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f30045a.setPrimaryItem(viewGroup, i, obj);
    }
}
