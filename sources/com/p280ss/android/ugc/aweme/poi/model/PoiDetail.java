package com.p280ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.bean.PoiBannerItem;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.taobao.android.dexposed.ClassUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiDetail */
public class PoiDetail extends C34145b implements Serializable {
    @C6593c(mo15949a = "around_hot_poi_count")
    public int aroundHotPoiCount;
    @C6593c(mo15949a = "aweme_list")
    public List<Aweme> awemeList;
    @C6593c(mo15949a = "aweme_type")
    int awemeType;
    @C6593c(mo15949a = "city_window")
    private PoiMicroAppLink cityWindow;
    @C6593c(mo15949a = "coupon_share_setting")
    public PoiDetailCouponShareSetting couponShareSetting;
    long duration;
    private boolean enableLoadMore = true;
    private int feedType;
    @C6593c(mo15949a = "is_local")
    public boolean isLocal;
    @C6593c(mo15949a = "is_school")
    int isSchool;
    @C6593c(mo15949a = "is_show_campus_rank")
    int isShowCampusRank;
    @C6593c(mo15949a = "notice_banner_list")
    public List<PoiClassRankBannerStruct> noticeBannerList;
    private PoiQRDetailStruct poiActivityResponse;
    private PoiBannerItem poiActs;
    @C6593c(mo15949a = "commodity")
    public PoiCommodity poiCommodity;
    @C6593c(mo15949a = "poi_ext")
    public PoiExtension poiExtension;
    @C6593c(mo15949a = "poi_owner")
    public PoiOwner poiOwner;
    @C6593c(mo15949a = "poi_info")
    public PoiStruct poiStruct;
    @C6593c(mo15949a = "product_info")
    public PoiProductInfo productInfo;
    @C6593c(mo15949a = "discover_poi")
    public PoiRecommendPoiList recommendPoiExplore;
    @C6593c(mo15949a = "food_poi")
    public PoiRecommendPoiList recommendPoiFood;
    @C6593c(mo15949a = "hotel_poi")
    public PoiRecommendPoiList recommendPoiHotel;
    @C6593c(mo15949a = "nearby_poi")
    public PoiRecommendPoiList recommendPoiNearby;
    @C6593c(mo15949a = "tour_poi")
    public PoiRecommendPoiList recommendPoiScene;
    @C6593c(mo15949a = "poi_list")
    public List<PoiStruct> recommendedPoiList;
    @C6593c(mo15949a = "show_detail_type")
    public int showDetailType = 1;
    @C6593c(mo15949a = "user_list")
    public List<User> userList;

    public int getAwemeType() {
        return this.awemeType;
    }

    public PoiMicroAppLink getCityWindow() {
        return this.cityWindow;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getFeedType() {
        return this.feedType;
    }

    public int getIsSchool() {
        return this.isSchool;
    }

    public int getIsShowCampusRank() {
        return this.isShowCampusRank;
    }

    public PoiQRDetailStruct getPoiActivityResponse() {
        return this.poiActivityResponse;
    }

    public PoiStruct getPoiStruct() {
        return this.poiStruct;
    }

    public List<User> getUserList() {
        return this.userList;
    }

    public boolean isDestination() {
        return false;
    }

    public boolean isLoadMoreEnable() {
        return this.enableLoadMore;
    }

    public boolean isLocal() {
        return this.isLocal;
    }

    public String getEnterpriseLogo() {
        return this.poiOwner.avatar;
    }

    public List<PoiComment> get3rdCommentList() {
        if (this.poiExtension != null) {
            return this.poiExtension.commentList;
        }
        return null;
    }

    public List<PoiClassRankBannerStruct> getActs() {
        if (this.poiActs == null) {
            return null;
        }
        return this.poiActs.getBanners();
    }

    public String getBackendType() {
        if (this.poiStruct == null) {
            return null;
        }
        return this.poiStruct.getBackendTypeCode();
    }

    public String getBookUrl() {
        if (this.poiCommodity != null) {
            return this.poiCommodity.book_url;
        }
        return "";
    }

    public UrlModel getCover() {
        if (this.poiStruct != null) {
            return this.poiStruct.getCoverMedium();
        }
        return null;
    }

    public String getDesc() {
        if (this.poiExtension != null) {
            return this.poiExtension.descTitle;
        }
        return "";
    }

    public String getEnterpriseClaimUrl() {
        if (this.poiOwner == null) {
            return "";
        }
        return this.poiOwner.claimUrl;
    }

    public String getEnterpriseId() {
        if (this.poiOwner != null) {
            return this.poiOwner.f91786id;
        }
        return null;
    }

    public String getEnterpriseSecUid() {
        if (this.poiOwner != null) {
            return this.poiOwner.getUserSecId();
        }
        return null;
    }

    public String getEnterpriseSignature() {
        if (this.poiOwner != null) {
            return this.poiOwner.signature;
        }
        return null;
    }

    public UrlModel getEnterpriseThumb() {
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(this.poiOwner.avatar);
        return urlModel;
    }

    public String getEnterpriseTitle() {
        if (this.poiOwner != null) {
            return this.poiOwner.name;
        }
        return null;
    }

    public String getEnterpriseVerifyReason() {
        if (this.poiOwner != null) {
            return this.poiOwner.enterpriseVerifyReason;
        }
        return null;
    }

    public String getFeedbackUrl() {
        if (this.poiExtension != null) {
            return this.poiExtension.feedbackUrl;
        }
        return "";
    }

    public String getI18nPrice() {
        if (this.poiExtension != null) {
            return this.poiExtension.i18nCost;
        }
        return "";
    }

    public String getLat() {
        if (this.poiStruct != null) {
            return this.poiStruct.getPoiLatitude();
        }
        return "";
    }

    public String getLng() {
        if (this.poiStruct != null) {
            return this.poiStruct.getPoiLongitude();
        }
        return "";
    }

    public PoiOrder getOrderInfo() {
        if (this.poiExtension != null) {
            return this.poiExtension.orderInfo;
        }
        return null;
    }

    public String getPhone() {
        if (this.poiExtension == null) {
            return null;
        }
        return this.poiExtension.telephone;
    }

    public PoiActivityInfo getPoiActivityInfo() {
        if (this.poiExtension != null) {
            return this.poiExtension.poiActivityInfo;
        }
        return null;
    }

    public String[] getPoiCategory() {
        if (this.poiExtension != null) {
            return this.poiExtension.getPoiCategory();
        }
        return null;
    }

    public List<DestinationPoiClassInfoStruct> getPoiClassInfoStructList() {
        if (this.poiExtension != null) {
            return this.poiExtension.getPoiClassInfoStructList();
        }
        return null;
    }

    public String getPoiId() {
        if (this.poiStruct == null) {
            return "";
        }
        return this.poiStruct.getPoiId();
    }

    public String getPoiName() {
        if (this.poiStruct == null) {
            return "";
        }
        return this.poiStruct.getPoiName();
    }

    public String getPoiRank() {
        if (this.poiExtension != null) {
            return this.poiExtension.getRankDesc();
        }
        return null;
    }

    public PoiClassRankStruct getPoiRankBundle() {
        if (this.poiExtension != null) {
            return this.poiExtension.poiClassRank;
        }
        return null;
    }

    public long getPoiRankClassCode() {
        if (this.poiExtension != null) {
            return this.poiExtension.getRankClassCode();
        }
        return -1;
    }

    public int getPoiType() {
        if (this.poiStruct == null) {
            return 1;
        }
        return this.poiStruct.iconType;
    }

    public PoiQuestion getQuestion() {
        if (isQuestionShow()) {
            return this.poiExtension.getQuestion();
        }
        return null;
    }

    public String getQueueUrl() {
        if (this.poiCommodity != null) {
            return this.poiCommodity.queue_url;
        }
        return "";
    }

    public List<PoiPhoto> getRecommendPhoto() {
        if (this.poiExtension == null) {
            return null;
        }
        return this.poiExtension.recommendItems;
    }

    public String getRecommendTitle() {
        if (this.poiExtension != null) {
            return this.poiExtension.recommendTitle;
        }
        return "";
    }

    public String getSubType() {
        if (this.poiExtension == null) {
            return "";
        }
        return this.poiExtension.subType;
    }

    public String getTitle() {
        if (this.poiStruct != null) {
            return this.poiStruct.getPoiName();
        }
        return "";
    }

    public String getTypeCode() {
        if (this.poiStruct == null) {
            return "";
        }
        return this.poiStruct.typeCode;
    }

    public boolean hasMerchantActs() {
        if (!C6307b.m19566a((Collection<T>) this.noticeBannerList)) {
            return true;
        }
        return false;
    }

    public boolean hasRate() {
        if (this.poiExtension == null || this.poiExtension.hasRate != 1) {
            return false;
        }
        return true;
    }

    public boolean hasRecomemndExplorePoi() {
        if (this.recommendPoiExplore == null || !this.recommendPoiExplore.isValid()) {
            return false;
        }
        return true;
    }

    public boolean hasRecomemndFoodPoi() {
        if (this.recommendPoiFood == null || !this.recommendPoiFood.isValid()) {
            return false;
        }
        return true;
    }

    public boolean hasRecomemndHotelPoi() {
        if (this.recommendPoiHotel == null || !this.recommendPoiHotel.isValid()) {
            return false;
        }
        return true;
    }

    public boolean hasRecomemndNearbyPoi() {
        if (this.recommendPoiNearby == null || !this.recommendPoiNearby.isValid()) {
            return false;
        }
        return true;
    }

    public boolean hasRecomemndScenePoi() {
        if (this.recommendPoiScene == null || !this.recommendPoiScene.isValid()) {
            return false;
        }
        return true;
    }

    public boolean isCollected() {
        if (this.poiStruct == null || this.poiStruct.getCollectStatus() != 1) {
            return false;
        }
        return true;
    }

    public boolean isPoiValid() {
        if (this.poiExtension == null) {
            return true;
        }
        return this.poiExtension.valid;
    }

    public boolean isQuestionShow() {
        if (this.poiExtension == null || this.poiExtension.questionInfo == null) {
            return false;
        }
        return true;
    }

    public boolean isUseNewDetailStyle() {
        if (this.poiExtension != null) {
            return this.poiExtension.hasDetailInfo;
        }
        return false;
    }

    public void validatePoiClassInfoStructList() {
        if (this.poiExtension != null) {
            this.poiExtension.validatePoiClassInfoStructList();
        }
    }

    public String getAddress() {
        if (this.poiStruct == null || this.poiStruct.address == null) {
            return null;
        }
        return this.poiStruct.address.simpleAddr;
    }

    public List<AwemeRawAd> getAwemeRawAds() {
        if (this.poiExtension == null || this.poiExtension.poiActivityInfo == null) {
            return null;
        }
        return this.poiExtension.poiActivityInfo.getAwemeRawAds();
    }

    public String getCityCode() {
        if (this.poiStruct == null || this.poiStruct.address == null) {
            return null;
        }
        return this.poiStruct.address.cityCode;
    }

    public long getDefaultPoiClassCode() {
        List poiClassInfoStructList = getPoiClassInfoStructList();
        if (!C6307b.m19566a((Collection<T>) poiClassInfoStructList)) {
            return ((DestinationPoiClassInfoStruct) poiClassInfoStructList.get(0)).code;
        }
        return -1;
    }

    public String getEnterpriseDesc() {
        if (!TextUtils.isEmpty(this.poiOwner.enterpriseVerifyReason)) {
            return this.poiOwner.enterpriseVerifyReason;
        }
        return this.poiOwner.signature;
    }

    public User getEnterpriseModel() {
        User user = new User();
        user.setUid(this.poiOwner.f91786id);
        user.setSecUid(this.poiOwner.getUserSecId());
        user.setCommerceUserLevel(1);
        return user;
    }

    public String[] getLabels() {
        if (this.poiExtension == null || C6319n.m19593a(this.poiExtension.tags)) {
            return null;
        }
        try {
            return this.poiExtension.tags.split(",");
        } catch (Exception unused) {
            return null;
        }
    }

    public PoiClassRankBannerStruct getMerchantAct() {
        if (hasMerchantActs()) {
            return (PoiClassRankBannerStruct) this.noticeBannerList.get(0);
        }
        return null;
    }

    public String getMerchantActId() {
        if (hasMerchantActs()) {
            return ((PoiClassRankBannerStruct) this.noticeBannerList.get(0)).getBid();
        }
        return "";
    }

    public String getMerchantActTitle() {
        if (hasMerchantActs()) {
            return ((PoiClassRankBannerStruct) this.noticeBannerList.get(0)).getTitle();
        }
        return "";
    }

    public List<PoiPhoto> getPoiTopPhoto() {
        if (this.poiExtension == null || this.poiExtension.photos == null) {
            return null;
        }
        return this.poiExtension.photos;
    }

    public String getPoiTypeStr() {
        if (this.poiStruct == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.poiStruct.iconType);
        return sb.toString();
    }

    public long getQuestionCount() {
        if (isQuestionShow()) {
            return this.poiExtension.questionInfo.getTotalQuestionCount();
        }
        return 0;
    }

    public float getRating() {
        try {
            if (this.poiExtension != null) {
                if (!C6319n.m19593a(this.poiExtension.rating)) {
                    return Float.parseFloat(this.poiExtension.rating);
                }
            }
            return -1.0f;
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    public String getRatingStr() {
        if (this.poiExtension == null || C6319n.m19593a(this.poiExtension.rating)) {
            return "";
        }
        return this.poiExtension.rating;
    }

    public boolean hasValidProduct() {
        if (this.productInfo == null || !this.productInfo.isValidStyle() || C6307b.m19566a((Collection<T>) this.productInfo.products)) {
            return false;
        }
        return true;
    }

    public boolean isCertificated() {
        if (this.poiOwner == null || TextUtils.isEmpty(this.poiOwner.f91786id)) {
            return false;
        }
        return true;
    }

    public boolean isEnterprise() {
        if (this.poiOwner == null || C6319n.m19593a(this.poiOwner.f91786id)) {
            return false;
        }
        return true;
    }

    public boolean isPoiOwnerValid() {
        if (this.poiOwner == null || (C6319n.m19593a(this.poiOwner.claimUrl) && C6319n.m19593a(this.poiOwner.f91786id))) {
            return false;
        }
        return true;
    }

    public void parseAdRawData() {
        if (this.poiExtension != null && this.poiExtension.poiActivityInfo != null) {
            this.poiExtension.poiActivityInfo.parseRawData();
        }
    }

    public double[] getLatLng() {
        if (this.poiStruct == null) {
            return null;
        }
        try {
            return new double[]{Double.parseDouble(this.poiStruct.getPoiLatitude()), Double.parseDouble(this.poiStruct.getPoiLongitude())};
        } catch (Exception e) {
            C6921a.m21554a(e);
            return null;
        }
    }

    public String getPrice() {
        String str;
        if (this.poiExtension != null) {
            str = this.poiExtension.cost;
        } else {
            str = "";
        }
        if (!C6319n.m19593a(str) && str.indexOf(ClassUtils.PACKAGE_SEPARATOR) > 0) {
            str = str.substring(0, str.indexOf(ClassUtils.PACKAGE_SEPARATOR));
        }
        try {
            if (Integer.parseInt(str) == 0) {
                return null;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public List<String> getRecommendFood() {
        if (this.poiExtension == null || C6319n.m19593a(this.poiExtension.specialities)) {
            return null;
        }
        try {
            return Arrays.asList(this.poiExtension.specialities.split(","));
        } catch (Exception e) {
            C6921a.m21554a(e);
            return null;
        }
    }

    public void setActs(PoiBannerItem poiBannerItem) {
        this.poiActs = poiBannerItem;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setCityWindow(PoiMicroAppLink poiMicroAppLink) {
        this.cityWindow = poiMicroAppLink;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setEnableLoadMore(boolean z) {
        this.enableLoadMore = z;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setIsSchool(int i) {
        this.isSchool = i;
    }

    public void setIsShowCampusRank(int i) {
        this.isShowCampusRank = i;
    }

    public void setPoiActivityResponse(PoiQRDetailStruct poiQRDetailStruct) {
        this.poiActivityResponse = poiQRDetailStruct;
    }

    public void setPoiStruct(PoiStruct poiStruct2) {
        this.poiStruct = poiStruct2;
    }

    public void setUserList(List<User> list) {
        this.userList = list;
    }

    public DestinationPoiClassInfoStruct getPoiClassInfoStruct(int i) {
        if (this.poiExtension != null) {
            return this.poiExtension.getPoiClassInfoStruct(i);
        }
        return null;
    }

    public PoiStruct getRecommendPoi(int i) {
        if (this.recommendedPoiList == null || i < 0 || i >= this.recommendedPoiList.size()) {
            return null;
        }
        return (PoiStruct) this.recommendedPoiList.get(i);
    }

    public void setAwemeRawAds(List<AwemeRawAd> list) {
        if (this.poiExtension != null && this.poiExtension.poiActivityInfo != null) {
            this.poiExtension.poiActivityInfo.setAwemeRawAds(list);
        }
    }

    public List<String> getRecommendFood(int i) {
        if (this.poiExtension == null || C6319n.m19593a(this.poiExtension.specialities)) {
            return null;
        }
        try {
            String[] split = this.poiExtension.specialities.split(",");
            return Arrays.asList(split).subList(0, Math.min(i, split.length));
        } catch (Exception e) {
            C6921a.m21554a(e);
            return null;
        }
    }

    public String getEnterpriseBusinessTime(String[] strArr, String str) {
        return this.poiOwner.appendBusinessTime(strArr, str);
    }
}
