package com.p280ss.android.ugc.aweme.discover.mob;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.s */
final /* synthetic */ class C26798s implements Callable {

    /* renamed from: a */
    private final String f70725a;

    C26798s(String str) {
        this.f70725a = str;
    }

    public final Object call() {
        return C6907h.m21525a("enter_category_tab", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", "discovery").mo59973a("tab_name", this.f70725a).f60753a));
    }
}
