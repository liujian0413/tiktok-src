package com.bytedance.ies.web.p583b;

import com.bytedance.ies.web.p583b.C11110e.C11111a;
import com.bytedance.ies.web.p583b.C11110e.C11112b;
import com.bytedance.ies.web.p583b.C11126n.C11127a;
import com.p280ss.android.vesdk.C45323k;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.b.o */
public final class C11130o {

    /* renamed from: d */
    public static final C11131a f30217d = new C11131a(null);

    /* renamed from: a */
    public final C11143s<String, C11126n> f30218a;

    /* renamed from: b */
    public final LinkedHashSet<String> f30219b = new LinkedHashSet<>();

    /* renamed from: c */
    public final C11109d f30220c;

    /* renamed from: e */
    private final C11110e f30221e;

    /* renamed from: f */
    private final Executor f30222f;

    /* renamed from: com.bytedance.ies.web.b.o$a */
    public static final class C11131a {
        private C11131a() {
        }

        public /* synthetic */ C11131a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.web.b.o$b */
    public static final class C11132b implements C11111a {

        /* renamed from: a */
        final /* synthetic */ C11130o f30223a;

        /* renamed from: b */
        final /* synthetic */ String f30224b;

        /* renamed from: c */
        final /* synthetic */ C11126n f30225c;

        /* renamed from: d */
        final /* synthetic */ C11136p f30226d;

        /* renamed from: a */
        public final void mo27090a(Throwable th) {
            C7573i.m23587b(th, "throwable");
            this.f30225c.mo27090a(th);
        }

        /* renamed from: a */
        public final void mo27089a(C11112b bVar) {
            C7573i.m23587b(bVar, "response");
            StringBuilder sb = new StringBuilder("Received response, url: ");
            sb.append(this.f30224b);
            C11115h.m32554a(sb.toString());
            this.f30225c.mo27089a(bVar);
            if (this.f30225c.f30212f > 0) {
                StringBuilder sb2 = new StringBuilder("Putting to cache, expires: ");
                sb2.append(this.f30225c.f30212f);
                sb2.append(", url: ");
                sb2.append(this.f30224b);
                C11115h.m32554a(sb2.toString());
                this.f30223a.mo27112a(this.f30226d, this.f30225c);
            }
        }

        C11132b(C11130o oVar, String str, C11126n nVar, C11136p pVar) {
            this.f30223a = oVar;
            this.f30224b = str;
            this.f30225c = nVar;
            this.f30226d = pVar;
        }
    }

    /* renamed from: com.bytedance.ies.web.b.o$c */
    static final class C11133c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11130o f30227a;

        C11133c(C11130o oVar) {
            this.f30227a = oVar;
        }

        public final void run() {
            Collection<String> b = this.f30227a.f30220c.mo11519b("__web_prefetch_array");
            if (b == null) {
                C11115h.m32554a("Nothing found in LocalStorage.");
                return;
            }
            for (String str : b) {
                String a = this.f30227a.f30220c.mo11516a(str);
                if (a != null) {
                    try {
                        this.f30227a.f30218a.mo27135a(str, C11127a.m32581a(new JSONObject(a)));
                        this.f30227a.f30219b.add(str);
                    } catch (JSONException e) {
                        StringBuilder sb = new StringBuilder("Failed to load cache at ");
                        sb.append(str);
                        C11115h.m32555a(sb.toString(), e);
                    }
                }
            }
            this.f30227a.mo27114b();
        }
    }

    /* renamed from: com.bytedance.ies.web.b.o$d */
    static final class C11134d extends Lambda implements C7563m<String, C11126n, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C11130o f30228a;

        C11134d(C11130o oVar) {
            this.f30228a = oVar;
            super(2);
        }

        /* renamed from: a */
        private boolean m32595a(String str, C11126n nVar) {
            C7573i.m23587b(str, "<anonymous parameter 0>");
            C7573i.m23587b(nVar, "v");
            return C11130o.m32587a(nVar);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(m32595a((String) obj, (C11126n) obj2));
        }
    }

    /* renamed from: com.bytedance.ies.web.b.o$e */
    static final class C11135e extends Lambda implements C7563m<String, C11126n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11130o f30229a;

        C11135e(C11130o oVar) {
            this.f30229a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m32596a((String) obj, (C11126n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m32596a(String str, C11126n nVar) {
            C7573i.m23587b(str, C45323k.f116730a);
            C7573i.m23587b(nVar, "v");
            this.f30229a.f30220c.mo11520c(str);
            this.f30229a.f30219b.remove(str);
            this.f30229a.f30220c.mo11518a("__web_prefetch_array", (Collection<String>) this.f30229a.f30219b);
            StringBuilder sb = new StringBuilder("Request ");
            sb.append(nVar.f30210d.f30232b);
            sb.append(" expired(expires: ");
            sb.append(nVar.f30212f);
            sb.append("), removed from cache.");
            C11115h.m32554a(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo27111a() {
        this.f30222f.execute(new C11133c(this));
    }

    /* renamed from: b */
    public final void mo27114b() {
        this.f30218a.mo27134a();
        this.f30220c.mo11518a("__web_prefetch_array", (Collection<String>) this.f30219b);
    }

    /* renamed from: a */
    public static boolean m32587a(C11126n nVar) {
        if ((System.currentTimeMillis() - nVar.f30211e) - nVar.f30212f > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C11126n mo27110a(C11136p pVar) {
        long j;
        C7573i.m23587b(pVar, "request");
        C11126n nVar = (C11126n) this.f30218a.mo27133a(pVar.toString());
        if (nVar == null || m32587a(nVar)) {
            if (nVar != null) {
                j = nVar.f30212f;
            } else {
                j = -1;
            }
            return m32585a(pVar, j);
        }
        m32585a(pVar, nVar.f30212f);
        nVar.f30209c = 2;
        return nVar;
    }

    /* renamed from: a */
    public final void mo27112a(C11136p pVar, C11126n nVar) {
        this.f30218a.mo27135a(pVar.toString(), nVar);
        this.f30219b.add(pVar.toString());
        this.f30220c.mo11518a("__web_prefetch_array", (Collection<String>) this.f30219b);
        C11109d dVar = this.f30220c;
        String pVar2 = pVar.toString();
        String jSONObject = nVar.mo27107a().toString();
        C7573i.m23582a((Object) jSONObject, "process.toJSONObject().toString()");
        dVar.mo11517a(pVar2, jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.ies.web.p583b.C11126n m32585a(com.bytedance.ies.web.p583b.C11136p r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.f30232b
            java.util.SortedMap<java.lang.String, java.lang.String> r1 = r9.f30235e
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r3 = com.bytedance.ies.web.p583b.C11145u.m32624a(r0, r1)
            com.bytedance.ies.web.b.n r0 = new com.bytedance.ies.web.b.n
            r0.<init>(r9, r10)
            com.bytedance.ies.web.b.o$b r10 = new com.bytedance.ies.web.b.o$b
            r10.<init>(r8, r3, r0, r9)
            java.lang.String r11 = r9.f30233c
            if (r11 == 0) goto L_0x00e5
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r11, r1)
            int r1 = r11.hashCode()
            r2 = 102230(0x18f56, float:1.43255E-40)
            if (r1 == r2) goto L_0x0096
            r2 = 3446944(0x3498a0, float:4.830197E-39)
            if (r1 == r2) goto L_0x0031
            goto L_0x00bb
        L_0x0031:
            java.lang.String r1 = "post"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x00bb
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Execute POST: "
            r11.<init>(r1)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.bytedance.ies.web.p583b.C11115h.m32554a(r11)
            com.bytedance.ies.web.b.e r2 = r8.f30221e
            java.util.SortedMap<java.lang.String, java.lang.String> r11 = r9.f30234d
            r4 = r11
            java.util.Map r4 = (java.util.Map) r4
            java.util.SortedMap<java.lang.String, java.lang.String> r11 = r9.f30234d
            java.lang.String r1 = "Content-Type"
            java.lang.Object r11 = r11.get(r1)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x005f
            java.lang.String r11 = "application/json"
        L_0x005f:
            r5 = r11
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.util.SortedMap<java.lang.String, java.lang.String> r11 = r9.f30236f
            if (r11 == 0) goto L_0x008f
            java.util.SortedMap<java.lang.String, java.lang.String> r9 = r9.f30236f
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0075:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x008f
            java.lang.Object r11 = r9.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r1 = r11.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r11 = r11.getValue()
            r6.put(r1, r11)
            goto L_0x0075
        L_0x008f:
            r7 = r10
            com.bytedance.ies.web.b.e$a r7 = (com.bytedance.ies.web.p583b.C11110e.C11111a) r7
            r2.mo11523a(r3, r4, r5, r6, r7)
            goto L_0x00d7
        L_0x0096:
            java.lang.String r1 = "get"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x00bb
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Execute GET: "
            r11.<init>(r1)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.bytedance.ies.web.p583b.C11115h.m32554a(r11)
            com.bytedance.ies.web.b.e r11 = r8.f30221e
            java.util.SortedMap<java.lang.String, java.lang.String> r9 = r9.f30234d
            java.util.Map r9 = (java.util.Map) r9
            com.bytedance.ies.web.b.e$a r10 = (com.bytedance.ies.web.p583b.C11110e.C11111a) r10
            r11.mo11522a(r3, r9, r10)
            goto L_0x00d7
        L_0x00bb:
            com.bytedance.ies.web.b.h r10 = com.bytedance.ies.web.p583b.C11115h.f30191a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "No network impl for method '"
            r11.<init>(r1)
            java.lang.String r9 = r9.f30233c
            r11.append(r9)
            r9 = 39
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r11 = 2
            r1 = 0
            com.bytedance.ies.web.p583b.C11115h.m32557b(r9, null)
        L_0x00d7:
            long r9 = r0.f30212f
            r1 = -1
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 != 0) goto L_0x00e1
            r9 = 0
            goto L_0x00e2
        L_0x00e1:
            r9 = 1
        L_0x00e2:
            r0.f30209c = r9
            return r0
        L_0x00e5:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            java.lang.String r10 = "null cannot be cast to non-null type java.lang.String"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.web.p583b.C11130o.m32585a(com.bytedance.ies.web.b.p, long):com.bytedance.ies.web.b.n");
    }

    /* renamed from: a */
    private final SortedMap<String, String> m32586a(SortedMap<String, String> sortedMap, SortedMap<String, C11144t> sortedMap2) {
        String str;
        TreeMap treeMap = new TreeMap();
        for (Entry entry : sortedMap2.entrySet()) {
            Map map = treeMap;
            Object key = entry.getKey();
            C7573i.m23582a(key, "entry.key");
            if (((C11144t) entry.getValue()) instanceof C11142r) {
                str = ((C11144t) entry.getValue()).f30259a;
            } else {
                str = (String) sortedMap.get(((C11144t) entry.getValue()).f30259a);
                if (str != null) {
                    StringBuilder sb = new StringBuilder("Convert param: ");
                    sb.append((C11144t) entry.getValue());
                    sb.append(" -> ");
                    sb.append(str);
                    C11115h.m32554a(sb.toString());
                    if (str == null) {
                    }
                }
                C11115h hVar = C11115h.f30191a;
                StringBuilder sb2 = new StringBuilder("No param '");
                sb2.append(((C11144t) entry.getValue()).f30259a);
                sb2.append("' found.");
                C11115h.m32557b(sb2.toString(), null);
                return null;
            }
            map.put(key, str);
            StringBuilder sb3 = new StringBuilder("Append param: ");
            sb3.append((String) entry.getKey());
            sb3.append(" = ");
            sb3.append((C11144t) entry.getValue());
            C11115h.m32554a(sb3.toString());
        }
        return treeMap;
    }

    /* renamed from: a */
    public final void mo27113a(SortedMap<String, String> sortedMap, C11141q qVar) {
        C7573i.m23587b(sortedMap, "queryMap");
        C7573i.m23587b(qVar, "config");
        StringBuilder sb = new StringBuilder("Start request: ");
        sb.append(qVar);
        C11115h.m32554a(sb.toString());
        SortedMap a = m32586a(sortedMap, qVar.mo27130e());
        if (a == null) {
            C11115h.m32555a("Params error, skipping request.", null);
            return;
        }
        SortedMap a2 = m32586a(sortedMap, qVar.mo27131f());
        if (a2 == null) {
            C11115h.m32555a("Data error, skipping request.", null);
            return;
        }
        C11136p pVar = new C11136p(qVar.mo27120a(), qVar.mo27124b(), qVar.mo27129d(), a, a2);
        m32585a(pVar, qVar.f30245c);
    }

    public C11130o(C11109d dVar, C11110e eVar, Executor executor, int i) {
        C7573i.m23587b(dVar, "localStorage");
        C7573i.m23587b(eVar, "networkExecutor");
        C7573i.m23587b(executor, "workerExecutor");
        this.f30220c = dVar;
        this.f30221e = eVar;
        this.f30222f = executor;
        this.f30218a = new C11143s<>(i, new C11134d(this), new C11135e(this));
    }
}
