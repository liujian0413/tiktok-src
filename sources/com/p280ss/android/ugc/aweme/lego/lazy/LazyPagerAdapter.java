package com.p280ss.android.ugc.aweme.lego.lazy;

import android.support.p022v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.lego.lazy.LazyPagerAdapter */
public abstract class LazyPagerAdapter<T> extends PagerAdapter {

    /* renamed from: b */
    protected SparseArray<T> f84444b = new SparseArray<>();

    /* renamed from: c */
    protected T f84445c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo67894b(ViewGroup viewGroup, int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo67985c(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public boolean mo67893a(int i) {
        if (this.f84444b.get(i) != null) {
            return true;
        }
        return false;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f84445c = mo67894b(viewGroup, i);
    }
}
