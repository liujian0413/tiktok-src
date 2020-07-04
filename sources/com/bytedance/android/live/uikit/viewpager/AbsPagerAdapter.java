package com.bytedance.android.live.uikit.viewpager;

import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

public abstract class AbsPagerAdapter extends PagerAdapter {

    /* renamed from: b */
    protected final LinkedList<View> f10760b = new LinkedList<>();

    /* renamed from: c */
    protected final LayoutInflater f10761c;

    /* renamed from: d */
    protected final Context f10762d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo9423a(int i, View view, ViewGroup viewGroup);

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public AbsPagerAdapter(Context context, LayoutInflater layoutInflater) {
        this.f10761c = layoutInflater;
        this.f10762d = context;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        if (!this.f10760b.isEmpty()) {
            view = (View) this.f10760b.removeFirst();
        } else {
            view = null;
        }
        View a = mo9423a(i, view, viewGroup);
        viewGroup.addView(a);
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.f10760b.add(view);
        }
    }
}
