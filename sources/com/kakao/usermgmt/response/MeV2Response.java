package com.kakao.usermgmt.response;

import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.usermgmt.response.model.UserAccount;
import com.kakao.util.OptionalBoolean;
import java.util.Map;
import org.json.JSONObject;

public class MeV2Response extends JSONObjectResponse {
    public static final ResponseStringConverter<MeV2Response> CONVERTER = new ResponseStringConverter<MeV2Response>() {
        public final MeV2Response convert(String str) throws ResponseBodyException {
            return new MeV2Response(str);
        }
    };
    private JSONObject forPartners;
    private OptionalBoolean hasSignedUp;

    /* renamed from: id */
    private Long f50114id;
    private UserAccount kakaoAccount;
    private String nickname;
    private String profileImagePath;
    private Map<String, String> properties;
    private String thumbnailImagePath;

    public JSONObject forPartners() {
        return this.forPartners;
    }

    public UserAccount getKakaoAccount() {
        return this.kakaoAccount;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getProfileImagePath() {
        return this.profileImagePath;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }

    public String getThumbnailImagePath() {
        return this.thumbnailImagePath;
    }

    public OptionalBoolean hasSignedUp() {
        return this.hasSignedUp;
    }

    public long getId() {
        return this.f50114id.longValue();
    }

    public String toString() {
        return getBody().toString();
    }

    MeV2Response(String str) {
        OptionalBoolean optionalBoolean;
        super(str);
        if (getBody().has("id")) {
            this.f50114id = Long.valueOf(getBody().getLong("id"));
        }
        if (getBody().has("has_signed_up")) {
            optionalBoolean = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(getBody().getBoolean("has_signed_up")));
        } else {
            optionalBoolean = OptionalBoolean.NONE;
        }
        this.hasSignedUp = optionalBoolean;
        if (getBody().has("properties")) {
            this.properties = ResponseBody.toMap(getBody().getBody("properties"));
            if (this.properties.containsKey("nickname")) {
                this.nickname = (String) this.properties.get("nickname");
            }
            if (this.properties.containsKey("thumbnail_image")) {
                this.thumbnailImagePath = (String) this.properties.get("thumbnail_image");
            }
            if (this.properties.containsKey("profile_image")) {
                this.profileImagePath = (String) this.properties.get("profile_image");
            }
        }
        if (getBody().has("kakao_account")) {
            this.kakaoAccount = new UserAccount(getBody().getBody("kakao_account"));
        }
        if (getBody().has("for_partner")) {
            this.forPartners = getBody().getBody("for_partner").getJson();
        }
    }
}
