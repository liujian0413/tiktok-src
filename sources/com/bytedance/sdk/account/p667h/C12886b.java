package com.bytedance.sdk.account.p667h;

import android.content.Context;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12711f;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12806h;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.h.b */
public final class C12886b extends C12806h<C12711f> {

    /* renamed from: e */
    private C12887a f34065e = new C12887a();

    /* renamed from: com.bytedance.sdk.account.h.b$a */
    static class C12887a extends C12885a {

        /* renamed from: a */
        String f34066a;

        C12887a() {
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31160a(C12707b bVar) {
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37137a(this.f34065e, jSONObject, jSONObject2);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34065e.f34066a = jSONObject2.optString("token");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12711f mo31159a(boolean z, C12792b bVar) {
        C12711f fVar = new C12711f(z, 10006);
        if (z) {
            fVar.f33710g = this.f34065e.f34066a;
        } else {
            fVar.f33703c = this.f34065e.f34056h;
            fVar.f33702b = this.f34065e.f34055g;
        }
        return fVar;
    }

    private C12886b(Context context, C12790a aVar, C12706a<C12711f> aVar2) {
        super(context, aVar, aVar2);
    }

    /* renamed from: a */
    public static C12886b m37502a(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map map, C12706a<C12711f> aVar) {
        return new C12886b(context, C12795b.m37135a(str2, str4, str6, str3, null, str, map).mo31344a("access_token_secret", str5).mo31343a(C12715a.m36926A()).mo31347b(), aVar);
    }
}
