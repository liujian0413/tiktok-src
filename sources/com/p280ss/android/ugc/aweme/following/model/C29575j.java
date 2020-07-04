package com.p280ss.android.ugc.aweme.following.model;

import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.model.j */
public final class C29575j {

    /* renamed from: a */
    public final int f77948a;

    /* renamed from: b */
    public final User f77949b;

    /* renamed from: c */
    public final int f77950c;

    /* renamed from: d */
    public final String f77951d;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C29575j m97120a(int i, User user, int i2, String str) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "requestId");
        return new C29575j(i, user, i2, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29575j) {
                C29575j jVar = (C29575j) obj;
                if ((this.f77948a == jVar.f77948a) && C7573i.m23585a((Object) this.f77949b, (Object) jVar.f77949b)) {
                    if (!(this.f77950c == jVar.f77950c) || !C7573i.m23585a((Object) this.f77951d, (Object) jVar.f77951d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f77948a) * 31;
        User user = this.f77949b;
        int i = 0;
        int hashCode2 = (((hashCode + (user != null ? user.hashCode() : 0)) * 31) + Integer.hashCode(this.f77950c)) * 31;
        String str = this.f77951d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationUser(type=");
        sb.append(this.f77948a);
        sb.append(", user=");
        sb.append(this.f77949b);
        sb.append(", order=");
        sb.append(this.f77950c);
        sb.append(", requestId=");
        sb.append(this.f77951d);
        sb.append(")");
        return sb.toString();
    }

    public C29575j(int i, User user, int i2, String str) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "requestId");
        this.f77948a = i;
        this.f77949b = user;
        this.f77950c = i2;
        this.f77951d = str;
    }

    public /* synthetic */ C29575j(int i, User user, int i2, String str, int i3, C7571f fVar) {
        this(i, user, 0, "");
    }
}
