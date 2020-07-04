package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.k */
final class C18291k {

    /* renamed from: a */
    public final C18279a<?> f49705a;

    /* renamed from: b */
    public final Set<C18291k> f49706b = new HashSet();

    /* renamed from: c */
    private final Set<C18291k> f49707c = new HashSet();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo47172a() {
        return this.f49707c.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo47174b() {
        return this.f49706b.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47171a(C18291k kVar) {
        this.f49706b.add(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo47173b(C18291k kVar) {
        this.f49707c.add(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo47175c(C18291k kVar) {
        this.f49707c.remove(kVar);
    }

    C18291k(C18279a<?> aVar) {
        this.f49705a = aVar;
    }
}
