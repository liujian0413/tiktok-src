package com.bytedance.sdk.account.p667h;

import android.content.Context;
import com.bytedance.sdk.account.p645a.C12714b.C12716b;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12712g;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12795b.C12796a;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.h.d */
public final class C12890d extends C12806h<C12712g> {

    /* renamed from: e */
    private C12891a f34069e = new C12891a();

    /* renamed from: com.bytedance.sdk.account.h.d$a */
    public static class C12891a extends C12894f {

        /* renamed from: a */
        JSONObject f34070a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12712g gVar) {
        C12884a.m37499a("passport_oauth_login_click", this.f33895b.mo31341a("platform"), "login", (C12707b) gVar, this.f33896c);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C12796a.m37142a(jSONObject, jSONObject2, (C12894f) this.f34069e);
        this.f34069e.f34070a = jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12712g mo31159a(boolean z, C12792b bVar) {
        C12712g gVar = new C12712g(z, 1);
        if (z) {
            gVar.f33711g = this.f34069e.f34072b;
        } else {
            gVar.f33702b = this.f34069e.f34055g;
            gVar.f33703c = this.f34069e.f34056h;
            gVar.f33715k = this.f34069e.f34058j;
            gVar.f33721q = this.f34069e.f34057i;
            if (this.f34069e.f34055g == 1075) {
                gVar.f33717m = this.f34069e.f34061m;
                gVar.f33720p = this.f34069e.f34064p;
                gVar.f33719o = this.f34069e.f34063o;
                gVar.f33718n = this.f34069e.f34062n;
                gVar.f33716l = this.f34069e.f34060l;
            }
        }
        gVar.f33705e = this.f34069e.f34070a;
        return gVar;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12796a.m37141a((C12894f) this.f34069e, jSONObject);
        this.f34069e.f34070a = jSONObject2;
        if (jSONObject != null) {
            this.f34069e.f34057i = jSONObject.optString("profile_key");
            this.f34069e.f34058j = jSONObject.optString("shark_ticket");
        }
    }

    private C12890d(Context context, C12790a aVar, C12706a<C12712g> aVar2) {
        super(context, aVar, aVar2);
    }

    /* renamed from: a */
    public static C12890d m37516a(Context context, String str, String str2, String str3, String str4, Map<String, String> map, C12706a<C12712g> aVar) {
        return new C12890d(context, C12795b.m37135a(str2, str3, str4, null, null, str, map).mo31343a(C12716b.m36964a()).mo31342a().mo31347b(), aVar);
    }

    /* renamed from: b */
    public static C12890d m37519b(Context context, String str, String str2, String str3, String str4, Map<String, String> map, C12706a<C12712g> aVar) {
        return new C12890d(context, C12795b.m37135a(str2, null, str4, str3, null, str, map).mo31343a(C12716b.m36964a()).mo31342a().mo31347b(), aVar);
    }
}
