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

/* renamed from: com.bytedance.sdk.account.h.c */
public final class C12888c extends C12806h<C12712g> {

    /* renamed from: e */
    private C12889a f34067e = new C12889a();

    /* renamed from: com.bytedance.sdk.account.h.c$a */
    public static class C12889a extends C12894f {

        /* renamed from: a */
        JSONObject f34068a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12712g gVar) {
        C12884a.m37499a("passport_oauth_bind_click", this.f33895b.mo31341a("platform"), "auth_bind", (C12707b) gVar, this.f33896c);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C12796a.m37142a(jSONObject, jSONObject2, (C12894f) this.f34067e);
        this.f34067e.f34068a = jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12712g mo31159a(boolean z, C12792b bVar) {
        C12712g a = C12796a.m37138a((C12894f) this.f34067e, z, 0);
        if (z) {
            a.f33711g = this.f34067e.f34072b;
        } else {
            a.f33702b = this.f34067e.f34055g;
            a.f33703c = this.f34067e.f34056h;
            a.f33715k = this.f34067e.f34058j;
            a.f33721q = this.f34067e.f34057i;
            if (this.f34067e.f34055g == 1075) {
                a.f33717m = this.f34067e.f34061m;
                a.f33720p = this.f34067e.f34064p;
                a.f33719o = this.f34067e.f34063o;
                a.f33718n = this.f34067e.f34062n;
                a.f33716l = this.f34067e.f34060l;
            }
        }
        a.f33705e = this.f34067e.f34068a;
        return a;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12796a.m37141a((C12894f) this.f34067e, jSONObject);
        this.f34067e.f34068a = jSONObject2;
        if (jSONObject != null) {
            this.f34067e.f34057i = jSONObject.optString("profile_key");
            this.f34067e.f34058j = jSONObject.optString("shark_ticket");
        }
    }

    private C12888c(Context context, C12790a aVar, C12706a<C12712g> aVar2) {
        super(context, aVar, aVar2);
    }

    /* renamed from: a */
    public static C12888c m37508a(Context context, String str, String str2, String str3, String str4, Map map, C12706a<C12712g> aVar) {
        return new C12888c(context, C12795b.m37135a(str2, str3, str4, null, null, str, map).mo31343a(C12716b.m36968d()).mo31347b(), aVar);
    }

    /* renamed from: b */
    public static C12888c m37511b(Context context, String str, String str2, String str3, String str4, Map map, C12706a<C12712g> aVar) {
        return new C12888c(context, C12795b.m37135a(str2, null, str4, str3, null, str, map).mo31343a(C12716b.m36968d()).mo31347b(), aVar);
    }
}
