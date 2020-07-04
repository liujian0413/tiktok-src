package com.p280ss.android.ugc.aweme.p332ml;

import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.p298ml.C6824e;
import com.p280ss.android.p298ml.C6827f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.q */
public final class C7176q extends C6824e {

    /* renamed from: d */
    public volatile String f20101d;

    /* renamed from: e */
    public volatile float f20102e = -1.0f;

    C7176q(C6827f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final void mo18653a(Aweme aweme, Map<String, Object> map) {
        String str;
        float f;
        try {
            if (mo16672b() && mo16677f() && map != null) {
                if (map.size() != 0) {
                    if (C7163a.m22363a()) {
                        Iterator it = map.keySet().iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                    HashMap hashMap = new HashMap();
                    List a = this.f19442b.mo16665a(map, mo16674c(), mo16675d(), mo16676e(), hashMap);
                    if (C7163a.m22363a()) {
                        Iterator it2 = hashMap.keySet().iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                    }
                    if (a == null || a.size() <= 0) {
                        str = null;
                    } else {
                        str = (String) a.get(0);
                    }
                    this.f20101d = str;
                    if (this.f20101d == null || !hashMap.containsKey(this.f20101d)) {
                        f = -1.0f;
                    } else {
                        f = ((Float) hashMap.get(this.f20101d)).floatValue();
                    }
                    this.f20102e = f;
                }
            }
        } catch (Exception e) {
            C2077a.m9160a((Throwable) e);
        }
    }
}
