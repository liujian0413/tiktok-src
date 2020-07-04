package com.kakao.usermgmt.request;

import android.net.Uri.Builder;
import com.kakao.auth.network.AuthorizedApiRequest;
import java.util.List;
import org.json.JSONArray;

public class AgeAuthRequest extends AuthorizedApiRequest {
    private final String ageLimit;
    private final List<String> propertyKeyList;

    public String getMethod() {
        return "GET";
    }

    public Builder getUriBuilder() {
        Builder uriBuilder = super.getUriBuilder();
        uriBuilder.path("v1/user/age_auth");
        if (this.ageLimit != null && this.ageLimit.length() > 0) {
            uriBuilder.appendQueryParameter("age_limit", this.ageLimit);
        }
        if (this.propertyKeyList != null && this.propertyKeyList.size() > 0) {
            uriBuilder.appendQueryParameter("property_keys", new JSONArray(this.propertyKeyList).toString());
        }
        return uriBuilder;
    }

    public AgeAuthRequest(String str, List<String> list) {
        this.ageLimit = str;
        this.propertyKeyList = list;
    }
}
