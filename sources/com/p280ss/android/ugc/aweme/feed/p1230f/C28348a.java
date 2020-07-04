package com.p280ss.android.ugc.aweme.feed.p1230f;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.f.a */
public final class C28348a {
    /* renamed from: a */
    public static void m93130a(String str, String str2, String str3, JSONObject jSONObject) {
        C28349b bVar = new C28349b(jSONObject, C28580o.m93835e(), C28580o.m93834d(), str, str2, str3);
        C1592h.m7855a((Callable<TResult>) bVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m93129a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) throws Exception {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (JSONException unused) {
            }
        } else {
            jSONObject2 = jSONObject;
        }
        jSONObject2.put("top_activity", str);
        jSONObject2.put("feed_tab", str2);
        jSONObject2.put("err_code", str3);
        jSONObject2.put("err_msg", str4);
        C6907h.onEvent(MobClick.obtain().setEventName("video_play_failed").setValue(str5).setJsonObject(jSONObject));
        return null;
    }
}
