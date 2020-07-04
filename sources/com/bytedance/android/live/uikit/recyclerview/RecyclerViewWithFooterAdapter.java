package com.bytedance.android.live.uikit.recyclerview;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;

public abstract class RecyclerViewWithFooterAdapter extends C1262a {

    /* renamed from: b */
    public boolean f10600b = true;

    /* renamed from: a */
    public int mo10840a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract C1293v mo10819a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract C1293v mo10841a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public abstract void mo10821a(C1293v vVar);

    /* renamed from: a */
    public abstract void mo10842a(C1293v vVar, int i);

    /* renamed from: c */
    public abstract int mo10843c();

    public int getItemCount() {
        if (this.f10600b) {
            return mo10843c() + 1;
        }
        return mo10843c();
    }

    public final int getItemViewType(int i) {
        if (!this.f10600b || i != mo10843c()) {
            return mo10840a(i);
        }
        return Integer.MIN_VALUE;
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo10821a(vVar);
        } else {
            mo10842a(vVar, i);
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return mo10819a(viewGroup);
        }
        return mo10841a(viewGroup, i);
    }
}
