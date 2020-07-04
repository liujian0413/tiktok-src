package com.bytedance.android.livesdk.config;

import com.bytedance.android.livesdk.sharedpref.C8947c;

/* renamed from: com.bytedance.android.livesdk.config.a */
public final class C5863a {

    /* renamed from: a */
    public static C8947c<Boolean> f17244a = new C8947c<>("has_show_mobile_network_when_enter_live", Boolean.valueOf(false));

    /* renamed from: b */
    private static C5863a f17245b;

    /* renamed from: b */
    public static void m18340b() {
        C8947c<Boolean> cVar = f17244a;
        cVar.mo22118a(cVar.f25505c);
    }

    /* renamed from: a */
    public static synchronized C5863a m18339a() {
        C5863a aVar;
        synchronized (C5863a.class) {
            if (f17245b == null) {
                f17245b = new C5863a();
            }
            aVar = f17245b;
        }
        return aVar;
    }
}
