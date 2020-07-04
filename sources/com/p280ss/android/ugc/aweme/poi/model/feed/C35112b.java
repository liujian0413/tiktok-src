package com.p280ss.android.ugc.aweme.poi.model.feed;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.feed.b */
public final class C35112b {
    @C6593c(mo15949a = "tag_name")

    /* renamed from: a */
    public final String f91843a;
    @C6593c(mo15949a = "tag_code")

    /* renamed from: b */
    public final long f91844b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35112b) {
                C35112b bVar = (C35112b) obj;
                if (C7573i.m23585a((Object) this.f91843a, (Object) bVar.f91843a)) {
                    if (this.f91844b == bVar.f91844b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f91843a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f91844b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiBannerTagStruct(tagName=");
        sb.append(this.f91843a);
        sb.append(", tagCode=");
        sb.append(this.f91844b);
        sb.append(")");
        return sb.toString();
    }
}
