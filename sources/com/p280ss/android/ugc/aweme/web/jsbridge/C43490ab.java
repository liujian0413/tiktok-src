package com.p280ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.poi.event.MeiweiOrderEvent;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ab */
public final class C43490ab implements C11093e {
    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (iVar != null && iVar.f30171d != null) {
            try {
                C42961az.m136380a(new MeiweiOrderEvent(iVar.f30171d.optString("type"), iVar.f30171d.optInt("result")));
            } catch (Exception unused) {
            }
        }
    }
}
