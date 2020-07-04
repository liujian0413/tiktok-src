package com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget;

import android.support.p022v4.view.C0991u;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.f */
final class C35379f {

    /* renamed from: a */
    public int f92814a;

    /* renamed from: b */
    public int f92815b;

    /* renamed from: c */
    public int f92816c;

    /* renamed from: d */
    public int f92817d;

    /* renamed from: e */
    private final View f92818e;

    /* renamed from: a */
    public final void mo90097a() {
        this.f92814a = this.f92818e.getTop();
        this.f92815b = this.f92818e.getLeft();
        m114264b();
    }

    /* renamed from: b */
    private void m114264b() {
        C0991u.m4222h(this.f92818e, this.f92816c - (this.f92818e.getTop() - this.f92814a));
        C0991u.m4225i(this.f92818e, this.f92817d - (this.f92818e.getLeft() - this.f92815b));
    }

    C35379f(View view) {
        this.f92818e = view;
    }

    /* renamed from: b */
    public final boolean mo90099b(int i) {
        if (this.f92817d == i) {
            return false;
        }
        this.f92817d = i;
        m114264b();
        return true;
    }

    /* renamed from: a */
    public final boolean mo90098a(int i) {
        StringBuilder sb = new StringBuilder("setTopAndBottomOffset...");
        sb.append(i);
        sb.append("/");
        sb.append(this.f92816c);
        if (this.f92816c == i) {
            return false;
        }
        this.f92816c = i;
        m114264b();
        return true;
    }
}
