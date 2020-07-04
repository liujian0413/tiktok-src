package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aw */
public final class C25252aw {

    /* renamed from: a */
    private static Aweme f66591a;

    /* renamed from: a */
    public static void m83004a() {
        Aweme aweme = f66591a;
        if (aweme != null) {
            C24976t.m82202e(C6399b.m19921a(), aweme);
        }
    }

    /* renamed from: b */
    public static void m83007b() {
        Aweme aweme = f66591a;
        if (aweme != null) {
            C25371n.m83440a((C25372a) new C25253ax(aweme));
        }
    }

    /* renamed from: a */
    public static void m83005a(Aweme aweme) {
        f66591a = aweme;
    }

    /* renamed from: a */
    static final /* synthetic */ void m83006a(Aweme aweme, boolean z) {
        if (z) {
            C24976t.m82212f(C6399b.m19921a(), aweme);
        } else {
            C24976t.m82220g(C6399b.m19921a(), aweme);
        }
    }
}
