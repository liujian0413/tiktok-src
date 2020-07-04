package com.kakao.usermgmt.callback;

import com.kakao.auth.ApiResponseCallback;

public abstract class UnLinkResponseCallback extends ApiResponseCallback<Long> {
    public void onSuccessForUiThread(Long l) {
        super.onSuccessForUiThread(l);
    }
}
