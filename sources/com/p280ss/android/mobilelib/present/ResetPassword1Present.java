package com.p280ss.android.mobilelib.present;

import android.content.Context;
import com.p280ss.android.mobilelib.view.ResetPassword1View;

/* renamed from: com.ss.android.mobilelib.present.ResetPassword1Present */
public class ResetPassword1Present extends CheckMobilePresent {
    public ResetPassword1Present(Context context, ResetPassword1View resetPassword1View) {
        super(context, resetPassword1View, 4);
    }

    public void onCompleteCaptcha(String str, int i) {
        if (isValid() && i == 4) {
            beforeHandleRequest();
            checkMobile(this.mMobileStateModel.getMobile(), str);
        }
    }
}
