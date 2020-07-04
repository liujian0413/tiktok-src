package com.p280ss.android.ugc.aweme.feed.model.poi;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23480h;
import com.p280ss.android.ugc.aweme.discover.model.Position;
import com.p280ss.android.ugc.aweme.discover.model.SearchPoiPosition;
import com.p280ss.android.ugc.aweme.poi.model.PoiAddress;
import com.p280ss.android.ugc.aweme.poi.model.PoiBackendType;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct */
public class SimplePoiInfoStruct implements C6866d, Serializable {
    @C6593c(mo15949a = "business_area_name")
    private String businessAreaName;
    @C6593c(mo15949a = "collect_count")
    private long collectCount;
    @C6593c(mo15949a = "collect_status")
    private long collectStatus;
    @C6593c(mo15949a = "cost")
    private double cost;
    @C6593c(mo15949a = "cover")
    private UrlModel cover;
    private int index;
    @C6593c(mo15949a = "latitude")
    private String latitude;
    @C6593c(mo15949a = "longitude")
    private String longitude;
    @C6593c(mo15949a = "option_name")
    private String optionName;
    @C6593c(mo15949a = "address_info")
    private PoiAddress poiAddress;
    @C6593c(mo15949a = "poi_backend_type")
    private PoiBackendType poiBackendType;
    @C6593c(mo15949a = "poi_id")
    private String poiId;
    @C6593c(mo15949a = "poi_name")
    private String poiName;
    @C6593c(mo15949a = "poi_rank_desc")
    private String poiRankDesc;
    private int poiSpuOverDate;
    private String poiSpuStatusDesc;
    @C6593c(mo15949a = "poi_voucher")
    private String poiVoucher;
    private List<SearchPoiPosition> position;
    @C6593c(mo15949a = "rank_score")
    private long rankScore;
    @C6593c(mo15949a = "rating")
    private double rating;
    private String requestId;
    @C6593c(mo15949a = "voucher_release_areas")
    List<String> voucherReleaseAreas;

    public String getBusinessAreaName() {
        return this.businessAreaName;
    }

    public long getCollectCount() {
        return this.collectCount;
    }

    public long getCollectStatus() {
        return this.collectStatus;
    }

    public double getCost() {
        return this.cost;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public int getIndex() {
        return this.index;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getOptionName() {
        return this.optionName;
    }

    public PoiAddress getPoiAddress() {
        return this.poiAddress;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getPoiRankDesc() {
        return this.poiRankDesc;
    }

    public String getPoiSpuStatusDesc() {
        return this.poiSpuStatusDesc;
    }

    public String getPoiVoucher() {
        return this.poiVoucher;
    }

    public List<SearchPoiPosition> getPosition() {
        return this.position;
    }

    public long getRankScore() {
        return this.rankScore;
    }

    public double getRating() {
        return this.rating;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public List<String> getVoucherReleaseAreas() {
        return this.voucherReleaseAreas;
    }

    public boolean isPoiSpuOverDate() {
        if (this.poiSpuOverDate == 1) {
            return true;
        }
        return false;
    }

    public String getCity() {
        if (this.poiAddress != null) {
            return this.poiAddress.city;
        }
        return "";
    }

    public String getCityCode() {
        if (this.poiAddress != null) {
            return this.poiAddress.cityCode;
        }
        return "";
    }

    public String getPoiBackEndTypeName() {
        if (this.poiBackendType != null) {
            return this.poiBackendType.getName();
        }
        return "";
    }

    public String getPoiBackendType() {
        if (this.poiBackendType != null) {
            return this.poiBackendType.getCode();
        }
        return "";
    }

    public int hashCode() {
        if (this.poiId != null) {
            return this.poiId.hashCode();
        }
        return 0;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.poiId)) {
            return true;
        }
        return false;
    }

    public List<Position> getPositionInAddress() {
        if (this.position == null) {
            return null;
        }
        for (SearchPoiPosition searchPoiPosition : this.position) {
            if (searchPoiPosition.isPoiAddress()) {
                return searchPoiPosition.position;
            }
        }
        return null;
    }

    public List<Position> getPositionInName() {
        if (this.position == null) {
            return null;
        }
        for (SearchPoiPosition searchPoiPosition : this.position) {
            if (searchPoiPosition.isPoiName()) {
                return searchPoiPosition.position;
            }
        }
        return null;
    }

    public void setBusinessAreaName(String str) {
        this.businessAreaName = str;
    }

    public void setCollectCount(long j) {
        this.collectCount = j;
    }

    public void setCollectStatus(long j) {
        this.collectStatus = j;
    }

    public void setCost(double d) {
        this.cost = d;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public SimplePoiInfoStruct setIndex(int i) {
        this.index = i;
        return this;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setOptionName(String str) {
        this.optionName = str;
    }

    public void setPoiAddress(PoiAddress poiAddress2) {
        this.poiAddress = poiAddress2;
    }

    public void setPoiBackendType(PoiBackendType poiBackendType2) {
        this.poiBackendType = poiBackendType2;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public void setPoiRankDesc(String str) {
        this.poiRankDesc = str;
    }

    public void setPoiSpuOverDate(int i) {
        this.poiSpuOverDate = i;
    }

    public void setPoiSpuStatusDesc(String str) {
        this.poiSpuStatusDesc = str;
    }

    public void setPoiVoucher(String str) {
        this.poiVoucher = str;
    }

    public void setPosition(List<SearchPoiPosition> list) {
        this.position = list;
    }

    public void setRankScore(long j) {
        this.rankScore = j;
    }

    public void setRating(double d) {
        this.rating = d;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setVoucherReleaseAreas(List<String> list) {
        this.voucherReleaseAreas = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimplePoiInfoStruct)) {
            return false;
        }
        return C23480h.m77087a(this.poiId, ((SimplePoiInfoStruct) obj).poiId);
    }
}
