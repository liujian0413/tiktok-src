package com.p280ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiBundle */
public class PoiBundle implements Serializable {
    public String activityId;
    public String authorId;
    public String awemeid;
    public String backendType;
    public String bannerId;
    public String challengeId;
    public String cityCode;
    public String clickMethod;
    public String contentSource;
    public String contentType;
    public String couponId;
    public int displayStyle;
    public String distanceInfo;
    public String districtCode;
    public HashMap<String, String> forwardTypeV3Params;
    public String from;
    public String fromPoiId;
    public boolean fromQrScan;
    public String fromUserId;
    public boolean hasActivity;
    public String isCoupon;
    public boolean isPreviewMode;
    public String logPb;
    public int order;
    public String pagePoiId;
    public String pageType;
    public String poiChannel;
    public String poiId;
    public String poiLabelType;
    public String poiName;
    public String poiType;
    public String previousPage;
    public String rankIndex;
    public String requestId;
    public String searchKeyWord;
    public String sticker;
    public String subClass;
    public String tabName;
    public String toUserId;

    public PoiBundle() {
    }

    public boolean hasActivity() {
        if (this.hasActivity || !TextUtils.isEmpty(this.sticker) || !TextUtils.isEmpty(this.challengeId)) {
            return true;
        }
        return false;
    }

    public PoiBundle(String str) {
        this.poiId = str;
    }
}
