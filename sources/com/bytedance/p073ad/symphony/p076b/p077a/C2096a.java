package com.bytedance.p073ad.symphony.p076b.p077a;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6308d;
import com.bytedance.p073ad.symphony.C2114c;
import com.bytedance.p073ad.symphony.C2140e;
import com.bytedance.p073ad.symphony.C2151f;
import com.bytedance.p073ad.symphony.p074a.C2092b;
import com.bytedance.p073ad.symphony.p076b.C2095a;
import com.bytedance.p073ad.symphony.p078c.C2124c;
import com.bytedance.p073ad.symphony.p078c.C2126e;
import com.bytedance.p073ad.symphony.p078c.C2127f;
import com.bytedance.p073ad.symphony.p078c.C2129h;
import com.bytedance.p073ad.symphony.p079d.C2132a;
import com.bytedance.p073ad.symphony.p079d.C2139e;
import com.bytedance.p073ad.symphony.p081e.C2141a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2145d;
import com.bytedance.p073ad.symphony.p084g.C2156a;
import com.bytedance.p073ad.symphony.p084g.C2157b;
import com.bytedance.p073ad.symphony.p085h.C2159a;
import com.bytedance.p073ad.symphony.p085h.C2160b;
import com.bytedance.p073ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.p073ad.symphony.provider.C2192a;
import com.bytedance.p073ad.symphony.provider.C2192a.C2194a;
import com.bytedance.p073ad.symphony.provider.C2195b;
import com.bytedance.p073ad.symphony.provider.C2195b.C2196a;
import com.bytedance.p073ad.symphony.util.C2199b;
import com.bytedance.p073ad.symphony.util.C2203f;
import com.bytedance.p073ad.symphony.util.C2205h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.b.a.a */
public abstract class C2096a<AD extends C2092b> implements C2095a<AD> {

    /* renamed from: a */
    protected Handler f7186a;

    /* renamed from: b */
    protected Handler f7187b;

    /* renamed from: c */
    public Map<Integer, C2195b<AD>> f7188c = new ConcurrentHashMap();

    /* renamed from: d */
    protected Map<String, Long> f7189d = new ConcurrentHashMap();

    /* renamed from: e */
    protected Map<String, C6308d<C2139e>> f7190e = new ConcurrentHashMap();

    /* renamed from: f */
    protected Context f7191f;

    /* renamed from: g */
    protected C2160b f7192g;

    /* renamed from: h */
    public C2132a f7193h;

    /* renamed from: i */
    public Map<String, List<String>> f7194i;

    /* renamed from: j */
    private final Object f7195j = new Object();

    /* renamed from: k */
    private volatile Boolean f7196k;

    /* renamed from: l */
    private volatile boolean f7197l;

    /* renamed from: m */
    private boolean f7198m;

    /* renamed from: n */
    private C2196a f7199n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo7783a();

    /* renamed from: b */
    public final C2160b mo7788b() {
        return this.f7192g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7790c() {
    }

    /* renamed from: a */
    public final void mo7785a(final String str, final int i) {
        this.f7187b.post(new Runnable() {
            public final void run() {
                C2096a.this.mo7783a();
                new StringBuilder("observer size-->").append(C2096a.this.f7190e.size());
                C6308d dVar = (C6308d) C2096a.this.f7190e.get(str);
                if (dVar != null) {
                    Iterator it = dVar.iterator();
                    while (it.hasNext()) {
                        C2139e eVar = (C2139e) it.next();
                        if (eVar != null && eVar.mo7823a(str, i)) {
                            return;
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7786a(List<String> list) {
        if (C2203f.m9514a(list)) {
            mo7783a();
            return;
        }
        for (final String str : list) {
            if (m9278f(str)) {
                mo7783a();
                return;
            }
            this.f7186a.post(new Runnable() {
                public final void run() {
                    C2096a.this.mo7789b(str);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo7780a(String str) {
        List<String> d = mo7792d(str);
        if (!C2203f.m9514a(d)) {
            for (String e : d) {
                m9277e(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo7782a(C2159a aVar, String str, boolean z) {
        mo7783a();
        StringBuilder sb = new StringBuilder("getCachedAdProviderId,type:");
        sb.append(str);
        sb.append("    use strategy：");
        sb.append(aVar.mo7847a());
        if (!(aVar == null || aVar.mo7848b() == null)) {
            for (Integer intValue : aVar.mo7848b()) {
                int intValue2 = intValue.intValue();
                if ((!z || !AbsNativeAdProvider.isInhouseNativeAdProvider(intValue2)) && (!z || !AbsNativeAdProvider.isHeaderBiddingProvider(intValue2))) {
                    C2195b bVar = (C2195b) this.f7188c.get(Integer.valueOf(intValue2));
                    if (bVar != null && bVar.hasValidAd(str)) {
                        return intValue2;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo7781a(C2141a aVar) {
        if (aVar == null || C2203f.m9514a(aVar.f7273b) || aVar.f7272a == null) {
            return -1;
        }
        return m9268a(aVar.f7272a, (String) aVar.f7273b.get(0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7787a(List<C2142a> list, SparseArray<C2194a> sparseArray, Class<? extends C2095a> cls) {
        if (this.f7197l) {
            this.f7197l = false;
            mo7790c();
        }
        if (list == null || list.isEmpty()) {
            mo7783a();
        } else if (this.f7198m) {
            synchronized (this.f7195j) {
                for (C2142a aVar : new ArrayList(list)) {
                    if (aVar != null) {
                        if (!this.f7188c.containsKey(Integer.valueOf(aVar.f7276a))) {
                            m9273a(this.f7191f, aVar, sparseArray, cls);
                        } else {
                            ((C2195b) this.f7188c.get(Integer.valueOf(aVar.f7276a))).setAdConfig(aVar);
                        }
                    }
                }
                mo7783a();
                new StringBuilder("initConfig, providers created, size-->").append(this.f7188c == null ? 0 : this.f7188c.size());
            }
            if (this.f7193h != null) {
                ArrayList arrayList = new ArrayList();
                for (Integer add : this.f7188c.keySet()) {
                    arrayList.add(add);
                }
                if (this.f7196k.booleanValue()) {
                    synchronized (this.f7196k) {
                        if (this.f7196k.booleanValue() && this.f7188c != null) {
                            this.f7196k = Boolean.valueOf(false);
                            this.f7187b.post(new Runnable() {
                                public final void run() {
                                    C2096a.this.f7193h.mo7817a();
                                }
                            });
                            return;
                        }
                    }
                }
                if (!C2203f.m9514a(list)) {
                    this.f7187b.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public final AD mo7779a(C2141a aVar, C2124c cVar) {
        if (aVar == null || C2203f.m9514a(aVar.f7273b) || aVar.f7272a == null) {
            return null;
        }
        if (cVar == null || cVar.f7237b == null) {
            mo7783a();
        }
        List<String> list = aVar.f7273b;
        C2159a aVar2 = aVar.f7272a;
        if (list.size() == 1) {
            return m9271a(aVar2, (String) list.get(0), cVar, aVar.f7275d, aVar.f7274c);
        }
        return m9272a(aVar.f7272a, aVar.f7273b, cVar, aVar.f7275d, aVar.f7274c);
    }

    /* renamed from: a */
    public final void mo7784a(C2145d dVar) {
        this.f7192g.f7336b = dVar;
    }

    /* renamed from: e */
    private void m9277e(final String str) {
        if (C6319n.m19593a(str)) {
            mo7783a();
        } else if (m9278f(str)) {
            mo7783a();
        } else {
            this.f7186a.post(new Runnable() {
                public final void run() {
                    C2096a.this.mo7789b(str);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final List<String> mo7792d(String str) {
        if (C2203f.m9515a(this.f7194i)) {
            return null;
        }
        return (List) this.f7194i.get(str);
    }

    /* renamed from: f */
    private boolean m9278f(String str) {
        if (!this.f7189d.containsKey(str) || ((Long) this.f7189d.get(str)).longValue() == 0) {
            return false;
        }
        if (System.currentTimeMillis() - ((Long) this.f7189d.get(str)).longValue() < 25000) {
            return true;
        }
        this.f7189d.put(str, Long.valueOf(0));
        C2129h.m9340a(str);
        mo7783a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("：requestHandler fail to call onPreloadFinish,trigger timeout strategy");
        new Exception(sb.toString());
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo7791c(String str) {
        if (C2114c.m9317b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":ad pool status\n");
            for (Entry value : this.f7188c.entrySet()) {
                C2195b bVar = (C2195b) value.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(bVar.toString());
                sb2.append("\n");
                sb.append(sb2.toString());
            }
            mo7783a();
        }
    }

    /* renamed from: b */
    public final void mo7789b(String str) {
        C2205h.m9518a();
        if (m9278f(str)) {
            mo7783a();
            return;
        }
        C2159a a = this.f7192g.mo7853a(str);
        if (a != null) {
            if (!C2203f.m9514a(a.mo7851e()) || (!C2203f.m9514a(a.mo7849c()) && !C2203f.m9514a((List) a.mo7849c().get(0)))) {
                mo7791c("before crate request handler:");
                mo7783a();
                StringBuilder sb = new StringBuilder("tryPreloadAd, type:");
                sb.append(str);
                sb.append(",use strategy:");
                sb.append(a.toString());
                List<C2157b> a2 = C2151f.m9380a(this.f7191f, a, str, this.f7199n, this);
                if (!C2203f.m9514a(a2)) {
                    mo7783a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(": start loading");
                    this.f7189d.put(str, Long.valueOf(System.currentTimeMillis()));
                    for (C2157b c : a2) {
                        c.mo7842c();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private int m9268a(C2159a aVar, String str) {
        return mo7782a(aVar, str, false);
    }

    /* renamed from: a */
    private static void m9274a(C2092b bVar, C2124c cVar) {
        if (!(bVar == null || cVar == null)) {
            try {
                bVar.mo7756a(cVar.f7236a);
                C2129h.m9333a(bVar);
            } catch (Exception e) {
                C2140e.m9360a(e);
            }
        }
    }

    /* renamed from: a */
    public static void m9275a(String str, String str2, int i) {
        C2127f fVar = new C2127f();
        fVar.f7247c = i;
        fVar.f7245a = str2;
        fVar.f7246b = str;
        C2129h.m9337a(fVar);
    }

    public C2096a(C2104b bVar, String str, String str2) {
        boolean z = true;
        this.f7196k = Boolean.valueOf(true);
        this.f7197l = true;
        this.f7199n = new C2196a() {
            /* renamed from: a */
            public final void mo7796a(final String str) {
                C2205h.m9518a();
                C2096a.this.mo7783a();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(":onPreloadFinished");
                C2096a.this.f7189d.put(str, Long.valueOf(0));
                C2096a.this.f7187b.post(new Runnable() {
                    public final void run() {
                        C6308d dVar = (C6308d) C2096a.this.f7190e.get(str);
                        if (dVar != null) {
                            Iterator it = dVar.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                    }
                });
            }

            /* renamed from: a */
            public final void mo7797a(String str, String str2, int i, double d) {
                C2205h.m9518a();
                C2096a.this.mo7783a();
                StringBuilder sb = new StringBuilder("preload SUCCESS, providerId-->");
                sb.append(i);
                sb.append(", type-->");
                sb.append(str);
                sb.append(", requestTime-->");
                sb.append(d);
                C2096a.this.mo7791c("header bidding: add ad to pool");
                C2096a.this.mo7785a(str, i);
                C2096a.m9276a(str, str2, i, "", d, "succeed");
            }

            /* renamed from: a */
            public final void mo7798a(String str, String str2, int i, String str3, double d) {
                C2205h.m9518a();
                C2096a.this.mo7783a();
                StringBuilder sb = new StringBuilder("preload FAILED, providerId--> ");
                sb.append(i);
                sb.append(", type-->");
                sb.append(str);
                sb.append(", requestTime-->");
                sb.append(d);
                if (!C2156a.m9395a(str3)) {
                    if (C2156a.m9396b(str3)) {
                        C2096a.m9275a(str, str2, i);
                        return;
                    }
                    C2096a.m9276a(str, str2, i, str3, d, "failed");
                }
            }
        };
        this.f7186a = new Handler(C2199b.m9506b());
        this.f7187b = C2199b.m9503a();
        this.f7191f = bVar.f7212a.getApplicationContext();
        this.f7198m = bVar.f7213b;
        this.f7193h = bVar.f7215d;
        this.f7192g = new C2160b(this.f7191f, str, str2);
        C2160b bVar2 = this.f7192g;
        if (!bVar.f7214c || !C2114c.m9317b()) {
            z = false;
        }
        bVar2.f7335a = z;
    }

    /* renamed from: a */
    private void m9273a(Context context, C2142a aVar, SparseArray<C2194a> sparseArray, Class<? extends C2095a> cls) {
        C2192a aVar2;
        String str = "";
        if (!(aVar == null || sparseArray == null)) {
            try {
                C2194a aVar3 = (C2194a) sparseArray.get(C2192a.getRealProviderId(aVar.f7276a));
                if (aVar3 != null) {
                    str = aVar3.f7437c;
                }
            } catch (Exception unused) {
                mo7783a();
                new StringBuilder("createProvider, className-->").append(str);
                aVar2 = null;
            }
        }
        if (!C6319n.m19593a(str)) {
            aVar2 = (C2192a) Class.forName(str).getConstructor(new Class[]{Context.class, C2142a.class, cls}).newInstance(new Object[]{context, aVar, this});
            if (aVar2 != null) {
                mo7783a();
                new StringBuilder("createProvider, providerId-->").append(aVar.f7276a);
                this.f7188c.put(Integer.valueOf(aVar.f7276a), aVar2);
            }
        }
    }

    /* renamed from: a */
    private AD m9269a(int i, String str, long j, JSONObject jSONObject, String str2) {
        C2195b bVar = (C2195b) this.f7188c.get(Integer.valueOf(i));
        if (bVar == null) {
            return null;
        }
        AD nextAd = bVar.getNextAd(str);
        if (!(nextAd == null || nextAd.mo7751b() == null)) {
            nextAd.mo7751b().f7302d = j;
            nextAd.mo7751b().f7303e = jSONObject;
            nextAd.mo7751b().f7305g = str2;
        }
        return nextAd;
    }

    /* renamed from: a */
    private AD m9271a(C2159a aVar, String str, C2124c cVar, long j, JSONObject jSONObject) {
        String str2;
        if (aVar == null || str == null) {
            mo7783a();
            return null;
        }
        mo7783a();
        StringBuilder sb = new StringBuilder("placementType:");
        sb.append(str);
        sb.append(",fillStrategy:");
        sb.append(aVar);
        this.f7192g.mo7855a(str, aVar);
        int a = m9268a(this.f7192g.mo7853a(str), str);
        if (a == -1) {
            m9277e(str);
            return null;
        }
        mo7783a();
        new StringBuilder("find cached ad ,providerId:").append(a);
        if (cVar != null) {
            str2 = cVar.f7237b;
        } else {
            str2 = "";
        }
        AD a2 = m9270a(a, str, cVar, j, jSONObject, str2);
        mo7791c("after geNext ad:");
        return a2;
    }

    /* renamed from: a */
    private AD m9272a(C2159a aVar, List<String> list, C2124c cVar, long j, JSONObject jSONObject) {
        String str;
        List<String> list2 = list;
        C2124c cVar2 = cVar;
        AD ad = null;
        if (aVar == null || C2203f.m9514a(list)) {
            mo7783a();
            return null;
        }
        mo7783a();
        StringBuilder sb = new StringBuilder("placementType:");
        sb.append(list);
        sb.append(",fillStrategy:");
        sb.append(aVar);
        for (String a : list) {
            this.f7192g.mo7855a(a, aVar);
        }
        List b = this.f7192g.mo7853a((String) list.get(0)).mo7848b();
        if (C2203f.m9514a(b)) {
            return null;
        }
        for (int i = 0; i < b.size(); i++) {
            int intValue = ((Integer) b.get(i)).intValue();
            C2195b bVar = (C2195b) this.f7188c.get(Integer.valueOf(intValue));
            if (bVar != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    String str2 = (String) list.get(i2);
                    if (bVar.hasValidAd(str2)) {
                        if (cVar2 != null) {
                            str = cVar2.f7237b;
                        } else {
                            str = "";
                        }
                        ad = m9269a(intValue, str2, j, jSONObject, str);
                    } else {
                        i2++;
                    }
                }
                if (ad != null) {
                    break;
                }
            }
        }
        if (ad != null) {
            m9274a((C2092b) ad, cVar2);
        }
        for (String e : list) {
            m9277e(e);
        }
        if (ad != null) {
            mo7783a();
            new StringBuilder("find cached ad:").append(ad);
        } else {
            mo7783a();
        }
        return ad;
    }

    /* renamed from: a */
    private AD m9270a(int i, String str, C2124c cVar, long j, JSONObject jSONObject, String str2) {
        if (C6319n.m19593a(str)) {
            mo7783a();
            return null;
        }
        AD a = m9269a(i, str, j, jSONObject, str2);
        m9274a((C2092b) a, cVar);
        m9277e(str);
        return a;
    }

    /* renamed from: a */
    public static void m9276a(String str, String str2, int i, String str3, double d, String str4) {
        C2126e eVar = new C2126e();
        eVar.f7244f = i;
        eVar.f7243e = d;
        eVar.f7241c = str2;
        eVar.f7242d = str;
        eVar.f7239a = str4;
        eVar.f7240b = str3;
        C2129h.m9336a(eVar);
    }
}
