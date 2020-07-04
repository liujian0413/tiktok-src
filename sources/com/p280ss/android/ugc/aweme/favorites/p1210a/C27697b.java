package com.p280ss.android.ugc.aweme.favorites.p1210a;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.b */
public final class C27697b {
    @C6593c(mo15949a = "collection_type")

    /* renamed from: a */
    public final int f73005a;
    @C6593c(mo15949a = "title")

    /* renamed from: b */
    public final String f73006b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27697b) {
                C27697b bVar = (C27697b) obj;
                if (!(this.f73005a == bVar.f73005a) || !C7573i.m23585a((Object) this.f73006b, (Object) bVar.f73006b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f73005a) * 31;
        String str = this.f73006b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionTabStruct(collectionType=");
        sb.append(this.f73005a);
        sb.append(", title=");
        sb.append(this.f73006b);
        sb.append(")");
        return sb.toString();
    }
}
