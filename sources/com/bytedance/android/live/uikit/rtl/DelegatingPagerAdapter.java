package com.bytedance.android.live.uikit.rtl;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class DelegatingPagerAdapter extends PagerAdapter {

    /* renamed from: a */
    public final PagerAdapter f10698a;

    /* renamed from: com.bytedance.android.live.uikit.rtl.DelegatingPagerAdapter$a */
    static class C3576a extends DataSetObserver {

        /* renamed from: a */
        final DelegatingPagerAdapter f10699a;

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            if (this.f10699a != null) {
                this.f10699a.mo10928a();
            }
        }

        private C3576a(DelegatingPagerAdapter delegatingPagerAdapter) {
            this.f10699a = delegatingPagerAdapter;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10928a() {
        super.notifyDataSetChanged();
    }

    public int getCount() {
        return this.f10698a.getCount();
    }

    public void notifyDataSetChanged() {
        this.f10698a.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        return this.f10698a.saveState();
    }

    public void finishUpdate(View view) {
        this.f10698a.finishUpdate(view);
    }

    public int getItemPosition(Object obj) {
        return this.f10698a.getItemPosition(obj);
    }

    public CharSequence getPageTitle(int i) {
        return this.f10698a.getPageTitle(i);
    }

    public float getPageWidth(int i) {
        return this.f10698a.getPageWidth(i);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f10698a.registerDataSetObserver(dataSetObserver);
    }

    public void startUpdate(View view) {
        this.f10698a.startUpdate(view);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f10698a.unregisterDataSetObserver(dataSetObserver);
    }

    public DelegatingPagerAdapter(PagerAdapter pagerAdapter) {
        this.f10698a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C3576a());
    }

    public void finishUpdate(ViewGroup viewGroup) {
        this.f10698a.finishUpdate(viewGroup);
    }

    public void startUpdate(ViewGroup viewGroup) {
        this.f10698a.startUpdate(viewGroup);
    }

    public Object instantiateItem(View view, int i) {
        return this.f10698a.instantiateItem(view, i);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return this.f10698a.isViewFromObject(view, obj);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f10698a.restoreState(parcelable, classLoader);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f10698a.instantiateItem(viewGroup, i);
    }

    public void destroyItem(View view, int i, Object obj) {
        this.f10698a.destroyItem(view, i, obj);
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        this.f10698a.setPrimaryItem(view, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f10698a.destroyItem(viewGroup, i, obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f10698a.setPrimaryItem(viewGroup, i, obj);
    }
}
