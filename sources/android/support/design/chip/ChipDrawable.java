package android.support.design.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.design.p015a.C0241h;
import android.support.design.p016b.C0244a;
import android.support.design.p017c.C0254a;
import android.support.design.p019e.C0273b;
import android.support.design.p020f.C0276a;
import android.support.p022v4.content.res.C0700e.C0701a;
import android.support.p022v4.graphics.C0721a;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.graphics.drawable.C0732e;
import android.support.p022v4.p026d.C0705a;
import android.support.p029v7.p030a.p031a.C1065a;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class ChipDrawable extends Drawable implements Callback, C0732e {

    /* renamed from: I */
    private static final int[] f975I = {16842910};

    /* renamed from: A */
    public float f976A;

    /* renamed from: B */
    public float f977B;

    /* renamed from: C */
    public int[] f978C;

    /* renamed from: D */
    public boolean f979D;

    /* renamed from: E */
    public boolean f980E;

    /* renamed from: F */
    public TruncateAt f981F;

    /* renamed from: G */
    public boolean f982G;

    /* renamed from: H */
    public int f983H;

    /* renamed from: J */
    private CharSequence f984J;

    /* renamed from: K */
    private final C0701a f985K;

    /* renamed from: L */
    private Drawable f986L;

    /* renamed from: M */
    private Drawable f987M;

    /* renamed from: N */
    private final Context f988N;

    /* renamed from: O */
    private final TextPaint f989O;

    /* renamed from: P */
    private final Paint f990P;

    /* renamed from: Q */
    private final Paint f991Q;

    /* renamed from: R */
    private final FontMetrics f992R;

    /* renamed from: S */
    private final RectF f993S;

    /* renamed from: T */
    private final PointF f994T;

    /* renamed from: U */
    private int f995U;

    /* renamed from: V */
    private int f996V;

    /* renamed from: W */
    private int f997W;

    /* renamed from: X */
    private int f998X;

    /* renamed from: Y */
    private boolean f999Y;

    /* renamed from: Z */
    private int f1000Z;

    /* renamed from: a */
    public ColorStateList f1001a;

    /* renamed from: aa */
    private int f1002aa;

    /* renamed from: ab */
    private ColorFilter f1003ab;

    /* renamed from: ac */
    private PorterDuffColorFilter f1004ac;

    /* renamed from: ad */
    private ColorStateList f1005ad;

    /* renamed from: ae */
    private Mode f1006ae;

    /* renamed from: af */
    private ColorStateList f1007af;

    /* renamed from: ag */
    private WeakReference<C0257a> f1008ag;

    /* renamed from: ah */
    private float f1009ah;

    /* renamed from: b */
    public float f1010b;

    /* renamed from: c */
    public float f1011c;

    /* renamed from: d */
    public ColorStateList f1012d;

    /* renamed from: e */
    public float f1013e;

    /* renamed from: f */
    public ColorStateList f1014f;

    /* renamed from: g */
    public CharSequence f1015g;

    /* renamed from: h */
    public C0273b f1016h;

    /* renamed from: i */
    public boolean f1017i;

    /* renamed from: j */
    public ColorStateList f1018j;

    /* renamed from: k */
    public float f1019k;

    /* renamed from: l */
    public boolean f1020l;

    /* renamed from: m */
    public ColorStateList f1021m;

    /* renamed from: n */
    public float f1022n;

    /* renamed from: o */
    public CharSequence f1023o;

    /* renamed from: p */
    public boolean f1024p;

    /* renamed from: q */
    public boolean f1025q;

    /* renamed from: r */
    public Drawable f1026r;

    /* renamed from: s */
    public C0241h f1027s;

    /* renamed from: t */
    public C0241h f1028t;

    /* renamed from: u */
    public float f1029u;

    /* renamed from: v */
    public float f1030v;

    /* renamed from: w */
    public float f1031w;

    /* renamed from: x */
    public float f1032x;

    /* renamed from: y */
    public float f1033y;

    /* renamed from: z */
    public float f1034z;

    /* renamed from: android.support.design.chip.ChipDrawable$a */
    public interface C0257a {
        /* renamed from: a */
        void mo786a();
    }

    public int getAlpha() {
        return this.f1002aa;
    }

    public ColorFilter getColorFilter() {
        return this.f1003ab;
    }

    public int getIntrinsicHeight() {
        return (int) this.f1010b;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    public final void mo937a(boolean z) {
        if (this.f979D != z) {
            this.f979D = z;
            m963n();
            onStateChange(getState());
        }
    }

    /* renamed from: a */
    public final void mo934a(C0257a aVar) {
        this.f1008ag = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final boolean mo938a(int[] iArr) {
        if (!Arrays.equals(this.f978C, iArr)) {
            this.f978C = iArr;
            if (m957h()) {
                return m936a(getState(), iArr);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo931a(ColorStateList colorStateList) {
        if (this.f1001a != colorStateList) {
            this.f1001a = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: a */
    public final void mo936a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.f1015g != charSequence) {
            this.f1015g = charSequence;
            this.f984J = C0705a.m2998a().mo2850a(charSequence);
            this.f980E = true;
            invalidateSelf();
            m946e();
        }
    }

    /* renamed from: a */
    public final void mo935a(C0273b bVar) {
        if (this.f1016h != bVar) {
            this.f1016h = bVar;
            if (bVar != null) {
                bVar.mo1052b(this.f988N, this.f989O, this.f985K);
                this.f980E = true;
            }
            onStateChange(getState());
            m946e();
        }
    }

    /* renamed from: b */
    public final void mo944b(boolean z) {
        if (this.f1017i != z) {
            boolean f = m952f();
            this.f1017i = z;
            boolean f2 = m952f();
            if (f != f2) {
                if (f2) {
                    m951f(this.f986L);
                } else {
                    m949e(this.f986L);
                }
                invalidateSelf();
                m946e();
            }
        }
    }

    /* renamed from: a */
    public final void mo933a(Drawable drawable) {
        Drawable c = mo946c();
        if (c != drawable) {
            float a = mo928a();
            this.f986L = drawable != null ? C0727a.m3116g(drawable).mutate() : null;
            float a2 = mo928a();
            m949e(c);
            if (m952f()) {
                m951f(this.f986L);
            }
            invalidateSelf();
            if (a != a2) {
                m946e();
            }
        }
    }

    /* renamed from: c */
    public final void mo951c(boolean z) {
        if (this.f1020l != z) {
            boolean h = m957h();
            this.f1020l = z;
            boolean h2 = m957h();
            if (h != h2) {
                if (h2) {
                    m951f(this.f987M);
                } else {
                    m949e(this.f987M);
                }
                invalidateSelf();
                m946e();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo945b() {
        return m945d(this.f987M);
    }

    /* renamed from: e */
    private void m946e() {
        C0257a aVar = (C0257a) this.f1008ag.get();
        if (aVar != null) {
            aVar.mo786a();
        }
    }

    /* renamed from: f */
    private boolean m952f() {
        if (!this.f1017i || this.f986L == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private boolean m955g() {
        if (!this.f1025q || this.f1026r == null || !this.f999Y) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m957h() {
        if (!this.f1020l || this.f987M == null) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m958i() {
        if (!this.f1025q || this.f1026r == null || !this.f1024p) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private ColorFilter m962m() {
        if (this.f1003ab != null) {
            return this.f1003ab;
        }
        return this.f1004ac;
    }

    /* renamed from: n */
    private void m963n() {
        ColorStateList colorStateList;
        if (this.f979D) {
            colorStateList = C0276a.m1088a(this.f1014f);
        } else {
            colorStateList = null;
        }
        this.f1007af = colorStateList;
    }

    /* renamed from: j */
    private float m959j() {
        if (!this.f980E) {
            return this.f1009ah;
        }
        this.f1009ah = m940c(this.f984J);
        this.f980E = false;
        return this.f1009ah;
    }

    /* renamed from: k */
    private float m960k() {
        if (m957h()) {
            return this.f1034z + this.f1022n + this.f976A;
        }
        return 0.0f;
    }

    /* renamed from: l */
    private float m961l() {
        this.f989O.getFontMetrics(this.f992R);
        return (this.f992R.descent + this.f992R.ascent) / 2.0f;
    }

    /* renamed from: d */
    public final Drawable mo952d() {
        if (this.f987M != null) {
            return C0727a.m3117h(this.f987M);
        }
        return null;
    }

    /* renamed from: c */
    public final Drawable mo946c() {
        if (this.f986L != null) {
            return C0727a.m3117h(this.f986L);
        }
        return null;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f1029u + mo928a() + this.f1032x + m959j() + this.f1033y + m960k() + this.f977B), this.f983H);
    }

    public boolean isStateful() {
        if (m953f(this.f1001a) || m953f(this.f1012d) || ((this.f979D && m953f(this.f1007af)) || m939b(this.f1016h) || m958i() || m945d(this.f986L) || m945d(this.f1026r) || m953f(this.f1005ad))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo928a() {
        if (m952f() || m955g()) {
            return this.f1030v + this.f1019k + this.f1031w;
        }
        return 0.0f;
    }

    /* renamed from: e */
    private static void m949e(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: a */
    public final void mo932a(RectF rectF) {
        m948e(getBounds(), rectF);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return m936a(iArr, this.f978C);
    }

    /* renamed from: c */
    private float m940c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f989O.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    private static boolean m945d(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public final void mo926A(int i) {
        mo982l(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: B */
    public final void mo927B(int i) {
        mo984m(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: a */
    public final void mo929a(float f) {
        if (this.f1010b != f) {
            this.f1010b = f;
            invalidateSelf();
            m946e();
        }
    }

    /* renamed from: b */
    public final void mo939b(float f) {
        if (this.f1011c != f) {
            this.f1011c = f;
            invalidateSelf();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* renamed from: j */
    public final void mo978j(float f) {
        if (this.f1033y != f) {
            this.f1033y = f;
            invalidateSelf();
            m946e();
        }
    }

    /* renamed from: k */
    public final void mo981k(int i) {
        mo953d(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: l */
    public final void mo983l(int i) {
        mo951c(this.f988N.getResources().getBoolean(i));
    }

    /* renamed from: o */
    public final void mo987o(int i) {
        mo958e(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: p */
    public final void mo991p(int i) {
        mo956d(this.f988N.getResources().getBoolean(i));
    }

    /* renamed from: q */
    public final void mo992q(int i) {
        mo961e(this.f988N.getResources().getBoolean(i));
    }

    /* renamed from: r */
    public final void mo993r(int i) {
        mo950c(C1065a.m4641b(this.f988N, i));
    }

    /* renamed from: s */
    public final void mo994s(int i) {
        this.f1027s = C0241h.m842a(this.f988N, i);
    }

    public void setAlpha(int i) {
        if (this.f1002aa != i) {
            this.f1002aa = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f1003ab != colorFilter) {
            this.f1003ab = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f1005ad != colorStateList) {
            this.f1005ad = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: t */
    public final void mo1001t(int i) {
        this.f1028t = C0241h.m842a(this.f988N, i);
    }

    /* renamed from: u */
    public final void mo1002u(int i) {
        mo962f(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: v */
    public final void mo1004v(int i) {
        mo964g(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: w */
    public final void mo1005w(int i) {
        mo972h(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: x */
    public final void mo1006x(int i) {
        mo974i(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: y */
    public final void mo1007y(int i) {
        mo978j(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: z */
    public final void mo1008z(int i) {
        mo980k(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: b */
    private static boolean m939b(C0273b bVar) {
        if (bVar == null || bVar.f1060b == null || !bVar.f1060b.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m953f(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo958e(float f) {
        if (this.f1022n != f) {
            this.f1022n = f;
            invalidateSelf();
            if (m957h()) {
                m946e();
            }
        }
    }

    /* renamed from: g */
    public final void mo964g(float f) {
        if (this.f1030v != f) {
            float a = mo928a();
            this.f1030v = f;
            float a2 = mo928a();
            invalidateSelf();
            if (a != a2) {
                m946e();
            }
        }
    }

    /* renamed from: h */
    public final void mo972h(float f) {
        if (this.f1031w != f) {
            float a = mo928a();
            this.f1031w = f;
            float a2 = mo928a();
            invalidateSelf();
            if (a != a2) {
                m946e();
            }
        }
    }

    /* renamed from: i */
    public final void mo974i(float f) {
        if (this.f1032x != f) {
            this.f1032x = f;
            invalidateSelf();
            m946e();
        }
    }

    /* renamed from: m */
    public final void mo984m(float f) {
        if (this.f977B != f) {
            this.f977B = f;
            invalidateSelf();
            m946e();
        }
    }

    /* renamed from: n */
    public final void mo986n(int i) {
        mo960e(C1065a.m4638a(this.f988N, i));
    }

    public void setTintMode(Mode mode) {
        if (this.f1006ae != mode) {
            this.f1006ae = mode;
            this.f1004ac = C0254a.m909a(this, this.f1005ad, mode);
            invalidateSelf();
        }
    }

    /* renamed from: f */
    private void m951f(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0727a.m3111b(drawable, C0727a.m3118i(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f987M) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f978C);
                }
                C0727a.m3105a(drawable, this.f1021m);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    /* renamed from: b */
    public final void mo940b(int i) {
        mo929a(this.f988N.getResources().getDimension(i));
    }

    public void getOutline(Outline outline) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f1011c);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f1011c);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h */
    public final void mo973h(int i) {
        mo944b(this.f988N.getResources().getBoolean(i));
    }

    /* renamed from: i */
    public final void mo975i(int i) {
        mo933a(C1065a.m4641b(this.f988N, i));
    }

    /* renamed from: j */
    public final void mo979j(int i) {
        mo955d(C1065a.m4638a(this.f988N, i));
    }

    /* renamed from: k */
    public final void mo980k(float f) {
        if (this.f1034z != f) {
            this.f1034z = f;
            invalidateSelf();
            if (m957h()) {
                m946e();
            }
        }
    }

    /* renamed from: l */
    public final void mo982l(float f) {
        if (this.f976A != f) {
            this.f976A = f;
            invalidateSelf();
            if (m957h()) {
                m946e();
            }
        }
    }

    /* renamed from: m */
    public final void mo985m(int i) {
        mo942b(C1065a.m4641b(this.f988N, i));
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m952f()) {
            onLayoutDirectionChanged |= this.f986L.setLayoutDirection(i);
        }
        if (m955g()) {
            onLayoutDirectionChanged |= this.f1026r.setLayoutDirection(i);
        }
        if (m957h()) {
            onLayoutDirectionChanged |= this.f987M.setLayoutDirection(i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m952f()) {
            onLevelChange |= this.f986L.setLevel(i);
        }
        if (m955g()) {
            onLevelChange |= this.f1026r.setLevel(i);
        }
        if (m957h()) {
            onLevelChange |= this.f987M.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            if (this.f1002aa < 255) {
                i = C0244a.m853a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f1002aa);
            }
            m933a(canvas, bounds);
            m937b(canvas, bounds);
            m941c(canvas, bounds);
            m943d(canvas, bounds);
            m947e(canvas, bounds);
            if (this.f982G) {
                m950f(canvas, bounds);
            }
            m954g(canvas, bounds);
            m956h(canvas, bounds);
            if (this.f1002aa < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: g */
    public final void mo965g(int i) {
        mo935a(new C0273b(this.f988N, i));
    }

    /* renamed from: c */
    public final void mo947c(float f) {
        if (this.f1013e != f) {
            this.f1013e = f;
            this.f990P.setStrokeWidth(f);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public final void mo953d(float f) {
        if (this.f1019k != f) {
            float a = mo928a();
            this.f1019k = f;
            float a2 = mo928a();
            invalidateSelf();
            if (a != a2) {
                m946e();
            }
        }
    }

    /* renamed from: e */
    public final void mo959e(int i) {
        mo947c(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: f */
    public final void mo962f(float f) {
        if (this.f1029u != f) {
            this.f1029u = f;
            invalidateSelf();
            m946e();
        }
    }

    /* renamed from: b */
    public final void mo941b(ColorStateList colorStateList) {
        if (this.f1012d != colorStateList) {
            this.f1012d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: c */
    public final void mo948c(int i) {
        mo939b(this.f988N.getResources().getDimension(i));
    }

    /* renamed from: d */
    public final void mo954d(int i) {
        mo941b(C1065a.m4638a(this.f988N, i));
    }

    /* renamed from: e */
    public final void mo960e(ColorStateList colorStateList) {
        if (this.f1021m != colorStateList) {
            this.f1021m = colorStateList;
            if (m957h()) {
                C0727a.m3105a(this.f987M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: f */
    public final void mo963f(int i) {
        mo949c(C1065a.m4638a(this.f988N, i));
    }

    /* renamed from: b */
    public final void mo942b(Drawable drawable) {
        Drawable drawable2;
        Drawable d = mo952d();
        if (d != drawable) {
            float k = m960k();
            if (drawable != null) {
                drawable2 = C0727a.m3116g(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f987M = drawable2;
            float k2 = m960k();
            m949e(d);
            if (m957h()) {
                m951f(this.f987M);
            }
            invalidateSelf();
            if (k != k2) {
                m946e();
            }
        }
    }

    /* renamed from: c */
    public final void mo949c(ColorStateList colorStateList) {
        if (this.f1014f != colorStateList) {
            this.f1014f = colorStateList;
            m963n();
            onStateChange(getState());
        }
    }

    /* renamed from: d */
    public final void mo955d(ColorStateList colorStateList) {
        if (this.f1018j != colorStateList) {
            this.f1018j = colorStateList;
            if (m952f()) {
                C0727a.m3105a(this.f986L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: e */
    public final void mo961e(boolean z) {
        boolean z2;
        if (this.f1025q != z) {
            boolean g = m955g();
            this.f1025q = z;
            boolean g2 = m955g();
            if (g != g2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (g2) {
                    m951f(this.f1026r);
                } else {
                    m949e(this.f1026r);
                }
                invalidateSelf();
                m946e();
            }
        }
    }

    /* renamed from: a */
    public final void mo930a(int i) {
        mo931a(C1065a.m4638a(this.f988N, i));
    }

    /* renamed from: b */
    public final void mo943b(CharSequence charSequence) {
        if (this.f1023o != charSequence) {
            this.f1023o = C0705a.m2998a().mo2850a(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public final void mo950c(Drawable drawable) {
        if (this.f1026r != drawable) {
            float a = mo928a();
            this.f1026r = drawable;
            float a2 = mo928a();
            m949e(this.f1026r);
            m951f(this.f1026r);
            invalidateSelf();
            if (a != a2) {
                m946e();
            }
        }
    }

    /* renamed from: d */
    public final void mo956d(boolean z) {
        if (this.f1024p != z) {
            this.f1024p = z;
            float a = mo928a();
            if (!z && this.f999Y) {
                this.f999Y = false;
            }
            float a2 = mo928a();
            invalidateSelf();
            if (a != a2) {
                m946e();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    private static boolean m935a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == 16842912) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m941c(Canvas canvas, Rect rect) {
        this.f990P.setColor(this.f997W);
        this.f990P.setStyle(Style.FILL);
        this.f993S.set(rect);
        canvas.drawRoundRect(this.f993S, this.f1011c, this.f1011c, this.f990P);
    }

    /* renamed from: a */
    private Align m932a(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Align align = Align.LEFT;
        if (this.f984J != null) {
            float a = this.f1029u + mo928a() + this.f1032x;
            if (C0727a.m3118i(this) == 0) {
                pointF.x = ((float) rect.left) + a;
                align = Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - a;
                align = Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m961l();
        }
        return align;
    }

    /* renamed from: d */
    private void m943d(Canvas canvas, Rect rect) {
        if (m952f()) {
            m934a(rect, this.f993S);
            float f = this.f993S.left;
            float f2 = this.f993S.top;
            canvas.translate(f, f2);
            this.f986L.setBounds(0, 0, (int) this.f993S.width(), (int) this.f993S.height());
            this.f986L.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: e */
    private void m947e(Canvas canvas, Rect rect) {
        if (m955g()) {
            m934a(rect, this.f993S);
            float f = this.f993S.left;
            float f2 = this.f993S.top;
            canvas.translate(f, f2);
            this.f1026r.setBounds(0, 0, (int) this.f993S.width(), (int) this.f993S.height());
            this.f1026r.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: g */
    private void m954g(Canvas canvas, Rect rect) {
        if (m957h()) {
            m942c(rect, this.f993S);
            float f = this.f993S.left;
            float f2 = this.f993S.top;
            canvas.translate(f, f2);
            this.f987M.setBounds(0, 0, (int) this.f993S.width(), (int) this.f993S.height());
            this.f987M.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m952f()) {
            visible |= this.f986L.setVisible(z, z2);
        }
        if (m955g()) {
            visible |= this.f1026r.setVisible(z, z2);
        }
        if (m957h()) {
            visible |= this.f987M.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: a */
    private void m933a(Canvas canvas, Rect rect) {
        this.f990P.setColor(this.f995U);
        this.f990P.setStyle(Style.FILL);
        this.f990P.setColorFilter(m962m());
        this.f993S.set(rect);
        canvas.drawRoundRect(this.f993S, this.f1011c, this.f1011c, this.f990P);
    }

    /* renamed from: b */
    private void m937b(Canvas canvas, Rect rect) {
        if (this.f1013e > 0.0f) {
            this.f990P.setColor(this.f996V);
            this.f990P.setStyle(Style.STROKE);
            this.f990P.setColorFilter(m962m());
            this.f993S.set(((float) rect.left) + (this.f1013e / 2.0f), ((float) rect.top) + (this.f1013e / 2.0f), ((float) rect.right) - (this.f1013e / 2.0f), ((float) rect.bottom) - (this.f1013e / 2.0f));
            float f = this.f1011c - (this.f1013e / 2.0f);
            canvas.drawRoundRect(this.f993S, f, f, this.f990P);
        }
    }

    /* renamed from: c */
    private void m942c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m957h()) {
            float f = this.f977B + this.f976A;
            if (C0727a.m3118i(this) == 0) {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f1022n;
            } else {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f1022n;
            }
            rectF.top = rect.exactCenterY() - (this.f1022n / 2.0f);
            rectF.bottom = rectF.top + this.f1022n;
        }
    }

    /* renamed from: d */
    private void m944d(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m957h()) {
            float f = this.f977B + this.f976A + this.f1022n + this.f1034z + this.f1033y;
            if (C0727a.m3118i(this) == 0) {
                rectF.right = ((float) rect.right) - f;
                return;
            }
            rectF.left = ((float) rect.left) + f;
        }
    }

    /* renamed from: e */
    private void m948e(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m957h()) {
            float f = this.f977B + this.f976A + this.f1022n + this.f1034z + this.f1033y;
            if (C0727a.m3118i(this) == 0) {
                rectF.right = (float) rect.right;
                rectF.left = rectF.right - f;
            } else {
                rectF.left = (float) rect.left;
                rectF.right = ((float) rect.left) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: f */
    private void m950f(Canvas canvas, Rect rect) {
        boolean z;
        if (this.f984J != null) {
            Align a = m932a(rect, this.f994T);
            m938b(rect, this.f993S);
            if (this.f1016h != null) {
                this.f989O.drawableState = getState();
                this.f1016h.mo1050a(this.f988N, this.f989O, this.f985K);
            }
            this.f989O.setTextAlign(a);
            int i = 0;
            if (Math.round(m959j()) > Math.round(this.f993S.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f993S);
            }
            CharSequence charSequence = this.f984J;
            if (z && this.f981F != null) {
                charSequence = TextUtils.ellipsize(this.f984J, this.f989O, this.f993S.width(), this.f981F);
            }
            CharSequence charSequence2 = charSequence;
            canvas.drawText(charSequence2, 0, charSequence2.length(), this.f994T.x, this.f994T.y, this.f989O);
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: a */
    private void m934a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m952f() || m955g()) {
            float f = this.f1029u + this.f1030v;
            if (C0727a.m3118i(this) == 0) {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f1019k;
            } else {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f1019k;
            }
            rectF.top = rect.exactCenterY() - (this.f1019k / 2.0f);
            rectF.bottom = rectF.top + this.f1019k;
        }
    }

    /* renamed from: b */
    private void m938b(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f984J != null) {
            float a = this.f1029u + mo928a() + this.f1032x;
            float k = this.f977B + m960k() + this.f1033y;
            if (C0727a.m3118i(this) == 0) {
                rectF.left = ((float) rect.left) + a;
                rectF.right = ((float) rect.right) - k;
            } else {
                rectF.left = ((float) rect.left) + k;
                rectF.right = ((float) rect.right) - a;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: h */
    private void m956h(Canvas canvas, Rect rect) {
        if (this.f991Q != null) {
            this.f991Q.setColor(C0721a.m3067b(-16777216, 127));
            canvas.drawRect(rect, this.f991Q);
            if (m952f() || m955g()) {
                m934a(rect, this.f993S);
                canvas.drawRect(this.f993S, this.f991Q);
            }
            if (this.f984J != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f991Q);
            }
            if (m957h()) {
                m942c(rect, this.f993S);
                canvas.drawRect(this.f993S, this.f991Q);
            }
            this.f991Q.setColor(C0721a.m3067b(-65536, 127));
            m944d(rect, this.f993S);
            canvas.drawRect(this.f993S, this.f991Q);
            this.f991Q.setColor(C0721a.m3067b(-16711936, 127));
            m948e(rect, this.f993S);
            canvas.drawRect(this.f993S, this.f991Q);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m936a(int[] r6, int[] r7) {
        /*
            r5 = this;
            boolean r0 = super.onStateChange(r6)
            android.content.res.ColorStateList r1 = r5.f1001a
            r2 = 0
            if (r1 == 0) goto L_0x0012
            android.content.res.ColorStateList r1 = r5.f1001a
            int r3 = r5.f995U
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            int r3 = r5.f995U
            r4 = 1
            if (r3 == r1) goto L_0x001b
            r5.f995U = r1
            r0 = 1
        L_0x001b:
            android.content.res.ColorStateList r1 = r5.f1012d
            if (r1 == 0) goto L_0x0028
            android.content.res.ColorStateList r1 = r5.f1012d
            int r3 = r5.f996V
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            int r3 = r5.f996V
            if (r3 == r1) goto L_0x0030
            r5.f996V = r1
            r0 = 1
        L_0x0030:
            android.content.res.ColorStateList r1 = r5.f1007af
            if (r1 == 0) goto L_0x003d
            android.content.res.ColorStateList r1 = r5.f1007af
            int r3 = r5.f997W
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            int r3 = r5.f997W
            if (r3 == r1) goto L_0x0049
            r5.f997W = r1
            boolean r1 = r5.f979D
            if (r1 == 0) goto L_0x0049
            r0 = 1
        L_0x0049:
            android.support.design.e.b r1 = r5.f1016h
            if (r1 == 0) goto L_0x005e
            android.support.design.e.b r1 = r5.f1016h
            android.content.res.ColorStateList r1 = r1.f1060b
            if (r1 == 0) goto L_0x005e
            android.support.design.e.b r1 = r5.f1016h
            android.content.res.ColorStateList r1 = r1.f1060b
            int r3 = r5.f998X
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            int r3 = r5.f998X
            if (r3 == r1) goto L_0x0066
            r5.f998X = r1
            r0 = 1
        L_0x0066:
            int[] r1 = r5.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m935a(r1, r3)
            if (r1 == 0) goto L_0x0079
            boolean r1 = r5.f1024p
            if (r1 == 0) goto L_0x0079
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            boolean r3 = r5.f999Y
            if (r3 == r1) goto L_0x0094
            android.graphics.drawable.Drawable r3 = r5.f1026r
            if (r3 == 0) goto L_0x0094
            float r0 = r5.mo928a()
            r5.f999Y = r1
            float r1 = r5.mo928a()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r0 = 1
            r1 = 1
            goto L_0x0095
        L_0x0093:
            r0 = 1
        L_0x0094:
            r1 = 0
        L_0x0095:
            android.content.res.ColorStateList r3 = r5.f1005ad
            if (r3 == 0) goto L_0x00a1
            android.content.res.ColorStateList r2 = r5.f1005ad
            int r3 = r5.f1000Z
            int r2 = r2.getColorForState(r6, r3)
        L_0x00a1:
            int r3 = r5.f1000Z
            if (r3 == r2) goto L_0x00b2
            r5.f1000Z = r2
            android.content.res.ColorStateList r0 = r5.f1005ad
            android.graphics.PorterDuff$Mode r2 = r5.f1006ae
            android.graphics.PorterDuffColorFilter r0 = android.support.design.p017c.C0254a.m909a(r5, r0, r2)
            r5.f1004ac = r0
            r0 = 1
        L_0x00b2:
            android.graphics.drawable.Drawable r2 = r5.f986L
            boolean r2 = m945d(r2)
            if (r2 == 0) goto L_0x00c1
            android.graphics.drawable.Drawable r2 = r5.f986L
            boolean r2 = r2.setState(r6)
            r0 = r0 | r2
        L_0x00c1:
            android.graphics.drawable.Drawable r2 = r5.f1026r
            boolean r2 = m945d(r2)
            if (r2 == 0) goto L_0x00d0
            android.graphics.drawable.Drawable r2 = r5.f1026r
            boolean r6 = r2.setState(r6)
            r0 = r0 | r6
        L_0x00d0:
            android.graphics.drawable.Drawable r6 = r5.f987M
            boolean r6 = m945d(r6)
            if (r6 == 0) goto L_0x00df
            android.graphics.drawable.Drawable r6 = r5.f987M
            boolean r6 = r6.setState(r7)
            r0 = r0 | r6
        L_0x00df:
            if (r0 == 0) goto L_0x00e4
            r5.invalidateSelf()
        L_0x00e4:
            if (r1 == 0) goto L_0x00e9
            r5.m946e()
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.chip.ChipDrawable.m936a(int[], int[]):boolean");
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }
}
