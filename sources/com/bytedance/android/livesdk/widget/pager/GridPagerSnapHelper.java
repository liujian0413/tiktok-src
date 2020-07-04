package com.bytedance.android.livesdk.widget.pager;

import android.graphics.PointF;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1287r.C1288a;
import android.support.p029v7.widget.RecyclerView.C1287r.C1289b;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.android.live.uikit.p176d.C3519c;

public class GridPagerSnapHelper extends SnapHelper {

    /* renamed from: a */
    private int f25436a = 1;

    /* renamed from: c */
    private int f25437c = 1;

    /* renamed from: d */
    private C9272a f25438d;

    /* renamed from: e */
    private C9272a f25439e;

    /* renamed from: b */
    private int m27558b() {
        return this.f25436a * this.f25437c;
    }

    /* renamed from: c */
    private int m27560c(int i) {
        return i / m27558b();
    }

    /* renamed from: a */
    public final GridPagerSnapHelper mo22743a(int i) {
        if (this.f25436a > 0) {
            this.f25436a = i;
            return this;
        }
        throw new IllegalArgumentException("row must be greater than zero");
    }

    /* renamed from: b */
    public final GridPagerSnapHelper mo22746b(int i) {
        if (this.f25437c > 0) {
            this.f25437c = 4;
            return this;
        }
        throw new IllegalArgumentException("column must be greater than zero");
    }

    /* renamed from: c */
    private C9272a m27561c(C1273i iVar) {
        if (this.f25438d == null || this.f25438d.f25447a != iVar) {
            this.f25438d = C9272a.m27586b(iVar);
        }
        return this.f25438d;
    }

    /* renamed from: d */
    private C9272a m27562d(C1273i iVar) {
        if (this.f25439e == null || this.f25439e.f25447a != iVar) {
            this.f25439e = C9272a.m27585a(iVar);
        }
        return this.f25439e;
    }

    /* renamed from: a */
    public View mo20745a(C1273i iVar) {
        if (iVar.mo5441f()) {
            return m27557a(iVar, m27561c(iVar));
        }
        if (iVar.mo5438e()) {
            return m27557a(iVar, m27562d(iVar));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final LinearSmoothScroller mo22745b(C1273i iVar) {
        if (!(iVar instanceof C1289b)) {
            return null;
        }
        return new LinearSmoothScroller(this.f25442b.getContext()) {
            /* renamed from: c */
            public final PointF mo5861c(int i) {
                return null;
            }

            /* renamed from: a */
            public final float mo5464a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* renamed from: b */
            public final int mo5472b(int i) {
                return Math.min(100, super.mo5472b(i));
            }

            /* renamed from: a */
            public final void mo5470a(View view, C1290s sVar, C1288a aVar) {
                int[] a = GridPagerSnapHelper.this.mo22744a(GridPagerSnapHelper.this.f25442b.getLayoutManager(), view);
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
    private static View m27559b(C1273i iVar, C9272a aVar) {
        int s = iVar.mo5800s();
        View view = null;
        if (s == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < s; i2++) {
            View g = iVar.mo5788g(i2);
            int a = aVar.mo22750a(g);
            if (a < i) {
                view = g;
                i = a;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final int[] mo22744a(C1273i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.mo5438e()) {
            iArr[0] = m27556a(iVar, view, m27562d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo5441f()) {
            iArr[1] = m27556a(iVar, view, m27561c(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    private static View m27557a(C1273i iVar, C9272a aVar) {
        int i;
        int s = iVar.mo5800s();
        View view = null;
        if (s == 0) {
            return null;
        }
        if (iVar.mo5796o()) {
            i = aVar.mo22749a() + (aVar.mo22753c() / 2);
        } else {
            i = aVar.mo22751b() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < s; i3++) {
            View g = iVar.mo5788g(i3);
            int abs = Math.abs((aVar.mo22750a(g) + (aVar.mo22754c(g) / 2)) - i);
            if (abs < i2) {
                view = g;
                i2 = abs;
            }
        }
        return view;
    }

    /* renamed from: a */
    private int m27556a(C1273i iVar, View view, C9272a aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean a = C3519c.m12965a(this.f25442b.getContext());
        if (iVar.mo5438e()) {
            int width = this.f25442b.getWidth() / this.f25437c;
            int c = C1273i.m6060c(view);
            int c2 = m27560c(c) * m27558b();
            if (a) {
                i3 = ((m27558b() - (c - c2)) / this.f25436a) * width;
            } else {
                i3 = ((c - c2) / this.f25436a) * width;
            }
            if (a) {
                i4 = aVar.mo22752b(view);
            } else {
                i4 = aVar.mo22750a(view);
            }
            int i5 = i4 - i3;
            if (i5 > 5 || i5 < -5) {
                return i5;
            }
            return 0;
        }
        int height = this.f25442b.getHeight() / this.f25436a;
        int c3 = C1273i.m6060c(view);
        int c4 = m27560c(c3) * m27558b();
        if (a) {
            i = ((m27558b() - (c3 - c4)) / this.f25437c) * height;
        } else {
            i = ((c3 - c4) / this.f25437c) * height;
        }
        if (a) {
            i2 = aVar.mo22752b(view);
        } else {
            i2 = aVar.mo22750a(view);
        }
        int i6 = i2 - i;
        if (i6 > 5 || i6 < -5) {
            return i6;
        }
        return 0;
    }

    /* renamed from: a */
    public int mo20744a(C1273i iVar, int i, int i2) {
        boolean z;
        int A = iVar.mo5744A();
        if (A == 0) {
            return -1;
        }
        View view = null;
        if (iVar.mo5441f()) {
            view = m27559b(iVar, m27561c(iVar));
        } else if (iVar.mo5438e()) {
            view = m27559b(iVar, m27562d(iVar));
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
        int c2 = m27560c(c) * m27558b();
        if (z2) {
            if (z) {
                c2 -= m27558b();
            }
            return c2;
        } else if (z) {
            return c2 + m27558b();
        } else {
            return (c2 + m27558b()) - 1;
        }
    }
}
