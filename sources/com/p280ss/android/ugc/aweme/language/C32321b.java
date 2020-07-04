package com.p280ss.android.ugc.aweme.language;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.language.b */
public final class C32321b {
    @C6593c(mo15949a = "name")

    /* renamed from: a */
    public final String f84422a;
    @C6593c(mo15949a = "geoname_id")

    /* renamed from: b */
    public final int f84423b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32321b) {
                C32321b bVar = (C32321b) obj;
                if (C7573i.m23585a((Object) this.f84422a, (Object) bVar.f84422a)) {
                    if (this.f84423b == bVar.f84423b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f84422a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f84423b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CityData(name=");
        sb.append(this.f84422a);
        sb.append(", id=");
        sb.append(this.f84423b);
        sb.append(")");
        return sb.toString();
    }
}
