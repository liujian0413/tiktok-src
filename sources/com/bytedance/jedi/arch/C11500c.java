package com.bytedance.jedi.arch;

import java.util.Arrays;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;

/* renamed from: com.bytedance.jedi.arch.c */
public final class C11500c<T> extends C11491a<T> {

    /* renamed from: a */
    public final Throwable f31096a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Fail(error=");
        sb.append(this.f31096a);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C7575l.m23595a(this.f31096a.getClass()), this.f31096a.getMessage(), this.f31096a.getStackTrace()[0]});
    }

    public C11500c(Throwable th) {
        C7573i.m23587b(th, "error");
        super(null);
        this.f31096a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11500c)) {
            return false;
        }
        Throwable th = ((C11500c) obj).f31096a;
        if (!C7573i.m23585a((Object) C7575l.m23595a(this.f31096a.getClass()), (Object) C7575l.m23595a(th.getClass())) || !C7573i.m23585a((Object) this.f31096a.getMessage(), (Object) th.getMessage()) || !C7573i.m23585a((Object) this.f31096a.getStackTrace()[0], (Object) th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
