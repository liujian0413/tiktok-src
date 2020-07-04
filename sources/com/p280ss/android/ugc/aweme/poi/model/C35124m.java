package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.m */
public final class C35124m {
    @C6593c(mo15949a = "tag_name")

    /* renamed from: a */
    public final String f91880a;
    @C6593c(mo15949a = "tag_type")

    /* renamed from: b */
    public final int f91881b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35124m) {
                C35124m mVar = (C35124m) obj;
                if (C7573i.m23585a((Object) this.f91880a, (Object) mVar.f91880a)) {
                    if (this.f91881b == mVar.f91881b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f91880a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f91881b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiTagStruct(tagName=");
        sb.append(this.f91880a);
        sb.append(", tagType=");
        sb.append(this.f91881b);
        sb.append(")");
        return sb.toString();
    }
}
