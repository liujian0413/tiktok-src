package com.kakao.util;

import com.C1642a;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.exception.KakaoException.ErrorType;
import org.json.JSONObject;

public class RequestConfiguration implements IConfiguration {
    private String appKey;
    private String appVer;
    private String clientSecret;
    private JSONObject extras;
    private String kaHeader;
    private String keyHash;
    private String packageName;

    public String getAppKey() {
        return this.appKey;
    }

    public String getAppVer() {
        return this.appVer;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public JSONObject getExtrasJson() {
        return this.extras;
    }

    public String getKAHeader() {
        return this.kaHeader;
    }

    public String getKeyHash() {
        return this.keyHash;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getExtras() {
        if (this.extras == null) {
            return null;
        }
        return this.extras.toString();
    }

    public RequestConfiguration(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject) throws KakaoException {
        if (str == null || str.length() == 0) {
            throw new KakaoException(ErrorType.MISS_CONFIGURATION, C1642a.m8034a("need to declare %s in your AndroidManifest.xml", new Object[]{"com.kakao.sdk.AppKey"}));
        } else if (str3 == null || str3.length() == 0) {
            throw new KakaoException(ErrorType.MISS_CONFIGURATION, "Android key hash is null.");
        } else {
            this.appKey = str;
            this.clientSecret = str2;
            this.keyHash = str3;
            this.kaHeader = str4;
            this.appVer = str5;
            this.packageName = str6;
            this.extras = jSONObject;
        }
    }
}
