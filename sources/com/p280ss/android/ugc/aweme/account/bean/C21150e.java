package com.p280ss.android.ugc.aweme.account.bean;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.bean.e */
public final class C21150e {

    /* renamed from: a */
    public final String f56817a;

    /* renamed from: b */
    public final int f56818b;

    /* renamed from: c */
    public final String f56819c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21150e) {
                C21150e eVar = (C21150e) obj;
                if (C7573i.m23585a((Object) this.f56817a, (Object) eVar.f56817a)) {
                    if (!(this.f56818b == eVar.f56818b) || !C7573i.m23585a((Object) this.f56819c, (Object) eVar.f56819c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f56817a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f56818b) * 31;
        String str2 = this.f56819c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlatformInfo(name=");
        sb.append(this.f56817a);
        sb.append(", iconResID=");
        sb.append(this.f56818b);
        sb.append(", type=");
        sb.append(this.f56819c);
        sb.append(")");
        return sb.toString();
    }

    public C21150e(String str, int i, String str2) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(str2, "type");
        this.f56817a = str;
        this.f56818b = i;
        this.f56819c = str2;
    }
}
