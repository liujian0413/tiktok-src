package com.google.android.gms.internal.ads;

import com.C1642a;
import com.google.android.gms.internal.ads.atq.C15529b;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class aqg {

    /* renamed from: a */
    private static final Logger f40913a = Logger.getLogger(aqg.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, apw> f40914b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, Boolean> f40915c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, C15496app> f40916d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<Class<?>, aqf<?>> f40917e = new ConcurrentHashMap();

    /* renamed from: a */
    public static synchronized void m46913a(String str, C15496app<?> app) throws GeneralSecurityException {
        synchronized (aqg.class) {
            if (f40916d.containsKey(str.toLowerCase())) {
                if (!app.getClass().equals(((C15496app) f40916d.get(str.toLowerCase())).getClass())) {
                    Logger logger = f40913a;
                    Level level = Level.WARNING;
                    String str2 = "com.google.crypto.tink.Registry";
                    String str3 = "addCatalogue";
                    String str4 = "Attempted overwrite of a catalogueName catalogue for name ";
                    String valueOf = String.valueOf(str);
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                    sb.append("catalogue for name ");
                    sb.append(str);
                    sb.append(" has been already registered");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            f40916d.put(str.toLowerCase(), app);
        }
    }

    /* renamed from: a */
    public static C15496app<?> m46900a(String str) throws GeneralSecurityException {
        if (str != null) {
            C15496app<?> app = (C15496app) f40916d.get(str.toLowerCase());
            if (app != null) {
                return app;
            }
            String a = C1642a.m8034a("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                a = String.valueOf(a).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                a = String.valueOf(a).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                a = String.valueOf(a).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                a = String.valueOf(a).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                a = String.valueOf(a).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                a = String.valueOf(a).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                a = String.valueOf(a).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(a);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: a */
    private static <T> T m46906a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static synchronized <P> void m46910a(apw<P> apw) throws GeneralSecurityException {
        synchronized (aqg.class) {
            m46911a(apw, true);
        }
    }

    /* renamed from: a */
    public static synchronized <P> void m46911a(apw<P> apw, boolean z) throws GeneralSecurityException {
        synchronized (aqg.class) {
            if (apw != null) {
                String a = apw.mo39932a();
                if (f40914b.containsKey(a)) {
                    apw a2 = m46901a(a, null);
                    boolean booleanValue = ((Boolean) f40915c.get(a)).booleanValue();
                    if (!apw.getClass().equals(a2.getClass()) || (!booleanValue && z)) {
                        Logger logger = f40913a;
                        Level level = Level.WARNING;
                        String str = "com.google.crypto.tink.Registry";
                        String str2 = "registerKeyManager";
                        String str3 = "Attempted overwrite of a registered key manager for key type ";
                        String valueOf = String.valueOf(a);
                        logger.logp(level, str, str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                        throw new GeneralSecurityException(C1642a.m8034a("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{a, a2.getClass().getName(), apw.getClass().getName()}));
                    }
                }
                f40914b.put(a, apw);
                f40915c.put(a, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: a */
    public static synchronized <P> void m46912a(aqf<P> aqf) throws GeneralSecurityException {
        synchronized (aqg.class) {
            if (aqf != null) {
                Class a = aqf.mo39950a();
                if (f40917e.containsKey(a)) {
                    aqf aqf2 = (aqf) f40917e.get(a);
                    if (!aqf.getClass().equals(aqf2.getClass())) {
                        Logger logger = f40913a;
                        Level level = Level.WARNING;
                        String str = "com.google.crypto.tink.Registry";
                        String str2 = "registerPrimitiveWrapper";
                        String str3 = "Attempted overwrite of a registered SetWrapper for type ";
                        String valueOf = String.valueOf(a.toString());
                        logger.logp(level, str, str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                        throw new GeneralSecurityException(C1642a.m8034a("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{a.getName(), aqf2.getClass().getName(), aqf.getClass().getName()}));
                    }
                }
                f40917e.put(a, aqf);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: a */
    private static <P> apw<P> m46901a(String str, Class<P> cls) throws GeneralSecurityException {
        apw<P> apw = (apw) f40914b.get(str);
        if (apw == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("No key manager found for key type: ");
            sb.append(str);
            sb.append(".  Check the configuration of the registry.");
            throw new GeneralSecurityException(sb.toString());
        } else if (cls == null || apw.mo39935b().equals(cls)) {
            return apw;
        } else {
            String name = apw.mo39935b().getName();
            String name2 = cls.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 80 + String.valueOf(str).length() + String.valueOf(name2).length());
            sb2.append("Primitive type ");
            sb2.append(name);
            sb2.append(" of keymanager for type ");
            sb2.append(str);
            sb2.append(" does not match requested primitive type ");
            sb2.append(name2);
            throw new GeneralSecurityException(sb2.toString());
        }
    }

    /* renamed from: a */
    public static synchronized zzbwe m46904a(atm atm) throws GeneralSecurityException {
        zzbwe c;
        synchronized (aqg.class) {
            apw a = m46901a(atm.zzflw, null);
            if (((Boolean) f40915c.get(atm.zzflw)).booleanValue()) {
                c = a.mo39936c(atm.zzflx);
            } else {
                String str = "newKey-operation not permitted for key type ";
                String valueOf = String.valueOf(atm.zzflw);
                throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return c;
    }

    /* renamed from: b */
    public static synchronized aza m46914b(atm atm) throws GeneralSecurityException {
        aza b;
        synchronized (aqg.class) {
            apw a = m46901a(atm.zzflw, null);
            if (((Boolean) f40915c.get(atm.zzflw)).booleanValue()) {
                b = a.mo39934b(atm.zzflx);
            } else {
                String str = "newKey-operation not permitted for key type ";
                String valueOf = String.valueOf(atm.zzflw);
                throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return b;
    }

    /* renamed from: a */
    public static synchronized aza m46903a(String str, aza aza) throws GeneralSecurityException {
        aza b;
        synchronized (aqg.class) {
            apw a = m46901a(str, null);
            if (((Boolean) f40915c.get(str)).booleanValue()) {
                b = a.mo39933b(aza);
            } else {
                String str2 = "newKey-operation not permitted for key type ";
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        return b;
    }

    /* renamed from: a */
    public static <P> P m46907a(String str, aza aza, Class<P> cls) throws GeneralSecurityException {
        return m46901a(str, (Class) m46906a((T) cls)).mo39930a(aza);
    }

    /* renamed from: a */
    private static <P> P m46908a(String str, zzcce zzcce, Class<P> cls) throws GeneralSecurityException {
        return m46901a(str, cls).mo39931a(zzcce);
    }

    /* renamed from: a */
    public static <P> P m46909a(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return m46908a(str, zzcce.zzy(bArr), (Class) m46906a((T) cls));
    }

    /* renamed from: a */
    public static <P> aqd<P> m46902a(apy apy, apw<P> apw, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) m46906a((T) cls);
        aqh.m46916b(apy.f40903a);
        aqd<P> a = aqd.m46895a(cls2);
        for (C15529b bVar : apy.f40903a.zzfmv) {
            if (bVar.mo40031c() == zzbwh.ENABLED) {
                aqe<P> a2 = a.mo39948a(m46908a(bVar.mo40030b().zzflw, bVar.mo40030b().zzflx, cls2), bVar);
                if (bVar.zzfmz == apy.f40903a.zzfmu) {
                    a.f40906a = a2;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public static <P> P m46905a(aqd<P> aqd) throws GeneralSecurityException {
        aqf aqf = (aqf) f40917e.get(aqd.f40907b);
        if (aqf != null) {
            return aqf.mo39951a(aqd);
        }
        String str = "No wrapper found for ";
        String valueOf = String.valueOf(aqd.f40907b.getName());
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
