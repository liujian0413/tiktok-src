package com.bytedance.frameworks.baselib.p511a;

import android.content.Context;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.a.e */
public final class C10079e {

    /* renamed from: b */
    private static C10079e f27420b;

    /* renamed from: a */
    public final Map<String, C10071b> f27421a;

    /* renamed from: c */
    private final Context f27422c;

    /* renamed from: d */
    private final C10080f f27423d;

    /* renamed from: e */
    private final AtomicBoolean f27424e = new AtomicBoolean(false);

    /* renamed from: f */
    private final LinkedList<C10075c> f27425f = new LinkedList<>();

    /* renamed from: a */
    private boolean m29943a() {
        return this.f27424e.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10071b mo24728a(String str) {
        return (C10071b) this.f27421a.get(str);
    }

    /* renamed from: a */
    public static C10079e m29942a(Context context) {
        if (f27420b == null) {
            synchronized (C10079e.class) {
                if (f27420b == null) {
                    f27420b = new C10079e(context);
                }
            }
        }
        return f27420b;
    }

    private C10079e(Context context) {
        this.f27422c = context.getApplicationContext();
        this.f27421a = new ConcurrentHashMap();
        this.f27423d = new C10080f(this.f27422c, this, this.f27425f, this.f27424e);
        this.f27423d.start();
    }

    /* renamed from: a */
    public final void mo24729a(String str, C10071b bVar) {
        if (!m29943a()) {
            this.f27421a.put(str, bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo24730a(String str, byte[] bArr) {
        if (m29943a() || bArr == null || bArr.length <= 0 || mo24728a(str) == null) {
            return false;
        }
        synchronized (this.f27425f) {
            if (this.f27424e.get()) {
                return false;
            }
            if (this.f27425f.size() >= 2000) {
                this.f27425f.poll();
            }
            boolean add = this.f27425f.add(new C10075c(str, bArr));
            this.f27423d.mo24731a();
            return add;
        }
    }
}
