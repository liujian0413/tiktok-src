package com.facebook.imagepipeline.p725l;

/* renamed from: com.facebook.imagepipeline.l.b */
public class C13783b {

    /* renamed from: a */
    public static final C13785a f36578a = new C13786b();

    /* renamed from: b */
    private static volatile C13787c f36579b = null;

    /* renamed from: com.facebook.imagepipeline.l.b$a */
    public interface C13785a {
    }

    /* renamed from: com.facebook.imagepipeline.l.b$b */
    static final class C13786b implements C13785a {
        private C13786b() {
        }
    }

    /* renamed from: com.facebook.imagepipeline.l.b$c */
    public interface C13787c {
    }

    private C13783b() {
    }

    /* renamed from: a */
    public static void m40663a() {
        m40666c();
    }

    /* renamed from: b */
    public static boolean m40665b() {
        m40666c();
        return false;
    }

    /* renamed from: c */
    private static C13787c m40666c() {
        if (f36579b == null) {
            synchronized (C13783b.class) {
                if (f36579b == null) {
                    f36579b = new C13782a();
                }
            }
        }
        return f36579b;
    }

    /* renamed from: a */
    public static void m40664a(String str) {
        m40666c();
    }
}
