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
import com.bytedance.sdk.account.p662f.p663a.C12832o;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12849j;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.l */
public final class C12870l extends C12806h<C12710e<C12832o>> {

    /* renamed from: e */
    private C12832o f34035e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12832o> eVar) {
        C12884a.m37499a("passport_mobile_login", "mobile", "login", (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37400a(C12832o oVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C6319n.m19597d(oVar.f33982a));
        if (!TextUtils.isEmpty(oVar.f33984c)) {
            hashMap.put("captcha", oVar.f33984c);
        }
        hashMap.put("code", C6319n.m19597d(String.valueOf(oVar.f33983b)));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12832o> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1006, this.f34035e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34035e.f33985d = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34035e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34035e, jSONObject);
        this.f34035e.f33964l = jSONObject2;
    }

    private C12870l(Context context, C12790a aVar, C12832o oVar, C12849j jVar) {
        super(context, aVar, jVar);
        this.f34035e = oVar;
    }

    /* renamed from: a */
    public static C12870l m37399a(Context context, String str, String str2, String str3, C12849j jVar) {
        C12832o oVar = new C12832o(str, str2, str3);
        return new C12870l(context, new C12791a().mo31343a(C12715a.m36944g()).mo31345a(m37400a(oVar)).mo31342a().mo31348c(), oVar, jVar);
    }
}
