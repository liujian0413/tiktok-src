package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CommerceChallengeBanner */
public final class CommerceChallengeBanner implements Serializable {
    @C6593c(mo15949a = "icon")
    private final UrlModel icon;
    @C6593c(mo15949a = "open_url")
    private final String openUrl;
    @C6593c(mo15949a = "web_url")
    private final String webUrl;

    public static /* synthetic */ CommerceChallengeBanner copy$default(CommerceChallengeBanner commerceChallengeBanner, UrlModel urlModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = commerceChallengeBanner.icon;
        }
        if ((i & 2) != 0) {
            str = commerceChallengeBanner.webUrl;
        }
        if ((i & 4) != 0) {
            str2 = commerceChallengeBanner.openUrl;
        }
        return commerceChallengeBanner.copy(urlModel, str, str2);
    }

    public final UrlModel component1() {
        return this.icon;
    }

    public final String component2() {
        return this.webUrl;
    }

    public final String component3() {
        return this.openUrl;
    }

    public final CommerceChallengeBanner copy(UrlModel urlModel, String str, String str2) {
        C7573i.m23587b(urlModel, "icon");
        C7573i.m23587b(str, "webUrl");
        C7573i.m23587b(str2, "openUrl");
        return new CommerceChallengeBanner(urlModel, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.openUrl, (java.lang.Object) r3.openUrl) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.CommerceChallengeBanner
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.discover.model.CommerceChallengeBanner r3 = (com.p280ss.android.ugc.aweme.discover.model.CommerceChallengeBanner) r3
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.icon
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.icon
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.webUrl
            java.lang.String r1 = r3.webUrl
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.openUrl
            java.lang.String r3 = r3.openUrl
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.CommerceChallengeBanner.equals(java.lang.Object):boolean");
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final int hashCode() {
        UrlModel urlModel = this.icon;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.webUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.openUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceChallengeBanner(icon=");
        sb.append(this.icon);
        sb.append(", webUrl=");
        sb.append(this.webUrl);
        sb.append(", openUrl=");
        sb.append(this.openUrl);
        sb.append(")");
        return sb.toString();
    }

    public CommerceChallengeBanner(UrlModel urlModel, String str, String str2) {
        C7573i.m23587b(urlModel, "icon");
        C7573i.m23587b(str, "webUrl");
        C7573i.m23587b(str2, "openUrl");
        this.icon = urlModel;
        this.webUrl = str;
        this.openUrl = str2;
    }
}
