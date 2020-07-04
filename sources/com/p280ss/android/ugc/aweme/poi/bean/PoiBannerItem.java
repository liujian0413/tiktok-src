package com.p280ss.android.ugc.aweme.poi.bean;

import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.bean.PoiBannerItem */
public class PoiBannerItem extends C34145b implements Serializable {
    private List<PoiClassRankBannerStruct> poiClassRankBannerStructList;
    private String poiId;

    public List<PoiClassRankBannerStruct> getBanners() {
        return this.poiClassRankBannerStructList;
    }

    public int getFeedType() {
        return 65449;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public void setFeedType(int i) {
    }

    public int size() {
        if (this.poiClassRankBannerStructList != null) {
            return this.poiClassRankBannerStructList.size();
        }
        return 0;
    }

    public PoiBannerItem setPoiId(String str) {
        this.poiId = str;
        return this;
    }

    public PoiBannerItem(List<PoiClassRankBannerStruct> list) {
        this.poiClassRankBannerStructList = list;
    }
}
