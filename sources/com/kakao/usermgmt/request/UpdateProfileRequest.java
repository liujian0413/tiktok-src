package com.kakao.usermgmt.request;

import android.net.Uri.Builder;
import com.kakao.auth.network.AuthorizedApiRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class UpdateProfileRequest extends AuthorizedApiRequest {
    private final JSONObject properties;

    public String getMethod() {
        return "POST";
    }

    public Builder getUriBuilder() {
        return super.getUriBuilder().path("v1/user/update_profile");
    }

    public Map<String, String> getParams() {
        HashMap hashMap = new HashMap();
        if (this.properties != null) {
            hashMap.put("properties", this.properties.toString());
        }
        return hashMap;
    }

    public UpdateProfileRequest(Map map) {
        JSONObject jSONObject;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = null;
        }
        this.properties = jSONObject;
    }
}
