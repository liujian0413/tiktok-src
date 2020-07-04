package com.kakao.auth.authorization.authcode;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.authorization.AuthorizationResult;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.util.IConfiguration;
import com.kakao.util.KakaoUtilService;
import com.kakao.util.helper.log.Logger;
import com.zhiliaoapp.musically.df_live_zego_link.R;

class TalkAuthCodeService implements AuthCodeService {
    protected IConfiguration appConfig;
    protected Context context;
    protected KakaoUtilService protocolService;
    protected String redirectUriString;
    protected ISessionConfig sessionConfig;

    public boolean isLoginAvailable() {
        if (createLoggedInActivityIntent(null) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isCapriProtocolMatched(Intent intent) {
        if (1 == intent.getIntExtra("com.kakao.sdk.talk.protocol.version", 0)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Intent createLoggedInActivityIntent(Bundle bundle) {
        int i;
        ApprovalType approvalType = this.sessionConfig.getApprovalType();
        Intent createIntent = createIntent("com.kakao.talk.intent.action.CAPRI_LOGGED_IN_ACTIVITY", this.appConfig.getAppKey(), this.redirectUriString, bundle);
        KakaoUtilService kakaoUtilService = this.protocolService;
        Context context2 = this.context;
        if (approvalType == ApprovalType.PROJECT) {
            i = 178;
        } else {
            i = 139;
        }
        return kakaoUtilService.resolveIntent(context2, createIntent, i);
    }

    /* access modifiers changed from: 0000 */
    public void startActivityForResult(StartActivityWrapper startActivityWrapper, Intent intent, int i) {
        if (startActivityWrapper != null) {
            startActivityWrapper.startActivityForResult(intent, i);
        }
    }

    public boolean requestAuthCode(AuthCodeRequest authCodeRequest, StartActivityWrapper startActivityWrapper, AuthCodeListener authCodeListener) {
        Intent createLoggedInActivityIntent = createLoggedInActivityIntent(authCodeRequest.getExtraParams());
        if (createLoggedInActivityIntent == null) {
            return false;
        }
        startActivityForResult(startActivityWrapper, createLoggedInActivityIntent, authCodeRequest.getRequestCode().intValue());
        return true;
    }

    /* access modifiers changed from: 0000 */
    public AuthorizationResult parseAuthCodeIntent(int i, int i2, Intent intent) {
        AuthorizationResult authorizationResult;
        if (intent == null || i2 == 0) {
            authorizationResult = AuthorizationResult.createAuthCodeCancelResult(this.context.getString(R.string.m6));
        } else if (isCapriProtocolMatched(intent)) {
            authorizationResult = AuthorizationResult.createAuthCodeOAuthErrorResult("TalkProtocol is mismatched during requesting auth code through KakaoTalk.");
        } else if (i2 != -1) {
            StringBuilder sb = new StringBuilder("got unexpected resultCode during requesting auth code. code=");
            sb.append(i);
            authorizationResult = AuthorizationResult.createAuthCodeOAuthErrorResult(sb.toString());
        } else {
            Bundle extras = intent.getExtras();
            String string = extras.getString("com.kakao.sdk.talk.error.type");
            String string2 = extras.getString("com.kakao.sdk.talk.redirectUrl");
            if (string != null || string2 == null || !string2.startsWith(this.redirectUriString)) {
                String string3 = extras.getString("com.kakao.sdk.talk.error.description");
                if (string == null || !string.equals("NotSupportError")) {
                    StringBuilder sb2 = new StringBuilder("redirectURL=");
                    sb2.append(string2);
                    sb2.append(", ");
                    sb2.append(string);
                    sb2.append(" : ");
                    sb2.append(string3);
                    return AuthorizationResult.createAuthCodeOAuthErrorResult(sb2.toString());
                }
                if (string3 != null) {
                    Logger.m60942i(string3, new Object[0]);
                }
                return AuthorizationResult.createAuthCodePassResult();
            }
            Uri parse = Uri.parse(string2);
            if (!TextUtils.isEmpty(parse.getQueryParameter("code"))) {
                return AuthorizationResult.createSuccessAuthCodeResult(string2);
            }
            String queryParameter = parse.getQueryParameter("error");
            String queryParameter2 = parse.getQueryParameter("error_description");
            if (queryParameter == null || !queryParameter.equalsIgnoreCase("access_denied")) {
                return AuthorizationResult.createAuthCodeOAuthErrorResult(queryParameter2);
            }
            return AuthorizationResult.createAuthCodeCancelResult(this.context.getString(R.string.m6));
        }
        return authorizationResult;
    }

    public boolean handleActivityResult(int i, int i2, Intent intent, AuthCodeListener authCodeListener) {
        AuthorizationResult parseAuthCodeIntent = parseAuthCodeIntent(i, i2, intent);
        if (parseAuthCodeIntent.isPass()) {
            return false;
        }
        authCodeListener.onAuthCodeReceived(i, parseAuthCodeIntent);
        return true;
    }

    TalkAuthCodeService(Context context2, IConfiguration iConfiguration, ISessionConfig iSessionConfig, KakaoUtilService kakaoUtilService) {
        this.context = context2;
        this.appConfig = iConfiguration;
        StringBuilder sb = new StringBuilder("kakao");
        sb.append(iConfiguration.getAppKey());
        sb.append("://oauth");
        this.redirectUriString = sb.toString();
        this.sessionConfig = iSessionConfig;
        this.protocolService = kakaoUtilService;
    }

    /* access modifiers changed from: protected */
    public Intent createIntent(String str, String str2, String str3, Bundle bundle) {
        Intent putExtra = new Intent().setAction(str).addCategory("android.intent.category.DEFAULT").putExtra("com.kakao.sdk.talk.protocol.version", 1).putExtra("com.kakao.sdk.talk.appKey", str2).putExtra("com.kakao.sdk.talk.redirectUri", str3).putExtra("com.kakao.sdk.talk.kaHeader", this.appConfig.getKAHeader());
        if (bundle != null && !bundle.isEmpty()) {
            putExtra.putExtra("com.kakao.sdk.talk.extraparams", bundle);
        }
        putExtra.addFlags(65536);
        return putExtra;
    }
}
