package com.p280ss.android.ugc.aweme.poi.p335ui.publish;

import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.PoiStructInToolsLine */
public class PoiStructInToolsLine {
    private static final String TAG = "PoiStructInToolsLine";
    @C6593c(mo15949a = "mPoiRateId")
    public String mPoiRateId;
    @C6593c(mo15949a = "mPoiRatePrompt")
    public String mPoiRatePrompt;
    public PoiStruct poi;
    public PoiCouponActivityStruct poiActivity;
    public final int version = 1;

    public String getPoiId() {
        return this.poi.poiId;
    }

    public String getPoiName() {
        return this.poi.poiName;
    }

    public String toJson() {
        return C10944e.m32113a().mo15979b((Object) this);
    }

    public static String filter(String str) {
        PoiStructInToolsLine fromJson = fromJson(str);
        if (fromJson != null) {
            return fromJson.toJson();
        }
        return null;
    }

    public static PoiStructInToolsLine fromJson(String str) {
        try {
            return (PoiStructInToolsLine) C10944e.m32113a().mo15974a(str, PoiStructInToolsLine.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean hasPoiActivity(PoiStructInToolsLine poiStructInToolsLine) {
        if (poiStructInToolsLine == null || poiStructInToolsLine.poiActivity == null) {
            return false;
        }
        return true;
    }

    public static String filterForDraft(String str) {
        PoiStructInToolsLine fromJson = fromJson(str);
        if (hasPoiActivity(fromJson)) {
            fromJson.poiActivity = null;
            return fromJson.toJson();
        } else if (fromJson == null || fromJson.poi == null) {
            return null;
        } else {
            return str;
        }
    }
}
