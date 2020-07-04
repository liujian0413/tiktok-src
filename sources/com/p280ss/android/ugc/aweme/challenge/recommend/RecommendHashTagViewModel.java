package com.p280ss.android.ugc.aweme.challenge.recommend;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import com.p280ss.android.ugc.aweme.challenge.recommend.p1085a.C23700b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35589e;

/* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel */
public class RecommendHashTagViewModel extends C0063u {

    /* renamed from: a */
    private C0052o<C23700b> f62457a;

    /* renamed from: a */
    public final C0052o<C23700b> mo61659a() {
        if (this.f62457a == null) {
            this.f62457a = new C0052o<>();
        }
        return this.f62457a;
    }

    /* renamed from: a */
    public final void mo61660a(C35589e eVar) {
        if (this.f62457a == null) {
            this.f62457a = new C0052o<>();
        }
        RecommendHashTagApi.m77667a(this.f62457a, eVar);
    }
}
