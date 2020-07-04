package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.an */
public final class C4881an implements C4917n {

    /* renamed from: a */
    public final long f13978a;

    /* renamed from: b */
    public final long f13979b;

    /* renamed from: c */
    public final User f13980c;

    /* renamed from: d */
    public final User f13981d;

    /* renamed from: e */
    public final long f13982e;

    /* renamed from: f */
    public final long f13983f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4881an) {
                C4881an anVar = (C4881an) obj;
                if (this.f13978a == anVar.f13978a) {
                    if ((this.f13979b == anVar.f13979b) && C7573i.m23585a((Object) this.f13980c, (Object) anVar.f13980c) && C7573i.m23585a((Object) this.f13981d, (Object) anVar.f13981d)) {
                        if (this.f13982e == anVar.f13982e) {
                            if (this.f13983f == anVar.f13983f) {
                                return true;
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
        int hashCode = ((Long.hashCode(this.f13978a) * 31) + Long.hashCode(this.f13979b)) * 31;
        User user = this.f13980c;
        int i = 0;
        int hashCode2 = (hashCode + (user != null ? user.hashCode() : 0)) * 31;
        User user2 = this.f13981d;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return ((((hashCode2 + i) * 31) + Long.hashCode(this.f13982e)) * 31) + Long.hashCode(this.f13983f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortalReward(rewardStartTime=");
        sb.append(this.f13978a);
        sb.append(", rewardCountDown=");
        sb.append(this.f13979b);
        sb.append(", sugarDaddy=");
        sb.append(this.f13980c);
        sb.append(", anchor=");
        sb.append(this.f13981d);
        sb.append(", roomId=");
        sb.append(this.f13982e);
        sb.append(", portalId=");
        sb.append(this.f13983f);
        sb.append(")");
        return sb.toString();
    }

    public C4881an(long j, long j2, User user, User user2, long j3, long j4) {
        C7573i.m23587b(user, "sugarDaddy");
        C7573i.m23587b(user2, "anchor");
        this.f13978a = j;
        this.f13979b = j2;
        this.f13980c = user;
        this.f13981d = user2;
        this.f13982e = j3;
        this.f13983f = j4;
    }
}
