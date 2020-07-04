package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.internal.base.C16355d;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.i */
public final class C15250i implements Callback {

    /* renamed from: a */
    public volatile boolean f39442a = false;

    /* renamed from: b */
    private final C15251a f39443b;

    /* renamed from: c */
    private final ArrayList<C15039b> f39444c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<C15039b> f39445d = new ArrayList<>();

    /* renamed from: e */
    private final ArrayList<C15040c> f39446e = new ArrayList<>();

    /* renamed from: f */
    private final AtomicInteger f39447f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f39448g = false;

    /* renamed from: h */
    private final Handler f39449h;

    /* renamed from: i */
    private final Object f39450i = new Object();

    /* renamed from: com.google.android.gms.common.internal.i$a */
    public interface C15251a {
        /* renamed from: g */
        boolean mo38303g();
    }

    public C15250i(Looper looper, C15251a aVar) {
        this.f39443b = aVar;
        this.f39449h = new C16355d(looper, this);
    }

    /* renamed from: a */
    public final void mo38592a() {
        this.f39442a = false;
        this.f39447f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo38598b() {
        this.f39442a = true;
    }

    /* renamed from: a */
    public final void mo38594a(Bundle bundle) {
        boolean z = true;
        C15267r.m44391a(Looper.myLooper() == this.f39449h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f39450i) {
            C15267r.m44390a(!this.f39448g);
            this.f39449h.removeMessages(1);
            this.f39448g = true;
            if (this.f39445d.size() != 0) {
                z = false;
            }
            C15267r.m44390a(z);
            ArrayList arrayList = new ArrayList(this.f39444c);
            int i = this.f39447f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                C15039b bVar = (C15039b) obj;
                if (!this.f39442a || !this.f39443b.mo38303g() || this.f39447f.get() != i) {
                    break;
                } else if (!this.f39445d.contains(bVar)) {
                    bVar.mo38258a(bundle);
                }
            }
            this.f39445d.clear();
            this.f39448g = false;
        }
    }

    /* renamed from: a */
    public final void mo38593a(int i) {
        C15267r.m44391a(Looper.myLooper() == this.f39449h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f39449h.removeMessages(1);
        synchronized (this.f39450i) {
            this.f39448g = true;
            ArrayList arrayList = new ArrayList(this.f39444c);
            int i2 = this.f39447f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                C15039b bVar = (C15039b) obj;
                if (!this.f39442a || this.f39447f.get() != i2) {
                    break;
                } else if (this.f39444c.contains(bVar)) {
                    bVar.mo38257a(i);
                }
            }
            this.f39445d.clear();
            this.f39448g = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38595a(com.google.android.gms.common.ConnectionResult r8) {
        /*
            r7 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r7.f39449h
            android.os.Looper r1 = r1.getLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C15267r.m44391a(r0, r1)
            android.os.Handler r0 = r7.f39449h
            r0.removeMessages(r3)
            java.lang.Object r0 = r7.f39450i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0058 }
            java.util.ArrayList<com.google.android.gms.common.api.d$c> r3 = r7.f39446e     // Catch:{ all -> 0x0058 }
            r1.<init>(r3)     // Catch:{ all -> 0x0058 }
            java.util.concurrent.atomic.AtomicInteger r3 = r7.f39447f     // Catch:{ all -> 0x0058 }
            int r3 = r3.get()     // Catch:{ all -> 0x0058 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0058 }
            int r4 = r1.size()     // Catch:{ all -> 0x0058 }
        L_0x0031:
            if (r2 >= r4) goto L_0x0056
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x0058 }
            int r2 = r2 + 1
            com.google.android.gms.common.api.d$c r5 = (com.google.android.gms.common.api.C15037d.C15040c) r5     // Catch:{ all -> 0x0058 }
            boolean r6 = r7.f39442a     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x0054
            java.util.concurrent.atomic.AtomicInteger r6 = r7.f39447f     // Catch:{ all -> 0x0058 }
            int r6 = r6.get()     // Catch:{ all -> 0x0058 }
            if (r6 == r3) goto L_0x0048
            goto L_0x0054
        L_0x0048:
            java.util.ArrayList<com.google.android.gms.common.api.d$c> r6 = r7.f39446e     // Catch:{ all -> 0x0058 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x0031
            r5.mo38259a(r8)     // Catch:{ all -> 0x0058 }
            goto L_0x0031
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0058:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C15250i.mo38595a(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: a */
    public final void mo38596a(C15039b bVar) {
        C15267r.m44384a(bVar);
        synchronized (this.f39450i) {
            if (!this.f39444c.contains(bVar)) {
                this.f39444c.add(bVar);
            }
        }
        if (this.f39443b.mo38303g()) {
            this.f39449h.sendMessage(this.f39449h.obtainMessage(1, bVar));
        }
    }

    /* renamed from: a */
    public final void mo38597a(C15040c cVar) {
        C15267r.m44384a(cVar);
        synchronized (this.f39450i) {
            if (!this.f39446e.contains(cVar)) {
                this.f39446e.add(cVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo38599b(C15040c cVar) {
        C15267r.m44384a(cVar);
        synchronized (this.f39450i) {
            this.f39446e.remove(cVar);
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C15039b bVar = (C15039b) message.obj;
            synchronized (this.f39450i) {
                if (this.f39442a && this.f39443b.mo38303g() && this.f39444c.contains(bVar)) {
                    bVar.mo38258a((Bundle) null);
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
