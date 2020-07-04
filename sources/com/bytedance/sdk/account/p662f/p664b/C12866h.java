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
import com.bytedance.sdk.account.p660d.C12795b.C12796a;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p662f.p663a.C12824g;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12846g;
import com.bytedance.sdk.account.p666g.C12884a;
import com.bytedance.sdk.account.utils.C12914g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.h */
public final class C12866h extends C12806h<C12710e<C12824g>> {

    /* renamed from: e */
    private C12824g f34031e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12824g> eVar) {
        C12884a.m37499a("passport_email_register_verify", "email", this.f33895b.mo31341a("type"), (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37368a(C12824g gVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(gVar.f33943a)) {
            hashMap.put("email", C6319n.m19597d(gVar.f33943a));
        }
        hashMap.put("type", C6319n.m19597d(String.valueOf(gVar.f33945c)));
        if (!TextUtils.isEmpty(gVar.f33944b)) {
            hashMap.put("code", gVar.f33944b);
        }
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12824g> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1025, this.f34031e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34031e.f33948f = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34031e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34031e, jSONObject);
        this.f34031e.f33964l = jSONObject2;
    }

    private C12866h(Context context, C12790a aVar, C12824g gVar, C12846g gVar2) {
        super(context, aVar, gVar2);
        this.f34031e = gVar;
    }

    /* renamed from: a */
    public static C12866h m37367a(Context context, String str, String str2, int i, Map map, String str3, C12846g gVar) {
        C12824g gVar2 = new C12824g(str, str2, i, map, str3);
        return new C12866h(context, new C12791a().mo31346a(m37368a(gVar2), gVar2.f33946d).mo31343a(C12914g.m37592a(C12715a.m36953p(), str3)).mo31348c(), gVar2, gVar);
    }
}
