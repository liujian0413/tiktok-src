package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ao */
public final class C4882ao implements C4917n {

    /* renamed from: a */
    public final long f13984a;

    /* renamed from: b */
    public final long f13985b;

    /* renamed from: c */
    public final long f13986c;

    /* renamed from: d */
    public final User f13987d;

    /* renamed from: e */
    public final User f13988e;

    /* renamed from: f */
    public final long f13989f;

    /* renamed from: g */
    public final long f13990g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4882ao) {
                C4882ao aoVar = (C4882ao) obj;
                if (this.f13984a == aoVar.f13984a) {
                    if (this.f13985b == aoVar.f13985b) {
                        if ((this.f13986c == aoVar.f13986c) && C7573i.m23585a((Object) this.f13987d, (Object) aoVar.f13987d) && C7573i.m23585a((Object) this.f13988e, (Object) aoVar.f13988e)) {
                            if (this.f13989f == aoVar.f13989f) {
                                if (this.f13990g == aoVar.f13990g) {
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
        int hashCode = ((((Long.hashCode(this.f13984a) * 31) + Long.hashCode(this.f13985b)) * 31) + Long.hashCode(this.f13986c)) * 31;
        User user = this.f13987d;
        int i = 0;
        int hashCode2 = (hashCode + (user != null ? user.hashCode() : 0)) * 31;
        User user2 = this.f13988e;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return ((((hashCode2 + i) * 31) + Long.hashCode(this.f13989f)) * 31) + Long.hashCode(this.f13990g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortalWait(waitStartTime=");
        sb.append(this.f13984a);
        sb.append(", waitCountDown=");
        sb.append(this.f13985b);
        sb.append(", rewardCountDown=");
        sb.append(this.f13986c);
        sb.append(", sugarDaddy=");
        sb.append(this.f13987d);
        sb.append(", anchor=");
        sb.append(this.f13988e);
        sb.append(", roomId=");
        sb.append(this.f13989f);
        sb.append(", portalId=");
        sb.append(this.f13990g);
        sb.append(")");
        return sb.toString();
    }

    public C4882ao(long j, long j2, long j3, User user, User user2, long j4, long j5) {
        C7573i.m23587b(user, "sugarDaddy");
        C7573i.m23587b(user2, "anchor");
        this.f13984a = j;
        this.f13985b = j2;
        this.f13986c = j3;
        this.f13987d = user;
        this.f13988e = user2;
        this.f13989f = j4;
        this.f13990g = j5;
    }
}
