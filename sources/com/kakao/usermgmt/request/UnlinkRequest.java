package com.kakao.usermgmt.request;

import android.net.Uri.Builder;
import com.kakao.auth.network.AuthorizedApiRequest;

public class UnlinkRequest extends AuthorizedApiRequest {
    public String getMethod() {
        return "POST";
    }

    public Builder getUriBuilder() {
        return super.getUriBuilder().path("v1/user/unlink");
    }
}
