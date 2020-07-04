package com.p280ss.android.ugc.aweme.favorites.p1210a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.e */
public final class C27700e extends BaseResponse {
    @C6593c(mo15949a = "mix_infos")

    /* renamed from: a */
    public final List<MixStruct> f73021a;
    @C6593c(mo15949a = "cursor")

    /* renamed from: b */
    public final long f73022b;
    @C6593c(mo15949a = "has_more")

    /* renamed from: c */
    public final int f73023c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27700e) {
                C27700e eVar = (C27700e) obj;
                if (C7573i.m23585a((Object) this.f73021a, (Object) eVar.f73021a)) {
                    if (this.f73022b == eVar.f73022b) {
                        if (this.f73023c == eVar.f73023c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<MixStruct> list = this.f73021a;
        return ((((list != null ? list.hashCode() : 0) * 31) + Long.hashCode(this.f73022b)) * 31) + Integer.hashCode(this.f73023c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixListCollectionResponse(mixInfos=");
        sb.append(this.f73021a);
        sb.append(", cursor=");
        sb.append(this.f73022b);
        sb.append(", hasMore=");
        sb.append(this.f73023c);
        sb.append(")");
        return sb.toString();
    }
}
