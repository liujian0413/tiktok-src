package com.p280ss.android.ugc.aweme.beauty;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.beauty.a */
public final class C23530a {

    /* renamed from: a */
    public final boolean f62103a;

    /* renamed from: b */
    public final boolean f62104b;

    public C23530a() {
        this(false, false, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23530a) {
                C23530a aVar = (C23530a) obj;
                if (this.f62103a == aVar.f62103a) {
                    if (this.f62104b == aVar.f62104b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f62103a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.f62104b;
        if (!z2) {
            i = z2;
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeautyAdd2NodeFlag(add=");
        sb.append(this.f62103a);
        sb.append(", update=");
        sb.append(this.f62104b);
        sb.append(")");
        return sb.toString();
    }

    public C23530a(boolean z, boolean z2) {
        this.f62103a = z;
        this.f62104b = z2;
    }

    public /* synthetic */ C23530a(boolean z, boolean z2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        this(z, z2);
    }
}
