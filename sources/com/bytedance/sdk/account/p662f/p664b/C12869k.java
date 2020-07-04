package com.bytedance.sdk.account.p662f.p664b;

import android.content.Context;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12709d;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.k */
public final class C12869k extends C12806h<C12709d> {

    /* renamed from: e */
    List<String> f34034e = new ArrayList();

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12709d dVar) {
        C12884a.m37499a("passport_logout_others", (String) null, (String) null, (C12707b) dVar, this.f33896c);
    }

    /* renamed from: a */
    public static C12869k m37392a(Context context, C12706a<C12709d> aVar) {
        return new C12869k(context, new C12791a().mo31343a(C12715a.m36934I()).mo31348c(), aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12709d mo31159a(boolean z, C12792b bVar) {
        C12709d dVar = new C12709d(z, 10022);
        if (z) {
            dVar.f33708g = this.f34034e;
        } else {
            dVar.f33702b = bVar.f33842b;
            dVar.f33703c = bVar.f33843c;
        }
        return dVar;
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONArray optJSONArray = jSONObject2.optJSONArray("logout_user_ids");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                this.f34034e.add(optJSONArray.getString(i));
            }
        }
    }

    private C12869k(Context context, C12790a aVar, C12706a<C12709d> aVar2) {
        super(context, aVar, aVar2);
    }
}
