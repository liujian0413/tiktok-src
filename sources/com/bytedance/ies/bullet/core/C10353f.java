package com.bytedance.ies.bullet.core;

import com.bytedance.ies.bullet.core.kit.C10378c;
import com.bytedance.ies.bullet.core.kit.C10379d;
import com.bytedance.ies.bullet.core.kit.C10380e;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.kit.C10385j;
import com.bytedance.ies.bullet.core.kit.C10386k;
import com.bytedance.ies.bullet.core.kit.bridge.C10374e;
import com.bytedance.ies.bullet.core.p538a.C10330c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.f */
public final class C10353f implements C10351d {

    /* renamed from: a */
    private final Map<Class<C10378c<?, ?, ?, ?>>, C10385j<?, ?>> f28059a = new LinkedHashMap();

    /* renamed from: b */
    private final C10374e f28060b;

    /* renamed from: c */
    private final C10330c f28061c;

    /* renamed from: a */
    public final C10374e mo25115a() {
        return this.f28060b;
    }

    /* renamed from: b */
    public final C10330c mo25117b() {
        return this.f28061c;
    }

    /* renamed from: a */
    public final <S extends C10378c<? extends T, ? extends U, ? extends V, ? extends X>, T extends C10386k, U extends C10379d, V extends C10382g, X extends C10380e> C10385j<T, U> mo25116a(Class<? extends S> cls) {
        C7573i.m23587b(cls, "apiClass");
        C10385j<T, U> jVar = (C10385j) this.f28059a.get(cls);
        if (jVar == null) {
            return null;
        }
        if (jVar != null) {
            return jVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.IKitPackageProviderFactory<out T, out U>");
    }

    /* renamed from: a */
    public final <S extends C10378c<? extends T, ? extends U, ? extends V, ? extends X>, T extends C10386k, U extends C10379d, V extends C10382g, X extends C10380e> void mo25118a(Class<? extends S> cls, C10385j<? extends T, ? extends U> jVar) {
        C7573i.m23587b(cls, "apiClass");
        C7573i.m23587b(jVar, "kitFactory");
        this.f28059a.put(cls, jVar);
    }

    public C10353f(C10374e eVar, C10330c cVar) {
        C7573i.m23587b(eVar, "bridgeProviderFactory");
        C7573i.m23587b(cVar, "containerProviderFactory");
        this.f28060b = eVar;
        this.f28061c = cVar;
    }
}
