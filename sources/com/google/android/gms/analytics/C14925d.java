package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.p744a.C14920a;
import com.google.android.gms.analytics.p744a.C14921b;
import com.google.android.gms.analytics.p744a.C14922c;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.measurement.C16380a;
import com.google.android.gms.internal.measurement.C16407b;
import com.google.android.gms.internal.measurement.C16412be;
import com.google.android.gms.internal.measurement.C16432by;
import com.google.android.gms.internal.measurement.C16434c;
import com.google.android.gms.internal.measurement.C16464d;
import com.google.android.gms.internal.measurement.C16491e;
import com.google.android.gms.internal.measurement.C16518f;
import com.google.android.gms.internal.measurement.C16545g;
import com.google.android.gms.internal.measurement.C16573h;
import com.google.android.gms.internal.measurement.C16605i;
import com.google.android.gms.internal.measurement.C16632j;
import com.google.android.gms.internal.measurement.C16648jp;
import com.google.android.gms.internal.measurement.C16677kn;
import com.google.android.gms.internal.measurement.C16688ky;
import com.google.android.gms.internal.measurement.C16694q;
import com.google.android.gms.internal.measurement.C16696s;
import com.google.android.gms.internal.measurement.C16697t;
import com.google.android.gms.internal.measurement.C16700w;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.d */
public final class C14925d extends C16694q implements C14939o {

    /* renamed from: b */
    private static DecimalFormat f38595b;

    /* renamed from: c */
    private final C16697t f38596c;

    /* renamed from: d */
    private final String f38597d;

    /* renamed from: e */
    private final Uri f38598e;

    public C14925d(C16697t tVar, String str) {
        this(tVar, str, true, false);
    }

    private C14925d(C16697t tVar, String str, boolean z, boolean z2) {
        super(tVar);
        C15267r.m44386a(str);
        this.f38596c = tVar;
        this.f38597d = str;
        this.f38598e = m43343a(this.f38597d);
    }

    /* renamed from: a */
    static Uri m43343a(String str) {
        C15267r.m44386a(str);
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* renamed from: a */
    public final Uri mo37986a() {
        return this.f38598e;
    }

    /* renamed from: a */
    public final void mo37987a(C14930i iVar) {
        C15267r.m44384a(iVar);
        C15267r.m44395b(iVar.f38603b, "Can't deliver not submitted measurement");
        C15267r.m44397c("deliver should be called on worker thread");
        C14930i a = iVar.mo37990a();
        C16545g gVar = (C16545g) a.mo37993b(C16545g.class);
        if (TextUtils.isEmpty(gVar.f46333a)) {
            mo43205i().mo42539a(m43349b(a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(gVar.f46334b)) {
            mo43205i().mo42539a(m43349b(a), "Ignoring measurement without client id");
        } else if (!this.f38596c.mo43220e().f38587b) {
            double d = gVar.f46340h;
            if (C16432by.m53550a(d, gVar.f46334b)) {
                mo43191b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                return;
            }
            Map b = m43349b(a);
            b.put("v", "1");
            b.put("_v", C16696s.f46637b);
            b.put("tid", this.f38597d);
            if (this.f38596c.mo43220e().f38586a) {
                StringBuilder sb = new StringBuilder();
                for (Entry entry : b.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                }
                mo43195c("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            C16432by.m53549a((Map<String, String>) hashMap, "uid", gVar.f46335c);
            C16648jp jpVar = (C16648jp) iVar.mo37991a(C16648jp.class);
            if (jpVar != null) {
                C16432by.m53549a((Map<String, String>) hashMap, "an", jpVar.f46519a);
                C16432by.m53549a((Map<String, String>) hashMap, "aid", jpVar.f46521c);
                C16432by.m53549a((Map<String, String>) hashMap, "av", jpVar.f46520b);
                C16432by.m53549a((Map<String, String>) hashMap, "aiid", jpVar.f46522d);
            }
            C16700w wVar = new C16700w(0, gVar.f46334b, this.f38597d, !TextUtils.isEmpty(gVar.f46336d), 0, hashMap);
            b.put("_s", String.valueOf(mo43208l().mo43174a(wVar)));
            C16412be beVar = new C16412be(mo43205i(), b, iVar.f38604c, true);
            mo43208l().mo43176a(beVar);
        }
    }

    /* renamed from: b */
    private static Map<String, String> m43349b(C14930i iVar) {
        HashMap hashMap = new HashMap();
        C16407b bVar = (C16407b) iVar.mo37991a(C16407b.class);
        if (bVar != null) {
            for (Entry entry : bVar.mo42530a().entrySet()) {
                Object value = entry.getValue();
                String str = null;
                if (value != null) {
                    if (value instanceof String) {
                        String str2 = (String) value;
                        if (!TextUtils.isEmpty(str2)) {
                            str = str2;
                        }
                    } else if (value instanceof Double) {
                        Double d = (Double) value;
                        if (d.doubleValue() != 0.0d) {
                            str = m43344a(d.doubleValue());
                        }
                    } else if (!(value instanceof Boolean)) {
                        str = String.valueOf(value);
                    } else if (value != Boolean.FALSE) {
                        str = "1";
                    }
                }
                if (str != null) {
                    hashMap.put((String) entry.getKey(), str);
                }
            }
        }
        C16545g gVar = (C16545g) iVar.mo37991a(C16545g.class);
        if (gVar != null) {
            m43347a((Map<String, String>) hashMap, "t", gVar.f46333a);
            m43347a((Map<String, String>) hashMap, "cid", gVar.f46334b);
            m43347a((Map<String, String>) hashMap, "uid", gVar.f46335c);
            m43347a((Map<String, String>) hashMap, "sc", gVar.f46338f);
            m43345a((Map<String, String>) hashMap, "sf", gVar.f46340h);
            m43348a((Map<String, String>) hashMap, "ni", gVar.f46339g);
            m43347a((Map<String, String>) hashMap, "adid", gVar.f46336d);
            m43348a((Map<String, String>) hashMap, "ate", gVar.f46337e);
        }
        C16573h hVar = (C16573h) iVar.mo37991a(C16573h.class);
        if (hVar != null) {
            m43347a((Map<String, String>) hashMap, "cd", hVar.f46382a);
            m43345a((Map<String, String>) hashMap, "a", (double) hVar.f46383b);
            m43347a((Map<String, String>) hashMap, "dr", hVar.f46384c);
        }
        C16491e eVar = (C16491e) iVar.mo37991a(C16491e.class);
        if (eVar != null) {
            m43347a((Map<String, String>) hashMap, "ec", eVar.f46149a);
            m43347a((Map<String, String>) hashMap, "ea", eVar.f46150b);
            m43347a((Map<String, String>) hashMap, "el", eVar.f46151c);
            m43345a((Map<String, String>) hashMap, "ev", (double) eVar.f46152d);
        }
        C16677kn knVar = (C16677kn) iVar.mo37991a(C16677kn.class);
        if (knVar != null) {
            m43347a((Map<String, String>) hashMap, "cn", knVar.f46580a);
            m43347a((Map<String, String>) hashMap, "cs", knVar.f46581b);
            m43347a((Map<String, String>) hashMap, "cm", knVar.f46582c);
            m43347a((Map<String, String>) hashMap, "ck", knVar.f46583d);
            m43347a((Map<String, String>) hashMap, "cc", knVar.f46584e);
            m43347a((Map<String, String>) hashMap, "ci", knVar.f46585f);
            m43347a((Map<String, String>) hashMap, "anid", knVar.f46586g);
            m43347a((Map<String, String>) hashMap, "gclid", knVar.f46587h);
            m43347a((Map<String, String>) hashMap, "dclid", knVar.f46588i);
            m43347a((Map<String, String>) hashMap, "aclid", knVar.f46589j);
        }
        C16518f fVar = (C16518f) iVar.mo37991a(C16518f.class);
        if (fVar != null) {
            m43347a((Map<String, String>) hashMap, "exd", fVar.f46298a);
            m43348a((Map<String, String>) hashMap, "exf", fVar.f46299b);
        }
        C16605i iVar2 = (C16605i) iVar.mo37991a(C16605i.class);
        if (iVar2 != null) {
            m43347a((Map<String, String>) hashMap, "sn", iVar2.f46446a);
            m43347a((Map<String, String>) hashMap, "sa", iVar2.f46447b);
            m43347a((Map<String, String>) hashMap, "st", iVar2.f46448c);
        }
        C16632j jVar = (C16632j) iVar.mo37991a(C16632j.class);
        if (jVar != null) {
            m43347a((Map<String, String>) hashMap, "utv", jVar.f46490a);
            m43345a((Map<String, String>) hashMap, "utt", (double) jVar.f46491b);
            m43347a((Map<String, String>) hashMap, "utc", jVar.f46492c);
            m43347a((Map<String, String>) hashMap, "utl", jVar.f46493d);
        }
        C16688ky kyVar = (C16688ky) iVar.mo37991a(C16688ky.class);
        if (kyVar != null) {
            for (Entry entry2 : kyVar.mo43172a().entrySet()) {
                String a = C14927f.m43352a(((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put(a, (String) entry2.getValue());
                }
            }
        }
        C16380a aVar = (C16380a) iVar.mo37991a(C16380a.class);
        if (aVar != null) {
            for (Entry entry3 : aVar.mo42470a().entrySet()) {
                String b = C14927f.m43354b(((Integer) entry3.getKey()).intValue());
                if (!TextUtils.isEmpty(b)) {
                    hashMap.put(b, m43344a(((Double) entry3.getValue()).doubleValue()));
                }
            }
        }
        C16464d dVar = (C16464d) iVar.mo37991a(C16464d.class);
        if (dVar != null) {
            C14921b bVar2 = dVar.f46060b;
            if (bVar2 != null) {
                for (Entry entry4 : bVar2.mo37978a().entrySet()) {
                    if (((String) entry4.getKey()).startsWith("&")) {
                        hashMap.put(((String) entry4.getKey()).substring(1), (String) entry4.getValue());
                    } else {
                        hashMap.put((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
            int i = 1;
            for (C14922c a2 : dVar.mo42651b()) {
                hashMap.putAll(a2.mo37980a(C14927f.m43356d(i)));
                i++;
            }
            int i2 = 1;
            for (C14920a a3 : dVar.mo42650a()) {
                hashMap.putAll(a3.mo37976a(C14927f.m43355c(i2)));
                i2++;
            }
            int i3 = 1;
            for (Entry entry5 : dVar.f46059a.entrySet()) {
                List<C14920a> list = (List) entry5.getValue();
                String f = C14927f.m43358f(i3);
                int i4 = 1;
                for (C14920a aVar2 : list) {
                    String valueOf = String.valueOf(f);
                    String valueOf2 = String.valueOf(C14927f.m43357e(i4));
                    hashMap.putAll(aVar2.mo37976a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry5.getKey())) {
                    String valueOf3 = String.valueOf(f);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), (String) entry5.getKey());
                }
                i3++;
            }
        }
        C16434c cVar = (C16434c) iVar.mo37991a(C16434c.class);
        if (cVar != null) {
            m43347a((Map<String, String>) hashMap, "ul", cVar.f46005a);
            m43345a((Map<String, String>) hashMap, "sd", (double) cVar.f46006b);
            m43346a(hashMap, "sr", cVar.f46007c, cVar.f46008d);
            m43346a(hashMap, "vp", cVar.f46009e, cVar.f46010f);
        }
        C16648jp jpVar = (C16648jp) iVar.mo37991a(C16648jp.class);
        if (jpVar != null) {
            m43347a((Map<String, String>) hashMap, "an", jpVar.f46519a);
            m43347a((Map<String, String>) hashMap, "aid", jpVar.f46521c);
            m43347a((Map<String, String>) hashMap, "aiid", jpVar.f46522d);
            m43347a((Map<String, String>) hashMap, "av", jpVar.f46520b);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m43347a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    private static String m43344a(double d) {
        if (f38595b == null) {
            f38595b = new DecimalFormat("0.######");
        }
        return f38595b.format(d);
    }

    /* renamed from: a */
    private static void m43345a(Map<String, String> map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, m43344a(d));
        }
    }

    /* renamed from: a */
    private static void m43348a(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* renamed from: a */
    private static void m43346a(Map<String, String> map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            map.put(str, sb.toString());
        }
    }
}
