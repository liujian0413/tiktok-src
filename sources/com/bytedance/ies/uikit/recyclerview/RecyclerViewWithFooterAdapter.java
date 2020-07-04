package com.bytedance.ies.uikit.recyclerview;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;

public abstract class RecyclerViewWithFooterAdapter extends C1262a {
    protected boolean mShowFooter = true;

    public abstract int getBasicItemCount();

    public int getBasicItemViewType(int i) {
        return 0;
    }

    public abstract void onBindBasicViewHolder(C1293v vVar, int i);

    public abstract void onBindFooterViewHolder(C1293v vVar);

    public abstract C1293v onCreateBasicViewHolder(ViewGroup viewGroup, int i);

    public abstract C1293v onCreateFooterViewHolder(ViewGroup viewGroup);

    public int getItemCount() {
        if (this.mShowFooter) {
            return getBasicItemCount() + 1;
        }
        return getBasicItemCount();
    }

    public void setShowFooter(boolean z) {
        this.mShowFooter = z;
    }

    public final int getItemViewType(int i) {
        if (!this.mShowFooter || i != getBasicItemCount()) {
            return getBasicItemViewType(i);
        }
        return Integer.MIN_VALUE;
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            onBindFooterViewHolder(vVar);
        } else {
            onBindBasicViewHolder(vVar, i);
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return onCreateFooterViewHolder(viewGroup);
        }
        return onCreateBasicViewHolder(viewGroup, i);
    }
}
