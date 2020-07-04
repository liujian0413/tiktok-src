package com.p280ss.android.ugc.aweme.base.p308ui;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.ui.FragmentPagerRebuildAdapter */
public abstract class FragmentPagerRebuildAdapter<T extends Fragment> extends FragmentPagerAdapter {

    /* renamed from: a */
    protected final int f61697a;

    /* renamed from: b */
    private HashMap<Integer, T> f61698b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo60937a(T t, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60938a(HashMap<Integer, T> hashMap) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo60939c(int i);

    public int getCount() {
        return this.f61697a;
    }

    public void notifyDataSetChanged() {
        if (this.f61698b != null) {
            this.f61698b.clear();
            mo60938a(this.f61698b);
        }
        super.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        Fragment c = mo60939c(i);
        if (c != null) {
            return c;
        }
        StringBuilder sb = new StringBuilder("createFragment(position=");
        sb.append(i);
        sb.append(" 没有返回Fragment实例),检查代码确保createFragment方法覆盖所有position");
        throw new UnsupportedOperationException(sb.toString());
    }

    public FragmentPagerRebuildAdapter(C0608j jVar, int i) {
        super(jVar);
        this.f61697a = i;
        this.f61698b = new LinkedHashMap(i);
        mo60938a(this.f61698b);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        Fragment fragment = (Fragment) instantiateItem;
        mo60937a(fragment, i);
        this.f61698b.put(Integer.valueOf(i), fragment);
        mo60938a(this.f61698b);
        return instantiateItem;
    }
}
