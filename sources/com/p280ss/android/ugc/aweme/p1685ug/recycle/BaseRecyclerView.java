package com.p280ss.android.ugc.aweme.p1685ug.recycle;

import android.support.p029v7.widget.RecyclerView;

/* renamed from: com.ss.android.ugc.aweme.ug.recycle.BaseRecyclerView */
public class BaseRecyclerView extends RecyclerView {

    /* renamed from: M */
    private boolean f111048M;

    public void onAttachedToWindow() {
        if (this.f111048M) {
            if (getItemAnimator() != null) {
                getItemAnimator().f4940i = 0;
                getItemAnimator().f4943l = 0;
                getItemAnimator().f4942k = 0;
                getItemAnimator().f4941j = 0;
            }
            setRecycledViewPool(GlobalRVPool.m135664d());
        }
        super.onAttachedToWindow();
    }

    public void setEnableRecycle(boolean z) {
        this.f111048M = z;
        if (!z) {
            GlobalRVPool.m135664d().mo104349e();
        }
    }
}
