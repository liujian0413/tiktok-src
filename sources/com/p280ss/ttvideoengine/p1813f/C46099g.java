package com.p280ss.ttvideoengine.p1813f;

import com.p280ss.ttvideoengine.p1816i.C46115b;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* renamed from: com.ss.ttvideoengine.f.g */
public class C46099g extends C46088a {

    /* renamed from: f */
    public InetAddress f117970f;

    /* renamed from: g */
    public boolean f117971g;

    /* renamed from: h */
    private Future f117972h;

    /* renamed from: com.ss.ttvideoengine.f.g$a */
    static class C46101a implements Runnable {

        /* renamed from: a */
        private final WeakReference<C46099g> f117974a;

        public final void run() {
            C46099g gVar = (C46099g) this.f117974a.get();
            if (gVar != null) {
                synchronized (C46099g.class) {
                    if (!gVar.f117971g) {
                        gVar.f117971g = true;
                        gVar.mo112263c(new C46117c("kTTVideoErrorDomainLocalDNS", -10000));
                    }
                }
            }
        }

        public C46101a(C46099g gVar) {
            this.f117974a = new WeakReference<>(gVar);
        }
    }

    /* renamed from: c */
    public final void mo112262c() {
        if (!this.f117936b) {
            this.f117936b = true;
            if (this.f117972h != null) {
                this.f117972h.cancel(true);
                this.f117972h = null;
            }
        }
    }

    /* renamed from: d */
    public final void mo112264d() {
        super.mo112264d();
        this.f117936b = true;
        if (this.f117972h != null) {
            this.f117972h.cancel(true);
            this.f117972h = null;
        }
    }

    /* renamed from: b */
    public final void mo112260b() {
        try {
            this.f117972h = C46115b.m144501a((Runnable) new Runnable() {
                /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
                    if (r1 != null) goto L_0x006d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
                    r6.f117973a.mo112263c(new com.p280ss.ttvideoengine.p1816i.C46117c("kTTVideoErrorDomainLocalDNS", -9997));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
                    r0 = new org.json.JSONObject();
                    r2 = new org.json.JSONArray();
                    r2.put(r1);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
                    r0.put("ips", r2);
                    r0.put("time", java.lang.System.currentTimeMillis());
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r6 = this;
                        r0 = 1
                        com.ss.ttvideoengine.f.g r1 = com.p280ss.ttvideoengine.p1813f.C46099g.this     // Catch:{ Throwable -> 0x0093 }
                        com.ss.ttvideoengine.f.g r2 = com.p280ss.ttvideoengine.p1813f.C46099g.this     // Catch:{ Throwable -> 0x0093 }
                        java.lang.String r2 = r2.f117937c     // Catch:{ Throwable -> 0x0093 }
                        java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)     // Catch:{ Throwable -> 0x0093 }
                        r1.f117970f = r2     // Catch:{ Throwable -> 0x0093 }
                        com.ss.ttvideoengine.f.g r1 = com.p280ss.ttvideoengine.p1813f.C46099g.this
                        java.net.InetAddress r1 = r1.f117970f
                        if (r1 != 0) goto L_0x0033
                        java.lang.Class<com.ss.ttvideoengine.f.g> r1 = com.p280ss.ttvideoengine.p1813f.C46099g.class
                        monitor-enter(r1)
                        com.ss.ttvideoengine.f.g r2 = com.p280ss.ttvideoengine.p1813f.C46099g.this     // Catch:{ all -> 0x0030 }
                        boolean r2 = r2.f117971g     // Catch:{ all -> 0x0030 }
                        if (r2 != 0) goto L_0x002e
                        com.ss.ttvideoengine.f.g r2 = com.p280ss.ttvideoengine.p1813f.C46099g.this     // Catch:{ all -> 0x0030 }
                        r2.f117971g = r0     // Catch:{ all -> 0x0030 }
                        com.ss.ttvideoengine.f.g r0 = com.p280ss.ttvideoengine.p1813f.C46099g.this     // Catch:{ all -> 0x0030 }
                        com.ss.ttvideoengine.i.c r2 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x0030 }
                        java.lang.String r3 = "kTTVideoErrorDomainLocalDNS"
                        r4 = -9998(0xffffffffffffd8f2, float:NaN)
                        r2.<init>(r3, r4)     // Catch:{ all -> 0x0030 }
                        r0.mo112263c(r2)     // Catch:{ all -> 0x0030 }
                    L_0x002e:
                        monitor-exit(r1)     // Catch:{ all -> 0x0030 }
                        return
                    L_0x0030:
                        r0 = move-exception
                        monitor-exit(r1)     // Catch:{ all -> 0x0030 }
                        throw r0
                    L_0x0033:
                        com.ss.ttvideoengine.f.g r1 = com.p280ss.ttvideoengine.p1813f.C46099g.this
                        java.net.InetAddress r1 = r1.f117970f
                        java.lang.String r1 = r1.getHostAddress()
                        com.ss.ttvideoengine.f.g r2 = com.p280ss.ttvideoengine.p1813f.C46099g.this
                        java.net.InetAddress r2 = r2.f117970f
                        boolean r2 = r2 instanceof java.net.Inet6Address
                        if (r2 == 0) goto L_0x004e
                        java.lang.String r2 = "[%s]"
                        java.lang.Object[] r3 = new java.lang.Object[r0]
                        r4 = 0
                        r3[r4] = r1
                        java.lang.String r1 = com.C1642a.m8034a(r2, r3)
                    L_0x004e:
                        java.lang.Class<com.ss.ttvideoengine.f.g> r2 = com.p280ss.ttvideoengine.p1813f.C46099g.class
                        monitor-enter(r2)
                        com.ss.ttvideoengine.f.g r3 = com.p280ss.ttvideoengine.p1813f.C46099g.this     // Catch:{ all -> 0x0090 }
                        boolean r3 = r3.f117971g     // Catch:{ all -> 0x0090 }
                        if (r3 != 0) goto L_0x008e
                        com.ss.ttvideoengine.f.g r3 = com.p280ss.ttvideoengine.p1813f.C46099g.this     // Catch:{ all -> 0x0090 }
                        r3.f117971g = r0     // Catch:{ all -> 0x0090 }
                        monitor-exit(r2)     // Catch:{ all -> 0x0090 }
                        if (r1 != 0) goto L_0x006d
                        com.ss.ttvideoengine.f.g r0 = com.p280ss.ttvideoengine.p1813f.C46099g.this
                        com.ss.ttvideoengine.i.c r1 = new com.ss.ttvideoengine.i.c
                        java.lang.String r2 = "kTTVideoErrorDomainLocalDNS"
                        r3 = -9997(0xffffffffffffd8f3, float:NaN)
                        r1.<init>(r2, r3)
                        r0.mo112263c(r1)
                        return
                    L_0x006d:
                        org.json.JSONObject r0 = new org.json.JSONObject
                        r0.<init>()
                        org.json.JSONArray r2 = new org.json.JSONArray
                        r2.<init>()
                        r2.put(r1)
                        java.lang.String r1 = "ips"
                        r0.put(r1, r2)     // Catch:{ JSONException -> 0x0088 }
                        java.lang.String r1 = "time"
                        long r2 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0088 }
                        r0.put(r1, r2)     // Catch:{ JSONException -> 0x0088 }
                    L_0x0088:
                        com.ss.ttvideoengine.f.g r1 = com.p280ss.ttvideoengine.p1813f.C46099g.this
                        r1.mo112259a(r0)
                        return
                    L_0x008e:
                        monitor-exit(r2)     // Catch:{ all -> 0x0090 }
                        return
                    L_0x0090:
                        r0 = move-exception
                        monitor-exit(r2)     // Catch:{ all -> 0x0090 }
                        throw r0
                    L_0x0093:
                        r1 = move-exception
                        java.lang.Class<com.ss.ttvideoengine.f.g> r2 = com.p280ss.ttvideoengine.p1813f.C46099g.class
                        monitor-enter(r2)
                        com.ss.ttvideoengine.f.g r3 = com.p280ss.ttvideoengine.p1813f.C46099g.this     // Catch:{ all -> 0x00b5 }
                        boolean r3 = r3.f117971g     // Catch:{ all -> 0x00b5 }
                        if (r3 != 0) goto L_0x00b3
                        com.ss.ttvideoengine.f.g r3 = com.p280ss.ttvideoengine.p1813f.C46099g.this     // Catch:{ all -> 0x00b5 }
                        r3.f117971g = r0     // Catch:{ all -> 0x00b5 }
                        com.ss.ttvideoengine.f.g r0 = com.p280ss.ttvideoengine.p1813f.C46099g.this     // Catch:{ all -> 0x00b5 }
                        com.ss.ttvideoengine.i.c r3 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x00b5 }
                        java.lang.String r4 = "kTTVideoErrorDomainLocalDNS"
                        r5 = -9968(0xffffffffffffd910, float:NaN)
                        java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00b5 }
                        r3.<init>(r4, r5, r1)     // Catch:{ all -> 0x00b5 }
                        r0.mo112263c(r3)     // Catch:{ all -> 0x00b5 }
                    L_0x00b3:
                        monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
                        return
                    L_0x00b5:
                        r0 = move-exception
                        monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.p1813f.C46099g.C461001.run():void");
                }
            });
        } catch (Exception e) {
            mo112263c(new C46117c("kTTVideoErrorDomainLocalDNS", -9968, e.getMessage()));
        }
        this.f117935a.postDelayed(new C46101a(this), 10000);
    }

    public C46099g(String str) {
        super(str);
        C46123h.m144545a("LocalDNS", "DNS use LocalDNS");
    }
}
