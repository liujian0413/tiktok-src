package com.p280ss.android.ugc.aweme.poi.p335ui.publish;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct;
import com.p280ss.android.ugc.aweme.poi.utils.C35442b;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.PoiContext */
public class PoiContext implements Serializable {
    private static final int MAX_RECOMMEND_DISTANCE = 50;
    private static final String TAG = "PoiDraft";
    public PoiCouponActivityStruct mPoiActivity;
    public String mPoiRateId;
    public String mPoiRatePrompt;
    public String mSelectPoiId;
    public String mSelectPoiName;
    public String mShootPoiId;
    public double mShootPoiLat;
    public double mShootPoiLng;
    public String mShootPoiName;

    public void setLat(String str) {
        this.mShootPoiLat = safeParseDouble(str);
    }

    public void setLng(String str) {
        this.mShootPoiLng = safeParseDouble(str);
    }

    private double safeParseDouble(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static String serializeToStr(PoiContext poiContext) {
        if (poiContext == null) {
            return null;
        }
        return C10944e.m32113a().mo15979b((Object) poiContext);
    }

    public static String serializeForDraft(String str) {
        PoiContext unserializeFromJson = unserializeFromJson(str);
        if (unserializeFromJson == null) {
            return null;
        }
        if (unserializeFromJson.mPoiActivity != null) {
            unserializeFromJson.mPoiActivity = null;
        }
        return serializeToStr(unserializeFromJson);
    }

    public static PoiContext unserializeFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PoiStructInToolsLine fromJson = PoiStructInToolsLine.fromJson(str);
            if (fromJson == null) {
                return (PoiContext) C10944e.m32113a().mo15974a(str, PoiContext.class);
            }
            if (fromJson.poi != null && !TextUtils.isEmpty(fromJson.getPoiId())) {
                if (!TextUtils.isEmpty(fromJson.getPoiName())) {
                    PoiContext poiContext = new PoiContext();
                    if (PoiStructInToolsLine.hasPoiActivity(fromJson)) {
                        poiContext.mPoiActivity = fromJson.poiActivity;
                        poiContext.mShootPoiId = fromJson.getPoiId();
                        poiContext.mShootPoiName = fromJson.getPoiName();
                        poiContext.setLat(fromJson.poi.getPoiLatitude());
                        poiContext.setLng(fromJson.poi.getPoiLongitude());
                    } else {
                        poiContext.mSelectPoiId = fromJson.getPoiId();
                        poiContext.mSelectPoiName = fromJson.getPoiName();
                        poiContext.mPoiRateId = fromJson.mPoiRateId;
                        poiContext.mPoiRatePrompt = fromJson.mPoiRatePrompt;
                    }
                    return poiContext;
                }
            }
            return (PoiContext) C10944e.m32113a().mo15974a(str, PoiContext.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean hasRecommendPoi(String str, String str2) {
        double safeParseDouble = safeParseDouble(str);
        double safeParseDouble2 = safeParseDouble(str2);
        if (safeParseDouble == 0.0d || safeParseDouble2 == 0.0d || TextUtils.isEmpty(this.mShootPoiId) || TextUtils.isEmpty(this.mShootPoiName) || this.mShootPoiLat == 0.0d || this.mShootPoiLng == 0.0d || C35442b.m114465a(safeParseDouble, safeParseDouble2, this.mShootPoiLat, this.mShootPoiLng) > 50.0d) {
            return false;
        }
        return true;
    }
}
