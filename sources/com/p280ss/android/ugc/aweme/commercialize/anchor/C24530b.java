package com.p280ss.android.ugc.aweme.commercialize.anchor;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.b */
public final class C24530b {
    @C6593c(mo15949a = "status_code")

    /* renamed from: a */
    public final int f64750a;
    @C6593c(mo15949a = "status_msg")

    /* renamed from: b */
    public final String f64751b;
    @C6593c(mo15949a = "anchor_list")

    /* renamed from: c */
    public final List<C24536e> f64752c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24530b) {
                C24530b bVar = (C24530b) obj;
                if (!(this.f64750a == bVar.f64750a) || !C7573i.m23585a((Object) this.f64751b, (Object) bVar.f64751b) || !C7573i.m23585a((Object) this.f64752c, (Object) bVar.f64752c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f64750a) * 31;
        String str = this.f64751b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<C24536e> list = this.f64752c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorListResp(statusCode=");
        sb.append(this.f64750a);
        sb.append(", statusMsg=");
        sb.append(this.f64751b);
        sb.append(", anchorList=");
        sb.append(this.f64752c);
        sb.append(")");
        return sb.toString();
    }
}
