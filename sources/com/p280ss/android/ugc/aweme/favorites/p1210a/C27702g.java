package com.p280ss.android.ugc.aweme.favorites.p1210a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.g */
public final class C27702g {

    /* renamed from: d */
    public static final C27703a f73028d = new C27703a(null);
    @C6593c(mo15949a = "collect_type")

    /* renamed from: a */
    public final int f73029a;
    @C6593c(mo15949a = "poi_simple_info")

    /* renamed from: b */
    public final SimplePoiInfoStruct f73030b;
    @C6593c(mo15949a = "poi_spu_info")

    /* renamed from: c */
    public final C27705i f73031c;

    /* renamed from: com.ss.android.ugc.aweme.favorites.a.g$a */
    public static final class C27703a {
        private C27703a() {
        }

        public /* synthetic */ C27703a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27702g) {
                C27702g gVar = (C27702g) obj;
                if (!(this.f73029a == gVar.f73029a) || !C7573i.m23585a((Object) this.f73030b, (Object) gVar.f73030b) || !C7573i.m23585a((Object) this.f73031c, (Object) gVar.f73031c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f73029a) * 31;
        SimplePoiInfoStruct simplePoiInfoStruct = this.f73030b;
        int i = 0;
        int hashCode2 = (hashCode + (simplePoiInfoStruct != null ? simplePoiInfoStruct.hashCode() : 0)) * 31;
        C27705i iVar = this.f73031c;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiCollectionStruct(collectType=");
        sb.append(this.f73029a);
        sb.append(", poiInfo=");
        sb.append(this.f73030b);
        sb.append(", spuInfoStruct=");
        sb.append(this.f73031c);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: d */
    public final Object mo71159d() {
        SimplePoiInfoStruct simplePoiInfoStruct = this.f73030b;
        if (simplePoiInfoStruct != null) {
            return simplePoiInfoStruct;
        }
        C27705i iVar = this.f73031c;
        if (iVar != null) {
            return iVar;
        }
        return new PoiStruct();
    }

    /* renamed from: a */
    public final String mo71156a() {
        SimplePoiInfoStruct simplePoiInfoStruct = this.f73030b;
        if (simplePoiInfoStruct != null) {
            String poiId = simplePoiInfoStruct.getPoiId();
            C7573i.m23582a((Object) poiId, "poiId");
            return poiId;
        }
        C27705i iVar = this.f73031c;
        if (iVar == null) {
            return "";
        }
        String str = iVar.f73039g;
        if (str == null) {
            str = "";
        }
        return str;
    }

    /* renamed from: b */
    public final String mo71157b() {
        SimplePoiInfoStruct simplePoiInfoStruct = this.f73030b;
        if (simplePoiInfoStruct != null) {
            String poiName = simplePoiInfoStruct.getPoiName();
            C7573i.m23582a((Object) poiName, "poiName");
            return poiName;
        }
        C27705i iVar = this.f73031c;
        if (iVar != null) {
            return iVar.mo71163a();
        }
        return "";
    }

    /* renamed from: c */
    public final UrlModel mo71158c() {
        SimplePoiInfoStruct simplePoiInfoStruct = this.f73030b;
        if (simplePoiInfoStruct != null) {
            return simplePoiInfoStruct.getCover();
        }
        C27705i iVar = this.f73031c;
        if (iVar == null) {
            return null;
        }
        List<UrlModel> list = iVar.f73042j;
        if (list != null) {
            return (UrlModel) list.get(0);
        }
        return null;
    }
}
