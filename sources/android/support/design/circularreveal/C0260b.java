package android.support.design.circularreveal;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.design.circularreveal.C0263d.C0268d;
import android.widget.FrameLayout;

/* renamed from: android.support.design.circularreveal.b */
public class C0260b extends FrameLayout implements C0263d {

    /* renamed from: a */
    private final C0261c f1036a;

    /* renamed from: a */
    public final void mo1011a() {
        this.f1036a.mo1023a();
    }

    /* renamed from: b */
    public final void mo1013b() {
        this.f1036a.mo1028b();
    }

    /* renamed from: c */
    public final boolean mo1014c() {
        return super.isOpaque();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f1036a.f1038b;
    }

    public int getCircularRevealScrimColor() {
        return this.f1036a.mo1030d();
    }

    public C0268d getRevealInfo() {
        return this.f1036a.mo1029c();
    }

    public boolean isOpaque() {
        if (this.f1036a != null) {
            return this.f1036a.mo1031e();
        }
        return super.isOpaque();
    }

    /* renamed from: a */
    public final void mo1012a(Canvas canvas) {
        super.draw(canvas);
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f1036a.mo1026a(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f1036a.mo1024a(i);
    }

    public void setRevealInfo(C0268d dVar) {
        this.f1036a.mo1027a(dVar);
    }

    public void draw(Canvas canvas) {
        if (this.f1036a != null) {
            this.f1036a.mo1025a(canvas);
        } else {
            super.draw(canvas);
        }
    }
}
