package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;

public class ToastMethod extends C11155d<Params, Object> {

    static final class Params {
        @C6593c(mo15949a = "position")
        int position;
        @C6593c(mo15949a = "text")
        String text;

        Params() {
        }
    }

    public Object invoke(Params params, CallContext callContext) throws Exception {
        if (params.position == 1) {
            C9049ap.m27028a(params.text);
        } else {
            C3517a.m12962a(callContext.f30265a, params.text);
        }
        return null;
    }
}
