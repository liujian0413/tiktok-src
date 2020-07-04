package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.cj */
public final class C15599cj {

    /* renamed from: a */
    public final C15600ck f44224a;

    /* renamed from: b */
    private final Map<String, C15598ci> f44225b = new HashMap();

    public C15599cj(C15600ck ckVar) {
        this.f44224a = ckVar;
    }

    /* renamed from: a */
    public final void mo41452a(String str, C15598ci ciVar) {
        this.f44225b.put(str, ciVar);
    }

    /* renamed from: a */
    public final void mo41453a(String str, String str2, long j) {
        C15598ci ciVar;
        C15600ck ckVar = this.f44224a;
        C15598ci ciVar2 = (C15598ci) this.f44225b.get(str2);
        String[] strArr = {str};
        if (!(ckVar == null || ciVar2 == null)) {
            ckVar.mo41459a(ciVar2, j, strArr);
        }
        Map<String, C15598ci> map = this.f44225b;
        C15600ck ckVar2 = this.f44224a;
        if (ckVar2 == null) {
            ciVar = null;
        } else {
            ciVar = ckVar2.mo41455a(j);
        }
        map.put(str, ciVar);
    }
}
