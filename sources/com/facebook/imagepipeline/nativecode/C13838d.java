package com.facebook.imagepipeline.nativecode;

import com.facebook.imageutils.C6492b;

/* renamed from: com.facebook.imagepipeline.nativecode.d */
public final class C13838d {

    /* renamed from: a */
    private static boolean f36688a;

    /* renamed from: a */
    public static synchronized void m40862a() {
        synchronized (C13838d.class) {
            if (!f36688a) {
                C6492b.m20177a("static-webp");
                f36688a = true;
            }
        }
    }
}
