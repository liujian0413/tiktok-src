package com.p280ss.android.ugc.aweme.beauty;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.BeautifyInfo */
public final class BeautifyInfo {
    @C6593c(mo15949a = "id")
    private final String effectId;
    @C6593c(mo15949a = "tags")
    private final List<BeautifyTag> tags;

    public BeautifyInfo() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.beauty.BeautifyTag>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.beauty.BeautifyInfo copy$default(com.p280ss.android.ugc.aweme.beauty.BeautifyInfo r0, java.lang.String r1, java.util.List<com.p280ss.android.ugc.aweme.beauty.BeautifyTag> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.lang.String r1 = r0.effectId
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<com.ss.android.ugc.aweme.beauty.BeautifyTag> r2 = r0.tags
        L_0x000c:
            com.ss.android.ugc.aweme.beauty.BeautifyInfo r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.beauty.BeautifyInfo.copy$default(com.ss.android.ugc.aweme.beauty.BeautifyInfo, java.lang.String, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.beauty.BeautifyInfo");
    }

    public final String component1() {
        return this.effectId;
    }

    public final List<BeautifyTag> component2() {
        return this.tags;
    }

    public final BeautifyInfo copy(String str, List<BeautifyTag> list) {
        C7573i.m23587b(str, "effectId");
        C7573i.m23587b(list, C38347c.f99557l);
        return new BeautifyInfo(str, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.tags, (java.lang.Object) r3.tags) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.beauty.BeautifyInfo
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.beauty.BeautifyInfo r3 = (com.p280ss.android.ugc.aweme.beauty.BeautifyInfo) r3
            java.lang.String r0 = r2.effectId
            java.lang.String r1 = r3.effectId
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.beauty.BeautifyTag> r0 = r2.tags
            java.util.List<com.ss.android.ugc.aweme.beauty.BeautifyTag> r3 = r3.tags
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.beauty.BeautifyInfo.equals(java.lang.Object):boolean");
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final List<BeautifyTag> getTags() {
        return this.tags;
    }

    public final int hashCode() {
        String str = this.effectId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<BeautifyTag> list = this.tags;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeautifyInfo(effectId=");
        sb.append(this.effectId);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(")");
        return sb.toString();
    }

    public BeautifyInfo(String str, List<BeautifyTag> list) {
        C7573i.m23587b(str, "effectId");
        C7573i.m23587b(list, C38347c.f99557l);
        this.effectId = str;
        this.tags = list;
    }

    public /* synthetic */ BeautifyInfo(String str, List list, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "-1";
        }
        if ((i & 2) != 0) {
            list = new ArrayList();
        }
        this(str, list);
    }
}
