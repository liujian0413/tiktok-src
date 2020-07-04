package com.p280ss.android.mobilelib.present;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.mobilelib.MobileApi.MobileQueryObj;
import com.p280ss.android.mobilelib.MobileApi.RefreshCaptchaQueryObj;
import com.p280ss.android.mobilelib.MobileApi.SendCodeQueryObj;
import com.p280ss.android.mobilelib.model.MobileStateModel;
import com.p280ss.android.mobilelib.view.InputCodePasswordView;

/* renamed from: com.ss.android.mobilelib.present.InputCodePasswordPresent */
public abstract class InputCodePasswordPresent extends CommonPresent {
    private InputCodePasswordView mInputCodePasswordView;
    protected String mLastCommitCode;
    protected String mLastCommitPassword;
    protected final MobileStateModel mMobileStateModel = MobileStateModel.INSTANCE;

    public abstract void commitCodePassword(String str, String str2, String str3);

    /* access modifiers changed from: protected */
    public abstract void handleResultFail(MobileQueryObj mobileQueryObj);

    /* access modifiers changed from: protected */
    public abstract void handleResultSuccess(MobileQueryObj mobileQueryObj);

    public abstract void resendCode(String str);

    public long getLastSendTime() {
        return this.mMobileStateModel.getLastSendTime();
    }

    public String getMobile() {
        return this.mMobileStateModel.getMobile();
    }

    public int getRetryDuration() {
        return this.mMobileStateModel.getRetryTime();
    }

    public void destroy() {
        super.destroy();
        this.mMobileStateModel.setRetryTime(-1);
        this.mMobileStateModel.setLastSendTime(0);
    }

    public void handleMsg(Message message) {
        afterHandleRequest();
        if (message.obj instanceof SendCodeQueryObj) {
            if (message.what == 10) {
                this.mMobileStateModel.setRetryTime(((SendCodeQueryObj) message.obj).mResendTime);
                this.mMobileStateModel.setLastSendTime(System.currentTimeMillis());
                this.mInputCodePasswordView.onResendSuccess();
                return;
            }
            super.handleMsg(message);
            this.mInputCodePasswordView.onResendFail();
        } else if (!(message.obj instanceof MobileQueryObj) || (message.obj instanceof RefreshCaptchaQueryObj)) {
            super.handleMsg(message);
        } else {
            if (message.what == 10) {
                handleResultSuccess((MobileQueryObj) message.obj);
            } else {
                super.handleMsg(message);
                handleResultFail((MobileQueryObj) message.obj);
            }
            this.mMobileStateModel.setRetryTime(-1);
            this.mMobileStateModel.setLastSendTime(0);
        }
    }

    public InputCodePasswordPresent(Context context, InputCodePasswordView inputCodePasswordView) {
        super(context, inputCodePasswordView);
        this.mInputCodePasswordView = inputCodePasswordView;
        if (C6319n.m19593a(this.mMobileStateModel.getMobile())) {
            throw new IllegalStateException("no mobile number!");
        }
    }
}
