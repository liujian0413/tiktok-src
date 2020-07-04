package com.bytedance.common.utility;

/* renamed from: com.bytedance.common.utility.h */
public final class C6312h {

    /* renamed from: a */
    private static int f18548a = 4;

    /* renamed from: b */
    private static C6316b f18549b = C6314a.m19579a();

    /* renamed from: com.bytedance.common.utility.h$a */
    static class C6314a extends C6316b {

        /* renamed from: com.bytedance.common.utility.h$a$a */
        static class C6315a {

            /* renamed from: a */
            public static final C6314a f18550a = new C6314a();
        }

        private C6314a() {
        }

        /* renamed from: a */
        static C6314a m19579a() {
            return C6315a.f18550a;
        }
    }

    /* renamed from: com.bytedance.common.utility.h$b */
    public static abstract class C6316b {
    }

    /* renamed from: a */
    public static int m19575a() {
        return f18548a;
    }

    /* renamed from: b */
    public static boolean m19578b() {
        if (f18548a <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m19576a(int i) {
        f18548a = i;
    }

    /* renamed from: a */
    public static void m19577a(Throwable th) {
        if (th != null && m19578b()) {
            throw new RuntimeException("Error! Now in debug, we alert to you to correct it !", th);
        }
    }
}
