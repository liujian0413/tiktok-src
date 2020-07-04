package com.p280ss.android.mobilelib.present;

import android.content.Context;
import com.p280ss.android.mobilelib.MobileApi.BindMobileQueryObj;
import com.p280ss.android.mobilelib.MobileApi.MobileQueryObj;
import com.p280ss.android.mobilelib.model.PersistentData;
import com.p280ss.android.mobilelib.view.Bind2View;

/* renamed from: com.ss.android.mobilelib.present.Bind2Present */
public class Bind2Present extends InputCodePasswordPresent {
    private Bind2View mBind2View;

    /* access modifiers changed from: protected */
    public void handleResultFail(MobileQueryObj mobileQueryObj) {
        if (isValid() && (mobileQueryObj instanceof BindMobileQueryObj)) {
            afterHandleRequest();
            this.mBind2View.onBindFail();
        }
    }

    public void resendCode(String str) {
        if (isValid()) {
            beforeHandleRequest();
            this.mMobileApi.sendCode(this.mWeakHandler, this.mMobileStateModel.getMobile(), str, 9);
        }
    }

    /* access modifiers changed from: protected */
    public void handleResultSuccess(MobileQueryObj mobileQueryObj) {
        if (isValid() && (mobileQueryObj instanceof BindMobileQueryObj)) {
            afterHandleRequest();
            PersistentData.inst().saveLastLoginMobile(getContext(), ((BindMobileQueryObj) mobileQueryObj).mMobile);
            this.mBind2View.onBindSuccess();
        }
    }

    public Bind2Present(Context context, Bind2View bind2View) {
        super(context, bind2View);
        this.mBind2View = bind2View;
    }

    public void onCompleteCaptcha(String str, int i) {
        if (i == 9) {
            resendCode(str);
        } else {
            commitCodePassword(this.mLastCommitCode, this.mLastCommitPassword, str);
        }
    }

    public void commitCodePassword(String str, String str2, String str3) {
        if (isValid()) {
            beforeHandleRequest();
            this.mLastCommitCode = str;
            this.mLastCommitPassword = str2;
            this.mMobileApi.bindMobile(this.mWeakHandler, this.mMobileStateModel.getMobile(), str, str2, str3);
        }
    }
}
