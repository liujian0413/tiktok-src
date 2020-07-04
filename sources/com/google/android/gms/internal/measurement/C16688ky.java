package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C14931j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ky */
public final class C16688ky extends C14931j<C16688ky> {

    /* renamed from: a */
    private Map<Integer, String> f46623a = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f46623a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("dimension");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final Map<Integer, String> mo43172a() {
        return Collections.unmodifiableMap(this.f46623a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        ((C16688ky) jVar).f46623a.putAll(this.f46623a);
    }
}
