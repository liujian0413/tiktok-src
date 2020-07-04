package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.net.Uri;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.utils.C43011cf;

/* renamed from: com.ss.android.ugc.aweme.fe.method.l */
public final class C27995l {

    /* renamed from: a */
    public static final C27995l f73731a = new C27995l();

    private C27995l() {
    }

    /* renamed from: a */
    public static final boolean m91593a(String str) {
        if (str == null) {
            return false;
        }
        try {
            if (C32430a.m105068e() != null && C32430a.m105068e().mo22014a(C6399b.m19921a(), Uri.parse(str))) {
                return true;
            }
        } catch (Throwable th) {
            C2077a.m9160a(th);
        }
        if (!C43011cf.m136512a(str)) {
            return false;
        }
        C32430a.m105071h();
        return true;
    }
}
