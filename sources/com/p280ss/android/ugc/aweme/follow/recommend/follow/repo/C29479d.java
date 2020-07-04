package com.p280ss.android.ugc.aweme.follow.recommend.follow.repo;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.d */
public final class C29479d {

    /* renamed from: a */
    public final int f77729a;

    /* renamed from: b */
    public final int f77730b;

    /* renamed from: c */
    public final String f77731c;

    /* renamed from: d */
    public final int f77732d;

    /* renamed from: e */
    public final int f77733e;

    /* renamed from: f */
    public final int f77734f;

    /* renamed from: g */
    public final String f77735g;

    /* renamed from: h */
    public final int f77736h;

    /* renamed from: i */
    public final String f77737i;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29479d) {
                C29479d dVar = (C29479d) obj;
                if (this.f77729a == dVar.f77729a) {
                    if ((this.f77730b == dVar.f77730b) && C7573i.m23585a((Object) this.f77731c, (Object) dVar.f77731c)) {
                        if (this.f77732d == dVar.f77732d) {
                            if (this.f77733e == dVar.f77733e) {
                                if ((this.f77734f == dVar.f77734f) && C7573i.m23585a((Object) this.f77735g, (Object) dVar.f77735g)) {
                                    if (!(this.f77736h == dVar.f77736h) || !C7573i.m23585a((Object) this.f77737i, (Object) dVar.f77737i)) {
                                        return false;
                                    }
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
        int hashCode = ((Integer.hashCode(this.f77729a) * 31) + Integer.hashCode(this.f77730b)) * 31;
        String str = this.f77731c;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.f77732d)) * 31) + Integer.hashCode(this.f77733e)) * 31) + Integer.hashCode(this.f77734f)) * 31;
        String str2 = this.f77735g;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.f77736h)) * 31;
        String str3 = this.f77737i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendFollowRequestParam(count=");
        sb.append(this.f77729a);
        sb.append(", cursor=");
        sb.append(this.f77730b);
        sb.append(", targetUserId=");
        sb.append(this.f77731c);
        sb.append(", recommendType=");
        sb.append(this.f77732d);
        sb.append(", yellowPointCount=");
        sb.append(this.f77733e);
        sb.append(", addressBookAccess=");
        sb.append(this.f77734f);
        sb.append(", recImprUsers=");
        sb.append(this.f77735g);
        sb.append(", gpsAccess=");
        sb.append(this.f77736h);
        sb.append(", secTargetUserId=");
        sb.append(this.f77737i);
        sb.append(")");
        return sb.toString();
    }

    public C29479d(int i, int i2, String str, int i3, int i4, int i5, String str2, int i6, String str3) {
        this.f77729a = i;
        this.f77730b = i2;
        this.f77731c = str;
        this.f77732d = i3;
        this.f77733e = i4;
        this.f77734f = i5;
        this.f77735g = str2;
        this.f77736h = i6;
        this.f77737i = str3;
    }
}
