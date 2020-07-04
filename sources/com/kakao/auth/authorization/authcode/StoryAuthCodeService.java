package com.kakao.auth.authorization.authcode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.ISessionConfig;
import com.kakao.util.IConfiguration;
import com.kakao.util.KakaoUtilService;

class StoryAuthCodeService extends TalkAuthCodeService {
    public boolean isLoginAvailable() {
        if (createLoggedInActivityIntent(null) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Intent createLoggedInActivityIntent(Bundle bundle) {
        int i;
        Intent createIntent = createIntent("com.kakao.story.intent.action.CAPRI_LOGGED_IN_ACTIVITY", this.appConfig.getAppKey(), this.redirectUriString, bundle);
        KakaoUtilService kakaoUtilService = this.protocolService;
        Context context = this.context;
        if (this.sessionConfig.getApprovalType() == ApprovalType.PROJECT) {
            i = 99;
        } else {
            i = 80;
        }
        return kakaoUtilService.resolveIntent(context, createIntent, i);
    }

    StoryAuthCodeService(Context context, IConfiguration iConfiguration, ISessionConfig iSessionConfig, KakaoUtilService kakaoUtilService) {
        super(context, iConfiguration, iSessionConfig, kakaoUtilService);
    }

    public boolean handleActivityResult(int i, int i2, Intent intent, AuthCodeListener authCodeListener) {
        return super.handleActivityResult(i, i2, intent, authCodeListener);
    }
}
