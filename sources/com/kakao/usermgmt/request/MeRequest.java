package com.kakao.usermgmt.request;

import android.net.Uri.Builder;
import com.kakao.auth.network.AuthorizedApiRequest;
import java.util.List;
import org.json.JSONArray;

public class MeRequest extends AuthorizedApiRequest {
    private final List<String> propertyKeyList;
    private final boolean secureResource;

    public String getMethod() {
        return "GET";
    }

    public Builder getUriBuilder() {
        Builder appendQueryParameter = super.getUriBuilder().path("v1/user/me").appendQueryParameter("secure_resource", String.valueOf(this.secureResource));
        if (this.propertyKeyList != null && this.propertyKeyList.size() > 0) {
            appendQueryParameter.appendQueryParameter("propertyKeys", new JSONArray(this.propertyKeyList).toString());
        }
        return appendQueryParameter;
    }

    public MeRequest(List<String> list, boolean z) {
        this.propertyKeyList = list;
        this.secureResource = z;
    }
}
