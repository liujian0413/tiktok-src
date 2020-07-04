package com.bytedance.sdk.account;

import android.content.Context;
import com.bytedance.sdk.account.p645a.C12714b.C12716b;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12708c;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p666g.C12884a;
import com.bytedance.sdk.account.p667h.C12885a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.a */
public final class C12704a extends C12806h<C12708c> {

    /* renamed from: e */
    private C12885a f33699e = new C12885a();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12708c cVar) {
        C12884a.m37499a("passport_logout", (String) null, (String) null, (C12707b) cVar, this.f33896c);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f33699e.f34059k = jSONObject.optString("session_key");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12708c mo31159a(boolean z, C12792b bVar) {
        C12708c cVar = new C12708c(z, 10001);
        if (z) {
            cVar.f33707g = this.f33699e.f34059k;
        } else {
            cVar.f33702b = this.f33699e.f34055g;
            cVar.f33703c = this.f33699e.f34056h;
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37137a(this.f33699e, jSONObject, jSONObject2);
    }

    private C12704a(Context context, C12790a aVar, C12706a<C12708c> aVar2) {
        super(context, aVar, aVar2);
    }

    /* renamed from: a */
    public static C12704a m36918a(Context context, String str, Map map, C12706a<C12708c> aVar) {
        return new C12704a(context, new C12791a().mo31343a(C12716b.m36969e()).mo31344a("logout_from", str).mo31345a(map).mo31347b(), aVar);
    }
}
