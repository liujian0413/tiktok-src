package com.bytedance.sdk.account.p662f.p664b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p662f.p663a.C12822e;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12844e;
import com.bytedance.sdk.account.p666g.C12884a;
import com.bytedance.sdk.account.utils.C12914g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.f */
public final class C12864f extends C12806h<C12710e<C12822e>> {

    /* renamed from: e */
    private C12822e f34029e;

    /* renamed from: a */
    private static Map<String, String> m37352a(C12822e eVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(eVar.f33934a)) {
            hashMap.put("email", C6319n.m19597d(eVar.f33934a));
        }
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12822e> eVar) {
        C12884a.m37499a("passport_email_check_register", "email", this.f33895b.mo31341a("type"), (C12707b) eVar, this.f33896c);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12822e> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1026, this.f34029e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34029e.f33937d = jSONObject2.optInt("is_registered");
        this.f34029e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34029e, jSONObject);
        this.f34029e.f33964l = jSONObject2;
    }

    private C12864f(Context context, C12790a aVar, C12822e eVar, C12844e eVar2) {
        super(context, aVar, eVar2);
        this.f34029e = eVar;
    }

    /* renamed from: a */
    public static C12864f m37351a(Context context, String str, Map map, String str2, C12844e eVar) {
        C12822e eVar2 = new C12822e(str, map, str2);
        return new C12864f(context, new C12791a().mo31346a(m37352a(eVar2), eVar2.f33935b).mo31343a(C12914g.m37592a(C12715a.m36954q(), str2)).mo31348c(), eVar2, eVar);
    }
}
