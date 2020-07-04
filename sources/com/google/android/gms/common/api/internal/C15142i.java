package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.i */
public final class C15142i {

    /* renamed from: a */
    private final Set<C15140h<?>> f39190a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo38433a() {
        for (C15140h a : this.f39190a) {
            a.mo38430a();
        }
        this.f39190a.clear();
    }
}
