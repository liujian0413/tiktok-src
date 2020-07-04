package com.bytedance.ies.bullet.core.kit;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.kit.o */
public final class C10394o {

    /* renamed from: a */
    public final C10382g f28122a;

    /* renamed from: b */
    public final boolean f28123b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10394o) {
                C10394o oVar = (C10394o) obj;
                if (C7573i.m23585a((Object) this.f28122a, (Object) oVar.f28122a)) {
                    if (this.f28123b == oVar.f28123b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C10382g gVar = this.f28122a;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        boolean z = this.f28123b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KitProcessResult(instance=");
        sb.append(this.f28122a);
        sb.append(", isNewInstance=");
        sb.append(this.f28123b);
        sb.append(")");
        return sb.toString();
    }

    public C10394o(C10382g gVar, boolean z) {
        C7573i.m23587b(gVar, "instance");
        this.f28122a = gVar;
        this.f28123b = z;
    }
}
