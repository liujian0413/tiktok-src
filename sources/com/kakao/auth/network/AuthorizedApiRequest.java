package com.kakao.auth.network;

import android.net.Uri.Builder;
import com.kakao.network.ApiRequest;
import com.kakao.network.ServerProtocol;
import com.kakao.network.multipart.Part;
import com.kakao.util.helper.Utility;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class AuthorizedApiRequest extends ApiRequest implements AuthorizedRequest {
    private String accessToken;

    protected AuthorizedApiRequest() {
    }

    public String getBodyEncoding() {
        return "UTF-8";
    }

    public abstract String getMethod();

    public List<Part> getMultiPartList() {
        return Collections.emptyList();
    }

    public Map<String, String> getParams() {
        return super.getParams();
    }

    public Builder getUriBuilder() {
        return super.getUriBuilder().authority(ServerProtocol.API_AUTHORITY);
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = super.getHeaders();
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(this.accessToken);
        headers.put("Authorization", sb.toString());
        return headers;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public static String createBaseURL(String str, String str2) {
        return Utility.buildUri(str, str2).toString();
    }
}
