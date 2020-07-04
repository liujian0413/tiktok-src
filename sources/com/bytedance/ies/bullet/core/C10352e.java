package com.bytedance.ies.bullet.core;

import com.bytedance.ies.bullet.core.kit.C10378c;
import com.bytedance.ies.bullet.core.kit.C10385j;
import com.bytedance.ies.bullet.core.kit.bridge.C10374e;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.e */
public final class C10352e implements C10336c {

    /* renamed from: a */
    private final C10378c<?, ?, ?, ?> f28054a;

    /* renamed from: b */
    private final C10385j<?, ?> f28055b;

    /* renamed from: c */
    private final List<C10385j<?, ?>> f28056c;

    /* renamed from: d */
    private final C10374e f28057d;

    /* renamed from: e */
    private final List<C10374e> f28058e;

    /* renamed from: a */
    public final C10385j<?, ?> mo25101a() {
        return this.f28055b;
    }

    /* renamed from: b */
    public final List<C10385j<?, ?>> mo25102b() {
        return this.f28056c;
    }

    /* renamed from: c */
    public final C10374e mo25103c() {
        return this.f28057d;
    }

    /* renamed from: d */
    public final List<C10374e> mo25104d() {
        return this.f28058e;
    }

    public C10352e(C10378c<?, ?, ?, ?> cVar, C10385j<?, ?> jVar, List<? extends C10385j<?, ?>> list, C10374e eVar, List<? extends C10374e> list2) {
        C7573i.m23587b(cVar, "kitApi");
        C7573i.m23587b(list, "kitFactories");
        C7573i.m23587b(list2, "bridgeProviderFactories");
        this.f28054a = cVar;
        this.f28055b = jVar;
        this.f28056c = list;
        this.f28057d = eVar;
        this.f28058e = list2;
    }
}
