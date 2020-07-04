package com.p280ss.android.ugc.aweme.views;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.views.DelegatingFragmentPagerAdapter */
public class DelegatingFragmentPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    public final PagerAdapter f112227a;

    /* renamed from: com.ss.android.ugc.aweme.views.DelegatingFragmentPagerAdapter$a */
    static class C43340a extends DataSetObserver {

        /* renamed from: a */
        final DelegatingFragmentPagerAdapter f112228a;

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            if (this.f112228a != null) {
                this.f112228a.mo105167a();
            }
        }

        private C43340a(DelegatingFragmentPagerAdapter delegatingFragmentPagerAdapter) {
            this.f112228a = delegatingFragmentPagerAdapter;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo105167a() {
        super.notifyDataSetChanged();
    }

    public int getCount() {
        return this.f112227a.getCount();
    }

    public void notifyDataSetChanged() {
        this.f112227a.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        return this.f112227a.saveState();
    }

    public void finishUpdate(View view) {
        this.f112227a.finishUpdate(view);
    }

    public int getItemPosition(Object obj) {
        return this.f112227a.getItemPosition(obj);
    }

    public CharSequence getPageTitle(int i) {
        return this.f112227a.getPageTitle(i);
    }

    public float getPageWidth(int i) {
        return this.f112227a.getPageWidth(i);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f112227a.registerDataSetObserver(dataSetObserver);
    }

    public void startUpdate(View view) {
        this.f112227a.startUpdate(view);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f112227a.unregisterDataSetObserver(dataSetObserver);
    }

    public DelegatingFragmentPagerAdapter(PagerAdapter pagerAdapter) {
        super(null);
        this.f112227a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C43340a());
    }

    /* renamed from: a */
    public Fragment mo2423a(int i) {
        return ((FragmentPagerAdapter) this.f112227a).mo2423a(i);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        this.f112227a.finishUpdate(viewGroup);
    }

    public void startUpdate(ViewGroup viewGroup) {
        this.f112227a.startUpdate(viewGroup);
    }

    public Object instantiateItem(View view, int i) {
        return this.f112227a.instantiateItem(view, i);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return this.f112227a.isViewFromObject(view, obj);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f112227a.restoreState(parcelable, classLoader);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f112227a.instantiateItem(viewGroup, i);
    }

    public void destroyItem(View view, int i, Object obj) {
        this.f112227a.destroyItem(view, i, obj);
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        this.f112227a.setPrimaryItem(view, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f112227a.destroyItem(viewGroup, i, obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f112227a.setPrimaryItem(viewGroup, i, obj);
    }
}
