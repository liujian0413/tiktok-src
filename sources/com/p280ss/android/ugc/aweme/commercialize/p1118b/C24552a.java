package com.p280ss.android.ugc.aweme.commercialize.p1118b;

import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22377b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.a */
public final class C24552a implements C22377b {
    /* renamed from: a */
    public final String mo58840a() {
        try {
            return C30199h.m98861a().getAwemeFeConf().getLinkPlan().getInfo();
        } catch (NullValueException unused) {
            return null;
        }
    }
}
