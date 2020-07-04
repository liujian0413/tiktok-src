package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.CommerceGoodCoupon */
public final class CommerceGoodCoupon implements Serializable {
    public static final C24481a Companion = new C24481a(null);
    @C6593c(mo15949a = "apply_type")
    private String applyType;
    @C6593c(mo15949a = "coupon_meta_id")
    private String couponMetaId;
    @C6593c(mo15949a = "coupon_name")
    private String couponName;
    @C6593c(mo15949a = "coupon_range")
    private String couponRange;
    @C6593c(mo15949a = "credit")
    private int credit;
    @C6593c(mo15949a = "discount")
    private Float discount;
    @C6593c(mo15949a = "discount_limit")
    private Integer discountLimit;
    @C6593c(mo15949a = "expire_time")
    private long expireTime;
    @C6593c(mo15949a = "period_type")
    private Integer periodType;
    @C6593c(mo15949a = "shop_name")
    private String shopName;
    @C6593c(mo15949a = "start_time")
    private long startTime;
    @C6593c(mo15949a = "threshold")
    private long threshold;
    @C6593c(mo15949a = "type")
    private int type;
    @C6593c(mo15949a = "valid_period")
    private Integer validPeriod;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.CommerceGoodCoupon$a */
    public static final class C24481a {
        private C24481a() {
        }

        public /* synthetic */ C24481a(C7571f fVar) {
            this();
        }
    }

    public CommerceGoodCoupon() {
        this(null, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 16383, null);
    }

    public static /* synthetic */ CommerceGoodCoupon copy$default(CommerceGoodCoupon commerceGoodCoupon, String str, int i, String str2, String str3, long j, int i2, long j2, long j3, Float f, Integer num, String str4, String str5, Integer num2, Integer num3, int i3, Object obj) {
        CommerceGoodCoupon commerceGoodCoupon2 = commerceGoodCoupon;
        int i4 = i3;
        return commerceGoodCoupon.copy((i4 & 1) != 0 ? commerceGoodCoupon2.couponMetaId : str, (i4 & 2) != 0 ? commerceGoodCoupon2.type : i, (i4 & 4) != 0 ? commerceGoodCoupon2.couponName : str2, (i4 & 8) != 0 ? commerceGoodCoupon2.shopName : str3, (i4 & 16) != 0 ? commerceGoodCoupon2.threshold : j, (i4 & 32) != 0 ? commerceGoodCoupon2.credit : i2, (i4 & 64) != 0 ? commerceGoodCoupon2.startTime : j2, (i4 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? commerceGoodCoupon2.expireTime : j3, (i4 & 256) != 0 ? commerceGoodCoupon2.discount : f, (i4 & 512) != 0 ? commerceGoodCoupon2.discountLimit : num, (i4 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? commerceGoodCoupon2.couponRange : str4, (i4 & 2048) != 0 ? commerceGoodCoupon2.applyType : str5, (i4 & 4096) != 0 ? commerceGoodCoupon2.periodType : num2, (i4 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? commerceGoodCoupon2.validPeriod : num3);
    }

    public final String component1() {
        return this.couponMetaId;
    }

    public final Integer component10() {
        return this.discountLimit;
    }

    public final String component11() {
        return this.couponRange;
    }

    public final String component12() {
        return this.applyType;
    }

    public final Integer component13() {
        return this.periodType;
    }

    public final Integer component14() {
        return this.validPeriod;
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this.couponName;
    }

    public final String component4() {
        return this.shopName;
    }

    public final long component5() {
        return this.threshold;
    }

    public final int component6() {
        return this.credit;
    }

    public final long component7() {
        return this.startTime;
    }

    public final long component8() {
        return this.expireTime;
    }

    public final Float component9() {
        return this.discount;
    }

    public final CommerceGoodCoupon copy(String str, int i, String str2, String str3, long j, int i2, long j2, long j3, Float f, Integer num, String str4, String str5, Integer num2, Integer num3) {
        CommerceGoodCoupon commerceGoodCoupon = new CommerceGoodCoupon(str, i, str2, str3, j, i2, j2, j3, f, num, str4, str5, num2, num3);
        return commerceGoodCoupon;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommerceGoodCoupon) {
                CommerceGoodCoupon commerceGoodCoupon = (CommerceGoodCoupon) obj;
                if (C7573i.m23585a((Object) this.couponMetaId, (Object) commerceGoodCoupon.couponMetaId)) {
                    if ((this.type == commerceGoodCoupon.type) && C7573i.m23585a((Object) this.couponName, (Object) commerceGoodCoupon.couponName) && C7573i.m23585a((Object) this.shopName, (Object) commerceGoodCoupon.shopName)) {
                        if (this.threshold == commerceGoodCoupon.threshold) {
                            if (this.credit == commerceGoodCoupon.credit) {
                                if (this.startTime == commerceGoodCoupon.startTime) {
                                    if (!(this.expireTime == commerceGoodCoupon.expireTime) || !C7573i.m23585a((Object) this.discount, (Object) commerceGoodCoupon.discount) || !C7573i.m23585a((Object) this.discountLimit, (Object) commerceGoodCoupon.discountLimit) || !C7573i.m23585a((Object) this.couponRange, (Object) commerceGoodCoupon.couponRange) || !C7573i.m23585a((Object) this.applyType, (Object) commerceGoodCoupon.applyType) || !C7573i.m23585a((Object) this.periodType, (Object) commerceGoodCoupon.periodType) || !C7573i.m23585a((Object) this.validPeriod, (Object) commerceGoodCoupon.validPeriod)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getApplyType() {
        return this.applyType;
    }

    public final String getCouponMetaId() {
        return this.couponMetaId;
    }

    public final String getCouponName() {
        return this.couponName;
    }

    public final String getCouponRange() {
        return this.couponRange;
    }

    public final int getCredit() {
        return this.credit;
    }

    public final Float getDiscount() {
        return this.discount;
    }

    public final Integer getDiscountLimit() {
        return this.discountLimit;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final Integer getPeriodType() {
        return this.periodType;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getThreshold() {
        return this.threshold;
    }

    public final int getType() {
        return this.type;
    }

    public final Integer getValidPeriod() {
        return this.validPeriod;
    }

    public final int hashCode() {
        String str = this.couponMetaId;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.type) * 31;
        String str2 = this.couponName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.shopName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j = this.threshold;
        int i2 = (((hashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + this.credit) * 31;
        long j2 = this.startTime;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.expireTime;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Float f = this.discount;
        int hashCode4 = (i4 + (f != null ? f.hashCode() : 0)) * 31;
        Integer num = this.discountLimit;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.couponRange;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.applyType;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num2 = this.periodType;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.validPeriod;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceGoodCoupon(couponMetaId=");
        sb.append(this.couponMetaId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", couponName=");
        sb.append(this.couponName);
        sb.append(", shopName=");
        sb.append(this.shopName);
        sb.append(", threshold=");
        sb.append(this.threshold);
        sb.append(", credit=");
        sb.append(this.credit);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", expireTime=");
        sb.append(this.expireTime);
        sb.append(", discount=");
        sb.append(this.discount);
        sb.append(", discountLimit=");
        sb.append(this.discountLimit);
        sb.append(", couponRange=");
        sb.append(this.couponRange);
        sb.append(", applyType=");
        sb.append(this.applyType);
        sb.append(", periodType=");
        sb.append(this.periodType);
        sb.append(", validPeriod=");
        sb.append(this.validPeriod);
        sb.append(")");
        return sb.toString();
    }

    public final void setApplyType(String str) {
        this.applyType = str;
    }

    public final void setCouponMetaId(String str) {
        this.couponMetaId = str;
    }

    public final void setCouponName(String str) {
        this.couponName = str;
    }

    public final void setCouponRange(String str) {
        this.couponRange = str;
    }

    public final void setCredit(int i) {
        this.credit = i;
    }

    public final void setDiscount(Float f) {
        this.discount = f;
    }

    public final void setDiscountLimit(Integer num) {
        this.discountLimit = num;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setPeriodType(Integer num) {
        this.periodType = num;
    }

    public final void setShopName(String str) {
        this.shopName = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setThreshold(long j) {
        this.threshold = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setValidPeriod(Integer num) {
        this.validPeriod = num;
    }

    public CommerceGoodCoupon(String str, int i, String str2, String str3, long j, int i2, long j2, long j3, Float f, Integer num, String str4, String str5, Integer num2, Integer num3) {
        this.couponMetaId = str;
        this.type = i;
        this.couponName = str2;
        this.shopName = str3;
        this.threshold = j;
        this.credit = i2;
        this.startTime = j2;
        this.expireTime = j3;
        this.discount = f;
        this.discountLimit = num;
        this.couponRange = str4;
        this.applyType = str5;
        this.periodType = num2;
        this.validPeriod = num3;
    }

    public /* synthetic */ CommerceGoodCoupon(String str, int i, String str2, String str3, long j, int i2, long j2, long j3, Float f, Integer num, String str4, String str5, Integer num2, Integer num3, int i3, C7571f fVar) {
        String str6;
        int i4;
        String str7;
        String str8;
        long j4;
        int i5;
        long j5;
        Float f2;
        Integer num4;
        String str9;
        String str10;
        Integer num5;
        Integer num6;
        int i6 = i3;
        if ((i6 & 1) != 0) {
            str6 = "";
        } else {
            str6 = str;
        }
        if ((i6 & 2) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i6 & 4) != 0) {
            str7 = "";
        } else {
            str7 = str2;
        }
        if ((i6 & 8) != 0) {
            str8 = "";
        } else {
            str8 = str3;
        }
        long j6 = 0;
        if ((i6 & 16) != 0) {
            j4 = 0;
        } else {
            j4 = j;
        }
        if ((i6 & 32) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i6 & 64) != 0) {
            j5 = 0;
        } else {
            j5 = j2;
        }
        if ((i6 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
            j6 = j3;
        }
        if ((i6 & 256) != 0) {
            f2 = Float.valueOf(0.0f);
        } else {
            f2 = f;
        }
        if ((i6 & 512) != 0) {
            num4 = Integer.valueOf(0);
        } else {
            num4 = num;
        }
        if ((i6 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            str9 = "";
        } else {
            str9 = str4;
        }
        if ((i6 & 2048) != 0) {
            str10 = "";
        } else {
            str10 = str5;
        }
        String str11 = str10;
        if ((i6 & 4096) != 0) {
            num5 = Integer.valueOf(1);
        } else {
            num5 = num2;
        }
        if ((i6 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            num6 = Integer.valueOf(0);
        } else {
            num6 = num3;
        }
        this(str6, i4, str7, str8, j4, i5, j5, j6, f2, num4, str9, str11, num5, num6);
    }
}
