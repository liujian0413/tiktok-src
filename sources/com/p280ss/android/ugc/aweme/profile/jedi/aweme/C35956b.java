package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.model.p602d.C11800e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.b */
public final class C35956b extends C11800e<Aweme, Aweme> {
    /* renamed from: a */
    public final /* synthetic */ C7492s mo29350a(Object obj) {
        return m115896b((Aweme) obj);
    }

    /* renamed from: b */
    private static C7492s<Aweme> m115896b(Aweme aweme) {
        C7573i.m23587b(aweme, "req");
        C7492s<Aweme> b = C7492s.m23301b(aweme);
        C7573i.m23582a((Object) b, "Observable.just(req)");
        return b;
    }

    /* renamed from: a */
    public final void mo90895a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        mo29357c(aweme).mo19333l();
    }
}
