package android.support.p029v7.widget;

import android.graphics.PointF;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1287r.C1289b;
import android.view.View;

/* renamed from: android.support.v7.widget.LinearSnapHelper */
public class LinearSnapHelper extends SnapHelper {

    /* renamed from: b */
    private C1343ah f4789b;

    /* renamed from: c */
    private C1343ah f4790c;

    /* renamed from: c */
    private C1343ah m5794c(C1273i iVar) {
        if (this.f4789b == null || this.f4789b.f5248a != iVar) {
            this.f4789b = C1343ah.m6626b(iVar);
        }
        return this.f4789b;
    }

    /* renamed from: d */
    private C1343ah m5795d(C1273i iVar) {
        if (this.f4790c == null || this.f4790c.f5248a != iVar) {
            this.f4790c = C1343ah.m6624a(iVar);
        }
        return this.f4790c;
    }

    /* renamed from: a */
    public final View mo5475a(C1273i iVar) {
        if (iVar.mo5441f()) {
            return m5792a(iVar, m5794c(iVar));
        }
        if (iVar.mo5438e()) {
            return m5792a(iVar, m5795d(iVar));
        }
        return null;
    }

    /* renamed from: b */
    private static float m5793b(C1273i iVar, C1343ah ahVar) {
        int s = iVar.mo5800s();
        if (s == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MAX_VALUE;
        View view2 = null;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < s; i3++) {
            View g = iVar.mo5788g(i3);
            int c = C1273i.m6060c(g);
            if (c != -1) {
                if (c < i) {
                    view = g;
                    i = c;
                }
                if (c > i2) {
                    view2 = g;
                    i2 = c;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(ahVar.mo6267b(view), ahVar.mo6267b(view2)) - Math.min(ahVar.mo6263a(view), ahVar.mo6263a(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: a */
    private static View m5792a(C1273i iVar, C1343ah ahVar) {
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
            iArr[0] = m5791a(iVar, view, m5795d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo5441f()) {
            iArr[1] = m5791a(iVar, view, m5794c(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    private static int m5791a(C1273i iVar, View view, C1343ah ahVar) {
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
        int i3;
        int i4;
        if (!(iVar instanceof C1289b)) {
            return -1;
        }
        int A = iVar.mo5744A();
        if (A == 0) {
            return -1;
        }
        View a = mo5475a(iVar);
        if (a == null) {
            return -1;
        }
        int c = C1273i.m6060c(a);
        if (c == -1) {
            return -1;
        }
        int i5 = A - 1;
        PointF d = ((C1289b) iVar).mo5434d(i5);
        if (d == null) {
            return -1;
        }
        if (iVar.mo5438e()) {
            i3 = m5790a(iVar, m5795d(iVar), i, 0);
            if (d.x < 0.0f) {
                i3 = -i3;
            }
        } else {
            i3 = 0;
        }
        if (iVar.mo5441f()) {
            i4 = m5790a(iVar, m5794c(iVar), 0, i2);
            if (d.y < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (iVar.mo5441f()) {
            i3 = i4;
        }
        if (i3 == 0) {
            return -1;
        }
        int i6 = c + i3;
        if (i6 < 0) {
            i6 = 0;
        }
        if (i6 >= A) {
            i6 = i5;
        }
        return i6;
    }

    /* renamed from: a */
    private int m5790a(C1273i iVar, C1343ah ahVar, int i, int i2) {
        int i3;
        int[] b = mo6008b(i, i2);
        float b2 = m5793b(iVar, ahVar);
        if (b2 <= 0.0f) {
            return 0;
        }
        if (Math.abs(b[0]) > Math.abs(b[1])) {
            i3 = b[0];
        } else {
            i3 = b[1];
        }
        return Math.round(((float) i3) / b2);
    }
}
