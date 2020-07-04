package com.p280ss.android.ugc.aweme.main;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.cj */
final /* synthetic */ class C32933cj implements Callable {

    /* renamed from: a */
    private final String f85871a;

    /* renamed from: b */
    private final String f85872b;

    /* renamed from: c */
    private final String f85873c;

    /* renamed from: d */
    private final String f85874d;

    C32933cj(String str, String str2, String str3, String str4) {
        this.f85871a = str;
        this.f85872b = str2;
        this.f85873c = str3;
        this.f85874d = str4;
    }

    public final Object call() {
        return C6907h.m21524a(this.f85871a, (Map) C22984d.m75611a().mo59973a("previous_page", "homepage_hot").mo59973a("enter_method", this.f85872b).mo59973a("group_id", this.f85873c).mo59973a("author_id", this.f85874d).f60753a);
    }
}
