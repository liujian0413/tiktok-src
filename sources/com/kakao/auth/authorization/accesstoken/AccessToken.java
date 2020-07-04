package com.kakao.auth.authorization.accesstoken;

import com.kakao.auth.ISessionConfig;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.util.helper.PersistentKVStore;
import java.util.Date;

public interface AccessToken {

    public static class Factory {
        private static final Date ALREADY_EXPIRED_EXPIRATION_TIME;
        public static ResponseStringConverter<AccessToken> CONVERTER = new ResponseStringConverter<AccessToken>() {
            public final AccessToken convert(String str) throws ResponseBodyException {
                return Factory.createFromResponse(str);
            }
        };
        private static final Date MIN_DATE;
        private static AccessToken instance;

        public static AccessToken getInstance() {
            return instance;
        }

        public static AccessToken createEmptyToken() {
            Date date = ALREADY_EXPIRED_EXPIRATION_TIME;
            return new AccessTokenImpl("", "", date, date);
        }

        static {
            Date date = new Date(Long.MIN_VALUE);
            MIN_DATE = date;
            ALREADY_EXPIRED_EXPIRATION_TIME = date;
        }

        public static AccessToken createFromResponse(ResponseBody responseBody) throws ResponseBodyException {
            return new AccessTokenImpl(responseBody);
        }

        public static AccessToken createFromResponse(String str) {
            return new AccessTokenImpl(str);
        }

        public static AccessToken createFromCache(ISessionConfig iSessionConfig, PersistentKVStore persistentKVStore) {
            PersistentAccessToken persistentAccessToken = new PersistentAccessToken(null, persistentKVStore);
            boolean isSecureMode = iSessionConfig.isSecureMode();
            EncryptedAccessToken encryptedAccessToken = new EncryptedAccessToken(persistentAccessToken, null, isSecureMode, persistentKVStore);
            if ((isSecureMode || encryptedAccessToken.getLastSecureMode()) && com.kakao.auth.helper.Encryptor.Factory.getInstnace() != null) {
                encryptedAccessToken.setEncryptor(com.kakao.auth.helper.Encryptor.Factory.getInstnace());
                instance = new AccessTokenImpl((AccessToken) encryptedAccessToken);
            } else {
                instance = new AccessTokenImpl((AccessToken) persistentAccessToken);
            }
            return instance;
        }
    }

    Date accessTokenExpiresAt();

    void clearAccessToken();

    void clearRefreshToken();

    String getAccessToken();

    String getRefreshToken();

    int getRemainingExpireTime();

    boolean hasRefreshToken();

    boolean hasValidAccessToken();

    boolean hasValidRefreshToken();

    Date refreshTokenExpiresAt();

    void updateAccessToken(AccessToken accessToken);
}
