package com.bytedance.ies.geckoclient.debug;

import com.bytedance.ies.geckoclient.C10873f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.geckoclient.debug.c */
public final class C10860c {

    /* renamed from: a */
    private static final List<C10873f> f29391a = new ArrayList();

    /* renamed from: a */
    public static void m31867a(C10873f fVar) {
        if (C10858a.m31865a()) {
            synchronized (f29391a) {
                if (!f29391a.contains(fVar)) {
                    f29391a.add(fVar);
                }
            }
        }
    }
}
