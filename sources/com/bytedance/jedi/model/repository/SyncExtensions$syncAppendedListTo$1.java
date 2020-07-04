package com.bytedance.jedi.model.repository;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class SyncExtensions$syncAppendedListTo$1 extends Lambda implements C7562b<K, K1> {
    public static final SyncExtensions$syncAppendedListTo$1 INSTANCE = new SyncExtensions$syncAppendedListTo$1();

    public SyncExtensions$syncAppendedListTo$1() {
        super(1);
    }

    public final K1 invoke(K k) {
        C7573i.m23581a(4, "K");
        C7573i.m23581a(4, "K1");
        if (C7573i.m23585a((Object) Object.class, (Object) Object.class)) {
            C7573i.m23581a(1, "K1");
            return (Object) k;
        }
        C7573i.m23581a(4, "K1");
        if (C7573i.m23585a((Object) Object.class, (Object) C7581n.class)) {
            K1 k1 = C7581n.f20898a;
            C7573i.m23581a(1, "K1");
            return (Object) k1;
        }
        throw new RuntimeException();
    }
}
