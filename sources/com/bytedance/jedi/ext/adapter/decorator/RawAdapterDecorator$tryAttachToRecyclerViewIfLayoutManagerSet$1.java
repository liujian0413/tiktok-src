package com.bytedance.jedi.ext.adapter.decorator;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView.C1273i;

public final class RawAdapterDecorator$tryAttachToRecyclerViewIfLayoutManagerSet$1 extends C1241a {

    /* renamed from: c */
    final /* synthetic */ RawAdapterDecorator f31392c;

    /* renamed from: d */
    final /* synthetic */ C1273i f31393d;

    /* renamed from: e */
    final /* synthetic */ C1241a f31394e;

    /* renamed from: a */
    public final int mo5386a(int i) {
        if (RawAdapterDecorator.m34223a(this.f31392c.getItemViewType(i))) {
            return ((GridLayoutManager) this.f31393d).f4716b;
        }
        if (this.f31394e != null) {
            return this.f31394e.mo5386a(i - this.f31392c.mo29233a());
        }
        return 1;
    }

    RawAdapterDecorator$tryAttachToRecyclerViewIfLayoutManagerSet$1(RawAdapterDecorator rawAdapterDecorator, C1273i iVar, C1241a aVar) {
        this.f31392c = rawAdapterDecorator;
        this.f31393d = iVar;
        this.f31394e = aVar;
    }
}
