package com.google.gson.internal.p278a;

import com.google.gson.internal.C6695d;
import java.lang.reflect.AccessibleObject;

/* renamed from: com.google.gson.internal.a.b */
public abstract class C6621b {

    /* renamed from: a */
    private static final C6621b f18978a;

    /* renamed from: a */
    public static C6621b m20530a() {
        return f18978a;
    }

    /* renamed from: a */
    public abstract void mo16058a(AccessibleObject accessibleObject);

    static {
        C6621b bVar;
        if (C6695d.m20711a() < 9) {
            bVar = new C6620a();
        } else {
            bVar = new C6622c();
        }
        f18978a = bVar;
    }
}
