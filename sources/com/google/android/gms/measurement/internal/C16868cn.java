package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.measurement.C16498eg;
import com.google.android.gms.internal.measurement.C16499eh;
import com.google.android.gms.internal.measurement.C16500ei;
import com.google.android.gms.internal.measurement.C16501ej;
import com.google.android.gms.internal.measurement.C16504em;
import com.google.android.gms.internal.measurement.C16579hf;
import com.google.android.gms.internal.measurement.C16678ko;
import com.google.android.gms.internal.measurement.zzfe.C16705a;
import com.google.android.gms.internal.measurement.zzfe.zzb;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.cn */
final class C16868cn extends C16911ec {
    public C16868cn(C16912ed edVar) {
        super(edVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43637d() {
        return false;
    }

    /* renamed from: a */
    public final byte[] mo43761a(zzag zzag, String str) {
        Integer num;
        C16924eo eoVar;
        C16500ei eiVar;
        C16501ej ejVar;
        Bundle bundle;
        C16881d dVar;
        long j;
        C16921el elVar;
        zzag zzag2 = zzag;
        String str2 = str;
        mo43571c();
        this.f47095q.mo43674v();
        C15267r.m44384a(zzag);
        C15267r.m44386a(str);
        if (!mo43587s().mo44054d(str2, C16942h.f47427at)) {
            mo43585q().f47494h.mo44161a("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(zzag2.f47518a) || "_iapx".equals(zzag2.f47518a)) {
            C16500ei eiVar2 = new C16500ei();
            mo43643h().mo44108e();
            try {
                C16924eo b = mo43643h().mo44099b(str2);
                if (b == null) {
                    mo43585q().f47494h.mo44161a("Log and bundle not available. package_name", str2);
                    return new byte[0];
                } else if (!b.mo43969o()) {
                    mo43585q().f47494h.mo44161a("Log and bundle disabled. package_name", str2);
                    byte[] bArr = new byte[0];
                    mo43643h().mo44114v();
                    return bArr;
                } else {
                    C16501ej ejVar2 = new C16501ej();
                    eiVar2.f46193a = new C16501ej[]{ejVar2};
                    ejVar2.f46210a = Integer.valueOf(1);
                    ejVar2.f46218i = "android";
                    ejVar2.f46224o = b.mo43933b();
                    ejVar2.f46223n = b.mo43962l();
                    ejVar2.f46225p = b.mo43958j();
                    long k = b.mo43960k();
                    if (k == -2147483648L) {
                        num = null;
                    } else {
                        num = Integer.valueOf((int) k);
                    }
                    ejVar2.f46197C = num;
                    ejVar2.f46226q = Long.valueOf(b.mo43964m());
                    ejVar2.f46234y = b.mo43941d();
                    if (TextUtils.isEmpty(ejVar2.f46234y)) {
                        ejVar2.f46203I = b.mo43944e();
                    }
                    ejVar2.f46231v = Long.valueOf(b.mo43966n());
                    if (this.f47095q.mo43672t() && C16930eu.m56090t() && mo43587s().mo44051c(ejVar2.f46224o)) {
                        ejVar2.f46201G = null;
                    }
                    Pair a = mo43586r().mo43594a(b.mo43933b());
                    if (b.mo43927C() && !TextUtils.isEmpty((CharSequence) a.first)) {
                        ejVar2.f46228s = m55651a((String) a.first, Long.toString(zzag2.f47521d));
                        ejVar2.f46229t = (Boolean) a.second;
                    }
                    mo43579k().mo43718x();
                    ejVar2.f46220k = Build.MODEL;
                    mo43579k().mo43718x();
                    ejVar2.f46219j = VERSION.RELEASE;
                    ejVar2.f46222m = Integer.valueOf((int) mo43579k().mo43678O_());
                    ejVar2.f46221l = mo43579k().mo43680f();
                    try {
                        ejVar2.f46230u = m55651a(b.mo43937c(), Long.toString(zzag2.f47521d));
                        ejVar2.f46196B = b.mo43950g();
                        String str3 = ejVar2.f46224o;
                        List a2 = mo43643h().mo44086a(str3);
                        if (mo43587s().mo44056e(str2)) {
                            Iterator it = a2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    elVar = null;
                                    break;
                                }
                                elVar = (C16921el) it.next();
                                if ("_lte".equals(elVar.f47317c)) {
                                    break;
                                }
                            }
                            if (elVar == null || elVar.f47319e == null) {
                                C16921el elVar2 = new C16921el(str3, "auto", "_lte", mo43580l().mo38684a(), Long.valueOf(0));
                                a2.add(elVar2);
                                mo43643h().mo44096a(elVar2);
                            }
                        }
                        C16504em[] emVarArr = new C16504em[a2.size()];
                        for (int i = 0; i < a2.size(); i++) {
                            C16504em emVar = new C16504em();
                            emVarArr[i] = emVar;
                            emVar.f46245b = ((C16921el) a2.get(i)).f47317c;
                            emVar.f46244a = Long.valueOf(((C16921el) a2.get(i)).f47318d);
                            mo43639f().mo43884a(emVar, ((C16921el) a2.get(i)).f47319e);
                        }
                        ejVar2.f46212c = emVarArr;
                        Bundle b2 = zzag2.f47519b.mo44169b();
                        b2.putLong("_c", 1);
                        mo43585q().f47494h.mo44160a("Marking in-app purchase as real-time");
                        b2.putLong("_r", 1);
                        b2.putString("_o", zzag2.f47520c);
                        if (mo43583o().mo43913f(ejVar2.f46224o)) {
                            mo43583o().mo43902a(b2, "_dbg", (Object) Long.valueOf(1));
                            mo43583o().mo43902a(b2, "_r", (Object) Long.valueOf(1));
                        }
                        C16881d a3 = mo43643h().mo44083a(str2, zzag2.f47518a);
                        if (a3 == null) {
                            bundle = b2;
                            ejVar = ejVar2;
                            eiVar = eiVar2;
                            eoVar = b;
                            C16881d dVar2 = new C16881d(str, zzag2.f47518a, 0, 0, zzag2.f47521d, 0, null, null, null, null);
                            dVar = dVar2;
                            j = 0;
                        } else {
                            bundle = b2;
                            ejVar = ejVar2;
                            eiVar = eiVar2;
                            eoVar = b;
                            j = a3.f47194e;
                            dVar = a3.mo43791a(zzag2.f47521d);
                        }
                        mo43643h().mo44090a(dVar);
                        C16854c cVar = new C16854c(this.f47095q, zzag2.f47520c, str, zzag2.f47518a, zzag2.f47521d, j, bundle);
                        C16498eg egVar = new C16498eg();
                        C16501ej ejVar3 = ejVar;
                        ejVar3.f46211b = new C16498eg[]{egVar};
                        egVar.f46184c = Long.valueOf(cVar.f47105c);
                        egVar.f46183b = cVar.f47104b;
                        egVar.f46185d = Long.valueOf(cVar.f47106d);
                        egVar.f46182a = new C16499eh[cVar.f47107e.mo44167a()];
                        Iterator it2 = cVar.f47107e.iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            C16499eh ehVar = new C16499eh();
                            int i3 = i2 + 1;
                            egVar.f46182a[i2] = ehVar;
                            ehVar.f46188a = str4;
                            mo43639f().mo43883a(ehVar, cVar.f47107e.mo44168a(str4));
                            i2 = i3;
                        }
                        ejVar3.f46204J = (zzb) ((C16579hf) zzb.m54903a().mo43242a((C16705a) ((C16579hf) C16705a.m54894a().mo43240a(dVar.f47192c).mo43241a(zzag2.f47518a).mo42942d())).mo42942d());
                        ejVar3.f46195A = mo43641g().mo44043a(eoVar.mo43933b(), (C16498eg[]) null, ejVar3.f46212c);
                        ejVar3.f46214e = egVar.f46184c;
                        ejVar3.f46215f = egVar.f46184c;
                        long i4 = eoVar.mo43956i();
                        ejVar3.f46217h = i4 != 0 ? Long.valueOf(i4) : null;
                        long h = eoVar.mo43953h();
                        if (h != 0) {
                            i4 = h;
                        }
                        ejVar3.f46216g = i4 != 0 ? Long.valueOf(i4) : null;
                        eoVar.mo43973s();
                        ejVar3.f46232w = Integer.valueOf((int) eoVar.mo43970p());
                        ejVar3.f46227r = Long.valueOf(14710);
                        ejVar3.f46213d = Long.valueOf(mo43580l().mo38684a());
                        ejVar3.f46235z = Boolean.TRUE;
                        C16924eo eoVar2 = eoVar;
                        eoVar2.mo43930a(ejVar3.f46214e.longValue());
                        eoVar2.mo43934b(ejVar3.f46215f.longValue());
                        mo43643h().mo44091a(eoVar2);
                        mo43643h().mo44113u();
                        mo43643h().mo44114v();
                        try {
                            byte[] bArr2 = new byte[eiVar.mo43168e()];
                            C16678ko a4 = C16678ko.m54756a(bArr2, 0, bArr2.length);
                            eiVar.mo42655a(a4);
                            a4.mo43132a();
                            return mo43639f().mo43890b(bArr2);
                        } catch (IOException e) {
                            mo43585q().f47487a.mo44162a("Data loss. Failed to bundle and serialize. appId", C16953r.m56340a(str), e);
                            return null;
                        }
                    } catch (SecurityException e2) {
                        mo43585q().f47494h.mo44161a("app instance id encryption failed", e2.getMessage());
                        byte[] bArr3 = new byte[0];
                        mo43643h().mo44114v();
                        return bArr3;
                    }
                }
            } catch (SecurityException e3) {
                mo43585q().f47494h.mo44161a("Resettable device id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                mo43643h().mo44114v();
            }
        } else {
            mo43585q().f47494h.mo44162a("Generating a payload for this event is not available. package_name, event_name", str2, zzag2.f47518a);
            return null;
        }
    }

    /* renamed from: a */
    private static String m55651a(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }
}
