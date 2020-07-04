package com.bytedance.ies.abmock;

import com.google.gson.C6600e;

/* renamed from: com.bytedance.ies.abmock.g */
public final class C6389g {

    /* renamed from: a */
    private static C6600e f18683a;

    /* renamed from: a */
    public static synchronized C6600e m19890a() {
        C6600e eVar;
        synchronized (C6389g.class) {
            if (f18683a == null) {
                f18683a = new C6600e();
            }
            eVar = f18683a;
        }
        return eVar;
    }
}
