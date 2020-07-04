package com.bytedance.ies.web.p583b;

import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.bytedance.ies.web.b.b */
public final class C11107b {

    /* renamed from: a */
    private C11109d f30181a;

    /* renamed from: b */
    private Executor f30182b;

    /* renamed from: c */
    private C11110e f30183c;

    /* renamed from: d */
    private C11108c f30184d;

    /* renamed from: e */
    private C11123l f30185e;

    /* renamed from: f */
    private boolean f30186f;

    /* renamed from: g */
    private int f30187g = 32;

    /* renamed from: h */
    private final HashMap<String, C7561a<Boolean>> f30188h = new HashMap<>();

    /* renamed from: a */
    public final void mo27088a() {
        C11146v.m32632a(this.f30186f);
        C11123l lVar = this.f30185e;
        if (lVar != null) {
            C11115h.m32553a(lVar);
        }
        Executor executor = this.f30182b;
        if (executor == null) {
            C7573i.m23583a("workerExecutor");
        }
        C11108c cVar = this.f30184d;
        if (cVar == null) {
            C7573i.m23583a("configProvider");
        }
        C11105a aVar = new C11105a(executor, cVar);
        C11109d dVar = this.f30181a;
        if (dVar == null) {
            C7573i.m23583a("localStorage");
        }
        C11110e eVar = this.f30183c;
        if (eVar == null) {
            C7573i.m23583a("networkExecutor");
        }
        Executor executor2 = this.f30182b;
        if (executor2 == null) {
            C7573i.m23583a("workerExecutor");
        }
        C11146v.m32628a(new C11119k(new C11130o(dVar, eVar, executor2, this.f30187g), aVar, this.f30188h));
    }

    /* renamed from: a */
    public final C11107b mo27087a(boolean z) {
        this.f30186f = false;
        return this;
    }

    /* renamed from: a */
    public final C11107b mo27080a(int i) {
        this.f30187g = 32;
        return this;
    }

    /* renamed from: a */
    public final C11107b mo27081a(C11108c cVar) {
        C7573i.m23587b(cVar, "configProvider");
        this.f30184d = cVar;
        return this;
    }

    /* renamed from: a */
    public final C11107b mo27082a(C11109d dVar) {
        C7573i.m23587b(dVar, "localStorage");
        this.f30181a = dVar;
        return this;
    }

    /* renamed from: a */
    public final C11107b mo27083a(C11110e eVar) {
        C7573i.m23587b(eVar, "networkExecutor");
        this.f30183c = eVar;
        return this;
    }

    /* renamed from: a */
    public final C11107b mo27084a(C11123l lVar) {
        C7573i.m23587b(lVar, "logger");
        this.f30185e = lVar;
        return this;
    }

    /* renamed from: a */
    public final C11107b mo27086a(Executor executor) {
        C7573i.m23587b(executor, "workerExecutor");
        this.f30182b = executor;
        return this;
    }

    /* renamed from: a */
    public final C11107b mo27085a(String str, C7561a<Boolean> aVar) {
        C7573i.m23587b(str, "condition");
        C7573i.m23587b(aVar, "predicate");
        this.f30188h.put(str, aVar);
        return this;
    }
}
