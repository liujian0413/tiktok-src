package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.sdk.webview.p901b.C20133e;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ac */
public final class C43491ac extends C20133e {
    public C43491ac(WeakReference<Context> weakReference, C11087a aVar) {
        super(weakReference);
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        iVar.f30170c = "open";
        iVar.f30171d.put("type", "publishVideo");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("video_id", iVar.f30171d.optString("review_video_id"));
        jSONObject2.put("video_url", iVar.f30171d.optString("video_url"));
        jSONObject2.put("music_id", iVar.f30171d.optString("music_id"));
        jSONObject2.put("challenge_id", iVar.f30171d.optString("challenge_id"));
        iVar.f30171d.put("args", jSONObject2);
        open(iVar.f30171d);
    }
}
