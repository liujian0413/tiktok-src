package com.p280ss.android.ugc.aweme.common;

import android.support.p022v4.util.Pools.SynchronizedPool;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.common.MobClick */
public class MobClick {
    private static final SynchronizedPool<MobClick> pool = new SynchronizedPool<>(5);
    private String category;
    private String eventName;
    private JSONObject ext_json;
    private long ext_value_long;
    private String ext_value_str;
    private String labelName;
    private String value;

    public String getCategory() {
        return this.category;
    }

    public String getEventName() {
        return this.eventName;
    }

    public JSONObject getExtJson() {
        return this.ext_json;
    }

    public long getExtValueLong() {
        return this.ext_value_long;
    }

    public String getExtValueStr() {
        return this.ext_value_str;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public String getValue() {
        if (TextUtils.isEmpty(this.value)) {
            this.value = "0";
        }
        return this.value;
    }

    public void recycle() {
        clearState();
        pool.release(this);
    }

    public static MobClick obtain() {
        MobClick mobClick = (MobClick) pool.acquire();
        if (mobClick != null) {
            return mobClick;
        }
        return new MobClick();
    }

    public void clearState() {
        this.eventName = null;
        this.labelName = null;
        this.value = null;
        this.ext_value_str = null;
        this.ext_value_long = 0;
        this.category = null;
        this.ext_json = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MobClick{eventName='");
        sb.append(this.eventName);
        sb.append('\'');
        sb.append(", labelName='");
        sb.append(this.labelName);
        sb.append('\'');
        sb.append(", value='");
        sb.append(this.value);
        sb.append('\'');
        sb.append(", ext_value_str='");
        sb.append(this.ext_value_str);
        sb.append('\'');
        sb.append(", ext_value_long=");
        sb.append(this.ext_value_long);
        sb.append(", category='");
        sb.append(this.category);
        sb.append('\'');
        sb.append(", ext_json=");
        sb.append(this.ext_json);
        sb.append('}');
        return sb.toString();
    }

    public MobClick setCategory(String str) {
        this.category = str;
        return this;
    }

    public MobClick setEventName(String str) {
        this.eventName = str;
        return this;
    }

    public MobClick setExtValueLong(long j) {
        this.ext_value_long = j;
        return this;
    }

    public MobClick setExtValueString(String str) {
        this.ext_value_str = str;
        return this;
    }

    public MobClick setJsonObject(JSONObject jSONObject) {
        this.ext_json = jSONObject;
        return this;
    }

    public MobClick setLabelName(String str) {
        this.labelName = str;
        return this;
    }

    public MobClick setValue(String str) {
        this.value = str;
        return this;
    }
}
