package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.do */
public final class C15631do extends C15638du {

    /* renamed from: d */
    private C15945pd f44335d;

    /* renamed from: e */
    private C15948pg f44336e;

    /* renamed from: f */
    private C15951pj f44337f;

    /* renamed from: g */
    private final C15635dr f44338g;

    /* renamed from: h */
    private C15632dp f44339h;

    /* renamed from: i */
    private boolean f44340i;

    /* renamed from: j */
    private boolean f44341j;

    /* renamed from: k */
    private final Object f44342k;

    public C15631do(Context context, C15635dr drVar, bdt bdt, C15945pd pdVar, C15636ds dsVar) {
        this(context, drVar, bdt, dsVar);
        this.f44335d = pdVar;
    }

    /* renamed from: j */
    public final ami mo41589j() {
        return null;
    }

    /* renamed from: k */
    public final void mo41590k() {
    }

    /* renamed from: l */
    public final void mo41591l() {
    }

    public C15631do(Context context, C15635dr drVar, bdt bdt, C15948pg pgVar, C15636ds dsVar) {
        this(context, drVar, bdt, dsVar);
        this.f44336e = pgVar;
    }

    public C15631do(Context context, C15635dr drVar, bdt bdt, C15951pj pjVar, C15636ds dsVar) {
        this(context, drVar, bdt, dsVar);
        this.f44337f = pjVar;
    }

    private C15631do(Context context, C15635dr drVar, bdt bdt, C15636ds dsVar) {
        super(context, drVar, null, bdt, null, dsVar, null, null);
        this.f44342k = new Object();
        this.f44338g = drVar;
    }

    /* renamed from: a */
    public final View mo41571a(OnClickListener onClickListener, boolean z) {
        C15345b bVar;
        synchronized (this.f44342k) {
            if (this.f44339h != null) {
                View a = this.f44339h.mo41571a(onClickListener, z);
                return a;
            }
            try {
                if (this.f44337f != null) {
                    bVar = this.f44337f.mo41899l();
                } else if (this.f44335d != null) {
                    bVar = this.f44335d.mo41862n();
                } else {
                    if (this.f44336e != null) {
                        bVar = this.f44336e.mo41880k();
                    }
                    bVar = null;
                }
            } catch (RemoteException e) {
                acd.m45780c("Failed to call getAdChoicesContent", e);
            }
            if (bVar == null) {
                return null;
            }
            View view = (View) C15349d.m44669a(bVar);
            return view;
        }
    }

    /* renamed from: a */
    public final boolean mo41579a() {
        synchronized (this.f44342k) {
            if (this.f44339h != null) {
                boolean a = this.f44339h.mo41579a();
                return a;
            }
            boolean O = this.f44338g.mo37650O();
            return O;
        }
    }

    /* renamed from: b */
    public final boolean mo41581b() {
        synchronized (this.f44342k) {
            if (this.f44339h != null) {
                boolean b = this.f44339h.mo41581b();
                return b;
            }
            boolean Q = this.f44338g.mo37652Q();
            return Q;
        }
    }

    /* renamed from: c */
    public final boolean mo41582c() {
        synchronized (this.f44342k) {
            if (this.f44339h != null) {
                boolean c = this.f44339h.mo41582c();
                return c;
            }
            boolean P = this.f44338g.mo37651P();
            return P;
        }
    }

    /* renamed from: a */
    public final void mo41578a(C15706gh ghVar) {
        synchronized (this.f44342k) {
            if (this.f44339h != null) {
                this.f44339h.mo41578a(ghVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo41583d() {
        synchronized (this.f44342k) {
            if (this.f44339h != null) {
                this.f44339h.mo41583d();
            }
        }
    }

    /* renamed from: a */
    public final void mo41573a(View view) {
        synchronized (this.f44342k) {
            if (this.f44339h != null) {
                this.f44339h.mo41573a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo41574a(View view, Map<String, WeakReference<View>> map) {
        C15267r.m44393b("recordImpression must be called on the main UI thread.");
        synchronized (this.f44342k) {
            this.f44349a = true;
            if (this.f44339h != null) {
                this.f44339h.mo41574a(view, map);
                this.f44338g.mo41607Z();
            } else {
                try {
                    if (this.f44337f != null && !this.f44337f.mo41903p()) {
                        this.f44337f.mo41905r();
                        this.f44338g.mo41607Z();
                    } else if (this.f44335d != null && !this.f44335d.mo41858j()) {
                        this.f44335d.mo41857i();
                        this.f44338g.mo41607Z();
                    } else if (this.f44336e != null && !this.f44336e.mo41877h()) {
                        this.f44336e.mo41876g();
                        this.f44338g.mo41607Z();
                    }
                } catch (RemoteException e) {
                    acd.m45780c("Failed to call recordImpression", e);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo41584e() {
        C15267r.m44393b("recordDownloadedImpression must be called on main UI thread.");
        synchronized (this.f44342k) {
            this.f44350b = true;
            if (this.f44339h != null) {
                this.f44339h.mo41584e();
            }
        }
    }

    /* renamed from: a */
    public final void mo41572a(MotionEvent motionEvent) {
        synchronized (this.f44342k) {
            if (this.f44339h != null) {
                this.f44339h.mo41572a(motionEvent);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41575a(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4, android.os.Bundle r5, android.view.View r6) {
        /*
            r2 = this;
            java.lang.String r0 = "performClick must be called on the main UI thread."
            com.google.android.gms.common.internal.C15267r.m44393b(r0)
            java.lang.Object r0 = r2.f44342k
            monitor-enter(r0)
            boolean r1 = r2.f44341j     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0014
            boolean r1 = r2.mo41581b()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0014:
            com.google.android.gms.internal.ads.dp r1 = r2.f44339h     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.dp r1 = r2.f44339h     // Catch:{ all -> 0x0028 }
            r1.mo41575a(r3, r4, r5, r6)     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.dr r3 = r2.f44338g     // Catch:{ all -> 0x0028 }
            r3.mo41609v_()     // Catch:{ all -> 0x0028 }
            goto L_0x0026
        L_0x0023:
            r2.m50531e(r3)     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15631do.mo41575a(android.view.View, java.util.Map, android.os.Bundle, android.view.View):void");
    }

    /* renamed from: f */
    public final void mo41585f() {
        this.f44341j = true;
        if (this.f44339h != null) {
            this.f44339h.mo41585f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41586g() {
        /*
            r2 = this;
            java.lang.String r0 = "recordCustomClickGesture must be called on the main UI thread."
            com.google.android.gms.common.internal.C15267r.m44393b(r0)
            java.lang.Object r0 = r2.f44342k
            monitor-enter(r0)
            com.google.android.gms.internal.ads.dp r1 = r2.f44339h     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0020
            boolean r1 = r2.f44341j     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.dp r1 = r2.f44339h     // Catch:{ all -> 0x0047 }
            r1.mo41585f()     // Catch:{ all -> 0x0047 }
        L_0x0015:
            com.google.android.gms.internal.ads.dp r1 = r2.f44339h     // Catch:{ all -> 0x0047 }
            r1.mo41586g()     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.dr r1 = r2.f44338g     // Catch:{ all -> 0x0047 }
            r1.mo41609v_()     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x0020:
            boolean r1 = r2.f44341j     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set."
            com.google.android.gms.internal.ads.acd.m45783e(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x002b:
            boolean r1 = r2.mo41581b()     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0038
            java.lang.String r1 = "Custom click reporting for 3p ads failed. Ad unit id not whitelisted."
            com.google.android.gms.internal.ads.acd.m45783e(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0038:
            com.google.android.gms.internal.ads.ei r1 = r2.f44351c     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.ei r1 = r2.f44351c     // Catch:{ all -> 0x0047 }
            android.view.View r1 = r1.mo41621c()     // Catch:{ all -> 0x0047 }
            r2.m50531e(r1)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15631do.mo41586g():void");
    }

    /* renamed from: e */
    private final void m50531e(View view) {
        try {
            if (this.f44337f != null && !this.f44337f.mo41904q()) {
                this.f44337f.mo41886a(C15349d.m44668a(view));
                this.f44338g.mo41609v_();
            } else if (this.f44335d == null || this.f44335d.mo41859k()) {
                if (this.f44336e != null && !this.f44336e.mo41878i()) {
                    this.f44336e.mo41867a(C15349d.m44668a(view));
                    this.f44338g.mo41609v_();
                }
            } else {
                this.f44335d.mo41846a(C15349d.m44668a(view));
                this.f44338g.mo41609v_();
            }
        } catch (RemoteException e) {
            acd.m45780c("Failed to call performClick", e);
        }
    }

    /* renamed from: a */
    public final void mo41576a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.f44342k) {
            this.f44340i = true;
            HashMap b = m50530b(map);
            HashMap b2 = m50530b(map2);
            try {
                if (this.f44337f != null) {
                    this.f44337f.mo41887a(C15349d.m44668a(view), C15349d.m44668a(b), C15349d.m44668a(b2));
                } else if (this.f44335d != null) {
                    this.f44335d.mo41847a(C15349d.m44668a(view), C15349d.m44668a(b), C15349d.m44668a(b2));
                    this.f44335d.mo41849b(C15349d.m44668a(view));
                } else if (this.f44336e != null) {
                    this.f44336e.mo41868a(C15349d.m44668a(view), C15349d.m44668a(b), C15349d.m44668a(b2));
                    this.f44336e.mo41870b(C15349d.m44668a(view));
                }
            } catch (RemoteException e) {
                acd.m45780c("Failed to call prepareAd", e);
            }
            this.f44340i = false;
        }
    }

    /* renamed from: b */
    private static HashMap<String, View> m50530b(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void mo41580b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f44342k) {
            try {
                if (this.f44337f != null) {
                    this.f44337f.mo41889b(C15349d.m44668a(view));
                } else if (this.f44335d != null) {
                    this.f44335d.mo41851c(C15349d.m44668a(view));
                } else if (this.f44336e != null) {
                    this.f44336e.mo41872c(C15349d.m44668a(view));
                }
            } catch (RemoteException e) {
                acd.m45780c("Failed to call untrackView", e);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo41587h() {
        boolean z;
        synchronized (this.f44342k) {
            z = this.f44340i;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo41577a(C15632dp dpVar) {
        synchronized (this.f44342k) {
            this.f44339h = dpVar;
        }
    }

    /* renamed from: i */
    public final C15632dp mo41588i() {
        C15632dp dpVar;
        synchronized (this.f44342k) {
            dpVar = this.f44339h;
        }
        return dpVar;
    }

    /* renamed from: m */
    public final void mo41592m() {
        if (this.f44339h != null) {
            this.f44339h.mo41592m();
        }
    }

    /* renamed from: n */
    public final void mo41593n() {
        if (this.f44339h != null) {
            this.f44339h.mo41593n();
        }
    }
}
