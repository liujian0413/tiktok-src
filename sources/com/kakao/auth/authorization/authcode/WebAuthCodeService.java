package com.kakao.auth.authorization.authcode;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.authorization.AuthorizationResult;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.network.ServerProtocol;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.Utility;
import com.kakao.util.helper.log.Logger;
import com.zhiliaoapp.musically.df_live_zego_link.R;

class WebAuthCodeService implements AuthCodeService {
    private Context context;
    private Handler handler;
    private ISessionConfig sessionConfig;

    public boolean handleActivityResult(int i, int i2, Intent intent, AuthCodeListener authCodeListener) {
        return false;
    }

    public boolean isLoginAvailable() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public Uri createAccountLoginUri(AuthCodeRequest authCodeRequest) {
        return new Builder().scheme(WebKitApi.SCHEME_HTTPS).authority(ServerProtocol.ACCOUNT_AUTHORITY).path("kakao_accounts/view/login").appendQueryParameter("continue", createScopeUpdateUri(authCodeRequest).toString()).build();
    }

    /* access modifiers changed from: 0000 */
    public Uri createScopeUpdateUri(AuthCodeRequest authCodeRequest) {
        Bundle bundle = new Bundle();
        bundle.putString("client_id", authCodeRequest.getAppKey());
        bundle.putString("redirect_uri", authCodeRequest.getRedirectURI());
        bundle.putString("response_type", "code");
        Bundle extraParams = authCodeRequest.getExtraParams();
        if (extraParams != null && !extraParams.isEmpty()) {
            for (String str : extraParams.keySet()) {
                String string = extraParams.getString(str);
                if (string != null) {
                    bundle.putString(str, string);
                }
            }
        }
        return Utility.buildUri(ServerProtocol.AUTH_AUTHORITY, "oauth/authorize", bundle);
    }

    /* access modifiers changed from: 0000 */
    public void startActivity(StartActivityWrapper startActivityWrapper, Intent intent) {
        startActivityWrapper.startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    public ResultReceiver getResultReceiver(final AuthCodeRequest authCodeRequest, final AuthCodeListener authCodeListener) {
        return new ResultReceiver(this.handler) {
            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                WebAuthCodeService.this.onReceivedResult(authCodeRequest.getRequestCode().intValue(), i, bundle, authCodeListener);
            }
        };
    }

    WebAuthCodeService(Context context2, Handler handler2, ISessionConfig iSessionConfig) {
        this.context = context2;
        this.handler = handler2;
        this.sessionConfig = iSessionConfig;
    }

    /* access modifiers changed from: 0000 */
    public Intent createAccountLoginIntent(Context context2, AuthCodeRequest authCodeRequest, AuthCodeListener authCodeListener) {
        return createAuthorizeIntentWithUri(context2, authCodeRequest, createAccountLoginUri(authCodeRequest), authCodeListener);
    }

    /* access modifiers changed from: 0000 */
    public Intent createScopeUpdateIntent(Context context2, AuthCodeRequest authCodeRequest, AuthCodeListener authCodeListener) {
        return createAuthorizeIntentWithUri(context2, authCodeRequest, createScopeUpdateUri(authCodeRequest), authCodeListener);
    }

    public boolean requestAuthCode(AuthCodeRequest authCodeRequest, StartActivityWrapper startActivityWrapper, AuthCodeListener authCodeListener) {
        Intent intent;
        try {
            if (authCodeRequest.getExtraHeaders().containsKey("RT")) {
                intent = createScopeUpdateIntent(startActivityWrapper.getContext(), authCodeRequest, authCodeListener);
            } else {
                intent = createAccountLoginIntent(startActivityWrapper.getContext(), authCodeRequest, authCodeListener);
            }
            startActivity(startActivityWrapper, intent);
            return true;
        } catch (Throwable th) {
            Logger.m60934e("WebViewAuthHandler is failed", th);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public Intent createAuthorizeIntentWithUri(Context context2, AuthCodeRequest authCodeRequest, Uri uri, AuthCodeListener authCodeListener) {
        Intent newIntent = KakaoWebViewActivity.newIntent(context2);
        newIntent.putExtra("key.url", uri.toString());
        newIntent.putExtra("key.extra.headers", authCodeRequest.getExtraHeaders());
        newIntent.putExtra("key.use.webview.timers", this.sessionConfig.isUsingWebviewTimer());
        newIntent.putExtra("key.result.receiver", getResultReceiver(authCodeRequest, authCodeListener));
        return newIntent;
    }

    /* access modifiers changed from: 0000 */
    public void onReceivedResult(int i, int i2, Bundle bundle, AuthCodeListener authCodeListener) {
        KakaoException kakaoException;
        String str = null;
        switch (i2) {
            case 0:
                str = bundle.getString("key.redirect.url");
                kakaoException = null;
                break;
            case 1:
                kakaoException = (KakaoException) bundle.getSerializable("key.exception");
                break;
            default:
                kakaoException = null;
                break;
        }
        onWebViewCompleted(i, str, kakaoException, authCodeListener);
    }

    /* access modifiers changed from: 0000 */
    public void onWebViewCompleted(int i, String str, KakaoException kakaoException, AuthCodeListener authCodeListener) {
        AuthorizationResult authorizationResult;
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (!TextUtils.isEmpty(parse.getQueryParameter("code"))) {
                authCodeListener.onAuthCodeReceived(i, AuthorizationResult.createSuccessAuthCodeResult(str));
                return;
            }
            String queryParameter = parse.getQueryParameter("error");
            String queryParameter2 = parse.getQueryParameter("error_description");
            if (queryParameter == null || !queryParameter.equalsIgnoreCase("access_denied")) {
                authorizationResult = AuthorizationResult.createAuthCodeOAuthErrorResult(queryParameter2);
            } else {
                authorizationResult = AuthorizationResult.createAuthCodeCancelResult(this.context.getString(R.string.m6));
            }
        } else if (kakaoException == null) {
            authorizationResult = AuthorizationResult.createAuthCodeOAuthErrorResult("Failed to get Authorization Code.");
        } else if (kakaoException.isCancledOperation()) {
            authorizationResult = AuthorizationResult.createAuthCodeCancelResult(kakaoException.getMessage());
        } else {
            authorizationResult = AuthorizationResult.createAuthCodeOAuthErrorResult((Exception) kakaoException);
        }
        authCodeListener.onAuthCodeReceived(i, authorizationResult);
    }
}
