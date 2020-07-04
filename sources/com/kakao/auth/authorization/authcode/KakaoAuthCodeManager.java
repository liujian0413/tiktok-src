package com.kakao.auth.authorization.authcode;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.AuthCodeCallback;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.Session;
import com.kakao.auth.authorization.AuthorizationResult;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.util.IConfiguration;
import com.kakao.util.helper.log.Logger;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class KakaoAuthCodeManager implements AuthCodeListener, AuthCodeManager {
    private IConfiguration appConfig;
    private final Queue<AuthCodeService> authCodeManagers = new LinkedList();
    private AuthCodeRequest currentRequest;
    private AuthCodeService kakaoManager;
    private final int requestCode = 1001;
    private final ISessionConfig sessionConfig;
    private StartActivityWrapper startActivityWrapper;
    private AuthCodeService storyManager;
    private AuthCodeService webManager;

    public boolean isStoryLoginAvailable() {
        return this.storyManager.isLoginAvailable();
    }

    public boolean isTalkLoginAvailable() {
        return this.kakaoManager.isLoginAvailable();
    }

    /* access modifiers changed from: 0000 */
    public String getRefreshToken() {
        try {
            return Session.getCurrentSession().getTokenInfo().getRefreshToken();
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public String getScopesString(List<String> list) {
        String str = null;
        if (list == null) {
            return null;
        }
        StringBuilder sb = null;
        for (String str2 : list) {
            if (sb != null) {
                sb.append(",");
            } else {
                sb = new StringBuilder();
            }
            sb.append(str2);
        }
        if (sb != null) {
            str = sb.toString();
        }
        return str;
    }

    private void addToAuthCodeServicesQueue(AuthType authType) {
        if (authType == null) {
            authType = AuthType.KAKAO_TALK;
        }
        switch (authType) {
            case KAKAO_TALK:
            case KAKAO_TALK_EXCLUDE_NATIVE_LOGIN:
            case KAKAO_TALK_ONLY:
                this.authCodeManagers.add(this.kakaoManager);
                break;
            case KAKAO_STORY:
                this.authCodeManagers.add(this.storyManager);
                break;
            case KAKAO_LOGIN_ALL:
                this.authCodeManagers.add(this.kakaoManager);
                this.authCodeManagers.add(this.storyManager);
                break;
        }
        if (authType != AuthType.KAKAO_TALK_ONLY) {
            this.authCodeManagers.add(this.webManager);
        }
    }

    /* access modifiers changed from: 0000 */
    public void tryNextAuthCodeService(AuthCodeRequest authCodeRequest) {
        AuthCodeCallback callback = authCodeRequest.getCallback();
        while (true) {
            AuthCodeService authCodeService = (AuthCodeService) this.authCodeManagers.peek();
            if (authCodeService != null) {
                StringBuilder sb = new StringBuilder("trying ");
                sb.append(authCodeService.getClass().getSimpleName());
                Logger.m60925d(sb.toString());
                if (!authCodeService.requestAuthCode(authCodeRequest, this.startActivityWrapper, this)) {
                    this.authCodeManagers.poll();
                } else {
                    return;
                }
            } else {
                if (callback != null) {
                    onAuthCodeReceived(authCodeRequest.getRequestCode().intValue(), AuthorizationResult.createAuthCodeOAuthErrorResult("Failed to get Authorization Code."));
                }
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public AuthCodeRequest createAuthCodeRequest(String str, AuthCodeCallback authCodeCallback) {
        ApprovalType approvalType;
        StringBuilder sb = new StringBuilder("kakao");
        sb.append(str);
        sb.append("://oauth");
        AuthCodeRequest authCodeRequest = new AuthCodeRequest(str, sb.toString(), Integer.valueOf(1001), authCodeCallback);
        String str2 = "approval_type";
        if (this.sessionConfig.getApprovalType() == null) {
            approvalType = ApprovalType.INDIVIDUAL;
        } else {
            approvalType = this.sessionConfig.getApprovalType();
        }
        authCodeRequest.putExtraParam(str2, approvalType.toString());
        return authCodeRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAuthCodeReceived(int r6, com.kakao.auth.authorization.AuthorizationResult r7) {
        /*
            r5 = this;
            com.kakao.auth.authorization.authcode.AuthCodeRequest r6 = r5.currentRequest
            if (r6 != 0) goto L_0x000a
            java.lang.String r6 = "Current auth code request has already finished."
            com.kakao.util.helper.log.Logger.m60955w(r6)
            return
        L_0x000a:
            com.kakao.auth.authorization.authcode.AuthCodeRequest r6 = r5.currentRequest
            com.kakao.auth.AuthCodeCallback r6 = r6.getCallback()
            if (r6 != 0) goto L_0x0018
            java.lang.String r6 = "Callback has not been set for this auth code request. Just return."
            com.kakao.util.helper.log.Logger.m60955w(r6)
            return
        L_0x0018:
            r0 = 0
            if (r7 != 0) goto L_0x0028
            com.kakao.util.exception.KakaoException r7 = new com.kakao.util.exception.KakaoException
            com.kakao.util.exception.KakaoException$ErrorType r1 = com.kakao.util.exception.KakaoException.ErrorType.AUTHORIZATION_FAILED
            java.lang.String r2 = "the result of authorization code request is null."
            r7.<init>(r1, r2)
        L_0x0024:
            r1 = r7
        L_0x0025:
            r7 = r0
            goto L_0x009c
        L_0x0028:
            boolean r1 = r7.isCanceled()
            if (r1 == 0) goto L_0x003a
            com.kakao.util.exception.KakaoException r1 = new com.kakao.util.exception.KakaoException
            com.kakao.util.exception.KakaoException$ErrorType r2 = com.kakao.util.exception.KakaoException.ErrorType.CANCELED_OPERATION
            java.lang.String r7 = r7.getResultMessage()
            r1.<init>(r2, r7)
            goto L_0x0025
        L_0x003a:
            boolean r1 = r7.isAuthError()
            if (r1 != 0) goto L_0x0090
            boolean r1 = r7.isError()
            if (r1 == 0) goto L_0x0047
            goto L_0x0090
        L_0x0047:
            java.lang.String r1 = r7.getRedirectURL()
            if (r1 == 0) goto L_0x0073
            com.kakao.auth.authorization.authcode.AuthCodeRequest r2 = r5.currentRequest
            java.lang.String r2 = r2.getRedirectURI()
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0073
            android.net.Uri r7 = r7.getRedirectUri()
            com.kakao.auth.authorization.authcode.AuthorizationCode r7 = com.kakao.auth.authorization.authcode.AuthorizationCode.createFromRedirectedUri(r7)
            boolean r1 = r7.hasAuthorizationCode()
            if (r1 != 0) goto L_0x0071
            com.kakao.util.exception.KakaoException r7 = new com.kakao.util.exception.KakaoException
            com.kakao.util.exception.KakaoException$ErrorType r1 = com.kakao.util.exception.KakaoException.ErrorType.AUTHORIZATION_FAILED
            java.lang.String r2 = "the result of authorization code request does not have authorization code."
            r7.<init>(r1, r2)
            goto L_0x0024
        L_0x0071:
            r1 = r0
            goto L_0x009c
        L_0x0073:
            com.kakao.util.helper.log.Logger.m60933e(r1)
            com.kakao.util.exception.KakaoException r1 = new com.kakao.util.exception.KakaoException
            com.kakao.util.exception.KakaoException$ErrorType r2 = com.kakao.util.exception.KakaoException.ErrorType.AUTHORIZATION_FAILED
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "the result of authorization code request mismatched the registered redirect uri. msg = "
            r3.<init>(r4)
            java.lang.String r7 = r7.getResultMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r1.<init>(r2, r7)
            goto L_0x0025
        L_0x0090:
            com.kakao.util.exception.KakaoException r1 = new com.kakao.util.exception.KakaoException
            com.kakao.util.exception.KakaoException$ErrorType r2 = com.kakao.util.exception.KakaoException.ErrorType.AUTHORIZATION_FAILED
            java.lang.String r7 = r7.getResultMessage()
            r1.<init>(r2, r7)
            goto L_0x0025
        L_0x009c:
            r5.currentRequest = r0
            java.util.Queue<com.kakao.auth.authorization.authcode.AuthCodeService> r0 = r5.authCodeManagers
            r0.clear()
            if (r1 == 0) goto L_0x00ae
            com.kakao.network.ErrorResult r7 = new com.kakao.network.ErrorResult
            r7.<init>(r1)
            r6.onAuthCodeFailure(r7)
            return
        L_0x00ae:
            java.lang.String r7 = r7.getAuthorizationCode()
            r6.onAuthCodeReceived(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.auth.authorization.authcode.KakaoAuthCodeManager.onAuthCodeReceived(int, com.kakao.auth.authorization.AuthorizationResult):void");
    }

    public void requestAuthCode(AuthType authType, Activity activity, AuthCodeCallback authCodeCallback) {
        requestAuthCode(authType, new StartActivityWrapper(activity), authCodeCallback);
    }

    /* access modifiers changed from: 0000 */
    public void startTryingAuthCodeServices(AuthType authType, AuthCodeRequest authCodeRequest, StartActivityWrapper startActivityWrapper2) {
        addToAuthCodeServicesQueue(authType);
        this.currentRequest = authCodeRequest;
        this.startActivityWrapper = startActivityWrapper2;
        tryNextAuthCodeService(authCodeRequest);
    }

    public void requestAuthCode(AuthType authType, Fragment fragment, AuthCodeCallback authCodeCallback) {
        requestAuthCode(authType, new StartActivityWrapper(fragment), authCodeCallback);
    }

    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (this.currentRequest == null) {
            Logger.m60955w("Auth code was not requested or the request has already been processed.");
            return false;
        }
        AuthCodeService authCodeService = (AuthCodeService) this.authCodeManagers.poll();
        if (authCodeService == null || !authCodeService.handleActivityResult(i, i2, intent, this)) {
            tryNextAuthCodeService(this.currentRequest);
        }
        return true;
    }

    public void requestAuthCode(AuthType authType, android.support.p022v4.app.Fragment fragment, AuthCodeCallback authCodeCallback) {
        requestAuthCode(authType, new StartActivityWrapper(fragment), authCodeCallback);
    }

    public void requestAuthCode(AuthType authType, StartActivityWrapper startActivityWrapper2, AuthCodeCallback authCodeCallback) {
        startTryingAuthCodeServices(authType, createAuthCodeRequest(this.appConfig.getAppKey(), authCodeCallback), startActivityWrapper2);
    }

    public void requestAuthCodeWithScopes(AuthType authType, StartActivityWrapper startActivityWrapper2, List<String> list, AuthCodeCallback authCodeCallback) {
        startTryingAuthCodeServices(authType, createAuthCodeRequest(this.appConfig.getAppKey(), getRefreshToken(), list, authCodeCallback), startActivityWrapper2);
    }

    /* access modifiers changed from: 0000 */
    public AuthCodeRequest createAuthCodeRequest(String str, String str2, List<String> list, AuthCodeCallback authCodeCallback) {
        ApprovalType approvalType;
        StringBuilder sb = new StringBuilder("kakao");
        sb.append(str);
        sb.append("://oauth");
        AuthCodeRequest authCodeRequest = new AuthCodeRequest(str, sb.toString(), Integer.valueOf(1001), authCodeCallback);
        authCodeRequest.putExtraHeader("RT", str2);
        authCodeRequest.putExtraParam("scope", getScopesString(list));
        String str3 = "approval_type";
        if (this.sessionConfig.getApprovalType() == null) {
            approvalType = ApprovalType.INDIVIDUAL;
        } else {
            approvalType = this.sessionConfig.getApprovalType();
        }
        authCodeRequest.putExtraParam(str3, approvalType.toString());
        return authCodeRequest;
    }

    KakaoAuthCodeManager(IConfiguration iConfiguration, ISessionConfig iSessionConfig, AuthCodeService authCodeService, AuthCodeService authCodeService2, AuthCodeService authCodeService3) {
        this.appConfig = iConfiguration;
        this.sessionConfig = iSessionConfig;
        this.kakaoManager = authCodeService;
        this.storyManager = authCodeService2;
        this.webManager = authCodeService3;
    }
}
