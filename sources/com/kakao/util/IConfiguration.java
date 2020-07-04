package com.kakao.util;

import android.content.Context;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.SystemInfo;
import com.kakao.util.helper.Utility;
import org.json.JSONException;
import org.json.JSONObject;

public interface IConfiguration {

    public static class Factory {
        public static IConfiguration createConfiguration(Context context) throws KakaoException {
            return createConfiguration(context, Utility.getMetadata(context, "com.kakao.sdk.AppKey"));
        }

        public static IConfiguration createConfiguration(Context context, String str) throws KakaoException {
            SystemInfo.initialize(context);
            String metadata = Utility.getMetadata(context, "com.kakao.sdk.ClientSecret");
            String keyHash = Utility.getKeyHash(context);
            String kAHeader = SystemInfo.getKAHeader();
            String valueOf = String.valueOf(Utility.getAppVersion(context));
            String packageName = context.getPackageName();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appPkg", context.getPackageName());
                jSONObject.put("KA", kAHeader);
                jSONObject.put("keyHash", keyHash);
                RequestConfiguration requestConfiguration = new RequestConfiguration(str, metadata, keyHash, kAHeader, valueOf, packageName, jSONObject);
                return requestConfiguration;
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("JSON parsing error. Malformed parameters were provided. Detailed error message: ");
                sb.append(e.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    String getAppKey();

    String getAppVer();

    String getClientSecret();

    String getExtras();

    JSONObject getExtrasJson();

    String getKAHeader();

    String getKeyHash();

    String getPackageName();
}
