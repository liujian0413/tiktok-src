package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15017a.C15020c;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.bw */
public final class C15100bw {

    /* renamed from: a */
    public static final Status f39051a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: c */
    private static final BasePendingResult<?>[] f39052c = new BasePendingResult[0];

    /* renamed from: b */
    final Set<BasePendingResult<?>> f39053b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d */
    private final C15102by f39054d = new C15101bx(this);

    /* renamed from: e */
    private final Map<C15020c<?>, C15028f> f39055e;

    public C15100bw(Map<C15020c<?>, C15028f> map) {
        this.f39055e = map;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38359a(BasePendingResult<? extends C15044g> basePendingResult) {
        this.f39053b.add(basePendingResult);
        basePendingResult.mo38268a(this.f39054d);
    }

    /* renamed from: a */
    public final void mo38358a() {
        BasePendingResult[] basePendingResultArr;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f39053b.toArray(f39052c)) {
            basePendingResult.mo38268a((C15102by) null);
            basePendingResult.mo38264c();
            if (basePendingResult.mo38271e()) {
                this.f39053b.remove(basePendingResult);
            }
        }
    }

    /* renamed from: b */
    public final void mo38360b() {
        for (BasePendingResult c : (BasePendingResult[]) this.f39053b.toArray(f39052c)) {
            c.mo38269c(f39051a);
        }
    }
}
