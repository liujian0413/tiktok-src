package android.support.design.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.internal.C0297c;
import android.support.design.p019e.C0272a;
import android.support.design.p020f.C0276a;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.C0991u;

/* renamed from: android.support.design.button.b */
final class C0253b {

    /* renamed from: h */
    private static final boolean f932h;

    /* renamed from: a */
    public int f933a;

    /* renamed from: b */
    public int f934b;

    /* renamed from: c */
    public Mode f935c;

    /* renamed from: d */
    public ColorStateList f936d;

    /* renamed from: e */
    public ColorStateList f937e;

    /* renamed from: f */
    public ColorStateList f938f;

    /* renamed from: g */
    public boolean f939g = false;

    /* renamed from: i */
    private final MaterialButton f940i;

    /* renamed from: j */
    private int f941j;

    /* renamed from: k */
    private int f942k;

    /* renamed from: l */
    private int f943l;

    /* renamed from: m */
    private int f944m;

    /* renamed from: n */
    private final Paint f945n = new Paint(1);

    /* renamed from: o */
    private final Rect f946o = new Rect();

    /* renamed from: p */
    private final RectF f947p = new RectF();

    /* renamed from: q */
    private GradientDrawable f948q;

    /* renamed from: r */
    private Drawable f949r;

    /* renamed from: s */
    private GradientDrawable f950s;

    /* renamed from: t */
    private Drawable f951t;

    /* renamed from: u */
    private GradientDrawable f952u;

    /* renamed from: v */
    private GradientDrawable f953v;

    /* renamed from: w */
    private GradientDrawable f954w;

    static {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f932h = z;
    }

    /* renamed from: c */
    private void m893c() {
        if (this.f952u != null) {
            C0727a.m3105a((Drawable) this.f952u, this.f936d);
            if (this.f935c != null) {
                C0727a.m3108a((Drawable) this.f952u, this.f935c);
            }
        }
    }

    /* renamed from: e */
    private void m895e() {
        if (!f932h || this.f953v == null) {
            if (!f932h) {
                this.f940i.invalidate();
            }
            return;
        }
        this.f940i.setInternalBackground(m894d());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo767a() {
        this.f939g = true;
        this.f940i.setSupportBackgroundTintList(this.f936d);
        this.f940i.setSupportBackgroundTintMode(this.f935c);
    }

    /* renamed from: f */
    private GradientDrawable m896f() {
        if (!f932h || this.f940i.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f940i.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    /* renamed from: g */
    private GradientDrawable m897g() {
        if (!f932h || this.f940i.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f940i.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    /* renamed from: b */
    private Drawable m892b() {
        this.f948q = new GradientDrawable();
        this.f948q.setCornerRadius(((float) this.f933a) + 1.0E-5f);
        this.f948q.setColor(-1);
        this.f949r = C0727a.m3116g(this.f948q);
        C0727a.m3105a(this.f949r, this.f936d);
        if (this.f935c != null) {
            C0727a.m3108a(this.f949r, this.f935c);
        }
        this.f950s = new GradientDrawable();
        this.f950s.setCornerRadius(((float) this.f933a) + 1.0E-5f);
        this.f950s.setColor(-1);
        this.f951t = C0727a.m3116g(this.f950s);
        C0727a.m3105a(this.f951t, this.f938f);
        return m891a((Drawable) new LayerDrawable(new Drawable[]{this.f949r, this.f951t}));
    }

    /* renamed from: d */
    private Drawable m894d() {
        this.f952u = new GradientDrawable();
        this.f952u.setCornerRadius(((float) this.f933a) + 1.0E-5f);
        this.f952u.setColor(-1);
        m893c();
        this.f953v = new GradientDrawable();
        this.f953v.setCornerRadius(((float) this.f933a) + 1.0E-5f);
        this.f953v.setColor(0);
        this.f953v.setStroke(this.f934b, this.f937e);
        InsetDrawable a = m891a((Drawable) new LayerDrawable(new Drawable[]{this.f952u, this.f953v}));
        this.f954w = new GradientDrawable();
        this.f954w.setCornerRadius(((float) this.f933a) + 1.0E-5f);
        this.f954w.setColor(-1);
        return new C0252a(C0276a.m1088a(this.f938f), a, this.f954w);
    }

    /* renamed from: a */
    private InsetDrawable m891a(Drawable drawable) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, this.f941j, this.f943l, this.f942k, this.f944m);
        return insetDrawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo774b(int i) {
        if (this.f934b != i) {
            this.f934b = i;
            this.f945n.setStrokeWidth((float) i);
            m895e();
        }
    }

    public C0253b(MaterialButton materialButton) {
        this.f940i = materialButton;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo768a(int i) {
        if (!f932h || this.f952u == null) {
            if (!f932h && this.f948q != null) {
                this.f948q.setColor(i);
            }
            return;
        }
        this.f952u.setColor(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo775b(ColorStateList colorStateList) {
        if (this.f938f != colorStateList) {
            this.f938f = colorStateList;
            if (f932h && (this.f940i.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f940i.getBackground()).setColor(colorStateList);
            } else if (!f932h && this.f951t != null) {
                C0727a.m3105a(this.f951t, colorStateList);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo777c(ColorStateList colorStateList) {
        if (this.f937e != colorStateList) {
            this.f937e = colorStateList;
            Paint paint = this.f945n;
            int i = 0;
            if (colorStateList != null) {
                i = colorStateList.getColorForState(this.f940i.getDrawableState(), 0);
            }
            paint.setColor(i);
            m895e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo776c(int i) {
        if (this.f933a != i) {
            this.f933a = i;
            if (f932h && this.f952u != null && this.f953v != null && this.f954w != null) {
                if (VERSION.SDK_INT == 21) {
                    float f = ((float) i) + 1.0E-5f;
                    m897g().setCornerRadius(f);
                    m896f().setCornerRadius(f);
                }
                float f2 = ((float) i) + 1.0E-5f;
                this.f952u.setCornerRadius(f2);
                this.f953v.setCornerRadius(f2);
                this.f954w.setCornerRadius(f2);
            } else if (!(f932h || this.f948q == null || this.f950s == null)) {
                float f3 = ((float) i) + 1.0E-5f;
                this.f948q.setCornerRadius(f3);
                this.f950s.setCornerRadius(f3);
                this.f940i.invalidate();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo770a(ColorStateList colorStateList) {
        if (this.f936d != colorStateList) {
            this.f936d = colorStateList;
            if (f932h) {
                m893c();
            } else if (this.f949r != null) {
                C0727a.m3105a(this.f949r, this.f936d);
            }
        }
    }

    /* renamed from: a */
    public final void mo771a(TypedArray typedArray) {
        Drawable drawable;
        int i = 0;
        this.f941j = typedArray.getDimensionPixelOffset(0, 0);
        this.f942k = typedArray.getDimensionPixelOffset(1, 0);
        this.f943l = typedArray.getDimensionPixelOffset(2, 0);
        this.f944m = typedArray.getDimensionPixelOffset(3, 0);
        this.f933a = typedArray.getDimensionPixelSize(6, 0);
        this.f934b = typedArray.getDimensionPixelSize(15, 0);
        this.f935c = C0297c.m1177a(typedArray.getInt(5, -1), Mode.SRC_IN);
        this.f936d = C0272a.m1075a(this.f940i.getContext(), typedArray, 4);
        this.f937e = C0272a.m1075a(this.f940i.getContext(), typedArray, 14);
        this.f938f = C0272a.m1075a(this.f940i.getContext(), typedArray, 13);
        this.f945n.setStyle(Style.STROKE);
        this.f945n.setStrokeWidth((float) this.f934b);
        Paint paint = this.f945n;
        if (this.f937e != null) {
            i = this.f937e.getColorForState(this.f940i.getDrawableState(), 0);
        }
        paint.setColor(i);
        int k = C0991u.m4229k(this.f940i);
        int paddingTop = this.f940i.getPaddingTop();
        int l = C0991u.m4232l(this.f940i);
        int paddingBottom = this.f940i.getPaddingBottom();
        MaterialButton materialButton = this.f940i;
        if (f932h) {
            drawable = m894d();
        } else {
            drawable = m892b();
        }
        materialButton.setInternalBackground(drawable);
        C0991u.m4202b(this.f940i, k + this.f941j, paddingTop + this.f943l, l + this.f942k, paddingBottom + this.f944m);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo772a(Canvas canvas) {
        if (canvas != null && this.f937e != null && this.f934b > 0) {
            this.f946o.set(this.f940i.getBackground().getBounds());
            this.f947p.set(((float) this.f946o.left) + (((float) this.f934b) / 2.0f) + ((float) this.f941j), ((float) this.f946o.top) + (((float) this.f934b) / 2.0f) + ((float) this.f943l), (((float) this.f946o.right) - (((float) this.f934b) / 2.0f)) - ((float) this.f942k), (((float) this.f946o.bottom) - (((float) this.f934b) / 2.0f)) - ((float) this.f944m));
            float f = ((float) this.f933a) - (((float) this.f934b) / 2.0f);
            canvas.drawRoundRect(this.f947p, f, f, this.f945n);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo773a(Mode mode) {
        if (this.f935c != mode) {
            this.f935c = mode;
            if (f932h) {
                m893c();
            } else if (!(this.f949r == null || this.f935c == null)) {
                C0727a.m3108a(this.f949r, this.f935c);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo769a(int i, int i2) {
        if (this.f954w != null) {
            this.f954w.setBounds(this.f941j, this.f943l, i2 - this.f942k, i - this.f944m);
        }
    }
}
