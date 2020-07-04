package com.p280ss.android.mobilelib.present;

import android.content.Context;
import com.p280ss.android.mobilelib.MobileApi.ChangePasswordQueryObj;
import com.p280ss.android.mobilelib.MobileApi.MobileQueryObj;
import com.p280ss.android.mobilelib.view.ChangePassword2View;

/* renamed from: com.ss.android.mobilelib.present.ChangePassword2Present */
public class ChangePassword2Present extends InputCodePasswordPresent {
    private ChangePassword2View mChangePassword2View;

    /* access modifiers changed from: protected */
    public void handleResultFail(MobileQueryObj mobileQueryObj) {
        if (isValid() && (mobileQueryObj instanceof ChangePasswordQueryObj)) {
            afterHandleRequest();
            this.mChangePassword2View.onChangePasswordFail();
        }
    }

    /* access modifiers changed from: protected */
    public void handleResultSuccess(MobileQueryObj mobileQueryObj) {
        if (isValid() && (mobileQueryObj instanceof ChangePasswordQueryObj)) {
            afterHandleRequest();
            this.mChangePassword2View.onChangePasswordSuccess();
        }
    }

    public void resendCode(String str) {
        if (isValid()) {
            beforeHandleRequest();
            this.mMobileApi.sendCode(this.mWeakHandler, this.mMobileStateModel.getMobile(), str, 14);
        }
    }

    public ChangePassword2Present(Context context, ChangePassword2View changePassword2View) {
        super(context, changePassword2View);
        this.mChangePassword2View = changePassword2View;
    }

    public void onCompleteCaptcha(String str, int i) {
        if (i == 14) {
            resendCode(str);
        } else {
            commitCodePassword(this.mLastCommitCode, this.mLastCommitPassword, str);
        }
    }

    public void commitCodePassword(String str, String str2, String str3) {
        if (isValid()) {
            beforeHandleRequest();
            this.mMobileApi.changePassword(this.mWeakHandler, str, str2, str3);
            this.mLastCommitCode = str;
            this.mLastCommitPassword = str2;
        }
    }
}
