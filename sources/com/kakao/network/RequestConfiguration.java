package com.kakao.network;

import android.content.Context;
import com.kakao.util.IConfiguration;
import com.kakao.util.IConfiguration.Factory;
import com.kakao.util.helper.SystemInfo;
import org.json.JSONException;
import org.json.JSONObject;

public class RequestConfiguration implements IConfiguration {
    private static RequestConfiguration configuration;
    private IConfiguration appConfig;
    private String extras;

    public String getExtras() {
        return this.extras;
    }

    public String getAppKey() {
        return this.appConfig.getAppKey();
    }

    public String getAppVer() {
        return this.appConfig.getAppVer();
    }

    public String getClientSecret() {
        return configuration.getClientSecret();
    }

    public JSONObject getExtrasJson() {
        throw new UnsupportedOperationException("This method is not implemented in this class. Use com.kakao.util.RequestConfiguration instead.");
    }

    public String getKAHeader() {
        return this.appConfig.getKAHeader();
    }

    public String getKeyHash() {
        return this.appConfig.getKeyHash();
    }

    public String getPackageName() {
        return this.appConfig.getPackageName();
    }

    public static RequestConfiguration createRequestConfiguration(Context context) {
        if (configuration != null) {
            return configuration;
        }
        IConfiguration createConfiguration = Factory.createConfiguration(context);
        SystemInfo.initialize(context);
        String kAHeader = SystemInfo.getKAHeader();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appPkg", context.getPackageName());
            jSONObject.put("KA", kAHeader);
            jSONObject.put("keyHash", createConfiguration.getKeyHash());
            RequestConfiguration requestConfiguration = new RequestConfiguration(createConfiguration, kAHeader, jSONObject.toString());
            configuration = requestConfiguration;
            return requestConfiguration;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("JSON parsing error. Malformed parameters were provided. Detailed error message: ");
            sb.append(e.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public RequestConfiguration(IConfiguration iConfiguration, String str, String str2) {
        this.appConfig = iConfiguration;
        this.extras = str2;
    }
}
