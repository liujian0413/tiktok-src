package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C14875m;
import com.google.android.gms.ads.C14913o;
import com.google.android.gms.ads.mediation.C14905o;
import com.google.android.gms.ads.mediation.C14906p;
import com.google.android.gms.ads.mediation.C14907q;
import com.google.android.gms.ads.mediation.C14908r;
import com.google.android.gms.ads.mediation.C14909s;
import com.google.android.gms.ads.mediation.C14911u;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qu */
public final class C15989qu extends C15984qp {

    /* renamed from: a */
    private final aop f44883a;

    public C15989qu(aop aop) {
        this.f44883a = aop;
    }

    /* renamed from: a */
    public final void mo41913a(C15345b bVar) {
    }

    /* renamed from: a */
    public final void mo41919a(String[] strArr, Bundle[] bundleArr) {
    }

    /* renamed from: b */
    public final boolean mo41921b(C15345b bVar) throws RemoteException {
        return false;
    }

    /* renamed from: c */
    public final boolean mo41923c(C15345b bVar) throws RemoteException {
        return false;
    }

    /* renamed from: a */
    public final void mo41915a(String str, String str2, zzyv zzyv, C15345b bVar, C15973qe qeVar, C15938ox oxVar, zzyz zzyz) throws RemoteException {
        zzyv zzyv2 = zzyv;
        zzyz zzyz2 = zzyz;
        try {
            C15990qv qvVar = new C15990qv(this, qeVar, oxVar);
            aop aop = this.f44883a;
            new C14905o((Context) C15349d.m44669a(bVar), str, m51997a(str2), m52000b(zzyv2), m51999a(zzyv), zzyv2.f45787k, zzyv2.f45783g, zzyv2.f45796t, m51998a(str2, zzyv), C14913o.m43303a(zzyz2.f45802e, zzyz2.f45799b, zzyz2.f45798a));
            qvVar.mo37945a(String.valueOf(aop.getClass().getSimpleName()).concat(" does not support banner ads."));
        } catch (Throwable th) {
            afm.m45778b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo41916a(String str, String str2, zzyv zzyv, C15345b bVar, C15975qg qgVar, C15938ox oxVar) throws RemoteException {
        zzyv zzyv2 = zzyv;
        try {
            C15991qw qwVar = new C15991qw(this, qgVar, oxVar);
            aop aop = this.f44883a;
            new C14907q((Context) C15349d.m44669a(bVar), str, m51997a(str2), m52000b(zzyv2), m51999a(zzyv), zzyv2.f45787k, zzyv2.f45783g, zzyv2.f45796t, m51998a(str2, zzyv));
            qwVar.mo37945a(String.valueOf(aop.getClass().getSimpleName()).concat(" does not support interstitial ads."));
        } catch (Throwable th) {
            afm.m45778b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo41918a(String str, String str2, zzyv zzyv, C15345b bVar, C15981qm qmVar, C15938ox oxVar) throws RemoteException {
        zzyv zzyv2 = zzyv;
        try {
            C15992qx qxVar = new C15992qx(this, qmVar, oxVar);
            aop aop = this.f44883a;
            C14909s sVar = new C14909s((Context) C15349d.m44669a(bVar), str, m51997a(str2), m52000b(zzyv2), m51999a(zzyv), zzyv2.f45787k, zzyv2.f45783g, zzyv2.f45796t, m51998a(str2, zzyv));
            aop.mo37943a(sVar, qxVar);
        } catch (Throwable th) {
            afm.m45778b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo41917a(String str, String str2, zzyv zzyv, C15345b bVar, C15977qi qiVar, C15938ox oxVar) throws RemoteException {
        zzyv zzyv2 = zzyv;
        try {
            C15993qy qyVar = new C15993qy(this, qiVar, oxVar);
            aop aop = this.f44883a;
            new C14908r((Context) C15349d.m44669a(bVar), str, m51997a(str2), m52000b(zzyv2), m51999a(zzyv), zzyv2.f45787k, zzyv2.f45783g, zzyv2.f45796t, m51998a(str2, zzyv));
            qyVar.mo37945a(String.valueOf(aop.getClass().getSimpleName()).concat(" does not support native ads."));
        } catch (Throwable th) {
            afm.m45778b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final C15488ak mo41922c() {
        if (!(this.f44883a instanceof C14911u)) {
            return null;
        }
        try {
            return ((C14911u) this.f44883a).getVideoController();
        } catch (Throwable th) {
            afm.m45778b("", th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo41914a(C15345b bVar, String str, Bundle bundle, Bundle bundle2, zzyz zzyz, C15986qr qrVar) throws RemoteException {
        int i;
        try {
            new C15994qz(this, qrVar);
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1396342996) {
                if (hashCode != -1052618729) {
                    if (hashCode != -239580146) {
                        if (hashCode == 604727084) {
                            if (str.equals("interstitial")) {
                                c = 1;
                            }
                        }
                    } else if (str.equals("rewarded")) {
                        c = 2;
                    }
                } else if (str.equals("native")) {
                    c = 3;
                }
            } else if (str.equals("banner")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    i = C14875m.f38514a;
                    break;
                case 1:
                    i = C14875m.f38515b;
                    break;
                case 2:
                    i = C14875m.f38516c;
                    break;
                case 3:
                    i = C14875m.f38517d;
                    break;
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
            new aoq((Context) C15349d.m44669a(bVar), new C14906p(i, bundle2), bundle, C14913o.m43303a(zzyz.f45802e, zzyz.f45799b, zzyz.f45798a));
        } catch (Throwable th) {
            afm.m45778b("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final zzaso mo41912a() throws RemoteException {
        return zzaso.m52663a(this.f44883a.mo37942a());
    }

    /* renamed from: b */
    public final zzaso mo41920b() throws RemoteException {
        return zzaso.m52663a(this.f44883a.mo37944b());
    }

    /* renamed from: a */
    private static Bundle m51997a(String str) throws RemoteException {
        String str2 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        afm.m45783e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                bundle2.putString(str3, jSONObject.getString(str3));
            }
            return bundle2;
        } catch (JSONException e) {
            afm.m45778b("", e);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    private static boolean m51999a(zzyv zzyv) {
        return zzyv.f45782f || afb.m45730a();
    }

    /* renamed from: a */
    private static String m51998a(String str, zzyv zzyv) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzyv.f45797u;
        }
    }

    /* renamed from: b */
    private final Bundle m52000b(zzyv zzyv) {
        if (zzyv.f45789m != null) {
            Bundle bundle = zzyv.f45789m.getBundle(this.f44883a.getClass().getName());
            if (bundle != null) {
                return bundle;
            }
        }
        return new Bundle();
    }
}
