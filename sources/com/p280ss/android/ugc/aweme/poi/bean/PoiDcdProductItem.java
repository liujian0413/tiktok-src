package com.p280ss.android.ugc.aweme.poi.bean;

import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.model.PoiProductInfo;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.bean.PoiDcdProductItem */
public class PoiDcdProductItem extends C34145b implements Serializable {
    public String poiId;
    public PoiProductInfo productInfo;

    public int getFeedType() {
        return 65448;
    }

    public void setFeedType(int i) {
    }

    public String getSpSource() {
        if (this.productInfo == null) {
            return "";
        }
        return this.productInfo.supplierSource;
    }

    public PoiDcdProductItem(PoiProductInfo poiProductInfo, String str) {
        this.productInfo = poiProductInfo;
        this.poiId = str;
    }
}
