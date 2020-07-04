package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.content.res.C0700e.C0701a;
import android.support.p022v4.widget.C1036b;
import android.support.p022v4.widget.C1056n;
import android.support.p029v7.appcompat.R$styleable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.m */
final class C1418m {

    /* renamed from: a */
    private final TextView f5523a;

    /* renamed from: b */
    private C1363at f5524b;

    /* renamed from: c */
    private C1363at f5525c;

    /* renamed from: d */
    private C1363at f5526d;

    /* renamed from: e */
    private C1363at f5527e;

    /* renamed from: f */
    private C1363at f5528f;

    /* renamed from: g */
    private C1363at f5529g;

    /* renamed from: h */
    private final C1420n f5530h = new C1420n(this.f5523a);

    /* renamed from: i */
    private int f5531i;

    /* renamed from: j */
    private Typeface f5532j;

    /* renamed from: k */
    private boolean f5533k;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6558a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f5533k) {
            this.f5532j = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f5531i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6559a(boolean z) {
        this.f5523a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6560a(boolean z, int i, int i2, int i3, int i4) {
        if (!C1036b.f3605a) {
            mo6562b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6561a(int[] iArr, int i) throws IllegalArgumentException {
        this.f5530h.mo6574a(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo6563c() {
        return this.f5530h.mo6578e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo6564d() {
        return this.f5530h.f5538a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo6565e() {
        return this.f5530h.mo6569a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int mo6566f() {
        return this.f5530h.mo6575b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo6567g() {
        return this.f5530h.mo6576c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final int[] mo6568h() {
        return this.f5530h.f5539b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6562b() {
        this.f5530h.mo6577d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6552a() {
        if (!(this.f5524b == null && this.f5525c == null && this.f5526d == null && this.f5527e == null)) {
            Drawable[] compoundDrawables = this.f5523a.getCompoundDrawables();
            m7021a(compoundDrawables[0], this.f5524b);
            m7021a(compoundDrawables[1], this.f5525c);
            m7021a(compoundDrawables[2], this.f5526d);
            m7021a(compoundDrawables[3], this.f5527e);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f5528f != null || this.f5529g != null) {
            Drawable[] compoundDrawablesRelative = this.f5523a.getCompoundDrawablesRelative();
            m7021a(compoundDrawablesRelative[0], this.f5528f);
            m7021a(compoundDrawablesRelative[2], this.f5529g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6553a(int i) {
        this.f5530h.mo6570a(i);
    }

    C1418m(TextView textView) {
        this.f5523a = textView;
    }

    /* renamed from: b */
    private void m7022b(int i, float f) {
        this.f5530h.mo6571a(i, f);
    }

    /* renamed from: a */
    private void m7021a(Drawable drawable, C1363at atVar) {
        if (drawable != null && atVar != null) {
            C1393g.m6904a(drawable, atVar, this.f5523a.getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6554a(int i, float f) {
        if (!C1036b.f3605a && !mo6563c()) {
            m7022b(i, f);
        }
    }

    /* renamed from: a */
    private void m7020a(Context context, C1365av avVar) {
        this.f5531i = avVar.mo6390a(2, this.f5531i);
        int i = 10;
        boolean z = false;
        if (avVar.mo6406g(10) || avVar.mo6406g(11)) {
            this.f5532j = null;
            if (avVar.mo6406g(11)) {
                i = 11;
            }
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f5523a);
                try {
                    this.f5532j = avVar.mo6391a(i, this.f5531i, (C0701a) new C0701a() {
                        /* renamed from: a */
                        public final void mo1053a(int i) {
                        }

                        /* renamed from: a */
                        public final void mo1054a(Typeface typeface) {
                            C1418m.this.mo6558a(weakReference, typeface);
                        }
                    });
                    if (this.f5532j == null) {
                        z = true;
                    }
                    this.f5533k = z;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f5532j == null) {
                String d = avVar.mo6400d(i);
                if (d != null) {
                    this.f5532j = Typeface.create(d, this.f5531i);
                }
            }
            return;
        }
        if (avVar.mo6406g(1)) {
            this.f5533k = false;
            switch (avVar.mo6390a(1, 1)) {
                case 1:
                    this.f5532j = Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.f5532j = Typeface.SERIF;
                    return;
                case 3:
                    this.f5532j = Typeface.MONOSPACE;
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6556a(Context context, int i) {
        C1365av a = C1365av.m6742a(context, i, R$styleable.TextAppearance);
        if (a.mo6406g(12)) {
            mo6559a(a.mo6394a(12, false));
        }
        if (VERSION.SDK_INT < 23 && a.mo6406g(3)) {
            ColorStateList e = a.mo6402e(3);
            if (e != null) {
                this.f5523a.setTextColor(e);
            }
        }
        if (a.mo6406g(0) && a.mo6401e(0, -1) == 0) {
            this.f5523a.setTextSize(0, 0.0f);
        }
        m7020a(context, a);
        a.mo6393a();
        if (this.f5532j != null) {
            this.f5523a.setTypeface(this.f5532j, this.f5531i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6557a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        ColorStateList colorStateList3;
        boolean z3;
        boolean z4;
        ColorStateList colorStateList4;
        ColorStateList colorStateList5;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context = this.f5523a.getContext();
        C1393g a = C1393g.m6901a();
        C1365av a2 = C1365av.m6744a(context, attributeSet2, R$styleable.AppCompatTextHelper, i2, 0);
        int g = a2.mo6405g(0, -1);
        if (a2.mo6406g(3)) {
            this.f5524b = m7019a(context, a, a2.mo6405g(3, 0));
        }
        if (a2.mo6406g(1)) {
            this.f5525c = m7019a(context, a, a2.mo6405g(1, 0));
        }
        if (a2.mo6406g(4)) {
            this.f5526d = m7019a(context, a, a2.mo6405g(4, 0));
        }
        if (a2.mo6406g(2)) {
            this.f5527e = m7019a(context, a, a2.mo6405g(2, 0));
        }
        if (VERSION.SDK_INT >= 17) {
            if (a2.mo6406g(5)) {
                this.f5528f = m7019a(context, a, a2.mo6405g(5, 0));
            }
            if (a2.mo6406g(6)) {
                this.f5529g = m7019a(context, a, a2.mo6405g(6, 0));
            }
        }
        a2.mo6393a();
        boolean z5 = this.f5523a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            C1365av a3 = C1365av.m6742a(context, g, R$styleable.TextAppearance);
            if (z5 || !a3.mo6406g(12)) {
                z2 = false;
                z = false;
            } else {
                z = a3.mo6394a(12, false);
                z2 = true;
            }
            m7020a(context, a3);
            if (VERSION.SDK_INT < 23) {
                if (a3.mo6406g(3)) {
                    colorStateList5 = a3.mo6402e(3);
                } else {
                    colorStateList5 = null;
                }
                if (a3.mo6406g(4)) {
                    colorStateList = a3.mo6402e(4);
                } else {
                    colorStateList = null;
                }
                if (a3.mo6406g(5)) {
                    colorStateList4 = a3.mo6402e(5);
                } else {
                    colorStateList4 = null;
                }
            } else {
                colorStateList5 = null;
                colorStateList4 = null;
                colorStateList = null;
            }
            a3.mo6393a();
            colorStateList3 = colorStateList4;
            colorStateList2 = colorStateList5;
        } else {
            colorStateList3 = null;
            z2 = false;
            z = false;
            colorStateList2 = null;
            colorStateList = null;
        }
        C1365av a4 = C1365av.m6744a(context, attributeSet2, R$styleable.TextAppearance, i2, 0);
        if (z5 || !a4.mo6406g(12)) {
            z3 = z2;
            z4 = z;
        } else {
            z4 = a4.mo6394a(12, false);
            z3 = true;
        }
        if (VERSION.SDK_INT < 23) {
            if (a4.mo6406g(3)) {
                colorStateList2 = a4.mo6402e(3);
            }
            if (a4.mo6406g(4)) {
                colorStateList = a4.mo6402e(4);
            }
            if (a4.mo6406g(5)) {
                colorStateList3 = a4.mo6402e(5);
            }
        }
        ColorStateList colorStateList6 = colorStateList3;
        ColorStateList colorStateList7 = colorStateList2;
        ColorStateList colorStateList8 = colorStateList;
        if (VERSION.SDK_INT >= 28 && a4.mo6406g(0) && a4.mo6401e(0, -1) == 0) {
            this.f5523a.setTextSize(0, 0.0f);
        }
        m7020a(context, a4);
        a4.mo6393a();
        if (colorStateList7 != null) {
            this.f5523a.setTextColor(colorStateList7);
        }
        if (colorStateList8 != null) {
            this.f5523a.setHintTextColor(colorStateList8);
        }
        if (colorStateList6 != null) {
            this.f5523a.setLinkTextColor(colorStateList6);
        }
        if (!z5 && z3) {
            mo6559a(z4);
        }
        if (this.f5532j != null) {
            this.f5523a.setTypeface(this.f5532j, this.f5531i);
        }
        this.f5530h.mo6573a(attributeSet2, i2);
        if (C1036b.f3605a && this.f5530h.f5538a != 0) {
            int[] iArr = this.f5530h.f5539b;
            if (iArr.length > 0) {
                if (((float) this.f5523a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f5523a.setAutoSizeTextTypeUniformWithConfiguration(this.f5530h.mo6575b(), this.f5530h.mo6576c(), this.f5530h.mo6569a(), 0);
                } else {
                    this.f5523a.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
                }
            }
        }
        C1365av a5 = C1365av.m6743a(context, attributeSet2, R$styleable.AppCompatTextView);
        int e = a5.mo6401e(6, -1);
        int e2 = a5.mo6401e(8, -1);
        int e3 = a5.mo6401e(9, -1);
        a5.mo6393a();
        if (e != -1) {
            C1056n.m4572b(this.f5523a, e);
        }
        if (e2 != -1) {
            C1056n.m4575c(this.f5523a, e2);
        }
        if (e3 != -1) {
            C1056n.m4577d(this.f5523a, e3);
        }
    }

    /* renamed from: a */
    private static C1363at m7019a(Context context, C1393g gVar, int i) {
        ColorStateList b = gVar.mo6491b(context, i);
        if (b == null) {
            return null;
        }
        C1363at atVar = new C1363at();
        atVar.f5345d = true;
        atVar.f5342a = b;
        return atVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6555a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f5530h.mo6572a(i, i2, i3, i4);
    }
}
