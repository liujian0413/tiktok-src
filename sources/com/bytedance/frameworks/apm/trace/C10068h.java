package com.bytedance.frameworks.apm.trace;

import java.util.LinkedList;

/* renamed from: com.bytedance.frameworks.apm.trace.h */
public final class C10068h {

    /* renamed from: a */
    C10065f f27399a;

    /* renamed from: b */
    C10068h f27400b;

    /* renamed from: c */
    LinkedList<C10068h> f27401c = new LinkedList<>();

    /* renamed from: b */
    public final boolean mo24718b() {
        return this.f27401c.isEmpty();
    }

    /* renamed from: a */
    public final int mo24716a() {
        if (this.f27399a == null) {
            return 0;
        }
        return this.f27399a.f27389c;
    }

    /* renamed from: a */
    public final void mo24717a(C10068h hVar) {
        this.f27401c.push(hVar);
    }

    C10068h(C10065f fVar, C10068h hVar) {
        this.f27399a = fVar;
        this.f27400b = hVar;
    }
}
