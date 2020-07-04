package com.bytedance.ies.bullet.core.kit.bridge;

import com.bytedance.ies.bullet.core.kit.bridge.IBridge.Access;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.kit.bridge.b */
public abstract class C10362b implements IBridge {

    /* renamed from: a */
    public final C10403b f28074a;

    /* renamed from: b */
    private Access f28075b = Access.PRIVATE;

    /* renamed from: a */
    public final void mo25110a() {
    }

    /* renamed from: b */
    public Access mo25126b() {
        return this.f28075b;
    }

    /* renamed from: a */
    public void mo25139a(Access access) {
        C7573i.m23587b(access, "<set-?>");
        this.f28075b = access;
    }

    public C10362b(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        this.f28074a = bVar;
    }
}
