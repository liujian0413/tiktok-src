package com.p280ss.android.ugc.aweme.p313im.sdk.group.model;

import com.bytedance.ies.ugc.appcontext.C6399b;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.b */
public final class C31269b {

    /* renamed from: a */
    public static final C31269b f81970a = new C31269b();

    private C31269b() {
    }

    /* renamed from: a */
    public static HashMap<String, String> m101891a(int i) {
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source_app_id", C6399b.m19935k());
        jSONObject.put("source_type", 6);
        String jSONObject2 = jSONObject.toString();
        C7573i.m23582a((Object) jSONObject2, "params.toString()");
        hashMap.put("create", jSONObject2);
        return hashMap;
    }

    /* renamed from: a */
    public static HashMap<String, String> m101892a(long j, int i, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("source_app_id", C6399b.m19935k());
        jSONObject3.put("im_user_id", j);
        jSONObject.put("invitee", jSONObject2);
        jSONObject.put("invitor", jSONObject3);
        jSONObject.put("source_type", i);
        Map map = hashMap;
        String jSONObject4 = jSONObject.toString();
        C7573i.m23582a((Object) jSONObject4, "params.toString()");
        map.put("invitation", jSONObject4);
        if (str != null) {
            map.put("ticket", str);
        }
        return hashMap;
    }
}
