package com.bytedance.polaris.depend;

import android.app.Application;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.C42717b.C42718a;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.PolarisDependImpl.C42712a;

/* renamed from: com.bytedance.polaris.depend.j */
final class C12430j {
    /* renamed from: a */
    static Application m36167a() {
        Application d = C12428i.m36154d();
        if (d != null) {
            return d;
        }
        C6877n.m21447a("polaris_activity_crash", C6869c.m21381a().mo16887a("hook", "getApplication").mo16888b());
        return AwemeApplication.m21341a();
    }

    /* renamed from: b */
    static C12422c m36168b() {
        C12422c f = C12428i.m36156f();
        if (f != null) {
            return f;
        }
        C6877n.m21447a("polaris_activity_crash", C6869c.m21381a().mo16887a("hook", "getBusinessDepend").mo16888b());
        return C42712a.m135605a();
    }

    /* renamed from: c */
    static C12426g m36169c() {
        C12426g h = C12428i.m36158h();
        if (h != null) {
            return h;
        }
        C6877n.m21447a("polaris_activity_crash", C6869c.m21381a().mo16887a("hook", "getShareDepend").mo16888b());
        return C42718a.m135616a();
    }

    /* renamed from: d */
    static C12424e m36170d() {
        C12424e j = C12428i.m36160j();
        if (j != null) {
            return j;
        }
        C6877n.m21447a("polaris_activity_crash", C6869c.m21381a().mo16887a("hook", "getFoundationDepend").mo16888b());
        return C42712a.m135605a();
    }
}
