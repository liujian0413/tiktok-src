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
import com.bytedance.sdk.account.p662f.p663a.C12821d;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12843d;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.e */
public final class C12863e extends C12806h<C12710e<C12821d>> {

    /* renamed from: e */
    private C12821d f34028e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12821d> eVar) {
        C12884a.m37499a("passport_mobile_change_password", "mobile", (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37344a(C12821d dVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(dVar.f33933c)) {
            hashMap.put("captcha", dVar.f33933c);
        }
        hashMap.put("code", C6319n.m19597d(dVar.f33931a));
        hashMap.put("password", C6319n.m19597d(dVar.f33932b));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34028e.f33964l = jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12821d> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1010, this.f34028e);
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34028e, jSONObject);
        this.f34028e.f33964l = jSONObject2;
    }

    private C12863e(Context context, C12790a aVar, C12821d dVar, C12843d dVar2) {
        super(context, aVar, dVar2);
        this.f34028e = dVar;
    }

    /* renamed from: a */
    public static C12863e m37343a(Context context, String str, String str2, String str3, C12843d dVar) {
        C12821d dVar2 = new C12821d(str, str2, str3);
        return new C12863e(context, new C12791a().mo31343a(C12715a.m36955r()).mo31345a(m37344a(dVar2)).mo31348c(), dVar2, dVar);
    }
}
