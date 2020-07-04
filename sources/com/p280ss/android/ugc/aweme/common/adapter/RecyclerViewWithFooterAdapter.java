package com.p280ss.android.ugc.aweme.common.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.common.adapter.RecyclerViewWithFooterAdapter */
public abstract class RecyclerViewWithFooterAdapter extends C1262a {

    /* renamed from: v */
    public boolean f67566v = true;

    /* renamed from: a */
    public int mo58029a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract C1293v mo58032a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public abstract void mo62313a(C1293v vVar);

    /* renamed from: a */
    public abstract void mo58033a(C1293v vVar, int i);

    /* renamed from: a_ */
    public abstract C1293v mo61886a_(ViewGroup viewGroup);

    /* renamed from: c */
    public abstract int mo60557c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo66500c(boolean z) {
    }

    public int getItemCount() {
        if (this.f67566v) {
            return mo60557c() + 1;
        }
        return mo60557c();
    }

    /* renamed from: d */
    public void mo66516d(boolean z) {
        if (z != this.f67566v) {
            this.f67566v = z;
            mo66500c(z);
        }
    }

    public final int getItemViewType(int i) {
        if (!this.f67566v || i != mo60557c()) {
            return mo58029a(i);
        }
        return Integer.MIN_VALUE;
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo62313a(vVar);
        } else {
            mo58033a(vVar, i);
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return mo61886a_(viewGroup);
        }
        return mo58032a(viewGroup, i);
    }
}
