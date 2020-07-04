package android.support.design.card;

import android.support.p029v7.widget.CardView;

public class MaterialCardView extends CardView {

    /* renamed from: e */
    private final C0255a f955e;

    public int getStrokeColor() {
        return this.f955e.f956a;
    }

    public int getStrokeWidth() {
        return this.f955e.f957b;
    }

    public void setStrokeColor(int i) {
        this.f955e.mo784a(i);
    }

    public void setStrokeWidth(int i) {
        this.f955e.mo785b(i);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f955e.mo783a();
    }
}
