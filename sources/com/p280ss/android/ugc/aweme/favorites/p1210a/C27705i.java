package com.p280ss.android.ugc.aweme.favorites.p1210a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.i */
public final class C27705i {

    /* renamed from: k */
    public static final C27706a f73032k = new C27706a(null);
    @C6593c(mo15949a = "status")

    /* renamed from: a */
    public final int f73033a;
    @C6593c(mo15949a = "url")

    /* renamed from: b */
    public final String f73034b;
    @C6593c(mo15949a = "spu_id")

    /* renamed from: c */
    public final String f73035c;
    @C6593c(mo15949a = "supplier_id")

    /* renamed from: d */
    public final String f73036d;
    @C6593c(mo15949a = "name")

    /* renamed from: e */
    public final String f73037e;
    @C6593c(mo15949a = "status_description")

    /* renamed from: f */
    public final String f73038f;
    @C6593c(mo15949a = "poi_id")

    /* renamed from: g */
    public final String f73039g;
    @C6593c(mo15949a = "poi_name")

    /* renamed from: h */
    public final String f73040h;
    @C6593c(mo15949a = "poi_simple_info")

    /* renamed from: i */
    public final SimplePoiInfoStruct f73041i;
    @C6593c(mo15949a = "image_urls")

    /* renamed from: j */
    public final List<UrlModel> f73042j;

    /* renamed from: com.ss.android.ugc.aweme.favorites.a.i$a */
    public static final class C27706a {
        private C27706a() {
        }

        public /* synthetic */ C27706a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27705i) {
                C27705i iVar = (C27705i) obj;
                if (!(this.f73033a == iVar.f73033a) || !C7573i.m23585a((Object) this.f73034b, (Object) iVar.f73034b) || !C7573i.m23585a((Object) this.f73035c, (Object) iVar.f73035c) || !C7573i.m23585a((Object) this.f73036d, (Object) iVar.f73036d) || !C7573i.m23585a((Object) this.f73037e, (Object) iVar.f73037e) || !C7573i.m23585a((Object) this.f73038f, (Object) iVar.f73038f) || !C7573i.m23585a((Object) this.f73039g, (Object) iVar.f73039g) || !C7573i.m23585a((Object) this.f73040h, (Object) iVar.f73040h) || !C7573i.m23585a((Object) this.f73041i, (Object) iVar.f73041i) || !C7573i.m23585a((Object) this.f73042j, (Object) iVar.f73042j)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f73033a) * 31;
        String str = this.f73034b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f73035c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f73036d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f73037e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f73038f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f73039g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f73040h;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        SimplePoiInfoStruct simplePoiInfoStruct = this.f73041i;
        int hashCode9 = (hashCode8 + (simplePoiInfoStruct != null ? simplePoiInfoStruct.hashCode() : 0)) * 31;
        List<UrlModel> list = this.f73042j;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiSpuSimpleStruct(status=");
        sb.append(this.f73033a);
        sb.append(", url=");
        sb.append(this.f73034b);
        sb.append(", spuId=");
        sb.append(this.f73035c);
        sb.append(", supplierId=");
        sb.append(this.f73036d);
        sb.append(", name=");
        sb.append(this.f73037e);
        sb.append(", statusDesc=");
        sb.append(this.f73038f);
        sb.append(", poiId=");
        sb.append(this.f73039g);
        sb.append(", poiName=");
        sb.append(this.f73040h);
        sb.append(", poiSimpleInfo=");
        sb.append(this.f73041i);
        sb.append(", imageUrls=");
        sb.append(this.f73042j);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo71163a() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f73040h);
        sb.append(']');
        sb.append(this.f73037e);
        return sb.toString();
    }
}
