package com.bytedance.sdk.account.p662f.p664b;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12795b.C12796a;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p662f.p663a.C12838u;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12858s;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.v */
public final class C12881v extends C12806h<C12710e<C12838u>> {

    /* renamed from: e */
    private C12838u f34047e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12838u> eVar) {
        C12884a.m37499a("passport_account_register", (String) null, (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37484a(C12838u uVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("username", C6319n.m19597d(uVar.f34021a));
        hashMap.put("password", C6319n.m19597d(uVar.f34022b));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12838u> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1023, this.f34047e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34047e.f34023c = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34047e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34047e, jSONObject);
        this.f34047e.f33964l = jSONObject2;
    }

    private C12881v(Context context, C12790a aVar, C12838u uVar, C12858s sVar) {
        super(context, aVar, sVar);
        this.f34047e = uVar;
    }

    /* renamed from: a */
    public static C12881v m37483a(Context context, String str, String str2, C12858s sVar) {
        C12838u uVar = new C12838u(str, str2);
        return new C12881v(context, new C12791a().mo31343a(C12715a.m36962y()).mo31345a(m37484a(uVar)).mo31348c(), uVar, sVar);
    }
}
