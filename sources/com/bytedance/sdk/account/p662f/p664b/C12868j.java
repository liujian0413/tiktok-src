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
import com.bytedance.sdk.account.p662f.p663a.C12827j;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12848i;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.j */
public final class C12868j extends C12806h<C12710e<C12827j>> {

    /* renamed from: e */
    private C12827j f34033e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12827j> eVar) {
        C12884a.m37499a("passport_account_login", "mobile", (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37385a(C12827j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C6319n.m19597d(jVar.f33956a));
        if (!TextUtils.isEmpty(jVar.f33958c)) {
            hashMap.put("captcha", jVar.f33958c);
        }
        hashMap.put("password", C6319n.m19597d(jVar.f33957b));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12827j> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1007, this.f34033e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34033e.f33959d = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34033e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34033e, jSONObject);
        this.f34033e.f33964l = jSONObject2;
    }

    private C12868j(Context context, C12790a aVar, C12827j jVar, C12848i iVar) {
        super(context, aVar, iVar);
        this.f34033e = jVar;
    }

    /* renamed from: a */
    public static C12868j m37384a(Context context, String str, String str2, String str3, C12848i iVar) {
        C12827j jVar = new C12827j(str, str2, str3);
        return new C12868j(context, new C12791a().mo31343a(C12715a.m36941d()).mo31345a(m37385a(jVar)).mo31342a().mo31348c(), jVar, iVar);
    }
}
