package com.snapchat.kit.sdk.core.models;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.BuildConfig;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6591a;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.Objects;

public class AuthorizationRequest implements Serializable {
    @C6593c(mo15949a = "mClientId")
    @C6591a
    private String mClientId;
    @C6593c(mo15949a = "mCodeChallenge")
    @C6591a
    private String mCodeChallenge;
    @C6593c(mo15949a = "mCodeChallengeMethod")
    @C6591a
    private String mCodeChallengeMethod;
    @C6593c(mo15949a = "mCodeVerifier")
    @C6591a
    private String mCodeVerifier;
    @C6593c(mo15949a = "mRedirectUri")
    @C6591a
    private String mRedirectUri;
    @C6593c(mo15949a = "mResponseType")
    @C6591a
    private String mResponseType;
    @C6593c(mo15949a = "mScope")
    @C6591a
    private String mScope;
    @C6593c(mo15949a = "mState")
    @C6591a
    private String mState;

    public String getCodeVerifier() {
        return this.mCodeVerifier;
    }

    public String getRedirectUri() {
        return this.mRedirectUri;
    }

    public String getResponseType() {
        return this.mResponseType;
    }

    public String getState() {
        return this.mState;
    }

    public String toString() {
        return toJson();
    }

    public String toJson() {
        return new C6600e().mo15979b((Object) this);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.mResponseType, this.mClientId, this.mScope, this.mRedirectUri, this.mState, this.mCodeVerifier, this.mCodeChallengeMethod, this.mCodeChallenge});
    }

    public AuthorizationRequest withClientId(String str) {
        this.mClientId = str;
        return this;
    }

    public AuthorizationRequest withCodeChallenge(String str) {
        this.mCodeChallenge = str;
        return this;
    }

    public AuthorizationRequest withCodeChallengeMethod(String str) {
        this.mCodeChallengeMethod = str;
        return this;
    }

    public AuthorizationRequest withCodeVerifier(String str) {
        this.mCodeVerifier = str;
        return this;
    }

    public AuthorizationRequest withRedirectUri(String str) {
        this.mRedirectUri = str;
        return this;
    }

    public AuthorizationRequest withResponseType(String str) {
        this.mResponseType = str;
        return this;
    }

    public AuthorizationRequest withScope(String str) {
        this.mScope = str;
        return this;
    }

    public AuthorizationRequest withState(String str) {
        this.mState = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        if (!Objects.equals(this.mResponseType, authorizationRequest.mResponseType) || !Objects.equals(this.mClientId, authorizationRequest.mClientId) || !Objects.equals(this.mScope, authorizationRequest.mScope) || !Objects.equals(this.mRedirectUri, authorizationRequest.mRedirectUri) || !Objects.equals(this.mState, authorizationRequest.mState) || !Objects.equals(this.mCodeVerifier, authorizationRequest.mCodeVerifier) || !Objects.equals(this.mCodeChallengeMethod, authorizationRequest.mCodeChallengeMethod) || !Objects.equals(this.mCodeChallenge, authorizationRequest.mCodeChallenge)) {
            return false;
        }
        return true;
    }

    public Uri toUri(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            str = "https://accounts.snapchat.com/accounts";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Builder appendQueryParameter = Uri.parse(sb.toString()).buildUpon().appendQueryParameter("response_type", this.mResponseType).appendQueryParameter("client_id", this.mClientId).appendQueryParameter("redirect_uri", this.mRedirectUri).appendQueryParameter("scope", this.mScope).appendQueryParameter("state", this.mState).appendQueryParameter("code_challenge_method", this.mCodeChallengeMethod).appendQueryParameter("code_challenge", this.mCodeChallenge);
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("package_name", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            appendQueryParameter.appendQueryParameter("source", str4);
        }
        appendQueryParameter.appendQueryParameter("kit_version", BuildConfig.VERSION_NAME);
        appendQueryParameter.appendQueryParameter("link", this.mClientId);
        return appendQueryParameter.build();
    }
}
