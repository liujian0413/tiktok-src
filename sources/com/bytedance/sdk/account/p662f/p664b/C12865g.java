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
import com.bytedance.sdk.account.p662f.p663a.C12823f;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12845f;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.g */
public final class C12865g extends C12806h<C12710e<C12823f>> {

    /* renamed from: e */
    private C12823f f34030e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12823f> eVar) {
        C12884a.m37499a("passport_email_register", "email", (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37360a(C12823f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("email", C6319n.m19597d(fVar.f33938a));
        if (!TextUtils.isEmpty(fVar.f33940c)) {
            hashMap.put("code", fVar.f33940c);
        }
        hashMap.put("password", C6319n.m19597d(fVar.f33939b));
        if (!TextUtils.isEmpty(fVar.f33941d)) {
            hashMap.put("recaptcha_token", fVar.f33941d);
        }
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12823f> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1009, this.f34030e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34030e.f33942e = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34030e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34030e, jSONObject);
        this.f34030e.f33964l = jSONObject2;
    }

    private C12865g(Context context, C12790a aVar, C12823f fVar, C12845f fVar2) {
        super(context, aVar, fVar2);
        this.f34030e = fVar;
    }

    /* renamed from: a */
    public static C12865g m37359a(Context context, String str, String str2, String str3, String str4, C12845f fVar) {
        C12823f fVar2 = new C12823f(str, str2, str3, str4);
        return new C12865g(context, new C12791a().mo31343a(C12715a.m36943f()).mo31345a(m37360a(fVar2)).mo31348c(), fVar2, fVar);
    }
}
