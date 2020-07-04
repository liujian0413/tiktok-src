package com.p280ss.android.mobilelib.present;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.mobilelib.MobileApi.LoginQueryObj;
import com.p280ss.android.mobilelib.model.PersistentData;
import com.p280ss.android.mobilelib.view.LoginView;

/* renamed from: com.ss.android.mobilelib.present.LoginPresent */
public class LoginPresent extends CommonPresent {
    private String mLastLoginMobile;
    private String mLastLoginPassword;
    private final LoginView mLoginView;

    public void handleMsg(Message message) {
        if (isValid()) {
            afterHandleRequest();
            if (!(message.obj instanceof LoginQueryObj)) {
                super.handleMsg(message);
            } else if (message.what == 10) {
                PersistentData.inst().saveLastLoginMobile(getContext(), ((LoginQueryObj) message.obj).mMobile);
                this.mLoginView.onLoginSuccess(((LoginQueryObj) message.obj).mUserInfo);
                this.mLastLoginMobile = null;
                this.mLastLoginPassword = null;
            } else {
                if (TextUtils.isEmpty(((LoginQueryObj) message.obj).mErrorAlert)) {
                    this.mLoginView.onLoginFail(((LoginQueryObj) message.obj).mErrorMsg);
                } else {
                    this.mLoginView.onLoginFail(((LoginQueryObj) message.obj).mErrorAlert);
                }
                super.handleMsg(message);
            }
        }
    }

    public LoginPresent(Context context, LoginView loginView) {
        super(context, loginView);
        this.mLoginView = loginView;
    }

    public void onCompleteCaptcha(String str, int i) {
        if (i == 7) {
            login(this.mLastLoginMobile, this.mLastLoginPassword, str);
        }
    }

    public void login(String str, String str2, String str3) {
        if (isValid()) {
            beforeHandleRequest();
            this.mLastLoginMobile = str;
            this.mLastLoginPassword = str2;
            this.mMobileApi.login(this.mWeakHandler, str, str2, str3);
        }
    }
}
