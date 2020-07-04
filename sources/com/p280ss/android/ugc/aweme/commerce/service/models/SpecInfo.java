package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.SpecInfo */
public final class SpecInfo implements Serializable {
    @C6593c(mo15949a = "list")
    private List<SpecInfoItem> list;
    @C6593c(mo15949a = "name")
    private String name;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.commerce.service.models.SpecInfoItem>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.commerce.service.models.SpecInfo copy$default(com.p280ss.android.ugc.aweme.commerce.service.models.SpecInfo r0, java.lang.String r1, java.util.List<com.p280ss.android.ugc.aweme.commerce.service.models.SpecInfoItem> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.lang.String r1 = r0.name
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.SpecInfoItem> r2 = r0.list
        L_0x000c:
            com.ss.android.ugc.aweme.commerce.service.models.SpecInfo r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.service.models.SpecInfo.copy$default(com.ss.android.ugc.aweme.commerce.service.models.SpecInfo, java.lang.String, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.commerce.service.models.SpecInfo");
    }

    public final String component1() {
        return this.name;
    }

    public final List<SpecInfoItem> component2() {
        return this.list;
    }

    public final SpecInfo copy(String str, List<SpecInfoItem> list2) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(list2, "list");
        return new SpecInfo(str, list2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.list, (java.lang.Object) r3.list) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commerce.service.models.SpecInfo
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.commerce.service.models.SpecInfo r3 = (com.p280ss.android.ugc.aweme.commerce.service.models.SpecInfo) r3
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.SpecInfoItem> r0 = r2.list
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.SpecInfoItem> r3 = r3.list
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.service.models.SpecInfo.equals(java.lang.Object):boolean");
    }

    public final List<SpecInfoItem> getList() {
        return this.list;
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<SpecInfoItem> list2 = this.list;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecInfo(name=");
        sb.append(this.name);
        sb.append(", list=");
        sb.append(this.list);
        sb.append(")");
        return sb.toString();
    }

    public final void setList(List<SpecInfoItem> list2) {
        C7573i.m23587b(list2, "<set-?>");
        this.list = list2;
    }

    public final void setName(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.name = str;
    }

    public SpecInfo(String str, List<SpecInfoItem> list2) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(list2, "list");
        this.name = str;
        this.list = list2;
    }
}
