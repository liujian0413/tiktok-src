package com.bytedance.crash.p501j;

import android.os.HandlerThread;

/* renamed from: com.bytedance.crash.j.g */
public class C9954g {

    /* renamed from: a */
    private static volatile C9961k f27169a;

    /* renamed from: b */
    public static C9961k m29460b() {
        if (f27169a == null) {
            m29459a();
        }
        return f27169a;
    }

    /* renamed from: a */
    public static HandlerThread m29459a() {
        if (f27169a == null) {
            synchronized (C9954g.class) {
                if (f27169a == null) {
                    C9961k kVar = new C9961k("default_npth_thread");
                    f27169a = kVar;
                    kVar.mo24595a();
                }
            }
        }
        return f27169a.f27192a;
    }
}
