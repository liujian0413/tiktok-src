package com.bytedance.lighten.core;

import android.text.TextUtils;
import com.bytedance.lighten.core.p610a.C12092a;
import com.bytedance.lighten.core.p611b.C12097a;
import com.bytedance.lighten.core.p611b.C12099b;
import com.bytedance.lighten.core.p611b.C12100c;
import com.bytedance.lighten.core.p611b.C12101d;
import java.io.File;

/* renamed from: com.bytedance.lighten.core.n */
public final class C12133n {

    /* renamed from: a */
    public static String f32219a;

    /* renamed from: b */
    private static final C12132m f32220b = m35307c();

    /* renamed from: c */
    private static volatile C12134o f32221c;

    /* renamed from: d */
    private static volatile boolean f32222d;

    /* renamed from: a */
    public static C12134o m35297a() {
        if (f32221c != null) {
            return f32221c;
        }
        throw new IllegalStateException("Lighten:lighten is not initialized, call Lighten.init");
    }

    /* renamed from: b */
    public static C12102c m35304b() {
        if (!f32222d) {
            return null;
        }
        return f32220b.getCache();
    }

    /* renamed from: c */
    private static C12132m m35307c() {
        C12132m a = C12099b.m35256a();
        if (a != null) {
            return a;
        }
        C12132m a2 = C12100c.m35257a();
        if (a2 != null) {
            return a2;
        }
        C12132m a3 = C12101d.m35258a();
        if (a3 != null) {
            return a3;
        }
        return C12097a.m35255a();
    }

    /* renamed from: a */
    public static C12139r m35298a(int i) {
        return f32220b.load(i);
    }

    /* renamed from: a */
    public static C12139r m35299a(C12092a aVar) {
        return f32220b.load(aVar);
    }

    /* renamed from: b */
    public static void m35305b(int i) {
        if (f32222d) {
            f32220b.trimMemory(i);
        }
    }

    /* renamed from: a */
    public static C12139r m35300a(File file) {
        if (!file.exists()) {
            return C12139r.f32299O;
        }
        return f32220b.load(file);
    }

    /* renamed from: b */
    static void m35306b(C12138q qVar) {
        if (f32222d) {
            f32220b.loadBitmap(qVar);
        }
    }

    /* renamed from: a */
    public static C12139r m35301a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C12139r.f32299O;
        }
        return f32220b.load(str);
    }

    /* renamed from: a */
    public static void m35302a(C12134o oVar) {
        if (!f32222d) {
            f32222d = true;
            f32221c = oVar;
            f32219a = oVar.f32223a.getPackageName();
            f32220b.init(oVar);
        }
    }

    /* renamed from: a */
    static void m35303a(C12138q qVar) {
        if (f32222d) {
            f32220b.display(qVar);
        }
    }
}
