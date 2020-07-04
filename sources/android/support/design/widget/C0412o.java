package android.support.design.widget;

import android.support.p022v4.view.C0991u;
import android.view.View;

/* renamed from: android.support.design.widget.o */
final class C0412o {

    /* renamed from: a */
    public int f1769a;

    /* renamed from: b */
    public int f1770b;

    /* renamed from: c */
    public int f1771c;

    /* renamed from: d */
    public int f1772d;

    /* renamed from: e */
    private final View f1773e;

    /* renamed from: a */
    public final void mo1874a() {
        this.f1769a = this.f1773e.getTop();
        this.f1770b = this.f1773e.getLeft();
        m1838b();
    }

    /* renamed from: b */
    private void m1838b() {
        C0991u.m4222h(this.f1773e, this.f1771c - (this.f1773e.getTop() - this.f1769a));
        C0991u.m4225i(this.f1773e, this.f1772d - (this.f1773e.getLeft() - this.f1770b));
    }

    public C0412o(View view) {
        this.f1773e = view;
    }

    /* renamed from: a */
    public final boolean mo1875a(int i) {
        if (this.f1771c == i) {
            return false;
        }
        this.f1771c = i;
        m1838b();
        return true;
    }

    /* renamed from: b */
    public final boolean mo1876b(int i) {
        if (this.f1772d == i) {
            return false;
        }
        this.f1772d = i;
        m1838b();
        return true;
    }
}
