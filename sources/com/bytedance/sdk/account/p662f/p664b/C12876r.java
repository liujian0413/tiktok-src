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
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.r */
public final class C12876r extends C12806h<C12710e<C12836s>> {

    /* renamed from: e */
    private C12836s f34041e;

    /* renamed from: a */
    private static C12791a m37447a(C12836s sVar) {
        return new C12791a().mo31346a(m37454b(sVar), sVar.f34010y);
    }

    /* renamed from: b */
    private static Map<String, String> m37454b(C12836s sVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(sVar.f33997a)) {
            hashMap.put("mobile", C6319n.m19597d(sVar.f33997a));
        }
        if (!TextUtils.isEmpty(sVar.f34003g)) {
            hashMap.put("old_mobile", C6319n.m19597d(sVar.f34003g));
        }
        if (!TextUtils.isEmpty(sVar.f33998b)) {
            hashMap.put("captcha", sVar.f33998b);
        }
        hashMap.put("type", C6319n.m19597d(String.valueOf(sVar.f34001e)));
        hashMap.put("unbind_exist", C6319n.m19597d(String.valueOf(sVar.f34002f)));
        hashMap.put("mix_mode", "1");
        if (sVar.f34011z == 1) {
            hashMap.put("check_register", "1");
        } else if (sVar.f34011z == 0) {
            hashMap.put("check_register", "0");
        }
        if (!TextUtils.isEmpty(sVar.f34005t)) {
            hashMap.put("ticket", sVar.f34005t);
        }
        hashMap.put("auto_read", String.valueOf(sVar.f34006u));
        if (!TextUtils.isEmpty(sVar.f34007v)) {
            hashMap.put("shark_ticket", sVar.f34007v);
        }
        if (!TextUtils.isEmpty(sVar.f34009x)) {
            hashMap.put("auth_token", sVar.f34009x);
        }
        if (!TextUtils.isEmpty(sVar.f34008w)) {
            hashMap.put("unusable_mobile_ticket", sVar.f34008w);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12836s> eVar) {
        C12884a.m37499a("passport_mobile_sendcode", "mobile", this.f33895b.mo31341a("type"), (C12707b) eVar, this.f33896c);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12836s> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1002, this.f34041e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34041e.f34004s = jSONObject2.optInt("retry_time", 30);
        this.f34041e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34041e, jSONObject);
        this.f34041e.f33964l = jSONObject2;
    }

    private C12876r(Context context, C12790a aVar, C12836s sVar, C12855p pVar) {
        super(context, aVar, pVar);
        this.f34041e = sVar;
    }

    /* renamed from: a */
    public static C12876r m37451a(Context context, String str, String str2, int i, C12855p pVar) {
        return m37448a(context, str, str2, i, 0, -1, pVar);
    }

    /* renamed from: a */
    private static C12876r m37448a(Context context, String str, String str2, int i, int i2, int i3, C12855p pVar) {
        C12836s sVar = new C12836s(str, str2, i, 0, -1);
        return new C12876r(context, m37447a(sVar).mo31343a(C12715a.m36939b()).mo31348c(), sVar, pVar);
    }

    /* renamed from: a */
    public static C12876r m37449a(Context context, String str, String str2, int i, int i2, String str3, int i3, int i4, C12855p pVar) {
        C12836s sVar = new C12836s(str, str2, i, i2, str3, i3, i4);
        Context context2 = context;
        return new C12876r(context, m37447a(sVar).mo31343a(C12715a.m36939b()).mo31348c(), sVar, pVar);
    }

    /* renamed from: a */
    public static C12876r m37450a(Context context, String str, String str2, int i, int i2, String str3, int i3, int i4, String str4, String str5, C12855p pVar) {
        C12836s sVar = new C12836s(str, str2, i, i2, str3, i3, i4, str4, str5);
        Context context2 = context;
        return new C12876r(context, m37447a(sVar).mo31343a(C12715a.m36939b()).mo31348c(), sVar, pVar);
    }
}
