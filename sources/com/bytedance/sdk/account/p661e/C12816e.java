package com.bytedance.sdk.account.p661e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12721e;
import com.bytedance.sdk.account.p645a.p649d.C12734f;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12795b.C12796a;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p666g.C12884a;
import com.bytedance.sdk.account.p667h.C12885a;
import com.bytedance.sdk.account.p668i.C12898b;
import com.bytedance.sdk.account.utils.C12914g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.e */
public final class C12816e extends C12806h<C12734f> {

    /* renamed from: e */
    C12898b f33910e;

    /* renamed from: f */
    private String f33911f = "";

    /* renamed from: g */
    private C12885a f33912g;

    /* renamed from: h */
    private JSONObject f33913h;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12734f fVar) {
        if (!TextUtils.isEmpty(this.f33911f)) {
            if (this.f33911f.equals("mobile")) {
                C12884a.m37499a("passport_mobile_reset_password", "mobile", "ticket", (C12707b) fVar, this.f33896c);
            } else if (this.f33911f.equals("email")) {
                C12884a.m37499a("passport_email_reset_password", "email", "ticket", (C12707b) fVar, this.f33896c);
            }
        }
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f33910e = C12796a.m37140a(jSONObject, jSONObject2);
        this.f33913h = jSONObject;
    }

    /* renamed from: a */
    private static Map<String, String> m37274a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("password", C6319n.m19597d(str));
        hashMap.put("ticket", C6319n.m19597d(str2));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* renamed from: b */
    private static Map<String, String> m37277b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("password", C6319n.m19597d(str));
        hashMap.put("ticket", str2);
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12734f mo31159a(boolean z, C12792b bVar) {
        C12734f fVar = new C12734f(z, 1018);
        if (z) {
            fVar.f33711g = this.f33910e;
        } else {
            fVar.f33702b = bVar.f33842b;
            fVar.f33703c = bVar.f33843c;
            if (this.f33912g.f34055g == 1075) {
                fVar.f33717m = this.f33912g.f34061m;
                fVar.f33720p = this.f33912g.f34064p;
                fVar.f33719o = this.f33912g.f34063o;
                fVar.f33718n = this.f33912g.f34062n;
                fVar.f33716l = this.f33912g.f34060l;
            }
        }
        fVar.f33705e = this.f33913h;
        return fVar;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f33913h = jSONObject2;
        C12795b.m37137a(this.f33912g, jSONObject, jSONObject2);
    }

    private C12816e(Context context, C12790a aVar, String str, C12721e eVar) {
        super(context, aVar, eVar);
        this.f33911f = str;
        this.f33912g = new C12885a();
    }

    /* renamed from: a */
    public static C12816e m37272a(Context context, String str, String str2, C12721e eVar) {
        return new C12816e(context, new C12791a().mo31343a(C12715a.m36949l()).mo31345a(m37274a(str, str2)).mo31348c(), "mobile", eVar);
    }

    /* renamed from: a */
    public static C12816e m37273a(Context context, String str, String str2, Map map, String str3, C12721e eVar) {
        return new C12816e(context, new C12791a().mo31343a(C12914g.m37592a(C12715a.m36951n(), str3)).mo31346a(m37277b(str, str2), map).mo31348c(), "email", eVar);
    }
}
