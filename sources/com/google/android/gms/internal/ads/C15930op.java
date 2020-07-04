package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.C14711b;
import com.google.ads.mediation.C14721e;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.C14883b;
import com.google.android.gms.ads.mediation.C14902l;
import com.google.android.gms.ads.mediation.customevent.C14889a;
import com.google.android.gms.ads.mediation.customevent.C14891c;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.op */
public final class C15930op extends C15933os {

    /* renamed from: b */
    private static final C15988qt f44827b = new C15988qt();

    /* renamed from: a */
    public Map<Class<? extends Object>, Object> f44828a;

    /* renamed from: a */
    public final C15935ou mo41811a(String str) throws RemoteException {
        return m51506d(str);
    }

    /* renamed from: b */
    public final boolean mo41812b(String str) throws RemoteException {
        try {
            return C14889a.class.isAssignableFrom(Class.forName(str, false, C15930op.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            afm.m45783e(sb.toString());
            return false;
        }
    }

    /* renamed from: d */
    private final <NetworkExtrasT extends C14721e, ServerParametersT extends MediationServerParameters> C15935ou m51506d(String str) throws RemoteException {
        try {
            Class cls = Class.forName(str, false, C15930op.class.getClassLoader());
            if (C14711b.class.isAssignableFrom(cls)) {
                C14711b bVar = (C14711b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new C15965px(bVar, (C14721e) this.f44828a.get(bVar.getAdditionalParametersType()));
            } else if (C14883b.class.isAssignableFrom(cls)) {
                return new C15956po((C14883b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (C14902l.class.isAssignableFrom(cls)) {
                    return new C15956po((C14902l) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                afm.m45783e(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return m51507e(str);
        }
    }

    /* renamed from: e */
    private final C15935ou m51507e(String str) throws RemoteException {
        try {
            afm.m45777b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new C15956po((C14883b) new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new C15956po((C14883b) new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new C15956po((C14883b) new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new C15965px(customEventAdapter, (C14891c) this.f44828a.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            afm.m45780c(sb.toString(), th);
        }
    }

    /* renamed from: c */
    public final C15983qo mo41813c(String str) throws RemoteException {
        return C15988qt.m51996a(str);
    }
}
