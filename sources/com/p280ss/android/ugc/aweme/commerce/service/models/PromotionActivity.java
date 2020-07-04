package com.p280ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.PromotionActivity */
public final class PromotionActivity implements Serializable {
    @C6593c(mo15949a = "card_image")
    private String cardImage;
    @C6593c(mo15949a = "detail_text")
    private String detailText;
    @C6593c(mo15949a = "end_time")
    private long endTime;
    @C6593c(mo15949a = "icon")
    private String icon;
    @C6593c(mo15949a = "logo")
    private String logo;
    @C6593c(mo15949a = "server_time")
    private long serverTime;
    @C6593c(mo15949a = "start_time")
    private long startTime;
    @C6593c(mo15949a = "text")
    private String text;
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "url")
    private String url;

    public PromotionActivity() {
        this(null, null, null, null, null, 0, 0, 0, null, null, 1023, null);
    }

    public static /* synthetic */ PromotionActivity copy$default(PromotionActivity promotionActivity, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, String str6, String str7, int i, Object obj) {
        PromotionActivity promotionActivity2 = promotionActivity;
        int i2 = i;
        return promotionActivity.copy((i2 & 1) != 0 ? promotionActivity2.text : str, (i2 & 2) != 0 ? promotionActivity2.icon : str2, (i2 & 4) != 0 ? promotionActivity2.url : str3, (i2 & 8) != 0 ? promotionActivity2.detailText : str4, (i2 & 16) != 0 ? promotionActivity2.title : str5, (i2 & 32) != 0 ? promotionActivity2.startTime : j, (i2 & 64) != 0 ? promotionActivity2.endTime : j2, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? promotionActivity2.serverTime : j3, (i2 & 256) != 0 ? promotionActivity2.cardImage : str6, (i2 & 512) != 0 ? promotionActivity2.logo : str7);
    }

    public final String component1() {
        return this.text;
    }

    public final String component10() {
        return this.logo;
    }

    public final String component2() {
        return this.icon;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.detailText;
    }

    public final String component5() {
        return this.title;
    }

    public final long component6() {
        return this.startTime;
    }

    public final long component7() {
        return this.endTime;
    }

    public final long component8() {
        return this.serverTime;
    }

    public final String component9() {
        return this.cardImage;
    }

    public final PromotionActivity copy(String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, String str6, String str7) {
        PromotionActivity promotionActivity = new PromotionActivity(str, str2, str3, str4, str5, j, j2, j3, str6, str7);
        return promotionActivity;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PromotionActivity) {
                PromotionActivity promotionActivity = (PromotionActivity) obj;
                if (C7573i.m23585a((Object) this.text, (Object) promotionActivity.text) && C7573i.m23585a((Object) this.icon, (Object) promotionActivity.icon) && C7573i.m23585a((Object) this.url, (Object) promotionActivity.url) && C7573i.m23585a((Object) this.detailText, (Object) promotionActivity.detailText) && C7573i.m23585a((Object) this.title, (Object) promotionActivity.title)) {
                    if (this.startTime == promotionActivity.startTime) {
                        if (this.endTime == promotionActivity.endTime) {
                            if (!(this.serverTime == promotionActivity.serverTime) || !C7573i.m23585a((Object) this.cardImage, (Object) promotionActivity.cardImage) || !C7573i.m23585a((Object) this.logo, (Object) promotionActivity.logo)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getCardImage() {
        return this.cardImage;
    }

    public final String getDetailText() {
        return this.detailText;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.text;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.detailText;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.title;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        long j = this.startTime;
        int i2 = (hashCode5 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.endTime;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.serverTime;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str6 = this.cardImage;
        int hashCode6 = (i4 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.logo;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionActivity(text=");
        sb.append(this.text);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", detailText=");
        sb.append(this.detailText);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", serverTime=");
        sb.append(this.serverTime);
        sb.append(", cardImage=");
        sb.append(this.cardImage);
        sb.append(", logo=");
        sb.append(this.logo);
        sb.append(")");
        return sb.toString();
    }

    public final boolean canBeShown() {
        if (!TextUtils.isEmpty(this.text)) {
            return true;
        }
        return false;
    }

    public final void setCardImage(String str) {
        this.cardImage = str;
    }

    public final void setDetailText(String str) {
        this.detailText = str;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setLogo(String str) {
        this.logo = str;
    }

    public final void setServerTime(long j) {
        this.serverTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public PromotionActivity(String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, String str6, String str7) {
        this.text = str;
        this.icon = str2;
        this.url = str3;
        this.detailText = str4;
        this.title = str5;
        this.startTime = j;
        this.endTime = j2;
        this.serverTime = j3;
        this.cardImage = str6;
        this.logo = str7;
    }

    public /* synthetic */ PromotionActivity(String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, String str6, String str7, int i, C7571f fVar) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        long j4;
        long j5;
        String str13;
        String str14;
        int i2 = i;
        if ((i2 & 1) != 0) {
            str8 = "";
        } else {
            str8 = str;
        }
        if ((i2 & 2) != 0) {
            str9 = "";
        } else {
            str9 = str2;
        }
        if ((i2 & 4) != 0) {
            str10 = "";
        } else {
            str10 = str3;
        }
        if ((i2 & 8) != 0) {
            str11 = "";
        } else {
            str11 = str4;
        }
        if ((i2 & 16) != 0) {
            str12 = "";
        } else {
            str12 = str5;
        }
        long j6 = 0;
        if ((i2 & 32) != 0) {
            j4 = 0;
        } else {
            j4 = j;
        }
        if ((i2 & 64) != 0) {
            j5 = 0;
        } else {
            j5 = j2;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
            j6 = j3;
        }
        if ((i2 & 256) != 0) {
            str13 = "";
        } else {
            str13 = str6;
        }
        if ((i2 & 512) != 0) {
            str14 = "";
        } else {
            str14 = str7;
        }
        this(str8, str9, str10, str11, str12, j4, j5, j6, str13, str14);
    }
}
