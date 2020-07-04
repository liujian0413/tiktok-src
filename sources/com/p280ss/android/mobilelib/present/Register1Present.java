package com.p280ss.android.mobilelib.present;

import android.content.Context;
import android.os.Message;
import com.p280ss.android.mobilelib.MobileApi.SendCodeQueryObj;
import com.p280ss.android.mobilelib.view.Register1View;

/* renamed from: com.ss.android.mobilelib.present.Register1Present */
public class Register1Present extends CheckMobilePresent {
    private Register1View mRegister1View;

    public void handleMsg(Message message) {
        if (isValid()) {
            afterHandleRequest();
            if (message.what == 11 && (message.obj instanceof SendCodeQueryObj) && ((SendCodeQueryObj) message.obj).mError == 1001) {
                this.mRegister1View.onCheckMobileUserExist(((SendCodeQueryObj) message.obj).mMobile);
            } else {
                super.handleMsg(message);
            }
        }
    }

    public Register1Present(Context context, Register1View register1View) {
        super(context, register1View, 1);
        this.mRegister1View = register1View;
    }

    public void onCompleteCaptcha(String str, int i) {
        if (isValid() && i == 1) {
            beforeHandleRequest();
            checkMobile(this.mMobileStateModel.getMobile(), str);
        }
    }
}
