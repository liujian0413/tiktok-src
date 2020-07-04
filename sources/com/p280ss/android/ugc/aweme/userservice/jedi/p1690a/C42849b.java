package com.p280ss.android.ugc.aweme.userservice.jedi.p1690a;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b */
public final class C42849b {

    /* renamed from: a */
    public final String f111330a;

    /* renamed from: b */
    public final String f111331b;

    /* renamed from: c */
    public final int f111332c;

    /* renamed from: d */
    public final int f111333d;

    /* renamed from: e */
    public final int f111334e;

    /* renamed from: f */
    public final String f111335f;

    /* renamed from: g */
    public final int f111336g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42849b) {
                C42849b bVar = (C42849b) obj;
                if (C7573i.m23585a((Object) this.f111330a, (Object) bVar.f111330a) && C7573i.m23585a((Object) this.f111331b, (Object) bVar.f111331b)) {
                    if (this.f111332c == bVar.f111332c) {
                        if (this.f111333d == bVar.f111333d) {
                            if ((this.f111334e == bVar.f111334e) && C7573i.m23585a((Object) this.f111335f, (Object) bVar.f111335f)) {
                                if (this.f111336g == bVar.f111336g) {
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
        String str = this.f111330a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f111331b;
        int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f111332c) * 31) + this.f111333d) * 31) + this.f111334e) * 31;
        String str3 = this.f111335f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f111336g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRequestParam(userId=");
        sb.append(this.f111330a);
        sb.append(", secUserId=");
        sb.append(this.f111331b);
        sb.append(", type=");
        sb.append(this.f111332c);
        sb.append(", channelId=");
        sb.append(this.f111333d);
        sb.append(", from=");
        sb.append(this.f111334e);
        sb.append(", itemId=");
        sb.append(this.f111335f);
        sb.append(", fromPreviousPage=");
        sb.append(this.f111336g);
        sb.append(")");
        return sb.toString();
    }

    public C42849b(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        C7573i.m23587b(str, "userId");
        C7573i.m23587b(str2, "secUserId");
        this.f111330a = str;
        this.f111331b = str2;
        this.f111332c = i;
        this.f111333d = i2;
        this.f111334e = i3;
        this.f111335f = str3;
        this.f111336g = i4;
    }
}
