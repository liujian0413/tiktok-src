package android.support.p029v7.p030a.p031a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.content.res.C0695a;
import android.support.p029v7.widget.C1393g;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.a.a.a */
public final class C1065a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3698a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C1066a>> f3699b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3700c = new Object();

    /* renamed from: android.support.v7.a.a.a$a */
    static class C1066a {

        /* renamed from: a */
        final ColorStateList f3701a;

        /* renamed from: b */
        final Configuration f3702b;

        C1066a(ColorStateList colorStateList, Configuration configuration) {
            this.f3701a = colorStateList;
            this.f3702b = configuration;
        }
    }

    /* renamed from: a */
    private static TypedValue m4639a() {
        TypedValue typedValue = (TypedValue) f3698a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f3698a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static Drawable m4641b(Context context, int i) {
        return C1393g.m6901a().mo6487a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m4642c(Context context, int i) {
        if (m4644e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0695a.m2957a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m4644e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m4639a();
        resources.getValue(i, a, true);
        if (a.type < 28 || a.type > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static ColorStateList m4638a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m4643d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m4642c(context, i);
        if (c == null) {
            return C0683b.m2910b(context, i);
        }
        m4640a(context, i, c);
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m4643d(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f3700c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<android.support.v7.a.a.a$a>> r1 = f3699b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            android.support.v7.a.a.a$a r2 = (android.support.p029v7.p030a.p031a.C1065a.C1066a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f3702b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f3701a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.p030a.p031a.C1065a.m4643d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    private static void m4640a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f3700c) {
            SparseArray sparseArray = (SparseArray) f3699b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f3699b.put(context, sparseArray);
            }
            sparseArray.append(i, new C1066a(colorStateList, context.getResources().getConfiguration()));
        }
    }
}
