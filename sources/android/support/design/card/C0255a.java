package android.support.design.card;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: android.support.design.card.a */
final class C0255a {

    /* renamed from: a */
    public int f956a;

    /* renamed from: b */
    public int f957b;

    /* renamed from: c */
    private final MaterialCardView f958c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo783a() {
        this.f958c.setForeground(m910b());
    }

    /* renamed from: b */
    private Drawable m910b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f958c.getRadius());
        if (this.f956a != -1) {
            gradientDrawable.setStroke(this.f957b, this.f956a);
        }
        return gradientDrawable;
    }

    /* renamed from: c */
    private void m911c() {
        this.f958c.mo5283a(this.f958c.getContentPaddingLeft() + this.f957b, this.f958c.getContentPaddingTop() + this.f957b, this.f958c.getContentPaddingRight() + this.f957b, this.f958c.getContentPaddingBottom() + this.f957b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo784a(int i) {
        this.f956a = i;
        mo783a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo785b(int i) {
        this.f957b = i;
        mo783a();
        m911c();
    }
}
