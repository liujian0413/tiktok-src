package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.C16505en;
import com.google.android.gms.internal.measurement.C16508eq;
import com.google.android.gms.internal.measurement.C16509er;
import com.google.android.gms.internal.measurement.C16510es;
import com.google.android.gms.internal.measurement.zzb;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.aq */
final class C16999aq {

    /* renamed from: a */
    private static final C16990ai<C16505en> f47618a = new C16990ai<>(C17017bh.m56488a(), true);

    /* renamed from: b */
    private final C17044s f47619b;

    /* renamed from: c */
    private final Map<String, C17045t> f47620c;

    /* renamed from: d */
    private final Map<String, C17045t> f47621d;

    /* renamed from: e */
    private final Map<String, C17045t> f47622e;

    /* renamed from: f */
    private final C17020bk<C16509er, C16990ai<C16505en>> f47623f;

    /* renamed from: g */
    private final C17020bk<String, C17003au> f47624g;

    /* renamed from: h */
    private final Set<C16510es> f47625h;

    /* renamed from: i */
    private final C17024c f47626i;

    /* renamed from: j */
    private final Map<String, C17004av> f47627j;

    /* renamed from: k */
    private volatile String f47628k;

    /* renamed from: l */
    private int f47629l;

    /* renamed from: a */
    public final synchronized void mo44224a(String str) {
        m56473b(str);
        C17035j a = this.f47619b.mo44275a(str).mo44274a();
        for (C16509er a2 : (Set) m56470a(this.f47625h, (Set<String>) new HashSet<String>(), (C17002at) new C17001as(this), a.mo44264b()).f47607a) {
            m56469a(this.f47620c, a2, (Set<String>) new HashSet<String>(), a.mo44263a());
        }
        m56473b(null);
    }

    /* renamed from: b */
    private final synchronized void m56473b(String str) {
        this.f47628k = str;
    }

    /* renamed from: a */
    private final C16990ai<Set<C16509er>> m56470a(Set<C16510es> set, Set<String> set2, C17002at atVar, C16998ap apVar) {
        boolean z;
        C16990ai aiVar;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (true) {
            boolean z2 = true;
            while (true) {
                if (it.hasNext()) {
                    C16510es esVar = (C16510es) it.next();
                    C16997ao a = apVar.mo44216a();
                    Iterator it2 = esVar.f46268b.iterator();
                    while (true) {
                        boolean z3 = true;
                        while (true) {
                            if (!it2.hasNext()) {
                                Iterator it3 = esVar.f46267a.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        C17017bh.m56489a((Object) Boolean.valueOf(true));
                                        aiVar = new C16990ai(Boolean.valueOf(true), z);
                                        break;
                                    }
                                    C16990ai a2 = m56467a((C16509er) it3.next(), set2, a.mo44211b());
                                    if (!((Boolean) a2.f47607a).booleanValue()) {
                                        C17017bh.m56489a((Object) Boolean.valueOf(false));
                                        aiVar = new C16990ai(Boolean.valueOf(false), a2.f47608b);
                                        break;
                                    }
                                    z = z && a2.f47608b;
                                }
                            } else {
                                C16990ai a3 = m56467a((C16509er) it2.next(), set2, a.mo44210a());
                                if (((Boolean) a3.f47607a).booleanValue()) {
                                    C17017bh.m56489a((Object) Boolean.valueOf(false));
                                    aiVar = new C16990ai(Boolean.valueOf(false), a3.f47608b);
                                    break;
                                } else if (!z || !a3.f47608b) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                    if (((Boolean) aiVar.f47607a).booleanValue()) {
                        atVar.mo44225a(esVar, hashSet, hashSet2, a);
                    }
                    if (!z2 || !aiVar.f47608b) {
                        z2 = false;
                    }
                } else {
                    hashSet.removeAll(hashSet2);
                    return new C16990ai<>(hashSet, z2);
                }
            }
        }
    }

    /* renamed from: a */
    private final C16990ai<Boolean> m56467a(C16509er erVar, Set<String> set, C16994al alVar) {
        C16990ai a = m56469a(this.f47621d, erVar, set, alVar);
        Boolean b = C17017bh.m56491b((C16505en) a.f47607a);
        C17017bh.m56489a((Object) b);
        return new C16990ai<>(b, a.f47608b);
    }

    /* renamed from: a */
    private final String m56471a() {
        if (this.f47629l <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.f47629l));
        for (int i = 2; i < this.f47629l; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    /* renamed from: a */
    private final C16990ai<C16505en> m56468a(String str, Set<String> set, C16982aa aaVar) {
        C16509er erVar;
        C16990ai<C16505en> aiVar;
        this.f47629l++;
        C17003au auVar = (C17003au) this.f47624g.mo44244a(str);
        if (auVar != null) {
            m56472a(auVar.f47635b, set);
            this.f47629l--;
            return auVar.f47634a;
        }
        C17004av avVar = (C17004av) this.f47627j.get(str);
        if (avVar == null) {
            String a = m56471a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 15 + String.valueOf(str).length());
            sb.append(a);
            sb.append("Invalid macro: ");
            sb.append(str);
            this.f47629l--;
            return f47618a;
        }
        Set<C16510es> set2 = avVar.f47636a;
        Map<C16510es, List<C16509er>> map = avVar.f47637b;
        Map<C16510es, List<String>> map2 = avVar.f47639d;
        Map<C16510es, List<C16509er>> map3 = avVar.f47638c;
        Map<C16510es, List<String>> map4 = avVar.f47640e;
        C16998ap b = aaVar.mo44207b();
        C17000ar arVar = new C17000ar(this, map, map2, map3, map4);
        C16990ai a2 = m56470a(set2, set, (C17002at) arVar, b);
        if (((Set) a2.f47607a).isEmpty()) {
            erVar = avVar.f47641f;
        } else {
            if (((Set) a2.f47607a).size() > 1) {
                String a3 = m56471a();
                StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 37 + String.valueOf(str).length());
                sb2.append(a3);
                sb2.append("Multiple macros active for macroName ");
                sb2.append(str);
            }
            erVar = (C16509er) ((Set) a2.f47607a).iterator().next();
        }
        if (erVar == null) {
            this.f47629l--;
            return f47618a;
        }
        C16990ai<C16505en> a4 = m56469a(this.f47622e, erVar, set, aaVar.mo44206a());
        boolean z = a2.f47608b && a4.f47608b;
        if (a4 == f47618a) {
            aiVar = f47618a;
        } else {
            aiVar = new C16990ai<>((C16505en) a4.f47607a, z);
        }
        C16505en enVar = erVar.f46265a;
        if (aiVar.f47608b) {
            new C17003au(aiVar, enVar);
        }
        m56472a(enVar, set);
        this.f47629l--;
        return aiVar;
    }

    /* renamed from: a */
    private final void m56472a(C16505en enVar, Set<String> set) {
        if (enVar != null) {
            C16990ai<C16505en> a = m56466a(enVar, set, (C17018bi) new C16989ah());
            if (a != f47618a) {
                Object c = C17017bh.m56493c((C16505en) a.f47607a);
                if (c instanceof Map) {
                    this.f47626i.mo44251a((Map) c);
                } else if (c instanceof List) {
                    for (Object next : (List) c) {
                        if (next instanceof Map) {
                            this.f47626i.mo44251a((Map) next);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final C16990ai<C16505en> m56466a(C16505en enVar, Set<String> set, C17018bi biVar) {
        if (!enVar.f46262l) {
            return new C16990ai<>(enVar, true);
        }
        int i = enVar.f46251a;
        if (i != 7) {
            switch (i) {
                case 2:
                    C16505en a = C16508eq.m53813a(enVar);
                    a.f46253c = new C16505en[enVar.f46253c.length];
                    for (int i2 = 0; i2 < enVar.f46253c.length; i2++) {
                        C16990ai<C16505en> a2 = m56466a(enVar.f46253c[i2], set, biVar.mo44218a(i2));
                        if (a2 == f47618a) {
                            return f47618a;
                        }
                        a.f46253c[i2] = (C16505en) a2.f47607a;
                    }
                    return new C16990ai<>(a, false);
                case 3:
                    C16505en a3 = C16508eq.m53813a(enVar);
                    if (enVar.f46254d.length != enVar.f46255e.length) {
                        String str = "Invalid serving value: ";
                        String valueOf = String.valueOf(enVar.toString());
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            new String(str);
                        }
                        return f47618a;
                    }
                    a3.f46254d = new C16505en[enVar.f46254d.length];
                    a3.f46255e = new C16505en[enVar.f46254d.length];
                    for (int i3 = 0; i3 < enVar.f46254d.length; i3++) {
                        C16990ai<C16505en> a4 = m56466a(enVar.f46254d[i3], set, biVar.mo44219b(i3));
                        C16990ai<C16505en> a5 = m56466a(enVar.f46255e[i3], set, biVar.mo44220c(i3));
                        if (a4 == f47618a || a5 == f47618a) {
                            return f47618a;
                        }
                        a3.f46254d[i3] = (C16505en) a4.f47607a;
                        a3.f46255e[i3] = (C16505en) a5.f47607a;
                    }
                    return new C16990ai<>(a3, false);
                case 4:
                    if (set.contains(enVar.f46256f)) {
                        String str2 = enVar.f46256f;
                        String obj = set.toString();
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 79 + String.valueOf(obj).length());
                        sb.append("Macro cycle detected.  Current macro reference: ");
                        sb.append(str2);
                        sb.append(".  Previous macro references: ");
                        sb.append(obj);
                        sb.append(ClassUtils.PACKAGE_SEPARATOR);
                        return f47618a;
                    }
                    set.add(enVar.f46256f);
                    C16990ai<C16505en> a6 = C17019bj.m56503a(m56468a(enVar.f46256f, set, biVar.mo44217a()), enVar.f46261k);
                    set.remove(enVar.f46256f);
                    return a6;
                default:
                    int i4 = enVar.f46251a;
                    StringBuilder sb2 = new StringBuilder(25);
                    sb2.append("Unknown type: ");
                    sb2.append(i4);
                    return f47618a;
            }
        } else {
            C16505en a7 = C16508eq.m53813a(enVar);
            a7.f46260j = new C16505en[enVar.f46260j.length];
            for (int i5 = 0; i5 < enVar.f46260j.length; i5++) {
                C16990ai<C16505en> a8 = m56466a(enVar.f46260j[i5], set, biVar.mo44221d(i5));
                if (a8 == f47618a) {
                    return f47618a;
                }
                a7.f46260j[i5] = (C16505en) a8.f47607a;
            }
            return new C16990ai<>(a7, false);
        }
    }

    /* renamed from: a */
    private final C16990ai<C16505en> m56469a(Map<String, C17045t> map, C16509er erVar, Set<String> set, C16994al alVar) {
        C16505en enVar = (C16505en) erVar.mo42702a().get(zzb.FUNCTION.toString());
        if (enVar == null) {
            return f47618a;
        }
        String str = enVar.f46257g;
        C17045t tVar = (C17045t) map.get(str);
        if (tVar == null) {
            String.valueOf(str).concat(" has no backing implementation.");
            return f47618a;
        }
        C16990ai<C16505en> aiVar = (C16990ai) this.f47623f.mo44244a(erVar);
        if (aiVar != null) {
            return aiVar;
        }
        HashMap hashMap = new HashMap();
        boolean z = true;
        boolean z2 = true;
        for (Entry entry : erVar.mo42702a().entrySet()) {
            C16990ai<C16505en> a = m56466a((C16505en) entry.getValue(), set, alVar.mo44208a((String) entry.getKey()).mo44209a((C16505en) entry.getValue()));
            if (a == f47618a) {
                return f47618a;
            }
            if (a.f47608b) {
                erVar.mo42703a((String) entry.getKey(), (C16505en) a.f47607a);
            } else {
                z2 = false;
            }
            hashMap.put((String) entry.getKey(), (C16505en) a.f47607a);
        }
        if (!tVar.mo44278a(hashMap.keySet())) {
            String valueOf = String.valueOf(tVar.mo44279b());
            String valueOf2 = String.valueOf(hashMap.keySet());
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            sb.append("Incorrect keys for function ");
            sb.append(str);
            sb.append(" required ");
            sb.append(valueOf);
            sb.append(" had ");
            sb.append(valueOf2);
            return f47618a;
        }
        if (!z2 || !tVar.mo44277a()) {
            z = false;
        }
        return new C16990ai<>(tVar.mo44276a((Map<String, C16505en>) hashMap), z);
    }
}
