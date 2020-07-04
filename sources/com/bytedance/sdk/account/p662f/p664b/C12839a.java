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
import com.bytedance.sdk.account.p662f.p663a.C12818a;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12840a;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.a */
public final class C12839a extends C12806h<C12710e<C12818a>> {

    /* renamed from: e */
    private C12818a f34024e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12818a> eVar) {
        C12884a.m37499a("passport_mobile_bind_login", "mobile", (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37310a(C12818a aVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(aVar.f33916c)) {
            hashMap.put("captcha", aVar.f33916c);
        }
        hashMap.put("code", C6319n.m19597d(aVar.f33915b));
        hashMap.put("mobile", C6319n.m19597d(aVar.f33914a));
        hashMap.put("profile_key", aVar.f33917d);
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12818a> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 10005, this.f34024e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34024e.f33918e = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34024e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34024e, jSONObject);
        this.f34024e.f33964l = jSONObject2;
    }

    private C12839a(Context context, C12790a aVar, C12818a aVar2, C12840a aVar3) {
        super(context, aVar, aVar3);
        this.f34024e = aVar2;
    }

    /* renamed from: a */
    public static C12839a m37309a(Context context, String str, String str2, String str3, String str4, C12840a aVar) {
        C12818a aVar2 = new C12818a(str, str2, str3, str4);
        return new C12839a(context, new C12791a().mo31343a(C12715a.m36932G()).mo31345a(m37310a(aVar2)).mo31348c(), aVar2, aVar);
    }
}
