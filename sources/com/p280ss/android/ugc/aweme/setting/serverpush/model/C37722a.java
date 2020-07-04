package com.p280ss.android.ugc.aweme.setting.serverpush.model;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.model.a */
public final class C37722a {
    @C6593c(mo15949a = "is_show")

    /* renamed from: a */
    public final boolean f98241a;
    @C6593c(mo15949a = "h5_url")

    /* renamed from: b */
    public final String f98242b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37722a) {
                C37722a aVar = (C37722a) obj;
                if (!(this.f98241a == aVar.f98241a) || !C7573i.m23585a((Object) this.f98242b, (Object) aVar.f98242b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f98241a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f98242b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinBetaEntrance(show=");
        sb.append(this.f98241a);
        sb.append(", url=");
        sb.append(this.f98242b);
        sb.append(")");
        return sb.toString();
    }
}
