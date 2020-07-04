package com.toutiao.proxyserver;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.toutiao.proxyserver.aa */
public final class C46456aa {

    /* renamed from: a */
    private ConcurrentHashMap<String, C46458a> f119719a;

    /* renamed from: b */
    private ConcurrentHashMap<String, String> f119720b;

    /* renamed from: c */
    private ConcurrentHashMap<String, String> f119721c;

    /* renamed from: d */
    private ConcurrentLinkedQueue<String> f119722d;

    /* renamed from: com.toutiao.proxyserver.aa$a */
    public static class C46458a {

        /* renamed from: a */
        public AtomicLong f119723a = new AtomicLong(0);
    }

    /* renamed from: com.toutiao.proxyserver.aa$b */
    public static class C46459b {

        /* renamed from: a */
        public static final C46456aa f119724a = new C46456aa();
    }

    /* renamed from: a */
    public static C46456aa m146053a() {
        return C46459b.f119724a;
    }

    private C46456aa() {
        this.f119719a = new ConcurrentHashMap<>();
        this.f119720b = new ConcurrentHashMap<>();
        this.f119721c = new ConcurrentHashMap<>();
        this.f119722d = new ConcurrentLinkedQueue<>();
    }

    /* renamed from: b */
    private void m146054b() {
        int i = 0;
        while (this.f119722d.size() > 100) {
            String str = (String) this.f119722d.poll();
            if (str != null) {
                String d = m146055d(str);
                this.f119719a.remove(str);
                this.f119720b.remove(str);
                this.f119721c.remove(d);
            }
            i++;
            if (i > 100) {
                return;
            }
            if (str == null) {
                return;
            }
        }
    }

    /* renamed from: d */
    private String m146055d(String str) {
        if (str != null) {
            return (String) this.f119720b.get(str);
        }
        return null;
    }

    /* renamed from: e */
    private void m146056e(String str) {
        if (str != null) {
            this.f119719a.remove(str);
        }
    }

    /* renamed from: a */
    public final boolean mo115580a(String str) {
        if (mo115581b(str) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo115582c(String str) {
        String str2 = (String) this.f119721c.get(str);
        if (str2 != null) {
            m146056e(str2);
        }
    }

    /* renamed from: b */
    public final long mo115581b(String str) {
        if (str != null && this.f119719a.containsKey(str)) {
            C46458a aVar = (C46458a) this.f119719a.get(str);
            if (aVar != null) {
                return aVar.f119723a.get();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo115579a(String str, String str2) {
        if (!this.f119720b.containsKey(str)) {
            this.f119722d.offer(str);
        }
        this.f119720b.put(str, str2);
        this.f119721c.put(str2, str);
        m146054b();
    }

    /* renamed from: a */
    public final void mo115578a(String str, long j) {
        C46458a aVar;
        if (str != null) {
            if (this.f119719a.containsKey(str)) {
                aVar = (C46458a) this.f119719a.get(str);
            } else {
                C46458a aVar2 = new C46458a();
                this.f119719a.put(str, aVar2);
                aVar = aVar2;
            }
            if (aVar != null) {
                aVar.f119723a.set(j);
            }
        }
    }
}
