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
import com.bytedance.sdk.account.p662f.p663a.C12837t;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12857r;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.u */
public final class C12880u extends C12806h<C12710e<C12837t>> {

    /* renamed from: e */
    private C12837t f34046e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12837t> eVar) {
        C12884a.m37499a("passport_account_login", (String) null, (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37476a(C12837t tVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(tVar.f34012a)) {
            hashMap.put("email", C6319n.m19597d(tVar.f34012a));
        }
        if (!TextUtils.isEmpty(tVar.f34014c)) {
            hashMap.put("mobile", C6319n.m19597d(tVar.f34014c));
        }
        if (!TextUtils.isEmpty(tVar.f34013b)) {
            hashMap.put("username", C6319n.m19597d(tVar.f34013b));
        }
        if (!TextUtils.isEmpty(tVar.f34015d)) {
            hashMap.put("account", C6319n.m19597d(tVar.f34015d));
        }
        if (!TextUtils.isEmpty(tVar.f34017f)) {
            hashMap.put("token", tVar.f34017f);
        }
        if (!TextUtils.isEmpty(tVar.f34018g)) {
            hashMap.put("captcha", tVar.f34018g);
        }
        if (tVar.f34019s > 0) {
            hashMap.put("scene", C6319n.m19597d(String.valueOf(tVar.f34019s)));
        }
        hashMap.put("password", C6319n.m19597d(tVar.f34016e));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12837t> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1016, this.f34046e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34046e.f34020t = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34046e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34046e, jSONObject);
        this.f34046e.f33964l = jSONObject2;
    }

    private C12880u(Context context, C12790a aVar, C12837t tVar, C12857r rVar) {
        super(context, aVar, rVar);
        this.f34046e = tVar;
    }

    /* renamed from: a */
    public static C12880u m37475a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, C12857r rVar) {
        C12837t tVar = new C12837t(str2, str3, str, null, str5, str6, str7, 0);
        Context context2 = context;
        return new C12880u(context, new C12791a().mo31343a(C12715a.m36961x()).mo31345a(m37476a(tVar)).mo31348c(), tVar, rVar);
    }
}
