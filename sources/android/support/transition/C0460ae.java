package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: android.support.transition.ae */
final class C0460ae {

    /* renamed from: a */
    static final Property<View, Float> f1913a = new Property<View, Float>(Float.class, "translationAlpha") {
        public final /* synthetic */ Object get(Object obj) {
            return m2015a((View) obj);
        }

        /* renamed from: a */
        private static Float m2015a(View view) {
            return Float.valueOf(C0460ae.m2012c(view));
        }

        /* renamed from: a */
        private static void m2016a(View view, Float f) {
            C0460ae.m2006a(view, f.floatValue());
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            m2016a((View) obj, (Float) obj2);
        }
    };

    /* renamed from: b */
    static final Property<View, Rect> f1914b = new Property<View, Rect>(Rect.class, "clipBounds") {
        /* renamed from: a */
        private static Rect m2017a(View view) {
            return C0991u.m4169F(view);
        }

        public final /* synthetic */ Object get(Object obj) {
            return m2017a((View) obj);
        }

        /* renamed from: a */
        private static void m2018a(View view, Rect rect) {
            C0991u.m4184a(view, rect);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            m2018a((View) obj, (Rect) obj2);
        }
    };

    /* renamed from: c */
    private static final C0466ai f1915c;

    /* renamed from: d */
    private static Field f1916d;

    /* renamed from: e */
    private static boolean f1917e;

    /* renamed from: a */
    private static void m2005a() {
        if (!f1917e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1916d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1917e = true;
        }
    }

    static {
        if (VERSION.SDK_INT >= 22) {
            f1915c = new C0465ah();
        } else if (VERSION.SDK_INT >= 21) {
            f1915c = new C0464ag();
        } else if (VERSION.SDK_INT >= 19) {
            f1915c = new C0463af();
        } else {
            f1915c = new C0466ai();
        }
    }

    /* renamed from: c */
    static float m2012c(View view) {
        return f1915c.mo2064a(view);
    }

    /* renamed from: d */
    static void m2013d(View view) {
        f1915c.mo2066b(view);
    }

    /* renamed from: e */
    static void m2014e(View view) {
        f1915c.mo2067c(view);
    }

    /* renamed from: a */
    static C0459ad m2004a(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C0458ac(view);
        }
        return C0456ab.m1991c(view);
    }

    /* renamed from: b */
    static C0474an m2010b(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C0473am(view);
        }
        return new C0472al(view.getWindowToken());
    }

    /* renamed from: a */
    static void m2006a(View view, float f) {
        f1915c.mo2065a(view, f);
    }

    /* renamed from: b */
    static void m2011b(View view, Matrix matrix) {
        f1915c.mo2069b(view, matrix);
    }

    /* renamed from: a */
    static void m2007a(View view, int i) {
        m2005a();
        if (f1916d != null) {
            try {
                f1916d.setInt(view, i | (f1916d.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* renamed from: a */
    static void m2009a(View view, Matrix matrix) {
        f1915c.mo2068a(view, matrix);
    }

    /* renamed from: a */
    static void m2008a(View view, int i, int i2, int i3, int i4) {
        f1915c.mo2070a(view, i, i2, i3, i4);
    }
}
