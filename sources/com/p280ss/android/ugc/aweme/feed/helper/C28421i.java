package com.p280ss.android.ugc.aweme.feed.helper;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.i */
public final class C28421i {

    /* renamed from: a */
    public final String f74945a;

    /* renamed from: b */
    public final int f74946b;

    /* renamed from: c */
    public final long f74947c;

    /* renamed from: d */
    public final String f74948d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28421i) {
                C28421i iVar = (C28421i) obj;
                if (C7573i.m23585a((Object) this.f74945a, (Object) iVar.f74945a)) {
                    if (this.f74946b == iVar.f74946b) {
                        if (!(this.f74947c == iVar.f74947c) || !C7573i.m23585a((Object) this.f74948d, (Object) iVar.f74948d)) {
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
        String str = this.f74945a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f74946b) * 31;
        long j = this.f74947c;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f74948d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewUserBehavior(gid=");
        sb.append(this.f74945a);
        sb.append(", action=");
        sb.append(this.f74946b);
        sb.append(", actionTime=");
        sb.append(this.f74947c);
        sb.append(", eventType=");
        sb.append(this.f74948d);
        sb.append(")");
        return sb.toString();
    }

    public C28421i(String str, int i, long j, String str2) {
        C7573i.m23587b(str, "gid");
        C7573i.m23587b(str2, "eventType");
        this.f74945a = str;
        this.f74946b = i;
        this.f74947c = j;
        this.f74948d = str2;
    }
}
