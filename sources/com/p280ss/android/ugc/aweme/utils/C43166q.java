package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.q */
public final class C43166q {

    /* renamed from: a */
    public static final C43166q f111789a = new C43166q();

    private C43166q() {
    }

    /* renamed from: a */
    public static final boolean m136903a(Aweme aweme) {
        AwemeStatus awemeStatus;
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl L = a.mo60042L();
        C7573i.m23582a((Object) L, "CommonSharePrefCache.inst().enableShoppingTotal");
        Object d = L.mo59877d();
        C7573i.m23582a(d, "CommonSharePrefCache.ins…enableShoppingTotal.cache");
        if (((Boolean) d).booleanValue()) {
            if (aweme != null) {
                awemeStatus = aweme.getStatus();
            } else {
                awemeStatus = null;
            }
            if (awemeStatus != null && aweme.getStatus().isWithGoods() && aweme.getPromotions().size() > 0 && C24671f.m80852b().shouldShowCard() && C24671f.m80860j().mo64772a(aweme)) {
                return true;
            }
        }
        return false;
    }
}
