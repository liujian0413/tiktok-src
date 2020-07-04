package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.C16505en;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.t */
abstract class C17045t {

    /* renamed from: a */
    private final Set<String> f47724a;

    /* renamed from: a */
    public abstract C16505en mo44276a(Map<String, C16505en> map);

    /* renamed from: a */
    public abstract boolean mo44277a();

    /* renamed from: b */
    public final Set<String> mo44279b() {
        return this.f47724a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo44278a(Set<String> set) {
        return set.containsAll(this.f47724a);
    }
}
