package com.p280ss.android.statistic;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.statistic.p907a.C20404a;
import com.p280ss.android.statistic.p907a.C20407d;
import com.p280ss.android.statistic.p908b.C20409a;
import com.p280ss.android.statistic.p908b.C20410b;
import com.p280ss.android.statistic.p908b.C20411c;
import com.p280ss.android.statistic.p908b.C20412d;
import com.p280ss.android.statistic.p909c.C20418c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.statistic.c */
public final class C20413c {

    /* renamed from: a */
    public Configuration f55142a;

    /* renamed from: b */
    private Map<String, C20407d> f55143b;

    /* renamed from: c */
    private List<C20409a> f55144c;

    /* renamed from: d */
    private C20418c f55145d;

    /* renamed from: e */
    private AtomicBoolean f55146e;

    /* renamed from: f */
    private final Queue<C20408b> f55147f;

    /* renamed from: g */
    private Application f55148g;

    /* renamed from: com.ss.android.statistic.c$a */
    static class C20415a {

        /* renamed from: a */
        public static final C20413c f55149a = new C20413c();
    }

    /* renamed from: a */
    public static C20413c m67737a() {
        return C20415a.f55149a;
    }

    /* renamed from: a */
    public final void mo54961a(String str, Map<String, String> map, int i) {
        HashMap hashMap = new HashMap();
        Set<Entry> entrySet = map != null ? map.entrySet() : null;
        if (entrySet != null) {
            for (Entry entry : entrySet) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        m67739a(new C20408b(str, hashMap, i));
    }

    /* renamed from: a */
    public final void mo54960a(String str, String str2, String str3, Long l, Long l2, JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(C20403a.f55131s, str);
        }
        if (str3 != null) {
            hashMap.put(C20403a.f55128p, str3);
        }
        if (l != null) {
            hashMap.put(C20403a.f55132t, l);
        }
        if (l2 != null) {
            hashMap.put(C20403a.f55133u, l2);
        }
        if (jSONObject != null) {
            hashMap.put(C20403a.f55134v, jSONObject);
        }
        m67739a(new C20408b(str2, hashMap, i));
    }

    /* renamed from: c */
    private boolean m67742c() {
        return this.f55146e.get();
    }

    /* renamed from: b */
    private void m67741b() {
        this.f55144c.add(new C20411c(new C20412d(new C20410b())));
    }

    private C20413c() {
        this.f55143b = new ConcurrentHashMap();
        this.f55144c = new CopyOnWriteArrayList();
        this.f55145d = new C20418c();
        this.f55146e = new AtomicBoolean(false);
        this.f55147f = new LinkedList();
    }

    /* renamed from: d */
    private void m67743d() {
        LinkedList linkedList;
        if (m67742c()) {
            synchronized (this.f55147f) {
                linkedList = new LinkedList(this.f55147f);
                this.f55147f.clear();
            }
            while (!linkedList.isEmpty()) {
                m67739a((C20408b) linkedList.poll());
            }
        }
    }

    /* renamed from: a */
    private void m67740a(boolean z) {
        m67738a(new C20404a(), z);
    }

    /* renamed from: b */
    public final void mo54962b(Context context) {
        if (m67742c()) {
            this.f55145d.mo54966b(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r0 = r6.f55144c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (((com.p280ss.android.statistic.p908b.C20409a) r0.next()).mo54953a(r7) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r0 = r6.f55143b.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r0.hasNext() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r1 = (com.p280ss.android.statistic.p907a.C20407d) r0.next();
        r2 = true;
        r3 = r6.f55144c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r3.hasNext() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (((com.p280ss.android.statistic.p908b.C20409a) r3.next()).mo54954a(r7, r1.mo54943a()) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r2 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        r1.mo54946b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m67739a(com.p280ss.android.statistic.C20408b r7) {
        /*
            r6 = this;
            java.util.Queue<com.ss.android.statistic.b> r0 = r6.f55147f
            monitor-enter(r0)
            boolean r1 = r6.m67742c()     // Catch:{ all -> 0x0074 }
            if (r1 != 0) goto L_0x001f
            java.util.Queue<com.ss.android.statistic.b> r1 = r6.f55147f     // Catch:{ all -> 0x0074 }
            r1.offer(r7)     // Catch:{ all -> 0x0074 }
            java.util.Queue<com.ss.android.statistic.b> r7 = r6.f55147f     // Catch:{ all -> 0x0074 }
            int r7 = r7.size()     // Catch:{ all -> 0x0074 }
            r1 = 50
            if (r7 <= r1) goto L_0x001d
            java.util.Queue<com.ss.android.statistic.b> r7 = r6.f55147f     // Catch:{ all -> 0x0074 }
            r7.poll()     // Catch:{ all -> 0x0074 }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            java.util.List<com.ss.android.statistic.b.a> r0 = r6.f55144c
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r0.next()
            com.ss.android.statistic.b.a r1 = (com.p280ss.android.statistic.p908b.C20409a) r1
            boolean r1 = r1.mo54953a(r7)
            if (r1 != 0) goto L_0x0026
            return
        L_0x0039:
            java.util.Map<java.lang.String, com.ss.android.statistic.a.d> r0 = r6.f55143b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0073
            java.lang.Object r1 = r0.next()
            com.ss.android.statistic.a.d r1 = (com.p280ss.android.statistic.p907a.C20407d) r1
            r2 = 1
            java.util.List<com.ss.android.statistic.b.a> r3 = r6.f55144c
            java.util.Iterator r3 = r3.iterator()
        L_0x0056:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006d
            java.lang.Object r4 = r3.next()
            com.ss.android.statistic.b.a r4 = (com.p280ss.android.statistic.p908b.C20409a) r4
            java.lang.String r5 = r1.mo54943a()
            boolean r4 = r4.mo54954a(r7, r5)
            if (r4 != 0) goto L_0x0056
            r2 = 0
        L_0x006d:
            if (r2 == 0) goto L_0x0043
            r1.mo54946b(r7)
            goto L_0x0043
        L_0x0073:
            return
        L_0x0074:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.statistic.C20413c.m67739a(com.ss.android.statistic.b):void");
    }

    /* renamed from: a */
    public final void mo54956a(Context context) {
        if (m67742c()) {
            this.f55145d.mo54965a(context);
        }
    }

    /* renamed from: a */
    public final void mo54957a(Configuration configuration) {
        this.f55142a = configuration;
        Iterator it = this.f55143b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo54958a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f55143b.remove(str);
        }
    }

    /* renamed from: a */
    private void m67738a(C20407d dVar, boolean z) {
        String a = dVar.mo54943a();
        if (!TextUtils.isEmpty(a) && z) {
            if (!(this.f55148g == null || this.f55142a == null)) {
                dVar.mo54944a(this.f55148g, this.f55142a);
            }
            this.f55143b.put(a, dVar);
        }
    }

    /* renamed from: a */
    public final void mo54955a(Application application, Configuration configuration, boolean z) {
        this.f55148g = application;
        this.f55142a = configuration;
        m67740a(z);
        m67741b();
        this.f55146e.set(true);
        m67743d();
    }

    /* renamed from: a */
    public final void mo54959a(String str, String str2, String str3, int i) {
        mo54960a(str, str2, str3, null, null, null, i);
    }
}
