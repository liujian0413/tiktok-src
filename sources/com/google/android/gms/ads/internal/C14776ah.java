package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15621de;
import com.google.android.gms.internal.ads.C15623dg;
import com.google.android.gms.internal.ads.C15628dl;
import com.google.android.gms.internal.ads.C15636ds;
import com.google.android.gms.internal.ads.abk;
import com.google.android.gms.internal.ads.acd;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.ah */
final class C14776ah implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15636ds f38171a;

    /* renamed from: b */
    private final /* synthetic */ int f38172b;

    /* renamed from: c */
    private final /* synthetic */ List f38173c;

    /* renamed from: d */
    private final /* synthetic */ abk f38174d;

    /* renamed from: e */
    private final /* synthetic */ C14772ad f38175e;

    C14776ah(C14772ad adVar, C15636ds dsVar, int i, List list, abk abk) {
        this.f38175e = adVar;
        this.f38171a = dsVar;
        this.f38172b = i;
        this.f38173c = list;
        this.f38174d = abk;
    }

    public final void run() {
        try {
            boolean z = false;
            if ((this.f38171a instanceof C15623dg) && this.f38175e.f38140e.f38285t != null) {
                C14772ad adVar = this.f38175e;
                if (this.f38172b != this.f38173c.size() - 1) {
                    z = true;
                }
                adVar.f38138c = z;
                C15628dl a = C14772ad.m42794b(this.f38171a);
                this.f38175e.f38140e.f38285t.mo41641a(a);
                this.f38175e.mo37657a(a.mo41561q());
            } else if ((this.f38171a instanceof C15623dg) && this.f38175e.f38140e.f38284s != null) {
                C14772ad adVar2 = this.f38175e;
                if (this.f38172b != this.f38173c.size() - 1) {
                    z = true;
                }
                adVar2.f38138c = z;
                C15623dg dgVar = (C15623dg) this.f38171a;
                this.f38175e.f38140e.f38284s.mo41637a(dgVar);
                this.f38175e.mo37657a(dgVar.mo41526n());
            } else if ((this.f38171a instanceof C15621de) && this.f38175e.f38140e.f38285t != null) {
                C14772ad adVar3 = this.f38175e;
                if (this.f38172b != this.f38173c.size() - 1) {
                    z = true;
                }
                adVar3.f38138c = z;
                C15628dl a2 = C14772ad.m42794b(this.f38171a);
                this.f38175e.f38140e.f38285t.mo41641a(a2);
                this.f38175e.mo37657a(a2.mo41561q());
            } else if (!(this.f38171a instanceof C15621de) || this.f38175e.f38140e.f38283r == null) {
                C14772ad adVar4 = this.f38175e;
                if (this.f38172b != this.f38173c.size() - 1) {
                    z = true;
                }
                adVar4.mo37584a(3, z, this.f38174d.f39895i);
            } else {
                C14772ad adVar5 = this.f38175e;
                if (this.f38172b != this.f38173c.size() - 1) {
                    z = true;
                }
                adVar5.f38138c = z;
                C15621de deVar = (C15621de) this.f38171a;
                this.f38175e.f38140e.f38283r.mo41635a(deVar);
                this.f38175e.mo37657a(deVar.mo41508n());
            }
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
