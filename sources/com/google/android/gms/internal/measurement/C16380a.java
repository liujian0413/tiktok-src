package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C14931j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.a */
public final class C16380a extends C14931j<C16380a> {

    /* renamed from: a */
    private Map<Integer, Double> f45854a = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f45854a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
            sb.append("metric");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final Map<Integer, Double> mo42470a() {
        return Collections.unmodifiableMap(this.f45854a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        ((C16380a) jVar).f45854a.putAll(this.f45854a);
    }
}
