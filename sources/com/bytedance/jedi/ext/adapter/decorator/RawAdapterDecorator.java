package com.bytedance.jedi.ext.adapter.decorator;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.decorator.internal.C11689d;
import com.bytedance.jedi.ext.adapter.decorator.internal.C11690e;
import com.bytedance.jedi.ext.adapter.decorator.internal.C11691f;
import com.bytedance.jedi.ext.adapter.decorator.internal.C11692g;
import com.bytedance.jedi.ext.adapter.decorator.internal.C11695i;
import com.bytedance.jedi.ext.adapter.decorator.internal.C11699j;
import com.bytedance.jedi.ext.adapter.decorator.internal.PullUpToLoadMoreDelegate;
import java.util.List;
import kotlin.jvm.internal.C7573i;

public class RawAdapterDecorator extends C1262a<C1293v> {

    /* renamed from: a */
    public final C1262a<C1293v> f31381a;

    /* renamed from: b */
    private final C11692g f31382b;

    /* renamed from: c */
    private final C11691f f31383c;

    /* renamed from: d */
    private final C11695i f31384d;

    /* renamed from: e */
    private final C11690e f31385e;

    /* renamed from: f */
    private final PullUpToLoadMoreDelegate f31386f;

    /* renamed from: g */
    private final C11689d[] f31387g;

    /* renamed from: h */
    private final C11699j f31388h;

    /* renamed from: i */
    private boolean f31389i;

    /* renamed from: j */
    private final RawAdapterDecorator$mappingDataObserver$1 f31390j;

    /* renamed from: a */
    public static boolean m34223a(int i) {
        return 15990784 <= i && 16252928 >= i;
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
    }

    /* renamed from: b */
    private final int m34224b() {
        return this.f31383c.mo29249d();
    }

    /* renamed from: c */
    private final int m34226c() {
        return this.f31384d.mo29249d();
    }

    /* renamed from: d */
    private final int m34227d() {
        return this.f31381a.getItemCount();
    }

    /* renamed from: a */
    public final int mo29233a() {
        return this.f31382b.mo29249d();
    }

    /* renamed from: e */
    private final void m34228e() {
        if (!this.f31389i) {
            RecyclerView recyclerView = this.f31388h.f31436a;
            if (recyclerView != null) {
                C1273i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    C7573i.m23582a((Object) layoutManager, "recyclerView.layoutManager ?: return");
                    this.f31389i = true;
                    if (layoutManager instanceof GridLayoutManager) {
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                        gridLayoutManager.f4721g = new RawAdapterDecorator$tryAttachToRecyclerViewIfLayoutManagerSet$1(this, layoutManager, gridLayoutManager.f4721g);
                    }
                    this.f31386f.mo29237a(recyclerView);
                }
            }
        }
    }

    public int getItemCount() {
        if (m34227d() == 0) {
            return this.f31385e.mo29249d();
        }
        return m34227d() + mo29233a() + m34224b() + m34226c();
    }

    /* renamed from: b */
    private final void m34225b(int i) {
        if (m34226c() != 0 && i == getItemCount() - 2) {
            this.f31384d.mo29255h();
        }
    }

    public long getItemId(int i) {
        if (m34223a(getItemViewType(i))) {
            return super.getItemId(i);
        }
        return this.f31381a.getItemId(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f31388h.mo29258a(recyclerView);
        m34228e();
        this.f31381a.onAttachedToRecyclerView(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f31388h.mo29259b(recyclerView);
        if (this.f31389i) {
            this.f31386f.mo29238b(recyclerView);
        }
        this.f31389i = false;
        this.f31381a.onDetachedFromRecyclerView(recyclerView);
    }

    public boolean onFailedToRecycleView(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        if (m34223a(vVar.mItemViewType)) {
            return super.onFailedToRecycleView(vVar);
        }
        return this.f31381a.onFailedToRecycleView(vVar);
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        if (m34223a(vVar.mItemViewType)) {
            super.onViewDetachedFromWindow(vVar);
        } else {
            this.f31381a.onViewDetachedFromWindow(vVar);
        }
    }

    public void onViewRecycled(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        if (m34223a(vVar.mItemViewType)) {
            super.onViewRecycled(vVar);
        } else {
            this.f31381a.onViewRecycled(vVar);
        }
    }

    public void registerAdapterDataObserver(C1264c cVar) {
        C7573i.m23587b(cVar, "observer");
        super.registerAdapterDataObserver(cVar);
        this.f31381a.registerAdapterDataObserver(this.f31390j);
    }

    public void unregisterAdapterDataObserver(C1264c cVar) {
        C7573i.m23587b(cVar, "observer");
        super.unregisterAdapterDataObserver(cVar);
        this.f31381a.unregisterAdapterDataObserver(this.f31390j);
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        C11689d dVar;
        boolean z;
        C7573i.m23587b(vVar, "holder");
        C11689d[] dVarArr = this.f31387g;
        int length = dVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArr[i];
            if (dVar.mo29253f() == vVar.mItemViewType) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            super.onViewAttachedToWindow(vVar);
            dVar.mo29250e();
            return;
        }
        this.f31381a.onViewAttachedToWindow(vVar);
    }

    public int getItemViewType(int i) {
        if (m34227d() == 0 && this.f31385e.mo29254g()) {
            return this.f31385e.mo29251a(i);
        }
        if (i == 0 && this.f31382b.mo29254g()) {
            return this.f31382b.mo29253f();
        }
        int d = m34227d() + mo29233a();
        if (i == d && this.f31383c.mo29254g()) {
            return this.f31383c.mo29253f();
        }
        if (i != d + m34224b() || !this.f31384d.mo29254g()) {
            return this.f31381a.getItemViewType(i - mo29233a());
        }
        return this.f31384d.mo29253f();
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C11689d dVar;
        boolean z;
        C7573i.m23587b(viewGroup, "parent");
        m34228e();
        C11689d[] dVarArr = this.f31387g;
        int length = dVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArr[i2];
            if (dVar.mo29253f() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            C1293v a = dVar.mo29252a(viewGroup);
            if (a != null) {
                return a;
            }
        }
        C1293v onCreateViewHolder = this.f31381a.onCreateViewHolder(viewGroup, i);
        C7573i.m23582a((Object) onCreateViewHolder, "realAdapter.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    public void onBindViewHolder(C1293v vVar, int i, List<Object> list) {
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list, "payloads");
        m34225b(i);
        if (!m34223a(vVar.mItemViewType)) {
            this.f31381a.onBindViewHolder(vVar, i - mo29233a(), list);
        }
    }
}
