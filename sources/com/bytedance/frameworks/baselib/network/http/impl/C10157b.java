package com.bytedance.frameworks.baselib.network.http.impl;

import java.net.URI;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.b */
public interface C10157b {

    /* renamed from: a */
    public static final C10157b f27663a = new C10157b() {
        /* renamed from: a */
        public final boolean mo24833a(URI uri, C10163e eVar) {
            return true;
        }
    };

    /* renamed from: b */
    public static final C10157b f27664b = new C10157b() {
        /* renamed from: a */
        public final boolean mo24833a(URI uri, C10163e eVar) {
            return false;
        }
    };

    /* renamed from: c */
    public static final C10157b f27665c = new C10157b() {
        /* renamed from: a */
        public final boolean mo24833a(URI uri, C10163e eVar) {
            return C10163e.m30174a(eVar.f27675d, uri.getHost());
        }
    };

    /* renamed from: a */
    boolean mo24833a(URI uri, C10163e eVar);
}
