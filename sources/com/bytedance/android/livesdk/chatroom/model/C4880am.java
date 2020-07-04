package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.am */
public final class C4880am implements C4917n {

    /* renamed from: a */
    public final long f13974a;

    /* renamed from: b */
    public final long f13975b;

    /* renamed from: c */
    public final boolean f13976c;

    /* renamed from: d */
    public final User f13977d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4880am) {
                C4880am amVar = (C4880am) obj;
                if (this.f13974a == amVar.f13974a) {
                    if (this.f13975b == amVar.f13975b) {
                        if (!(this.f13976c == amVar.f13976c) || !C7573i.m23585a((Object) this.f13977d, (Object) amVar.f13977d)) {
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
        int hashCode = ((Long.hashCode(this.f13974a) * 31) + Long.hashCode(this.f13975b)) * 31;
        boolean z = this.f13976c;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        User user = this.f13977d;
        return i + (user != null ? user.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortalOpen(roomId=");
        sb.append(this.f13974a);
        sb.append(", userId=");
        sb.append(this.f13975b);
        sb.append(", isAnchor=");
        sb.append(this.f13976c);
        sb.append(", sugarDaddy=");
        sb.append(this.f13977d);
        sb.append(")");
        return sb.toString();
    }

    public C4880am(long j, long j2, boolean z, User user) {
        C7573i.m23587b(user, "sugarDaddy");
        this.f13974a = j;
        this.f13975b = j2;
        this.f13976c = z;
        this.f13977d = user;
    }
}
