package com.kakao.auth;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.authorization.accesstoken.AccessTokenManager;
import com.kakao.auth.authorization.authcode.AuthCodeManager;
import com.kakao.auth.authorization.authcode.AuthorizationCode;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.network.ErrorResult;
import com.kakao.util.IConfiguration;
import com.kakao.util.KakaoUtilService.Factory;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.exception.KakaoException.ErrorType;
import com.kakao.util.helper.SharedPreferencesCache;
import com.kakao.util.helper.SystemInfo;
import com.kakao.util.helper.log.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class Session implements ISession {
    private static Session currentSession;
    public final Object INSTANCE_LOCK = new Object();
    private AccessToken accessToken;
    private AccessTokenCallback accessTokenCallback;
    public AccessTokenManager accessTokenManager;
    private final PendingIntent alarmIntent;
    private final SharedPreferencesCache appCache;
    private AuthCodeCallback authCodeCallback;
    private AuthCodeManager authCodeManager;
    private AuthService authService;
    public AuthorizationCode authorizationCode;
    private final List<ISessionCallback> callbacks;
    private final IConfiguration configuration;
    private final Context context;
    public volatile RequestType requestType;
    private final AlarmManager tokenAlarmManager;

    enum RequestType {
        GETTING_AUTHORIZATION_CODE,
        GETTING_ACCESS_TOKEN,
        REFRESHING_ACCESS_TOKEN
    }

    public SharedPreferencesCache getAppCache() {
        return this.appCache;
    }

    /* access modifiers changed from: 0000 */
    public List<ISessionCallback> getCallbacks() {
        return this.callbacks;
    }

    /* access modifiers changed from: 0000 */
    public Context getContext() {
        return this.context;
    }

    public void close() {
        internalClose(null);
    }

    public void deregisterTokenManager() {
        this.tokenAlarmManager.cancel(this.alarmIntent);
    }

    public synchronized AccessTokenManager getAccessTokenManager() {
        return this.accessTokenManager;
    }

    public final String getAppKey() {
        return this.configuration.getAppKey();
    }

    public synchronized AuthCodeManager getAuthCodeManager() {
        return this.authCodeManager;
    }

    public boolean checkAndImplicitOpen() {
        if (isClosed() || !implicitOpen()) {
            return false;
        }
        return true;
    }

    public void clearCallbacks() {
        synchronized (this.callbacks) {
            this.callbacks.clear();
        }
    }

    public RequestType getRequestType() {
        RequestType requestType2;
        synchronized (this.INSTANCE_LOCK) {
            requestType2 = this.requestType;
        }
        return requestType2;
    }

    public final AccessToken getTokenInfo() {
        AccessToken accessToken2;
        synchronized (this.INSTANCE_LOCK) {
            accessToken2 = this.accessToken;
        }
        return accessToken2;
    }

    /* access modifiers changed from: 0000 */
    public synchronized boolean isRefreshingAccessToken() {
        boolean z;
        if (this.requestType == RequestType.REFRESHING_ACCESS_TOKEN) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public static synchronized Session getCurrentSession() {
        Session session;
        synchronized (Session.class) {
            if (currentSession != null) {
                session = currentSession;
            } else {
                throw new IllegalStateException("Session is not initialized. Call KakaoSDK#init first.");
            }
        }
        return session;
    }

    /* access modifiers changed from: 0000 */
    public void checkAccessTokenInfo() {
        if (isClosed()) {
            deregisterTokenManager();
        } else if (isOpenable()) {
            implicitOpen();
        } else {
            this.authService.requestAccessTokenInfo(new ApiResponseCallback<AccessTokenInfoResponse>() {
                public void onNotSignedUp() {
                }

                public void onSessionClosed(ErrorResult errorResult) {
                    Session.this.deregisterTokenManager();
                }

                public void onFailure(ErrorResult errorResult) {
                    Session.this.registerTokenManager(300000);
                }

                public void onSuccess(AccessTokenInfoResponse accessTokenInfoResponse) {
                    Session.this.registerTokenManager(Math.min(10800000, accessTokenInfoResponse.getExpiresInMillis()));
                }
            });
        }
    }

    public final String getAccessToken() {
        String str;
        synchronized (this.INSTANCE_LOCK) {
            if (this.accessToken == null) {
                str = null;
            } else {
                str = this.accessToken.getAccessToken();
            }
        }
        return str;
    }

    public AccessTokenCallback getAccessTokenCallback() {
        if (this.accessTokenCallback == null) {
            synchronized (Session.class) {
                if (this.accessTokenCallback == null) {
                    this.accessTokenCallback = new AccessTokenCallback() {
                        public void onAccessTokenFailure(ErrorResult errorResult) {
                            Session.this.onAccessTokenFailure(errorResult);
                        }

                        public void onAccessTokenReceived(AccessToken accessToken) {
                            Session.this.onAccessTokenReceived(accessToken);
                        }
                    };
                }
            }
        }
        return this.accessTokenCallback;
    }

    public AuthCodeCallback getAuthCodeCallback() {
        if (this.authCodeCallback == null) {
            synchronized (Session.class) {
                if (this.authCodeCallback == null) {
                    this.authCodeCallback = new AuthCodeCallback() {
                        public void onAuthCodeFailure(ErrorResult errorResult) {
                            Session.this.onAuthCodeFailure(errorResult);
                        }

                        public void onAuthCodeReceived(String str) {
                            Session.this.onAuthCodeReceived(str);
                        }
                    };
                }
            }
        }
        return this.authCodeCallback;
    }

    public final String getRefreshToken() {
        String str;
        synchronized (this.INSTANCE_LOCK) {
            if (this.accessToken == null) {
                str = null;
            } else {
                str = this.accessToken.getRefreshToken();
            }
        }
        return str;
    }

    public final boolean hasValidAccessToken() {
        boolean z;
        synchronized (this.INSTANCE_LOCK) {
            if (this.accessToken == null || !this.accessToken.hasValidAccessToken()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public boolean implicitOpen() {
        if (!getTokenInfo().hasValidRefreshToken()) {
            return false;
        }
        internalOpen(null, null, null);
        return true;
    }

    public void invalidateAccessToken() {
        synchronized (this.INSTANCE_LOCK) {
            this.accessToken.clearAccessToken();
            this.accessToken.clearRefreshToken();
        }
    }

    public boolean isAvailableOpenByRefreshToken() {
        if (isOpened() || getTokenInfo().hasValidRefreshToken()) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isClosed() {
        boolean z;
        if (isOpened() || isOpenable()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public final synchronized boolean isOpened() {
        boolean z;
        if (getTokenInfo() == null || !getTokenInfo().hasValidAccessToken()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public void removeAccessToken() {
        synchronized (this.INSTANCE_LOCK) {
            if (this.accessToken != null) {
                this.accessToken.clearAccessToken();
            }
        }
    }

    public void removeRefreshToken() {
        synchronized (this.INSTANCE_LOCK) {
            if (this.accessToken != null) {
                this.accessToken.clearRefreshToken();
            }
        }
    }

    public synchronized boolean isOpenable() {
        boolean z;
        if (getTokenInfo() == null || isOpened() || (!this.authorizationCode.hasAuthorizationCode() && !getTokenInfo().hasValidRefreshToken())) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public void openWithAuthCode(String str) {
        onAuthCodeReceived(str);
    }

    /* access modifiers changed from: 0000 */
    public void setAuthService(AuthService authService2) {
        this.authService = authService2;
    }

    private void updateAccessToken(AccessToken accessToken2) {
        synchronized (this.INSTANCE_LOCK) {
            getTokenInfo().updateAccessToken(accessToken2);
        }
    }

    public void onAuthCodeFailure(ErrorResult errorResult) {
        internalClose(wrapAsKakaoException(errorResult.getException()));
    }

    private boolean shouldCloseSession(ErrorResult errorResult) {
        if (errorResult.getHttpStatus() == 401 || errorResult.getHttpStatus() == 400) {
            return true;
        }
        return false;
    }

    private KakaoException wrapAsKakaoException(Exception exc) {
        if (exc == null) {
            return null;
        }
        if (exc instanceof KakaoException) {
            return (KakaoException) exc;
        }
        return new KakaoException((Throwable) exc);
    }

    public void addCallback(ISessionCallback iSessionCallback) {
        synchronized (this.callbacks) {
            if (iSessionCallback != null) {
                try {
                    if (!this.callbacks.contains(iSessionCallback)) {
                        this.callbacks.add(iSessionCallback);
                    }
                } finally {
                }
            }
        }
    }

    public void onAccessTokenReceived(AccessToken accessToken2) {
        postProcessAccessToken(accessToken2);
        for (ISessionCallback onSessionOpened : new ArrayList(this.callbacks)) {
            onSessionOpened.onSessionOpened();
        }
    }

    public void onAuthCodeReceived(String str) {
        if (str != null) {
            synchronized (this.INSTANCE_LOCK) {
                this.requestType = null;
                this.authorizationCode = new AuthorizationCode(str);
            }
            internalOpen(null, null, str);
        }
    }

    public void registerTokenManager(long j) {
        this.tokenAlarmManager.cancel(this.alarmIntent);
        try {
            this.tokenAlarmManager.setInexactRepeating(3, SystemClock.elapsedRealtime() + j, j, this.alarmIntent);
        } catch (Exception e) {
            Logger.m60956w("Failed to register automatic token refresh.", (Throwable) e);
        }
    }

    public void removeCallback(ISessionCallback iSessionCallback) {
        synchronized (this.callbacks) {
            if (iSessionCallback != null) {
                try {
                    this.callbacks.remove(iSessionCallback);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onAccessTokenFailure(ErrorResult errorResult) {
        if (shouldClearSessionState(errorResult)) {
            synchronized (this.INSTANCE_LOCK) {
                this.requestType = null;
            }
            for (ISessionCallback onSessionOpenFailed : new ArrayList(this.callbacks)) {
                onSessionOpenFailed.onSessionOpenFailed(new KakaoException(ErrorType.AUTHORIZATION_FAILED, errorResult.getErrorMessage()));
            }
        }
    }

    public void postProcessAccessToken(AccessToken accessToken2) {
        synchronized (this.INSTANCE_LOCK) {
            this.authorizationCode = AuthorizationCode.createEmptyCode();
            updateAccessToken(accessToken2);
            this.requestType = null;
        }
        registerTokenManager((long) Math.min(10800000, getTokenInfo().getRemainingExpireTime()));
    }

    public boolean shouldClearSessionState(ErrorResult errorResult) {
        KakaoException kakaoException = new KakaoException(ErrorType.AUTHORIZATION_FAILED, errorResult.getErrorMessage());
        if (this.requestType != null && this.requestType == RequestType.GETTING_ACCESS_TOKEN) {
            internalClose(kakaoException);
        } else if (this.requestType != RequestType.REFRESHING_ACCESS_TOKEN || !shouldCloseSession(errorResult)) {
            return true;
        } else {
            internalClose(kakaoException);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void internalClose(KakaoException kakaoException) {
        synchronized (this.INSTANCE_LOCK) {
            this.requestType = null;
            this.authorizationCode = AuthorizationCode.createEmptyCode();
            getTokenInfo().clearAccessToken();
            getTokenInfo().clearRefreshToken();
        }
        if (this.appCache != null) {
            this.appCache.clearAll();
        }
        try {
            deregisterTokenManager();
        } catch (Throwable th) {
            Logger.m60936e(th);
        }
        if (kakaoException != null) {
            for (ISessionCallback onSessionOpenFailed : new ArrayList(this.callbacks)) {
                onSessionOpenFailed.onSessionOpenFailed(kakaoException);
            }
        }
    }

    public Future<AccessToken> refreshAccessToken(final AccessTokenCallback accessTokenCallback2) {
        if (getTokenInfo() == null || !getTokenInfo().hasValidRefreshToken()) {
            KakaoException kakaoException = new KakaoException(ErrorType.ILLEGAL_STATE, "Refresh token has already expired. Logging user out.");
            internalClose(kakaoException);
            if (accessTokenCallback2 != null) {
                accessTokenCallback2.onAccessTokenFailure(new ErrorResult((Exception) kakaoException));
            }
            return null;
        }
        synchronized (this.INSTANCE_LOCK) {
            this.requestType = RequestType.REFRESHING_ACCESS_TOKEN;
        }
        return this.accessTokenManager.refreshAccessToken(getTokenInfo().getRefreshToken(), new AccessTokenCallback() {
            public void onAccessTokenReceived(AccessToken accessToken) {
                Session.this.postProcessAccessToken(accessToken);
                if (accessTokenCallback2 != null) {
                    accessTokenCallback2.onAccessTokenReceived(accessToken);
                }
            }

            public void onAccessTokenFailure(ErrorResult errorResult) {
                if (Session.this.shouldClearSessionState(errorResult)) {
                    synchronized (Session.this.INSTANCE_LOCK) {
                        Session.this.requestType = null;
                    }
                }
                if (accessTokenCallback2 != null) {
                    accessTokenCallback2.onAccessTokenFailure(errorResult);
                }
            }
        });
    }

    public void open(AuthType authType, Activity activity) {
        internalOpen(authType, new StartActivityWrapper(activity), null);
    }

    public void open(AuthType authType, Fragment fragment) {
        internalOpen(authType, new StartActivityWrapper(fragment), null);
    }

    public void open(AuthType authType, android.support.p022v4.app.Fragment fragment) {
        internalOpen(authType, new StartActivityWrapper(fragment), null);
    }

    static synchronized void initialize(Application application, ApprovalType approvalType) {
        synchronized (Session.class) {
            if (currentSession != null) {
                currentSession.clearCallbacks();
                currentSession.close();
            }
            SystemInfo.initialize(application.getApplicationContext());
            IConfiguration appConfiguration = Factory.getInstance().getAppConfiguration(application.getApplicationContext());
            ISessionConfig sessionConfig = KakaoSDK.getAdapter().getSessionConfig();
            Session session = new Session(application.getApplicationContext(), appConfiguration, sessionConfig, AuthCodeManager.Factory.initialize(application, appConfiguration, sessionConfig), AccessTokenManager.Factory.initialize(application.getApplicationContext(), approvalType));
            currentSession = session;
            session.setAuthService(AuthService.getInstance());
        }
    }

    private void requestAuthCode(AuthType authType, StartActivityWrapper startActivityWrapper) {
        if (startActivityWrapper.getActivity() != null) {
            this.authCodeManager.requestAuthCode(authType, startActivityWrapper.getActivity(), getAuthCodeCallback());
        } else if (startActivityWrapper.getSupportFragment() != null) {
            this.authCodeManager.requestAuthCode(authType, startActivityWrapper.getSupportFragment(), getAuthCodeCallback());
        } else if (startActivityWrapper.getFragment() != null) {
            this.authCodeManager.requestAuthCode(authType, startActivityWrapper.getFragment(), getAuthCodeCallback());
        } else {
            throw new IllegalArgumentException("You should provide activity or fragment to get Authorization code.");
        }
    }

    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (this.authCodeManager == null || !this.authCodeManager.handleActivityResult(i, i2, intent)) {
            return false;
        }
        return true;
    }

    public void updateScopes(Activity activity, List<String> list, AccessTokenCallback accessTokenCallback2) {
        updateScopes(new StartActivityWrapper(activity), list, accessTokenCallback2);
    }

    public void updateScopes(Fragment fragment, List<String> list, AccessTokenCallback accessTokenCallback2) {
        updateScopes(new StartActivityWrapper(fragment), list, accessTokenCallback2);
    }

    private void updateScopes(StartActivityWrapper startActivityWrapper, List<String> list, final AccessTokenCallback accessTokenCallback2) {
        if (getTokenInfo() == null || !getTokenInfo().hasValidRefreshToken()) {
            KakaoException kakaoException = new KakaoException(ErrorType.ILLEGAL_STATE, "Refresh token has already expired. Logging user out.");
            internalClose(kakaoException);
            if (accessTokenCallback2 != null) {
                accessTokenCallback2.onAccessTokenFailure(new ErrorResult((Exception) kakaoException));
            }
            return;
        }
        synchronized (this.INSTANCE_LOCK) {
            this.requestType = RequestType.GETTING_AUTHORIZATION_CODE;
        }
        this.authCodeManager.requestAuthCodeWithScopes(AuthType.KAKAO_ACCOUNT, startActivityWrapper, list, new AuthCodeCallback() {
            public void onAuthCodeFailure(ErrorResult errorResult) {
                synchronized (Session.this.INSTANCE_LOCK) {
                    Session.this.authorizationCode = AuthorizationCode.createEmptyCode();
                    Session.this.requestType = null;
                }
                if (accessTokenCallback2 != null) {
                    accessTokenCallback2.onAccessTokenFailure(errorResult);
                }
            }

            public void onAuthCodeReceived(String str) {
                synchronized (Session.this.INSTANCE_LOCK) {
                    Session.this.authorizationCode = new AuthorizationCode(str);
                    Session.this.requestType = RequestType.GETTING_ACCESS_TOKEN;
                }
                Session.this.accessTokenManager.requestAccessTokenByAuthCode(str, new AccessTokenCallback() {
                    public void onAccessTokenReceived(AccessToken accessToken) {
                        Session.this.postProcessAccessToken(accessToken);
                        if (accessTokenCallback2 != null) {
                            accessTokenCallback2.onAccessTokenReceived(accessToken);
                        }
                    }

                    public void onAccessTokenFailure(ErrorResult errorResult) {
                        synchronized (Session.this.INSTANCE_LOCK) {
                            Session.this.authorizationCode = AuthorizationCode.createEmptyCode();
                            Session.this.requestType = null;
                        }
                        if (accessTokenCallback2 != null) {
                            accessTokenCallback2.onAccessTokenFailure(errorResult);
                        }
                    }
                });
            }
        });
    }

    public void updateScopes(android.support.p022v4.app.Fragment fragment, List<String> list, AccessTokenCallback accessTokenCallback2) {
        updateScopes(new StartActivityWrapper(fragment), list, accessTokenCallback2);
    }

    private void internalOpen(AuthType authType, StartActivityWrapper startActivityWrapper, String str) {
        if (isOpened()) {
            for (ISessionCallback onSessionOpened : new ArrayList(this.callbacks)) {
                onSessionOpened.onSessionOpened();
            }
        } else if (getRequestType() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getRequestType());
            sb.append(" is still not finished. Just return.");
            Logger.m60955w(sb.toString());
        } else {
            try {
                synchronized (this.INSTANCE_LOCK) {
                    if (isClosed()) {
                        this.requestType = RequestType.GETTING_AUTHORIZATION_CODE;
                        requestAuthCode(authType, startActivityWrapper);
                    } else if (!isOpenable()) {
                        throw new KakaoException(ErrorType.AUTHORIZATION_FAILED, "current session state is not possible to open.");
                    } else if (str != null) {
                        this.requestType = RequestType.GETTING_ACCESS_TOKEN;
                        this.accessTokenManager.requestAccessTokenByAuthCode(str, getAccessTokenCallback());
                    } else {
                        this.requestType = RequestType.REFRESHING_ACCESS_TOKEN;
                        this.accessTokenManager.refreshAccessToken(getTokenInfo().getRefreshToken(), getAccessTokenCallback());
                    }
                }
            } catch (KakaoException e) {
                internalClose(e);
            }
        }
    }

    Session(Context context2, IConfiguration iConfiguration, ISessionConfig iSessionConfig, AuthCodeManager authCodeManager2, AccessTokenManager accessTokenManager2) {
        if (context2 != null) {
            this.context = context2;
            this.configuration = iConfiguration;
            this.appCache = new SharedPreferencesCache(context2, iConfiguration.getAppKey());
            synchronized (this.INSTANCE_LOCK) {
                this.authorizationCode = AuthorizationCode.createEmptyCode();
                this.accessToken = AccessToken.Factory.createFromCache(iSessionConfig, this.appCache);
            }
            this.authCodeManager = authCodeManager2;
            this.accessTokenManager = accessTokenManager2;
            this.callbacks = new ArrayList();
            this.tokenAlarmManager = (AlarmManager) context2.getSystemService("alarm");
            this.alarmIntent = PendingIntent.getBroadcast(context2, 0, new Intent(context2, TokenAlarmReceiver.class), 134217728);
            return;
        }
        throw new KakaoException(ErrorType.ILLEGAL_ARGUMENT, "cannot create Session without Context.");
    }
}
