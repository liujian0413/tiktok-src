package com.p280ss.android.ugc.aweme.following.model;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.model.i */
public final class C29574i {

    /* renamed from: a */
    public final int f77946a;

    /* renamed from: b */
    public final String f77947b;

    public C29574i() {
        this(0, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29574i) {
                C29574i iVar = (C29574i) obj;
                if (!(this.f77946a == iVar.f77946a) || !C7573i.m23585a((Object) this.f77947b, (Object) iVar.f77947b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f77946a) * 31;
        String str = this.f77947b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationTitle(type=");
        sb.append(this.f77946a);
        sb.append(", title=");
        sb.append(this.f77947b);
        sb.append(")");
        return sb.toString();
    }

    public C29574i(int i, String str) {
        C7573i.m23587b(str, "title");
        this.f77946a = i;
        this.f77947b = str;
    }

    private /* synthetic */ C29574i(int i, String str, int i2, C7571f fVar) {
        this(0, "");
    }
}
