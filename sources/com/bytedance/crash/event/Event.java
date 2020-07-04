package com.bytedance.crash.event;

import android.os.Build;
import com.bytedance.crash.p504l.C9999s;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class Event implements Serializable {
    String access;
    String aid;
    String appVersion;
    String crashSummary;
    long crashTime;
    String crashType;
    String deviceId;
    String deviceModel = Build.MODEL;
    String errorInfo;
    String event;
    long eventTime;
    String eventType = "crash";
    String mccMnc;
    String osType = "Android";
    String osVersion;
    String sdkVersion;
    int state;
    String updateVersionCode;
    String uuid;

    public long getCrashTime() {
        return this.crashTime;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.crashType);
        sb.append("\t");
        sb.append(this.crashTime);
        sb.append("\t");
        sb.append(this.event);
        sb.append("\t");
        sb.append(this.state);
        sb.append("\t");
        sb.append(this.crashSummary);
        return sb.toString();
    }

    public Event clone() {
        Event event2 = new Event();
        event2.crashTime = this.crashTime;
        event2.eventTime = this.eventTime;
        event2.event = this.event;
        event2.eventType = this.eventType;
        event2.crashSummary = this.crashSummary;
        event2.crashType = this.crashType;
        event2.state = this.state;
        event2.errorInfo = this.errorInfo;
        event2.osType = this.osType;
        event2.osVersion = this.osVersion;
        event2.deviceModel = this.deviceModel;
        event2.appVersion = this.appVersion;
        event2.updateVersionCode = this.updateVersionCode;
        event2.sdkVersion = this.sdkVersion;
        event2.mccMnc = this.mccMnc;
        event2.access = this.access;
        event2.aid = this.aid;
        event2.deviceId = this.deviceId;
        return event2;
    }

    /* access modifiers changed from: 0000 */
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("crash_time", this.crashTime);
            jSONObject.put("event_time", this.eventTime);
            jSONObject.put("event", this.event);
            jSONObject.put("event_type", this.eventType);
            jSONObject.put("crash_summary", this.crashSummary);
            jSONObject.put("crash_type", this.crashType);
            jSONObject.put("state", this.state);
            jSONObject.put("error_info", this.errorInfo);
            jSONObject.put("os", this.osType);
            jSONObject.put("os_version", this.osVersion);
            jSONObject.put("device_model", this.deviceModel);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("update_version_code", this.updateVersionCode);
            jSONObject.put("sdk_version", this.sdkVersion);
            jSONObject.put("mcc_mnc", this.mccMnc);
            jSONObject.put("access", this.access);
            jSONObject.put("aid", this.aid);
            jSONObject.put("device_id", this.deviceId);
            jSONObject.put("uuid", this.uuid);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public Event crashTime(long j) {
        this.crashTime = j;
        return this;
    }

    public Event errorInfo(String str) {
        this.errorInfo = str;
        return this;
    }

    public Event eventType(String str) {
        this.event = str;
        return this;
    }

    public Event state(int i) {
        this.state = i;
        return this;
    }

    public Event errorInfo(Throwable th) {
        if (th != null) {
            this.errorInfo = C9999s.m29644a(th);
        }
        return this;
    }

    public Event errorInfo(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.errorInfo = jSONObject.toString();
        }
        return this;
    }
}
