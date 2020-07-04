package com.bytedance.android.livesdk.browser.jsbridge.p201c.p202a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4057i;
import com.bytedance.ies.web.p582a.C11097i;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.a.a */
public final class C4042a extends C4057i {

    /* renamed from: b */
    private WebDialogFragment f12026b;

    public C4042a(WeakReference<Context> weakReference, WebDialogFragment webDialogFragment) {
        super(weakReference);
        this.f12026b = webDialogFragment;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        super.call(iVar, jSONObject);
        if (TextUtils.equals(iVar.f30171d.optString("type"), "gift_panel")) {
            this.f12026b.dismissAllowingStateLoss();
        }
    }
}
