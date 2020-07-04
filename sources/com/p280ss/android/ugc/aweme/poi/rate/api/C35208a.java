package com.p280ss.android.ugc.aweme.poi.rate.api;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.rate.api.a */
public final class C35208a extends BaseResponse {
    @C6593c(mo15949a = "rate_list")

    /* renamed from: a */
    public List<C35211c> f92188a;
    @C6593c(mo15949a = "avg_rate_score")

    /* renamed from: b */
    public String f92189b;
    @C6593c(mo15949a = "cursor")

    /* renamed from: c */
    public long f92190c;
    @C6593c(mo15949a = "has_more")

    /* renamed from: d */
    public int f92191d;
    @C6593c(mo15949a = "none_aweme_rate_count")

    /* renamed from: e */
    public final int f92192e;
    @C6593c(mo15949a = "item_has_more")

    /* renamed from: f */
    public final int f92193f;

    public C35208a() {
        this(null, null, 0, 0, 0, 0, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35208a) {
                C35208a aVar = (C35208a) obj;
                if (C7573i.m23585a((Object) this.f92188a, (Object) aVar.f92188a) && C7573i.m23585a((Object) this.f92189b, (Object) aVar.f92189b)) {
                    if (this.f92190c == aVar.f92190c) {
                        if (this.f92191d == aVar.f92191d) {
                            if (this.f92192e == aVar.f92192e) {
                                if (this.f92193f == aVar.f92193f) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<C35211c> list = this.f92188a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f92189b;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        long j = this.f92190c;
        return ((((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + this.f92191d) * 31) + this.f92192e) * 31) + this.f92193f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiRateAwemeResponse(poiRateList=");
        sb.append(this.f92188a);
        sb.append(", avgRateScore=");
        sb.append(this.f92189b);
        sb.append(", cursor=");
        sb.append(this.f92190c);
        sb.append(", hasMore=");
        sb.append(this.f92191d);
        sb.append(", noAwemeRateCount=");
        sb.append(this.f92192e);
        sb.append(", itemHasMore=");
        sb.append(this.f92193f);
        sb.append(")");
        return sb.toString();
    }

    private C35208a(List<C35211c> list, String str, long j, int i, int i2, int i3) {
        C7573i.m23587b(list, "poiRateList");
        C7573i.m23587b(str, "avgRateScore");
        this.f92188a = list;
        this.f92189b = str;
        this.f92190c = j;
        this.f92191d = i;
        this.f92192e = i2;
        this.f92193f = i3;
    }

    public /* synthetic */ C35208a(List list, String str, long j, int i, int i2, int i3, int i4, C7571f fVar) {
        int i5;
        int i6;
        if ((i4 & 1) != 0) {
            list = new ArrayList();
        }
        List list2 = list;
        if ((i4 & 2) != 0) {
            str = "0.0";
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i4 & 32) != 0) {
            i6 = 1;
        } else {
            i6 = i3;
        }
        this(list2, str2, 0, i5, 0, i6);
    }
}
