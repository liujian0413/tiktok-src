package com.kakao.usermgmt.request;

import android.net.Uri.Builder;
import com.kakao.auth.network.AuthorizedApiRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class SignupRequest extends AuthorizedApiRequest {
    private final JSONObject properties;

    public String getMethod() {
        return "POST";
    }

    public Builder getUriBuilder() {
        return super.getUriBuilder().path("v1/user/signup");
    }

    public Map<String, String> getParams() {
        HashMap hashMap = new HashMap();
        if (this.properties != null) {
            hashMap.put("properties", this.properties.toString());
        }
        return hashMap;
    }

    public SignupRequest(Map<String, String> map) {
        JSONObject jSONObject;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = null;
        }
        this.properties = jSONObject;
    }
}
