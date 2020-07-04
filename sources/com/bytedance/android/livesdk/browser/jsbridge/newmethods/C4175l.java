package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.support.p022v4.app.DialogFragment;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.l */
public final class C4175l extends C11155d<JSONObject, Object> {

    /* renamed from: a */
    private DialogFragment f12226a;

    /* renamed from: b */
    private Activity f12227b;

    public C4175l(Activity activity) {
        this.f12227b = activity;
    }

    public C4175l(DialogFragment dialogFragment) {
        this.f12226a = dialogFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object invoke(JSONObject jSONObject, CallContext callContext) throws Exception {
        if (this.f12226a != null) {
            this.f12226a.dismissAllowingStateLoss();
        } else if (this.f12227b != null) {
            this.f12227b.finish();
        } else {
            terminate();
        }
        return null;
    }
}
