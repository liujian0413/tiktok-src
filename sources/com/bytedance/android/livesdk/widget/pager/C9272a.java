package com.bytedance.android.livesdk.widget.pager;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;

/* renamed from: com.bytedance.android.livesdk.widget.pager.a */
public abstract class C9272a {

    /* renamed from: a */
    protected final C1273i f25447a;

    /* renamed from: b */
    final Rect f25448b;

    /* renamed from: c */
    private int f25449c;

    /* renamed from: a */
    public abstract int mo22749a();

    /* renamed from: a */
    public abstract int mo22750a(View view);

    /* renamed from: b */
    public abstract int mo22751b();

    /* renamed from: b */
    public abstract int mo22752b(View view);

    /* renamed from: c */
    public abstract int mo22753c();

    /* renamed from: c */
    public abstract int mo22754c(View view);

    /* renamed from: a */
    public static C9272a m27585a(C1273i iVar) {
        return new C9272a(iVar) {
            /* renamed from: a */
            public final int mo22749a() {
                return this.f25447a.mo5801t();
            }

            /* renamed from: b */
            public final int mo22751b() {
                return this.f25447a.f4957I;
            }

            /* renamed from: c */
            public final int mo22753c() {
                return (this.f25447a.f4957I - this.f25447a.mo5801t()) - this.f25447a.mo5803v();
            }

            /* renamed from: a */
            public final int mo22750a(View view) {
                return this.f25447a.mo5787g(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: b */
            public final int mo22752b(View view) {
                return this.f25447a.mo5791i(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: c */
            public final int mo22754c(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1273i.m6063e(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }
        };
    }

    /* renamed from: b */
    public static C9272a m27586b(C1273i iVar) {
        return new C9272a(iVar) {
            /* renamed from: a */
            public final int mo22749a() {
                return this.f25447a.mo5802u();
            }

            /* renamed from: b */
            public final int mo22751b() {
                return this.f25447a.f4958J;
            }

            /* renamed from: c */
            public final int mo22753c() {
                return (this.f25447a.f4958J - this.f25447a.mo5802u()) - this.f25447a.mo5804w();
            }

            /* renamed from: a */
            public final int mo22750a(View view) {
                return this.f25447a.mo5789h(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public final int mo22752b(View view) {
                return this.f25447a.mo5793j(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: c */
            public final int mo22754c(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1273i.m6064f(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }
        };
    }

    private C9272a(C1273i iVar) {
        this.f25449c = Integer.MIN_VALUE;
        this.f25448b = new Rect();
        this.f25447a = iVar;
    }
}
