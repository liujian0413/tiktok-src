package com.p280ss.android.ugc.aweme.following.repository;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.repository.c */
public final class C29601c {

    /* renamed from: a */
    public final String f77960a;

    /* renamed from: b */
    public final String f77961b;

    /* renamed from: c */
    public final long f77962c;

    /* renamed from: d */
    public final int f77963d;

    /* renamed from: e */
    public final int f77964e;

    /* renamed from: f */
    public final int f77965f;

    /* renamed from: g */
    public final int f77966g;

    /* renamed from: h */
    public final int f77967h;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29601c) {
                C29601c cVar = (C29601c) obj;
                if (C7573i.m23585a((Object) this.f77960a, (Object) cVar.f77960a) && C7573i.m23585a((Object) this.f77961b, (Object) cVar.f77961b)) {
                    if (this.f77962c == cVar.f77962c) {
                        if (this.f77963d == cVar.f77963d) {
                            if (this.f77964e == cVar.f77964e) {
                                if (this.f77965f == cVar.f77965f) {
                                    if (this.f77966g == cVar.f77966g) {
                                        if (this.f77967h == cVar.f77967h) {
                                            return true;
                                        }
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
        String str = this.f77960a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77961b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((((((hashCode + i) * 31) + Long.hashCode(this.f77962c)) * 31) + Integer.hashCode(this.f77963d)) * 31) + Integer.hashCode(this.f77964e)) * 31) + Integer.hashCode(this.f77965f)) * 31) + Integer.hashCode(this.f77966g)) * 31) + Integer.hashCode(this.f77967h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRelationQueryParam(userId=");
        sb.append(this.f77960a);
        sb.append(", secUserId=");
        sb.append(this.f77961b);
        sb.append(", maxTime=");
        sb.append(this.f77962c);
        sb.append(", count=");
        sb.append(this.f77963d);
        sb.append(", offset=");
        sb.append(this.f77964e);
        sb.append(", sourceType=");
        sb.append(this.f77965f);
        sb.append(", addressBookAccess=");
        sb.append(this.f77966g);
        sb.append(", gpsAccess=");
        sb.append(this.f77967h);
        sb.append(")");
        return sb.toString();
    }

    public C29601c(String str, String str2, long j, int i, int i2, int i3, int i4, int i5) {
        C7573i.m23587b(str, "userId");
        C7573i.m23587b(str2, "secUserId");
        this.f77960a = str;
        this.f77961b = str2;
        this.f77962c = j;
        this.f77963d = i;
        this.f77964e = i2;
        this.f77965f = i3;
        this.f77966g = i4;
        this.f77967h = i5;
    }
}
