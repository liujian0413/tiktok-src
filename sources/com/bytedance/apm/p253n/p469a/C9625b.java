package com.bytedance.apm.p253n.p469a;

import com.bytedance.apm.C6159b;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.p252m.C6273b.C6276b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.n.a.b */
public final class C9625b implements C6276b {

    /* renamed from: a */
    public final HashMap<String, C9627a> f26323a;

    /* renamed from: com.bytedance.apm.n.a.b$a */
    static class C9627a {

        /* renamed from: a */
        public String f26327a;

        /* renamed from: b */
        public float f26328b;

        /* renamed from: c */
        private long f26329c = System.currentTimeMillis();

        /* renamed from: d */
        private int f26330d = 1;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final float mo23978a() {
            if (this.f26330d > 0) {
                return this.f26328b / ((float) this.f26330d);
            }
            return -1.0f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo23979a(float f) {
            this.f26328b += f;
            this.f26330d++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo23980a(long j) {
            if (j - this.f26329c > 120000) {
                return true;
            }
            return false;
        }

        C9627a(String str, float f) {
            this.f26327a = str;
            this.f26328b = f;
        }
    }

    /* renamed from: com.bytedance.apm.n.a.b$b */
    static class C9628b {

        /* renamed from: a */
        public static final C9625b f26331a = new C9625b();
    }

    /* renamed from: a */
    public static C9625b m28483a() {
        return C9628b.f26331a;
    }

    private C9625b() {
        this.f26323a = new HashMap<>();
        C6273b.m19475a().mo15065a((C6276b) this);
    }

    /* renamed from: a */
    public final void mo7731a(long j) {
        if (!this.f26323a.isEmpty()) {
            Iterator it = this.f26323a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                C9627a aVar = (C9627a) entry.getValue();
                if (aVar.mo23980a(j)) {
                    it.remove();
                    float a = aVar.mo23978a();
                    if (C6174c.m19149g()) {
                        StringBuilder sb = new StringBuilder("聚合 fps: ");
                        sb.append(str);
                        sb.append(" , value: ");
                        sb.append(a);
                        String[] strArr = {sb.toString()};
                    }
                    if (a > 0.0f) {
                        if (a > 60.0f) {
                            a = 60.0f;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fps", (double) a);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("scene", str);
                            C6159b.m19109a("fps", str, jSONObject, jSONObject2, (JSONObject) null);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23976a(final String str, final float f) {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C9627a aVar = (C9627a) C9625b.this.f26323a.get(str);
                if (aVar == null) {
                    C9625b.this.f26323a.put(str, new C9627a(str, f));
                    return;
                }
                aVar.mo23979a(f);
            }
        });
    }
}
