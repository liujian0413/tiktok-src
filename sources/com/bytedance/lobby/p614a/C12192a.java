package com.bytedance.lobby.p614a;

import android.support.p022v4.util.ArrayMap;
import java.util.Map;

/* renamed from: com.bytedance.lobby.a.a */
public final class C12192a {

    /* renamed from: a */
    private static volatile C12192a f32436a;

    /* renamed from: b */
    private Map<String, C12193b> f32437b = new ArrayMap();

    private C12192a() {
    }

    /* renamed from: a */
    public static C12192a m35449a() {
        if (f32436a == null) {
            synchronized (C12192a.class) {
                if (f32436a == null) {
                    f32436a = new C12192a();
                }
            }
        }
        return f32436a;
    }

    /* renamed from: a */
    public final synchronized void mo29915a(C12193b bVar) {
        this.f32437b.put(bVar.mo29957f().f32466b, bVar);
    }
}
