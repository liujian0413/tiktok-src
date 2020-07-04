package com.p280ss.android.mobilelib.present;

import android.content.Context;
import com.p280ss.android.mobilelib.MobileApi.MobileQueryObj;
import com.p280ss.android.mobilelib.MobileApi.RegisterQueryObj;
import com.p280ss.android.mobilelib.model.PersistentData;
import com.p280ss.android.mobilelib.view.Register2View;

/* renamed from: com.ss.android.mobilelib.present.Register2Present */
public class Register2Present extends InputCodePasswordPresent {
    private Register2View mRegister2View;

    /* access modifiers changed from: protected */
    public void handleResultFail(MobileQueryObj mobileQueryObj) {
        if (isValid() && (mobileQueryObj instanceof RegisterQueryObj)) {
            afterHandleRequest();
            this.mRegister2View.onRegisterFail();
        }
    }

    public void resendCode(String str) {
        if (isValid()) {
            beforeHandleRequest();
            this.mMobileApi.sendCode(this.mWeakHandler, this.mMobileStateModel.getMobile(), str, 2);
        }
    }

    /* access modifiers changed from: protected */
    public void handleResultSuccess(MobileQueryObj mobileQueryObj) {
        if (isValid() && (mobileQueryObj instanceof RegisterQueryObj)) {
            afterHandleRequest();
            RegisterQueryObj registerQueryObj = (RegisterQueryObj) mobileQueryObj;
            PersistentData.inst().saveLastLoginMobile(getContext(), registerQueryObj.mMobile);
            this.mRegister2View.onRegisterSuccess(registerQueryObj.mUserInfo);
        }
    }

    public Register2Present(Context context, Register2View register2View) {
        super(context, register2View);
        this.mRegister2View = register2View;
    }

    public void onCompleteCaptcha(String str, int i) {
        if (i == 2) {
            resendCode(str);
        } else {
            commitCodePassword(this.mLastCommitCode, this.mLastCommitPassword, str);
        }
    }

    public void commitCodePassword(String str, String str2, String str3) {
        if (isValid()) {
            beforeHandleRequest();
            this.mMobileApi.register(this.mWeakHandler, this.mMobileStateModel.getMobile(), str, str2, str3);
            this.mLastCommitCode = str;
            this.mLastCommitPassword = str2;
        }
    }
}
