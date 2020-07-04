package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.C15323f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@C6505uv
public final class amy extends C15489al {

    /* renamed from: a */
    private final aik f40747a;

    /* renamed from: b */
    private final Object f40748b = new Object();

    /* renamed from: c */
    private final boolean f40749c;

    /* renamed from: d */
    private final boolean f40750d;

    /* renamed from: e */
    private int f40751e;

    /* renamed from: f */
    private C15491an f40752f;

    /* renamed from: g */
    private boolean f40753g;

    /* renamed from: h */
    private boolean f40754h = true;

    /* renamed from: i */
    private float f40755i;

    /* renamed from: j */
    private float f40756j;

    /* renamed from: k */
    private float f40757k;

    /* renamed from: l */
    private boolean f40758l;

    /* renamed from: m */
    private boolean f40759m;

    public amy(aik aik, float f, boolean z, boolean z2) {
        this.f40747a = aik;
        this.f40755i = f;
        this.f40749c = z;
        this.f40750d = z2;
    }

    /* renamed from: a */
    public final void mo39574a() {
        m46601a("play", null);
    }

    /* renamed from: b */
    public final void mo39577b() {
        m46601a("pause", null);
    }

    /* renamed from: k */
    public final void mo39586k() {
        m46601a("stop", null);
    }

    /* renamed from: a */
    public final void mo39576a(boolean z) {
        m46601a(z ? "mute" : "unmute", null);
    }

    /* renamed from: a */
    public final void mo39831a(zzacq zzacq) {
        mo39833a(zzacq.f45503a, zzacq.f45504b, zzacq.f45505c);
    }

    /* renamed from: a */
    public final void mo39833a(boolean z, boolean z2, boolean z3) {
        synchronized (this.f40748b) {
            this.f40758l = z2;
            this.f40759m = z3;
        }
        m46601a("initialState", C15323f.m44567a("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    /* renamed from: a */
    private final void m46601a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        ago.f40189a.execute(new amz(this, hashMap));
    }

    /* renamed from: c */
    public final boolean mo39578c() {
        boolean z;
        synchronized (this.f40748b) {
            z = this.f40754h;
        }
        return z;
    }

    /* renamed from: d */
    public final int mo39579d() {
        int i;
        synchronized (this.f40748b) {
            i = this.f40751e;
        }
        return i;
    }

    /* renamed from: g */
    public final float mo39582g() {
        float f;
        synchronized (this.f40748b) {
            f = this.f40757k;
        }
        return f;
    }

    /* renamed from: e */
    public final float mo39580e() {
        float f;
        synchronized (this.f40748b) {
            f = this.f40755i;
        }
        return f;
    }

    /* renamed from: f */
    public final float mo39581f() {
        float f;
        synchronized (this.f40748b) {
            f = this.f40756j;
        }
        return f;
    }

    /* renamed from: a */
    public final void mo39575a(C15491an anVar) {
        synchronized (this.f40748b) {
            this.f40752f = anVar;
        }
    }

    /* renamed from: i */
    public final C15491an mo39584i() throws RemoteException {
        C15491an anVar;
        synchronized (this.f40748b) {
            anVar = this.f40752f;
        }
        return anVar;
    }

    /* renamed from: h */
    public final boolean mo39583h() {
        boolean z;
        synchronized (this.f40748b) {
            z = this.f40749c && this.f40758l;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo39585j() {
        boolean z;
        boolean h = mo39583h();
        synchronized (this.f40748b) {
            if (!h) {
                try {
                    if (this.f40759m && this.f40750d) {
                        z = true;
                    }
                } finally {
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo39828a(float f) {
        synchronized (this.f40748b) {
            this.f40756j = f;
        }
    }

    /* renamed from: l */
    public final void mo39834l() {
        boolean z;
        int i;
        synchronized (this.f40748b) {
            z = this.f40754h;
            i = this.f40751e;
            this.f40751e = 3;
        }
        m46602b(i, 3, z, z);
    }

    /* renamed from: a */
    public final void mo39829a(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        int i2;
        synchronized (this.f40748b) {
            this.f40755i = f2;
            this.f40756j = f;
            z2 = this.f40754h;
            this.f40754h = z;
            i2 = this.f40751e;
            this.f40751e = i;
            float f4 = this.f40757k;
            this.f40757k = f3;
            if (Math.abs(this.f40757k - f4) > 1.0E-4f) {
                this.f40747a.getView().invalidate();
            }
        }
        m46602b(i2, i, z2, z);
    }

    /* renamed from: b */
    private final void m46602b(int i, int i2, boolean z, boolean z2) {
        Executor executor = ago.f40189a;
        ana ana = new ana(this, i, i2, z, z2);
        executor.execute(ana);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39830a(int i, int i2, boolean z, boolean z2) {
        synchronized (this.f40748b) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.f40753g && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            if (this.f40753g || z5) {
                z3 = true;
            }
            this.f40753g = z3;
            if (z5) {
                try {
                    if (this.f40752f != null) {
                        this.f40752f.mo39836a();
                    }
                } catch (RemoteException e) {
                    afm.m45782d("#007 Could not call remote method.", e);
                }
            }
            if (z6 && this.f40752f != null) {
                this.f40752f.mo39838b();
            }
            if (z7 && this.f40752f != null) {
                this.f40752f.mo39839c();
            }
            if (z8) {
                if (this.f40752f != null) {
                    this.f40752f.mo39840d();
                }
                this.f40747a.mo39475n();
            }
            if (z9 && this.f40752f != null) {
                this.f40752f.mo39837a(z2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39832a(Map map) {
        this.f40747a.mo39809a("pubVideoCmd", map);
    }
}
