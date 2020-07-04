package com.p280ss.android.deviceregister;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.k */
public final class C6793k {

    /* renamed from: a */
    private static volatile C6793k f19374a;

    /* renamed from: b */
    private int f19375b = -1;

    /* renamed from: c */
    private final Object f19376c = new Object();

    /* renamed from: d */
    private final AtomicLong f19377d = new AtomicLong(-1);

    /* renamed from: e */
    private final AtomicLong f19378e = new AtomicLong(-1);

    /* renamed from: f */
    private final AtomicReference<String> f19379f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicReference<HashMap<String, Long>> f19380g = new AtomicReference<>();

    /* renamed from: h */
    private final AtomicInteger f19381h = new AtomicInteger(-1);

    /* renamed from: i */
    private final Map<Integer, C19330b> f19382i = new ConcurrentHashMap(12);

    /* renamed from: j */
    private final Map<Integer, C19333a> f19383j = new ConcurrentHashMap(12);

    /* renamed from: a */
    public final void mo16602a(Map<String, Long> map) {
        if (this.f19380g.compareAndSet(null, new HashMap(map))) {
            C19334l lVar = new C19334l(map, Integer.valueOf(C19335n.m63429a().mo51263d() + 1));
            C19335n.m63429a().mo51258a(lVar);
            C6794m.m21127a(lVar);
        }
    }

    /* renamed from: c */
    public final void mo16609c() {
        this.f19377d.compareAndSet(-1, SystemClock.uptimeMillis());
    }

    /* renamed from: a */
    public static C6793k m21104a() {
        if (f19374a == null) {
            synchronized (C6793k.class) {
                if (f19374a == null) {
                    f19374a = new C6793k();
                }
            }
        }
        return f19374a;
    }

    private C6793k() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo16604b() {
        int i;
        synchronized (this.f19376c) {
            if (this.f19375b == -1) {
                this.f19375b = C19335n.m63429a().mo51259b();
            }
            Map<Integer, C19330b> map = this.f19382i;
            int i2 = this.f19375b + 1;
            this.f19375b = i2;
            map.put(Integer.valueOf(i2), new C19330b().mo51236b(Integer.valueOf(this.f19375b)).mo51233a(Long.valueOf(SystemClock.uptimeMillis())));
            i = this.f19375b;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo16603a(Integer num) {
        return this.f19382i.containsKey(num);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo16607b(Integer num) {
        return this.f19383j.containsKey(num);
    }

    /* renamed from: b */
    public final int mo16605b(int i) {
        C19330b bVar = (C19330b) this.f19382i.get(Integer.valueOf(i));
        if (bVar != null) {
            bVar.mo51238c(Long.valueOf(SystemClock.uptimeMillis()));
        }
        return i;
    }

    /* renamed from: c */
    public final int mo16608c(int i) {
        C19330b bVar = (C19330b) this.f19382i.get(Integer.valueOf(i));
        if (bVar != null) {
            bVar.mo51239d(Long.valueOf(SystemClock.uptimeMillis()));
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo16596a(int i) {
        C19330b bVar = (C19330b) this.f19382i.get(Integer.valueOf(i));
        if (bVar != null) {
            bVar.mo51237b(Long.valueOf(SystemClock.uptimeMillis()));
        }
        return i;
    }

    /* renamed from: c */
    public final void mo16610c(Integer num) {
        new StringBuilder("timestampPrimaryId=").append(num);
        C19330b bVar = (C19330b) this.f19382i.get(num);
        if (bVar != null) {
            C19326i a = bVar.mo51235a();
            C19335n.m63429a().mo51256a(a);
            C6794m.m21125a(a);
        }
    }

    /* renamed from: d */
    public final void mo16611d(Integer num) {
        new StringBuilder("id=").append(num);
        C19333a aVar = (C19333a) this.f19383j.get(num);
        aVar.mo51249b(Long.valueOf(SystemClock.uptimeMillis()));
        C19335n.m63429a().mo51257a(aVar.mo51248a());
    }

    /* renamed from: e */
    public final void mo16612e(Integer num) {
        new StringBuilder("id=").append(num);
        C19333a aVar = (C19333a) this.f19383j.get(num);
        aVar.mo51250c(Long.valueOf(SystemClock.uptimeMillis()));
        C19335n.m63429a().mo51257a(aVar.mo51248a());
    }

    /* renamed from: f */
    public final void mo16613f(Integer num) {
        new StringBuilder("id=").append(num);
        C19333a aVar = (C19333a) this.f19383j.get(num);
        aVar.mo51251d(Long.valueOf(SystemClock.uptimeMillis()));
        C19335n.m63429a().mo51257a(aVar.mo51248a());
    }

    /* renamed from: a */
    public final Integer mo16598a(JSONObject jSONObject) {
        new StringBuilder("internalJSONObject=").append(jSONObject);
        if (this.f19381h.get() == -1) {
            this.f19381h.compareAndSet(-1, C19335n.m63429a().mo51261c() + 1);
        }
        Integer valueOf = Integer.valueOf(this.f19381h.getAndIncrement());
        C19333a aVar = new C19333a();
        aVar.mo51243a(valueOf).mo51244a(Long.valueOf(SystemClock.uptimeMillis())).mo51247a(jSONObject);
        this.f19383j.put(valueOf, aVar);
        new StringBuilder("return id=").append(valueOf);
        return valueOf;
    }

    /* renamed from: a */
    public final void mo16601a(String str) {
        new StringBuilder("did=").append(str);
        this.f19378e.compareAndSet(-1, SystemClock.uptimeMillis());
        this.f19379f.compareAndSet(null, str);
    }

    /* renamed from: b */
    public final void mo16606b(Integer num, String str) {
        StringBuilder sb = new StringBuilder("id=");
        sb.append(num);
        sb.append(" activeUserNetStacktrace=");
        sb.append(str);
        C19333a aVar = (C19333a) this.f19383j.get(num);
        aVar.mo51245a(Long.valueOf(SystemClock.uptimeMillis()), str);
        C19331j a = aVar.mo51248a();
        C19335n.m63429a().mo51257a(a);
        C6794m.m21126a(a);
    }

    /* renamed from: a */
    public final Integer mo16597a(Integer num, int i) {
        new StringBuilder("maxTryTimes=").append(num);
        C19330b bVar = (C19330b) this.f19382i.get(Integer.valueOf(i));
        if (bVar != null) {
            bVar.mo51232a(num).mo51240e(Long.valueOf(this.f19377d.get())).mo51241f(Long.valueOf(this.f19378e.get())).mo51234a((String) this.f19379f.get());
            if (TextUtils.isEmpty(bVar.f52260a)) {
                C19335n.m63429a().mo51256a(bVar.mo51235a());
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo16600a(Integer num, String str) {
        StringBuilder sb = new StringBuilder("id=");
        sb.append(num);
        sb.append(" netUrl=");
        sb.append(str);
        C19333a aVar = (C19333a) this.f19383j.get(num);
        aVar.mo51252e(Long.valueOf(SystemClock.uptimeMillis()));
        aVar.mo51246a(str);
        C19335n.m63429a().mo51257a(aVar.mo51248a());
    }

    /* renamed from: a */
    public final void mo16599a(Integer num, Long l, Long l2, String str, String str2, Throwable th, String str3, Integer num2) {
        StringBuilder sb = new StringBuilder("timestampPrimaryId = [");
        sb.append(num);
        sb.append("], netRequestStart = [");
        sb.append(l);
        sb.append("], netRequestEnd = [");
        sb.append(l2);
        sb.append("], url = [");
        sb.append(C19324g.m63388a(str));
        sb.append("], data = [");
        sb.append(C19324g.m63388a(str));
        sb.append("], exception = [");
        sb.append(th);
        sb.append("], errorMessage = [");
        sb.append(str3);
        sb.append("], nTry = [");
        sb.append(num2);
        sb.append("]");
        C19330b bVar = (C19330b) this.f19382i.get(num);
        if (bVar != null) {
            bVar.mo51231a(new C19329a().mo51224a(l).mo51227b(l2).mo51225a(str).mo51228b(str2).mo51229c(Log.getStackTraceString(th)).mo51230d(str3).mo51223a(num2).mo51226a());
            C19335n.m63429a().mo51256a(bVar.mo51235a());
        }
    }
}
