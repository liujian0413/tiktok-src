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
import com.bytedance.sdk.account.p662f.p663a.C12820c;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12842c;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.d */
public final class C12862d extends C12806h<C12710e<C12820c>> {

    /* renamed from: e */
    private C12820c f34027e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12820c> eVar) {
        C12884a.m37499a("passport_mobile_change", "mobile", (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37336a(C12820c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C6319n.m19597d(cVar.f33925a));
        if (!TextUtils.isEmpty(cVar.f33926b)) {
            hashMap.put("captcha", cVar.f33926b);
        }
        hashMap.put("code", C6319n.m19597d(cVar.f33927c));
        hashMap.put("mix_mode", "1");
        if (!TextUtils.isEmpty(cVar.f33928d)) {
            hashMap.put("ticket", cVar.f33928d);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12820c> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1011, this.f34027e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34027e.f33930f = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34027e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34027e, jSONObject);
        this.f34027e.f33964l = jSONObject2;
    }

    private C12862d(Context context, C12790a aVar, C12820c cVar, C12842c cVar2) {
        super(context, aVar, cVar2);
        this.f34027e = cVar;
    }

    /* renamed from: a */
    public static C12862d m37333a(Context context, String str, String str2, String str3, C12842c cVar) {
        C12820c cVar2 = new C12820c(str, str2, str3);
        return new C12862d(context, new C12791a().mo31343a(C12715a.m36958u()).mo31345a(m37336a(cVar2)).mo31348c(), cVar2, cVar);
    }

    /* renamed from: a */
    public static C12862d m37334a(Context context, String str, String str2, String str3, String str4, C12842c cVar) {
        C12820c cVar2 = new C12820c(str, str2, str3, str4);
        return new C12862d(context, new C12791a().mo31343a(C12715a.m36958u()).mo31345a(m37336a(cVar2)).mo31348c(), cVar2, cVar);
    }

    /* renamed from: a */
    public static C12862d m37335a(Context context, String str, String str2, String str3, String str4, Map map, C12842c cVar) {
        C12820c cVar2 = new C12820c(str, str2, str3, str4, map);
        return new C12862d(context, new C12791a().mo31343a(C12715a.m36958u()).mo31346a(m37336a(cVar2), cVar2.f33929e).mo31348c(), cVar2, cVar);
    }
}
