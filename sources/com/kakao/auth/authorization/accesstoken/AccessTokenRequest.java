package com.kakao.auth.authorization.accesstoken;

import android.net.Uri.Builder;
import com.C1642a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.kakao.auth.network.request.AuthRequest;
import com.kakao.network.IRequest;
import com.kakao.network.ServerProtocol;
import com.kakao.network.multipart.Part;
import com.kakao.util.IConfiguration;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessTokenRequest extends AuthRequest implements IRequest {
    private final String approvalType;
    private final String authCode;
    private final IConfiguration configuration;
    private final String refreshToken;

    public String getAuthCode() {
        return this.authCode;
    }

    public String getBodyEncoding() {
        return "UTF-8";
    }

    public String getMethod() {
        return "POST";
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    private boolean isAccessTokenRequestWithAuthCode() {
        if (this.authCode != null) {
            return true;
        }
        return false;
    }

    public List<Part> getMultiPartList() {
        return Collections.emptyList();
    }

    public String getUrl() {
        return new Builder().scheme(WebKitApi.SCHEME_HTTPS).authority(ServerProtocol.AUTH_AUTHORITY).path("oauth/token").build().toString();
    }

    public Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("KA", this.configuration.getKAHeader());
        if (!hashMap.containsKey("Content-Type")) {
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        }
        if (!hashMap.containsKey("Accept")) {
            hashMap.put("Accept", "*/*");
        }
        StringBuilder sb = new StringBuilder("KakaoAK ");
        sb.append(getAppKey());
        hashMap.put("Authorization", sb.toString());
        Map extraHeadersMap = getExtraHeadersMap();
        if (extraHeadersMap != null && !extraHeadersMap.isEmpty()) {
            for (String str : extraHeadersMap.keySet()) {
                String str2 = (String) extraHeadersMap.get(str);
                if (str2 != null) {
                    hashMap.put(str, str2);
                }
            }
        }
        return hashMap;
    }

    public Map<String, String> getParams() {
        HashMap hashMap = new HashMap();
        if (isAccessTokenRequestWithAuthCode()) {
            hashMap.put("grant_type", "authorization_code");
            hashMap.put("code", getAuthCode());
        } else {
            hashMap.put("grant_type", "refresh_token");
            hashMap.put("refresh_token", getRefreshToken());
        }
        hashMap.put("client_id", getAppKey());
        if (this.configuration.getClientSecret() != null) {
            hashMap.put("client_secret", this.configuration.getClientSecret());
        }
        hashMap.put("android_key_hash", this.configuration.getKeyHash());
        hashMap.put("redirect_uri", getRedirectURI());
        if (this.approvalType != null && this.approvalType.length() > 0) {
            hashMap.put("approval_type", this.approvalType);
        }
        Map extraParamsMap = getExtraParamsMap();
        if (extraParamsMap != null && !extraParamsMap.isEmpty()) {
            for (String str : extraParamsMap.keySet()) {
                String str2 = (String) extraParamsMap.get(str);
                if (str2 != null) {
                    hashMap.put(str, str2);
                }
            }
        }
        return hashMap;
    }

    public AccessTokenRequest(IConfiguration iConfiguration, String str, String str2, String str3) {
        super(iConfiguration.getAppKey(), C1642a.m8034a("%s%s%s", new Object[]{"kakao", iConfiguration.getAppKey(), "://oauth"}));
        this.configuration = iConfiguration;
        this.authCode = str;
        this.refreshToken = str2;
        this.approvalType = str3;
    }
}
