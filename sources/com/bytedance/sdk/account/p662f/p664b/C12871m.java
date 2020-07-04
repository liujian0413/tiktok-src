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
import com.bytedance.sdk.account.p662f.p663a.C12830m;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12850k;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.m */
public final class C12871m extends C12806h<C12710e<C12830m>> {

    /* renamed from: e */
    private C12830m f34036e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12830m> eVar) {
        C12884a.m37499a("passport_mobile_login_continue", "mobile", "login_continue", (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37408a(C12830m mVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C6319n.m19597d(mVar.f33974a));
        hashMap.put("sms_code_key", C6319n.m19597d(String.valueOf(mVar.f33975b)));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12830m> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1022, this.f34036e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34036e.f33976c = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34036e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34036e, jSONObject);
        this.f34036e.f33964l = jSONObject2;
    }

    private C12871m(Context context, C12790a aVar, C12830m mVar, C12850k kVar) {
        super(context, aVar, kVar);
        this.f34036e = mVar;
    }

    /* renamed from: a */
    public static C12871m m37407a(Context context, String str, String str2, C12850k kVar) {
        C12830m mVar = new C12830m(str, str2);
        return new C12871m(context, new C12791a().mo31343a(C12715a.m36946i()).mo31345a(m37408a(mVar)).mo31348c(), mVar, kVar);
    }
}
