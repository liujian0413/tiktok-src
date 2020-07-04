package com.kakao.auth.authorization.accesstoken;

import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.util.helper.Utility;
import java.util.Date;

class AccessTokenImpl extends JSONObjectResponse implements AccessToken {
    private static final Date DEFAULT_EXPIRATION_TIME;
    private static final Date MAX_DATE;
    private String accessToken;
    private Date accessTokenExpiresAt;
    private String refreshToken;
    private Date refreshTokenExpiresAt;
    private AccessToken tokenInfo;

    public Date accessTokenExpiresAt() {
        return this.accessTokenExpiresAt;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public Date refreshTokenExpiresAt() {
        return this.refreshTokenExpiresAt;
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
    }

    public boolean hasRefreshToken() {
        if (!Utility.isNullOrEmpty(this.refreshToken)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return getBody().toString();
    }

    public void clearAccessToken() {
        this.accessToken = null;
        this.accessTokenExpiresAt = DEFAULT_EXPIRATION_TIME;
        if (this.tokenInfo != null) {
            this.tokenInfo.clearAccessToken();
        }
    }

    public void clearRefreshToken() {
        this.refreshToken = null;
        this.refreshTokenExpiresAt = DEFAULT_EXPIRATION_TIME;
        if (this.tokenInfo != null) {
            this.tokenInfo.clearRefreshToken();
        }
    }

    public int getRemainedExpiresInAccessTokenTime() {
        if (this.accessTokenExpiresAt == null || !hasValidAccessToken()) {
            return 0;
        }
        return (int) (this.accessTokenExpiresAt.getTime() - new Date().getTime());
    }

    public int getRemainingExpireTime() {
        if (this.accessTokenExpiresAt == null || !hasValidAccessToken()) {
            return 0;
        }
        return (int) (this.accessTokenExpiresAt.getTime() - new Date().getTime());
    }

    public boolean hasValidAccessToken() {
        if (Utility.isNullOrEmpty(this.accessToken) || new Date().after(this.accessTokenExpiresAt)) {
            return false;
        }
        return true;
    }

    public boolean hasValidRefreshToken() {
        if (Utility.isNullOrEmpty(this.refreshToken) || (this.refreshTokenExpiresAt != null && new Date().after(this.refreshTokenExpiresAt))) {
            return false;
        }
        return true;
    }

    public AccessTokenImpl(ResponseBody responseBody) throws ResponseBodyException {
        this(responseBody.toString());
    }

    public AccessTokenImpl(AccessToken accessToken2) {
        this(accessToken2.getAccessToken(), accessToken2.getRefreshToken(), accessToken2.accessTokenExpiresAt(), accessToken2.refreshTokenExpiresAt());
        this.tokenInfo = accessToken2;
    }

    public void updateAccessToken(AccessToken accessToken2) {
        String refreshToken2 = accessToken2.getRefreshToken();
        if (refreshToken2 == null || refreshToken2.length() == 0) {
            this.accessToken = accessToken2.getAccessToken();
            this.accessTokenExpiresAt = accessToken2.accessTokenExpiresAt();
        } else {
            this.accessToken = accessToken2.getAccessToken();
            this.refreshToken = accessToken2.getRefreshToken();
            this.accessTokenExpiresAt = accessToken2.accessTokenExpiresAt();
            this.refreshTokenExpiresAt = accessToken2.refreshTokenExpiresAt();
        }
        if (this.tokenInfo != null) {
            this.tokenInfo.updateAccessToken(this);
        }
    }

    public AccessTokenImpl(String str) {
        super(str);
        if (getBody().has("access_token")) {
            this.accessToken = getBody().getString("access_token");
            this.accessTokenExpiresAt = new Date(new Date().getTime() + (getBody().getLong("expires_in") * 1000));
            if (getBody().has("refresh_token")) {
                this.refreshToken = getBody().getString("refresh_token");
            }
            if (getBody().has("refresh_token_expires_in")) {
                this.refreshTokenExpiresAt = new Date(new Date().getTime() + (getBody().getLong("refresh_token_expires_in") * 1000));
            } else {
                this.refreshTokenExpiresAt = MAX_DATE;
            }
        } else {
            throw new ResponseBodyException("No Search Element : access_token");
        }
    }

    public AccessTokenImpl(String str, String str2, Date date, Date date2) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.accessTokenExpiresAt = date;
        this.refreshTokenExpiresAt = date2;
    }
}
