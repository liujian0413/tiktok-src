package com.iab.omid.library.bytedance.walking.p794a;

import com.iab.omid.library.bytedance.walking.p794a.C18440b.C18441a;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.bytedance.walking.a.c */
public final class C18443c implements C18441a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f49999a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f50000b;

    /* renamed from: c */
    private final ArrayDeque<C18440b> f50001c = new ArrayDeque<>();

    /* renamed from: d */
    private C18440b f50002d = null;

    public C18443c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f49999a);
        this.f50000b = threadPoolExecutor;
    }

    /* renamed from: a */
    private void m60727a() {
        this.f50002d = (C18440b) this.f50001c.poll();
        if (this.f50002d != null) {
            this.f50002d.mo47882a(this.f50000b);
        }
    }

    /* renamed from: a */
    public final void mo47884a(C18440b bVar) {
        this.f50002d = null;
        m60727a();
    }

    /* renamed from: b */
    public final void mo47887b(C18440b bVar) {
        bVar.f49997d = this;
        this.f50001c.add(bVar);
        if (this.f50002d == null) {
            m60727a();
        }
    }
}
