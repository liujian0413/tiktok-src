package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.LazyFragmentPagerRebuildAdapter */
public abstract class LazyFragmentPagerRebuildAdapter<T extends Fragment> extends ABLazyFragmentPagerAdapter {

    /* renamed from: a */
    private int f69538a;

    /* renamed from: d */
    private HashMap<Integer, T> f69539d = new LinkedHashMap();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Fragment mo67984c(int i);

    public int getCount() {
        return this.f69538a;
    }

    /* renamed from: a */
    public final List<T> mo67982a() {
        return new ArrayList(this.f69539d.values());
    }

    public void notifyDataSetChanged() {
        if (this.f69539d != null) {
            this.f69539d.clear();
        }
        super.notifyDataSetChanged();
    }

    /* renamed from: b */
    public final Fragment mo67983b(int i) {
        if (this.f69539d == null || this.f69539d.size() > 0) {
            return null;
        }
        return (Fragment) this.f69539d.get(Integer.valueOf(i));
    }

    public LazyFragmentPagerRebuildAdapter(C0608j jVar, int i) {
        super(jVar);
        this.f69538a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Fragment mo67985c(ViewGroup viewGroup, int i) {
        Fragment c = mo67984c(i);
        if (c != null) {
            return c;
        }
        StringBuilder sb = new StringBuilder("createFragment(position=");
        sb.append(i);
        sb.append(" 没有返回Fragment实例),检查代码确保createFragment方法覆盖所有position");
        throw new UnsupportedOperationException(sb.toString());
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        this.f69539d.put(Integer.valueOf(i), (Fragment) instantiateItem);
        return instantiateItem;
    }
}
