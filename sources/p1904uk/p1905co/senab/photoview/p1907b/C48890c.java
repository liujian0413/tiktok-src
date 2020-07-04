package p1904uk.p1905co.senab.photoview.p1907b;

import android.content.Context;
import android.widget.Scroller;

/* renamed from: uk.co.senab.photoview.b.c */
public final class C48890c extends C48891d {

    /* renamed from: a */
    private Scroller f124283a;

    /* renamed from: b */
    public final boolean mo123717b() {
        return this.f124283a.isFinished();
    }

    /* renamed from: c */
    public final int mo123718c() {
        return this.f124283a.getCurrX();
    }

    /* renamed from: d */
    public final int mo123719d() {
        return this.f124283a.getCurrY();
    }

    /* renamed from: a */
    public final boolean mo123716a() {
        return this.f124283a.computeScrollOffset();
    }

    /* renamed from: a */
    public final void mo123715a(boolean z) {
        this.f124283a.forceFinished(true);
    }

    public C48890c(Context context) {
        this.f124283a = new Scroller(context);
    }

    /* renamed from: a */
    public final void mo123714a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f124283a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }
}
