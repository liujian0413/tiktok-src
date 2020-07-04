package com.p280ss.android.mobilelib.present;

import android.content.Context;
import com.p280ss.android.mobilelib.MobileApi.MobileQueryObj;
import com.p280ss.android.mobilelib.MobileApi.ResetPasswordQueryObj;
import com.p280ss.android.mobilelib.model.PersistentData;
import com.p280ss.android.mobilelib.view.ResetPassword2View;

/* renamed from: com.ss.android.mobilelib.present.ResetPassword2Present */
public class ResetPassword2Present extends InputCodePasswordPresent {
    private ResetPassword2View mResetPassword2View;

    /* access modifiers changed from: protected */
    public void handleResultFail(MobileQueryObj mobileQueryObj) {
        if (isValid() && (mobileQueryObj instanceof ResetPasswordQueryObj)) {
            afterHandleRequest();
            this.mResetPassword2View.onResetPasswordFail();
        }
    }

    public void resendCode(String str) {
        if (isValid()) {
            beforeHandleRequest();
            this.mMobileApi.sendCode(this.mWeakHandler, this.mMobileStateModel.getMobile(), str, 5);
        }
    }

    /* access modifiers changed from: protected */
    public void handleResultSuccess(MobileQueryObj mobileQueryObj) {
        if (isValid() && (mobileQueryObj instanceof ResetPasswordQueryObj)) {
            afterHandleRequest();
            ResetPasswordQueryObj resetPasswordQueryObj = (ResetPasswordQueryObj) mobileQueryObj;
            PersistentData.inst().saveLastLoginMobile(getContext(), resetPasswordQueryObj.mMobile);
            this.mResetPassword2View.onResetPasswordSuccess(resetPasswordQueryObj.mUserInfo);
        }
    }

    public ResetPassword2Present(Context context, ResetPassword2View resetPassword2View) {
        super(context, resetPassword2View);
        this.mResetPassword2View = resetPassword2View;
    }

    public void onCompleteCaptcha(String str, int i) {
        if (i == 5) {
            resendCode(str);
        } else {
            commitCodePassword(this.mLastCommitCode, this.mLastCommitPassword, str);
        }
    }

    public void commitCodePassword(String str, String str2, String str3) {
        if (isValid()) {
            beforeHandleRequest();
            this.mMobileApi.resetPassword(this.mWeakHandler, this.mMobileStateModel.getMobile(), str, str2, str3);
            this.mLastCommitCode = str;
            this.mLastCommitPassword = str2;
        }
    }
}
