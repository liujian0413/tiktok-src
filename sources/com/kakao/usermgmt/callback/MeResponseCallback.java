package com.kakao.usermgmt.callback;

import com.kakao.auth.ApiResponseCallback;
import com.kakao.usermgmt.response.model.UserProfile;

public abstract class MeResponseCallback extends ApiResponseCallback<UserProfile> {
    public void onSuccessForUiThread(UserProfile userProfile) {
        userProfile.saveUserToCache();
        super.onSuccessForUiThread(userProfile);
    }
}
