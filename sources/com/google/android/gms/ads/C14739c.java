package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C14750b;
import com.google.android.gms.ads.formats.C14754e.C14755a;
import com.google.android.gms.ads.formats.C14756f.C14757a;
import com.google.android.gms.ads.formats.C14758g.C14759a;
import com.google.android.gms.ads.formats.C14758g.C14760b;
import com.google.android.gms.ads.formats.C14761h.C14762a;
import com.google.android.gms.ads.p741a.C14727c;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.ads.C15499ar;
import com.google.android.gms.internal.ads.C15553b;
import com.google.android.gms.internal.ads.C15686fo;
import com.google.android.gms.internal.ads.C15690fs;
import com.google.android.gms.internal.ads.C15703ge;
import com.google.android.gms.internal.ads.C15714gp;
import com.google.android.gms.internal.ads.C15715gq;
import com.google.android.gms.internal.ads.C15717gs;
import com.google.android.gms.internal.ads.C15718gt;
import com.google.android.gms.internal.ads.C15719gu;
import com.google.android.gms.internal.ads.C15930op;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.bxu;
import com.google.android.gms.internal.ads.bya;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.bys;
import com.google.android.gms.internal.ads.byv;
import com.google.android.gms.internal.ads.zzafl;

/* renamed from: com.google.android.gms.ads.c */
public class C14739c {

    /* renamed from: a */
    private final bya f38087a;

    /* renamed from: b */
    private final Context f38088b;

    /* renamed from: c */
    private final byv f38089c;

    /* renamed from: com.google.android.gms.ads.c$a */
    public static class C14740a {

        /* renamed from: a */
        private final Context f38090a;

        /* renamed from: b */
        private final C15553b f38091b;

        public C14740a(Context context, String str) {
            this((Context) C15267r.m44385a(context, (Object) "context cannot be null"), bym.m50297b().mo41436a(context, str, (C15931oq) new C15930op()));
        }

        private C14740a(Context context, C15553b bVar) {
            this.f38090a = context;
            this.f38091b = bVar;
        }

        /* renamed from: a */
        public final C14740a mo37427a(C14757a aVar) {
            try {
                this.f38091b.mo37791a((C15690fs) new C15715gq(aVar));
            } catch (RemoteException e) {
                afm.m45780c("Failed to add content ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14740a mo37426a(C14755a aVar) {
            try {
                this.f38091b.mo37790a((C15686fo) new C15714gp(aVar));
            } catch (RemoteException e) {
                afm.m45780c("Failed to add app install ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14740a mo37428a(C14762a aVar) {
            try {
                this.f38091b.mo37793a((C15703ge) new C15719gu(aVar));
            } catch (RemoteException e) {
                afm.m45780c("Failed to add google native ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14740a mo37429a(String str, C14760b bVar, C14759a aVar) {
            C15717gs gsVar;
            try {
                C15553b bVar2 = this.f38091b;
                C15718gt gtVar = new C15718gt(bVar);
                if (aVar == null) {
                    gsVar = null;
                } else {
                    gsVar = new C15717gs(aVar);
                }
                bVar2.mo37798a(str, gtVar, gsVar);
            } catch (RemoteException e) {
                afm.m45780c("Failed to add custom template ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public C14740a mo7872a(C14732b bVar) {
            try {
                this.f38091b.mo37789a((bys) new bxu(bVar));
            } catch (RemoteException e) {
                afm.m45780c("Failed to set AdListener.", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14740a mo37425a(C14750b bVar) {
            try {
                this.f38091b.mo37796a(new zzafl(bVar));
            } catch (RemoteException e) {
                afm.m45780c("Failed to specify native ad options", e);
            }
            return this;
        }

        /* renamed from: a */
        public final C14739c mo37430a() {
            try {
                return new C14739c(this.f38090a, this.f38091b.mo37787a());
            } catch (RemoteException e) {
                afm.m45778b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    C14739c(Context context, byv byv) {
        this(context, byv, bya.f44160a);
    }

    private C14739c(Context context, byv byv, bya bya) {
        this.f38088b = context;
        this.f38089c = byv;
        this.f38087a = bya;
    }

    /* renamed from: a */
    private final void m42600a(C15499ar arVar) {
        try {
            this.f38089c.mo37781a(bya.m50259a(this.f38088b, arVar));
        } catch (RemoteException e) {
            afm.m45778b("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public final void mo37424a(C14743d dVar) {
        m42600a(dVar.f38094a);
    }

    /* renamed from: a */
    public final void mo37423a(C14727c cVar) {
        m42600a(cVar.f38068a);
    }
}
