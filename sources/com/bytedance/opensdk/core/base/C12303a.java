package com.bytedance.opensdk.core.base;

import android.content.Context;
import com.bytedance.opensdk.core.base.config.C12310a;
import com.bytedance.opensdk.core.base.config.C12310a.C12311a;
import com.bytedance.opensdk.p619b.C12278i;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.core.base.a */
public final class C12303a {

    /* renamed from: a */
    public static final C12303a f32660a = new C12303a();

    /* renamed from: b */
    private static int f32661b = 64206;

    /* renamed from: c */
    private static C12310a f32662c;

    /* renamed from: d */
    private static Context f32663d;

    private C12303a() {
    }

    /* renamed from: a */
    public static int m35734a() {
        return f32661b;
    }

    /* renamed from: b */
    public final Context mo30102b() {
        m35735d();
        Context context = f32663d;
        if (context == null) {
            C7573i.m23583a("context");
        }
        return context;
    }

    /* renamed from: c */
    public final C12310a mo30103c() {
        m35735d();
        C12310a aVar = f32662c;
        if (aVar == null) {
            C7573i.m23583a("heloConfig");
        }
        return aVar;
    }

    /* renamed from: d */
    private static void m35735d() {
        if (f32662c == null || f32663d == null) {
            throw new IllegalStateException("you must call install() to init HeloSdkManager before use helo open sdk!");
        }
    }

    /* renamed from: a */
    public final C12303a mo30100a(int i) {
        m35735d();
        f32661b = 64206;
        return this;
    }

    /* renamed from: a */
    public final C12303a mo30101a(C12310a aVar, Context context) {
        C7573i.m23587b(aVar, "heloConfig");
        C7573i.m23587b(context, "context");
        f32662c = aVar;
        Context applicationContext = context.getApplicationContext();
        C7573i.m23582a((Object) applicationContext, "context.applicationContext");
        f32663d = applicationContext;
        if (C12311a.m35749a()) {
            C12278i.m35690a(2);
        }
        return this;
    }
}
