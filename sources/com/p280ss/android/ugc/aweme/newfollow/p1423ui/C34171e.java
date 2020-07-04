package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.e */
public final class C34171e {

    /* renamed from: a */
    public final String f89087a;

    /* renamed from: b */
    public final boolean f89088b = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34171e) {
                C34171e eVar = (C34171e) obj;
                if (C7573i.m23585a((Object) this.f89087a, (Object) eVar.f89087a)) {
                    if (this.f89088b == eVar.f89088b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f89087a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f89088b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserVisibleHintData(page=");
        sb.append(this.f89087a);
        sb.append(", visible=");
        sb.append(this.f89088b);
        sb.append(")");
        return sb.toString();
    }

    public C34171e(String str, boolean z) {
        this.f89087a = str;
    }
}
