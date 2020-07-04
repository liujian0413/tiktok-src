package com.bytedance.apm.p241f.p242a;

import com.bytedance.apm.C6174c;
import com.bytedance.apm.p241f.C6189a;
import com.bytedance.apm.p241f.C6201d;
import com.bytedance.apm.p247j.C6240a;
import com.bytedance.apm.p247j.C6242c;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.a.a */
public class C6191a extends C6189a<C6201d> {

    /* renamed from: b */
    private static volatile C6191a f18241b;

    private C6191a() {
    }

    /* renamed from: b */
    public static C6191a m19218b() {
        if (f18241b == null) {
            synchronized (C6191a.class) {
                if (f18241b == null) {
                    f18241b = new C6191a();
                }
            }
        }
        return f18241b;
    }

    /* renamed from: d */
    public final void mo14924d(C6201d dVar) {
        JSONObject a = dVar.mo14926a();
        boolean a2 = dVar.mo14927a(this);
        if (C6174c.m19149g()) {
            String str = C6240a.f18363h;
            StringBuilder sb = new StringBuilder("logType: ");
            sb.append(dVar.mo14928b());
            sb.append(", subType: ");
            sb.append(dVar.mo14929c());
            sb.append("data: ");
            sb.append(a);
            StringBuilder sb2 = new StringBuilder(" ,sample: ");
            sb2.append(a2);
            C6242c.m19340a(str, sb.toString(), sb2.toString());
        }
        if (a2 || dVar.mo14930d()) {
            mo14917a(dVar.mo14928b(), dVar.mo14929c(), a, a2, dVar.mo14931e());
        }
    }
}
