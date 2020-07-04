package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C7573i;

public final class PullUpToLoadMoreDelegate implements C1280l {

    /* renamed from: a */
    private final C11699j f31395a;

    /* renamed from: b */
    private float f31396b;

    /* renamed from: c */
    private boolean f31397c;

    /* renamed from: d */
    private int f31398d;

    /* renamed from: e */
    private boolean f31399e;

    /* renamed from: f */
    private AtomicBoolean f31400f;

    /* renamed from: g */
    private final C11695i f31401g;

    /* renamed from: a */
    public final void mo5689a(boolean z) {
    }

    /* renamed from: b */
    public final void mo5691b(RecyclerView recyclerView, MotionEvent motionEvent) {
        C7573i.m23587b(recyclerView, "view");
        C7573i.m23587b(motionEvent, "event");
    }

    /* renamed from: a */
    private RecyclerView m34240a() {
        return this.f31395a.f31436a;
    }

    /* renamed from: e */
    private final boolean m34243e(RecyclerView recyclerView) {
        if (this.f31399e) {
            return recyclerView.canScrollVertically(1);
        }
        return recyclerView.canScrollHorizontally(1);
    }

    /* renamed from: b */
    public final void mo29238b(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f31395a.mo29259b(recyclerView);
        m34242d(recyclerView);
    }

    /* renamed from: c */
    private void m34241c(RecyclerView recyclerView) {
        if (!this.f31400f.get()) {
            recyclerView.mo5527a((C1280l) this);
            this.f31400f.set(true);
        }
    }

    /* renamed from: d */
    private void m34242d(RecyclerView recyclerView) {
        if (this.f31400f.get()) {
            recyclerView.mo5544b((C1280l) this);
            this.f31400f.set(false);
        }
    }

    /* renamed from: a */
    public final void mo29237a(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f31395a.mo29258a(recyclerView);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(recyclerView.getContext());
        C7573i.m23582a((Object) viewConfiguration, "ViewConfiguration.get(recyclerView.context)");
        this.f31398d = viewConfiguration.getScaledTouchSlop();
        C1273i layoutManager = recyclerView.getLayoutManager();
        boolean z = false;
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).f4747i == 1) {
                z = true;
            }
            this.f31399e = z;
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            if (((StaggeredGridLayoutManager) layoutManager).f5127e == 1) {
                z = true;
            }
            this.f31399e = z;
        }
        if (this.f31401g.f31428e == 243) {
            m34241c(recyclerView);
        }
    }

    /* renamed from: a */
    public final boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent) {
        C7573i.m23587b(recyclerView, "view");
        C7573i.m23587b(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f31396b = motionEvent.getY();
            this.f31397c = true;
        }
        RecyclerView a = m34240a();
        if (a != null && this.f31397c && this.f31396b - motionEvent.getY() > ((float) this.f31398d) && !m34243e(a)) {
            this.f31401g.mo29256i();
            this.f31397c = false;
        }
        return false;
    }
}
