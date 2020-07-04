package com.kakao.usermgmt.callback;

import com.kakao.auth.ApiResponseCallback;
import com.kakao.usermgmt.response.MeV2Response;

public abstract class MeV2ResponseCallback extends ApiResponseCallback<MeV2Response> {
    public final void onNotSignedUp() {
    }
}
