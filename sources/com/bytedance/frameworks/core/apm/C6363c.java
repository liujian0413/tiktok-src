package com.bytedance.frameworks.core.apm;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.services.apm.api.IApmAgent;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.core.apm.c */
public final class C6363c {

    /* renamed from: a */
    private static final Map<String, HashSet<C6366d>> f18648a = new HashMap();

    /* renamed from: b */
    private static long f18649b = -1;

    /* renamed from: c */
    private static C6365a f18650c = new C6365a() {
        /* renamed from: d */
        public final int mo14936d() {
            return 7;
        }

        /* renamed from: e */
        public final int mo14937e() {
            return 80;
        }
    };

    /* renamed from: com.bytedance.frameworks.core.apm.c$a */
    public interface C6365a {
        /* renamed from: d */
        int mo14936d();

        /* renamed from: e */
        int mo14937e();
    }

    /* renamed from: b */
    private static void m19781b() {
        m19779a("special_monitor_v2");
        m19779a("default_ss_local_monitor");
        m19779a("ss_local_monitor");
        m19779a("ss_app_monitor");
    }

    /* renamed from: a */
    public static void m19777a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f18649b >= 43200000) {
            JSONObject jSONObject = new JSONObject();
            Iterator it = f18648a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    File file = new File((String) entry.getKey());
                    if (file.exists()) {
                        HashSet hashSet = (HashSet) entry.getValue();
                        long length = file.length();
                        long e = ((long) f18650c.mo14937e()) * 1024 * 1024;
                        int d = f18650c.mo14936d();
                        try {
                            jSONObject.put("before_size", length);
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                C6366d dVar = (C6366d) it2.next();
                                StringBuilder sb = new StringBuilder("before_count_");
                                sb.append(dVar.mo15240a());
                                jSONObject.put(sb.toString(), dVar.mo15244b());
                            }
                        } catch (JSONException unused) {
                        }
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            JSONObject jSONObject2 = jSONObject;
                            Iterator it4 = it;
                            ((C6366d) it3.next()).mo15242a(currentTimeMillis - (((long) d) * 86400000));
                            jSONObject = jSONObject2;
                            it = it4;
                        }
                        JSONObject jSONObject3 = jSONObject;
                        Iterator it5 = it;
                        if (length > e) {
                            do {
                                d--;
                                Iterator it6 = hashSet.iterator();
                                while (it6.hasNext()) {
                                    ((C6366d) it6.next()).mo15242a(currentTimeMillis - (((long) d) * 86400000));
                                }
                                length = file.length();
                                if (length < e) {
                                    break;
                                }
                            } while (d > 1);
                        }
                        JSONObject jSONObject4 = jSONObject3;
                        try {
                            jSONObject4.put("after_size", length);
                            Iterator it7 = hashSet.iterator();
                            while (it7.hasNext()) {
                                C6366d dVar2 = (C6366d) it7.next();
                                StringBuilder sb2 = new StringBuilder("after_count_");
                                sb2.append(dVar2.mo15240a());
                                jSONObject4.put(sb2.toString(), dVar2.mo15244b());
                            }
                        } catch (JSONException unused2) {
                        }
                        jSONObject = jSONObject4;
                        it = it5;
                    }
                }
            }
            JSONObject jSONObject5 = jSONObject;
            IApmAgent iApmAgent = (IApmAgent) C6446c.m20127a(IApmAgent.class);
            if (iApmAgent != null) {
                iApmAgent.monitorEvent("apm_db_size", null, jSONObject5, null);
            }
            m19781b();
            f18649b = currentTimeMillis;
        }
    }

    /* renamed from: a */
    public static void m19778a(C6365a aVar) {
        f18650c = aVar;
    }

    /* renamed from: a */
    private static void m19779a(String str) {
        try {
            Context a = C6174c.m19129a();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".db");
            File databasePath = a.getDatabasePath(sb.toString());
            if (databasePath.exists()) {
                databasePath.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m19780a(String str, C6366d dVar) {
        if (str != null) {
            HashSet hashSet = (HashSet) f18648a.get(str);
            if (hashSet == null) {
                synchronized (f18648a) {
                    hashSet = (HashSet) f18648a.get(str);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        f18648a.put(str, hashSet);
                    }
                }
            }
            hashSet.add(dVar);
        }
    }
}
