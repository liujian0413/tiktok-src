package com.bytedance.ies.web.jsbridge2;

import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.s */
public final class C11178s implements C11093e {

    /* renamed from: a */
    private Set<String> f30332a;

    /* renamed from: b */
    private C11156e f30333b;

    C11178s(C11156e eVar, Set<String> set) {
        this.f30332a = set;
        this.f30333b = eVar;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (this.f30332a.contains(iVar.f30170c)) {
            jSONObject.put("code", "-1");
            return;
        }
        iVar.f30173f = false;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("func", iVar.f30170c);
        jSONObject2.put("__msg_type", iVar.f30168a);
        jSONObject2.put("__callback_id", iVar.f30169b);
        jSONObject2.put("params", iVar.f30171d);
        jSONObject2.put("JSSDK", iVar.f30172e);
        this.f30333b.mo27167a(jSONObject2);
        new StringBuilder("Legacy call forwarded to new bridge: ").append(iVar.toString());
    }
}
