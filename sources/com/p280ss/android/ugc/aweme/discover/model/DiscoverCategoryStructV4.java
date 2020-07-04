package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4 */
public final class DiscoverCategoryStructV4 {
    @C6593c(mo15949a = "cover_url")
    public final UrlModel coverUrl;
    public LogPbBean logPb;
    @C6593c(mo15949a = "tab_name")
    public final String tabName;
    @C6593c(mo15949a = "tab_text")
    public final String tabText;

    public static /* synthetic */ DiscoverCategoryStructV4 copy$default(DiscoverCategoryStructV4 discoverCategoryStructV4, String str, String str2, UrlModel urlModel, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discoverCategoryStructV4.tabName;
        }
        if ((i & 2) != 0) {
            str2 = discoverCategoryStructV4.tabText;
        }
        if ((i & 4) != 0) {
            urlModel = discoverCategoryStructV4.coverUrl;
        }
        if ((i & 8) != 0) {
            logPbBean = discoverCategoryStructV4.logPb;
        }
        return discoverCategoryStructV4.copy(str, str2, urlModel, logPbBean);
    }

    public final DiscoverCategoryStructV4 copy(String str, String str2, UrlModel urlModel, LogPbBean logPbBean) {
        C7573i.m23587b(str, "tabName");
        return new DiscoverCategoryStructV4(str, str2, urlModel, logPbBean);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.logPb, (java.lang.Object) r3.logPb) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4 r3 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4) r3
            java.lang.String r0 = r2.tabName
            java.lang.String r1 = r3.tabName
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.tabText
            java.lang.String r1 = r3.tabText
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.coverUrl
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.coverUrl
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r2.logPb
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r3.logPb
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.tabName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tabText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.coverUrl;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverCategoryStructV4(tabName=");
        sb.append(this.tabName);
        sb.append(", tabText=");
        sb.append(this.tabText);
        sb.append(", coverUrl=");
        sb.append(this.coverUrl);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverCategoryStructV4(String str, String str2) {
        C7573i.m23587b(str, "tabName");
        this(str, str2, null, null);
    }

    public DiscoverCategoryStructV4(String str, String str2, UrlModel urlModel, LogPbBean logPbBean) {
        C7573i.m23587b(str, "tabName");
        this.tabName = str;
        this.tabText = str2;
        this.coverUrl = urlModel;
        this.logPb = logPbBean;
    }

    public /* synthetic */ DiscoverCategoryStructV4(String str, String str2, UrlModel urlModel, LogPbBean logPbBean, int i, C7571f fVar) {
        if ((i & 8) != 0) {
            logPbBean = null;
        }
        this(str, str2, urlModel, logPbBean);
    }
}
