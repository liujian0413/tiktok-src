package android.support.p029v7.widget;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;

/* renamed from: android.support.v7.widget.ah */
public abstract class C1343ah {

    /* renamed from: a */
    public final C1273i f5248a;

    /* renamed from: b */
    final Rect f5249b;

    /* renamed from: c */
    private int f5250c;

    /* renamed from: a */
    public abstract int mo6263a(View view);

    /* renamed from: a */
    public abstract void mo6265a(int i);

    /* renamed from: b */
    public abstract int mo6267b(View view);

    /* renamed from: c */
    public abstract int mo6268c();

    /* renamed from: c */
    public abstract int mo6269c(View view);

    /* renamed from: d */
    public abstract int mo6270d();

    /* renamed from: d */
    public abstract int mo6271d(View view);

    /* renamed from: e */
    public abstract int mo6272e();

    /* renamed from: e */
    public abstract int mo6273e(View view);

    /* renamed from: f */
    public abstract int mo6274f();

    /* renamed from: f */
    public abstract int mo6275f(View view);

    /* renamed from: g */
    public abstract int mo6276g();

    /* renamed from: h */
    public abstract int mo6277h();

    /* renamed from: i */
    public abstract int mo6278i();

    /* renamed from: a */
    public final void mo6264a() {
        this.f5250c = mo6274f();
    }

    /* renamed from: b */
    public final int mo6266b() {
        if (Integer.MIN_VALUE == this.f5250c) {
            return 0;
        }
        return mo6274f() - this.f5250c;
    }

    /* renamed from: a */
    public static C1343ah m6624a(C1273i iVar) {
        return new C1343ah(iVar) {
            /* renamed from: c */
            public final int mo6268c() {
                return this.f5248a.mo5801t();
            }

            /* renamed from: e */
            public final int mo6272e() {
                return this.f5248a.f4957I;
            }

            /* renamed from: g */
            public final int mo6276g() {
                return this.f5248a.mo5803v();
            }

            /* renamed from: h */
            public final int mo6277h() {
                return this.f5248a.f4955G;
            }

            /* renamed from: i */
            public final int mo6278i() {
                return this.f5248a.f4956H;
            }

            /* renamed from: d */
            public final int mo6270d() {
                return this.f5248a.f4957I - this.f5248a.mo5803v();
            }

            /* renamed from: f */
            public final int mo6274f() {
                return (this.f5248a.f4957I - this.f5248a.mo5801t()) - this.f5248a.mo5803v();
            }

            /* renamed from: a */
            public final void mo6265a(int i) {
                this.f5248a.mo5790h(i);
            }

            /* renamed from: a */
            public final int mo6263a(View view) {
                return this.f5248a.mo5787g(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: b */
            public final int mo6267b(View view) {
                return this.f5248a.mo5791i(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: c */
            public final int mo6269c(View view) {
                this.f5248a.mo5760a(view, true, this.f5249b);
                return this.f5249b.right;
            }

            /* renamed from: d */
            public final int mo6271d(View view) {
                this.f5248a.mo5760a(view, true, this.f5249b);
                return this.f5249b.left;
            }

            /* renamed from: e */
            public final int mo6273e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1273i.m6063e(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            /* renamed from: f */
            public final int mo6275f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1273i.m6064f(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }
        };
    }

    /* renamed from: b */
    public static C1343ah m6626b(C1273i iVar) {
        return new C1343ah(iVar) {
            /* renamed from: c */
            public final int mo6268c() {
                return this.f5248a.mo5802u();
            }

            /* renamed from: e */
            public final int mo6272e() {
                return this.f5248a.f4958J;
            }

            /* renamed from: g */
            public final int mo6276g() {
                return this.f5248a.mo5804w();
            }

            /* renamed from: h */
            public final int mo6277h() {
                return this.f5248a.f4956H;
            }

            /* renamed from: i */
            public final int mo6278i() {
                return this.f5248a.f4955G;
            }

            /* renamed from: d */
            public final int mo6270d() {
                return this.f5248a.f4958J - this.f5248a.mo5804w();
            }

            /* renamed from: f */
            public final int mo6274f() {
                return (this.f5248a.f4958J - this.f5248a.mo5802u()) - this.f5248a.mo5804w();
            }

            /* renamed from: a */
            public final void mo6265a(int i) {
                this.f5248a.mo5792i(i);
            }

            /* renamed from: a */
            public final int mo6263a(View view) {
                return this.f5248a.mo5789h(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public final int mo6267b(View view) {
                return this.f5248a.mo5793j(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: c */
            public final int mo6269c(View view) {
                this.f5248a.mo5760a(view, true, this.f5249b);
                return this.f5249b.bottom;
            }

            /* renamed from: d */
            public final int mo6271d(View view) {
                this.f5248a.mo5760a(view, true, this.f5249b);
                return this.f5249b.top;
            }

            /* renamed from: e */
            public final int mo6273e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1273i.m6064f(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            /* renamed from: f */
            public final int mo6275f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1273i.m6063e(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }
        };
    }

    private C1343ah(C1273i iVar) {
        this.f5250c = Integer.MIN_VALUE;
        this.f5249b = new Rect();
        this.f5248a = iVar;
    }

    /* renamed from: a */
    public static C1343ah m6625a(C1273i iVar, int i) {
        switch (i) {
            case 0:
                return m6624a(iVar);
            case 1:
                return m6626b(iVar);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }
}
