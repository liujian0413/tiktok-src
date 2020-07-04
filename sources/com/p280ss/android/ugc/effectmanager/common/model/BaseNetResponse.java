package com.p280ss.android.ugc.effectmanager.common.model;

/* renamed from: com.ss.android.ugc.effectmanager.common.model.BaseNetResponse */
public class BaseNetResponse {
    public String message;
    public int status_code;

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseNetResponse{status_code=");
        sb.append(this.status_code);
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
