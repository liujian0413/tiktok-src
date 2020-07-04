package android.support.p029v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.d */
final class C1390d {

    /* renamed from: a */
    private final View f5421a;

    /* renamed from: b */
    private final C1393g f5422b;

    /* renamed from: c */
    private int f5423c = -1;

    /* renamed from: d */
    private C1363at f5424d;

    /* renamed from: e */
    private C1363at f5425e;

    /* renamed from: f */
    private C1363at f5426f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ColorStateList mo6474a() {
        if (this.f5425e != null) {
            return this.f5425e.f5342a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Mode mo6480b() {
        if (this.f5425e != null) {
            return this.f5425e.f5343b;
        }
        return null;
    }

    /* renamed from: d */
    private boolean m6879d() {
        int i = VERSION.SDK_INT;
        if (i > 21) {
            if (this.f5424d != null) {
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
    /* renamed from: c */
    public final void mo6481c() {
        Drawable background = this.f5421a.getBackground();
        if (background != null && (!m6879d() || !m6878b(background))) {
            if (this.f5425e != null) {
                C1393g.m6904a(background, this.f5425e, this.f5421a.getDrawableState());
                return;
            }
            if (this.f5424d != null) {
                C1393g.m6904a(background, this.f5424d, this.f5421a.getDrawableState());
            }
        }
    }

    C1390d(View view) {
        this.f5421a = view;
        this.f5422b = C1393g.m6901a();
    }

    /* renamed from: b */
    private void m6877b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f5424d == null) {
                this.f5424d = new C1363at();
            }
            this.f5424d.f5342a = colorStateList;
            this.f5424d.f5345d = true;
        } else {
            this.f5424d = null;
        }
        mo6481c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6475a(int i) {
        ColorStateList colorStateList;
        this.f5423c = i;
        if (this.f5422b != null) {
            colorStateList = this.f5422b.mo6491b(this.f5421a.getContext(), i);
        } else {
            colorStateList = null;
        }
        m6877b(colorStateList);
        mo6481c();
    }

    /* renamed from: b */
    private boolean m6878b(Drawable drawable) {
        if (this.f5426f == null) {
            this.f5426f = new C1363at();
        }
        C1363at atVar = this.f5426f;
        atVar.mo6388a();
        ColorStateList z = C0991u.m4247z(this.f5421a);
        if (z != null) {
            atVar.f5345d = true;
            atVar.f5342a = z;
        }
        Mode A = C0991u.m4164A(this.f5421a);
        if (A != null) {
            atVar.f5344c = true;
            atVar.f5343b = A;
        }
        if (!atVar.f5345d && !atVar.f5344c) {
            return false;
        }
        C1393g.m6904a(drawable, atVar, this.f5421a.getDrawableState());
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6476a(ColorStateList colorStateList) {
        if (this.f5425e == null) {
            this.f5425e = new C1363at();
        }
        this.f5425e.f5342a = colorStateList;
        this.f5425e.f5345d = true;
        mo6481c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6477a(Mode mode) {
        if (this.f5425e == null) {
            this.f5425e = new C1363at();
        }
        this.f5425e.f5343b = mode;
        this.f5425e.f5344c = true;
        mo6481c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6478a(Drawable drawable) {
        this.f5423c = -1;
        m6877b((ColorStateList) null);
        mo6481c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6479a(AttributeSet attributeSet, int i) {
        C1365av a = C1365av.m6744a(this.f5421a.getContext(), attributeSet, R$styleable.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo6406g(0)) {
                this.f5423c = a.mo6405g(0, -1);
                ColorStateList b = this.f5422b.mo6491b(this.f5421a.getContext(), this.f5423c);
                if (b != null) {
                    m6877b(b);
                }
            }
            if (a.mo6406g(1)) {
                C0991u.m4181a(this.f5421a, a.mo6402e(1));
            }
            if (a.mo6406g(2)) {
                C0991u.m4183a(this.f5421a, C1433w.m7200a(a.mo6390a(2, -1), null));
            }
        } finally {
            a.mo6393a();
        }
    }
}
