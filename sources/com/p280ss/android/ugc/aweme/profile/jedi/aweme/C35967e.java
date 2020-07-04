package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.e */
public final class C35967e {

    /* renamed from: a */
    public final int f94138a;

    /* renamed from: b */
    public final int f94139b;

    /* renamed from: c */
    public final long f94140c;

    /* renamed from: d */
    public String f94141d;

    /* renamed from: e */
    public String f94142e;

    public C35967e() {
        this(0, 0, 0, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35967e) {
                C35967e eVar = (C35967e) obj;
                if (this.f94138a == eVar.f94138a) {
                    if (this.f94139b == eVar.f94139b) {
                        if (!(this.f94140c == eVar.f94140c) || !C7573i.m23585a((Object) this.f94141d, (Object) eVar.f94141d) || !C7573i.m23585a((Object) this.f94142e, (Object) eVar.f94142e)) {
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
        int i = ((this.f94138a * 31) + this.f94139b) * 31;
        long j = this.f94140c;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f94141d;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f94142e;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeListRequestParams(type=");
        sb.append(this.f94138a);
        sb.append(", count=");
        sb.append(this.f94139b);
        sb.append(", cursor=");
        sb.append(this.f94140c);
        sb.append(", userId=");
        sb.append(this.f94141d);
        sb.append(", secUserId=");
        sb.append(this.f94142e);
        sb.append(")");
        return sb.toString();
    }

    public C35967e(int i, int i2, long j, String str, String str2) {
        this.f94138a = i;
        this.f94139b = i2;
        this.f94140c = j;
        this.f94141d = str;
        this.f94142e = str2;
    }

    public /* synthetic */ C35967e(int i, int i2, long j, String str, String str2, int i3, C7571f fVar) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i4 = 20;
        } else {
            i4 = i2;
        }
        if ((i3 & 4) != 0) {
            j = 0;
        }
        this(i, i4, j, null, null);
    }
}
