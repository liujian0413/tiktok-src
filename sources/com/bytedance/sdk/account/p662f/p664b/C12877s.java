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
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.s */
public final class C12877s extends C12806h<C12710e<C12836s>> {

    /* renamed from: e */
    private C12836s f34042e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31160a(C12707b bVar) {
    }

    /* renamed from: a */
    private static Map<String, String> m37461a(C12836s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C6319n.m19597d(sVar.f33997a));
        if (!TextUtils.isEmpty(sVar.f34003g)) {
            hashMap.put("old_mobile", C6319n.m19597d(sVar.f34003g));
        }
        hashMap.put("captcha", sVar.f33998b);
        hashMap.put("type", C6319n.m19597d(String.valueOf(sVar.f34001e)));
        hashMap.put("unbind_exist", C6319n.m19597d(String.valueOf(sVar.f34002f)));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12836s> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1002, this.f34042e);
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34042e, jSONObject);
        this.f34042e.f33964l = jSONObject2;
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34042e.f34004s = jSONObject2.optInt("retry_time", 30);
        this.f34042e.f33964l = jSONObject;
    }

    private C12877s(Context context, C12790a aVar, C12836s sVar, C12855p pVar) {
        super(context, aVar, pVar);
        this.f34042e = sVar;
    }

    /* renamed from: a */
    public static C12877s m37460a(Context context, String str, String str2, int i, C12855p pVar) {
        return m37459a(context, str, str2, i, 0, pVar);
    }

    /* renamed from: a */
    private static C12877s m37459a(Context context, String str, String str2, int i, int i2, C12855p pVar) {
        C12836s sVar = new C12836s(str, str2, i, 0, -1);
        return new C12877s(context, new C12791a().mo31343a(C12715a.m36963z()).mo31345a(m37461a(sVar)).mo31348c(), sVar, pVar);
    }
}
