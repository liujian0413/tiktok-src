package com.snapchat.kit.sdk.core.models;

import com.google.gson.C6600e;
import com.google.gson.p276a.C6591a;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.Objects;

public class AuthToken implements Serializable {
    @C6593c(mo15949a = "access_token")
    @C6591a
    private String mAccessToken;
    @C6593c(mo15949a = "expires_in")
    @C6591a
    private long mExpiresIn;
    @C6593c(mo15949a = "last_updated")
    @C6591a
    private long mLastUpdated;
    @C6593c(mo15949a = "refresh_token")
    @C6591a
    private String mRefreshToken;
    @C6593c(mo15949a = "scope")
    @C6591a
    private String mScope;
    @C6593c(mo15949a = "token_type")
    @C6591a
    private String mTokenType;

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public long getExpiresIn() {
        return this.mExpiresIn;
    }

    public long getLastUpdated() {
        return this.mLastUpdated;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public String getScope() {
        return this.mScope;
    }

    public String getTokenType() {
        return this.mTokenType;
    }

    public long getExpiresInMillis() {
        return this.mExpiresIn * 1000;
    }

    public String toString() {
        return toJson();
    }

    public String toJson() {
        return new C6600e().mo15979b((Object) this);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.mAccessToken, this.mTokenType, this.mRefreshToken, Long.valueOf(this.mExpiresIn), Long.valueOf(this.mLastUpdated)});
    }

    public void setLastUpdated(long j) {
        this.mLastUpdated = j;
    }

    public void setRefreshToken(String str) {
        this.mRefreshToken = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) obj;
        if (!Objects.equals(this.mAccessToken, authToken.mAccessToken) || !Objects.equals(this.mTokenType, authToken.mTokenType) || !Objects.equals(this.mRefreshToken, authToken.mRefreshToken) || !Objects.equals(Long.valueOf(this.mExpiresIn), Long.valueOf(authToken.mExpiresIn)) || !Objects.equals(Long.valueOf(this.mLastUpdated), Long.valueOf(authToken.mLastUpdated))) {
            return false;
        }
        return true;
    }

    public AuthToken(String str, String str2) {
        this.mAccessToken = str;
        this.mScope = str2;
    }
}
