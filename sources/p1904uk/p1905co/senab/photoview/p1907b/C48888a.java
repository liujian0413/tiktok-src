package p1904uk.p1905co.senab.photoview.p1907b;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: uk.co.senab.photoview.b.a */
public class C48888a extends C48891d {

    /* renamed from: a */
    protected OverScroller f124281a;

    /* renamed from: b */
    private boolean f124282b;

    /* renamed from: b */
    public final boolean mo123717b() {
        return this.f124281a.isFinished();
    }

    /* renamed from: c */
    public final int mo123718c() {
        return this.f124281a.getCurrX();
    }

    /* renamed from: d */
    public final int mo123719d() {
        return this.f124281a.getCurrY();
    }

    /* renamed from: a */
    public boolean mo123716a() {
        if (this.f124282b) {
            this.f124281a.computeScrollOffset();
            this.f124282b = false;
        }
        return this.f124281a.computeScrollOffset();
    }

    /* renamed from: a */
    public final void mo123715a(boolean z) {
        this.f124281a.forceFinished(true);
    }

    public C48888a(Context context) {
        this.f124281a = new OverScroller(context);
    }

    /* renamed from: a */
    public final void mo123714a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f124281a.fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }
}
