package com.bytedance.webrtc;

public class ConfigMessage {
    private String data;
    private String from;
    private String mimeType;
    private String name;

    static native long nativeCreateConfigMessage(String str, String str2, String str3, String str4);

    public long getNativeMessage() {
        return nativeCreateConfigMessage(this.name, this.data, this.mimeType, this.from);
    }

    public static ConfigMessage createJsonMessage(String str, String str2, String str3) {
        return new ConfigMessage(str, str2, "application/json", str3);
    }

    public ConfigMessage(String str, String str2, String str3, String str4) {
        this.name = str;
        this.data = str2;
        this.mimeType = str3;
        this.from = str4;
    }
}
