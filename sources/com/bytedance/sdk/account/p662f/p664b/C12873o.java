package com.bytedance.sdk.account.p662f.p664b;

import android.content.Context;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p662f.p663a.C12833p;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12852m;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.o */
public final class C12873o extends C12806h<C12710e<C12833p>> {

    /* renamed from: e */
    private C12833p f34038e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12833p> eVar) {
        C12884a.m37499a("passport_recaptcha_captcha", "mobile", (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37424a(C12833p pVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", String.valueOf(pVar.f33970r));
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12833p> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1000, this.f34038e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34038e.f33986a = jSONObject2.optString("captcha");
        this.f34038e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34038e, jSONObject);
        this.f34038e.f33964l = jSONObject2;
    }

    /* renamed from: a */
    public static C12873o m37423a(Context context, int i, C12852m mVar) {
        C12833p pVar = new C12833p(i);
        return new C12873o(context, new C12791a().mo31343a(C12715a.m36937a()).mo31345a(m37424a(pVar)).mo31348c(), pVar, mVar);
    }

    private C12873o(Context context, C12790a aVar, C12833p pVar, C12852m mVar) {
        super(context, aVar, mVar);
        this.f34038e = pVar;
    }
}
