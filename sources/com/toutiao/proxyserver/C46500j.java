package com.toutiao.proxyserver;

import com.toutiao.proxyserver.p1839a.C46455c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.toutiao.proxyserver.j */
public final class C46500j {

    /* renamed from: a */
    private ConcurrentLinkedQueue<String> f119818a;

    /* renamed from: b */
    private ConcurrentHashMap<String, C46455c> f119819b;

    /* renamed from: com.toutiao.proxyserver.j$a */
    public static class C46502a {

        /* renamed from: a */
        public static final C46500j f119820a = new C46500j();
    }

    /* renamed from: a */
    public static C46500j m146183a() {
        return C46502a.f119820a;
    }

    private C46500j() {
        this.f119818a = new ConcurrentLinkedQueue<>();
        this.f119819b = new ConcurrentHashMap<>();
    }

    /* renamed from: b */
    private void m146184b() {
        int i = 0;
        while (this.f119818a.size() > 30) {
            String str = (String) this.f119818a.poll();
            if (str != null) {
                this.f119819b.remove(str);
            }
            i++;
            if (i > 30) {
                return;
            }
            if (str == null) {
                return;
            }
        }
    }

    /* renamed from: a */
    public final C46455c mo115650a(String str) {
        if (str == null) {
            return null;
        }
        return (C46455c) this.f119819b.get(str);
    }

    /* renamed from: a */
    public final void mo115651a(String str, C46455c cVar) {
        if (!(str == null || cVar == null || this.f119819b.containsKey(str))) {
            this.f119819b.put(str, cVar);
            this.f119818a.offer(str);
            m146184b();
        }
    }
}
