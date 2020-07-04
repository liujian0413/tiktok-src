package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.ads.C15488ak;
import com.google.android.gms.internal.ads.C15491an;
import com.google.android.gms.internal.ads.C15566bf;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.afm;

@C6505uv
/* renamed from: com.google.android.gms.ads.k */
public final class C14871k {

    /* renamed from: a */
    private final Object f38505a = new Object();

    /* renamed from: b */
    private C15488ak f38506b;

    /* renamed from: c */
    private C14872a f38507c;

    /* renamed from: com.google.android.gms.ads.k$a */
    public static abstract class C14872a {
        /* renamed from: a */
        public void mo7873a() {
        }

        /* renamed from: b */
        public void mo7874b() {
        }

        /* renamed from: c */
        public void mo7875c() {
        }

        /* renamed from: d */
        public void mo7876d() {
        }
    }

    /* renamed from: a */
    public final void mo37870a(C15488ak akVar) {
        synchronized (this.f38505a) {
            this.f38506b = akVar;
            if (this.f38507c != null) {
                mo37869a(this.f38507c);
            }
        }
    }

    /* renamed from: a */
    public final C15488ak mo37868a() {
        C15488ak akVar;
        synchronized (this.f38505a) {
            akVar = this.f38506b;
        }
        return akVar;
    }

    /* renamed from: b */
    public final void mo37872b() {
        synchronized (this.f38505a) {
            if (this.f38506b != null) {
                try {
                    this.f38506b.mo39574a();
                } catch (RemoteException e) {
                    afm.m45778b("Unable to call play on video controller.", e);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo37873c() {
        synchronized (this.f38505a) {
            if (this.f38506b != null) {
                try {
                    this.f38506b.mo39577b();
                } catch (RemoteException e) {
                    afm.m45778b("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo37871a(boolean z) {
        synchronized (this.f38505a) {
            if (this.f38506b != null) {
                try {
                    this.f38506b.mo39576a(z);
                } catch (RemoteException e) {
                    afm.m45778b("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo37874d() {
        synchronized (this.f38505a) {
            if (this.f38506b == null) {
                return true;
            }
            try {
                boolean c = this.f38506b.mo39578c();
                return c;
            } catch (RemoteException e) {
                afm.m45778b("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    /* renamed from: a */
    public final void mo37869a(C14872a aVar) {
        C15267r.m44385a(aVar, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f38505a) {
            this.f38507c = aVar;
            if (this.f38506b != null) {
                try {
                    this.f38506b.mo39575a((C15491an) new C15566bf(aVar));
                } catch (RemoteException e) {
                    afm.m45778b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo37875e() {
        boolean z;
        synchronized (this.f38505a) {
            z = this.f38506b != null;
        }
        return z;
    }

    /* renamed from: f */
    public final float mo37876f() {
        synchronized (this.f38505a) {
            if (this.f38506b == null) {
                return 0.0f;
            }
            try {
                float g = this.f38506b.mo39582g();
                return g;
            } catch (RemoteException e) {
                afm.m45778b("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }
}
