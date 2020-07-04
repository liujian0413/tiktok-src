package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du.C5295a;
import com.bytedance.android.livesdk.p225f.C5892a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p */
public final class C4189p extends C11152c<JSONObject, Object> {

    /* renamed from: a */
    private CallContext f12257a;

    public final void onTerminate() {
        this.f12257a = null;
    }

    /* renamed from: a */
    public static void m14289a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("download_url", "");
            if (!C6319n.m19593a(optString)) {
                C5892a.m18404a(optString).mo14423b(jSONObject.optString("toast_text", "")).mo14422a();
            }
        }
    }

    /* renamed from: b */
    private void m14291b(final JSONObject jSONObject) {
        if (this.f12257a != null && this.f12257a.f30265a != null && jSONObject != null) {
            new C5295a(this.f12257a.f30265a, 2).mo13572a(true).mo13570a((CharSequence) jSONObject.optString("title", "")).mo13575b((CharSequence) jSONObject.optString(C38347c.f99553h, "")).mo13571a(jSONObject.optString("cancel_text", ""), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo13576b(jSONObject.optString("confirm_text", ""), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C4189p.m14289a(jSONObject);
                    dialogInterface.dismiss();
                }
            }).mo13577b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(JSONObject jSONObject, CallContext callContext) throws Exception {
        this.f12257a = callContext;
        String optString = jSONObject.optString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if ("apk".equals(optString)) {
            m14291b(optJSONObject);
        }
    }
}
