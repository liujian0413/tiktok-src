package com.p280ss.android.ugc.aweme.discover.mob;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.v */
public final class C26802v {

    /* renamed from: a */
    public String f70728a;

    /* renamed from: b */
    public boolean f70729b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26802v) {
                C26802v vVar = (C26802v) obj;
                if (C7573i.m23585a((Object) this.f70728a, (Object) vVar.f70728a)) {
                    if (this.f70729b == vVar.f70729b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f70728a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f70729b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(id=");
        sb.append(this.f70728a);
        sb.append(", isAladdin=");
        sb.append(this.f70729b);
        sb.append(")");
        return sb.toString();
    }

    public C26802v(String str, boolean z) {
        C7573i.m23587b(str, "id");
        this.f70728a = str;
        this.f70729b = z;
    }

    public /* synthetic */ C26802v(String str, boolean z, int i, C7571f fVar) {
        this(str, false);
    }
}
