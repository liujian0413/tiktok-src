package com.p280ss.android.ugc.aweme.poi.bean;

import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.bean.PoiCategoryMore */
public class PoiCategoryMore extends C34145b implements Serializable {
    public String aid = "";
    public boolean isAweme;
    public String relatedId;
    public boolean showDividerLine;
    public int targetPosition;

    public int getFeedType() {
        return 65444;
    }

    public void setFeedType(int i) {
    }

    public PoiCategoryMore(String str, boolean z, boolean z2) {
        this.relatedId = str;
        this.isAweme = z;
        this.showDividerLine = z2;
    }

    public PoiCategoryMore(String str, boolean z, int i, boolean z2) {
        this.relatedId = str;
        this.isAweme = z;
        this.targetPosition = i;
        this.showDividerLine = z2;
    }
}
