package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.LoftGuide */
public final class LoftGuide implements Serializable {
    @C6593c(mo15949a = "desc")
    private String desc;
    @C6593c(mo15949a = "icon")
    private UrlModel imageUrl;

    public static /* synthetic */ LoftGuide copy$default(LoftGuide loftGuide, String str, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loftGuide.desc;
        }
        if ((i & 2) != 0) {
            urlModel = loftGuide.imageUrl;
        }
        return loftGuide.copy(str, urlModel);
    }

    public final String component1() {
        return this.desc;
    }

    public final UrlModel component2() {
        return this.imageUrl;
    }

    public final LoftGuide copy(String str, UrlModel urlModel) {
        C7573i.m23587b(str, "desc");
        C7573i.m23587b(urlModel, "imageUrl");
        return new LoftGuide(str, urlModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.imageUrl, (java.lang.Object) r3.imageUrl) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commercialize.loft.model.LoftGuide
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftGuide r3 = (com.p280ss.android.ugc.aweme.commercialize.loft.model.LoftGuide) r3
            java.lang.String r0 = r2.desc
            java.lang.String r1 = r3.desc
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.imageUrl
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.imageUrl
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.model.LoftGuide.equals(java.lang.Object):boolean");
    }

    public final String getDesc() {
        return this.desc;
    }

    public final UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public final int hashCode() {
        String str = this.desc;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.imageUrl;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoftGuide(desc=");
        sb.append(this.desc);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(")");
        return sb.toString();
    }

    public final void setDesc(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.desc = str;
    }

    public final void setImageUrl(UrlModel urlModel) {
        C7573i.m23587b(urlModel, "<set-?>");
        this.imageUrl = urlModel;
    }

    public LoftGuide(String str, UrlModel urlModel) {
        C7573i.m23587b(str, "desc");
        C7573i.m23587b(urlModel, "imageUrl");
        this.desc = str;
        this.imageUrl = urlModel;
    }
}
