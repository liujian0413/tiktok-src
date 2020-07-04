package com.p280ss.android.ugc.aweme.services.publish;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.publish.AnchorTransData */
public final class AnchorTransData {
    private final String anchorContent;
    private final UrlModel anchorIcon;
    private final String anchorTag;
    private final int businessType;

    /* renamed from: id */
    private final String f97715id;
    private final Integer source;
    private final String title;

    public AnchorTransData(int i, String str) {
        this(i, str, null, null, null, null, null, 124, null);
    }

    public AnchorTransData(int i, String str, String str2) {
        this(i, str, str2, null, null, null, null, 120, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, null, null, null, 112, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num) {
        this(i, str, str2, str3, num, null, null, 96, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4) {
        this(i, str, str2, str3, num, str4, null, 64, null);
    }

    public static /* synthetic */ AnchorTransData copy$default(AnchorTransData anchorTransData, int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = anchorTransData.businessType;
        }
        if ((i2 & 2) != 0) {
            str = anchorTransData.anchorContent;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = anchorTransData.title;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = anchorTransData.anchorTag;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            num = anchorTransData.source;
        }
        Integer num2 = num;
        if ((i2 & 32) != 0) {
            str4 = anchorTransData.f97715id;
        }
        String str8 = str4;
        if ((i2 & 64) != 0) {
            urlModel = anchorTransData.anchorIcon;
        }
        return anchorTransData.copy(i, str5, str6, str7, num2, str8, urlModel);
    }

    public final int component1() {
        return this.businessType;
    }

    public final String component2() {
        return this.anchorContent;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.anchorTag;
    }

    public final Integer component5() {
        return this.source;
    }

    public final String component6() {
        return this.f97715id;
    }

    public final UrlModel component7() {
        return this.anchorIcon;
    }

    public final AnchorTransData copy(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel) {
        String str5 = str;
        C7573i.m23587b(str, "anchorContent");
        AnchorTransData anchorTransData = new AnchorTransData(i, str5, str2, str3, num, str4, urlModel);
        return anchorTransData;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnchorTransData) {
                AnchorTransData anchorTransData = (AnchorTransData) obj;
                if (!(this.businessType == anchorTransData.businessType) || !C7573i.m23585a((Object) this.anchorContent, (Object) anchorTransData.anchorContent) || !C7573i.m23585a((Object) this.title, (Object) anchorTransData.title) || !C7573i.m23585a((Object) this.anchorTag, (Object) anchorTransData.anchorTag) || !C7573i.m23585a((Object) this.source, (Object) anchorTransData.source) || !C7573i.m23585a((Object) this.f97715id, (Object) anchorTransData.f97715id) || !C7573i.m23585a((Object) this.anchorIcon, (Object) anchorTransData.anchorIcon)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getAnchorContent() {
        return this.anchorContent;
    }

    public final UrlModel getAnchorIcon() {
        return this.anchorIcon;
    }

    public final String getAnchorTag() {
        return this.anchorTag;
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    public final String getId() {
        return this.f97715id;
    }

    public final Integer getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int i = this.businessType * 31;
        String str = this.anchorContent;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.anchorTag;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.source;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.f97715id;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel = this.anchorIcon;
        if (urlModel != null) {
            i2 = urlModel.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorTransData(businessType=");
        sb.append(this.businessType);
        sb.append(", anchorContent=");
        sb.append(this.anchorContent);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", anchorTag=");
        sb.append(this.anchorTag);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", id=");
        sb.append(this.f97715id);
        sb.append(", anchorIcon=");
        sb.append(this.anchorIcon);
        sb.append(")");
        return sb.toString();
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel) {
        C7573i.m23587b(str, "anchorContent");
        this.businessType = i;
        this.anchorContent = str;
        this.title = str2;
        this.anchorTag = str3;
        this.source = num;
        this.f97715id = str4;
        this.anchorIcon = urlModel;
    }

    public /* synthetic */ AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, int i2, C7571f fVar) {
        String str5;
        String str6;
        Integer num2;
        String str7;
        UrlModel urlModel2;
        if ((i2 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i2 & 8) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i2 & 16) != 0) {
            num2 = Integer.valueOf(0);
        } else {
            num2 = num;
        }
        if ((i2 & 32) != 0) {
            str7 = "";
        } else {
            str7 = str4;
        }
        if ((i2 & 64) != 0) {
            urlModel2 = null;
        } else {
            urlModel2 = urlModel;
        }
        this(i, str, str5, str6, num2, str7, urlModel2);
    }
}
