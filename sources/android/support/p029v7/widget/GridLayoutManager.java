package android.support.p029v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.view.p028a.C0945c.C0948c;
import android.support.p029v7.widget.RecyclerView.C1273i.C1276a;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

/* renamed from: android.support.v7.widget.GridLayoutManager */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    boolean f4715a;

    /* renamed from: b */
    public int f4716b = -1;

    /* renamed from: c */
    int[] f4717c;

    /* renamed from: d */
    View[] f4718d;

    /* renamed from: e */
    final SparseIntArray f4719e = new SparseIntArray();

    /* renamed from: f */
    final SparseIntArray f4720f = new SparseIntArray();

    /* renamed from: g */
    public C1241a f4721g = new DefaultSpanSizeLookup();

    /* renamed from: h */
    final Rect f4722h = new Rect();

    /* renamed from: android.support.v7.widget.GridLayoutManager$DefaultSpanSizeLookup */
    public static final class DefaultSpanSizeLookup extends C1241a {
        /* renamed from: a */
        public final int mo5386a(int i) {
            return 1;
        }

        /* renamed from: a */
        public final int mo5387a(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$LayoutParams */
    public static class LayoutParams extends android.support.p029v7.widget.RecyclerView.LayoutParams {

        /* renamed from: a */
        public int f4723a = -1;

        /* renamed from: b */
        public int f4724b;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$a */
    public static abstract class C1241a {

        /* renamed from: a */
        final SparseIntArray f4725a = new SparseIntArray();

        /* renamed from: b */
        public boolean f4726b = false;

        /* renamed from: a */
        public abstract int mo5386a(int i);

        /* renamed from: a */
        public final void mo5388a() {
            this.f4725a.clear();
        }

        /* renamed from: b */
        private int m5659b(int i) {
            int size = this.f4725a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f4725a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.f4725a.size()) {
                return -1;
            }
            return this.f4725a.keyAt(i4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo5389b(int i, int i2) {
            if (!this.f4726b) {
                return mo5387a(i, i2);
            }
            int i3 = this.f4725a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = mo5387a(i, i2);
            this.f4725a.put(i, a);
            return a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo5387a(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo5386a(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f4726b
                if (r2 == 0) goto L_0x0028
                android.util.SparseIntArray r2 = r5.f4725a
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0028
                int r2 = r5.m5659b(r6)
                if (r2 < 0) goto L_0x0028
                android.util.SparseIntArray r3 = r5.f4725a
                int r3 = r3.get(r2)
                int r4 = r5.mo5386a(r2)
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L_0x002a
            L_0x0028:
                r2 = 0
                r3 = 0
            L_0x002a:
                if (r2 >= r6) goto L_0x003b
                int r4 = r5.mo5386a(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x0035
                r3 = 0
                goto L_0x0038
            L_0x0035:
                if (r3 <= r7) goto L_0x0038
                r3 = r4
            L_0x0038:
                int r2 = r2 + 1
                goto L_0x002a
            L_0x003b:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x003f
                return r3
            L_0x003f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.GridLayoutManager.C1241a.mo5387a(int, int):int");
        }

        /* renamed from: c */
        public final int mo5390c(int i, int i2) {
            int a = mo5386a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int a2 = mo5386a(i5);
                i3 += a2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = a2;
                }
            }
            if (i3 + a > i2) {
                return i4 + 1;
            }
            return i4;
        }
    }

    /* renamed from: a */
    public final void mo5379a(boolean z) {
        if (!z) {
            super.mo5379a(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: a */
    public final void mo5372a(C1284o oVar, C1290s sVar, View view, C0945c cVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.mo5758a(view, cVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int a = m5622a(oVar, sVar, layoutParams2.bn_());
        if (this.f4747i == 0) {
            cVar.mo3657b((Object) C0948c.m4049a(layoutParams2.f4723a, layoutParams2.f4724b, a, 1, this.f4716b > 1 && layoutParams2.f4724b == this.f4716b, false));
        } else {
            cVar.mo3657b((Object) C0948c.m4049a(a, 1, layoutParams2.f4723a, layoutParams2.f4724b, this.f4716b > 1 && layoutParams2.f4724b == this.f4716b, false));
        }
    }

    /* renamed from: a */
    public final void mo5373a(C1290s sVar) {
        super.mo5373a(sVar);
        this.f4715a = false;
    }

    /* renamed from: a */
    public final void mo5376a(RecyclerView recyclerView, int i, int i2) {
        this.f4721g.mo5388a();
    }

    /* renamed from: a */
    public final void mo5375a(RecyclerView recyclerView) {
        this.f4721g.mo5388a();
    }

    /* renamed from: a */
    public final void mo5378a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4721g.mo5388a();
    }

    /* renamed from: a */
    public final void mo5377a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4721g.mo5388a();
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5363a() {
        if (this.f4747i == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5365a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo5369a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f4717c == null) {
            super.mo5369a(rect, i, i2);
        }
        int t = mo5801t() + mo5803v();
        int u = mo5802u() + mo5804w();
        if (this.f4747i == 1) {
            i4 = m6041a(i2, rect.height() + u, mo5746C());
            i3 = m6041a(i, this.f4717c[this.f4717c.length - 1] + t, mo5745B());
        } else {
            i3 = m6041a(i, rect.width() + t, mo5745B());
            i4 = m6041a(i2, this.f4717c[this.f4717c.length - 1] + u, mo5746C());
        }
        mo5784d(i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5370a(C1284o oVar, C1290s sVar, C1243a aVar, int i) {
        super.mo5370a(oVar, sVar, aVar, i);
        m5620I();
        if (sVar.mo5870b() > 0 && !sVar.f5010g) {
            m5629b(oVar, sVar, aVar, i);
        }
        m5621J();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo5366a(C1284o oVar, C1290s sVar, int i, int i2, int i3) {
        mo5444h();
        int c = this.f4748j.mo6268c();
        int d = this.f4748j.mo6270d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g = mo5788g(i);
            int c2 = m6060c(g);
            if (c2 >= 0 && c2 < i3 && m5628b(oVar, sVar, c2) == 0) {
                if (((android.support.p029v7.widget.RecyclerView.LayoutParams) g.getLayoutParams()).bl_()) {
                    if (view2 == null) {
                        view2 = g;
                    }
                } else if (this.f4748j.mo6263a(g) < d && this.f4748j.mo6267b(g) >= c) {
                    return g;
                } else {
                    if (view == null) {
                        view = g;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5374a(C1290s sVar, C1245c cVar, C1276a aVar) {
        int i = this.f4716b;
        for (int i2 = 0; i2 < this.f4716b && cVar.mo5463a(sVar) && i > 0; i2++) {
            int i3 = cVar.f4774d;
            aVar.mo5813b(i3, Math.max(0, cVar.f4777g));
            i -= this.f4721g.mo5386a(i3);
            cVar.f4774d += cVar.f4775e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5371a(C1284o oVar, C1290s sVar, C1245c cVar, C1244b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        C1284o oVar2 = oVar;
        C1290s sVar2 = sVar;
        C1245c cVar2 = cVar;
        C1244b bVar2 = bVar;
        int i7 = this.f4748j.mo6278i();
        boolean z2 = i7 != 1073741824;
        int i8 = mo5800s() > 0 ? this.f4717c[this.f4716b] : 0;
        if (z2) {
            m5620I();
        }
        boolean z3 = cVar2.f4775e == 1;
        int i9 = this.f4716b;
        if (!z3) {
            i9 = m5628b(oVar2, sVar2, cVar2.f4774d) + m5630c(oVar2, sVar2, cVar2.f4774d);
        }
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f4716b && cVar2.mo5463a(sVar2) && i9 > 0) {
            int i12 = cVar2.f4774d;
            int c = m5630c(oVar2, sVar2, i12);
            if (c <= this.f4716b) {
                i9 -= c;
                if (i9 < 0) {
                    break;
                }
                View a = cVar2.mo5461a(oVar2);
                if (a == null) {
                    break;
                }
                i10 += c;
                this.f4718d[i11] = a;
                i11++;
            } else {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i12);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.f4716b);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i11 == 0) {
            bVar2.f4768b = true;
            return;
        }
        float f = 0.0f;
        int i13 = i11;
        m5624a(oVar, sVar, i11, i10, z3);
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            View view = this.f4718d[i15];
            if (cVar2.f4781k != null) {
                z = false;
                if (z3) {
                    mo5756a(view);
                } else {
                    mo5757a(view, 0);
                }
            } else if (z3) {
                mo5775b(view);
                z = false;
            } else {
                z = false;
                mo5776b(view, 0);
            }
            mo5777b(view, this.f4722h);
            m5626a(view, i7, z);
            int e = this.f4748j.mo6273e(view);
            if (e > i14) {
                i14 = e;
            }
            float f2 = (((float) this.f4748j.mo6275f(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).f4724b);
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            m5623a(f, i8);
            i14 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                View view2 = this.f4718d[i16];
                m5626a(view2, 1073741824, true);
                int e2 = this.f4748j.mo6273e(view2);
                if (e2 > i14) {
                    i14 = e2;
                }
            }
        }
        for (int i17 = 0; i17 < i13; i17++) {
            View view3 = this.f4718d[i17];
            if (this.f4748j.mo6273e(view3) != i14) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f4934d;
                int i18 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i19 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int e3 = m5631e(layoutParams.f4723a, layoutParams.f4724b);
                if (this.f4747i == 1) {
                    i6 = m6042a(e3, 1073741824, i19, layoutParams.width, false);
                    i5 = MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    i5 = m6042a(e3, 1073741824, i18, layoutParams.height, false);
                    i6 = makeMeasureSpec;
                }
                m5625a(view3, i6, i5, true);
            }
        }
        bVar2.f4767a = i14;
        if (this.f4747i == 1) {
            if (cVar2.f4776f == -1) {
                int i20 = cVar2.f4772b;
                i = i20;
                i2 = i20 - i14;
            } else {
                int i21 = cVar2.f4772b;
                i2 = i21;
                i = i14 + i21;
            }
            i4 = 0;
            i3 = 0;
        } else if (cVar2.f4776f == -1) {
            int i22 = cVar2.f4772b;
            i2 = 0;
            i = 0;
            int i23 = i22 - i14;
            i3 = i22;
            i4 = i23;
        } else {
            i4 = cVar2.f4772b;
            i3 = i14 + i4;
            i2 = 0;
            i = 0;
        }
        for (int i24 = 0; i24 < i13; i24++) {
            View view4 = this.f4718d[i24];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f4747i != 1) {
                i2 = mo5802u() + this.f4717c[layoutParams2.f4723a];
                i = this.f4748j.mo6275f(view4) + i2;
            } else if (mo5443g()) {
                int t = mo5801t() + this.f4717c[this.f4716b - layoutParams2.f4723a];
                i3 = t;
                i4 = t - this.f4748j.mo6275f(view4);
            } else {
                i4 = mo5801t() + this.f4717c[layoutParams2.f4723a];
                i3 = this.f4748j.mo6275f(view4) + i4;
            }
            m6057b(view4, i4, i2, i3, i);
            if (layoutParams2.bl_() || layoutParams2.bm_()) {
                bVar2.f4769c = true;
            }
            bVar2.f4770d = view4.hasFocusable() | bVar2.f4770d;
        }
        Arrays.fill(this.f4718d, null);
    }

    /* renamed from: a */
    public final void mo5368a(int i) {
        if (i != this.f4716b) {
            this.f4715a = true;
            if (i > 0) {
                this.f4716b = i;
                this.f4721g.mo5388a();
                mo5795n();
                return;
            }
            StringBuilder sb = new StringBuilder("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r8)) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f3, code lost:
        if (r13 == r14) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0102  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo5367a(android.view.View r26, int r27, android.support.p029v7.widget.RecyclerView.C1284o r28, android.support.p029v7.widget.RecyclerView.C1290s r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r28
            r2 = r29
            android.view.View r3 = r25.mo5783d(r26)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$LayoutParams r5 = (android.support.p029v7.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.f4723a
            int r7 = r5.f4723a
            int r5 = r5.f4724b
            int r7 = r7 + r5
            android.view.View r5 = super.mo5367a(r26, r27, r28, r29)
            if (r5 != 0) goto L_0x0022
            return r4
        L_0x0022:
            r5 = r27
            int r5 = r0.mo5439f(r5)
            r9 = 1
            if (r5 != r9) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            boolean r10 = r0.f4750l
            if (r5 == r10) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            r10 = -1
            if (r5 == 0) goto L_0x0040
            int r5 = r25.mo5800s()
            int r5 = r5 - r9
            r11 = -1
            r12 = -1
            goto L_0x0047
        L_0x0040:
            int r5 = r25.mo5800s()
            r11 = r5
            r5 = 0
            r12 = 1
        L_0x0047:
            int r13 = r0.f4747i
            if (r13 != r9) goto L_0x0053
            boolean r13 = r25.mo5443g()
            if (r13 == 0) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            int r14 = r0.m5622a(r1, r2, r5)
            r10 = r4
            r8 = -1
            r15 = 0
            r17 = 0
            r18 = -1
        L_0x005f:
            if (r5 == r11) goto L_0x0140
            int r9 = r0.m5622a(r1, r2, r5)
            android.view.View r1 = r0.mo5788g(r5)
            if (r1 == r3) goto L_0x0140
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x0085
            if (r9 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x0077
            goto L_0x0140
        L_0x0077:
            r21 = r3
            r23 = r8
            r22 = r11
            r24 = r14
            r8 = r17
            r11 = r18
            goto L_0x012c
        L_0x0085:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$LayoutParams r9 = (android.support.p029v7.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.f4723a
            r21 = r3
            int r3 = r9.f4723a
            r22 = r11
            int r11 = r9.f4724b
            int r3 = r3 + r11
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00a1
            if (r2 != r6) goto L_0x00a1
            if (r3 != r7) goto L_0x00a1
            return r1
        L_0x00a1:
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00a9
            if (r4 == 0) goto L_0x00b1
        L_0x00a9:
            boolean r11 = r1.hasFocusable()
            if (r11 != 0) goto L_0x00bc
            if (r10 != 0) goto L_0x00bc
        L_0x00b1:
            r23 = r8
            r24 = r14
            r8 = r17
        L_0x00b7:
            r11 = r18
        L_0x00b9:
            r19 = 1
            goto L_0x0100
        L_0x00bc:
            int r11 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r7)
            int r11 = r20 - r11
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x00d9
            if (r11 <= r15) goto L_0x00cf
            goto L_0x00b1
        L_0x00cf:
            if (r11 != r15) goto L_0x00f6
            if (r2 <= r8) goto L_0x00d5
            r11 = 1
            goto L_0x00d6
        L_0x00d5:
            r11 = 0
        L_0x00d6:
            if (r13 != r11) goto L_0x00f6
            goto L_0x00b1
        L_0x00d9:
            if (r4 != 0) goto L_0x00f6
            r23 = r8
            r24 = r14
            r8 = 1
            r14 = 0
            boolean r16 = r0.mo5767a(r1, r14, r8)
            if (r16 == 0) goto L_0x00fa
            r8 = r17
            if (r11 <= r8) goto L_0x00ec
            goto L_0x00b7
        L_0x00ec:
            if (r11 != r8) goto L_0x00fc
            r11 = r18
            if (r2 <= r11) goto L_0x00f3
            r14 = 1
        L_0x00f3:
            if (r13 != r14) goto L_0x00fe
            goto L_0x00b9
        L_0x00f6:
            r23 = r8
            r24 = r14
        L_0x00fa:
            r8 = r17
        L_0x00fc:
            r11 = r18
        L_0x00fe:
            r19 = 0
        L_0x0100:
            if (r19 == 0) goto L_0x012c
            boolean r14 = r1.hasFocusable()
            if (r14 == 0) goto L_0x011b
            int r4 = r9.f4723a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r17 = r8
            r18 = r11
            r8 = r4
            r4 = r1
            goto L_0x0132
        L_0x011b:
            int r8 = r9.f4723a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r17 = r3
            r18 = r8
            goto L_0x0130
        L_0x012c:
            r17 = r8
            r18 = r11
        L_0x0130:
            r8 = r23
        L_0x0132:
            int r5 = r5 + r12
            r3 = r21
            r11 = r22
            r14 = r24
            r1 = r28
            r2 = r29
            r9 = 1
            goto L_0x005f
        L_0x0140:
            if (r4 == 0) goto L_0x0143
            return r4
        L_0x0143:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.GridLayoutManager.mo5367a(android.view.View, int, android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s):android.view.View");
    }

    /* renamed from: G */
    private void m5618G() {
        this.f4719e.clear();
        this.f4720f.clear();
    }

    public final boolean bi_() {
        if (this.f4756r != null || this.f4715a) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    private void m5621J() {
        if (this.f4718d == null || this.f4718d.length != this.f4716b) {
            this.f4718d = new View[this.f4716b];
        }
    }

    /* renamed from: H */
    private void m5619H() {
        int s = mo5800s();
        for (int i = 0; i < s; i++) {
            LayoutParams layoutParams = (LayoutParams) mo5788g(i).getLayoutParams();
            int bn_ = layoutParams.bn_();
            this.f4719e.put(bn_, layoutParams.f4724b);
            this.f4720f.put(bn_, layoutParams.f4723a);
        }
    }

    /* renamed from: I */
    private void m5620I() {
        int i;
        if (this.f4747i == 1) {
            i = (this.f4957I - mo5803v()) - mo5801t();
        } else {
            i = (this.f4958J - mo5804w()) - mo5802u();
        }
        m5632k(i);
    }

    /* renamed from: a */
    public final boolean mo5380a(android.support.p029v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: k */
    private void m5632k(int i) {
        this.f4717c = m5627a(this.f4717c, this.f4716b, i);
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5364a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: c */
    public void mo5385c(C1284o oVar, C1290s sVar) {
        if (sVar.f5010g) {
            m5619H();
        }
        super.mo5385c(oVar, sVar);
        m5618G();
    }

    /* renamed from: b */
    public final int mo5382b(C1284o oVar, C1290s sVar) {
        if (this.f4747i == 1) {
            return this.f4716b;
        }
        if (sVar.mo5870b() <= 0) {
            return 0;
        }
        return m5622a(oVar, sVar, sVar.mo5870b() - 1) + 1;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo5368a(i);
    }

    /* renamed from: a */
    private void m5623a(float f, int i) {
        m5632k(Math.max(Math.round(f * ((float) this.f4716b)), i));
    }

    /* renamed from: e */
    private int m5631e(int i, int i2) {
        if (this.f4747i != 1 || !mo5443g()) {
            return this.f4717c[i2 + i] - this.f4717c[i];
        }
        return this.f4717c[this.f4716b - i] - this.f4717c[(this.f4716b - i) - i2];
    }

    /* renamed from: a */
    public final int mo5362a(C1284o oVar, C1290s sVar) {
        if (this.f4747i == 0) {
            return this.f4716b;
        }
        if (sVar.mo5870b() <= 0) {
            return 0;
        }
        return m5622a(oVar, sVar, sVar.mo5870b() - 1) + 1;
    }

    /* renamed from: b */
    public final void mo5383b(RecyclerView recyclerView, int i, int i2) {
        this.f4721g.mo5388a();
    }

    /* renamed from: a */
    public int mo5361a(int i, C1284o oVar, C1290s sVar) {
        m5620I();
        m5621J();
        return super.mo5361a(i, oVar, sVar);
    }

    /* renamed from: b */
    public int mo5381b(int i, C1284o oVar, C1290s sVar) {
        m5620I();
        m5621J();
        return super.mo5381b(i, oVar, sVar);
    }

    /* renamed from: a */
    private int m5622a(C1284o oVar, C1290s sVar, int i) {
        if (!sVar.f5010g) {
            return this.f4721g.mo5390c(i, this.f4716b);
        }
        int b = oVar.mo5841b(i);
        if (b == -1) {
            return 0;
        }
        return this.f4721g.mo5390c(b, this.f4716b);
    }

    /* renamed from: b */
    private int m5628b(C1284o oVar, C1290s sVar, int i) {
        if (!sVar.f5010g) {
            return this.f4721g.mo5389b(i, this.f4716b);
        }
        int i2 = this.f4720f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oVar.mo5841b(i);
        if (b == -1) {
            return 0;
        }
        return this.f4721g.mo5389b(b, this.f4716b);
    }

    /* renamed from: c */
    private int m5630c(C1284o oVar, C1290s sVar, int i) {
        if (!sVar.f5010g) {
            return this.f4721g.mo5386a(i);
        }
        int i2 = this.f4719e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oVar.mo5841b(i);
        if (b == -1) {
            return 1;
        }
        return this.f4721g.mo5386a(b);
    }

    /* renamed from: a */
    private void m5626a(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f4934d;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int e = m5631e(layoutParams.f4723a, layoutParams.f4724b);
        if (this.f4747i == 1) {
            i2 = m6042a(e, i, i5, layoutParams.width, false);
            i3 = m6042a(this.f4748j.mo6274f(), this.f4956H, i4, layoutParams.height, true);
        } else {
            int a = m6042a(e, i, i4, layoutParams.height, false);
            int a2 = m6042a(this.f4748j.mo6274f(), this.f4955G, i5, layoutParams.width, true);
            i3 = a;
            i2 = a2;
        }
        m5625a(view, i2, i3, z);
    }

    /* renamed from: a */
    private static int[] m5627a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo5368a(i);
    }

    /* renamed from: b */
    private void m5629b(C1284o oVar, C1290s sVar, C1243a aVar, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int b = m5628b(oVar, sVar, aVar.f4763b);
        if (z) {
            while (b > 0 && aVar.f4763b > 0) {
                aVar.f4763b--;
                b = m5628b(oVar, sVar, aVar.f4763b);
            }
            return;
        }
        int b2 = sVar.mo5870b() - 1;
        int i2 = aVar.f4763b;
        while (i2 < b2) {
            int i3 = i2 + 1;
            int b3 = m5628b(oVar, sVar, i3);
            if (b3 <= b) {
                break;
            }
            i2 = i3;
            b = b3;
        }
        aVar.f4763b = i2;
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo5368a(m6043a(context, attributeSet, i, i2).f4970b);
    }

    /* renamed from: a */
    private void m5625a(View view, int i, int i2, boolean z) {
        boolean z2;
        android.support.p029v7.widget.RecyclerView.LayoutParams layoutParams = (android.support.p029v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = mo5765a(view, i, i2, layoutParams);
        } else {
            z2 = mo5778b(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m5624a(C1284o oVar, C1290s sVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = -1;
        int i6 = 0;
        if (z) {
            i5 = i;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View view = this.f4718d[i4];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f4724b = m5630c(oVar, sVar, m6060c(view));
            layoutParams.f4723a = i6;
            i6 += layoutParams.f4724b;
            i4 += i3;
        }
    }
}
