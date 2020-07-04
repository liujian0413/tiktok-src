package com.kakao.network;

import android.net.Uri.Builder;
import android.os.Build.VERSION;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.kakao.network.multipart.Part;
import com.kakao.util.IConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ApiRequest implements IRequest {
    private String appKey;
    private String appVer;
    private String extras;
    private String kaHeader;

    protected ApiRequest() {
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getAppVer() {
        return this.appVer;
    }

    public String getBodyEncoding() {
        return "UTF-8";
    }

    public String getExtras() {
        return this.extras;
    }

    public abstract String getMethod();

    public List<Part> getMultiPartList() {
        return new ArrayList();
    }

    public Map<String, String> getParams() {
        return new HashMap();
    }

    public Builder getUriBuilder() {
        return new Builder().scheme(WebKitApi.SCHEME_HTTPS);
    }

    public String getHttpUserAgentString() {
        StringBuilder sb = new StringBuilder("os/android-");
        sb.append(VERSION.SDK_INT);
        return sb.toString();
    }

    public String getUrl() {
        Builder uriBuilder = getUriBuilder();
        if (uriBuilder != null) {
            return uriBuilder.build().toString();
        }
        return "";
    }

    public Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("KA", this.kaHeader);
        if (!hashMap.containsKey("Content-Type")) {
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        }
        if (!hashMap.containsKey("Accept")) {
            hashMap.put("Accept", "*/*");
        }
        if (!hashMap.containsKey("User-Agent")) {
            hashMap.put("User-Agent", getHttpUserAgentString());
        }
        StringBuilder sb = new StringBuilder("KakaoAK ");
        sb.append(getAppKey());
        hashMap.put("Authorization", sb.toString());
        return hashMap;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setAppVer(String str) {
        this.appVer = str;
    }

    public void setExtras(String str) {
        this.extras = str;
    }

    public void setKaHeader(String str) {
        this.kaHeader = str;
    }

    protected ApiRequest(IConfiguration iConfiguration) {
        this.appKey = iConfiguration.getAppKey();
        this.kaHeader = iConfiguration.getKAHeader();
        this.extras = iConfiguration.getExtras();
        this.appVer = iConfiguration.getAppVer();
    }

    public void setConfiguration(IConfiguration iConfiguration) {
        setAppKey(iConfiguration.getAppKey());
        setKaHeader(iConfiguration.getKAHeader());
        setAppVer(iConfiguration.getAppVer());
        setExtras(iConfiguration.getExtras());
    }
}
