package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseOpenMethod;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.PublishVideoMethod */
public class PublishVideoMethod extends BaseOpenMethod {
    public PublishVideoMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(weakReference, reactContext);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        try {
            jSONObject.put("type", "publishVideo");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("video_id", jSONObject.optString("review_video_id"));
            jSONObject2.put("video_url", jSONObject.optString("video_url"));
            jSONObject2.put("music_id", jSONObject.optString("music_id"));
            jSONObject2.put("challenge_id", jSONObject.optString("challenge_id"));
            jSONObject.put("args", jSONObject2);
            mo71366a(jSONObject);
            aVar.mo71363a((Object) null);
        } catch (Exception unused) {
            aVar.mo71362a(-1, "");
        }
    }
}
