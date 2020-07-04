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
import com.bytedance.sdk.account.p662f.p663a.C12828k;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12856q;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.t */
public final class C12878t extends C12806h<C12710e<C12879a>> {

    /* renamed from: e */
    private C12879a f34043e;

    /* renamed from: com.bytedance.sdk.account.f.b.t$a */
    public static class C12879a extends C12828k {

        /* renamed from: a */
        String f34044a;

        /* renamed from: b */
        String f34045b;

        public C12879a(String str, String str2) {
            super(13);
            this.f34044a = str;
            this.f34045b = str2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12879a> eVar) {
        C12884a.m37499a("passport_mobile_set_password", "mobile", (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37468a(C12879a aVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(aVar.f34045b)) {
            hashMap.put("captcha", aVar.f34045b);
        }
        hashMap.put("password", C6319n.m19597d(aVar.f34044a));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34043e.f33964l = jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12879a> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 10002, this.f34043e);
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34043e, jSONObject);
        this.f34043e.f33964l = jSONObject2;
    }

    private C12878t(Context context, C12790a aVar, C12879a aVar2, C12856q qVar) {
        super(context, aVar, qVar);
        this.f34043e = aVar2;
    }

    /* renamed from: a */
    public static C12878t m37467a(Context context, String str, String str2, C12856q qVar) {
        C12879a aVar = new C12879a(str, str2);
        return new C12878t(context, new C12791a().mo31343a(C12715a.m36959v()).mo31345a(m37468a(aVar)).mo31348c(), aVar, qVar);
    }
}
