package com.kakao.usermgmt.request;

import android.net.Uri.Builder;
import com.kakao.auth.network.AuthorizedApiRequest;
import java.util.List;
import org.json.JSONArray;

public class MeV2Request extends AuthorizedApiRequest {
    private final List<String> propertyKeyList;
    private final boolean secureResource;

    public String getMethod() {
        return "GET";
    }

    public Builder getUriBuilder() {
        Builder appendQueryParameter = super.getUriBuilder().path("v2/user/me").appendQueryParameter("secure_resource", String.valueOf(this.secureResource));
        if (this.propertyKeyList != null && this.propertyKeyList.size() > 0) {
            appendQueryParameter.appendQueryParameter("property_keys", new JSONArray(this.propertyKeyList).toString());
        }
        return appendQueryParameter;
    }

    public MeV2Request(List<String> list, boolean z) {
        this.propertyKeyList = list;
        this.secureResource = z;
    }
}
