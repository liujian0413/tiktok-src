package com.p280ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43470b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.o */
public final class C43517o implements C11093e {

    /* renamed from: a */
    private C11087a f112674a;

    /* renamed from: b */
    private C43470b f112675b;

    public C43517o(C11087a aVar, C43470b bVar) {
        this.f112674a = aVar;
        this.f112675b = bVar;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        try {
            iVar.f30173f = false;
            C43468a.m137933a(iVar, jSONObject, this.f112674a, this.f112675b).mo105394a();
        } catch (Exception unused) {
        }
    }
}
