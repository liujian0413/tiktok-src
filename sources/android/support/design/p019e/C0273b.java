package android.support.design.p019e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.design.R$styleable;
import android.support.p022v4.content.res.C0700e;
import android.support.p022v4.content.res.C0700e.C0701a;
import android.text.TextPaint;

/* renamed from: android.support.design.e.b */
public final class C0273b {

    /* renamed from: a */
    public final float f1059a;

    /* renamed from: b */
    public final ColorStateList f1060b;

    /* renamed from: c */
    public final ColorStateList f1061c;

    /* renamed from: d */
    public final ColorStateList f1062d;

    /* renamed from: e */
    public final int f1063e;

    /* renamed from: f */
    public final int f1064f;

    /* renamed from: g */
    public final String f1065g;

    /* renamed from: h */
    public final boolean f1066h;

    /* renamed from: i */
    public final ColorStateList f1067i;

    /* renamed from: j */
    public final float f1068j;

    /* renamed from: k */
    public final float f1069k;

    /* renamed from: l */
    public final float f1070l;

    /* renamed from: m */
    public boolean f1071m;

    /* renamed from: n */
    public Typeface f1072n;

    /* renamed from: o */
    private final int f1073o;

    /* renamed from: a */
    public final void mo1049a() {
        if (this.f1072n == null) {
            this.f1072n = Typeface.create(this.f1065g, this.f1063e);
        }
        if (this.f1072n == null) {
            switch (this.f1064f) {
                case 1:
                    this.f1072n = Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.f1072n = Typeface.SERIF;
                    break;
                case 3:
                    this.f1072n = Typeface.MONOSPACE;
                    break;
                default:
                    this.f1072n = Typeface.DEFAULT;
                    break;
            }
            if (this.f1072n != null) {
                this.f1072n = Typeface.create(this.f1072n, this.f1063e);
            }
        }
    }

    /* renamed from: a */
    private Typeface m1077a(Context context) {
        if (this.f1071m) {
            return this.f1072n;
        }
        if (!context.isRestricted()) {
            try {
                this.f1072n = C0700e.m2977a(context, this.f1073o);
                if (this.f1072n != null) {
                    this.f1072n = Typeface.create(this.f1072n, this.f1063e);
                }
            } catch (NotFoundException | Exception | UnsupportedOperationException unused) {
            }
        }
        mo1049a();
        this.f1071m = true;
        return this.f1072n;
    }

    public C0273b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
        this.f1059a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f1060b = C0272a.m1075a(context, obtainStyledAttributes, 3);
        this.f1061c = C0272a.m1075a(context, obtainStyledAttributes, 4);
        this.f1062d = C0272a.m1075a(context, obtainStyledAttributes, 5);
        this.f1063e = obtainStyledAttributes.getInt(2, 0);
        this.f1064f = obtainStyledAttributes.getInt(1, 1);
        int a = C0272a.m1074a(obtainStyledAttributes, 11, 10);
        this.f1073o = obtainStyledAttributes.getResourceId(a, 0);
        this.f1065g = obtainStyledAttributes.getString(a);
        this.f1066h = obtainStyledAttributes.getBoolean(12, false);
        this.f1067i = C0272a.m1075a(context, obtainStyledAttributes, 6);
        this.f1068j = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f1069k = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f1070l = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo1051a(TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.f1063e;
        if ((style & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((style & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f1059a);
    }

    /* renamed from: b */
    public final void mo1052b(Context context, TextPaint textPaint, C0701a aVar) {
        if (C0275c.m1085a()) {
            mo1051a(textPaint, m1077a(context));
            return;
        }
        m1078c(context, textPaint, aVar);
        if (!this.f1071m) {
            mo1051a(textPaint, this.f1072n);
        }
    }

    /* renamed from: c */
    private void m1078c(Context context, final TextPaint textPaint, final C0701a aVar) {
        if (this.f1071m) {
            mo1051a(textPaint, this.f1072n);
            return;
        }
        mo1049a();
        if (context.isRestricted()) {
            this.f1071m = true;
            mo1051a(textPaint, this.f1072n);
            return;
        }
        try {
            C0700e.m2982a(context, this.f1073o, new C0701a() {
                /* renamed from: a */
                public final void mo1053a(int i) {
                    C0273b.this.mo1049a();
                    C0273b.this.f1071m = true;
                    aVar.mo1053a(i);
                }

                /* renamed from: a */
                public final void mo1054a(Typeface typeface) {
                    C0273b.this.f1072n = Typeface.create(typeface, C0273b.this.f1063e);
                    C0273b.this.mo1051a(textPaint, typeface);
                    C0273b.this.f1071m = true;
                    aVar.mo1054a(typeface);
                }
            }, null);
        } catch (NotFoundException | UnsupportedOperationException unused) {
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public final void mo1050a(Context context, TextPaint textPaint, C0701a aVar) {
        int i;
        int i2;
        mo1052b(context, textPaint, aVar);
        if (this.f1060b != null) {
            i = this.f1060b.getColorForState(textPaint.drawableState, this.f1060b.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.f1070l;
        float f2 = this.f1068j;
        float f3 = this.f1069k;
        if (this.f1067i != null) {
            i2 = this.f1067i.getColorForState(textPaint.drawableState, this.f1067i.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }
}
