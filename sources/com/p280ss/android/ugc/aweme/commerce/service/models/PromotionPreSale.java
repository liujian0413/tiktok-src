package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.PromotionPreSale */
public final class PromotionPreSale implements Serializable {
    @C6593c(mo15949a = "button_prefix")
    private String buttonPrefix;
    @C6593c(mo15949a = "delivery_info")
    private String deliveryInfo;
    @C6593c(mo15949a = "delivery_info_prefix")
    private String deliveryInfoPrefix;
    @C6593c(mo15949a = "delivery_time")
    private long deliveryTime;
    @C6593c(mo15949a = "end_time")
    private long endTime;
    @C6593c(mo15949a = "end_time_text")
    private String endTimeText;
    @C6593c(mo15949a = "server_time")
    private long serverTime;

    public PromotionPreSale() {
        this(0, 0, 0, null, null, null, null, 127, null);
    }

    public static /* synthetic */ PromotionPreSale copy$default(PromotionPreSale promotionPreSale, long j, long j2, long j3, String str, String str2, String str3, String str4, int i, Object obj) {
        PromotionPreSale promotionPreSale2 = promotionPreSale;
        return promotionPreSale.copy((i & 1) != 0 ? promotionPreSale2.deliveryTime : j, (i & 2) != 0 ? promotionPreSale2.serverTime : j2, (i & 4) != 0 ? promotionPreSale2.endTime : j3, (i & 8) != 0 ? promotionPreSale2.endTimeText : str, (i & 16) != 0 ? promotionPreSale2.deliveryInfoPrefix : str2, (i & 32) != 0 ? promotionPreSale2.deliveryInfo : str3, (i & 64) != 0 ? promotionPreSale2.buttonPrefix : str4);
    }

    public final long component1() {
        return this.deliveryTime;
    }

    public final long component2() {
        return this.serverTime;
    }

    public final long component3() {
        return this.endTime;
    }

    public final String component4() {
        return this.endTimeText;
    }

    public final String component5() {
        return this.deliveryInfoPrefix;
    }

    public final String component6() {
        return this.deliveryInfo;
    }

    public final String component7() {
        return this.buttonPrefix;
    }

    public final PromotionPreSale copy(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        PromotionPreSale promotionPreSale = new PromotionPreSale(j, j2, j3, str, str2, str3, str4);
        return promotionPreSale;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PromotionPreSale) {
                PromotionPreSale promotionPreSale = (PromotionPreSale) obj;
                if (this.deliveryTime == promotionPreSale.deliveryTime) {
                    if (this.serverTime == promotionPreSale.serverTime) {
                        if (!(this.endTime == promotionPreSale.endTime) || !C7573i.m23585a((Object) this.endTimeText, (Object) promotionPreSale.endTimeText) || !C7573i.m23585a((Object) this.deliveryInfoPrefix, (Object) promotionPreSale.deliveryInfoPrefix) || !C7573i.m23585a((Object) this.deliveryInfo, (Object) promotionPreSale.deliveryInfo) || !C7573i.m23585a((Object) this.buttonPrefix, (Object) promotionPreSale.buttonPrefix)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getButtonPrefix() {
        return this.buttonPrefix;
    }

    public final String getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public final String getDeliveryInfoPrefix() {
        return this.deliveryInfoPrefix;
    }

    public final long getDeliveryTime() {
        return this.deliveryTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getEndTimeText() {
        return this.endTimeText;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public final int hashCode() {
        long j = this.deliveryTime;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.serverTime;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.endTime;
        int i3 = (i2 + ((int) ((j3 >>> 32) ^ j3))) * 31;
        String str = this.endTimeText;
        int i4 = 0;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.deliveryInfoPrefix;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.deliveryInfo;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.buttonPrefix;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return hashCode3 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionPreSale(deliveryTime=");
        sb.append(this.deliveryTime);
        sb.append(", serverTime=");
        sb.append(this.serverTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", endTimeText=");
        sb.append(this.endTimeText);
        sb.append(", deliveryInfoPrefix=");
        sb.append(this.deliveryInfoPrefix);
        sb.append(", deliveryInfo=");
        sb.append(this.deliveryInfo);
        sb.append(", buttonPrefix=");
        sb.append(this.buttonPrefix);
        sb.append(")");
        return sb.toString();
    }

    public final void setButtonPrefix(String str) {
        this.buttonPrefix = str;
    }

    public final void setDeliveryInfo(String str) {
        this.deliveryInfo = str;
    }

    public final void setDeliveryInfoPrefix(String str) {
        this.deliveryInfoPrefix = str;
    }

    public final void setDeliveryTime(long j) {
        this.deliveryTime = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setEndTimeText(String str) {
        this.endTimeText = str;
    }

    public final void setServerTime(long j) {
        this.serverTime = j;
    }

    public PromotionPreSale(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        this.deliveryTime = j;
        this.serverTime = j2;
        this.endTime = j3;
        this.endTimeText = str;
        this.deliveryInfoPrefix = str2;
        this.deliveryInfo = str3;
        this.buttonPrefix = str4;
    }

    public /* synthetic */ PromotionPreSale(long j, long j2, long j3, String str, String str2, String str3, String str4, int i, C7571f fVar) {
        long j4;
        long j5;
        String str5;
        String str6;
        String str7;
        String str8;
        long j6 = 0;
        if ((i & 1) != 0) {
            j4 = 0;
        } else {
            j4 = j;
        }
        if ((i & 2) != 0) {
            j5 = 0;
        } else {
            j5 = j2;
        }
        if ((i & 4) == 0) {
            j6 = j3;
        }
        if ((i & 8) != 0) {
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i & 16) != 0) {
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 32) != 0) {
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 64) != 0) {
            str8 = "";
        } else {
            str8 = str4;
        }
        this(j4, j5, j6, str5, str6, str7, str8);
    }
}
