package com.p280ss.android.ugc.aweme.friends.recommendlist.repository;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.e */
public final class C30070e {

    /* renamed from: a */
    public final Integer f79043a;

    /* renamed from: b */
    public final Integer f79044b;

    /* renamed from: c */
    public final String f79045c;

    /* renamed from: d */
    public final int f79046d;

    /* renamed from: e */
    public final Integer f79047e;

    /* renamed from: f */
    public final Integer f79048f;

    /* renamed from: g */
    public final String f79049g;

    /* renamed from: h */
    public final String f79050h;

    /* renamed from: i */
    public final Integer f79051i;

    /* renamed from: j */
    public final String f79052j;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C30070e) {
                C30070e eVar = (C30070e) obj;
                if (C7573i.m23585a((Object) this.f79043a, (Object) eVar.f79043a) && C7573i.m23585a((Object) this.f79044b, (Object) eVar.f79044b) && C7573i.m23585a((Object) this.f79045c, (Object) eVar.f79045c)) {
                    if (!(this.f79046d == eVar.f79046d) || !C7573i.m23585a((Object) this.f79047e, (Object) eVar.f79047e) || !C7573i.m23585a((Object) this.f79048f, (Object) eVar.f79048f) || !C7573i.m23585a((Object) this.f79049g, (Object) eVar.f79049g) || !C7573i.m23585a((Object) this.f79050h, (Object) eVar.f79050h) || !C7573i.m23585a((Object) this.f79051i, (Object) eVar.f79051i) || !C7573i.m23585a((Object) this.f79052j, (Object) eVar.f79052j)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f79043a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f79044b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f79045c;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.f79046d)) * 31;
        Integer num3 = this.f79047e;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f79048f;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str2 = this.f79049g;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f79050h;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num5 = this.f79051i;
        int hashCode8 = (hashCode7 + (num5 != null ? num5.hashCode() : 0)) * 31;
        String str4 = this.f79052j;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendListRequestParams(count=");
        sb.append(this.f79043a);
        sb.append(", cursor=");
        sb.append(this.f79044b);
        sb.append(", targetUserId=");
        sb.append(this.f79045c);
        sb.append(", recommendType=");
        sb.append(this.f79046d);
        sb.append(", yellowPointCount=");
        sb.append(this.f79047e);
        sb.append(", addressBookAccess=");
        sb.append(this.f79048f);
        sb.append(", recImprUsers=");
        sb.append(this.f79049g);
        sb.append(", pushUserId=");
        sb.append(this.f79050h);
        sb.append(", gpsAccess=");
        sb.append(this.f79051i);
        sb.append(", secTargetUserId=");
        sb.append(this.f79052j);
        sb.append(")");
        return sb.toString();
    }

    public C30070e(Integer num, Integer num2, String str, int i, Integer num3, Integer num4, String str2, String str3, Integer num5, String str4) {
        this.f79043a = num;
        this.f79044b = num2;
        this.f79045c = str;
        this.f79046d = i;
        this.f79047e = num3;
        this.f79048f = num4;
        this.f79049g = str2;
        this.f79050h = str3;
        this.f79051i = num5;
        this.f79052j = str4;
    }
}
