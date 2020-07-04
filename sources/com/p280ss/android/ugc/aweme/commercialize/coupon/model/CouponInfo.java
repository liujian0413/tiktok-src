package com.p280ss.android.ugc.aweme.commercialize.coupon.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo */
public class CouponInfo extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "abbr_condition")
    private String abbrCondition;
    @C6593c(mo15949a = "activity_id")
    private int activityId;
    @C6593c(mo15949a = "can_rate")
    public int canRate;
    @C6593c(mo15949a = "codabar_image_url")
    private String codabarImageUrl;
    @C6593c(mo15949a = "code")
    private String code;
    @C6593c(mo15949a = "code_id")
    private String codeId;
    @C6593c(mo15949a = "condition")
    private String condition;
    @C6593c(mo15949a = "coupon_id")
    private int couponId;
    @C6593c(mo15949a = "coupon_source")
    private int couponSource;
    @C6593c(mo15949a = "coupon_type")
    private int couponType;
    @C6593c(mo15949a = "create_time")
    private String createTime;
    @C6593c(mo15949a = "desc")
    private String desc;
    @C6593c(mo15949a = "detail_url")
    private String detailUrl;
    @C6593c(mo15949a = "group")
    private String group;
    @C6593c(mo15949a = "head_image_url")
    private UrlModel headImageUrl;
    @C6593c(mo15949a = "hint_text")
    public String hintText;
    @C6593c(mo15949a = "is_default_head_image")
    private boolean isDefaultHeadImage;
    @C6593c(mo15949a = "logo_image_url")
    private UrlModel logoImageUrl;
    @C6593c(mo15949a = "sec_uid")
    private String mSecUid;
    @C6593c(mo15949a = "merchant_name")
    private String merchantName;
    @C6593c(mo15949a = "notification")
    private String notification;
    @C6593c(mo15949a = "object_type")
    public int objectType;
    @C6593c(mo15949a = "pay_type")
    private int payType;
    @C6593c(mo15949a = "poi_list")
    private List<String> poiList;
    @C6593c(mo15949a = "qrcode_url")
    private UrlModel qrCodeUrl;
    @C6593c(mo15949a = "service_tel")
    private String serviceTel;
    @C6593c(mo15949a = "status")
    private int status;
    @C6593c(mo15949a = "store_page_link")
    private String storePageLink;
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "use_page_link")
    private String usePageLink;
    @C6593c(mo15949a = "user_id")
    private Long userId;
    @C6593c(mo15949a = "valid_date_text")
    public String validDateText;
    @C6593c(mo15949a = "valid_end")
    private String validEnd;
    @C6593c(mo15949a = "valid_poi_id")
    public String validPoiId;
    @C6593c(mo15949a = "valid_poi_name")
    public String validPoiName;
    @C6593c(mo15949a = "valid_start")
    private String validStart;

    public String getAbbrCondition() {
        return this.abbrCondition;
    }

    public int getActivityId() {
        return this.activityId;
    }

    public String getCodabarImageUrl() {
        return this.codabarImageUrl;
    }

    public String getCode() {
        return this.code;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getCondition() {
        return this.condition;
    }

    public int getCouponId() {
        return this.couponId;
    }

    public int getCouponSource() {
        return this.couponSource;
    }

    public int getCouponType() {
        return this.couponType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public String getGroup() {
        return this.group;
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public UrlModel getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getNotification() {
        return this.notification;
    }

    public int getPayType() {
        return this.payType;
    }

    public List<String> getPoiList() {
        return this.poiList;
    }

    public UrlModel getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public String getServiceTel() {
        return this.serviceTel;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStorePageLink() {
        return this.storePageLink;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUsePageLink() {
        return this.usePageLink;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getValidEnd() {
        return this.validEnd;
    }

    public String getValidStart() {
        return this.validStart;
    }

    public boolean isDefaultHeadImage() {
        return this.isDefaultHeadImage;
    }

    public boolean canCouponRate() {
        if (this.canRate != 1 || TextUtils.isEmpty(this.validPoiId) || TextUtils.isEmpty(this.validPoiName)) {
            return false;
        }
        return true;
    }

    public void setAbbrCondition(String str) {
        this.abbrCondition = str;
    }

    public void setActivityId(int i) {
        this.activityId = i;
    }

    public void setCodabarImageUrl(String str) {
        this.codabarImageUrl = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setCondition(String str) {
        this.condition = str;
    }

    public void setCouponId(int i) {
        this.couponId = i;
    }

    public void setCouponSource(int i) {
        this.couponSource = i;
    }

    public void setCouponType(int i) {
        this.couponType = i;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDefaultHeadImage(boolean z) {
        this.isDefaultHeadImage = z;
    }

    public void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setLogoImageUrl(UrlModel urlModel) {
        this.logoImageUrl = urlModel;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setNotification(String str) {
        this.notification = str;
    }

    public void setPoiList(List<String> list) {
        this.poiList = list;
    }

    public void setQrCodeUrl(UrlModel urlModel) {
        this.qrCodeUrl = urlModel;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setServiceTel(String str) {
        this.serviceTel = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStorePageLink(String str) {
        this.storePageLink = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUsePageLink(String str) {
        this.usePageLink = str;
    }

    public void setUserId(Long l) {
        this.userId = l;
    }

    public void setValidEnd(String str) {
        this.validEnd = str;
    }

    public void setValidStart(String str) {
        this.validStart = str;
    }
}
