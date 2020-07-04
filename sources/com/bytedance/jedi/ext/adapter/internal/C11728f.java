package com.bytedance.jedi.ext.adapter.internal;

import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.f */
public final class C11728f {

    /* renamed from: a */
    public final C11723c f31510a;

    /* renamed from: b */
    public final C11730g f31511b;

    /* renamed from: c */
    public final C11724d f31512c;

    /* renamed from: d */
    private final C7561a<JediViewHolderProxy> f31513d = C11729a.f31514a;

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.f$a */
    static final class C11729a extends Lambda implements C7561a<JediViewHolderProxy> {

        /* renamed from: a */
        public static final C11729a f31514a = new C11729a();

        C11729a() {
            super(0);
        }

        /* renamed from: a */
        private static JediViewHolderProxy m34387a() {
            return new JediViewHolderProxy();
        }

        public final /* synthetic */ Object invoke() {
            return m34387a();
        }
    }

    /* renamed from: a */
    public final JediViewHolderProxy mo29301a(int i) {
        JediViewHolderProxy a = this.f31511b.mo29302a(i);
        if (a != null) {
            return a;
        }
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) this.f31513d.invoke();
        this.f31511b.mo29305a(i, jediViewHolderProxy);
        return jediViewHolderProxy;
    }

    public C11728f(C11724d dVar) {
        C7573i.m23587b(dVar, "proxyManager");
        this.f31512c = dVar;
        C11723c cVar = new C11723c();
        this.f31512c.f31504b = cVar;
        this.f31510a = cVar;
        C11730g gVar = new C11730g(this.f31512c);
        this.f31512c.f31505c = gVar;
        this.f31511b = gVar;
    }
}
