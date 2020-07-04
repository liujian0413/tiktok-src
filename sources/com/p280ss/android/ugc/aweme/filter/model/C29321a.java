package com.p280ss.android.ugc.aweme.filter.model;

import com.p280ss.android.ugc.aweme.filter.C29296g;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.model.a */
public final class C29321a {

    /* renamed from: a */
    public final boolean f77313a;

    /* renamed from: b */
    public final C29296g f77314b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29321a) {
                C29321a aVar = (C29321a) obj;
                if (!(this.f77313a == aVar.f77313a) || !C7573i.m23585a((Object) this.f77314b, (Object) aVar.f77314b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f77313a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        C29296g gVar = this.f77314b;
        return i + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterBeanOp(isAutoUse=");
        sb.append(this.f77313a);
        sb.append(", filter=");
        sb.append(this.f77314b);
        sb.append(")");
        return sb.toString();
    }

    public C29321a(boolean z, C29296g gVar) {
        this.f77313a = z;
        this.f77314b = gVar;
    }
}
