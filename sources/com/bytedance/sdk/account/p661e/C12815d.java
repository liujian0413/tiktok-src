package com.bytedance.sdk.account.p661e;

import android.content.Context;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12720d;
import com.bytedance.sdk.account.p645a.p649d.C12733e;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b.C12796a;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.d */
public final class C12815d extends C12806h<C12733e> {

    /* renamed from: e */
    C12898b f33909e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31160a(C12707b bVar) {
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f33909e = C12796a.m37140a(jSONObject, jSONObject2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12733e mo31159a(boolean z, C12792b bVar) {
        C12733e eVar = new C12733e(z, BaseNotice.HASHTAG);
        if (z) {
            eVar.f33711g = this.f33909e;
        } else {
            eVar.f33702b = bVar.f33842b;
            eVar.f33703c = bVar.f33843c;
        }
        return eVar;
    }

    private C12815d(Context context, C12790a aVar, C12706a aVar2) {
        super(context, aVar, aVar2);
    }

    /* renamed from: a */
    public static C12815d m37266a(Context context, String str, C12720d dVar) {
        return new C12815d(context, new C12791a().mo31343a(C12715a.m36927B()).mo31344a("to_user_id", str).mo31347b(), dVar);
    }
}
