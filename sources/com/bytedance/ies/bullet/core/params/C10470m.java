package com.bytedance.ies.bullet.core.params;

import com.bytedance.ies.bullet.core.params.C10470m;
import com.bytedance.ies.bullet.core.params.C10471n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.params.m */
public abstract class C10470m<T extends C10470m<T, S, R>, S extends C10471n, R> implements C10462e<R> {

    /* renamed from: b */
    public final R f28195b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract S mo25109a();

    public C10470m(R r) {
        this.f28195b = r;
    }

    /* renamed from: a */
    public final R mo25261a(Class<R> cls) {
        C7573i.m23587b(cls, "inputType");
        return mo25109a().mo25263b(cls, this.f28195b);
    }
}
