package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.depend.live.C9337k;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.ae */
public final class C3904ae implements C9337k {

    /* renamed from: a */
    private Map<String, C3905a> f11654a = new HashMap();

    /* renamed from: com.bytedance.android.livesdk.ae$a */
    interface C3905a {
        /* renamed from: a */
        String mo11398a();

        /* renamed from: a */
        boolean mo11399a(Map<String, String> map);
    }

    public C3904ae() {
        C3851ac acVar = new C3851ac();
        this.f11654a.put(acVar.mo11398a(), acVar);
    }

    /* renamed from: a */
    public final boolean mo11445a(Map<String, String> map) {
        if (this.f11654a == null) {
            return false;
        }
        Set keySet = this.f11654a.keySet();
        if (C6307b.m19566a((Collection<T>) keySet)) {
            return false;
        }
        String str = (String) map.remove("intercept");
        if (C6319n.m19593a(str) || !keySet.contains(str) || this.f11654a.get(str) == null) {
            return false;
        }
        return ((C3905a) this.f11654a.get(str)).mo11399a(map);
    }
}
