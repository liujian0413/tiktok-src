package com.p1843tt.miniapp.model;

import org.json.JSONObject;

/* renamed from: com.tt.miniapp.model.RequestData */
public class RequestData {
    private String command;

    public String getCommand() {
        return this.command;
    }

    public String toJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", this.command);
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public RequestData(String str) {
        this.command = str;
    }
}
