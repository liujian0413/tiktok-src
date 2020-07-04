package com.bytedance.jedi.model.repository;

import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class SyncExtensions$syncAppendedListTo$2 extends Lambda implements C7562b<List<? extends V>, List<? extends V1>> {
    public static final SyncExtensions$syncAppendedListTo$2 INSTANCE = new SyncExtensions$syncAppendedListTo$2();

    public SyncExtensions$syncAppendedListTo$2() {
        super(1);
    }

    public final List<V1> invoke(List<? extends V> list) {
        C7573i.m23587b(list, "it");
        if (list != null) {
            return list;
        }
        throw new RuntimeException();
    }
}
