package com.bytedance.apm.p253n.p469a;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p241f.p242a.C6191a;
import com.bytedance.apm.p241f.p243b.C9598c;
import com.bytedance.frameworks.apm.trace.C10066g;
import com.bytedance.frameworks.apm.trace.C10066g.C10067a;
import com.bytedance.frameworks.apm.trace.MethodTracer;
import com.bytedance.frameworks.apm.trace.Type;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.n.a.a */
public final class C9623a {

    /* renamed from: a */
    private static final C10067a f26322a = new C10067a() {
        /* renamed from: a */
        public final void mo23975a(C10066g gVar) {
            try {
                if (gVar.f27391a == Type.NORMAL && ApmDelegate.getInstance().getApmInitConfig().f18178e) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("stack", gVar.f27393c);
                    jSONObject.put("stack_key", gVar.f27392b);
                    jSONObject.put("scene", gVar.f27394d);
                    jSONObject.put("cost_time", gVar.f27396f);
                    jSONObject.put("method_time", gVar.f27398h);
                    jSONObject.put("timestamp", gVar.f27395e);
                    jSONObject.put("event_type", "lag_drop_frame");
                    C6191a.m19218b().mo14915a(new C9598c("drop_frame_stack", jSONObject));
                }
            } catch (Exception unused) {
            }
        }
    };

    /* renamed from: a */
    public static void m28481a(boolean z, String str, long j) {
        if (z) {
            MethodTracer.getInstance().doFrame(z, str, j, f26322a);
            return;
        }
        MethodTracer.getInstance().doFrame(false, null, 0, null);
    }
}
