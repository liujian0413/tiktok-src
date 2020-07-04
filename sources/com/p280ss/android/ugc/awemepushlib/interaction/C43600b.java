package com.p280ss.android.ugc.awemepushlib.interaction;

import com.p280ss.android.ugc.awemepushapi.C43587a;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.b */
public final class C43600b {

    /* renamed from: b */
    private static C43600b f112845b;

    /* renamed from: a */
    private C43587a f112846a;

    /* renamed from: a */
    public static C43587a m138163a() {
        return m138165b().f112846a;
    }

    /* renamed from: b */
    private static C43600b m138165b() {
        if (f112845b != null) {
            return f112845b;
        }
        throw new IllegalStateException("请先调用holdService初始化");
    }

    private C43600b(C43587a aVar) {
        this.f112846a = aVar;
    }

    /* renamed from: a */
    static synchronized void m138164a(C43587a aVar) {
        synchronized (C43600b.class) {
            if (aVar == null) {
                throw new IllegalArgumentException("请使用MainInterfaceForPush实例初始化");
            } else if (f112845b == null) {
                f112845b = new C43600b(aVar);
            } else {
                f112845b.f112846a = aVar;
            }
        }
    }
}
