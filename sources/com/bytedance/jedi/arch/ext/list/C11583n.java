package com.bytedance.jedi.arch.ext.list;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.arch.ext.list.n */
public class C11583n {

    /* renamed from: a */
    public final C11556b f31254a;

    /* renamed from: b */
    public final int f31255b;

    public C11583n() {
        this(false, 0, 3, null);
    }

    public int hashCode() {
        return (this.f31254a.hashCode() * 31) + this.f31255b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11583n)) {
            return false;
        }
        C11583n nVar = (C11583n) obj;
        if (!(!C7573i.m23585a((Object) this.f31254a, (Object) nVar.f31254a)) && this.f31255b == nVar.f31255b) {
            return true;
        }
        return false;
    }

    public C11583n(boolean z, int i) {
        this.f31255b = i;
        this.f31254a = new C11556b(z);
    }

    public /* synthetic */ C11583n(boolean z, int i, int i2, C7571f fVar) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        this(z, 0);
    }
}
