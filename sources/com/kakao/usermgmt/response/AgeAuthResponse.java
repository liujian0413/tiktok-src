package com.kakao.usermgmt.response;

import com.kakao.auth.AuthService.AgeAuthLevel;
import com.kakao.network.response.ApiResponseStatusError;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.network.response.ResponseStringConverter;

public class AgeAuthResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<AgeAuthResponse> CONVERTER = new ResponseStringConverter<AgeAuthResponse>() {
        public final AgeAuthResponse convert(String str) throws ResponseBodyException, ApiResponseStatusError {
            return new AgeAuthResponse(str);
        }
    };
    private final AgeAuthLimitStatus ageAuthLimitStatus;
    private final AgeAuthLevel authLevel = AgeAuthLevel.convertByName(getBody().optString("auth_level", ""));
    private final int authLevelCode = getBody().optInt("auth_level_code", 0);
    private final String authenticatedAt = getBody().optString("authenticated_at", null);

    /* renamed from: ci */
    private final String f50113ci = getBody().optString("ci", null);
    private final long userId = getBody().getLong("id");

    public enum AgeAuthLimitStatus {
        DONT_KNOW,
        BYPASS_AGE_LIMIT,
        DONT_BYPASS_AGE_LIMIT
    }

    public AgeAuthLimitStatus getAgeAuthLimitStatus() {
        return this.ageAuthLimitStatus;
    }

    public AgeAuthLevel getAuthLevel() {
        return this.authLevel;
    }

    public int getAuthLevelCode() {
        return this.authLevelCode;
    }

    public String getAuthenticatedAt() {
        return this.authenticatedAt;
    }

    public String getCI() {
        return this.f50113ci;
    }

    public long getUserId() {
        return this.userId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AgeAuthResponse{userId=");
        sb.append(this.userId);
        sb.append(", authenticatedAt='");
        sb.append(this.authenticatedAt);
        sb.append('\'');
        sb.append(", ci='");
        sb.append(this.f50113ci);
        sb.append('\'');
        sb.append(", authLevel=");
        sb.append(this.authLevel);
        sb.append(", authLevelCode=");
        sb.append(this.authLevelCode);
        sb.append(", ageAuthLimitStatus=");
        sb.append(this.ageAuthLimitStatus);
        sb.append('}');
        return sb.toString();
    }

    public AgeAuthResponse(String str) {
        AgeAuthLimitStatus ageAuthLimitStatus2;
        super(str);
        if (getBody().has("bypass_age_limit")) {
            if (getBody().getBoolean("bypass_age_limit")) {
                ageAuthLimitStatus2 = AgeAuthLimitStatus.BYPASS_AGE_LIMIT;
            } else {
                ageAuthLimitStatus2 = AgeAuthLimitStatus.DONT_BYPASS_AGE_LIMIT;
            }
            this.ageAuthLimitStatus = ageAuthLimitStatus2;
            return;
        }
        this.ageAuthLimitStatus = AgeAuthLimitStatus.DONT_KNOW;
    }
}
