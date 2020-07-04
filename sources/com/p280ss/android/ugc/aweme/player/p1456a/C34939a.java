package com.p280ss.android.ugc.aweme.player.p1456a;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.player.a.a */
public final class C34939a {

    /* renamed from: a */
    private ConcurrentHashMap<String, Long> f91117a;

    /* renamed from: com.ss.android.ugc.aweme.player.a.a$a */
    public static class C34941a {

        /* renamed from: a */
        public static final C34939a f91118a = new C34939a();
    }

    /* renamed from: a */
    public static C34939a m112588a() {
        return C34941a.f91118a;
    }

    /* renamed from: b */
    public final void mo88501b() {
        this.f91117a.clear();
    }

    private C34939a() {
        this.f91117a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final Long mo88499a(String str) {
        if (str != null) {
            return (Long) this.f91117a.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo88500a(String str, long j) {
        if (str != null) {
            this.f91117a.put(str, Long.valueOf(j));
        }
    }
}
