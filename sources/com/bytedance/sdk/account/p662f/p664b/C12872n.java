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
import com.bytedance.sdk.account.p662f.p663a.C12831n;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12851l;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.n */
public final class C12872n extends C12806h<C12710e<C12831n>> {

    /* renamed from: e */
    private C12831n f34037e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12831n> eVar) {
        C12884a.m37499a("passport_mobile_login_only", "mobile", "login_only", (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37416a(C12831n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C6319n.m19597d(nVar.f33977a));
        if (!TextUtils.isEmpty(nVar.f33979c)) {
            hashMap.put("captcha", nVar.f33979c);
        }
        hashMap.put("code", C6319n.m19597d(String.valueOf(nVar.f33978b)));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12831n> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1021, this.f34037e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34037e.f33981e = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34037e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34037e, jSONObject);
        this.f34037e.f33964l = jSONObject2;
        try {
            this.f34037e.f33980d = jSONObject.optString("sms_code_key");
        } catch (Exception unused) {
        }
    }

    private C12872n(Context context, C12790a aVar, C12831n nVar, C12851l lVar) {
        super(context, aVar, lVar);
        this.f34037e = nVar;
    }

    /* renamed from: a */
    public static C12872n m37415a(Context context, String str, String str2, String str3, C12851l lVar) {
        C12831n nVar = new C12831n(str, str2, str3);
        return new C12872n(context, new C12791a().mo31343a(C12715a.m36945h()).mo31345a(m37416a(nVar)).mo31348c(), nVar, lVar);
    }
}
