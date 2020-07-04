package com.p280ss.android.ugc.aweme.journey;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.journey.o */
public final class C32257o {
    @C6593c(mo15949a = "interest_list")

    /* renamed from: a */
    public final List<C32246j> f84301a;
    @C6593c(mo15949a = "recommend_group")

    /* renamed from: b */
    public final Integer f84302b;
    @C6593c(mo15949a = "special_type")

    /* renamed from: c */
    public final Integer f84303c;
    @C6593c(mo15949a = "select_duration")

    /* renamed from: d */
    public final Integer f84304d;
    @C6593c(mo15949a = "select_interest_type")

    /* renamed from: e */
    public final Integer f84305e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f84305e, (java.lang.Object) r3.f84305e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.journey.C32257o
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.journey.o r3 = (com.p280ss.android.ugc.aweme.journey.C32257o) r3
            java.util.List<com.ss.android.ugc.aweme.journey.j> r0 = r2.f84301a
            java.util.List<com.ss.android.ugc.aweme.journey.j> r1 = r3.f84301a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r0 = r2.f84302b
            java.lang.Integer r1 = r3.f84302b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r0 = r2.f84303c
            java.lang.Integer r1 = r3.f84303c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r0 = r2.f84304d
            java.lang.Integer r1 = r3.f84304d
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r0 = r2.f84305e
            java.lang.Integer r3 = r3.f84305e
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.journey.C32257o.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C32246j> list = this.f84301a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.f84302b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f84303c;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f84304d;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f84305e;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedInterestList(interest_list=");
        sb.append(this.f84301a);
        sb.append(", recommend_group=");
        sb.append(this.f84302b);
        sb.append(", special_type=");
        sb.append(this.f84303c);
        sb.append(", select_duration=");
        sb.append(this.f84304d);
        sb.append(", select_interest_type=");
        sb.append(this.f84305e);
        sb.append(")");
        return sb.toString();
    }

    private C32257o(List<C32246j> list, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f84301a = list;
        this.f84302b = num;
        this.f84303c = num2;
        this.f84304d = num3;
        this.f84305e = num4;
    }

    public /* synthetic */ C32257o(List list, Integer num, Integer num2, Integer num3, Integer num4, int i, C7571f fVar) {
        if ((i & 8) != 0) {
            num3 = Integer.valueOf(0);
        }
        Integer num5 = num3;
        if ((i & 16) != 0) {
            num4 = Integer.valueOf(0);
        }
        this(list, num, num2, num5, num4);
    }
}
