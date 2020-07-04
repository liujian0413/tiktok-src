package com.p280ss.android.ugc.aweme.discover.alading;

import com.google.gson.p276a.C6593c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.d */
public final class C26555d {
    @C6593c(mo15949a = "sentence")

    /* renamed from: a */
    public final String f70046a;
    @C6593c(mo15949a = "hot_value")

    /* renamed from: b */
    public final long f70047b;
    @C6593c(mo15949a = "rank")

    /* renamed from: c */
    public final int f70048c;
    @C6593c(mo15949a = "is_commerce")

    /* renamed from: d */
    public final boolean f70049d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchSpotInfo(sentence=");
        sb.append(this.f70046a);
        sb.append(", hotValue=");
        sb.append(this.f70047b);
        sb.append(", rank=");
        sb.append(this.f70048c);
        sb.append(", isAd=");
        sb.append(this.f70049d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.f70046a.hashCode() * 31) + String.valueOf(this.f70047b).hashCode()) * 31) + this.f70048c) * 31) + Boolean.valueOf(this.f70049d).hashCode();
    }

    public final boolean equals(Object obj) {
        Class cls;
        if (this == obj) {
            return true;
        }
        Class cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C7573i.m23585a((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj != null) {
            C26555d dVar = (C26555d) obj;
            if (!(!C7573i.m23585a((Object) this.f70046a, (Object) dVar.f70046a)) && this.f70047b == dVar.f70047b && this.f70048c == dVar.f70048c && this.f70049d == dVar.f70049d) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.alading.SearchSpotInfo");
    }
}
