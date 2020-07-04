package com.p280ss.android.common.applog;

/* renamed from: com.ss.android.common.applog.InternationalConfig */
public class InternationalConfig {
    private String googleId;
    private String language;
    private String region;

    public String getGoogleId() {
        return this.googleId;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getRegion() {
        return this.region;
    }

    public InternationalConfig(String str, String str2, String str3) {
        this.googleId = str;
        this.language = str2;
        this.region = str3;
    }
}
