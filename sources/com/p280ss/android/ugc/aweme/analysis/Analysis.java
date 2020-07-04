package com.p280ss.android.ugc.aweme.analysis;

import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.analysis.Analysis */
public class Analysis {
    private String category;
    private String eventName;
    private JSONObject ext_json;
    private long ext_value;
    private String labelName;
    private long value;

    public String getCategory() {
        return this.category;
    }

    public String getEventName() {
        return this.eventName;
    }

    public JSONObject getExt_json() {
        return this.ext_json;
    }

    public long getExt_value() {
        return this.ext_value;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public long getValue() {
        return this.value;
    }

    public Analysis setCategory(String str) {
        this.category = str;
        return this;
    }

    public Analysis setEventName(String str) {
        this.eventName = str;
        return this;
    }

    public Analysis setExt_json(JSONObject jSONObject) {
        this.ext_json = jSONObject;
        return this;
    }

    public Analysis setExt_value(long j) {
        this.ext_value = j;
        return this;
    }

    public Analysis setLabelName(String str) {
        this.labelName = str;
        return this;
    }

    public Analysis setValue(long j) {
        this.value = j;
        return this;
    }
}
