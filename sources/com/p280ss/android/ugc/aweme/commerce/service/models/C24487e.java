package com.p280ss.android.ugc.aweme.commerce.service.models;

import android.app.Activity;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.e */
public final class C24487e {

    /* renamed from: a */
    public Activity f64616a;

    /* renamed from: b */
    public int f64617b;

    /* renamed from: c */
    public CommerceUser f64618c;

    /* renamed from: d */
    public String f64619d;

    /* renamed from: e */
    public boolean f64620e;

    /* renamed from: f */
    public String f64621f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24487e) {
                C24487e eVar = (C24487e) obj;
                if (C7573i.m23585a((Object) this.f64616a, (Object) eVar.f64616a)) {
                    if ((this.f64617b == eVar.f64617b) && C7573i.m23585a((Object) this.f64618c, (Object) eVar.f64618c) && C7573i.m23585a((Object) this.f64619d, (Object) eVar.f64619d)) {
                        if (!(this.f64620e == eVar.f64620e) || !C7573i.m23585a((Object) this.f64621f, (Object) eVar.f64621f)) {
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
        Activity activity = this.f64616a;
        int i = 0;
        int hashCode = (((activity != null ? activity.hashCode() : 0) * 31) + this.f64617b) * 31;
        CommerceUser commerceUser = this.f64618c;
        int hashCode2 = (hashCode + (commerceUser != null ? commerceUser.hashCode() : 0)) * 31;
        String str = this.f64619d;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f64620e;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str2 = this.f64621f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortfolioParams(activity=");
        sb.append(this.f64616a);
        sb.append(", verifyStatus=");
        sb.append(this.f64617b);
        sb.append(", user=");
        sb.append(this.f64618c);
        sb.append(", referFrom=");
        sb.append(this.f64619d);
        sb.append(", isManager=");
        sb.append(this.f64620e);
        sb.append(", triggerAwemeId=");
        sb.append(this.f64621f);
        sb.append(")");
        return sb.toString();
    }

    public C24487e(Activity activity, int i, CommerceUser commerceUser, String str, boolean z, String str2) {
        C7573i.m23587b(str, "referFrom");
        this.f64616a = activity;
        this.f64617b = i;
        this.f64618c = commerceUser;
        this.f64619d = str;
        this.f64620e = z;
        this.f64621f = str2;
    }
}
