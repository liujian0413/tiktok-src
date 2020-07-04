package com.facebook.imagepipeline.animated.p712a;

import com.facebook.cache.common.C13265a;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.p716c.C13570h;
import com.facebook.imagepipeline.p717d.C13604g;
import com.facebook.imagepipeline.p720g.C13645c;

/* renamed from: com.facebook.imagepipeline.animated.a.b */
public final class C13520b {

    /* renamed from: a */
    private static C13527f f35853a;

    /* renamed from: b */
    private static int f35854b;
    private static C13519a sImpl;
    private static boolean sImplLoaded;

    /* renamed from: a */
    public static C13527f m39769a() {
        return f35853a;
    }

    /* renamed from: b */
    public static int m39771b() {
        return f35854b;
    }

    /* renamed from: a */
    public static void m39770a(int i) {
        f35854b = i;
    }

    /* renamed from: a */
    public static C13519a m39768a(C13551f fVar, C13604g gVar, C13570h<C13265a, C13645c> hVar) {
        if (!sImplLoaded) {
            try {
                sImpl = (C13519a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(new Class[]{C13551f.class, C13604g.class, C13570h.class}).newInstance(new Object[]{fVar, gVar, hVar});
            } catch (Throwable unused) {
            }
            if (sImpl != null) {
                sImplLoaded = true;
            }
        }
        return sImpl;
    }
}
