package com.p280ss.android.ugc.aweme.follow.presenter;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.d */
public final class C29456d {

    /* renamed from: a */
    public final int f77691a;

    /* renamed from: b */
    public final int f77692b;

    /* renamed from: c */
    public final int f77693c;

    /* renamed from: d */
    public final String f77694d;

    /* renamed from: e */
    public final String f77695e;

    /* renamed from: f */
    public final Integer f77696f;

    /* renamed from: g */
    public final String f77697g;

    /* renamed from: h */
    public final String f77698h;

    /* renamed from: i */
    public final String f77699i;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29456d) {
                C29456d dVar = (C29456d) obj;
                if (this.f77691a == dVar.f77691a) {
                    if (this.f77692b == dVar.f77692b) {
                        if (!(this.f77693c == dVar.f77693c) || !C7573i.m23585a((Object) this.f77694d, (Object) dVar.f77694d) || !C7573i.m23585a((Object) this.f77695e, (Object) dVar.f77695e) || !C7573i.m23585a((Object) this.f77696f, (Object) dVar.f77696f) || !C7573i.m23585a((Object) this.f77697g, (Object) dVar.f77697g) || !C7573i.m23585a((Object) this.f77698h, (Object) dVar.f77698h) || !C7573i.m23585a((Object) this.f77699i, (Object) dVar.f77699i)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f77691a * 31) + this.f77692b) * 31) + this.f77693c) * 31;
        String str = this.f77694d;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f77695e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f77696f;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f77697g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f77698h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f77699i;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowFeedParam(listQueryType=");
        sb.append(this.f77691a);
        sb.append(", pullType=");
        sb.append(this.f77692b);
        sb.append(", followFeedStyle=");
        sb.append(this.f77693c);
        sb.append(", impressionIds=");
        sb.append(this.f77694d);
        sb.append(", lastFeedsId=");
        sb.append(this.f77695e);
        sb.append(", liveTagShow=");
        sb.append(this.f77696f);
        sb.append(", insertAwemeId=");
        sb.append(this.f77697g);
        sb.append(", pushAids=");
        sb.append(this.f77698h);
        sb.append(", pushParams=");
        sb.append(this.f77699i);
        sb.append(")");
        return sb.toString();
    }

    public C29456d(int i, int i2, int i3, String str, String str2, Integer num, String str3, String str4, String str5) {
        C7573i.m23587b(str, "impressionIds");
        this.f77691a = i;
        this.f77692b = i2;
        this.f77693c = i3;
        this.f77694d = str;
        this.f77695e = str2;
        this.f77696f = num;
        this.f77697g = str3;
        this.f77698h = str4;
        this.f77699i = str5;
    }
}
