package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import com.facebook.common.p686c.C13286a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p717d.C13606i;
import com.facebook.imagepipeline.p717d.C13613j;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.p725l.C13783b;
import com.facebook.imageutils.C6492b;
import java.io.IOException;

/* renamed from: com.facebook.drawee.backends.pipeline.c */
public class C13380c {

    /* renamed from: a */
    private static final Class<?> f35391a = C13380c.class;

    /* renamed from: b */
    private static C13384f f35392b = null;

    /* renamed from: c */
    private static volatile boolean f35393c = false;

    /* renamed from: d */
    private static boolean f35394d = true;

    private C13380c() {
    }

    /* renamed from: d */
    public static boolean m39173d() {
        return f35393c;
    }

    /* renamed from: a */
    public static C13382e m39166a() {
        return f35392b.mo29879b();
    }

    /* renamed from: b */
    public static C13622l m39171b() {
        return C13622l.m40095a();
    }

    /* renamed from: c */
    public static C13606i m39172c() {
        return m39171b().mo33208d();
    }

    /* renamed from: a */
    public static void m39170a(boolean z) {
        f35394d = false;
    }

    /* renamed from: a */
    public static void m39168a(Context context, C13613j jVar) {
        m39169a(context, jVar, null);
    }

    /* renamed from: a */
    private static void m39167a(Context context, C13368b bVar) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("Fresco.initializeDrawee");
        }
        C13384f fVar = new C13384f(context, bVar);
        f35392b = fVar;
        SimpleDraweeView.initialize(fVar);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    /* renamed from: a */
    private static void m39169a(Context context, C13613j jVar, C13368b bVar) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("Fresco#initialize");
        }
        if (f35393c) {
            C13286a.m38857c(f35391a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            if (!f35394d) {
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
                return;
            }
        } else {
            f35393c = true;
        }
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("Fresco.initialize->SoLoader.init");
            }
            C6492b.m20175a(context);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        } catch (IOException e) {
            C13286a.m38841a(f35391a, (Throwable) e, "Could not initialize SoLoader", new Object[0]);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (jVar == null) {
            C13622l.m40097a(applicationContext);
        } else {
            C13622l.m40098a(jVar);
        }
        m39167a(applicationContext, (C13368b) null);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }
}
