package com.p280ss.android.ugc.aweme;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.AlgoFreeInfo */
public final class AlgoFreeInfo extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "background_video_url")
    private final String backgroundVideoUrl;
    @C6593c(mo15949a = "body")
    private final String body;
    @C6593c(mo15949a = "icon_url")
    private final String iconUrl;
    @C6593c(mo15949a = "learn_more_link")
    private final String learnMoreLink;
    @C6593c(mo15949a = "learn_more_text")
    private final String learnMoreText;
    @C6593c(mo15949a = "title")
    private final String title;

    public static /* synthetic */ AlgoFreeInfo copy$default(AlgoFreeInfo algoFreeInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = algoFreeInfo.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = algoFreeInfo.title;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = algoFreeInfo.body;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = algoFreeInfo.learnMoreText;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = algoFreeInfo.learnMoreLink;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = algoFreeInfo.backgroundVideoUrl;
        }
        return algoFreeInfo.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.body;
    }

    public final String component4() {
        return this.learnMoreText;
    }

    public final String component5() {
        return this.learnMoreLink;
    }

    public final String component6() {
        return this.backgroundVideoUrl;
    }

    public final AlgoFreeInfo copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C7573i.m23587b(str, "iconUrl");
        C7573i.m23587b(str2, "title");
        C7573i.m23587b(str3, "body");
        C7573i.m23587b(str4, "learnMoreText");
        C7573i.m23587b(str5, "learnMoreLink");
        C7573i.m23587b(str6, "backgroundVideoUrl");
        AlgoFreeInfo algoFreeInfo = new AlgoFreeInfo(str, str2, str3, str4, str5, str6);
        return algoFreeInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.backgroundVideoUrl, (java.lang.Object) r3.backgroundVideoUrl) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.AlgoFreeInfo
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.AlgoFreeInfo r3 = (com.p280ss.android.ugc.aweme.AlgoFreeInfo) r3
            java.lang.String r0 = r2.iconUrl
            java.lang.String r1 = r3.iconUrl
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.body
            java.lang.String r1 = r3.body
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.learnMoreText
            java.lang.String r1 = r3.learnMoreText
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.learnMoreLink
            java.lang.String r1 = r3.learnMoreLink
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.backgroundVideoUrl
            java.lang.String r3 = r3.backgroundVideoUrl
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.AlgoFreeInfo.equals(java.lang.Object):boolean");
    }

    public final String getBackgroundVideoUrl() {
        return this.backgroundVideoUrl;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLearnMoreLink() {
        return this.learnMoreLink;
    }

    public final String getLearnMoreText() {
        return this.learnMoreText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.iconUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.body;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.learnMoreText;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.learnMoreLink;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.backgroundVideoUrl;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlgoFreeInfo(iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", learnMoreText=");
        sb.append(this.learnMoreText);
        sb.append(", learnMoreLink=");
        sb.append(this.learnMoreLink);
        sb.append(", backgroundVideoUrl=");
        sb.append(this.backgroundVideoUrl);
        sb.append(")");
        return sb.toString();
    }

    public AlgoFreeInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        C7573i.m23587b(str, "iconUrl");
        C7573i.m23587b(str2, "title");
        C7573i.m23587b(str3, "body");
        C7573i.m23587b(str4, "learnMoreText");
        C7573i.m23587b(str5, "learnMoreLink");
        C7573i.m23587b(str6, "backgroundVideoUrl");
        this.iconUrl = str;
        this.title = str2;
        this.body = str3;
        this.learnMoreText = str4;
        this.learnMoreLink = str5;
        this.backgroundVideoUrl = str6;
    }
}
