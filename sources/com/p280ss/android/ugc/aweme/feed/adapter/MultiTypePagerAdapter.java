package com.p280ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.MultiTypePagerAdapter */
public abstract class MultiTypePagerAdapter extends PagerAdapter {

    /* renamed from: h */
    protected final LinkedList<View>[] f74002h;

    /* renamed from: i */
    protected final LayoutInflater f74003i;

    /* renamed from: j */
    protected final Context f74004j;

    /* renamed from: k */
    public final int f74005k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo64963a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo64964a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo64965a(int i, View view, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo71594b(View view) {
    }

    /* renamed from: c */
    public void mo71597c(View view) {
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: b */
    private int mo67568b(int i) {
        int a = mo64963a(i);
        if (a >= 0 && a < this.f74005k) {
            return a;
        }
        StringBuilder sb = new StringBuilder("getItemViewType must return a number which is form 0 to ");
        sb.append(this.f74005k - 1);
        C6921a.m21554a(new Exception(sb.toString()));
        return 0;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        int b = mo67568b(i);
        if (!this.f74002h[b].isEmpty()) {
            view = (View) this.f74002h[b].removeFirst();
        } else {
            view = null;
        }
        View a = mo64965a(i, view, viewGroup);
        if (a.getParent() != null) {
            try {
                ((ViewGroup) a.getParent()).removeView(a);
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
        if (a.getParent() != viewGroup) {
            viewGroup.addView(a);
        }
        mo71594b(a);
        return a;
    }

    public MultiTypePagerAdapter(Context context, LayoutInflater layoutInflater, int i) {
        this.f74003i = layoutInflater;
        this.f74004j = context;
        this.f74005k = i;
        LinkedList<View>[] linkedListArr = new LinkedList[i];
        for (int i2 = 0; i2 < i; i2++) {
            linkedListArr[i2] = new LinkedList<>();
        }
        this.f74002h = linkedListArr;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            try {
                viewGroup.removeView(view);
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
            this.f74002h[mo64964a(view)].add(view);
            mo71597c(view);
        }
    }
}
