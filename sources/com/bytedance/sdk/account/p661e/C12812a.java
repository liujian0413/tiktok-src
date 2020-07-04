package com.bytedance.sdk.account.p661e;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12717a;
import com.bytedance.sdk.account.p645a.p649d.C12729a;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.utils.C12914g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.a */
public final class C12812a extends C12806h<C12729a> {

    /* renamed from: e */
    private String f33905e;

    /* renamed from: f */
    private JSONObject f33906f;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31160a(C12707b bVar) {
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f33906f = jSONObject2;
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f33905e = jSONObject2.optString("ticket");
        this.f33906f = jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12729a mo31159a(boolean z, C12792b bVar) {
        C12729a aVar = new C12729a(z, 1019);
        if (z) {
            aVar.f33725g = this.f33905e;
        } else {
            aVar.f33702b = bVar.f33842b;
            aVar.f33703c = bVar.f33843c;
        }
        aVar.f33705e = this.f33906f;
        return aVar;
    }

    private C12812a(Context context, C12790a aVar, C12717a aVar2) {
        super(context, aVar, aVar2);
    }

    /* renamed from: b */
    private static Map<String, String> m37246b(String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("email", C6319n.m19597d(str));
        hashMap.put("code", C6319n.m19597d(str2));
        hashMap.put("type", String.valueOf(i));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* renamed from: a */
    private static Map<String, String> m37244a(String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C6319n.m19597d(str));
        hashMap.put("code", C6319n.m19597d(str2));
        hashMap.put("type", String.valueOf(i));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* renamed from: a */
    public static C12812a m37242a(Context context, String str, String str2, int i, C12717a aVar) {
        return new C12812a(context, new C12791a().mo31343a(C12715a.m36948k()).mo31345a(m37244a(str, str2, i)).mo31348c(), aVar);
    }

    /* renamed from: a */
    public static C12812a m37243a(Context context, String str, String str2, int i, Map map, String str3, C12717a aVar) {
        return new C12812a(context, new C12791a().mo31343a(C12914g.m37592a(C12715a.m36950m(), str3)).mo31346a(m37246b(str, str2, i), map).mo31348c(), aVar);
    }
}
