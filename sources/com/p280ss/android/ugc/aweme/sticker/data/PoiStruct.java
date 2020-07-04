package com.p280ss.android.ugc.aweme.sticker.data;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.PoiStruct */
public class PoiStruct implements Serializable {
    @C6593c(mo15949a = "address_info")
    public Address address;
    @C6593c(mo15949a = "collect_stat")
    public Integer collectStatus;
    @C6593c(mo15949a = "cover_hd")
    public UrlModel coverHd;
    @C6593c(mo15949a = "cover_item")
    public UrlModel coverItem;
    @C6593c(mo15949a = "cover_large")
    public UrlModel coverLarge;
    @C6593c(mo15949a = "cover_medium")
    public UrlModel coverMedium;
    @C6593c(mo15949a = "cover_thumb")
    public UrlModel coverThumb;
    @C6593c(mo15949a = "distance")
    public String distance;
    @C6593c(mo15949a = "expand_type")
    public Long expandType;
    @C6593c(mo15949a = "icon_on_entry")
    public UrlModel iconOnEntry;
    @C6593c(mo15949a = "icon_on_info")
    public UrlModel iconOnInfo;
    @C6593c(mo15949a = "icon_on_map")
    public UrlModel iconOnMap;
    @C6593c(mo15949a = "icon_type")
    public Integer iconType;
    @C6593c(mo15949a = "is_candidate")
    public Boolean isCandidate;
    @C6593c(mo15949a = "item_count")
    public Integer itemCount;
    public transient LinkedHashMap<String, Object> mArgs = new LinkedHashMap<>();
    @C6593c(mo15949a = "business_area_name")
    public String poiBusinessAreaName;
    @C6593c(mo15949a = "poi_card")
    public PoiCardStruct poiCard;
    @C6593c(mo15949a = "cost")
    public Double poiCost;
    @C6593c(mo15949a = "poi_id")
    public String poiId;
    @C6593c(mo15949a = "is_local_city")
    public Boolean poiIsLocalCity;
    @C6593c(mo15949a = "poi_latitude")
    public String poiLatitude;
    @C6593c(mo15949a = "poi_longitude")
    public String poiLongitude;
    @C6593c(mo15949a = "poi_name")
    public String poiName;
    @C6593c(mo15949a = "option_name")
    public String poiOptionName;
    @C6593c(mo15949a = "poi_rank_desc")
    public String poiRankDesc;
    @C6593c(mo15949a = "rating")
    public Double poiRating;
    @C6593c(mo15949a = "poi_subtitle")
    public String poiSubTitle;
    @C6593c(mo15949a = "poi_subtitle_type")
    public Integer poiSubTitleType;
    @C6593c(mo15949a = "poi_type")
    public Long poiType;
    @C6593c(mo15949a = "poi_voucher")
    public String poiVoucher;
    @C6593c(mo15949a = "share_info")
    public ShareInfo shareInfo;
    @C6593c(mo15949a = "type_code")
    public String typeCode;
    @C6593c(mo15949a = "user_count")
    public Integer userCount;
    @C6593c(mo15949a = "voucher_release_areas")
    public List<String> voucherReleaseAreas;

    public Address getAddress() {
        return this.address;
    }

    public Boolean getCandidate() {
        return this.isCandidate;
    }

    public Integer getCollectStatus() {
        return this.collectStatus;
    }

    public UrlModel getCoverHd() {
        return this.coverHd;
    }

    public UrlModel getCoverItem() {
        return this.coverItem;
    }

    public UrlModel getCoverLarge() {
        return this.coverLarge;
    }

    public UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public String getDistance() {
        return this.distance;
    }

    public Long getExpandType() {
        return this.expandType;
    }

    public UrlModel getIconOnEntry() {
        return this.iconOnEntry;
    }

    public UrlModel getIconOnInfo() {
        return this.iconOnInfo;
    }

    public UrlModel getIconOnMap() {
        return this.iconOnMap;
    }

    public Integer getIconType() {
        return this.iconType;
    }

    public Integer getItemCount() {
        return this.itemCount;
    }

    public String getPoiBusinessAreaName() {
        return this.poiBusinessAreaName;
    }

    public PoiCardStruct getPoiCard() {
        return this.poiCard;
    }

    public Double getPoiCost() {
        return this.poiCost;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public Boolean getPoiIsLocalCity() {
        return this.poiIsLocalCity;
    }

    public String getPoiLatitude() {
        return this.poiLatitude;
    }

    public String getPoiLongitude() {
        return this.poiLongitude;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getPoiOptionName() {
        return this.poiOptionName;
    }

    public String getPoiRankDesc() {
        return this.poiRankDesc;
    }

    public Double getPoiRating() {
        return this.poiRating;
    }

    public String getPoiSubTitle() {
        return this.poiSubTitle;
    }

    public Integer getPoiSubTitleType() {
        return this.poiSubTitleType;
    }

    public Long getPoiType() {
        return this.poiType;
    }

    public String getPoiVoucher() {
        return this.poiVoucher;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public Integer getUserCount() {
        return this.userCount;
    }

    public List<String> getVoucherReleaseAreas() {
        return this.voucherReleaseAreas;
    }

    public Boolean isPoiIsLocalCity() {
        return this.poiIsLocalCity;
    }

    public String isCandidate() {
        if (this.isCandidate.booleanValue()) {
            return "1";
        }
        return "0";
    }

    public Boolean isExpandable() {
        boolean z;
        if (this.expandType.longValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void setAddress(Address address2) {
        this.address = address2;
    }

    public void setCandidate(Boolean bool) {
        this.isCandidate = bool;
    }

    public void setCollectStatus(Integer num) {
        this.collectStatus = num;
    }

    public void setCoverHd(UrlModel urlModel) {
        this.coverHd = urlModel;
    }

    public void setCoverItem(UrlModel urlModel) {
        this.coverItem = urlModel;
    }

    public void setCoverLarge(UrlModel urlModel) {
        this.coverLarge = urlModel;
    }

    public void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setExpandType(Long l) {
        this.expandType = l;
    }

    public void setIconOnEntry(UrlModel urlModel) {
        this.iconOnEntry = urlModel;
    }

    public void setIconOnInfo(UrlModel urlModel) {
        this.iconOnInfo = urlModel;
    }

    public void setIconOnMap(UrlModel urlModel) {
        this.iconOnMap = urlModel;
    }

    public void setIconType(Integer num) {
        this.iconType = num;
    }

    public void setItemCount(Integer num) {
        this.itemCount = num;
    }

    public void setPoiBusinessAreaName(String str) {
        this.poiBusinessAreaName = str;
    }

    public void setPoiCard(PoiCardStruct poiCardStruct) {
        this.poiCard = poiCardStruct;
    }

    public void setPoiCost(Double d) {
        this.poiCost = d;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public void setPoiIsLocalCity(Boolean bool) {
        this.poiIsLocalCity = bool;
    }

    public void setPoiLatitude(String str) {
        this.poiLatitude = str;
    }

    public void setPoiLongitude(String str) {
        this.poiLongitude = str;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public void setPoiOptionName(String str) {
        this.poiOptionName = str;
    }

    public void setPoiRankDesc(String str) {
        this.poiRankDesc = str;
    }

    public void setPoiRating(Double d) {
        this.poiRating = d;
    }

    public void setPoiSubTitle(String str) {
        this.poiSubTitle = str;
    }

    public void setPoiSubTitleType(Integer num) {
        this.poiSubTitleType = num;
    }

    public void setPoiType(Long l) {
        this.poiType = l;
    }

    public void setPoiVoucher(String str) {
        this.poiVoucher = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setTypeCode(String str) {
        this.typeCode = str;
    }

    public void setUserCount(Integer num) {
        this.userCount = num;
    }

    public void setVoucherReleaseAreas(List<String> list) {
        this.voucherReleaseAreas = list;
    }

    public Object get(String str) {
        return this.mArgs.get(str);
    }

    public Boolean contains(String str) {
        return Boolean.valueOf(this.mArgs.containsKey(str));
    }

    public void put(String str, Object obj) {
        this.mArgs.put(str, obj);
    }
}
