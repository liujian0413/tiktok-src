package com.p280ss.android.ugc.aweme.sec.p1510b;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.sec.p1511c.C37409b;
import com.p280ss.sys.ces.out.ISdk;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sec.b.a */
public final class C37405a {

    /* renamed from: a */
    private final ISdk f97695a;

    public C37405a(ISdk iSdk) {
        this.f97695a = iSdk;
    }

    /* renamed from: a */
    public final void mo94174a(String str) {
        C7573i.m23587b(str, "scene");
        StringBuilder sb = new StringBuilder("report .... scene = ");
        sb.append(str);
        C37409b.m120035a("DataReport", sb.toString());
        if (C6399b.m19928c()) {
            C37409b.m120035a("SecDialog", "report return ");
            return;
        }
        ISdk iSdk = this.f97695a;
        if (iSdk != null) {
            iSdk.reportNow(str);
        }
    }
}
