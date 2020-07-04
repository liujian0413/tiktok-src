package com.bytedance.android.livesdk.widget.pager;

import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1279k;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1287r.C1288a;
import android.support.p029v7.widget.RecyclerView.C1287r.C1289b;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public abstract class SnapHelper extends C1279k {

    /* renamed from: a */
    private Scroller f25441a;

    /* renamed from: b */
    protected RecyclerView f25442b;

    /* renamed from: c */
    private final C1281m f25443c = new C1281m() {

        /* renamed from: a */
        boolean f25444a;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f25444a) {
                SnapHelper.this.mo22747a();
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f25444a = true;
            }
        }
    };

    /* renamed from: a */
    public abstract int mo20744a(C1273i iVar, int i, int i2);

    /* renamed from: a */
    public abstract View mo20745a(C1273i iVar);

    /* renamed from: a */
    public abstract int[] mo22744a(C1273i iVar, View view);

    /* renamed from: c */
    private void m27575c() {
        this.f25442b.mo5545b(this.f25443c);
        this.f25442b.setOnFlingListener(null);
    }

    /* renamed from: b */
    private void m27573b() throws IllegalStateException {
        if (this.f25442b.getOnFlingListener() == null) {
            this.f25442b.mo5528a(this.f25443c);
            this.f25442b.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo22747a() {
        if (this.f25442b != null) {
            C1273i layoutManager = this.f25442b.getLayoutManager();
            if (layoutManager != null) {
                View a = mo20745a(layoutManager);
                if (a != null) {
                    int[] a2 = mo22744a(layoutManager, a);
                    if (!(a2[0] == 0 && a2[1] == 0)) {
                        this.f25442b.mo5521a(a2[0], a2[1]);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo22748a(RecyclerView recyclerView) throws IllegalStateException {
        if (this.f25442b != recyclerView) {
            if (this.f25442b != null) {
                m27575c();
            }
            this.f25442b = recyclerView;
            if (this.f25442b != null) {
                m27573b();
                this.f25441a = new Scroller(this.f25442b.getContext(), new DecelerateInterpolator());
                mo22747a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LinearSmoothScroller mo22745b(C1273i iVar) {
        if (!(iVar instanceof C1289b)) {
            return null;
        }
        return new LinearSmoothScroller(this.f25442b.getContext()) {
            /* renamed from: a */
            public final float mo5464a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* renamed from: a */
            public final void mo5470a(View view, C1290s sVar, C1288a aVar) {
                int[] a = SnapHelper.this.mo22744a(SnapHelper.this.f25442b.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int a2 = mo5465a(Math.max(Math.abs(i), Math.abs(i2)));
                if (a2 > 0) {
                    aVar.mo5864a(i, i2, a2, this.f4784b);
                }
            }
        };
    }

    /* renamed from: a */
    public final boolean mo5816a(int i, int i2) {
        C1273i layoutManager = this.f25442b.getLayoutManager();
        if (layoutManager == null || this.f25442b.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f25442b.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m27574b(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m27574b(C1273i iVar, int i, int i2) {
        if (!(iVar instanceof C1289b)) {
            return false;
        }
        LinearSmoothScroller b = mo22745b(iVar);
        if (b == null) {
            return false;
        }
        int a = mo20744a(iVar, i, i2);
        if (a == -1) {
            return false;
        }
        b.f4993g = a;
        iVar.mo5755a((C1287r) b);
        return true;
    }
}
