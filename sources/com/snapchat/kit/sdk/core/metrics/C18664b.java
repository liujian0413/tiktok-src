package com.snapchat.kit.sdk.core.metrics;

import com.google.gson.p276a.C6591a;
import com.google.gson.p276a.C6593c;
import java.util.Objects;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b */
public final class C18664b<T> {
    @C6593c(mo15949a = "retry_count")
    @C6591a

    /* renamed from: a */
    public int f50438a;
    @C6593c(mo15949a = "event")
    @C6591a

    /* renamed from: b */
    public T f50439b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo48916a() {
        this.f50438a++;
    }

    public C18664b(T t) {
        this(t, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18664b)) {
            return false;
        }
        C18664b bVar = (C18664b) obj;
        if (!Objects.equals(Integer.valueOf(this.f50438a), Integer.valueOf(bVar.f50438a)) || !Objects.equals(this.f50439b, bVar.f50439b)) {
            return false;
        }
        return true;
    }

    public C18664b(T t, int i) {
        this.f50438a = i;
        this.f50439b = t;
    }
}
