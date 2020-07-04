package com.kakao.auth.authorization.accesstoken;

import android.os.Bundle;
import com.kakao.auth.helper.Encryptor;
import com.kakao.util.helper.PersistentKVStore;
import java.util.Date;

class EncryptedAccessToken implements AccessToken {
    private PersistentKVStore cache;
    private boolean currentSecureMode;
    private Encryptor encryptor;
    private AccessToken tokenInfo;

    public Date accessTokenExpiresAt() {
        return this.tokenInfo.accessTokenExpiresAt();
    }

    public void clearAccessToken() {
        this.tokenInfo.clearAccessToken();
    }

    public void clearRefreshToken() {
        this.tokenInfo.clearRefreshToken();
    }

    public int getRemainingExpireTime() {
        return this.tokenInfo.getRemainingExpireTime();
    }

    public Date refreshTokenExpiresAt() {
        return this.tokenInfo.refreshTokenExpiresAt();
    }

    /* access modifiers changed from: 0000 */
    public boolean needsDecryption() {
        if (!getLastSecureMode() || this.currentSecureMode) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean needsEncryption() {
        if (getLastSecureMode() || !this.currentSecureMode) {
            return false;
        }
        return true;
    }

    public String getAccessToken() {
        String accessToken = this.tokenInfo.getAccessToken();
        String str = null;
        if (accessToken == null) {
            return null;
        }
        try {
            if (this.currentSecureMode) {
                accessToken = decryptToken(accessToken);
            }
            str = accessToken;
        } catch (Exception unused) {
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    public boolean getLastSecureMode() {
        String string = this.cache.getString("com.kakao.token.KakaoSecureMode");
        if (string == null || !string.equals("true")) {
            return false;
        }
        return true;
    }

    public String getRefreshToken() {
        String refreshToken = this.tokenInfo.getRefreshToken();
        String str = null;
        if (refreshToken == null) {
            return null;
        }
        try {
            if (this.currentSecureMode) {
                refreshToken = decryptToken(refreshToken);
            }
            str = refreshToken;
        } catch (Exception unused) {
        }
        return str;
    }

    public boolean hasRefreshToken() {
        if (!this.tokenInfo.hasRefreshToken() || getRefreshToken() == null) {
            return false;
        }
        return true;
    }

    public boolean hasValidAccessToken() {
        if (!this.tokenInfo.hasValidAccessToken() || getAccessToken() == null) {
            return false;
        }
        return true;
    }

    public boolean hasValidRefreshToken() {
        if (!this.tokenInfo.hasValidRefreshToken() || getRefreshToken() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void initAccessToken() {
        AccessToken accessToken;
        if (this.tokenInfo != null) {
            if (needsEncryption()) {
                accessToken = processAccessToken(true, this.tokenInfo);
            } else if (needsDecryption()) {
                accessToken = processAccessToken(false, this.tokenInfo);
            } else {
                accessToken = null;
            }
            if (accessToken != null) {
                this.tokenInfo.updateAccessToken(accessToken);
            }
        }
        setLastSecureMode(this.currentSecureMode);
    }

    /* access modifiers changed from: 0000 */
    public void setEncryptor(Encryptor encryptor2) {
        this.encryptor = encryptor2;
        initAccessToken();
    }

    public String decryptToken(String str) {
        try {
            return this.encryptor.decrypt(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public String encryptToken(String str) {
        try {
            return this.encryptor.encrypt(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setLastSecureMode(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("com.kakao.token.KakaoSecureMode", String.valueOf(z));
        this.cache.save(bundle);
    }

    public void updateAccessToken(AccessToken accessToken) {
        if (this.currentSecureMode) {
            accessToken = processAccessToken(true, accessToken);
        }
        if (this.tokenInfo != null) {
            this.tokenInfo.updateAccessToken(accessToken);
        }
        setLastSecureMode(this.currentSecureMode);
    }

    private AccessToken processAccessToken(final boolean z, final AccessToken accessToken) {
        return new AccessToken() {
            public void clearAccessToken() {
            }

            public void clearRefreshToken() {
            }

            public int getRemainingExpireTime() {
                return 0;
            }

            public boolean hasRefreshToken() {
                return false;
            }

            public boolean hasValidAccessToken() {
                return false;
            }

            public boolean hasValidRefreshToken() {
                return false;
            }

            public void updateAccessToken(AccessToken accessToken) {
            }

            public Date accessTokenExpiresAt() {
                return accessToken.accessTokenExpiresAt();
            }

            public Date refreshTokenExpiresAt() {
                return accessToken.refreshTokenExpiresAt();
            }

            public String getAccessToken() {
                if (z) {
                    return EncryptedAccessToken.this.encryptToken(accessToken.getAccessToken());
                }
                return EncryptedAccessToken.this.decryptToken(accessToken.getAccessToken());
            }

            public String getRefreshToken() {
                if (z) {
                    return EncryptedAccessToken.this.encryptToken(accessToken.getRefreshToken());
                }
                return EncryptedAccessToken.this.decryptToken(accessToken.getRefreshToken());
            }
        };
    }

    EncryptedAccessToken(AccessToken accessToken, Encryptor encryptor2, boolean z, PersistentKVStore persistentKVStore) {
        this.tokenInfo = accessToken;
        this.encryptor = encryptor2;
        this.currentSecureMode = z;
        this.cache = persistentKVStore;
        if (encryptor2 != null) {
            initAccessToken();
        }
    }
}
