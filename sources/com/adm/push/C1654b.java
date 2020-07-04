package com.adm.push;

import android.content.Context;
import com.amazon.device.messaging.ADM;

/* renamed from: com.adm.push.b */
class C1654b {

    /* renamed from: a */
    private static C1654b f6077a;

    /* renamed from: b */
    private final ADM f6078b;

    /* renamed from: a */
    public final boolean mo7052a() {
        return this.f6078b.isSupported();
    }

    /* renamed from: b */
    public final void mo7053b() {
        this.f6078b.startRegister();
    }

    /* renamed from: c */
    public final void mo7054c() {
        this.f6078b.startUnregister();
    }

    private C1654b(Context context) {
        this.f6078b = new ADM(context);
    }

    /* renamed from: a */
    public static C1654b m8056a(Context context) {
        if (f6077a == null) {
            synchronized (C1654b.class) {
                if (f6077a == null) {
                    f6077a = new C1654b(context);
                }
            }
        }
        return f6077a;
    }
}
