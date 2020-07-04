package com.p280ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiStruct */
public class PoiStruct implements Serializable {
    @C6593c(mo15949a = "address_info")
    public Address address;
    @C6593c(mo15949a = "collect_stat")
    public int collectStatus;
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
    public long expandType;
    @C6593c(mo15949a = "has_rate")
    public int hasRate;
    @C6593c(mo15949a = "icon_on_entry")
    public UrlModel iconOnEntry;
    @C6593c(mo15949a = "icon_on_info")
    public UrlModel iconOnInfo;
    @C6593c(mo15949a = "icon_on_map")
    public UrlModel iconOnMap;
    @C6593c(mo15949a = "icon_type")
    public int iconType;
    @C6593c(mo15949a = "is_admin_area")
    public boolean isAdminArea;
    @C6593c(mo15949a = "is_candidate")
    public boolean isCandidate;
    @C6593c(mo15949a = "is_top_recommend")
    public boolean isTopRecommend;
    @C6593c(mo15949a = "item_count")
    public int itemCount;
    public transient LinkedHashMap<String, Object> mArgs = new LinkedHashMap<>();
    @C6593c(mo15949a = "poi_backend_type")
    public PoiBackendType poiBackendType;
    @C6593c(mo15949a = "business_area_name")
    public String poiBusinessAreaName;
    @C6593c(mo15949a = "poi_card")
    public PoiCardStruct poiCard;
    @C6593c(mo15949a = "cost")
    public double poiCost;
    @C6593c(mo15949a = "poi_id")
    public String poiId;
    @C6593c(mo15949a = "is_local_city")
    public boolean poiIsLocalCity;
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
    public double poiRating;
    @C6593c(mo15949a = "poi_subtitle")
    public String poiSubTitle;
    @C6593c(mo15949a = "poi_subtitle_type")
    public int poiSubTitleType;
    @C6593c(mo15949a = "poi_type")
    public long poiType;
    @C6593c(mo15949a = "poi_voucher")
    public String poiVoucher;
    @C6593c(mo15949a = "share_info")
    public ShareInfo shareInfo;
    @C6593c(mo15949a = "is_show_halfcard")
    public int showHalfCard;
    @C6593c(mo15949a = "type_code")
    public String typeCode;
    @C6593c(mo15949a = "user_count")
    public int userCount;
    @C6593c(mo15949a = "view_count")
    public String viewCount;
    @C6593c(mo15949a = "voucher_release_areas")
    public List<String> voucherReleaseAreas;

    public Address getAddress() {
        return this.address;
    }

    public int getCollectStatus() {
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

    public int getIconType() {
        return this.iconType;
    }

    public boolean getIsTopRecommend() {
        return this.isTopRecommend;
    }

    public int getItemCount() {
        return this.itemCount;
    }

    public String getPoiBusinessAreaName() {
        return this.poiBusinessAreaName;
    }

    public PoiCardStruct getPoiCard() {
        return this.poiCard;
    }

    public double getPoiCost() {
        return this.poiCost;
    }

    public String getPoiId() {
        return this.poiId;
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

    public double getPoiRating() {
        return this.poiRating;
    }

    public String getPoiSubTitle() {
        return this.poiSubTitle;
    }

    public int getPoiSubTitleType() {
        return this.poiSubTitleType;
    }

    public String getPoiVoucher() {
        return this.poiVoucher;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getShowHalfCard() {
        return this.showHalfCard;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public List<String> getVoucherReleaseAreas() {
        return this.voucherReleaseAreas;
    }

    public boolean isPoiIsLocalCity() {
        return this.poiIsLocalCity;
    }

    public String getBackendTypeCode() {
        if (this.poiBackendType != null) {
            return this.poiBackendType.getCode();
        }
        return "";
    }

    public String isCandidate() {
        if (this.isCandidate) {
            return "1";
        }
        return "0";
    }

    public boolean isExpandable() {
        if (this.expandType == 1) {
            return true;
        }
        return false;
    }

    public String getAddressStr() {
        if (this.address == null) {
            return this.poiName;
        }
        if (TextUtils.isEmpty(this.address.simpleAddr)) {
            return this.poiName;
        }
        return this.address.simpleAddr;
    }

    public String getCity() {
        if (this.address != null && !TextUtils.isEmpty(this.address.getCity())) {
            return this.address.getCity();
        }
        return null;
    }

    public String getCityCode() {
        if (this.address != null && !TextUtils.isEmpty(this.address.getCityCode())) {
            return this.address.getCityCode();
        }
        return null;
    }

    public String getCountry() {
        if (this.address == null) {
            return "";
        }
        if (TextUtils.isEmpty(this.address.country)) {
            return "";
        }
        return this.address.country;
    }

    public String getCountryCode() {
        if (this.address == null) {
            return "";
        }
        if (TextUtils.isEmpty(this.address.countryCode)) {
            return "";
        }
        return this.address.countryCode;
    }

    public String getProvince() {
        if (this.address != null && !TextUtils.isEmpty(this.address.getProvince())) {
            return this.address.getProvince();
        }
        return null;
    }

    public com.p280ss.android.ugc.aweme.sticker.data.PoiStruct toStickerPoiStruct() {
        com.p280ss.android.ugc.aweme.sticker.data.PoiStruct poiStruct = new com.p280ss.android.ugc.aweme.sticker.data.PoiStruct();
        poiStruct.setPoiId(this.poiId);
        poiStruct.setPoiName(this.poiName);
        poiStruct.setTypeCode(this.typeCode);
        poiStruct.setUserCount(Integer.valueOf(this.userCount));
        poiStruct.setItemCount(Integer.valueOf(this.itemCount));
        poiStruct.setShareInfo(this.shareInfo);
        poiStruct.setCoverHd(this.coverHd);
        poiStruct.setCoverLarge(this.coverLarge);
        poiStruct.setCoverMedium(this.coverMedium);
        poiStruct.setCoverThumb(this.coverThumb);
        poiStruct.setCoverItem(this.coverItem);
        if (this.address != null) {
            poiStruct.setAddress(this.address.toStickerPoiCard());
        }
        poiStruct.setDistance(this.distance);
        poiStruct.setIconType(Integer.valueOf(this.iconType));
        poiStruct.setPoiLongitude(this.poiLongitude);
        poiStruct.setPoiLatitude(this.poiLatitude);
        poiStruct.setCollectStatus(Integer.valueOf(this.collectStatus));
        poiStruct.setExpandType(Long.valueOf(this.expandType));
        poiStruct.setIconOnMap(this.iconOnMap);
        poiStruct.setIconOnEntry(this.iconOnEntry);
        poiStruct.setIconOnInfo(this.iconOnInfo);
        poiStruct.setPoiType(Long.valueOf(this.poiType));
        poiStruct.setPoiVoucher(this.poiVoucher);
        poiStruct.setPoiSubTitle(this.poiSubTitle);
        poiStruct.setPoiSubTitleType(Integer.valueOf(this.poiSubTitleType));
        if (this.poiCard != null) {
            poiStruct.setPoiCard(this.poiCard.toStickerPoiCard());
        }
        poiStruct.setPoiRating(Double.valueOf(this.poiRating));
        poiStruct.setPoiCost(Double.valueOf(this.poiCost));
        poiStruct.setPoiRankDesc(this.poiRankDesc);
        poiStruct.setPoiBusinessAreaName(this.poiBusinessAreaName);
        poiStruct.setPoiIsLocalCity(Boolean.valueOf(this.poiIsLocalCity));
        poiStruct.setPoiOptionName(this.poiOptionName);
        return poiStruct;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public boolean contains(String str) {
        return this.mArgs.containsKey(str);
    }

    public Object get(String str) {
        return this.mArgs.get(str);
    }

    public void fromStickerPoiStruct(com.p280ss.android.ugc.aweme.sticker.data.PoiStruct poiStruct) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        double d;
        boolean z;
        if (poiStruct != null) {
            this.poiId = poiStruct.getPoiId();
            this.poiName = poiStruct.getPoiName();
            this.typeCode = poiStruct.getTypeCode();
            boolean z2 = false;
            if (poiStruct.getUserCount() != null) {
                i = poiStruct.getUserCount().intValue();
            } else {
                i = 0;
            }
            this.userCount = i;
            if (poiStruct.getItemCount() != null) {
                i2 = poiStruct.getItemCount().intValue();
            } else {
                i2 = 0;
            }
            this.itemCount = i2;
            this.shareInfo = poiStruct.getShareInfo();
            this.coverHd = poiStruct.getCoverHd();
            this.coverLarge = poiStruct.getCoverLarge();
            this.coverMedium = poiStruct.getCoverMedium();
            this.coverThumb = poiStruct.getCoverThumb();
            this.coverItem = poiStruct.getCoverItem();
            if (poiStruct.getAddress() != null) {
                Address address2 = new Address();
                address2.fromStickerPoiStruct(poiStruct.getAddress());
                this.address = address2;
            }
            this.distance = poiStruct.getDistance();
            if (poiStruct.getIconType() != null) {
                i3 = poiStruct.getIconType().intValue();
            } else {
                i3 = 0;
            }
            this.iconType = i3;
            this.poiLongitude = poiStruct.getPoiLongitude();
            this.poiLatitude = poiStruct.getPoiLatitude();
            if (poiStruct.getCollectStatus() != null) {
                i4 = poiStruct.getCollectStatus().intValue();
            } else {
                i4 = 0;
            }
            this.collectStatus = i4;
            long j2 = 0;
            if (poiStruct.getExpandType() != null) {
                j = poiStruct.getExpandType().longValue();
            } else {
                j = 0;
            }
            this.expandType = j;
            this.iconOnMap = poiStruct.getIconOnMap();
            this.iconOnEntry = poiStruct.getIconOnEntry();
            this.iconOnInfo = poiStruct.getIconOnInfo();
            if (poiStruct.getPoiType() != null) {
                j2 = poiStruct.getPoiType().longValue();
            }
            this.poiType = j2;
            this.poiVoucher = poiStruct.getPoiVoucher();
            this.poiSubTitle = poiStruct.getPoiSubTitle();
            if (poiStruct.getPoiSubTitleType() != null) {
                i5 = poiStruct.getPoiSubTitleType().intValue();
            } else {
                i5 = 0;
            }
            this.poiSubTitleType = i5;
            if (poiStruct.getPoiCard() != null) {
                PoiCardStruct poiCardStruct = new PoiCardStruct();
                poiCardStruct.fromStickerPoiStruct(poiStruct.getPoiCard());
                this.poiCard = poiCardStruct;
            }
            double d2 = 0.0d;
            if (poiStruct.getPoiRating() != null) {
                d = poiStruct.getPoiRating().doubleValue();
            } else {
                d = 0.0d;
            }
            this.poiRating = d;
            if (poiStruct.getPoiCost() != null) {
                d2 = poiStruct.getPoiCost().doubleValue();
            }
            this.poiCost = d2;
            this.poiRankDesc = poiStruct.getPoiRankDesc();
            this.poiBusinessAreaName = poiStruct.getPoiBusinessAreaName();
            if (poiStruct.isPoiIsLocalCity() != null) {
                z = poiStruct.isPoiIsLocalCity().booleanValue();
            } else {
                z = false;
            }
            this.poiIsLocalCity = z;
            this.poiOptionName = poiStruct.getPoiOptionName();
            if (poiStruct.getCandidate() != null) {
                z2 = poiStruct.getCandidate().booleanValue();
            }
            this.isCandidate = z2;
        }
    }

    public void put(String str, Object obj) {
        this.mArgs.put(str, obj);
    }
}
