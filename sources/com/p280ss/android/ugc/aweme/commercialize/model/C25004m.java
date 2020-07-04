package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.m */
public final class C25004m {
    @C6593c(mo15949a = "multiselect")

    /* renamed from: a */
    public final int f65932a;
    @C6593c(mo15949a = "depth")

    /* renamed from: b */
    public final int f65933b;
    @C6593c(mo15949a = "options")

    /* renamed from: c */
    public final List<C25003l> f65934c;
    @C6593c(mo15949a = "selected")

    /* renamed from: d */
    public final List<Integer> f65935d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25004m) {
                C25004m mVar = (C25004m) obj;
                if (this.f65932a == mVar.f65932a) {
                    if (!(this.f65933b == mVar.f65933b) || !C7573i.m23585a((Object) this.f65934c, (Object) mVar.f65934c) || !C7573i.m23585a((Object) this.f65935d, (Object) mVar.f65935d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.f65932a) * 31) + Integer.hashCode(this.f65933b)) * 31;
        List<C25003l> list = this.f65934c;
        int i = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Integer> list2 = this.f65935d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionListParams(multiSelect=");
        sb.append(this.f65932a);
        sb.append(", depth=");
        sb.append(this.f65933b);
        sb.append(", options=");
        sb.append(this.f65934c);
        sb.append(", selected=");
        sb.append(this.f65935d);
        sb.append(")");
        return sb.toString();
    }
}
