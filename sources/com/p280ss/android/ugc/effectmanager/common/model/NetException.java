package com.p280ss.android.ugc.effectmanager.common.model;

/* renamed from: com.ss.android.ugc.effectmanager.common.model.NetException */
public class NetException extends Exception {
    private Integer status_code;

    public Integer getStatus_code() {
        return this.status_code;
    }

    public void setStatus_code(Integer num) {
        this.status_code = num;
    }

    public NetException(Integer num, String str) {
        super(str);
        this.status_code = num;
    }
}
