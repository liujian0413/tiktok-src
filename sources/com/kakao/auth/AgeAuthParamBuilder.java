package com.kakao.auth;

import android.os.Bundle;
import android.text.TextUtils;
import com.kakao.auth.AuthService.AgeAuthLevel;
import com.kakao.auth.AuthService.AgeLimit;

public class AgeAuthParamBuilder {
    private AgeLimit ageLimit;
    private String authFrom;
    private AgeAuthLevel authLevel;
    private boolean isSkipTerms;
    private boolean isWesternAge;

    /* access modifiers changed from: 0000 */
    public String getAgeAuthRedirectUrl() {
        StringBuilder sb = new StringBuilder("kakao");
        sb.append(Session.getCurrentSession().getAppKey());
        sb.append("://ageauth");
        return sb.toString();
    }

    public Bundle build() {
        Bundle bundle = new Bundle();
        bundle.putString("token_type", "api");
        bundle.putString("access_token", Session.getCurrentSession().getTokenInfo().getAccessToken());
        bundle.putString("return_url", getAgeAuthRedirectUrl());
        if (this.authLevel != null) {
            bundle.putString("ageauth_level", this.authLevel.getValue());
        }
        if (this.ageLimit != null) {
            bundle.putString("age_limit", this.ageLimit.getValue());
        }
        if (this.isWesternAge) {
            bundle.putString("is_western_age", String.valueOf(this.isWesternAge));
        }
        if (this.isSkipTerms) {
            bundle.putString("skip_term", String.valueOf(this.isSkipTerms));
        }
        if (!TextUtils.isEmpty(this.authFrom)) {
            bundle.putString("auth_from", this.authFrom);
        }
        return bundle;
    }

    public AgeAuthParamBuilder setAgeLimit(AgeLimit ageLimit2) {
        this.ageLimit = ageLimit2;
        return this;
    }

    public AgeAuthParamBuilder setAuthFrom(String str) {
        this.authFrom = str;
        return this;
    }

    public AgeAuthParamBuilder setAuthLevel(AgeAuthLevel ageAuthLevel) {
        this.authLevel = ageAuthLevel;
        return this;
    }

    public AgeAuthParamBuilder setIsWesternAge(boolean z) {
        this.isWesternAge = z;
        return this;
    }

    public AgeAuthParamBuilder setSkipTerm(boolean z) {
        this.isSkipTerms = z;
        return this;
    }
}
