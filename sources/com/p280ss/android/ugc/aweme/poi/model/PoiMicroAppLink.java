package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiMicroAppLink */
public final class PoiMicroAppLink implements Serializable {
    @C6593c(mo15949a = "content")
    private final String content;
    @C6593c(mo15949a = "content_url")
    private final String contentUrl;

    public static /* synthetic */ PoiMicroAppLink copy$default(PoiMicroAppLink poiMicroAppLink, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiMicroAppLink.content;
        }
        if ((i & 2) != 0) {
            str2 = poiMicroAppLink.contentUrl;
        }
        return poiMicroAppLink.copy(str, str2);
    }

    public final String component1() {
        return this.content;
    }

    public final String component2() {
        return this.contentUrl;
    }

    public final PoiMicroAppLink copy(String str, String str2) {
        return new PoiMicroAppLink(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.contentUrl, (java.lang.Object) r3.contentUrl) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.poi.model.PoiMicroAppLink
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.model.PoiMicroAppLink r3 = (com.p280ss.android.ugc.aweme.poi.model.PoiMicroAppLink) r3
            java.lang.String r0 = r2.content
            java.lang.String r1 = r3.content
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.contentUrl
            java.lang.String r3 = r3.contentUrl
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.model.PoiMicroAppLink.equals(java.lang.Object):boolean");
    }

    public final String getContent() {
        return this.content;
    }

    public final String getContentUrl() {
        return this.contentUrl;
    }

    public final int hashCode() {
        String str = this.content;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.contentUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiMicroAppLink(content=");
        sb.append(this.content);
        sb.append(", contentUrl=");
        sb.append(this.contentUrl);
        sb.append(")");
        return sb.toString();
    }

    public PoiMicroAppLink(String str, String str2) {
        this.content = str;
        this.contentUrl = str2;
    }
}
