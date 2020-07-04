package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.C1642a;
import com.google.android.gms.ads.internal.C14793ay;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ku */
public final class C15827ku {

    /* renamed from: a */
    private final Map<C15828kv, C15829kw> f44557a = new HashMap();

    /* renamed from: b */
    private final LinkedList<C15828kv> f44558b = new LinkedList<>();

    /* renamed from: c */
    private C15795jp f44559c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41698a(C15795jp jpVar) {
        if (this.f44559c == null) {
            this.f44559c = jpVar.mo41679b();
            if (this.f44559c != null) {
                SharedPreferences a = C7285c.m22838a(this.f44559c.mo41676a(), "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.f44558b.size() > 0) {
                    C15828kv kvVar = (C15828kv) this.f44558b.remove();
                    C15829kw kwVar = (C15829kw) this.f44557a.get(kvVar);
                    m51186a("Flushing interstitial queue for %s.", kvVar);
                    while (kwVar.mo41703a() > 0) {
                        kwVar.mo41704a((zzyv) null).f44566a.mo37799F();
                    }
                    this.f44557a.remove(kvVar);
                }
                try {
                    HashMap hashMap = new HashMap();
                    for (Entry entry : a.getAll().entrySet()) {
                        if (!((String) entry.getKey()).equals("PoolKeys")) {
                            C15834la a2 = C15834la.m51251a((String) entry.getValue());
                            C15828kv kvVar2 = new C15828kv(a2.f44584a, a2.f44585b, a2.f44586c);
                            if (!this.f44557a.containsKey(kvVar2)) {
                                this.f44557a.put(kvVar2, new C15829kw(a2.f44584a, a2.f44585b, a2.f44586c));
                                hashMap.put(kvVar2.toString(), kvVar2);
                                m51186a("Restored interstitial queue for %s.", kvVar2);
                            }
                        }
                    }
                    for (String str : m51187a(a.getString("PoolKeys", ""))) {
                        C15828kv kvVar3 = (C15828kv) hashMap.get(str);
                        if (this.f44557a.containsKey(kvVar3)) {
                            this.f44558b.add(kvVar3);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    C14793ay.m42898d().mo39089a(e, "InterstitialAdPool.restore");
                    acd.m45780c("Malformed preferences value for InterstitialAdPool.", e);
                    this.f44557a.clear();
                    this.f44558b.clear();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C15830kx mo41696a(zzyv zzyv, String str) {
        if (m51190b(str)) {
            return null;
        }
        int i = new C16165xi(this.f44559c.mo41676a()).mo42063a().f45356o;
        zzyv c = m51191c(zzyv);
        String c2 = m51192c(str);
        C15828kv kvVar = new C15828kv(c, c2, i);
        C15829kw kwVar = (C15829kw) this.f44557a.get(kvVar);
        if (kwVar == null) {
            m51186a("Interstitial pool created at %s.", kvVar);
            kwVar = new C15829kw(c, c2, i);
            this.f44557a.put(kvVar, kwVar);
        }
        this.f44558b.remove(kvVar);
        this.f44558b.add(kvVar);
        kwVar.mo41709d();
        while (true) {
            if (this.f44558b.size() <= ((Integer) bym.m50299d().mo41272a(C15585bw.f43770aQ)).intValue()) {
                break;
            }
            C15828kv kvVar2 = (C15828kv) this.f44558b.remove();
            C15829kw kwVar2 = (C15829kw) this.f44557a.get(kvVar2);
            m51186a("Evicting interstitial queue for %s.", kvVar2);
            while (kwVar2.mo41703a() > 0) {
                C15830kx a = kwVar2.mo41704a((zzyv) null);
                if (a.f44570e) {
                    C15831ky.m51208a().mo41713c();
                }
                a.f44566a.mo37799F();
            }
            this.f44557a.remove(kvVar2);
        }
        while (kwVar.mo41703a() > 0) {
            C15830kx a2 = kwVar.mo41704a(c);
            if (a2.f44570e) {
                if (C14793ay.m42901g().mo38684a() - a2.f44569d > ((long) ((Integer) bym.m50299d().mo41272a(C15585bw.f43772aS)).intValue()) * 1000) {
                    m51186a("Expired interstitial at %s.", kvVar);
                    C15831ky.m51208a().mo41712b();
                }
            }
            String str2 = a2.f44567b != null ? " (inline) " : " ";
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 34);
            sb.append("Pooled interstitial");
            sb.append(str2);
            sb.append("returned at %s.");
            m51186a(sb.toString(), kvVar);
            return a2;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo41699b(zzyv zzyv, String str) {
        if (this.f44559c != null) {
            int i = new C16165xi(this.f44559c.mo41676a()).mo42063a().f45356o;
            zzyv c = m51191c(zzyv);
            String c2 = m51192c(str);
            C15828kv kvVar = new C15828kv(c, c2, i);
            C15829kw kwVar = (C15829kw) this.f44557a.get(kvVar);
            if (kwVar == null) {
                m51186a("Interstitial pool created at %s.", kvVar);
                kwVar = new C15829kw(c, c2, i);
                this.f44557a.put(kvVar, kwVar);
            }
            kwVar.mo41705a(this.f44559c, zzyv);
            kwVar.mo41709d();
            m51186a("Inline entry added to the queue at %s.", kvVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41697a() {
        if (this.f44559c != null) {
            for (Entry entry : this.f44557a.entrySet()) {
                C15828kv kvVar = (C15828kv) entry.getKey();
                C15829kw kwVar = (C15829kw) entry.getValue();
                if (acd.m45776a(2)) {
                    int a = kwVar.mo41703a();
                    int b = kwVar.mo41707b();
                    if (b < a) {
                        acd.m45438a(C1642a.m8034a("Loading %s/%s pooled interstitials for %s.", new Object[]{Integer.valueOf(a - b), Integer.valueOf(a), kvVar}));
                    }
                }
                int c = kwVar.mo41708c() + 0;
                while (true) {
                    if (kwVar.mo41703a() >= ((Integer) bym.m50299d().mo41272a(C15585bw.f43771aR)).intValue()) {
                        break;
                    }
                    m51186a("Pooling and loading one new interstitial for %s.", kvVar);
                    if (kwVar.mo41706a(this.f44559c)) {
                        c++;
                    }
                }
                C15831ky.m51208a().mo41711a(c);
            }
            if (this.f44559c != null) {
                Editor edit = C7285c.m22838a(this.f44559c.mo41676a(), "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
                edit.clear();
                for (Entry entry2 : this.f44557a.entrySet()) {
                    C15828kv kvVar2 = (C15828kv) entry2.getKey();
                    C15829kw kwVar2 = (C15829kw) entry2.getValue();
                    if (kwVar2.f44564d) {
                        edit.putString(kvVar2.toString(), new C15834la(kwVar2).mo41717a());
                        m51186a("Saved interstitial queue for %s.", kvVar2);
                    }
                }
                edit.putString("PoolKeys", m51189b());
                edit.apply();
            }
        }
    }

    /* renamed from: b */
    private final String m51189b() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f44558b.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(((C15828kv) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static String[] m51187a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    /* renamed from: b */
    private static boolean m51190b(String str) {
        try {
            return Pattern.matches((String) bym.m50299d().mo41272a(C15585bw.f43773aT), str);
        } catch (RuntimeException e) {
            C14793ay.m42898d().mo39089a((Throwable) e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    /* renamed from: a */
    static Set<String> m51184a(zzyv zzyv) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(zzyv.f45779c.keySet());
        Bundle bundle = zzyv.f45789m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    /* renamed from: b */
    static zzyv m51188b(zzyv zzyv) {
        zzyv d = m51193d(zzyv);
        String str = "_skipMediation";
        Bundle bundle = d.f45789m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        d.f45779c.putBoolean(str, true);
        return d;
    }

    /* renamed from: c */
    private static zzyv m51191c(zzyv zzyv) {
        String[] split;
        zzyv d = m51193d(zzyv);
        for (String str : ((String) bym.m50299d().mo41272a(C15585bw.f43769aP)).split(",")) {
            m51185a(d.f45789m, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                m51185a(d.f45779c, str.replaceFirst(str2, ""));
            }
        }
        return d;
    }

    /* renamed from: c */
    private static String m51192c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            if (matcher.matches()) {
                return matcher.group(1);
            }
        } catch (RuntimeException unused) {
        }
        return str;
    }

    /* renamed from: d */
    private static zzyv m51193d(zzyv zzyv) {
        Parcel obtain = Parcel.obtain();
        zzyv.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzyv zzyv2 = (zzyv) zzyv.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return zzyv2.mo42397a();
    }

    /* renamed from: a */
    private static void m51185a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m51186a(String str, C15828kv kvVar) {
        if (acd.m45776a(2)) {
            acd.m45438a(C1642a.m8034a(str, new Object[]{kvVar}));
        }
    }
}
