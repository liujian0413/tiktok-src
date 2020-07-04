package com.google.firebase.components;

import com.google.android.gms.common.internal.C15267r;
import com.google.firebase.p785a.C18262a;
import com.google.firebase.p785a.C18263b;
import com.google.firebase.p785a.C18264c;
import com.google.firebase.p785a.C18265d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.l */
class C18292l implements C18264c, C18265d {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C18263b<Object>, Executor>> f49708a = new HashMap();

    /* renamed from: b */
    private Queue<C18262a<?>> f49709b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f49710c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47176a() {
        Queue<C18262a> queue;
        synchronized (this) {
            if (this.f49709b != null) {
                queue = this.f49709b;
                this.f49709b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C18262a a : queue) {
                m60305a(a);
            }
        }
    }

    C18292l(Executor executor) {
        this.f49710c = executor;
    }

    /* renamed from: b */
    private synchronized Set<Entry<C18263b<Object>, Executor>> m60307b(C18262a<?> aVar) {
        Map map = (Map) this.f49708a.get(aVar.f49644a);
        if (map == null) {
            return Collections.emptySet();
        }
        return map.entrySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.C18293m.m60311a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m60307b(r4).iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m60305a(com.google.firebase.p785a.C18262a<?> r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C15267r.m44384a(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.a.a<?>> r0 = r3.f49709b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.a.a<?>> r0 = r3.f49709b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.m60307b(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.C18293m.m60311a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C18292l.m60305a(com.google.firebase.a.a):void");
    }

    /* renamed from: a */
    public final <T> void mo47128a(Class<T> cls, C18263b<? super T> bVar) {
        mo47129a(cls, this.f49710c, bVar);
    }

    /* renamed from: a */
    public final synchronized <T> void mo47129a(Class<T> cls, Executor executor, C18263b<? super T> bVar) {
        C15267r.m44384a(cls);
        C15267r.m44384a(bVar);
        C15267r.m44384a(executor);
        if (!this.f49708a.containsKey(cls)) {
            this.f49708a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f49708a.get(cls)).put(bVar, executor);
    }
}
