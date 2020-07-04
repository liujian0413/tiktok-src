package android.support.design.circularreveal.cardview;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.design.circularreveal.C0261c;
import android.support.design.circularreveal.C0263d;
import android.support.design.circularreveal.C0263d.C0268d;
import android.support.p029v7.widget.CardView;

public class CircularRevealCardView extends CardView implements C0263d {

    /* renamed from: e */
    private final C0261c f1047e;

    /* renamed from: a */
    public final void mo1011a() {
        this.f1047e.mo1023a();
    }

    /* renamed from: b */
    public final void mo1013b() {
        this.f1047e.mo1028b();
    }

    /* renamed from: c */
    public final boolean mo1014c() {
        return super.isOpaque();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f1047e.f1038b;
    }

    public int getCircularRevealScrimColor() {
        return this.f1047e.mo1030d();
    }

    public C0268d getRevealInfo() {
        return this.f1047e.mo1029c();
    }

    public boolean isOpaque() {
        if (this.f1047e != null) {
            return this.f1047e.mo1031e();
        }
        return super.isOpaque();
    }

    /* renamed from: a */
    public final void mo1012a(Canvas canvas) {
        super.draw(canvas);
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f1047e.mo1026a(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f1047e.mo1024a(i);
    }

    public void setRevealInfo(C0268d dVar) {
        this.f1047e.mo1027a(dVar);
    }

    public void draw(Canvas canvas) {
        if (this.f1047e != null) {
            this.f1047e.mo1025a(canvas);
        } else {
            super.draw(canvas);
        }
    }
}
