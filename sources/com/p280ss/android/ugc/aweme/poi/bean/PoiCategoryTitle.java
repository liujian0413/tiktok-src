package com.p280ss.android.ugc.aweme.poi.bean;

import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.bean.PoiCategoryTitle */
public class PoiCategoryTitle extends C34145b implements Serializable {
    public boolean isAweme;
    public boolean showMore;

    public int getFeedType() {
        return 65443;
    }

    public void setFeedType(int i) {
    }

    public PoiCategoryTitle(boolean z, boolean z2) {
        this.isAweme = z;
        this.showMore = z2;
    }
}
