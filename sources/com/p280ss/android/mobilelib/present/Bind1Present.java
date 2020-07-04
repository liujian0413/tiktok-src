package com.p280ss.android.mobilelib.present;

import android.content.Context;
import com.p280ss.android.mobilelib.view.Bind1View;

/* renamed from: com.ss.android.mobilelib.present.Bind1Present */
public class Bind1Present extends CheckMobilePresent {
    public Bind1Present(Context context, Bind1View bind1View) {
        super(context, bind1View, 8);
    }

    public void onCompleteCaptcha(String str, int i) {
        if (isValid() && i == 8) {
            beforeHandleRequest();
            checkMobile(this.mMobileStateModel.getMobile(), str);
        }
    }
}
