package com.bytedance.android.live.broadcast.p132c;

import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b.C2512a;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2513c;
import com.bytedance.android.live.broadcast.preview.C2846a.C2847a;
import com.bytedance.android.live.broadcast.preview.C2882b;

/* renamed from: com.bytedance.android.live.broadcast.c.a */
public final class C2503a implements C2506b {

    /* renamed from: a */
    private C2513c f8093a;

    /* renamed from: com.bytedance.android.live.broadcast.c.a$a */
    public static final class C2505a implements C2511b<C2506b> {
        /* renamed from: a */
        public final C2512a<C2506b> mo8847a(C2512a<C2506b> aVar) {
            return aVar.mo9081a(new C2503a()).mo9080a();
        }
    }

    private C2503a() {
    }

    /* renamed from: a */
    public final <T> T mo9072a(Class<T> cls) {
        return C2508d.m10407b(cls);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9073a(C2513c cVar) {
        this.f8093a = cVar;
        m10392a(C2882b.class, new C2847a());
    }

    /* renamed from: a */
    private <T> void m10392a(Class<T> cls, C2511b<T> bVar) {
        this.f8093a.mo9082a(cls, bVar);
    }
}
