package com.p280ss.android.ugc.aweme;

import android.content.Context;
import bolts.C1592h;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.C18892b;
import com.p280ss.android.sdk.p899a.C20098b;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a;
import com.p280ss.android.ugc.aweme.p1354j.C32197a;
import com.p280ss.android.ugc.aweme.user.C42800a;
import com.p280ss.android.ugc.aweme.user.C42811c;
import com.p280ss.android.ugc.aweme.user.C42813d;
import com.p280ss.android.ugc.aweme.user.C42813d.C42814a;
import com.p280ss.android.ugc.aweme.user.p1689d.C42832d;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.aweme.bl */
public final class C21679bl {

    /* renamed from: a */
    public boolean f58086a;

    /* renamed from: a */
    public static void m72577a() {
        C1592h.m7853a(C21682bo.f58089a);
    }

    public C21679bl() {
        C42811c.m135845a();
        if (C42811c.m135867c()) {
            C1592h.m7855a(C21680bm.f58087a, (Executor) C32197a.m104473a());
        } else {
            C21225a.m71440b("not login");
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m72576a(C12898b bVar) throws Exception {
        AccountLoginAlogHelper.m71521b("begin to update sp");
        C42832d.m135992a(bVar.f34084g.toString());
        AccountLoginAlogHelper.m71521b("asynchronous_check");
        return null;
    }

    /* renamed from: a */
    public final void mo57953a(C12898b bVar, String str) {
        String str2;
        if (bVar != null && bVar.f34078a != 0) {
            AccountLoginAlogHelper.m71513a(bVar);
            this.f58086a = bVar.f34081d;
            C18892b bVar2 = (C18892b) bVar;
            C20098b.m66270a().mo53818a(bVar2, (Context) C21683bp.m72587b());
            try {
                str2 = bVar.f34083f.getString("country_code");
            } catch (JSONException unused) {
                str2 = "";
            }
            C42813d.m135933a(String.valueOf(bVar.f34078a));
            C42813d.f111272b.mo104507a(C42814a.m135957a(bVar2.f34078a, bVar2.f34082e, bVar2.f50900h, bVar2.f50908E, str2));
            C42813d.f111272b.mo104506a(C42800a.m135827a(bVar2));
            AccountLoginAlogHelper.m71521b("synchronous_check");
            C1592h.m7855a((Callable<TResult>) new C21681bn<TResult>(bVar), (Executor) C32197a.m104473a());
        }
    }
}
