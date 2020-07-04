package android.support.p029v7.widget;

import android.graphics.PointF;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1287r.C1288a;
import android.support.p029v7.widget.RecyclerView.C1287r.C1289b;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: android.support.v7.widget.PagerSnapHelper */
public class PagerSnapHelper extends SnapHelper {

    /* renamed from: b */
    private C1343ah f4841b;

    /* renamed from: c */
    private C1343ah f4842c;

    /* renamed from: c */
    private C1343ah m5835c(C1273i iVar) {
        if (this.f4841b == null || this.f4841b.f5248a != iVar) {
            this.f4841b = C1343ah.m6626b(iVar);
        }
        return this.f4841b;
    }

    /* renamed from: d */
    private C1343ah m5836d(C1273i iVar) {
        if (this.f4842c == null || this.f4842c.f5248a != iVar) {
            this.f4842c = C1343ah.m6624a(iVar);
        }
        return this.f4842c;
    }

    /* renamed from: a */
    public final View mo5475a(C1273i iVar) {
        if (iVar.mo5441f()) {
            return m5833a(iVar, m5835c(iVar));
        }
        if (iVar.mo5438e()) {
            return m5833a(iVar, m5836d(iVar));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final LinearSmoothScroller mo5517b(C1273i iVar) {
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
            /* renamed from: b */
            public final int mo5472b(int i) {
                return Math.min(100, super.mo5472b(i));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo5470a(View view, C1290s sVar, C1288a aVar) {
                int[] a = PagerSnapHelper.this.mo5476a(PagerSnapHelper.this.f5113a.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int a2 = mo5465a(Math.max(Math.abs(i), Math.abs(i2)));
                if (a2 > 0) {
                    aVar.mo5864a(i, i2, a2, this.f4784b);
                }
            }
        };
    }

    /* renamed from: b */
    private static View m5834b(C1273i iVar, C1343ah ahVar) {
        int s = iVar.mo5800s();
        View view = null;
        if (s == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < s; i2++) {
            View g = iVar.mo5788g(i2);
            int a = ahVar.mo6263a(g);
            if (a < i) {
                view = g;
                i = a;
            }
        }
        return view;
    }

    /* renamed from: a */
    private static View m5833a(C1273i iVar, C1343ah ahVar) {
        int i;
        int s = iVar.mo5800s();
        View view = null;
        if (s == 0) {
            return null;
        }
        if (iVar.mo5796o()) {
            i = ahVar.mo6268c() + (ahVar.mo6274f() / 2);
        } else {
            i = ahVar.mo6272e() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < s; i3++) {
            View g = iVar.mo5788g(i3);
            int abs = Math.abs((ahVar.mo6263a(g) + (ahVar.mo6273e(g) / 2)) - i);
            if (abs < i2) {
                view = g;
                i2 = abs;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final int[] mo5476a(C1273i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.mo5438e()) {
            iArr[0] = m5832a(iVar, view, m5836d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo5441f()) {
            iArr[1] = m5832a(iVar, view, m5835c(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    private static int m5832a(C1273i iVar, View view, C1343ah ahVar) {
        int i;
        int a = ahVar.mo6263a(view) + (ahVar.mo6273e(view) / 2);
        if (iVar.mo5796o()) {
            i = ahVar.mo6268c() + (ahVar.mo6274f() / 2);
        } else {
            i = ahVar.mo6272e() / 2;
        }
        return a - i;
    }

    /* renamed from: a */
    public final int mo5474a(C1273i iVar, int i, int i2) {
        boolean z;
        int A = iVar.mo5744A();
        if (A == 0) {
            return -1;
        }
        View view = null;
        if (iVar.mo5441f()) {
            view = m5834b(iVar, m5835c(iVar));
        } else if (iVar.mo5438e()) {
            view = m5834b(iVar, m5836d(iVar));
        }
        if (view == null) {
            return -1;
        }
        int c = C1273i.m6060c(view);
        if (c == -1) {
            return -1;
        }
        boolean z2 = false;
        if (!iVar.mo5438e() ? i2 <= 0 : i <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (iVar instanceof C1289b) {
            PointF d = ((C1289b) iVar).mo5434d(A - 1);
            if (d != null && (d.x < 0.0f || d.y < 0.0f)) {
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                c--;
            }
            return c;
        }
        if (z) {
            c++;
        }
        return c;
    }
}
