package com.kakao.auth.network.request;

import android.net.Uri.Builder;
import com.kakao.auth.network.AuthorizedApiRequest;

public class AccessTokenInfoRequest extends AuthorizedApiRequest {
    public String getMethod() {
        return "GET";
    }

    public Builder getUriBuilder() {
        return super.getUriBuilder().path("v1/user/access_token_info");
    }
}
