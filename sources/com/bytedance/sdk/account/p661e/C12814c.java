package com.bytedance.sdk.account.p661e;

import android.content.Context;
import com.bytedance.sdk.account.p645a.C12714b.C12716b;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12719c;
import com.bytedance.sdk.account.p645a.p649d.C12731c;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b.C12796a;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p666g.C12884a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.c */
public final class C12814c extends C12806h<C12731c> {

    /* renamed from: e */
    private C12731c f33908e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12731c cVar) {
        C12884a.m37499a("passport_account_info", (String) null, (String) null, (C12707b) cVar, this.f33896c);
    }

    /* renamed from: a */
    public static C12814c m37259a(Context context, C12719c cVar) {
        return new C12814c(context, new C12791a().mo31343a(C12716b.m36971g()).mo31347b(), cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12731c mo31159a(boolean z, C12792b bVar) {
        C12731c cVar = this.f33908e;
        if (cVar == null) {
            cVar = new C12731c(z, 10017);
        } else {
            cVar.f33701a = z;
        }
        if (!z) {
            cVar.f33702b = bVar.f33842b;
            cVar.f33703c = bVar.f33843c;
        }
        return cVar;
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f33908e = new C12731c(true, 10017);
        this.f33908e.f33705e = jSONObject;
        this.f33908e.f33728h = C12796a.m37140a(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f33908e = new C12731c(false, 10017);
        this.f33908e.f33705e = jSONObject2;
        this.f33908e.f33727g = jSONObject.optString("name");
    }

    private C12814c(Context context, C12790a aVar, C12719c cVar) {
        super(context, aVar, cVar);
    }
}
