package android.support.p029v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.p022v4.widget.C1052j;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.i */
public final class C1414i {

    /* renamed from: a */
    private final ImageView f5508a;

    /* renamed from: b */
    private C1363at f5509b;

    /* renamed from: c */
    private C1363at f5510c;

    /* renamed from: d */
    private C1363at f5511d;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ColorStateList mo6542b() {
        if (this.f5510c != null) {
            return this.f5510c.f5342a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Mode mo6543c() {
        if (this.f5510c != null) {
            return this.f5510c.f5343b;
        }
        return null;
    }

    /* renamed from: e */
    private boolean m6998e() {
        int i = VERSION.SDK_INT;
        if (i > 21) {
            if (this.f5509b != null) {
                return true;
            }
            return false;
        } else if (i == 21) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo6544d() {
        Drawable drawable = this.f5508a.getDrawable();
        if (drawable != null) {
            C1433w.m7202b(drawable);
        }
        if (drawable != null && (!m6998e() || !m6997a(drawable))) {
            if (this.f5510c != null) {
                C1393g.m6904a(drawable, this.f5510c, this.f5508a.getDrawableState());
                return;
            }
            if (this.f5509b != null) {
                C1393g.m6904a(drawable, this.f5509b, this.f5508a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6541a() {
        Drawable background = this.f5508a.getBackground();
        if (VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public C1414i(ImageView imageView) {
        this.f5508a = imageView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6538a(ColorStateList colorStateList) {
        if (this.f5510c == null) {
            this.f5510c = new C1363at();
        }
        this.f5510c.f5342a = colorStateList;
        this.f5510c.f5345d = true;
        mo6544d();
    }

    /* renamed from: a */
    private boolean m6997a(Drawable drawable) {
        if (this.f5511d == null) {
            this.f5511d = new C1363at();
        }
        C1363at atVar = this.f5511d;
        atVar.mo6388a();
        ColorStateList a = C1052j.m4545a(this.f5508a);
        if (a != null) {
            atVar.f5345d = true;
            atVar.f5342a = a;
        }
        Mode b = C1052j.m4548b(this.f5508a);
        if (b != null) {
            atVar.f5344c = true;
            atVar.f5343b = b;
        }
        if (!atVar.f5345d && !atVar.f5344c) {
            return false;
        }
        C1393g.m6904a(drawable, atVar, this.f5508a.getDrawableState());
        return true;
    }

    /* renamed from: a */
    public final void mo6537a(int i) {
        if (i != 0) {
            Drawable b = C1065a.m4641b(this.f5508a.getContext(), i);
            if (b != null) {
                C1433w.m7202b(b);
            }
            this.f5508a.setImageDrawable(b);
        } else {
            this.f5508a.setImageDrawable(null);
        }
        mo6544d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6539a(Mode mode) {
        if (this.f5510c == null) {
            this.f5510c = new C1363at();
        }
        this.f5510c.f5343b = mode;
        this.f5510c.f5344c = true;
        mo6544d();
    }

    /* renamed from: a */
    public final void mo6540a(AttributeSet attributeSet, int i) {
        C1365av a = C1365av.m6744a(this.f5508a.getContext(), attributeSet, R$styleable.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f5508a.getDrawable();
            if (drawable == null) {
                int g = a.mo6405g(1, -1);
                if (g != -1) {
                    drawable = C1065a.m4641b(this.f5508a.getContext(), g);
                    if (drawable != null) {
                        this.f5508a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C1433w.m7202b(drawable);
            }
            if (a.mo6406g(2)) {
                C1052j.m4546a(this.f5508a, a.mo6402e(2));
            }
            if (a.mo6406g(3)) {
                C1052j.m4547a(this.f5508a, C1433w.m7200a(a.mo6390a(3, -1), null));
            }
        } finally {
            a.mo6393a();
        }
    }
}
