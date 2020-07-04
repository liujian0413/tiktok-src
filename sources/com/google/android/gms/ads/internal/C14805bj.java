package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15600ck;
import com.google.android.gms.internal.ads.C15601cl;
import com.google.android.gms.internal.ads.C16042st;
import com.google.android.gms.internal.ads.aag;
import com.google.android.gms.internal.ads.abk;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.zzbnv;

/* renamed from: com.google.android.gms.ads.internal.bj */
final class C14805bj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ abk f38307a;

    /* renamed from: b */
    final /* synthetic */ aag f38308b;

    /* renamed from: c */
    final /* synthetic */ C14802bg f38309c;

    /* renamed from: d */
    private final /* synthetic */ C15600ck f38310d;

    C14805bj(C14802bg bgVar, abk abk, aag aag, C15600ck ckVar) {
        this.f38309c = bgVar;
        this.f38307a = abk;
        this.f38308b = aag;
        this.f38310d = ckVar;
    }

    public final void run() {
        if (this.f38307a.f39888b.f45641r && this.f38309c.f38140e.f38249D != null) {
            String str = null;
            if (this.f38307a.f39888b.f45623a != null) {
                str = acl.m45522a(this.f38307a.f39888b.f45623a);
            }
            C15601cl clVar = new C15601cl(this.f38309c, str, this.f38307a.f39888b.f45625b);
            this.f38309c.f38140e.f38257L = 1;
            try {
                this.f38309c.f38138c = false;
                this.f38309c.f38140e.f38249D.mo41468a(clVar);
                return;
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
                this.f38309c.f38138c = true;
            }
        }
        C14817bv bvVar = new C14817bv(this.f38309c.f38140e.f38268c, this.f38308b, this.f38307a.f39888b.f45601E);
        try {
            ami a = this.f38309c.mo37737a(this.f38307a, bvVar, this.f38308b);
            a.mo39731f(this.f38309c.f38140e.f38276k.f39888b.f45618V);
            a.setOnTouchListener(new C14807bl(this, bvVar));
            a.setOnClickListener(new C14808bm(this, bvVar));
            this.f38309c.f38140e.f38257L = 0;
            this.f38309c.f38140e.f38273h = C16042st.m52127a(this.f38309c.f38140e.f38268c, this.f38309c, this.f38307a, this.f38309c.f38140e.f38269d, a, this.f38309c.f38298n, this.f38309c, this.f38310d);
        } catch (zzbnv e2) {
            acd.m45778b("Could not obtain webview.", e2);
            acl.f40003a.post(new C14806bk(this));
        }
    }
}
