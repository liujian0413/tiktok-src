package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j */
public class C5747j {

    /* renamed from: a */
    private static volatile C5746i f16855a;

    /* renamed from: b */
    private static volatile C5746i f16856b;

    /* renamed from: c */
    private static volatile C5736b f16857c;

    private C5747j() {
    }

    /* renamed from: a */
    public static C5738d m18103a() {
        if (f16855a == null) {
            synchronized (C5747j.class) {
                if (f16855a == null) {
                    f16855a = new C5746i();
                }
            }
        }
        return f16855a;
    }

    /* renamed from: b */
    public static C5738d m18104b() {
        if (f16856b == null) {
            synchronized (C5747j.class) {
                if (f16856b == null) {
                    f16856b = new C5746i();
                }
            }
        }
        return f16856b;
    }

    /* renamed from: c */
    public static C5738d m18105c() {
        if (f16857c == null) {
            synchronized (C5747j.class) {
                if (f16857c == null) {
                    f16857c = new C5736b(m18103a(), m18104b());
                }
            }
        }
        return f16857c;
    }

    /* renamed from: d */
    static synchronized void m18106d() {
        synchronized (C5747j.class) {
            if (f16855a != null) {
                f16855a.mo14177a(true);
            }
            if (f16856b != null) {
                f16856b.mo14177a(true);
            }
            f16855a = new C5746i();
            f16856b = new C5746i();
            f16857c = new C5736b(f16855a, f16856b);
        }
    }

    /* renamed from: e */
    static synchronized void m18107e() {
        synchronized (C5747j.class) {
            if (f16856b != null) {
                f16856b.mo14177a(true);
            }
            if (f16855a != null) {
                f16855a.mo14177a(true);
            }
            f16857c = null;
            f16856b = null;
            f16855a = null;
        }
    }
}
