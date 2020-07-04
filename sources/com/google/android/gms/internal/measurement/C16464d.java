package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C14931j;
import com.google.android.gms.analytics.p744a.C14920a;
import com.google.android.gms.analytics.p744a.C14921b;
import com.google.android.gms.analytics.p744a.C14922c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.d */
public final class C16464d extends C14931j<C16464d> {

    /* renamed from: a */
    public final Map<String, List<C14920a>> f46059a = new HashMap();

    /* renamed from: b */
    public C14921b f46060b;

    /* renamed from: c */
    private final List<C14920a> f46061c = new ArrayList();

    /* renamed from: d */
    private final List<C14922c> f46062d = new ArrayList();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.f46061c.isEmpty()) {
            hashMap.put("products", this.f46061c);
        }
        if (!this.f46062d.isEmpty()) {
            hashMap.put("promotions", this.f46062d);
        }
        if (!this.f46059a.isEmpty()) {
            hashMap.put("impressions", this.f46059a);
        }
        hashMap.put("productAction", this.f46060b);
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final List<C14920a> mo42650a() {
        return Collections.unmodifiableList(this.f46061c);
    }

    /* renamed from: b */
    public final List<C14922c> mo42651b() {
        return Collections.unmodifiableList(this.f46062d);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        C16464d dVar = (C16464d) jVar;
        dVar.f46061c.addAll(this.f46061c);
        dVar.f46062d.addAll(this.f46062d);
        for (Entry entry : this.f46059a.entrySet()) {
            String str = (String) entry.getKey();
            for (C14920a aVar : (List) entry.getValue()) {
                if (aVar != null) {
                    String str2 = str == null ? "" : str;
                    if (!dVar.f46059a.containsKey(str2)) {
                        dVar.f46059a.put(str2, new ArrayList());
                    }
                    ((List) dVar.f46059a.get(str2)).add(aVar);
                }
            }
        }
        if (this.f46060b != null) {
            dVar.f46060b = this.f46060b;
        }
    }
}
