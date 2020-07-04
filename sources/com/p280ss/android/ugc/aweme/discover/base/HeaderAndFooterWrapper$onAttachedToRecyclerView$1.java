package com.p280ss.android.ugc.aweme.discover.base;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;

/* renamed from: com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper$onAttachedToRecyclerView$1 */
public final class HeaderAndFooterWrapper$onAttachedToRecyclerView$1 extends C1241a {

    /* renamed from: c */
    final /* synthetic */ HeaderAndFooterWrapper f70120c;

    /* renamed from: d */
    final /* synthetic */ GridLayoutManager f70121d;

    /* renamed from: e */
    final /* synthetic */ C1241a f70122e;

    /* renamed from: a */
    public final int mo5386a(int i) {
        if (this.f70120c.mo68259a(this.f70120c.getItemViewType(i))) {
            GridLayoutManager gridLayoutManager = this.f70121d;
            if (gridLayoutManager != null) {
                return gridLayoutManager.f4716b;
            }
        } else if (this.f70122e != null) {
            return this.f70122e.mo5386a(i - this.f70120c.mo68256a());
        }
        return 1;
    }

    HeaderAndFooterWrapper$onAttachedToRecyclerView$1(HeaderAndFooterWrapper headerAndFooterWrapper, GridLayoutManager gridLayoutManager, C1241a aVar) {
        this.f70120c = headerAndFooterWrapper;
        this.f70121d = gridLayoutManager;
        this.f70122e = aVar;
    }
}
