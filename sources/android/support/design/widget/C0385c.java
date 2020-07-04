package android.support.design.widget;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.design.p015a.C0234a;
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.p026d.C0712d;
import android.support.p022v4.p026d.C0713e;
import android.support.p022v4.view.C0972e;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.widget.C1365av;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;

/* renamed from: android.support.design.widget.c */
public final class C0385c {

    /* renamed from: i */
    private static final boolean f1621i;

    /* renamed from: j */
    private static final Paint f1622j = null;

    /* renamed from: A */
    private boolean f1623A;

    /* renamed from: B */
    private Bitmap f1624B;

    /* renamed from: C */
    private Paint f1625C;

    /* renamed from: D */
    private float f1626D;

    /* renamed from: E */
    private float f1627E;

    /* renamed from: F */
    private float f1628F;

    /* renamed from: G */
    private float f1629G;

    /* renamed from: H */
    private int[] f1630H;

    /* renamed from: I */
    private boolean f1631I;

    /* renamed from: J */
    private final TextPaint f1632J;

    /* renamed from: K */
    private final TextPaint f1633K;

    /* renamed from: L */
    private TimeInterpolator f1634L;

    /* renamed from: M */
    private TimeInterpolator f1635M;

    /* renamed from: N */
    private float f1636N;

    /* renamed from: O */
    private float f1637O;

    /* renamed from: P */
    private float f1638P;

    /* renamed from: Q */
    private int f1639Q;

    /* renamed from: R */
    private float f1640R;

    /* renamed from: S */
    private float f1641S;

    /* renamed from: T */
    private float f1642T;

    /* renamed from: U */
    private int f1643U;

    /* renamed from: a */
    public float f1644a;

    /* renamed from: b */
    public int f1645b;

    /* renamed from: c */
    public int f1646c;

    /* renamed from: d */
    public float f1647d;

    /* renamed from: e */
    public float f1648e;

    /* renamed from: f */
    public ColorStateList f1649f;

    /* renamed from: g */
    public ColorStateList f1650g;

    /* renamed from: h */
    public CharSequence f1651h;

    /* renamed from: k */
    private final View f1652k;

    /* renamed from: l */
    private boolean f1653l;

    /* renamed from: m */
    private final Rect f1654m;

    /* renamed from: n */
    private final Rect f1655n;

    /* renamed from: o */
    private final RectF f1656o;

    /* renamed from: p */
    private float f1657p;

    /* renamed from: q */
    private float f1658q;

    /* renamed from: r */
    private float f1659r;

    /* renamed from: s */
    private float f1660s;

    /* renamed from: t */
    private float f1661t;

    /* renamed from: u */
    private float f1662u;

    /* renamed from: v */
    private Typeface f1663v;

    /* renamed from: w */
    private Typeface f1664w;

    /* renamed from: x */
    private Typeface f1665x;

    /* renamed from: y */
    private CharSequence f1666y;

    /* renamed from: z */
    private boolean f1667z;

    /* renamed from: a */
    public final void mo1788a(ColorStateList colorStateList) {
        if (this.f1650g != colorStateList) {
            this.f1650g = colorStateList;
            mo1799c();
        }
    }

    /* renamed from: a */
    public final void mo1787a(int i, int i2, int i3, int i4) {
        if (!m1680a(this.f1654m, i, i2, i3, i4)) {
            this.f1654m.set(i, i2, i3, i4);
            this.f1631I = true;
            m1686e();
        }
    }

    /* renamed from: a */
    public final void mo1790a(RectF rectF) {
        float f;
        boolean b = m1681b(this.f1651h);
        if (!b) {
            f = (float) this.f1655n.left;
        } else {
            f = ((float) this.f1655n.right) - m1683d();
        }
        rectF.left = f;
        rectF.top = (float) this.f1655n.top;
        rectF.right = !b ? rectF.left + m1683d() : (float) this.f1655n.right;
        rectF.bottom = ((float) this.f1655n.top) + mo1784a();
    }

    /* renamed from: a */
    public final boolean mo1793a(int[] iArr) {
        this.f1630H = iArr;
        if (!m1689f()) {
            return false;
        }
        mo1799c();
        return true;
    }

    /* renamed from: a */
    public final void mo1789a(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f1666y != null && this.f1653l) {
            float f2 = this.f1661t;
            float f3 = this.f1662u;
            boolean z = this.f1623A && this.f1624B != null;
            if (z) {
                f = this.f1626D * this.f1628F;
            } else {
                this.f1632J.ascent();
                f = 0.0f;
                this.f1632J.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            if (this.f1628F != 1.0f) {
                canvas.scale(this.f1628F, this.f1628F, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f1624B, f2, f4, this.f1625C);
            } else {
                canvas.drawText(this.f1666y, 0, this.f1666y.length(), f2, f4, this.f1632J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public final void mo1792a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f1651h)) {
            this.f1651h = charSequence;
            this.f1666y = null;
            m1694k();
            mo1799c();
        }
    }

    /* renamed from: g */
    private void m1690g() {
        m1682c(this.f1644a);
    }

    static {
        boolean z;
        if (VERSION.SDK_INT < 18) {
            z = true;
        } else {
            z = false;
        }
        f1621i = z;
    }

    /* renamed from: k */
    private void m1694k() {
        if (this.f1624B != null) {
            this.f1624B.recycle();
            this.f1624B = null;
        }
    }

    /* renamed from: d */
    private float m1683d() {
        if (this.f1651h == null) {
            return 0.0f;
        }
        m1678a(this.f1633K);
        return this.f1633K.measureText(this.f1651h, 0, this.f1651h.length());
    }

    /* renamed from: f */
    private boolean m1689f() {
        if ((this.f1650g == null || !this.f1650g.isStateful()) && (this.f1649f == null || !this.f1649f.isStateful())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private int m1691h() {
        if (this.f1630H != null) {
            return this.f1649f.getColorForState(this.f1630H, 0);
        }
        return this.f1649f.getDefaultColor();
    }

    /* renamed from: c */
    public final void mo1799c() {
        if (this.f1652k.getHeight() > 0 && this.f1652k.getWidth() > 0) {
            m1692i();
            m1690g();
        }
    }

    /* renamed from: e */
    private void m1686e() {
        boolean z;
        if (this.f1655n.width() <= 0 || this.f1655n.height() <= 0 || this.f1654m.width() <= 0 || this.f1654m.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f1653l = z;
    }

    /* renamed from: b */
    public final int mo1794b() {
        if (this.f1630H != null) {
            return this.f1650g.getColorForState(this.f1630H, 0);
        }
        return this.f1650g.getDefaultColor();
    }

    /* renamed from: j */
    private void m1693j() {
        if (this.f1624B == null && !this.f1654m.isEmpty() && !TextUtils.isEmpty(this.f1666y)) {
            m1682c(0.0f);
            this.f1626D = this.f1632J.ascent();
            this.f1627E = this.f1632J.descent();
            int round = Math.round(this.f1632J.measureText(this.f1666y, 0, this.f1666y.length()));
            int round2 = Math.round(this.f1627E - this.f1626D);
            if (round > 0 && round2 > 0) {
                this.f1624B = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                new Canvas(this.f1624B).drawText(this.f1666y, 0, this.f1666y.length(), 0.0f, ((float) round2) - this.f1632J.descent(), this.f1632J);
                if (this.f1625C == null) {
                    this.f1625C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: i */
    private void m1692i() {
        float f;
        float f2 = this.f1629G;
        m1688f(this.f1648e);
        float f3 = 0.0f;
        if (this.f1666y != null) {
            f = this.f1632J.measureText(this.f1666y, 0, this.f1666y.length());
        } else {
            f = 0.0f;
        }
        int a = C0972e.m4109a(this.f1646c, this.f1667z ? 1 : 0);
        int i = a & 112;
        if (i == 48) {
            this.f1658q = ((float) this.f1655n.top) - this.f1632J.ascent();
        } else if (i != 80) {
            this.f1658q = ((float) this.f1655n.centerY()) + (((this.f1632J.descent() - this.f1632J.ascent()) / 2.0f) - this.f1632J.descent());
        } else {
            this.f1658q = (float) this.f1655n.bottom;
        }
        int i2 = a & 8388615;
        if (i2 == 1) {
            this.f1660s = ((float) this.f1655n.centerX()) - (f / 2.0f);
        } else if (i2 != 5) {
            this.f1660s = (float) this.f1655n.left;
        } else {
            this.f1660s = ((float) this.f1655n.right) - f;
        }
        m1688f(this.f1647d);
        if (this.f1666y != null) {
            f3 = this.f1632J.measureText(this.f1666y, 0, this.f1666y.length());
        }
        int a2 = C0972e.m4109a(this.f1645b, this.f1667z ? 1 : 0);
        int i3 = a2 & 112;
        if (i3 == 48) {
            this.f1657p = ((float) this.f1654m.top) - this.f1632J.ascent();
        } else if (i3 != 80) {
            this.f1657p = ((float) this.f1654m.centerY()) + (((this.f1632J.descent() - this.f1632J.ascent()) / 2.0f) - this.f1632J.descent());
        } else {
            this.f1657p = (float) this.f1654m.bottom;
        }
        int i4 = a2 & 8388615;
        if (i4 == 1) {
            this.f1659r = ((float) this.f1654m.centerX()) - (f3 / 2.0f);
        } else if (i4 != 5) {
            this.f1659r = (float) this.f1654m.left;
        } else {
            this.f1659r = ((float) this.f1654m.right) - f3;
        }
        m1694k();
        m1687e(f2);
    }

    /* renamed from: a */
    public final float mo1784a() {
        m1678a(this.f1633K);
        return -this.f1633K.ascent();
    }

    /* renamed from: a */
    public final void mo1791a(Typeface typeface) {
        this.f1664w = typeface;
        this.f1663v = typeface;
        mo1799c();
    }

    /* renamed from: b */
    public final void mo1796b(int i) {
        if (this.f1646c != i) {
            this.f1646c = i;
            mo1799c();
        }
    }

    /* renamed from: a */
    private void m1678a(TextPaint textPaint) {
        textPaint.setTextSize(this.f1648e);
        textPaint.setTypeface(this.f1663v);
    }

    /* renamed from: b */
    private boolean m1681b(CharSequence charSequence) {
        C0712d dVar;
        boolean z = true;
        if (C0991u.m4220h(this.f1652k) != 1) {
            z = false;
        }
        if (z) {
            dVar = C0713e.f2706d;
        } else {
            dVar = C0713e.f2705c;
        }
        return dVar.mo2875a(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    private Typeface m1684d(int i) {
        TypedArray obtainStyledAttributes = this.f1652k.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    private void m1682c(float f) {
        m1685d(f);
        this.f1661t = m1676a(this.f1659r, this.f1660s, f, this.f1634L);
        this.f1662u = m1676a(this.f1657p, this.f1658q, f, this.f1634L);
        m1687e(m1676a(this.f1647d, this.f1648e, f, this.f1635M));
        if (this.f1650g != this.f1649f) {
            this.f1632J.setColor(m1677a(m1691h(), mo1794b(), f));
        } else {
            this.f1632J.setColor(mo1794b());
        }
        this.f1632J.setShadowLayer(m1676a(this.f1640R, this.f1636N, f, (TimeInterpolator) null), m1676a(this.f1641S, this.f1637O, f, (TimeInterpolator) null), m1676a(this.f1642T, this.f1638P, f, (TimeInterpolator) null), m1677a(this.f1643U, this.f1639Q, f));
        C0991u.m4212e(this.f1652k);
    }

    /* renamed from: d */
    private void m1685d(float f) {
        this.f1656o.left = m1676a((float) this.f1654m.left, (float) this.f1655n.left, f, this.f1634L);
        this.f1656o.top = m1676a(this.f1657p, this.f1658q, f, this.f1634L);
        this.f1656o.right = m1676a((float) this.f1654m.right, (float) this.f1655n.right, f, this.f1634L);
        this.f1656o.bottom = m1676a((float) this.f1654m.bottom, (float) this.f1655n.bottom, f, this.f1634L);
    }

    /* renamed from: e */
    private void m1687e(float f) {
        boolean z;
        m1688f(f);
        if (!f1621i || this.f1628F == 1.0f) {
            z = false;
        } else {
            z = true;
        }
        this.f1623A = z;
        if (this.f1623A) {
            m1693j();
        }
        C0991u.m4212e(this.f1652k);
    }

    /* renamed from: b */
    public final void mo1795b(float f) {
        float a = C0534a.m2232a(f, 0.0f, 1.0f);
        if (a != this.f1644a) {
            this.f1644a = a;
            m1690g();
        }
    }

    /* renamed from: f */
    private void m1688f(float f) {
        boolean z;
        float f2;
        boolean z2;
        boolean z3;
        if (this.f1651h != null) {
            float width = (float) this.f1655n.width();
            float width2 = (float) this.f1654m.width();
            boolean z4 = true;
            if (m1679a(f, this.f1648e)) {
                float f3 = this.f1648e;
                this.f1628F = 1.0f;
                if (this.f1665x != this.f1663v) {
                    this.f1665x = this.f1663v;
                    z3 = true;
                } else {
                    z3 = false;
                }
                f2 = f3;
                z = z3;
            } else {
                f2 = this.f1647d;
                if (this.f1665x != this.f1664w) {
                    this.f1665x = this.f1664w;
                    z = true;
                } else {
                    z = false;
                }
                if (m1679a(f, this.f1647d)) {
                    this.f1628F = 1.0f;
                } else {
                    this.f1628F = f / this.f1647d;
                }
                float f4 = this.f1648e / this.f1647d;
                if (width2 * f4 > width) {
                    width = Math.min(width / f4, width2);
                } else {
                    width = width2;
                }
            }
            if (width > 0.0f) {
                if (this.f1629G != f2 || this.f1631I || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f1629G = f2;
                this.f1631I = false;
            }
            if (this.f1666y == null || z) {
                this.f1632J.setTextSize(this.f1629G);
                this.f1632J.setTypeface(this.f1665x);
                TextPaint textPaint = this.f1632J;
                if (this.f1628F == 1.0f) {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
                CharSequence ellipsize = TextUtils.ellipsize(this.f1651h, this.f1632J, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f1666y)) {
                    this.f1666y = ellipsize;
                    this.f1667z = m1681b(this.f1666y);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo1800c(int i) {
        C1365av a = C1365av.m6742a(this.f1652k.getContext(), i, R$styleable.TextAppearance);
        if (a.mo6406g(3)) {
            this.f1650g = a.mo6402e(3);
        }
        if (a.mo6406g(0)) {
            this.f1648e = (float) a.mo6401e(0, (int) this.f1648e);
        }
        this.f1639Q = a.mo6390a(6, 0);
        this.f1637O = a.mo6389a(7, 0.0f);
        this.f1638P = a.mo6389a(8, 0.0f);
        this.f1636N = a.mo6389a(9, 0.0f);
        a.mo6393a();
        if (VERSION.SDK_INT >= 16) {
            this.f1663v = m1684d(i);
        }
        mo1799c();
    }

    /* renamed from: b */
    public final void mo1798b(ColorStateList colorStateList) {
        if (this.f1649f != colorStateList) {
            this.f1649f = colorStateList;
            mo1799c();
        }
    }

    /* renamed from: a */
    public final void mo1785a(float f) {
        if (this.f1647d != f) {
            this.f1647d = f;
            mo1799c();
        }
    }

    /* renamed from: a */
    public final void mo1786a(int i) {
        if (this.f1645b != i) {
            this.f1645b = i;
            mo1799c();
        }
    }

    /* renamed from: a */
    private static boolean m1679a(float f, float f2) {
        if (Math.abs(f - f2) < 0.001f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m1677a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static float m1676a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C0234a.m830a(f, f2, f3);
    }

    /* renamed from: b */
    public final void mo1797b(int i, int i2, int i3, int i4) {
        if (!m1680a(this.f1655n, i, i2, i3, i4)) {
            this.f1655n.set(i, i2, i3, i4);
            this.f1631I = true;
            m1686e();
        }
    }

    /* renamed from: a */
    private static boolean m1680a(Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }
}
