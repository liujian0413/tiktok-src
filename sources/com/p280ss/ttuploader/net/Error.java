package com.p280ss.ttuploader.net;

/* renamed from: com.ss.ttuploader.net.Error */
public class Error {
    int code;
    public String errStr;
    public String host;

    /* renamed from: id */
    public String f117551id;

    public Error(int i, String str, String str2) {
        this.code = i;
        this.host = str;
        this.f117551id = str2;
    }

    public Error(int i, String str, String str2, String str3) {
        this.code = i;
        this.host = str;
        this.f117551id = str2;
        this.errStr = str3;
    }
}
