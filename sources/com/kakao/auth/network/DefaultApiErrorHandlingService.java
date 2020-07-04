package com.kakao.auth.network;

import android.os.Bundle;
import com.kakao.auth.AuthCodeCallback;
import com.kakao.auth.AuthService.AgeAuthStatus;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISession;
import com.kakao.auth.ageauth.AgeAuthService;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.helper.CurrentActivityProvider;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.auth.network.response.InsufficientScopeException;
import com.kakao.network.ErrorResult;
import com.kakao.network.response.ApiResponseStatusError;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.util.helper.log.Logger;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

class DefaultApiErrorHandlingService implements ApiErrorHandlingService {
    private CurrentActivityProvider activityProvider;
    private AgeAuthService ageAuthService;
    private ISession session;

    static class ScopeAuthCodeCallback extends AuthCodeCallback {
        private final AtomicReference<String> authCodeResult;
        private final AtomicReference<Exception> exception;
        private final CountDownLatch lock;

        public void onAuthCodeFailure(ErrorResult errorResult) {
            this.exception.set(errorResult.getException());
            this.lock.countDown();
        }

        public void onAuthCodeReceived(String str) {
            this.authCodeResult.set(str);
            this.lock.countDown();
        }

        ScopeAuthCodeCallback(AtomicReference<String> atomicReference, CountDownLatch countDownLatch, AtomicReference<Exception> atomicReference2) {
            this.authCodeResult = atomicReference;
            this.lock = countDownLatch;
            this.exception = atomicReference2;
        }
    }

    DefaultApiErrorHandlingService() {
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldRetryAfterAgeAuth() {
        int requestAgeAuth = this.ageAuthService.requestAgeAuth(new Bundle(), this.activityProvider.getCurrentActivity(), true);
        if (requestAgeAuth == AgeAuthStatus.SUCCESS.getValue() || requestAgeAuth == AgeAuthStatus.ALREADY_AGE_AUTHORIZED.getValue()) {
            return true;
        }
        return false;
    }

    public boolean shouldRetryAfterTryingRefreshToken() {
        if (!this.session.getTokenInfo().hasValidRefreshToken()) {
            return false;
        }
        try {
            AccessToken accessToken = (AccessToken) this.session.refreshAccessToken(null).get();
            if (accessToken == null || !accessToken.hasValidAccessToken()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void setActivityProvider(CurrentActivityProvider currentActivityProvider) {
        this.activityProvider = currentActivityProvider;
    }

    public void setAgeAuthService(AgeAuthService ageAuthService2) {
        this.ageAuthService = ageAuthService2;
    }

    public void setSession(ISession iSession) {
        this.session = iSession;
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldRetryAfterScopesUpdate(ResponseBody responseBody) throws InsufficientScopeException {
        List list;
        if (responseBody.has("required_scopes")) {
            try {
                list = ResponseStringConverter.IDENTITY_CONVERTER.convertList(responseBody.getJSONArray("required_scopes"));
            } catch (ResponseBodyException unused) {
                throw new InsufficientScopeException(responseBody.toString());
            }
        } else {
            list = null;
        }
        try {
            return ((AccessToken) requestScopesUpdate(AuthType.KAKAO_ACCOUNT, list).get()).hasValidAccessToken();
        } catch (InterruptedException | ExecutionException e) {
            throw new InsufficientScopeException(e.getMessage());
        }
    }

    public boolean shouldRetryWithApiError(ApiResponseStatusError apiResponseStatusError) {
        int errorCode = apiResponseStatusError.getErrorCode();
        if (errorCode == -405) {
            return shouldRetryAfterAgeAuth();
        }
        switch (errorCode) {
            case -402:
                return shouldRetryAfterScopesUpdate(apiResponseStatusError.getErrorResponse());
            case -401:
                return shouldRetryAfterTryingRefreshToken();
            default:
                return false;
        }
    }

    public Future<AccessToken> requestScopesUpdate(AuthType authType, List<String> list) throws RuntimeException {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.session.getAuthCodeManager().requestAuthCodeWithScopes(authType, new StartActivityWrapper(this.activityProvider.getCurrentActivity()), list, new ScopeAuthCodeCallback(atomicReference, countDownLatch, atomicReference2));
        } catch (Exception e) {
            Logger.m60933e(e.toString());
            atomicReference2.set(e);
            countDownLatch.countDown();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            atomicReference2.set(e2);
            Logger.m60933e(e2.toString());
        }
        if (atomicReference2.get() == null) {
            String str = (String) atomicReference.get();
            if (str != null) {
                try {
                    return this.session.getAccessTokenManager().requestAccessTokenByAuthCode(str, this.session.getAccessTokenCallback());
                } catch (Exception e3) {
                    Logger.m60936e((Throwable) e3);
                    throw new InsufficientScopeException(e3.toString());
                }
            } else {
                Logger.m60933e("auth code null");
                throw new InsufficientScopeException("Failed to get authorization code while requesting dynamic scope update.");
            }
        } else {
            throw new InsufficientScopeException(((Exception) atomicReference2.get()).toString());
        }
    }
}
