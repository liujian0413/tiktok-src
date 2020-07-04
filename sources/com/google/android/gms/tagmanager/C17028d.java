package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.tagmanager.d */
public class C17028d {

    /* renamed from: g */
    private static C17028d f47687g;

    /* renamed from: a */
    public final C17024c f47688a;

    /* renamed from: b */
    private final C17029a f47689b;

    /* renamed from: c */
    private final Context f47690c;

    /* renamed from: d */
    private final C17005aw f47691d;

    /* renamed from: e */
    private final ConcurrentMap<String, C17021bl> f47692e;

    /* renamed from: f */
    private final C17031f f47693f;

    /* renamed from: com.google.android.gms.tagmanager.d$a */
    public interface C17029a {
    }

    private C17028d(Context context, C17029a aVar, C17024c cVar, C17005aw awVar) {
        if (context != null) {
            this.f47690c = context.getApplicationContext();
            this.f47691d = awVar;
            this.f47689b = aVar;
            this.f47692e = new ConcurrentHashMap();
            this.f47688a = cVar;
            this.f47688a.mo44250a((C17026b) new C17012bc(this));
            this.f47688a.mo44250a((C17026b) new C17011bb(this.f47690c));
            this.f47693f = new C17031f();
            this.f47690c.registerComponentCallbacks(new C17014be(this));
            C17030e.m56532a(this.f47690c);
            return;
        }
        throw new NullPointerException("context cannot be null");
    }

    /* renamed from: a */
    public static C17028d m56525a(Context context) {
        C17028d dVar;
        synchronized (C17028d.class) {
            if (f47687g == null) {
                f47687g = new C17028d(context, new C17013bd(), new C17024c(new C17036k(context)), C17006ax.m56479b());
            }
            dVar = f47687g;
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo44258a() {
        this.f47691d.mo44226a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized boolean mo44259a(Uri uri) {
        C16992ak a = C16992ak.m56454a();
        if (!a.mo44223a(uri)) {
            return false;
        }
        String str = a.f47611b;
        switch (C17015bf.f47657a[a.f47610a.ordinal()]) {
            case 1:
                C17021bl blVar = (C17021bl) this.f47692e.get(str);
                break;
            case 2:
            case 3:
                for (String str2 : this.f47692e.keySet()) {
                    C17021bl blVar2 = (C17021bl) this.f47692e.get(str2);
                    if (str2.equals(str)) {
                        String str3 = a.f47612c;
                    } else {
                        blVar2.mo44247d();
                    }
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo44260a(C17021bl blVar) {
        return this.f47692e.remove(blVar.mo44246c()) != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m56527a(String str) {
        for (C17021bl a : this.f47692e.values()) {
            a.mo44245a(str);
        }
    }
}
