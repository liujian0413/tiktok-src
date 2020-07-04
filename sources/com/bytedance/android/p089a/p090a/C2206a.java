package com.bytedance.android.p089a.p090a;

import android.view.View;
import com.bytedance.android.p089a.p090a.p095e.C2221a;
import com.bytedance.android.p089a.p090a.p097g.C2227a;
import com.bytedance.android.p089a.p090a.p097g.C2229c;
import com.bytedance.android.p089a.p090a.p098h.C2231b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.a.a.a */
public final class C2206a implements C2229c {

    /* renamed from: a */
    private Map<String, C2227a> f7442a = new ConcurrentHashMap();

    /* renamed from: a */
    public final void mo7932a() {
        for (C2227a aVar : this.f7442a.values()) {
            if (aVar != null) {
                aVar.mo7932a();
            }
        }
    }

    /* renamed from: a */
    public final void mo7934a(C2227a aVar) {
        String b = aVar.mo7969b();
        C2227a aVar2 = (C2227a) this.f7442a.get(b);
        if (!(aVar2 == null || aVar2 == aVar)) {
            StringBuilder sb = new StringBuilder("existing tracker with key:");
            sb.append(b);
            sb.append("found, replace it");
        }
        this.f7442a.put(b, aVar);
        aVar.mo7932a();
        aVar.mo7971d();
    }

    /* renamed from: a */
    public final void mo7933a(View view, C2221a aVar) {
        C2231b.m9596a(aVar);
        new StringBuilder("track_call_start:").append(aVar.toString());
        String str = aVar.f7464b;
        C2227a aVar2 = (C2227a) this.f7442a.get(str);
        if (aVar2 == null) {
            C2231b.m9604b(aVar);
            new StringBuilder("track_tracker_invalid:no tracker available for ").append(str);
            return;
        }
        aVar2.mo7933a(view, aVar);
    }
}
