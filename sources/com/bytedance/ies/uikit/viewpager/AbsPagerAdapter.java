package com.bytedance.ies.uikit.viewpager;

import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

public abstract class AbsPagerAdapter extends PagerAdapter {

    /* renamed from: a */
    protected final LinkedList<View> f30118a = new LinkedList<>();

    /* renamed from: b */
    protected final LayoutInflater f30119b;

    /* renamed from: c */
    protected final Context f30120c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo26999a(int i, View view, ViewGroup viewGroup);

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public AbsPagerAdapter(Context context, LayoutInflater layoutInflater) {
        this.f30119b = layoutInflater;
        this.f30120c = context;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        if (!this.f30118a.isEmpty()) {
            view = (View) this.f30118a.removeFirst();
        } else {
            view = null;
        }
        View a = mo26999a(i, view, viewGroup);
        viewGroup.addView(a);
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.f30118a.add(view);
        }
    }
}
