package android.support.p022v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: android.support.v4.widget.m */
public final class C1055m {

    /* renamed from: a */
    OverScroller f3661a;

    /* renamed from: b */
    public final int mo4142b() {
        return this.f3661a.getCurrX();
    }

    /* renamed from: c */
    public final int mo4143c() {
        return this.f3661a.getCurrY();
    }

    /* renamed from: d */
    public final boolean mo4144d() {
        return this.f3661a.computeScrollOffset();
    }

    /* renamed from: e */
    public final void mo4145e() {
        this.f3661a.abortAnimation();
    }

    /* renamed from: a */
    public final boolean mo4141a() {
        return this.f3661a.isFinished();
    }

    /* renamed from: a */
    public static C1055m m4554a(Context context) {
        return m4555a(context, null);
    }

    /* renamed from: a */
    private static C1055m m4555a(Context context, Interpolator interpolator) {
        return new C1055m(context, null);
    }

    private C1055m(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.f3661a = overScroller;
    }

    /* renamed from: a */
    public final void mo4140a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f3661a.fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }
}
