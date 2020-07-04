package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ShowItemsStruct */
public final class ShowItemsStruct implements Serializable {
    @C6593c(mo15949a = "desc")
    private final String desc;
    @C6593c(mo15949a = "schema")
    private final String schema;
    @C6593c(mo15949a = "type")
    private final String type;

    public static /* synthetic */ ShowItemsStruct copy$default(ShowItemsStruct showItemsStruct, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showItemsStruct.desc;
        }
        if ((i & 2) != 0) {
            str2 = showItemsStruct.schema;
        }
        if ((i & 4) != 0) {
            str3 = showItemsStruct.type;
        }
        return showItemsStruct.copy(str, str2, str3);
    }

    public final String component1() {
        return this.desc;
    }

    public final String component2() {
        return this.schema;
    }

    public final String component3() {
        return this.type;
    }

    public final ShowItemsStruct copy(String str, String str2, String str3) {
        C7573i.m23587b(str, "desc");
        C7573i.m23587b(str2, "schema");
        C7573i.m23587b(str3, "type");
        return new ShowItemsStruct(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.type, (java.lang.Object) r3.type) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.ShowItemsStruct
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.discover.model.ShowItemsStruct r3 = (com.p280ss.android.ugc.aweme.discover.model.ShowItemsStruct) r3
            java.lang.String r0 = r2.desc
            java.lang.String r1 = r3.desc
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.schema
            java.lang.String r1 = r3.schema
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.type
            java.lang.String r3 = r3.type
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.ShowItemsStruct.equals(java.lang.Object):boolean");
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.desc;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowItemsStruct(desc=");
        sb.append(this.desc);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(")");
        return sb.toString();
    }

    public ShowItemsStruct(String str, String str2, String str3) {
        C7573i.m23587b(str, "desc");
        C7573i.m23587b(str2, "schema");
        C7573i.m23587b(str3, "type");
        this.desc = str;
        this.schema = str2;
        this.type = str3;
    }
}
