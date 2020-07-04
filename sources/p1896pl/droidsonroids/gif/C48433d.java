package p1896pl.droidsonroids.gif;

import android.content.Context;
import p1896pl.droidsonroids.relinker.C48453b;

/* renamed from: pl.droidsonroids.gif.d */
public final class C48433d {

    /* renamed from: a */
    private static Context f123544a;

    /* renamed from: a */
    static void m150103a() {
        try {
            C48434e.m150105a("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            C48453b.m150131a(m150104b(), "pl_droidsonroids_gif");
        }
    }

    /* renamed from: b */
    private static Context m150104b() {
        if (f123544a == null) {
            try {
                f123544a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
            }
        }
        return f123544a;
    }
}
