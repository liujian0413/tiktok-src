package com.p280ss.android.mobilelib.present;

import android.content.Context;
import com.p280ss.android.mobilelib.view.CheckMobileView;

/* renamed from: com.ss.android.mobilelib.present.ChangePassword1Present */
public class ChangePassword1Present extends CheckMobilePresent {
    public ChangePassword1Present(Context context, CheckMobileView checkMobileView) {
        super(context, checkMobileView, 13);
    }

    public void onCompleteCaptcha(String str, int i) {
        if (isValid() && i == 13) {
            beforeHandleRequest();
            checkMobile(this.mMobileStateModel.getMobile(), str);
        }
    }
}
