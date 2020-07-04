package com.p280ss.android.ugc.aweme.account.base.widget;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.BaseRecyclerView */
public class BaseRecyclerView extends RecyclerView {

    /* renamed from: M */
    private List<Object> f56711M;

    public int getEndItemIndex() {
        if (!m71214n()) {
            return getAdapter().getItemCount() - 1;
        }
        return 0;
    }

    public int getFirstPosition() {
        if (getChildCount() <= 0) {
            return -1;
        }
        return m5892f(getChildAt(0));
    }

    public int getLastPosition() {
        if (getChildCount() <= 0) {
            return -1;
        }
        return m5892f(getChildAt(getChildCount() - 1));
    }

    public int getStartItemIndex() {
        if (!m71214n()) {
            return 0;
        }
        return getAdapter().getItemCount() - 1;
    }

    /* renamed from: n */
    private boolean m71214n() {
        if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) getLayoutManager()).f5128f;
        }
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).f4749k;
        }
        return false;
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.f56711M != null) {
            Iterator it = this.f56711M.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
