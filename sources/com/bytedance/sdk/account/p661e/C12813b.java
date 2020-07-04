package com.bytedance.sdk.account.p661e;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12718b;
import com.bytedance.sdk.account.p645a.p649d.C12730b;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.b */
public final class C12813b extends C12806h<C12730b> {

    /* renamed from: e */
    private C12730b f33907e;

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12730b bVar) {
        C12884a.m37499a("passport_check_password", (String) null, (String) null, (C12707b) bVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37252a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("password", C6319n.m19597d(str));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12730b mo31159a(boolean z, C12792b bVar) {
        C12730b bVar2 = this.f33907e;
        if (bVar2 == null) {
            bVar2 = new C12730b(z, 10011);
        } else {
            bVar2.f33701a = z;
        }
        if (!z) {
            bVar2.f33702b = bVar.f33842b;
            bVar2.f33703c = bVar.f33843c;
        }
        return bVar2;
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f33907e = new C12730b(true, 10011);
        this.f33907e.f33726g = jSONObject2.optString("captcha");
    }

    private C12813b(Context context, C12790a aVar, C12718b bVar) {
        super(context, aVar, bVar);
    }

    /* renamed from: a */
    public static C12813b m37251a(Context context, String str, C12718b bVar) {
        return new C12813b(context, new C12791a().mo31343a(C12715a.m36928C()).mo31345a(m37252a(str)).mo31348c(), bVar);
    }
}
