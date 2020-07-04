package com.p280ss.android.ugc.aweme.favorites.p1210a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.f */
public final class C27701f extends BaseResponse {
    @C6593c(mo15949a = "poi_collect_list")

    /* renamed from: a */
    public List<C27702g> f73024a;
    @C6593c(mo15949a = "nearby_poi_collect_list")

    /* renamed from: b */
    public List<C27702g> f73025b;
    @C6593c(mo15949a = "cursor")

    /* renamed from: c */
    public int f73026c;
    @C6593c(mo15949a = "has_more")

    /* renamed from: d */
    public boolean f73027d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27701f) {
                C27701f fVar = (C27701f) obj;
                if (C7573i.m23585a((Object) this.f73024a, (Object) fVar.f73024a) && C7573i.m23585a((Object) this.f73025b, (Object) fVar.f73025b)) {
                    if (this.f73026c == fVar.f73026c) {
                        if (this.f73027d == fVar.f73027d) {
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
        List<C27702g> list = this.f73024a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C27702g> list2 = this.f73025b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int hashCode2 = (((hashCode + i) * 31) + Integer.hashCode(this.f73026c)) * 31;
        boolean z = this.f73027d;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiCollectionList(items=");
        sb.append(this.f73024a);
        sb.append(", nearItems=");
        sb.append(this.f73025b);
        sb.append(", cursor=");
        sb.append(this.f73026c);
        sb.append(", hasMore=");
        sb.append(this.f73027d);
        sb.append(")");
        return sb.toString();
    }
}
