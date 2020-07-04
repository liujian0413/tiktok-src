package android.support.p029v7.widget;

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

/* renamed from: android.support.v7.widget.SnapHelper */
public abstract class SnapHelper extends C1279k {

    /* renamed from: a */
    RecyclerView f5113a;

    /* renamed from: b */
    private Scroller f5114b;

    /* renamed from: c */
    private final C1281m f5115c = new C1281m() {

        /* renamed from: a */
        boolean f5116a;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f5116a) {
                this.f5116a = false;
                SnapHelper.this.mo6006a();
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f5116a = true;
            }
        }
    };

    /* renamed from: a */
    public abstract int mo5474a(C1273i iVar, int i, int i2);

    /* renamed from: a */
    public abstract View mo5475a(C1273i iVar);

    /* renamed from: a */
    public abstract int[] mo5476a(C1273i iVar, View view);

    /* renamed from: c */
    private void m6356c() {
        this.f5113a.mo5545b(this.f5115c);
        this.f5113a.setOnFlingListener(null);
    }

    /* renamed from: b */
    private void m6353b() throws IllegalStateException {
        if (this.f5113a.getOnFlingListener() == null) {
            this.f5113a.mo5528a(this.f5115c);
            this.f5113a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6006a() {
        if (this.f5113a != null) {
            C1273i layoutManager = this.f5113a.getLayoutManager();
            if (layoutManager != null) {
                View a = mo5475a(layoutManager);
                if (a != null) {
                    int[] a2 = mo5476a(layoutManager, a);
                    if (!(a2[0] == 0 && a2[1] == 0)) {
                        this.f5113a.mo5521a(a2[0], a2[1]);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private C1287r m6355c(C1273i iVar) {
        return mo5517b(iVar);
    }

    /* renamed from: a */
    public final void mo6007a(RecyclerView recyclerView) throws IllegalStateException {
        if (this.f5113a != recyclerView) {
            if (this.f5113a != null) {
                m6356c();
            }
            this.f5113a = recyclerView;
            if (this.f5113a != null) {
                m6353b();
                this.f5114b = new Scroller(this.f5113a.getContext(), new DecelerateInterpolator());
                mo6006a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LinearSmoothScroller mo5517b(C1273i iVar) {
        if (!(iVar instanceof C1289b)) {
            return null;
        }
        return new LinearSmoothScroller(this.f5113a.getContext()) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final float mo5464a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo5470a(View view, C1290s sVar, C1288a aVar) {
                if (SnapHelper.this.f5113a != null) {
                    int[] a = SnapHelper.this.mo5476a(SnapHelper.this.f5113a.getLayoutManager(), view);
                    int i = a[0];
                    int i2 = a[1];
                    int a2 = mo5465a(Math.max(Math.abs(i), Math.abs(i2)));
                    if (a2 > 0) {
                        aVar.mo5864a(i, i2, a2, this.f4784b);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public final boolean mo5816a(int i, int i2) {
        C1273i layoutManager = this.f5113a.getLayoutManager();
        if (layoutManager == null || this.f5113a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f5113a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m6354b(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int[] mo6008b(int i, int i2) {
        this.f5114b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f5114b.getFinalX(), this.f5114b.getFinalY()};
    }

    /* renamed from: b */
    private boolean m6354b(C1273i iVar, int i, int i2) {
        if (!(iVar instanceof C1289b)) {
            return false;
        }
        C1287r c = m6355c(iVar);
        if (c == null) {
            return false;
        }
        int a = mo5474a(iVar, i, i2);
        if (a == -1) {
            return false;
        }
        c.f4993g = a;
        iVar.mo5755a(c);
        return true;
    }
}
