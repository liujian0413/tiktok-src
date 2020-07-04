package com.bytedance.sdk.account.p661e;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12722f;
import com.bytedance.sdk.account.p645a.p649d.C12735g;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.f */
public final class C12817f extends C12806h<C12735g> {
    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12735g gVar) {
        C12884a.m37499a("passport_update_pwd", (String) null, (String) null, (C12707b) gVar, this.f33896c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12707b mo31159a(boolean z, C12792b bVar) {
        return m37285b(z, bVar);
    }

    /* renamed from: b */
    private static C12735g m37285b(boolean z, C12792b bVar) {
        C12735g gVar = new C12735g(z, 10012);
        if (!z) {
            gVar.f33702b = bVar.f33842b;
            gVar.f33703c = bVar.f33843c;
        }
        return gVar;
    }

    /* renamed from: a */
    private static Map<String, String> m37283a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("current_password", C6319n.m19597d(str));
        hashMap.put("password", C6319n.m19597d(str2));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    private C12817f(Context context, C12790a aVar, C12722f fVar) {
        super(context, aVar, fVar);
    }

    /* renamed from: a */
    public static C12817f m37282a(Context context, String str, String str2, C12722f fVar) {
        return new C12817f(context, new C12791a().mo31343a(C12715a.m36929D()).mo31345a(m37283a(str, str2)).mo31348c(), fVar);
    }
}
