package com.bytedance.sdk.account.p667h;

import android.content.Context;
import com.bytedance.sdk.account.p645a.C12714b.C12716b;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12712g;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12795b.C12796a;
import com.bytedance.sdk.account.p660d.C12806h;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.h.g */
public final class C12895g extends C12806h<C12712g> {

    /* renamed from: e */
    private C12896a f34077e = new C12896a();

    /* renamed from: com.bytedance.sdk.account.h.g$a */
    public static class C12896a extends C12894f {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31160a(C12707b bVar) {
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C12796a.m37142a(jSONObject, jSONObject2, (C12894f) this.f34077e);
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12796a.m37141a((C12894f) this.f34077e, jSONObject);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12712g mo31159a(boolean z, C12792b bVar) {
        C12712g a = C12796a.m37138a((C12894f) this.f34077e, z, 0);
        if (z) {
            a.f33711g = this.f34077e.f34072b;
        } else {
            a.f33702b = this.f34077e.f34055g;
            a.f33703c = this.f34077e.f34056h;
        }
        return a;
    }

    private C12895g(Context context, C12790a aVar, C12706a<C12712g> aVar2) {
        super(context, aVar, aVar2);
    }

    /* renamed from: a */
    public static C12895g m37531a(Context context, String str, C12706a<C12712g> aVar) {
        return new C12895g(context, C12795b.m37135a(str, null, null, null, null, null, null).mo31343a(C12716b.m36970f()).mo31347b(), aVar);
    }
}
