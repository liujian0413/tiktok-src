package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.be */
public final class C16412be {

    /* renamed from: a */
    public final Map<String, String> f45954a;

    /* renamed from: b */
    public final List<zzbr> f45955b;

    /* renamed from: c */
    public final long f45956c;

    /* renamed from: d */
    public final long f45957d;

    /* renamed from: e */
    public final int f45958e;

    /* renamed from: f */
    public final boolean f45959f;

    /* renamed from: g */
    private final String f45960g;

    public C16412be(C16694q qVar, Map<String, String> map, long j, boolean z) {
        this(qVar, map, j, true, 0, 0, null);
    }

    public C16412be(C16694q qVar, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(qVar, map, j, z, j2, i, null);
    }

    public C16412be(C16694q qVar, Map<String, String> map, long j, boolean z, long j2, int i, List<zzbr> list) {
        List<zzbr> list2;
        String str;
        C15267r.m44384a(qVar);
        C15267r.m44384a(map);
        this.f45957d = j;
        this.f45959f = z;
        this.f45956c = j2;
        this.f45958e = i;
        if (list != null) {
            list2 = list;
        } else {
            list2 = Collections.emptyList();
        }
        this.f45955b = list2;
        String str2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zzbr zzbr = (zzbr) it.next();
                if ("appendVersion".equals(zzbr.f46671a)) {
                    str = zzbr.f46672b;
                    break;
                }
            }
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        this.f45960g = str2;
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            if (m53475a(entry.getKey())) {
                String a = m53473a(qVar, entry.getKey());
                if (a != null) {
                    hashMap.put(a, m53476b(qVar, entry.getValue()));
                }
            }
        }
        for (Entry entry2 : map.entrySet()) {
            if (!m53475a(entry2.getKey())) {
                String a2 = m53473a(qVar, entry2.getKey());
                if (a2 != null) {
                    hashMap.put(a2, m53476b(qVar, entry2.getValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(this.f45960g)) {
            C16432by.m53549a((Map<String, String>) hashMap, "_v", this.f45960g);
            if (this.f45960g.equals("ma4.0.0") || this.f45960g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.f45954a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m53475a(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    /* renamed from: a */
    private static String m53473a(C16694q qVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            qVar.mo43196c("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    /* renamed from: b */
    private static String m53476b(C16694q qVar, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        String substring = obj2.substring(0, VideoCacheReadBuffersizeExperiment.DEFAULT);
        qVar.mo43196c("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
        return substring;
    }

    /* renamed from: a */
    public final long mo42533a() {
        return C16432by.m53546a(m53474a("_s", "0"));
    }

    /* renamed from: b */
    public final String mo42534b() {
        return m53474a("_m", "");
    }

    /* renamed from: a */
    private final String m53474a(String str, String str2) {
        C15267r.m44386a(str);
        C15267r.m44395b(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.f45954a.get(str);
        return str3 != null ? str3 : str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.f45957d);
        if (this.f45956c != 0) {
            sb.append(", dbId=");
            sb.append(this.f45956c);
        }
        if (this.f45958e != 0) {
            sb.append(", appUID=");
            sb.append(this.f45958e);
        }
        ArrayList arrayList = new ArrayList(this.f45954a.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) obj;
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append((String) this.f45954a.get(str));
        }
        return sb.toString();
    }
}
