package com.p280ss.android.sdk.webview;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.sdk.webview.d */
public final class C20136d {

    /* renamed from: a */
    private final Map<Class<?>, C20139g<?>> f54514a = new LinkedHashMap();

    /* renamed from: a */
    public final <T> T mo53896a(Class<T> cls) {
        C7573i.m23587b(cls, "clazz");
        C20139g gVar = (C20139g) this.f54514a.get(cls);
        if (gVar != null) {
            T a = gVar.mo53898a();
            if (a != null) {
                if (!cls.isAssignableFrom(a.getClass())) {
                    a = null;
                }
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final <T> void mo53897a(Class<T> cls, C20139g<T> gVar) {
        C7573i.m23587b(cls, "clazz");
        C7573i.m23587b(gVar, "provider");
        this.f54514a.get(cls);
        this.f54514a.put(cls, gVar);
    }
}
