package com.kakao.auth.callback;

import com.kakao.auth.AuthService.AgeAuthStatus;
import com.kakao.network.ErrorResult;
import com.kakao.network.callback.ResponseCallback;

public abstract class AccountResponseCallback extends ResponseCallback<Integer> {
    public abstract void onAgeAuthFailure(AccountErrorResult accountErrorResult);

    public void onFailure(ErrorResult errorResult) {
        onAgeAuthFailure(new AccountErrorResult(errorResult.getErrorCode(), errorResult.getException()));
    }

    public void onSuccessForUiThread(Integer num) {
        AgeAuthStatus valueOf = AgeAuthStatus.valueOf(num.intValue());
        if (valueOf == AgeAuthStatus.SUCCESS || valueOf == AgeAuthStatus.ALREADY_AGE_AUTHORIZED) {
            onSuccess(num);
        } else {
            onAgeAuthFailure(new AccountErrorResult(num.intValue()));
        }
    }
}
