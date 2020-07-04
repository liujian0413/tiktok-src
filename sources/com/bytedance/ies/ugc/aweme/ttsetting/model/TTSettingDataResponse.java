package com.bytedance.ies.ugc.aweme.ttsetting.model;

import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

public final class TTSettingDataResponse {
    private TTSettingData ttSettingData;
    private JSONObject ttSettingDataJSONObject;

    public final TTSettingData getTtSettingData() {
        return this.ttSettingData;
    }

    public final JSONObject getTtSettingDataJSONObject() {
        return this.ttSettingDataJSONObject;
    }

    public final void setTtSettingData(TTSettingData tTSettingData) {
        this.ttSettingData = tTSettingData;
    }

    public final void setTtSettingDataJSONObject(JSONObject jSONObject) {
        this.ttSettingDataJSONObject = jSONObject;
    }

    public TTSettingDataResponse(TTSettingData tTSettingData, JSONObject jSONObject) {
        C7573i.m23587b(tTSettingData, "ttSettingData");
        C7573i.m23587b(jSONObject, "ttSettingDataJSONObject");
        this.ttSettingData = tTSettingData;
        this.ttSettingDataJSONObject = jSONObject;
    }
}
