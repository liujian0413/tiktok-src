package com.p280ss.android.ugc.aweme.p332ml;

import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.p298ml.C6824e;
import com.p280ss.android.p298ml.C6827f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.setting.model.MLModel;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.n */
final class C33585n extends C6824e {
    C33585n(C6827f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final void mo85914a(Aweme aweme, Map<String, Object> map) {
        try {
            if (mo16672b()) {
                if (mo16677f()) {
                    MLModel a = C7173g.m22395a("profile");
                    List a2 = this.f19442b.mo16665a(map, mo16674c(), mo16675d(), mo16676e(), null);
                    if (a != null) {
                        int i = 0;
                        if (((String) a2.get(0)).equalsIgnoreCase("true")) {
                            if (a.params != null && a.params.length > 0) {
                                i = a.params[0];
                            }
                            aweme.getPreload().profilePreload = i;
                        }
                    }
                }
            }
        } catch (Exception e) {
            C2077a.m9160a((Throwable) e);
        }
    }
}
