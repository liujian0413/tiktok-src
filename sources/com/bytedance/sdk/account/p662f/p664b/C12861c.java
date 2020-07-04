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
import com.bytedance.sdk.account.p662f.p663a.C12819b;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12841b;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.c */
public final class C12861c extends C12806h<C12710e<C12819b>> {

    /* renamed from: e */
    private C12819b f34026e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12819b> eVar) {
        C12884a.m37499a("passport_mobile_bind", "mobile", (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37326a(C12819b bVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(bVar.f33921c)) {
            hashMap.put("captcha", bVar.f33921c);
        }
        hashMap.put("code", C6319n.m19597d(bVar.f33920b));
        hashMap.put("mobile", C6319n.m19597d(bVar.f33919a));
        hashMap.put("password", C6319n.m19597d(bVar.f33922d));
        hashMap.put("unbind_exist", C6319n.m19597d(String.valueOf(bVar.f33923e)));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12819b> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1012, this.f34026e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34026e.f33924f = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34026e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34026e, jSONObject);
        this.f34026e.f33964l = jSONObject2;
    }

    private C12861c(Context context, C12790a aVar, C12819b bVar, C12841b bVar2) {
        super(context, aVar, bVar2);
        this.f34026e = bVar;
    }

    /* renamed from: a */
    public static C12861c m37325a(Context context, String str, String str2, String str3, String str4, int i, C12841b bVar) {
        C12819b bVar2 = new C12819b(str, str2, null, str4, i);
        return new C12861c(context, new C12791a().mo31343a(C12715a.m36957t()).mo31345a(m37326a(bVar2)).mo31348c(), bVar2, bVar);
    }
}
