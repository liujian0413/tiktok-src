package com.bytedance.jedi.ext.adapter.decorator;

import android.support.p029v7.widget.RecyclerView.C1264c;

public final class RawAdapterDecorator$mappingDataObserver$1 extends C1264c {

    /* renamed from: a */
    final /* synthetic */ RawAdapterDecorator f31391a;

    /* renamed from: a */
    public final void mo5721a() {
        this.f31391a.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo5722a(int i, int i2) {
        mo5724a(i, i2, (Object) null);
    }

    /* renamed from: b */
    public final void mo5725b(int i, int i2) {
        RawAdapterDecorator rawAdapterDecorator = this.f31391a;
        rawAdapterDecorator.notifyItemRangeInserted(i + rawAdapterDecorator.mo29233a(), i2);
    }

    /* renamed from: c */
    public final void mo5726c(int i, int i2) {
        RawAdapterDecorator rawAdapterDecorator = this.f31391a;
        rawAdapterDecorator.notifyItemRangeRemoved(i + rawAdapterDecorator.mo29233a(), i2);
    }

    /* renamed from: a */
    public final void mo5723a(int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            RawAdapterDecorator rawAdapterDecorator = this.f31391a;
            rawAdapterDecorator.notifyItemMoved(rawAdapterDecorator.mo29233a() + i + i4, this.f31391a.mo29233a() + i2 + i4);
        }
    }

    /* renamed from: a */
    public final void mo5724a(int i, int i2, Object obj) {
        RawAdapterDecorator rawAdapterDecorator = this.f31391a;
        rawAdapterDecorator.notifyItemRangeChanged(i + rawAdapterDecorator.mo29233a(), i2, obj);
    }
}
