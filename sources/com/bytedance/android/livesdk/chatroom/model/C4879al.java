package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.al */
public final class C4879al implements C4917n {

    /* renamed from: a */
    public final long f13966a;

    /* renamed from: b */
    public final long f13967b;

    /* renamed from: c */
    public final long f13968c;

    /* renamed from: d */
    public final User f13969d;

    /* renamed from: e */
    public final User f13970e;

    /* renamed from: f */
    public final long f13971f;

    /* renamed from: g */
    public final long f13972g;

    /* renamed from: h */
    public final long f13973h;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4879al) {
                C4879al alVar = (C4879al) obj;
                if (this.f13966a == alVar.f13966a) {
                    if (this.f13967b == alVar.f13967b) {
                        if ((this.f13968c == alVar.f13968c) && C7573i.m23585a((Object) this.f13969d, (Object) alVar.f13969d) && C7573i.m23585a((Object) this.f13970e, (Object) alVar.f13970e)) {
                            if (this.f13971f == alVar.f13971f) {
                                if (this.f13972g == alVar.f13972g) {
                                    if (this.f13973h == alVar.f13973h) {
                                        return true;
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
        int hashCode = ((((Long.hashCode(this.f13966a) * 31) + Long.hashCode(this.f13967b)) * 31) + Long.hashCode(this.f13968c)) * 31;
        User user = this.f13969d;
        int i = 0;
        int hashCode2 = (hashCode + (user != null ? user.hashCode() : 0)) * 31;
        User user2 = this.f13970e;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return ((((((hashCode2 + i) * 31) + Long.hashCode(this.f13971f)) * 31) + Long.hashCode(this.f13972g)) * 31) + Long.hashCode(this.f13973h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortalInvite(inviteStartTime=");
        sb.append(this.f13966a);
        sb.append(", inviteCountDown=");
        sb.append(this.f13967b);
        sb.append(", rewardCountDown=");
        sb.append(this.f13968c);
        sb.append(", sugarDaddy=");
        sb.append(this.f13969d);
        sb.append(", anchor=");
        sb.append(this.f13970e);
        sb.append(", roomId=");
        sb.append(this.f13971f);
        sb.append(", portalId=");
        sb.append(this.f13972g);
        sb.append(", inviteRoomId=");
        sb.append(this.f13973h);
        sb.append(")");
        return sb.toString();
    }

    public C4879al(long j, long j2, long j3, User user, User user2, long j4, long j5, long j6) {
        C7573i.m23587b(user, "sugarDaddy");
        C7573i.m23587b(user2, "anchor");
        this.f13966a = j;
        this.f13967b = j2;
        this.f13968c = j3;
        this.f13969d = user;
        this.f13970e = user2;
        this.f13971f = j4;
        this.f13972g = j5;
        this.f13973h = j6;
    }
}
