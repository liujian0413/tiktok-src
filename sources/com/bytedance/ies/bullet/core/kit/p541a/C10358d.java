package com.bytedance.ies.bullet.core.kit.p541a;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.kit.a.d */
public final class C10358d<T> implements C10356b<T> {

    /* renamed from: a */
    private boolean f28068a;

    /* renamed from: b */
    private T f28069b;

    public C10358d() {
        this(null, false, 3, null);
    }

    /* renamed from: a */
    public final boolean mo25121a() {
        return this.f28068a;
    }

    /* renamed from: b */
    public final T mo25122b() {
        return this.f28069b;
    }

    /* renamed from: a */
    private void m30658a(T t) {
        this.f28068a = true;
        this.f28069b = t;
    }

    private C10358d(T t, boolean z) {
        boolean z2;
        if (!z || t != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f28068a = z2;
        this.f28069b = t;
    }

    /* renamed from: a */
    public final void mo25120a(C10356b<T> bVar, boolean z) {
        C7573i.m23587b(bVar, "other");
        if (mo25121a()) {
            if (bVar.mo25121a() && z) {
                m30658a(bVar.mo25122b());
            }
        } else if (bVar.mo25121a()) {
            m30658a(bVar.mo25122b());
        }
    }

    public /* synthetic */ C10358d(Object obj, boolean z, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        this(obj, z);
    }
}
