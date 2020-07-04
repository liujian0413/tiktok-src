package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.p015a.C0234a;
import android.support.design.p015a.C0235b;
import android.support.design.p015a.C0239f;
import android.support.design.p015a.C0240g;
import android.support.design.p015a.C0241h;
import android.support.design.p020f.C0276a;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.design.widget.g */
class C0389g {

    /* renamed from: a */
    static final TimeInterpolator f1675a = C0234a.f874c;

    /* renamed from: p */
    static final int[] f1676p = {16842919, 16842910};

    /* renamed from: q */
    static final int[] f1677q = {16843623, 16842908, 16842910};

    /* renamed from: r */
    static final int[] f1678r = {16842908, 16842910};

    /* renamed from: s */
    static final int[] f1679s = {16843623, 16842910};

    /* renamed from: t */
    static final int[] f1680t = {16842910};

    /* renamed from: u */
    static final int[] f1681u = new int[0];

    /* renamed from: A */
    private float f1682A;

    /* renamed from: B */
    private ArrayList<AnimatorListener> f1683B;

    /* renamed from: C */
    private ArrayList<AnimatorListener> f1684C;

    /* renamed from: D */
    private final Rect f1685D = new Rect();

    /* renamed from: E */
    private final RectF f1686E = new RectF();

    /* renamed from: F */
    private final RectF f1687F = new RectF();

    /* renamed from: G */
    private final Matrix f1688G = new Matrix();

    /* renamed from: H */
    private OnPreDrawListener f1689H;

    /* renamed from: b */
    int f1690b;

    /* renamed from: c */
    Animator f1691c;

    /* renamed from: d */
    public C0241h f1692d;

    /* renamed from: e */
    public C0241h f1693e;

    /* renamed from: f */
    ShadowDrawableWrapper f1694f;

    /* renamed from: g */
    Drawable f1695g;

    /* renamed from: h */
    Drawable f1696h;

    /* renamed from: i */
    C0383b f1697i;

    /* renamed from: j */
    public Drawable f1698j;

    /* renamed from: k */
    float f1699k;

    /* renamed from: l */
    public float f1700l;

    /* renamed from: m */
    public float f1701m;

    /* renamed from: n */
    int f1702n;

    /* renamed from: o */
    float f1703o = 1.0f;

    /* renamed from: v */
    final C0415r f1704v;

    /* renamed from: w */
    final C0403k f1705w;

    /* renamed from: x */
    private C0241h f1706x;

    /* renamed from: y */
    private C0241h f1707y;

    /* renamed from: z */
    private final C0408m f1708z;

    /* renamed from: android.support.design.widget.g$a */
    class C0393a extends C0398f {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final float mo1837a() {
            return 0.0f;
        }

        C0393a() {
            super();
        }
    }

    /* renamed from: android.support.design.widget.g$b */
    class C0394b extends C0398f {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final float mo1837a() {
            return C0389g.this.f1699k + C0389g.this.f1700l;
        }

        C0394b() {
            super();
        }
    }

    /* renamed from: android.support.design.widget.g$c */
    class C0395c extends C0398f {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final float mo1837a() {
            return C0389g.this.f1699k + C0389g.this.f1701m;
        }

        C0395c() {
            super();
        }
    }

    /* renamed from: android.support.design.widget.g$d */
    interface C0396d {
    }

    /* renamed from: android.support.design.widget.g$e */
    class C0397e extends C0398f {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final float mo1837a() {
            return C0389g.this.f1699k;
        }

        C0397e() {
            super();
        }
    }

    /* renamed from: android.support.design.widget.g$f */
    abstract class C0398f extends AnimatorListenerAdapter implements AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f1721a;

        /* renamed from: c */
        private float f1723c;

        /* renamed from: d */
        private float f1724d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo1837a();

        private C0398f() {
        }

        public void onAnimationEnd(Animator animator) {
            C0389g.this.f1694f.mo1563a(this.f1724d);
            this.f1721a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f1721a) {
                this.f1723c = C0389g.this.f1694f.f1479j;
                this.f1724d = mo1837a();
                this.f1721a = true;
            }
            C0389g.this.f1694f.mo1563a(this.f1723c + ((this.f1724d - this.f1723c) * valueAnimator.getAnimatedFraction()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo1805a() {
        return this.f1699k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1818b(Rect rect) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1823d() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo1828h() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1813a(int[] iArr) {
        this.f1708z.mo1871a(iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1812a(final C0396d dVar, final boolean z) {
        C0241h hVar;
        if (!m1733n()) {
            if (this.f1691c != null) {
                this.f1691c.cancel();
            }
            if (m1734o()) {
                if (this.f1693e != null) {
                    hVar = this.f1693e;
                } else {
                    hVar = m1731l();
                }
                AnimatorSet a = m1726a(hVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: d */
                    private boolean f1712d;

                    public final void onAnimationCancel(Animator animator) {
                        this.f1712d = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        int i;
                        C0389g.this.f1690b = 0;
                        C0389g.this.f1691c = null;
                        if (!this.f1712d) {
                            C0415r rVar = C0389g.this.f1704v;
                            if (z) {
                                i = 8;
                            } else {
                                i = 4;
                            }
                            rVar.mo1877a(i, z);
                        }
                    }

                    public final void onAnimationStart(Animator animator) {
                        C0389g.this.f1704v.mo1877a(0, z);
                        C0389g.this.f1690b = 1;
                        C0389g.this.f1691c = animator;
                        this.f1712d = false;
                    }
                });
                if (this.f1684C != null) {
                    Iterator it = this.f1684C.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
                return;
            }
            this.f1704v.mo1877a(z ? 8 : 4, z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1814b() {
        m1729d(this.f1703o);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1820c() {
        this.f1708z.mo1870a();
    }

    /* renamed from: m */
    private void m1732m() {
        if (this.f1689H == null) {
            this.f1689H = new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    C0389g.this.mo1829i();
                    return true;
                }
            };
        }
    }

    /* renamed from: k */
    private C0241h m1730k() {
        if (this.f1706x == null) {
            this.f1706x = C0241h.m842a(this.f1704v.getContext(), (int) R.animator.c);
        }
        return this.f1706x;
    }

    /* renamed from: l */
    private C0241h m1731l() {
        if (this.f1707y == null) {
            this.f1707y = C0241h.m842a(this.f1704v.getContext(), (int) R.animator.b);
        }
        return this.f1707y;
    }

    /* renamed from: n */
    private boolean m1733n() {
        if (this.f1704v.getVisibility() == 0) {
            if (this.f1690b == 1) {
                return true;
            }
            return false;
        } else if (this.f1690b != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: o */
    private boolean m1734o() {
        if (!C0991u.m4167D(this.f1704v) || this.f1704v.isInEditMode()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo1825e() {
        Rect rect = this.f1685D;
        mo1811a(rect);
        mo1818b(rect);
        this.f1705w.mo1528a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo1826f() {
        if (mo1828h()) {
            m1732m();
            this.f1704v.getViewTreeObserver().addOnPreDrawListener(this.f1689H);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo1827g() {
        if (this.f1689H != null) {
            this.f1704v.getViewTreeObserver().removeOnPreDrawListener(this.f1689H);
            this.f1689H = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo1829i() {
        float rotation = this.f1704v.getRotation();
        if (this.f1682A != rotation) {
            this.f1682A = rotation;
            m1735p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo1830j() {
        if (this.f1704v.getVisibility() != 0) {
            if (this.f1690b == 2) {
                return true;
            }
            return false;
        } else if (this.f1690b != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: p */
    private void m1735p() {
        if (VERSION.SDK_INT == 19) {
            if (this.f1682A % 90.0f != 0.0f) {
                if (this.f1704v.getLayerType() != 1) {
                    this.f1704v.setLayerType(1, null);
                }
            } else if (this.f1704v.getLayerType() != 0) {
                this.f1704v.setLayerType(0, null);
            }
        }
        if (this.f1694f != null) {
            this.f1694f.mo1565b(-this.f1682A);
        }
        if (this.f1697i != null) {
            this.f1697i.mo1771a(-this.f1682A);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1811a(Rect rect) {
        this.f1694f.getPadding(rect);
    }

    /* renamed from: d */
    private void m1729d(float f) {
        this.f1703o = f;
        Matrix matrix = this.f1688G;
        m1728a(f, matrix);
        this.f1704v.setImageMatrix(matrix);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1816b(AnimatorListener animatorListener) {
        if (this.f1683B != null) {
            this.f1683B.remove(animatorListener);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1806a(float f) {
        if (this.f1699k != f) {
            this.f1699k = f;
            mo1807a(this.f1699k, this.f1700l, this.f1701m);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1815b(float f) {
        if (this.f1700l != f) {
            this.f1700l = f;
            mo1807a(this.f1699k, this.f1700l, this.f1701m);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo1821c(float f) {
        if (this.f1701m != f) {
            this.f1701m = f;
            mo1807a(this.f1699k, this.f1700l, this.f1701m);
        }
    }

    /* renamed from: d */
    public final void mo1824d(AnimatorListener animatorListener) {
        if (this.f1684C != null) {
            this.f1684C.remove(animatorListener);
        }
    }

    /* renamed from: a */
    private static ValueAnimator m1727a(C0398f fVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1675a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(fVar);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1817b(ColorStateList colorStateList) {
        if (this.f1696h != null) {
            C0727a.m3105a(this.f1696h, C0276a.m1088a(colorStateList));
        }
    }

    /* renamed from: c */
    public final void mo1822c(AnimatorListener animatorListener) {
        if (this.f1684C == null) {
            this.f1684C = new ArrayList<>();
        }
        this.f1684C.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1808a(AnimatorListener animatorListener) {
        if (this.f1683B == null) {
            this.f1683B = new ArrayList<>();
        }
        this.f1683B.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1809a(ColorStateList colorStateList) {
        if (this.f1695g != null) {
            C0727a.m3105a(this.f1695g, colorStateList);
        }
        if (this.f1697i != null) {
            this.f1697i.mo1772a(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1810a(Mode mode) {
        if (this.f1695g != null) {
            C0727a.m3108a(this.f1695g, mode);
        }
    }

    /* renamed from: a */
    private void m1728a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f1704v.getDrawable();
        if (drawable != null && this.f1702n != 0) {
            RectF rectF = this.f1686E;
            RectF rectF2 = this.f1687F;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            rectF2.set(0.0f, 0.0f, (float) this.f1702n, (float) this.f1702n);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            matrix.postScale(f, f, ((float) this.f1702n) / 2.0f, ((float) this.f1702n) / 2.0f);
        }
    }

    C0389g(C0415r rVar, C0403k kVar) {
        this.f1704v = rVar;
        this.f1705w = kVar;
        this.f1708z = new C0408m();
        this.f1708z.mo1872a(f1676p, m1727a((C0398f) new C0395c()));
        this.f1708z.mo1872a(f1677q, m1727a((C0398f) new C0394b()));
        this.f1708z.mo1872a(f1678r, m1727a((C0398f) new C0394b()));
        this.f1708z.mo1872a(f1679s, m1727a((C0398f) new C0394b()));
        this.f1708z.mo1872a(f1680t, m1727a((C0398f) new C0397e()));
        this.f1708z.mo1872a(f1681u, m1727a((C0398f) new C0393a()));
        this.f1682A = this.f1704v.getRotation();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1819b(final C0396d dVar, final boolean z) {
        C0241h hVar;
        if (!mo1830j()) {
            if (this.f1691c != null) {
                this.f1691c.cancel();
            }
            if (m1734o()) {
                if (this.f1704v.getVisibility() != 0) {
                    this.f1704v.setAlpha(0.0f);
                    this.f1704v.setScaleY(0.0f);
                    this.f1704v.setScaleX(0.0f);
                    m1729d(0.0f);
                }
                if (this.f1692d != null) {
                    hVar = this.f1692d;
                } else {
                    hVar = m1730k();
                }
                AnimatorSet a = m1726a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C0389g.this.f1690b = 0;
                        C0389g.this.f1691c = null;
                    }

                    public final void onAnimationStart(Animator animator) {
                        C0389g.this.f1704v.mo1877a(0, z);
                        C0389g.this.f1690b = 2;
                        C0389g.this.f1691c = animator;
                    }
                });
                if (this.f1683B != null) {
                    Iterator it = this.f1683B.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
                return;
            }
            this.f1704v.mo1877a(0, z);
            this.f1704v.setAlpha(1.0f);
            this.f1704v.setScaleY(1.0f);
            this.f1704v.setScaleX(1.0f);
            m1729d(1.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1807a(float f, float f2, float f3) {
        if (this.f1694f != null) {
            this.f1694f.mo1564a(f, this.f1701m + f);
            mo1825e();
        }
    }

    /* renamed from: a */
    private AnimatorSet m1726a(C0241h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f1704v, View.ALPHA, new float[]{f});
        hVar.mo673a("opacity").mo678a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f1704v, View.SCALE_X, new float[]{f2});
        hVar.mo673a("scale").mo678a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f1704v, View.SCALE_Y, new float[]{f2});
        hVar.mo673a("scale").mo678a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        m1728a(f3, this.f1688G);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f1704v, new C0239f(), new C0240g(), new Matrix[]{new Matrix(this.f1688G)});
        hVar.mo673a("iconScale").mo678a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C0235b.m832a(animatorSet, arrayList);
        return animatorSet;
    }
}
