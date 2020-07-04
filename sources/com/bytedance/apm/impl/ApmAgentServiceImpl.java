package com.bytedance.apm.impl;

import com.bytedance.apm.C6159b;
import com.bytedance.services.apm.api.IApmAgent;
import org.json.JSONObject;

public class ApmAgentServiceImpl implements IApmAgent {
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        C6159b.m19110a(str, jSONObject);
    }

    public void monitorExceptionLog(String str, JSONObject jSONObject) {
        C6159b.m19117b(str, jSONObject);
    }

    public void monitorLog(String str, JSONObject jSONObject) {
        C6159b.m19110a(str, jSONObject);
    }

    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C6159b.m19111a(str, jSONObject, jSONObject2);
    }

    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C6159b.m19102a(str, i, jSONObject);
    }

    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C6159b.m19112a(str, jSONObject, jSONObject2, jSONObject3);
    }

    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C6159b.m19103a(str, i, jSONObject, jSONObject2);
    }
}
