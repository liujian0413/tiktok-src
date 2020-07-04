package com.p280ss.android.ugc.aweme.miniapp_api.model;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.h */
public final class C33464h {

    /* renamed from: a */
    public int f87363a = -1;

    /* renamed from: b */
    public String f87364b;

    /* renamed from: c */
    public C33466b f87365c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.h$a */
    public static class C33465a {

        /* renamed from: a */
        public String f87366a;

        /* renamed from: b */
        public String f87367b;

        /* renamed from: c */
        public int f87368c;
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.h$b */
    public static class C33466b {

        /* renamed from: a */
        public C33467c f87369a;

        /* renamed from: b */
        public C33465a f87370b;
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.h$c */
    public static class C33467c {

        /* renamed from: a */
        public int f87371a;

        /* renamed from: b */
        public String f87372b;

        /* renamed from: c */
        public String f87373c;

        /* renamed from: d */
        public String f87374d;

        /* renamed from: e */
        public String f87375e;

        /* renamed from: f */
        public String f87376f;

        /* renamed from: g */
        public String f87377g;
    }

    /* renamed from: a */
    public static C33464h m108201a(String str) {
        C33464h hVar = new C33464h();
        try {
            JSONObject jSONObject = new JSONObject(str);
            hVar.f87363a = jSONObject.optInt("err_no");
            hVar.f87364b = jSONObject.optString("message");
            C33466b bVar = new C33466b();
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            C33467c cVar = new C33467c();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("share_info");
            cVar.f87371a = optJSONObject2.optInt("host_id");
            cVar.f87372b = optJSONObject2.optString("app_id");
            cVar.f87373c = optJSONObject2.optString("title");
            cVar.f87374d = optJSONObject2.optString("image_url");
            cVar.f87375e = optJSONObject2.optString("query");
            cVar.f87377g = optJSONObject2.optString("uid");
            cVar.f87376f = optJSONObject2.optString("did");
            C33465a aVar = new C33465a();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("app_info");
            aVar.f87366a = optJSONObject3.optString("name");
            aVar.f87367b = optJSONObject3.optString("icon");
            aVar.f87368c = optJSONObject3.optInt("type");
            bVar.f87369a = cVar;
            bVar.f87370b = aVar;
            hVar.f87365c = bVar;
        } catch (JSONException unused) {
        }
        return hVar;
    }
}
