package com.bytedance.ies.web.p583b;

import com.bytedance.ies.web.jsbridge2.CallContext;
import com.bytedance.ies.web.p583b.C11110e.C11112b;
import com.bytedance.ies.web.p583b.C11126n.C11128b;
import com.bytedance.ies.web.p583b.C11136p.C11137a;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C48038d;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.b.j */
public final class C11118j implements C11113f, C11128b {

    /* renamed from: a */
    private C11126n f30193a;

    /* renamed from: b */
    private final C11119k f30194b;

    /* renamed from: c */
    private C11114g f30195c;

    /* renamed from: a */
    public final void mo27095a(C11114g gVar) {
        this.f30195c = gVar;
    }

    /* renamed from: a */
    public final void mo27103a(Throwable th) {
        C7573i.m23587b(th, "throwable");
        C11114g gVar = this.f30195c;
        if (gVar != null) {
            gVar.mo27098a(th);
        }
    }

    /* renamed from: a */
    public final void mo27102a(C11112b bVar) {
        int i;
        C7573i.m23587b(bVar, "response");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("raw", new JSONObject(new String(bVar.mo27094b(), C48038d.f122880a)));
        JSONObject jSONObject2 = new JSONObject();
        for (Entry entry : bVar.mo27091a().entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("headers", jSONObject2);
        String str = "cached";
        C11126n nVar = this.f30193a;
        if (nVar != null) {
            i = nVar.f30209c;
        } else {
            i = 0;
        }
        jSONObject.put(str, i);
        C11114g gVar = this.f30195c;
        if (gVar != null) {
            gVar.mo27099a(jSONObject);
        }
    }

    public C11118j(C11119k kVar, C11114g gVar) {
        C7573i.m23587b(kVar, "handler");
        this.f30194b = kVar;
        this.f30195c = gVar;
    }

    /* renamed from: a */
    public final void mo27096a(JSONObject jSONObject, CallContext callContext) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(callContext, "context");
        this.f30193a = this.f30194b.mo27104a(C11137a.m32601a(jSONObject));
        C11126n nVar = this.f30193a;
        if (nVar != null) {
            nVar.mo27108a((C11128b) this);
        }
    }
}
