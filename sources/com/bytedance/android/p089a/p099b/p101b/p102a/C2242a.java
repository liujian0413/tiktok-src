package com.bytedance.android.p089a.p099b.p101b.p102a;

import com.bytedance.android.p089a.p090a.p098h.C2232c;
import com.bytedance.android.p089a.p099b.C2236a;
import com.bytedance.android.p089a.p099b.p101b.C2249c;
import com.bytedance.android.p089a.p099b.p101b.C2251d;
import com.bytedance.android.p089a.p099b.p101b.p102a.C2244b.C2245a;
import java.util.List;

/* renamed from: com.bytedance.android.a.b.b.a.a */
public abstract class C2242a implements C2244b {

    /* renamed from: a */
    protected final C2236a f7497a;

    /* renamed from: com.bytedance.android.a.b.b.a.a$a */
    public static class C2243a implements C2245a {

        /* renamed from: a */
        private C2249c f7498a;

        /* renamed from: b */
        private int f7499b = 0;

        /* renamed from: c */
        private List<C2244b> f7500c;

        /* renamed from: a */
        public final C2249c mo7981a() {
            return this.f7498a;
        }

        /* renamed from: a */
        public final C2251d mo7982a(C2249c cVar) {
            if (cVar == null) {
                return C2251d.m9665a(C2232c.m9606a("null request"));
            }
            if (this.f7500c == null || this.f7500c.isEmpty()) {
                return C2251d.m9665a(C2232c.m9606a("no interceptor in the chain"));
            }
            if (this.f7499b >= this.f7500c.size()) {
                return C2251d.m9666a(C2232c.m9606a("interceptors index out of bound"), cVar);
            }
            C2244b bVar = (C2244b) this.f7500c.get(this.f7499b);
            if (bVar == null) {
                return C2251d.m9666a(C2232c.m9606a("null interceptor"), cVar);
            }
            this.f7498a = cVar;
            this.f7499b++;
            return bVar.mo7978a(this);
        }

        public C2243a(List<C2244b> list, int i) {
            this.f7500c = list;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2249c mo7979a(C2249c cVar) {
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2251d mo7980a(C2251d dVar) {
        return dVar;
    }

    public C2242a(C2236a aVar) {
        this.f7497a = aVar;
    }

    /* renamed from: a */
    public C2251d mo7978a(C2245a aVar) {
        return mo7980a(aVar.mo7982a(mo7979a(aVar.mo7981a())));
    }
}
