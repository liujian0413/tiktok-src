package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.graphics.C0721a;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.util.C0893e;
import android.support.p022v4.util.C0894f;
import android.support.p022v4.util.C0905l;
import android.support.p029v7.graphics.drawable.AnimatedStateListDrawableCompat;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.g */
public final class C1393g {

    /* renamed from: a */
    private static final Mode f5433a = Mode.SRC_IN;

    /* renamed from: b */
    private static C1393g f5434b;

    /* renamed from: c */
    private static final C1396c f5435c = new C1396c(6);

    /* renamed from: d */
    private static final int[] f5436d = {R.drawable.bo, R.drawable.bm, R.drawable.h};

    /* renamed from: e */
    private static final int[] f5437e = {R.drawable.a3, R.drawable.b7, R.drawable.a_, R.drawable.a5, R.drawable.a6, R.drawable.a9, R.drawable.a8};

    /* renamed from: f */
    private static final int[] f5438f = {R.drawable.bl, R.drawable.bn, R.drawable.w, R.drawable.be, R.drawable.bf, R.drawable.bh, R.drawable.bj, R.drawable.bg, R.drawable.bi, R.drawable.bk};

    /* renamed from: g */
    private static final int[] f5439g = {R.drawable.ax, R.drawable.u, R.drawable.aw};

    /* renamed from: h */
    private static final int[] f5440h = {R.drawable.bc, R.drawable.bp};

    /* renamed from: i */
    private static final int[] f5441i = {R.drawable.k, R.drawable.p};

    /* renamed from: j */
    private WeakHashMap<Context, C0905l<ColorStateList>> f5442j;

    /* renamed from: k */
    private ArrayMap<String, C1397d> f5443k;

    /* renamed from: l */
    private C0905l<String> f5444l;

    /* renamed from: m */
    private final WeakHashMap<Context, C0893e<WeakReference<ConstantState>>> f5445m = new WeakHashMap<>(0);

    /* renamed from: n */
    private TypedValue f5446n;

    /* renamed from: o */
    private boolean f5447o;

    /* renamed from: android.support.v7.widget.g$a */
    static class C1394a implements C1397d {
        C1394a() {
        }

        /* renamed from: a */
        public final Drawable mo6492a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.m4960a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.g$b */
    static class C1395b implements C1397d {
        C1395b() {
        }

        /* renamed from: a */
        public final Drawable mo6492a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.m1848a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.g$c */
    static class C1396c extends C0894f<Integer, PorterDuffColorFilter> {
        public C1396c(int i) {
            super(6);
        }

        /* renamed from: b */
        private static int m6927b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final PorterDuffColorFilter mo6493a(int i, Mode mode) {
            return (PorterDuffColorFilter) mo3341a(Integer.valueOf(m6927b(i, mode)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final PorterDuffColorFilter mo6494a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo3342a(Integer.valueOf(m6927b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: android.support.v7.widget.g$d */
    interface C1397d {
        /* renamed from: a */
        Drawable mo6492a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: android.support.v7.widget.g$e */
    static class C1398e implements C1397d {
        C1398e() {
        }

        /* renamed from: a */
        public final Drawable mo6492a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return VectorDrawableCompat.m1856a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private static void m6905a(C1393g gVar) {
        if (VERSION.SDK_INT < 24) {
            gVar.m6906a("vector", (C1397d) new C1398e());
            gVar.m6906a("animated-vector", (C1397d) new C1395b());
            gVar.m6906a("animated-selector", (C1397d) new C1394a());
        }
    }

    /* renamed from: a */
    public final synchronized Drawable mo6487a(Context context, int i) {
        return mo6488a(context, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized Drawable mo6488a(Context context, int i, boolean z) {
        Drawable d;
        m6919f(context);
        d = m6915d(context, i);
        if (d == null) {
            d = m6913c(context, i);
        }
        if (d == null) {
            d = C0683b.m2903a(context, i);
        }
        if (d != null) {
            d = m6899a(context, i, z, d);
        }
        if (d != null) {
            C1433w.m7202b(d);
        }
        return d;
    }

    /* renamed from: a */
    public final synchronized void mo6490a(Context context) {
        C0893e eVar = (C0893e) this.f5445m.get(context);
        if (eVar != null) {
            eVar.mo3335c();
        }
    }

    /* renamed from: a */
    private synchronized boolean m6908a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0893e eVar = (C0893e) this.f5445m.get(context);
        if (eVar == null) {
            eVar = new C0893e();
            this.f5445m.put(context, eVar);
        }
        eVar.mo3333b(j, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized Drawable mo6489a(Context context, C1371az azVar, int i) {
        Drawable d = m6915d(context, i);
        if (d == null) {
            d = azVar.mo6417a(i);
        }
        if (d == null) {
            return null;
        }
        return m6899a(context, i, false, d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m6907a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f5433a
            int[] r1 = f5436d
            boolean r1 = m6910a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0016
            r2 = 2130968830(0x7f0400fe, float:1.7546325E38)
        L_0x0013:
            r7 = 1
            r1 = -1
            goto L_0x0048
        L_0x0016:
            int[] r1 = f5438f
            boolean r1 = m6910a(r1, r7)
            if (r1 == 0) goto L_0x0022
            r2 = 2130968828(0x7f0400fc, float:1.754632E38)
            goto L_0x0013
        L_0x0022:
            int[] r1 = f5439g
            boolean r1 = m6910a(r1, r7)
            if (r1 == 0) goto L_0x002d
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0013
        L_0x002d:
            r1 = 2131230768(0x7f080030, float:1.8077598E38)
            if (r7 != r1) goto L_0x003f
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L_0x0048
        L_0x003f:
            r1 = 2131230744(0x7f080018, float:1.807755E38)
            if (r7 != r1) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            r7 = 0
            r1 = -1
            r2 = 0
        L_0x0048:
            if (r7 == 0) goto L_0x0065
            boolean r7 = android.support.p029v7.widget.C1433w.m7203c(r8)
            if (r7 == 0) goto L_0x0054
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x0054:
            int r6 = android.support.p029v7.widget.C1361ar.m6734a(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m6897a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x0064
            r8.setAlpha(r1)
        L_0x0064:
            return r5
        L_0x0065:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.C1393g.m6907a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private void m6906a(String str, C1397d dVar) {
        if (this.f5443k == null) {
            this.f5443k = new ArrayMap<>();
        }
        this.f5443k.put(str, dVar);
    }

    /* renamed from: a */
    private static boolean m6910a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static void m6904a(Drawable drawable, C1363at atVar, int[] iArr) {
        if (!C1433w.m7203c(drawable) || drawable.mutate() == drawable) {
            if (atVar.f5345d || atVar.f5344c) {
                drawable.setColorFilter(m6898a(atVar.f5345d ? atVar.f5342a : null, atVar.f5344c ? atVar.f5343b : f5433a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: a */
    private static void m6903a(Drawable drawable, int i, Mode mode) {
        if (C1433w.m7203c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f5433a;
        }
        drawable.setColorFilter(m6897a(i, mode));
    }

    /* renamed from: a */
    private static boolean m6909a(Drawable drawable) {
        return (drawable instanceof VectorDrawableCompat) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: a */
    public static synchronized C1393g m6901a() {
        C1393g gVar;
        synchronized (C1393g.class) {
            if (f5434b == null) {
                C1393g gVar2 = new C1393g();
                f5434b = gVar2;
                m6905a(gVar2);
            }
            gVar = f5434b;
        }
        return gVar;
    }

    /* renamed from: c */
    private ColorStateList m6912c(Context context) {
        return m6918f(context, 0);
    }

    /* renamed from: a */
    private static long m6895a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: b */
    private ColorStateList m6911b(Context context) {
        return m6918f(context, C1361ar.m6734a(context, R.attr.g3));
    }

    /* renamed from: d */
    private ColorStateList m6914d(Context context) {
        return m6918f(context, C1361ar.m6734a(context, R.attr.g1));
    }

    /* renamed from: a */
    private static Mode m6896a(int i) {
        if (i == R.drawable.ba) {
            return Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: e */
    private static ColorStateList m6916e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = C1361ar.m6737b(context, R.attr.gb);
        if (b == null || !b.isStateful()) {
            iArr[0] = C1361ar.f5328a;
            iArr2[0] = C1361ar.m6738c(context, R.attr.gb);
            iArr[1] = C1361ar.f5332e;
            iArr2[1] = C1361ar.m6734a(context, R.attr.g4);
            iArr[2] = C1361ar.f5335h;
            iArr2[2] = C1361ar.m6734a(context, R.attr.gb);
        } else {
            iArr[0] = C1361ar.f5328a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = C1361ar.f5332e;
            iArr2[1] = C1361ar.m6734a(context, R.attr.g4);
            iArr[2] = C1361ar.f5335h;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: f */
    private void m6919f(Context context) {
        if (!this.f5447o) {
            this.f5447o = true;
            Drawable a = mo6487a(context, (int) R.drawable.bq);
            if (a == null || !m6909a(a)) {
                this.f5447o = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private ColorStateList m6917e(Context context, int i) {
        if (this.f5442j == null) {
            return null;
        }
        C0905l lVar = (C0905l) this.f5442j.get(context);
        if (lVar != null) {
            return (ColorStateList) lVar.mo3433a(i);
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m6897a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C1393g.class) {
            a = f5435c.mo6493a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f5435c.mo6494a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: f */
    private static ColorStateList m6918f(Context context, int i) {
        int a = C1361ar.m6734a(context, R.attr.g5);
        return new ColorStateList(new int[][]{C1361ar.f5328a, C1361ar.f5331d, C1361ar.f5329b, C1361ar.f5335h}, new int[]{C1361ar.m6738c(context, R.attr.g3), C0721a.m3064a(a, i), C0721a.m3064a(a, i), i});
    }

    /* renamed from: c */
    private Drawable m6913c(Context context, int i) {
        if (this.f5446n == null) {
            this.f5446n = new TypedValue();
        }
        TypedValue typedValue = this.f5446n;
        context.getResources().getValue(i, typedValue, true);
        long a = m6895a(typedValue);
        Drawable a2 = m6900a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (i == R.drawable.v) {
            a2 = new LayerDrawable(new Drawable[]{mo6487a(context, (int) R.drawable.u), mo6487a(context, (int) R.drawable.w)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            m6908a(context, a, a2);
        }
        return a2;
    }

    /* renamed from: d */
    private Drawable m6915d(Context context, int i) {
        int next;
        if (this.f5443k == null || this.f5443k.isEmpty()) {
            return null;
        }
        if (this.f5444l != null) {
            String str = (String) this.f5444l.mo3433a(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f5443k.get(str) == null)) {
                return null;
            }
        } else {
            this.f5444l = new C0905l<>();
        }
        if (this.f5446n == null) {
            this.f5446n = new TypedValue();
        }
        TypedValue typedValue = this.f5446n;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = m6895a(typedValue);
        Drawable a2 = m6900a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
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
                    String name = xml.getName();
                    this.f5444l.mo3440c(i, name);
                    C1397d dVar = (C1397d) this.f5443k.get(name);
                    if (dVar != null) {
                        a2 = dVar.mo6492a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (a2 != null) {
                        a2.setChangingConfigurations(typedValue.changingConfigurations);
                        m6908a(context, a, a2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception unused) {
            }
        }
        if (a2 == null) {
            this.f5444l.mo3440c(i, "appcompat_skip_skip");
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized ColorStateList mo6491b(Context context, int i) {
        ColorStateList e;
        e = m6917e(context, i);
        if (e == null) {
            if (i == R.drawable.z) {
                e = C1065a.m4638a(context, R.color.ci);
            } else if (i == R.drawable.bb) {
                e = C1065a.m4638a(context, R.color.cl);
            } else if (i == R.drawable.ba) {
                e = m6916e(context);
            } else if (i == R.drawable.o) {
                e = m6911b(context);
            } else if (i == R.drawable.j) {
                e = m6912c(context);
            } else if (i == R.drawable.n) {
                e = m6914d(context);
            } else {
                if (i != R.drawable.b9) {
                    if (i != R.drawable.b_) {
                        if (m6910a(f5437e, i)) {
                            e = C1361ar.m6737b(context, R.attr.g6);
                        } else if (m6910a(f5440h, i)) {
                            e = C1065a.m4638a(context, R.color.ch);
                        } else if (m6910a(f5441i, i)) {
                            e = C1065a.m4638a(context, R.color.cg);
                        } else if (i == R.drawable.b6) {
                            e = C1065a.m4638a(context, R.color.cj);
                        }
                    }
                }
                e = C1065a.m4638a(context, R.color.ck);
            }
            if (e != null) {
                m6902a(context, i, e);
            }
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m6900a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, android.support.v4.util.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f5445m     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            android.support.v4.util.e r0 = (android.support.p022v4.util.C0893e) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo3327a(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo3332b(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.C1393g.m6900a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m6898a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m6897a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private void m6902a(Context context, int i, ColorStateList colorStateList) {
        if (this.f5442j == null) {
            this.f5442j = new WeakHashMap<>();
        }
        C0905l lVar = (C0905l) this.f5442j.get(context);
        if (lVar == null) {
            lVar = new C0905l();
            this.f5442j.put(context, lVar);
        }
        lVar.mo3440c(i, colorStateList);
    }

    /* renamed from: a */
    private Drawable m6899a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo6491b(context, i);
        if (b != null) {
            if (C1433w.m7203c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable g = C0727a.m3116g(drawable);
            C0727a.m3105a(g, b);
            Mode a = m6896a(i);
            if (a == null) {
                return g;
            }
            C0727a.m3108a(g, a);
            return g;
        } else if (i == R.drawable.b8) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m6903a(layerDrawable.findDrawableByLayerId(16908288), C1361ar.m6734a(context, R.attr.g6), f5433a);
            m6903a(layerDrawable.findDrawableByLayerId(16908303), C1361ar.m6734a(context, R.attr.g6), f5433a);
            m6903a(layerDrawable.findDrawableByLayerId(16908301), C1361ar.m6734a(context, R.attr.g4), f5433a);
            return drawable;
        } else if (i == R.drawable.az || i == R.drawable.ay || i == R.drawable.b0) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m6903a(layerDrawable2.findDrawableByLayerId(16908288), C1361ar.m6738c(context, R.attr.g6), f5433a);
            m6903a(layerDrawable2.findDrawableByLayerId(16908303), C1361ar.m6734a(context, R.attr.g4), f5433a);
            m6903a(layerDrawable2.findDrawableByLayerId(16908301), C1361ar.m6734a(context, R.attr.g4), f5433a);
            return drawable;
        } else if (m6907a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }
}
