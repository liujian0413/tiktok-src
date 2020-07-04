package com.p280ss.android.ugc.trill.share.helo.p1770c;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.trill.share.helo.c.a */
public final class C45147a extends BaseResponse {
    @C6593c(mo15949a = "bind_helo_status")

    /* renamed from: a */
    public final int f116000a;
    @C6593c(mo15949a = "accredit_helo_status")

    /* renamed from: b */
    public final int f116001b;

    public C45147a() {
        this(0, 0, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45147a) {
                C45147a aVar = (C45147a) obj;
                if (this.f116000a == aVar.f116000a) {
                    if (this.f116001b == aVar.f116001b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f116000a) * 31) + Integer.hashCode(this.f116001b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserHeloConfiguration(bindHeloStatus=");
        sb.append(this.f116000a);
        sb.append(", accreditHeloStatus=");
        sb.append(this.f116001b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo107697a() {
        if (this.f116000a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo107698b() {
        if (this.f116001b == 1) {
            return true;
        }
        return false;
    }

    private C45147a(int i, int i2) {
        this.f116000a = i;
        this.f116001b = i2;
    }

    private /* synthetic */ C45147a(int i, int i2, int i3, C7571f fVar) {
        this(0, 0);
    }
}
