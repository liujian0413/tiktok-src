package com.p280ss.android.ugc.aweme.poi.rate.api;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.poi.rate.p1470a.C35202a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.rate.api.c */
public final class C35211c {
    @C6593c(mo15949a = "rate_id_str")

    /* renamed from: a */
    public final String f92198a;
    @C6593c(mo15949a = "rate_score")

    /* renamed from: b */
    public final String f92199b;
    @C6593c(mo15949a = "create_time")

    /* renamed from: c */
    public final long f92200c;
    @C6593c(mo15949a = "user_info")

    /* renamed from: d */
    public final User f92201d;
    @C6593c(mo15949a = "aweme")

    /* renamed from: e */
    public final Aweme f92202e;
    @C6593c(mo15949a = "spu_info")

    /* renamed from: f */
    public final C35202a f92203f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35211c) {
                C35211c cVar = (C35211c) obj;
                if (C7573i.m23585a((Object) this.f92198a, (Object) cVar.f92198a) && C7573i.m23585a((Object) this.f92199b, (Object) cVar.f92199b)) {
                    if (!(this.f92200c == cVar.f92200c) || !C7573i.m23585a((Object) this.f92201d, (Object) cVar.f92201d) || !C7573i.m23585a((Object) this.f92202e, (Object) cVar.f92202e) || !C7573i.m23585a((Object) this.f92203f, (Object) cVar.f92203f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f92198a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f92199b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.f92200c;
        int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        User user = this.f92201d;
        int hashCode3 = (i2 + (user != null ? user.hashCode() : 0)) * 31;
        Aweme aweme = this.f92202e;
        int hashCode4 = (hashCode3 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        C35202a aVar = this.f92203f;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiRateStruct(rateId=");
        sb.append(this.f92198a);
        sb.append(", rateScore=");
        sb.append(this.f92199b);
        sb.append(", createTime=");
        sb.append(this.f92200c);
        sb.append(", user=");
        sb.append(this.f92201d);
        sb.append(", aweme=");
        sb.append(this.f92202e);
        sb.append(", spuInfo=");
        sb.append(this.f92203f);
        sb.append(")");
        return sb.toString();
    }
}
