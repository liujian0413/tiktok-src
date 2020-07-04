package android.support.p022v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.h */
public final class C1047h {

    /* renamed from: a */
    private EdgeEffect f3652a;

    /* renamed from: b */
    public final void mo4137b() {
        this.f3652a.finish();
    }

    /* renamed from: c */
    public final boolean mo4138c() {
        this.f3652a.onRelease();
        return this.f3652a.isFinished();
    }

    /* renamed from: a */
    public final boolean mo4134a() {
        return this.f3652a.isFinished();
    }

    public C1047h(Context context) {
        this.f3652a = new EdgeEffect(context);
    }

    /* renamed from: a */
    public final boolean mo4135a(float f) {
        this.f3652a.onPull(f);
        return true;
    }

    /* renamed from: a */
    public final boolean mo4136a(Canvas canvas) {
        return this.f3652a.draw(canvas);
    }

    /* renamed from: a */
    public final void mo4133a(int i, int i2) {
        this.f3652a.setSize(i, i2);
    }

    /* renamed from: a */
    public static void m4520a(EdgeEffect edgeEffect, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
