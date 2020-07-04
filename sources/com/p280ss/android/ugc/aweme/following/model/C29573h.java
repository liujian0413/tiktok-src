package com.p280ss.android.ugc.aweme.following.model;

/* renamed from: com.ss.android.ugc.aweme.following.model.h */
public final class C29573h {

    /* renamed from: a */
    public final int f77944a;

    /* renamed from: b */
    public final boolean f77945b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29573h) {
                C29573h hVar = (C29573h) obj;
                if (this.f77944a == hVar.f77944a) {
                    if (this.f77945b == hVar.f77945b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f77944a) * 31;
        boolean z = this.f77945b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationStatusItem(type=");
        sb.append(this.f77944a);
        sb.append(", isMySelf=");
        sb.append(this.f77945b);
        sb.append(")");
        return sb.toString();
    }

    public C29573h(int i, boolean z) {
        this.f77944a = i;
        this.f77945b = z;
    }
}
