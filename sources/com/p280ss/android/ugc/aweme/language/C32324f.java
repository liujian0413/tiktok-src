package com.p280ss.android.ugc.aweme.language;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.language.f */
public final class C32324f {
    @C6593c(mo15949a = "sub_region")

    /* renamed from: a */
    public final List<C32321b> f84425a;
    @C6593c(mo15949a = "name")

    /* renamed from: b */
    public final String f84426b;
    @C6593c(mo15949a = "geoname_id")

    /* renamed from: c */
    public final int f84427c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32324f) {
                C32324f fVar = (C32324f) obj;
                if (C7573i.m23585a((Object) this.f84425a, (Object) fVar.f84425a) && C7573i.m23585a((Object) this.f84426b, (Object) fVar.f84426b)) {
                    if (this.f84427c == fVar.f84427c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<C32321b> list = this.f84425a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f84426b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.f84427c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProvinceData(cityData=");
        sb.append(this.f84425a);
        sb.append(", name=");
        sb.append(this.f84426b);
        sb.append(", id=");
        sb.append(this.f84427c);
        sb.append(")");
        return sb.toString();
    }
}
