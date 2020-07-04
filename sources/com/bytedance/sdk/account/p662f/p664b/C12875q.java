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
import com.bytedance.sdk.account.p662f.p663a.C12835r;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12854o;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.q */
public final class C12875q extends C12806h<C12710e<C12835r>> {

    /* renamed from: e */
    private C12835r f34040e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12835r> eVar) {
        C12884a.m37499a("passport_mobile_reset_password", "mobile", (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37440a(C12835r rVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C6319n.m19597d(rVar.f33992a));
        if (!TextUtils.isEmpty(rVar.f33995d)) {
            hashMap.put("captcha", rVar.f33995d);
        }
        hashMap.put("code", C6319n.m19597d(rVar.f33993b));
        hashMap.put("password", C6319n.m19597d(rVar.f33994c));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12835r> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1003, this.f34040e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34040e.f33996e = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34040e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34040e, jSONObject);
        this.f34040e.f33964l = jSONObject2;
    }

    private C12875q(Context context, C12790a aVar, C12835r rVar, C12854o oVar) {
        super(context, aVar, oVar);
        this.f34040e = rVar;
    }

    /* renamed from: a */
    public static C12875q m37439a(Context context, String str, String str2, String str3, String str4, C12854o oVar) {
        C12835r rVar = new C12835r(str, str2, str3, str4);
        return new C12875q(context, new C12791a().mo31343a(C12715a.m36947j()).mo31345a(m37440a(rVar)).mo31348c(), rVar, oVar);
    }
}
