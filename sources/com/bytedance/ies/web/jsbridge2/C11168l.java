package com.bytedance.ies.web.jsbridge2;

import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.l */
final class C11168l extends C11151b {

    /* renamed from: a */
    private C11093e f30308a;

    C11168l(C11093e eVar) {
        this.f30308a = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27154a(C11171o oVar, C11179t tVar) throws Exception {
        C11097i iVar = new C11097i();
        iVar.f30170c = oVar.f30312d;
        iVar.f30171d = new JSONObject(oVar.f30313e);
        iVar.f30169b = oVar.f30314f;
        iVar.f30168a = oVar.f30311c;
        iVar.f30172e = 0;
        iVar.f30173f = true;
        JSONObject jSONObject = new JSONObject();
        new StringBuilder("Invoking legacy method with: ").append(iVar.toString());
        try {
            this.f30308a.call(iVar, jSONObject);
        } catch (Exception unused) {
        }
        if (!iVar.f30173f) {
            new StringBuilder("No need for callback: ").append(iVar.toString());
            return;
        }
        tVar.mo27216a(jSONObject.toString());
        if (C11165i.m32685a()) {
            if (jSONObject.optInt("code", 0) == 1) {
                new StringBuilder("Method succeed with: ").append(iVar.toString());
                return;
            }
            new StringBuilder("No need for callback, but error occurred: ").append(iVar.toString());
        }
    }
}
