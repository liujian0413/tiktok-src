package android.support.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.p022v4.content.res.C0696b;
import android.support.p022v4.content.res.C0700e;
import android.support.p022v4.content.res.C0704f;
import android.support.p022v4.graphics.C0722b;
import android.support.p022v4.graphics.C0722b.C0724b;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Xml;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class VectorDrawableCompat extends C0435g {

    /* renamed from: a */
    static final Mode f1787a = Mode.SRC_IN;

    /* renamed from: c */
    public boolean f1788c;

    /* renamed from: d */
    private C0426g f1789d;

    /* renamed from: e */
    private PorterDuffColorFilter f1790e;

    /* renamed from: f */
    private ColorFilter f1791f;

    /* renamed from: g */
    private boolean f1792g;

    /* renamed from: h */
    private ConstantState f1793h;

    /* renamed from: i */
    private final float[] f1794i;

    /* renamed from: j */
    private final Matrix f1795j;

    /* renamed from: k */
    private final Rect f1796k;

    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$a */
    static class C0420a extends C0424e {
        public C0420a() {
        }

        /* renamed from: a */
        public final boolean mo1954a() {
            return true;
        }

        public C0420a(C0420a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        private void m1861a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1824n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f1823m = C0722b.m3077b(string2);
            }
        }

        /* renamed from: a */
        public final void mo1953a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0704f.m2994a(xmlPullParser, "pathData")) {
                TypedArray a = C0704f.m2990a(resources, theme, attributeSet, C0428a.f1859d);
                m1861a(a);
                a.recycle();
            }
        }
    }

    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$b */
    static class C0421b extends C0424e {

        /* renamed from: a */
        C0696b f1797a;

        /* renamed from: b */
        float f1798b;

        /* renamed from: c */
        C0696b f1799c;

        /* renamed from: d */
        float f1800d = 1.0f;

        /* renamed from: e */
        int f1801e;

        /* renamed from: f */
        float f1802f = 1.0f;

        /* renamed from: g */
        float f1803g;

        /* renamed from: h */
        float f1804h = 1.0f;

        /* renamed from: i */
        float f1805i;

        /* renamed from: j */
        Cap f1806j = Cap.BUTT;

        /* renamed from: k */
        Join f1807k = Join.MITER;

        /* renamed from: l */
        float f1808l = 4.0f;

        /* renamed from: p */
        private int[] f1809p;

        /* access modifiers changed from: 0000 */
        public final float getFillAlpha() {
            return this.f1802f;
        }

        /* access modifiers changed from: 0000 */
        public final float getStrokeAlpha() {
            return this.f1800d;
        }

        /* access modifiers changed from: 0000 */
        public final float getStrokeWidth() {
            return this.f1798b;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathEnd() {
            return this.f1804h;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathOffset() {
            return this.f1805i;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathStart() {
            return this.f1803g;
        }

        /* access modifiers changed from: 0000 */
        public final int getFillColor() {
            return this.f1799c.f2661b;
        }

        /* access modifiers changed from: 0000 */
        public final int getStrokeColor() {
            return this.f1797a.f2661b;
        }

        public C0421b() {
        }

        /* renamed from: b */
        public final boolean mo1957b() {
            if (this.f1799c.mo2844b() || this.f1797a.mo2844b()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final void setFillAlpha(float f) {
            this.f1802f = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeAlpha(float f) {
            this.f1800d = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeWidth(float f) {
            this.f1798b = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathEnd(float f) {
            this.f1804h = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathOffset(float f) {
            this.f1805i = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathStart(float f) {
            this.f1803g = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setFillColor(int i) {
            this.f1799c.f2661b = i;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeColor(int i) {
            this.f1797a.f2661b = i;
        }

        public C0421b(C0421b bVar) {
            super(bVar);
            this.f1809p = bVar.f1809p;
            this.f1797a = bVar.f1797a;
            this.f1798b = bVar.f1798b;
            this.f1800d = bVar.f1800d;
            this.f1799c = bVar.f1799c;
            this.f1801e = bVar.f1801e;
            this.f1802f = bVar.f1802f;
            this.f1803g = bVar.f1803g;
            this.f1804h = bVar.f1804h;
            this.f1805i = bVar.f1805i;
            this.f1806j = bVar.f1806j;
            this.f1807k = bVar.f1807k;
            this.f1808l = bVar.f1808l;
        }

        /* renamed from: a */
        public final boolean mo1956a(int[] iArr) {
            return this.f1797a.mo2843a(iArr) | this.f1799c.mo2843a(iArr);
        }

        /* renamed from: a */
        private static Cap m1864a(int i, Cap cap) {
            switch (i) {
                case 0:
                    return Cap.BUTT;
                case 1:
                    return Cap.ROUND;
                case 2:
                    return Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private static Join m1865a(int i, Join join) {
            switch (i) {
                case 0:
                    return Join.MITER;
                case 1:
                    return Join.ROUND;
                case 2:
                    return Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        private void m1866a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.f1809p = null;
            if (C0704f.m2994a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f1824n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f1823m = C0722b.m3077b(string2);
                }
                Theme theme2 = theme;
                this.f1799c = C0704f.m2991a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f1802f = C0704f.m2988a(typedArray, xmlPullParser, "fillAlpha", 12, this.f1802f);
                this.f1806j = m1864a(C0704f.m2989a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f1806j);
                this.f1807k = m1865a(C0704f.m2989a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f1807k);
                this.f1808l = C0704f.m2988a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f1808l);
                this.f1797a = C0704f.m2991a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f1800d = C0704f.m2988a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f1800d);
                this.f1798b = C0704f.m2988a(typedArray, xmlPullParser, "strokeWidth", 4, this.f1798b);
                this.f1804h = C0704f.m2988a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f1804h);
                this.f1805i = C0704f.m2988a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f1805i);
                this.f1803g = C0704f.m2988a(typedArray, xmlPullParser, "trimPathStart", 5, this.f1803g);
                this.f1801e = C0704f.m2989a(typedArray, xmlPullParser, "fillType", 13, this.f1801e);
            }
        }

        /* renamed from: a */
        public final void mo1955a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0704f.m2990a(resources, theme, attributeSet, C0428a.f1858c);
            m1866a(a, xmlPullParser, theme);
            a.recycle();
        }
    }

    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$c */
    static class C0422c extends C0423d {

        /* renamed from: a */
        final Matrix f1810a = new Matrix();

        /* renamed from: b */
        final ArrayList<C0423d> f1811b = new ArrayList<>();

        /* renamed from: c */
        float f1812c = 0.0f;

        /* renamed from: d */
        final Matrix f1813d = new Matrix();

        /* renamed from: e */
        int f1814e;

        /* renamed from: f */
        private float f1815f = 0.0f;

        /* renamed from: g */
        private float f1816g = 0.0f;

        /* renamed from: h */
        private float f1817h = 1.0f;

        /* renamed from: i */
        private float f1818i = 1.0f;

        /* renamed from: j */
        private float f1819j = 0.0f;

        /* renamed from: k */
        private float f1820k = 0.0f;

        /* renamed from: l */
        private int[] f1821l;

        /* renamed from: m */
        private String f1822m = null;

        public final String getGroupName() {
            return this.f1822m;
        }

        public final Matrix getLocalMatrix() {
            return this.f1813d;
        }

        public final float getPivotX() {
            return this.f1815f;
        }

        public final float getPivotY() {
            return this.f1816g;
        }

        public final float getRotation() {
            return this.f1812c;
        }

        public final float getScaleX() {
            return this.f1817h;
        }

        public final float getScaleY() {
            return this.f1818i;
        }

        public final float getTranslateX() {
            return this.f1819j;
        }

        public final float getTranslateY() {
            return this.f1820k;
        }

        /* renamed from: b */
        public final boolean mo1957b() {
            for (int i = 0; i < this.f1811b.size(); i++) {
                if (((C0423d) this.f1811b.get(i)).mo1957b()) {
                    return true;
                }
            }
            return false;
        }

        public C0422c() {
            super();
        }

        /* renamed from: a */
        private void m1870a() {
            this.f1813d.reset();
            this.f1813d.postTranslate(-this.f1815f, -this.f1816g);
            this.f1813d.postScale(this.f1817h, this.f1818i);
            this.f1813d.postRotate(this.f1812c, 0.0f, 0.0f);
            this.f1813d.postTranslate(this.f1819j + this.f1815f, this.f1820k + this.f1816g);
        }

        public final void setPivotX(float f) {
            if (f != this.f1815f) {
                this.f1815f = f;
                m1870a();
            }
        }

        public final void setPivotY(float f) {
            if (f != this.f1816g) {
                this.f1816g = f;
                m1870a();
            }
        }

        public final void setRotation(float f) {
            if (f != this.f1812c) {
                this.f1812c = f;
                m1870a();
            }
        }

        public final void setScaleX(float f) {
            if (f != this.f1817h) {
                this.f1817h = f;
                m1870a();
            }
        }

        public final void setScaleY(float f) {
            if (f != this.f1818i) {
                this.f1818i = f;
                m1870a();
            }
        }

        public final void setTranslateX(float f) {
            if (f != this.f1819j) {
                this.f1819j = f;
                m1870a();
            }
        }

        public final void setTranslateY(float f) {
            if (f != this.f1820k) {
                this.f1820k = f;
                m1870a();
            }
        }

        /* renamed from: a */
        public final boolean mo1956a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f1811b.size(); i++) {
                z |= ((C0423d) this.f1811b.get(i)).mo1956a(iArr);
            }
            return z;
        }

        /* renamed from: a */
        private void m1871a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f1821l = null;
            this.f1812c = C0704f.m2988a(typedArray, xmlPullParser, "rotation", 5, this.f1812c);
            this.f1815f = typedArray.getFloat(1, this.f1815f);
            this.f1816g = typedArray.getFloat(2, this.f1816g);
            this.f1817h = C0704f.m2988a(typedArray, xmlPullParser, "scaleX", 3, this.f1817h);
            this.f1818i = C0704f.m2988a(typedArray, xmlPullParser, "scaleY", 4, this.f1818i);
            this.f1819j = C0704f.m2988a(typedArray, xmlPullParser, "translateX", 6, this.f1819j);
            this.f1820k = C0704f.m2988a(typedArray, xmlPullParser, "translateY", 7, this.f1820k);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1822m = string;
            }
            m1870a();
        }

        public C0422c(C0422c cVar, ArrayMap<String, Object> arrayMap) {
            C0424e eVar;
            super();
            this.f1812c = cVar.f1812c;
            this.f1815f = cVar.f1815f;
            this.f1816g = cVar.f1816g;
            this.f1817h = cVar.f1817h;
            this.f1818i = cVar.f1818i;
            this.f1819j = cVar.f1819j;
            this.f1820k = cVar.f1820k;
            this.f1821l = cVar.f1821l;
            this.f1822m = cVar.f1822m;
            this.f1814e = cVar.f1814e;
            if (this.f1822m != null) {
                arrayMap.put(this.f1822m, this);
            }
            this.f1813d.set(cVar.f1813d);
            ArrayList<C0423d> arrayList = cVar.f1811b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0422c) {
                    this.f1811b.add(new C0422c((C0422c) obj, arrayMap));
                } else {
                    if (obj instanceof C0421b) {
                        eVar = new C0421b((C0421b) obj);
                    } else if (obj instanceof C0420a) {
                        eVar = new C0420a((C0420a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f1811b.add(eVar);
                    if (eVar.f1824n != null) {
                        arrayMap.put(eVar.f1824n, eVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo1974a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0704f.m2990a(resources, theme, attributeSet, C0428a.f1857b);
            m1871a(a, xmlPullParser);
            a.recycle();
        }
    }

    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$d */
    static abstract class C0423d {
        private C0423d() {
        }

        /* renamed from: a */
        public boolean mo1956a(int[] iArr) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1957b() {
            return false;
        }
    }

    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$e */
    static abstract class C0424e extends C0423d {

        /* renamed from: m */
        protected C0724b[] f1823m;

        /* renamed from: n */
        String f1824n;

        /* renamed from: o */
        int f1825o;

        /* renamed from: a */
        public boolean mo1954a() {
            return false;
        }

        public C0724b[] getPathData() {
            return this.f1823m;
        }

        public String getPathName() {
            return this.f1824n;
        }

        public C0424e() {
            super();
        }

        /* renamed from: a */
        public final void mo1991a(Path path) {
            path.reset();
            if (this.f1823m != null) {
                C0724b.m3082a(this.f1823m, path);
            }
        }

        public C0424e(C0424e eVar) {
            super();
            this.f1824n = eVar.f1824n;
            this.f1825o = eVar.f1825o;
            this.f1823m = C0722b.m3075a(eVar.f1823m);
        }

        public void setPathData(C0724b[] bVarArr) {
            if (!C0722b.m3073a(this.f1823m, bVarArr)) {
                this.f1823m = C0722b.m3075a(bVarArr);
            } else {
                C0722b.m3076b(this.f1823m, bVarArr);
            }
        }
    }

    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$f */
    static class C0425f {

        /* renamed from: n */
        private static final Matrix f1826n = new Matrix();

        /* renamed from: a */
        Paint f1827a;

        /* renamed from: b */
        Paint f1828b;

        /* renamed from: c */
        final C0422c f1829c;

        /* renamed from: d */
        float f1830d;

        /* renamed from: e */
        float f1831e;

        /* renamed from: f */
        float f1832f;

        /* renamed from: g */
        float f1833g;

        /* renamed from: h */
        int f1834h;

        /* renamed from: i */
        String f1835i;

        /* renamed from: j */
        Boolean f1836j;

        /* renamed from: k */
        final ArrayMap<String, Object> f1837k;

        /* renamed from: l */
        private final Path f1838l;

        /* renamed from: m */
        private final Path f1839m;

        /* renamed from: o */
        private final Matrix f1840o;

        /* renamed from: p */
        private PathMeasure f1841p;

        /* renamed from: q */
        private int f1842q;

        /* renamed from: a */
        private static float m1879a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public final int getRootAlpha() {
            return this.f1834h;
        }

        public final float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        /* renamed from: a */
        public final boolean mo1996a() {
            if (this.f1836j == null) {
                this.f1836j = Boolean.valueOf(this.f1829c.mo1957b());
            }
            return this.f1836j.booleanValue();
        }

        public C0425f() {
            this.f1840o = new Matrix();
            this.f1830d = 0.0f;
            this.f1831e = 0.0f;
            this.f1832f = 0.0f;
            this.f1833g = 0.0f;
            this.f1834h = NormalGiftView.ALPHA_255;
            this.f1835i = null;
            this.f1836j = null;
            this.f1837k = new ArrayMap<>();
            this.f1829c = new C0422c();
            this.f1838l = new Path();
            this.f1839m = new Path();
        }

        public final void setRootAlpha(int i) {
            this.f1834h = i;
        }

        public final void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        /* renamed from: a */
        public final boolean mo1997a(int[] iArr) {
            return this.f1829c.mo1956a(iArr);
        }

        public C0425f(C0425f fVar) {
            this.f1840o = new Matrix();
            this.f1830d = 0.0f;
            this.f1831e = 0.0f;
            this.f1832f = 0.0f;
            this.f1833g = 0.0f;
            this.f1834h = NormalGiftView.ALPHA_255;
            this.f1835i = null;
            this.f1836j = null;
            this.f1837k = new ArrayMap<>();
            this.f1829c = new C0422c(fVar.f1829c, this.f1837k);
            this.f1838l = new Path(fVar.f1838l);
            this.f1839m = new Path(fVar.f1839m);
            this.f1830d = fVar.f1830d;
            this.f1831e = fVar.f1831e;
            this.f1832f = fVar.f1832f;
            this.f1833g = fVar.f1833g;
            this.f1842q = fVar.f1842q;
            this.f1834h = fVar.f1834h;
            this.f1835i = fVar.f1835i;
            if (fVar.f1835i != null) {
                this.f1837k.put(fVar.f1835i, this);
            }
            this.f1836j = fVar.f1836j;
        }

        /* renamed from: a */
        private static float m1880a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m1879a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        public final void mo1995a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m1881a(this.f1829c, f1826n, canvas, i, i2, (ColorFilter) null);
        }

        /* renamed from: a */
        private void m1881a(C0422c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f1810a.set(matrix);
            cVar.f1810a.preConcat(cVar.f1813d);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f1811b.size(); i3++) {
                C0423d dVar = (C0423d) cVar.f1811b.get(i3);
                if (dVar instanceof C0422c) {
                    m1881a((C0422c) dVar, cVar.f1810a, canvas, i, i2, colorFilter);
                } else if (dVar instanceof C0424e) {
                    m1882a(cVar, (C0424e) dVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        private void m1882a(C0422c cVar, C0424e eVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            FillType fillType;
            float f = ((float) i) / this.f1832f;
            float f2 = ((float) i2) / this.f1833g;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.f1810a;
            this.f1840o.set(matrix);
            this.f1840o.postScale(f, f2);
            float a = m1880a(matrix);
            if (a != 0.0f) {
                eVar.mo1991a(this.f1838l);
                Path path = this.f1838l;
                this.f1839m.reset();
                if (eVar.mo1954a()) {
                    this.f1839m.addPath(path, this.f1840o);
                    canvas.clipPath(this.f1839m);
                    return;
                }
                C0421b bVar = (C0421b) eVar;
                if (!(bVar.f1803g == 0.0f && bVar.f1804h == 1.0f)) {
                    float f3 = (bVar.f1803g + bVar.f1805i) % 1.0f;
                    float f4 = (bVar.f1804h + bVar.f1805i) % 1.0f;
                    if (this.f1841p == null) {
                        this.f1841p = new PathMeasure();
                    }
                    this.f1841p.setPath(this.f1838l, false);
                    float length = this.f1841p.getLength();
                    float f5 = f3 * length;
                    float f6 = f4 * length;
                    path.reset();
                    if (f5 > f6) {
                        this.f1841p.getSegment(f5, length, path, true);
                        this.f1841p.getSegment(0.0f, f6, path, true);
                    } else {
                        this.f1841p.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f1839m.addPath(path, this.f1840o);
                if (bVar.f1799c.mo2845c()) {
                    C0696b bVar2 = bVar.f1799c;
                    if (this.f1828b == null) {
                        this.f1828b = new Paint(1);
                        this.f1828b.setStyle(Style.FILL);
                    }
                    Paint paint = this.f1828b;
                    if (bVar2.mo2842a()) {
                        Shader shader = bVar2.f2660a;
                        shader.setLocalMatrix(this.f1840o);
                        paint.setShader(shader);
                        paint.setAlpha(Math.round(bVar.f1802f * 255.0f));
                    } else {
                        paint.setColor(VectorDrawableCompat.m1852a(bVar2.f2661b, bVar.f1802f));
                    }
                    paint.setColorFilter(colorFilter);
                    Path path2 = this.f1839m;
                    if (bVar.f1801e == 0) {
                        fillType = FillType.WINDING;
                    } else {
                        fillType = FillType.EVEN_ODD;
                    }
                    path2.setFillType(fillType);
                    canvas.drawPath(this.f1839m, paint);
                }
                if (bVar.f1797a.mo2845c()) {
                    C0696b bVar3 = bVar.f1797a;
                    if (this.f1827a == null) {
                        this.f1827a = new Paint(1);
                        this.f1827a.setStyle(Style.STROKE);
                    }
                    Paint paint2 = this.f1827a;
                    if (bVar.f1807k != null) {
                        paint2.setStrokeJoin(bVar.f1807k);
                    }
                    if (bVar.f1806j != null) {
                        paint2.setStrokeCap(bVar.f1806j);
                    }
                    paint2.setStrokeMiter(bVar.f1808l);
                    if (bVar3.mo2842a()) {
                        Shader shader2 = bVar3.f2660a;
                        shader2.setLocalMatrix(this.f1840o);
                        paint2.setShader(shader2);
                        paint2.setAlpha(Math.round(bVar.f1800d * 255.0f));
                    } else {
                        paint2.setColor(VectorDrawableCompat.m1852a(bVar3.f2661b, bVar.f1800d));
                    }
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(bVar.f1798b * min * a);
                    canvas.drawPath(this.f1839m, paint2);
                }
            }
        }
    }

    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$g */
    static class C0426g extends ConstantState {

        /* renamed from: a */
        int f1843a;

        /* renamed from: b */
        C0425f f1844b;

        /* renamed from: c */
        ColorStateList f1845c;

        /* renamed from: d */
        Mode f1846d;

        /* renamed from: e */
        boolean f1847e;

        /* renamed from: f */
        Bitmap f1848f;

        /* renamed from: g */
        ColorStateList f1849g;

        /* renamed from: h */
        Mode f1850h;

        /* renamed from: i */
        int f1851i;

        /* renamed from: j */
        boolean f1852j;

        /* renamed from: k */
        boolean f1853k;

        /* renamed from: l */
        Paint f1854l;

        public final int getChangingConfigurations() {
            return this.f1843a;
        }

        /* renamed from: c */
        public final boolean mo2008c() {
            return this.f1844b.mo1996a();
        }

        public final Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        public C0426g() {
            this.f1846d = VectorDrawableCompat.f1787a;
            this.f1844b = new C0425f();
        }

        /* renamed from: d */
        private boolean m1888d() {
            if (this.f1844b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo2006b() {
            this.f1849g = this.f1845c;
            this.f1850h = this.f1846d;
            this.f1851i = this.f1844b.getRootAlpha();
            this.f1852j = this.f1847e;
            this.f1853k = false;
        }

        /* renamed from: a */
        public final boolean mo2004a() {
            if (!this.f1853k && this.f1849g == this.f1845c && this.f1850h == this.f1846d && this.f1852j == this.f1847e && this.f1851i == this.f1844b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        public final Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        /* renamed from: a */
        private Paint m1886a(ColorFilter colorFilter) {
            if (!m1888d() && colorFilter == null) {
                return null;
            }
            if (this.f1854l == null) {
                this.f1854l = new Paint();
                this.f1854l.setFilterBitmap(true);
            }
            this.f1854l.setAlpha(this.f1844b.getRootAlpha());
            this.f1854l.setColorFilter(colorFilter);
            return this.f1854l;
        }

        public C0426g(C0426g gVar) {
            this.f1846d = VectorDrawableCompat.f1787a;
            if (gVar != null) {
                this.f1843a = gVar.f1843a;
                this.f1844b = new C0425f(gVar.f1844b);
                if (gVar.f1844b.f1828b != null) {
                    this.f1844b.f1828b = new Paint(gVar.f1844b.f1828b);
                }
                if (gVar.f1844b.f1827a != null) {
                    this.f1844b.f1827a = new Paint(gVar.f1844b.f1827a);
                }
                this.f1845c = gVar.f1845c;
                this.f1846d = gVar.f1846d;
                this.f1847e = gVar.f1847e;
            }
        }

        /* renamed from: a */
        public final boolean mo2005a(int[] iArr) {
            boolean a = this.f1844b.mo1997a(iArr);
            this.f1853k |= a;
            return a;
        }

        /* renamed from: c */
        private boolean m1887c(int i, int i2) {
            if (i == this.f1848f.getWidth() && i2 == this.f1848f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo2002a(int i, int i2) {
            this.f1848f.eraseColor(0);
            this.f1844b.mo1995a(new Canvas(this.f1848f), i, i2, (ColorFilter) null);
        }

        /* renamed from: b */
        public final void mo2007b(int i, int i2) {
            if (this.f1848f == null || !m1887c(i, i2)) {
                this.f1848f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f1853k = true;
            }
        }

        /* renamed from: a */
        public final void mo2003a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f1848f, null, rect, m1886a(colorFilter));
        }
    }

    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$h */
    static class C0427h extends ConstantState {

        /* renamed from: a */
        private final ConstantState f1855a;

        public final boolean canApplyTheme() {
            return this.f1855a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f1855a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f1872b = (VectorDrawable) this.f1855a.newDrawable();
            return vectorDrawableCompat;
        }

        public C0427h(ConstantState constantState) {
            this.f1855a = constantState;
        }

        public final Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f1872b = (VectorDrawable) this.f1855a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f1872b = (VectorDrawable) this.f1855a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public boolean canApplyTheme() {
        if (this.f1872b != null) {
            C0727a.m3113d(this.f1872b);
        }
        return false;
    }

    public int getOpacity() {
        if (this.f1872b != null) {
            return this.f1872b.getOpacity();
        }
        return -3;
    }

    public void invalidateSelf() {
        if (this.f1872b != null) {
            this.f1872b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        if (this.f1872b != null) {
            return C0727a.m3110b(this.f1872b);
        }
        return this.f1789d.f1847e;
    }

    public int getAlpha() {
        if (this.f1872b != null) {
            return C0727a.m3112c(this.f1872b);
        }
        return this.f1789d.f1844b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        if (this.f1872b != null) {
            return this.f1872b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f1789d.getChangingConfigurations();
    }

    public int getIntrinsicHeight() {
        if (this.f1872b != null) {
            return this.f1872b.getIntrinsicHeight();
        }
        return (int) this.f1789d.f1844b.f1831e;
    }

    public int getIntrinsicWidth() {
        if (this.f1872b != null) {
            return this.f1872b.getIntrinsicWidth();
        }
        return (int) this.f1789d.f1844b.f1830d;
    }

    VectorDrawableCompat() {
        this.f1788c = true;
        this.f1794i = new float[9];
        this.f1795j = new Matrix();
        this.f1796k = new Rect();
        this.f1789d = new C0426g();
    }

    public ConstantState getConstantState() {
        if (this.f1872b != null && VERSION.SDK_INT >= 24) {
            return new C0427h(this.f1872b.getConstantState());
        }
        this.f1789d.f1843a = getChangingConfigurations();
        return this.f1789d;
    }

    public boolean isStateful() {
        if (this.f1872b != null) {
            return this.f1872b.isStateful();
        }
        if (super.isStateful() || (this.f1789d != null && (this.f1789d.mo2008c() || (this.f1789d.f1845c != null && this.f1789d.f1845c.isStateful())))) {
            return true;
        }
        return false;
    }

    public Drawable mutate() {
        if (this.f1872b != null) {
            this.f1872b.mutate();
            return this;
        }
        if (!this.f1792g && super.mutate() == this) {
            this.f1789d = new C0426g(this.f1789d);
            this.f1792g = true;
        }
        return this;
    }

    /* renamed from: a */
    private boolean m1858a() {
        if (VERSION.SDK_INT < 17 || !isAutoMirrored() || C0727a.m3118i(this) != 1) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f1872b != null) {
            this.f1872b.setBounds(rect);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f1872b != null) {
            C0727a.m3109a(this.f1872b, z);
        } else {
            this.f1789d.f1847e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f1872b != null) {
            this.f1872b.setColorFilter(colorFilter);
            return;
        }
        this.f1791f = colorFilter;
        invalidateSelf();
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.f1872b != null) {
            this.f1872b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public void setAlpha(int i) {
        if (this.f1872b != null) {
            this.f1872b.setAlpha(i);
            return;
        }
        if (this.f1789d.f1844b.getRootAlpha() != i) {
            this.f1789d.f1844b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setTint(int i) {
        if (this.f1872b != null) {
            C0727a.m3103a(this.f1872b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f1872b != null) {
            C0727a.m3105a(this.f1872b, colorStateList);
            return;
        }
        C0426g gVar = this.f1789d;
        if (gVar.f1845c != colorStateList) {
            gVar.f1845c = colorStateList;
            this.f1790e = m1854a(this.f1790e, colorStateList, gVar.f1846d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        if (this.f1872b != null) {
            C0727a.m3108a(this.f1872b, mode);
            return;
        }
        C0426g gVar = this.f1789d;
        if (gVar.f1846d != mode) {
            gVar.f1846d = mode;
            this.f1790e = m1854a(this.f1790e, gVar.f1845c, mode);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f1872b != null) {
            return this.f1872b.setState(iArr);
        }
        boolean z = false;
        C0426g gVar = this.f1789d;
        if (!(gVar.f1845c == null || gVar.f1846d == null)) {
            this.f1790e = m1854a(this.f1790e, gVar.f1845c, gVar.f1846d);
            invalidateSelf();
            z = true;
        }
        if (gVar.mo2008c() && gVar.mo2005a(iArr)) {
            invalidateSelf();
            z = true;
        }
        return z;
    }

    VectorDrawableCompat(C0426g gVar) {
        this.f1788c = true;
        this.f1794i = new float[9];
        this.f1795j = new Matrix();
        this.f1796k = new Rect();
        this.f1789d = gVar;
        this.f1790e = m1854a(this.f1790e, gVar.f1845c, gVar.f1846d);
    }

    public void draw(Canvas canvas) {
        ColorFilter colorFilter;
        if (this.f1872b != null) {
            this.f1872b.draw(canvas);
            return;
        }
        copyBounds(this.f1796k);
        if (this.f1796k.width() > 0 && this.f1796k.height() > 0) {
            if (this.f1791f == null) {
                colorFilter = this.f1790e;
            } else {
                colorFilter = this.f1791f;
            }
            canvas.getMatrix(this.f1795j);
            this.f1795j.getValues(this.f1794i);
            float abs = Math.abs(this.f1794i[0]);
            float abs2 = Math.abs(this.f1794i[4]);
            float abs3 = Math.abs(this.f1794i[1]);
            float abs4 = Math.abs(this.f1794i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int height = (int) (((float) this.f1796k.height()) * abs2);
            int min = Math.min(2048, (int) (((float) this.f1796k.width()) * abs));
            int min2 = Math.min(2048, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f1796k.left, (float) this.f1796k.top);
                if (m1858a()) {
                    canvas.translate((float) this.f1796k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f1796k.offsetTo(0, 0);
                this.f1789d.mo2007b(min, min2);
                if (!this.f1788c) {
                    this.f1789d.mo2002a(min, min2);
                } else if (!this.f1789d.mo2004a()) {
                    this.f1789d.mo2002a(min, min2);
                    this.f1789d.mo2006b();
                }
                this.f1789d.mo2003a(canvas, colorFilter, this.f1796k);
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo1931a(String str) {
        return this.f1789d.f1844b.f1837k.get(str);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    /* renamed from: a */
    static int m1852a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f1872b != null) {
            this.f1872b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f1872b != null) {
            return this.f1872b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    /* renamed from: a */
    private static Mode m1853a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m1857a(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        C0426g gVar = this.f1789d;
        C0425f fVar = gVar.f1844b;
        gVar.f1846d = m1853a(C0704f.m2989a(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            gVar.f1845c = colorStateList;
        }
        gVar.f1847e = C0704f.m2993a(typedArray, xmlPullParser, "autoMirrored", 5, gVar.f1847e);
        fVar.f1832f = C0704f.m2988a(typedArray, xmlPullParser, "viewportWidth", 7, fVar.f1832f);
        fVar.f1833g = C0704f.m2988a(typedArray, xmlPullParser, "viewportHeight", 8, fVar.f1833g);
        if (fVar.f1832f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (fVar.f1833g > 0.0f) {
            fVar.f1830d = typedArray.getDimension(3, fVar.f1830d);
            fVar.f1831e = typedArray.getDimension(2, fVar.f1831e);
            if (fVar.f1830d <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (fVar.f1831e > 0.0f) {
                fVar.setAlpha(C0704f.m2988a(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    fVar.f1835i = string;
                    fVar.f1837k.put(string, fVar);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.f1872b != null) {
            this.f1872b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* renamed from: a */
    private PorterDuffColorFilter m1854a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    public static VectorDrawableCompat m1855a(Resources resources, int i, Theme theme) {
        int next;
        if (VERSION.SDK_INT >= 24) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f1872b = C0700e.m2981a(resources, i, theme);
            vectorDrawableCompat.f1793h = new C0427h(vectorDrawableCompat.f1872b.getConstantState());
            return vectorDrawableCompat;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m1856a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (this.f1872b != null) {
            C0727a.m3107a(this.f1872b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0426g gVar = this.f1789d;
        gVar.f1844b = new C0425f();
        TypedArray a = C0704f.m2990a(resources, theme, attributeSet, C0428a.f1856a);
        m1857a(a, xmlPullParser);
        a.recycle();
        gVar.f1843a = getChangingConfigurations();
        gVar.f1853k = true;
        m1859b(resources, xmlPullParser, attributeSet, theme);
        this.f1790e = m1854a(this.f1790e, gVar.f1845c, gVar.f1846d);
    }

    /* renamed from: a */
    public static VectorDrawableCompat m1856a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    /* renamed from: b */
    private void m1859b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C0426g gVar = this.f1789d;
        C0425f fVar = gVar.f1844b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f1829c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0422c cVar = (C0422c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0421b bVar = new C0421b();
                    bVar.mo1955a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f1811b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f1837k.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    gVar.f1843a = bVar.f1825o | gVar.f1843a;
                } else if ("clip-path".equals(name)) {
                    C0420a aVar = new C0420a();
                    aVar.mo1953a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f1811b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.f1837k.put(aVar.getPathName(), aVar);
                    }
                    gVar.f1843a = aVar.f1825o | gVar.f1843a;
                } else if ("group".equals(name)) {
                    C0422c cVar2 = new C0422c();
                    cVar2.mo1974a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f1811b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.f1837k.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.f1843a = cVar2.f1814e | gVar.f1843a;
                }
            } else if (eventType == 3) {
                if ("group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }
}
