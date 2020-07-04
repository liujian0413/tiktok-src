package com.p280ss.android.ugc.aweme.discover.base;

import android.support.p029v7.widget.RecyclerView.C1264c;

/* renamed from: com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper$mInnerObserver$1 */
public final class HeaderAndFooterWrapper$mInnerObserver$1 extends C1264c {

    /* renamed from: a */
    final /* synthetic */ HeaderAndFooterWrapper f70119a;

    /* renamed from: a */
    public final void mo5721a() {
        this.f70119a.notifyDataSetChanged();
    }

    HeaderAndFooterWrapper$mInnerObserver$1(HeaderAndFooterWrapper headerAndFooterWrapper) {
        this.f70119a = headerAndFooterWrapper;
    }

    /* renamed from: a */
    public final void mo5722a(int i, int i2) {
        this.f70119a.notifyItemRangeChanged(this.f70119a.mo68256a() + i, i2);
    }

    /* renamed from: b */
    public final void mo5725b(int i, int i2) {
        this.f70119a.notifyItemRangeInserted(this.f70119a.mo68256a() + i, i2);
    }

    /* renamed from: c */
    public final void mo5726c(int i, int i2) {
        this.f70119a.notifyItemRangeRemoved(this.f70119a.mo68256a() + i, i2);
    }

    /* renamed from: a */
    public final void mo5723a(int i, int i2, int i3) {
        this.f70119a.notifyItemMoved(this.f70119a.mo68256a() + i, this.f70119a.mo68256a() + i2);
    }

    /* renamed from: a */
    public final void mo5724a(int i, int i2, Object obj) {
        this.f70119a.notifyItemRangeChanged(this.f70119a.mo68256a() + i, i2, obj);
    }
}
