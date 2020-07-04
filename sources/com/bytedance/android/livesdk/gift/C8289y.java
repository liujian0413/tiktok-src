package com.bytedance.android.livesdk.gift;

import com.bytedance.android.livesdkapi.p460k.C9498a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.y */
public final class C8289y {

    /* renamed from: b */
    private static C8289y f22765b;

    /* renamed from: a */
    public C9498a f22766a;

    /* renamed from: c */
    private final List<C8290a> f22767c = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.gift.y$a */
    public interface C8290a {
    }

    private C8289y() {
    }

    /* renamed from: b */
    public final long mo21445b() {
        if (this.f22766a != null) {
            return this.f22766a.f25988a;
        }
        return 0;
    }

    /* renamed from: a */
    public static synchronized C8289y m25347a() {
        C8289y yVar;
        synchronized (C8289y.class) {
            if (f22765b == null) {
                f22765b = new C8289y();
            }
            yVar = f22765b;
        }
        return yVar;
    }

    /* renamed from: a */
    public final void mo21444a(C8290a aVar) {
        if (!this.f22767c.contains(aVar)) {
            this.f22767c.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo21446b(C8290a aVar) {
        if (this.f22767c.contains(aVar)) {
            this.f22767c.remove(aVar);
        }
    }
}
