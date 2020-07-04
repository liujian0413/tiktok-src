package com.p280ss.android.ugc.aweme.audio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.audio.h */
public final class C23106h {

    /* renamed from: a */
    private static final Object f61017a = new Object();

    /* renamed from: b */
    private static volatile C23106h f61018b;

    /* renamed from: c */
    private List<C23107a> f61019c;

    /* renamed from: com.ss.android.ugc.aweme.audio.h$a */
    public interface C23107a {
        /* renamed from: a */
        boolean mo60182a(boolean z);
    }

    private C23106h() {
        if (f61018b != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    /* renamed from: a */
    public static C23106h m75943a() {
        if (f61018b == null) {
            synchronized (f61017a) {
                if (f61018b == null) {
                    f61018b = new C23106h();
                }
            }
        }
        return f61018b;
    }

    /* renamed from: b */
    public final void mo60193b(C23107a aVar) {
        synchronized (f61017a) {
            if (this.f61019c != null) {
                this.f61019c.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo60191a(C23107a aVar) {
        synchronized (f61017a) {
            if (this.f61019c == null) {
                this.f61019c = new ArrayList();
            }
            if (!this.f61019c.contains(aVar)) {
                this.f61019c.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo60192a(boolean z) {
        synchronized (f61017a) {
            if (this.f61019c != null) {
                Iterator it = this.f61019c.iterator();
                while (it.hasNext()) {
                    if (((C23107a) it.next()).mo60182a(z)) {
                        it.remove();
                    }
                }
            }
        }
    }
}
