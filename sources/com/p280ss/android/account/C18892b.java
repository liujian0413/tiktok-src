package com.p280ss.android.account;

import com.bytedance.sdk.account.p668i.C12897a;
import com.bytedance.sdk.account.p668i.C12898b;
import org.json.JSONObject;

/* renamed from: com.ss.android.account.b */
public final class C18892b extends C18890a {

    /* renamed from: A */
    public String f50904A;

    /* renamed from: B */
    public int f50905B;

    /* renamed from: C */
    public int f50906C;

    /* renamed from: D */
    public boolean f50907D;

    /* renamed from: E */
    public boolean f50908E;

    /* renamed from: k */
    public String f50909k;

    /* renamed from: l */
    public String f50910l;

    /* renamed from: m */
    public long f50911m;

    /* renamed from: n */
    public String f50912n;

    /* renamed from: o */
    public String f50913o;

    /* renamed from: p */
    public boolean f50914p;

    /* renamed from: q */
    public String f50915q;

    /* renamed from: r */
    public String f50916r;

    /* renamed from: s */
    public int f50917s;

    /* renamed from: t */
    public int f50918t;

    /* renamed from: u */
    public int f50919u;

    /* renamed from: v */
    public int f50920v;

    /* renamed from: w */
    public int f50921w;

    /* renamed from: x */
    public int f50922x;

    /* renamed from: y */
    public int f50923y;

    /* renamed from: z */
    public long f50924z;

    /* renamed from: com.ss.android.account.b$a */
    public static class C18893a implements C12897a<C18892b> {
        /* renamed from: a */
        public final /* synthetic */ C12898b mo31364a(JSONObject jSONObject) throws Exception {
            return m61663b(jSONObject);
        }

        /* renamed from: b */
        public static C18892b m61663b(JSONObject jSONObject) throws Exception {
            C18892b bVar = new C18892b(jSONObject);
            bVar.mo31365a();
            return bVar;
        }
    }

    /* renamed from: a */
    public final void mo31365a() throws Exception {
        super.mo31365a();
        m61661a(this, this.f34083f);
    }

    public C18892b(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* renamed from: a */
    private static void m61661a(C18892b bVar, JSONObject jSONObject) throws Exception {
        bVar.f50917s = jSONObject.optInt("can_be_found_by_phone");
        bVar.f50918t = jSONObject.optInt("share_to_repost", -1);
        boolean z = true;
        bVar.f50919u = jSONObject.optInt("user_privacy_extend") & 1;
        bVar.f50920v = jSONObject.optInt("user_privacy_extend");
        bVar.f50906C = jSONObject.optInt("gender");
        bVar.f50909k = jSONObject.optString("screen_name");
        bVar.f50910l = jSONObject.optString("verified_content");
        bVar.f50907D = jSONObject.optBoolean("is_generated");
        bVar.f50908E = jSONObject.optBoolean("user_verified");
        if (jSONObject.optInt("is_recommend_allowed") == 0) {
            z = false;
        }
        bVar.f50914p = z;
        bVar.f50915q = jSONObject.optString("recommend_hint_message");
        bVar.f50916r = jSONObject.optString("user_decoration");
        JSONObject optJSONObject = jSONObject.optJSONObject("media");
        if (optJSONObject != null) {
            bVar.f50912n = optJSONObject.optString("avatar_url");
            bVar.f50911m = optJSONObject.optLong("id");
            bVar.f50913o = optJSONObject.optString("name");
            bVar.f50905B = optJSONObject.optInt("display_app_ocr_entrance", 0);
        }
        bVar.f50921w = jSONObject.optInt("followings_count");
        bVar.f50922x = jSONObject.optInt("followers_count");
        bVar.f50923y = jSONObject.optInt("visit_count_recent");
        bVar.f50924z = jSONObject.optLong("media_id");
        bVar.f50904A = jSONObject.optString("bg_img_url");
    }
}
