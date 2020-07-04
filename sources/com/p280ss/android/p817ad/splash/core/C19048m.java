package com.p280ss.android.p817ad.splash.core;

import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.p280ss.android.p817ad.splash.core.p827b.C18983a.C18984a;
import com.p280ss.android.p817ad.splash.core.p827b.C18985b;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p828c.C19008g;
import com.p280ss.android.p817ad.splash.p824b.C18949a;
import com.p280ss.android.p817ad.splash.p824b.C18956b;
import com.p280ss.android.p817ad.splash.p834e.C19116a;
import com.p280ss.android.p817ad.splash.p836g.C19126e;
import com.p280ss.android.p817ad.splash.p836g.C19129h;
import com.p280ss.android.p817ad.splash.p836g.C19131i;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import com.p280ss.android.p817ad.splash.p836g.C19134l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.m */
final class C19048m {

    /* renamed from: e */
    private static volatile C19048m f51472e;

    /* renamed from: a */
    public long f51473a;

    /* renamed from: b */
    public String f51474b = "";

    /* renamed from: c */
    public long f51475c;

    /* renamed from: d */
    public boolean f51476d;

    /* renamed from: f */
    private C19001b f51477f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C19001b mo50544a(boolean z) {
        List<C19001b> list;
        if (C19063v.m62414a().f51516h) {
            return null;
        }
        if (C19025f.m62110X()) {
            return m62257c();
        }
        C19001b b = C19022e.m62080a().mo50516b();
        if (b != null) {
            C19022e.m62080a().mo50517c();
            return b;
        }
        int d = m62261d();
        int i = 4;
        if (d != 4) {
            if (d == 0) {
                m62260c(true);
                C18984a aVar = new C18984a();
                aVar.mo50439a(84378473382L).mo50440a(C19044j.m62231a().f51469j).mo50438a(6);
                C18985b.m61973a();
                C18985b.m61982d(aVar.mo50441a());
            } else {
                C18984a aVar2 = new C18984a();
                aVar2.mo50439a(84378473382L).mo50438a(2).mo50440a(C19044j.m62231a().f51469j);
                C18985b.m61973a();
                C18985b.m61977b(aVar2.mo50441a());
            }
            return null;
        }
        m62260c(false);
        StringBuilder sb = new StringBuilder("UDPClient. getCurrentSplashAd ");
        sb.append(System.currentTimeMillis());
        sb.append("result :");
        sb.append(C19063v.m62414a().f51510b);
        if (C19063v.m62414a().f51510b != -1) {
            long j = C19063v.m62414a().f51515g;
            if (C19063v.m62414a().f51510b == 1) {
                m62248a(j, true);
                return null;
            } else if (C19063v.m62414a().f51510b == 2) {
                m62248a(j, false);
            }
        } else {
            if (!C19063v.m62414a().mo50648d()) {
                long j2 = C19044j.m62231a().f51465f;
                long j3 = C19044j.m62231a().f51466g;
                if (C19129h.m62708a(j2, j3)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= j2 && currentTimeMillis <= j3) {
                        if (C19025f.m62108V()) {
                            m62255b(true);
                        }
                        return null;
                    }
                }
            }
            if (C19025f.m62108V()) {
                m62255b(false);
            }
        }
        C19008g gVar = C19044j.m62231a().f51462c;
        if (gVar == null) {
            return null;
        }
        if (!gVar.f51339e || !C19063v.m62414a().mo50648d()) {
            if (C19025f.m62099M()) {
                C18949a.m61865a().mo50362a("service_real_time_ad_monitor", 3, (JSONObject) null);
            }
            list = gVar.f51336b;
            if (C19126e.m62680a(list)) {
                C18984a aVar3 = new C18984a();
                aVar3.mo50439a(84378473382L).mo50438a(3).mo50440a(C19044j.m62231a().f51469j);
                C18985b.m61973a();
                C18985b.m61977b(aVar3.mo50441a());
                C18956b.m61883a();
                C18956b.m61884a(1);
                return null;
            }
        } else {
            List b2 = C19063v.m62414a().mo50646b();
            list = C19129h.m62700a(gVar.f51337c, b2);
            if (C19126e.m62680a(list)) {
                if (C19126e.m62680a(b2)) {
                    C18949a.m61865a().mo50362a("service_real_time_ad_monitor", 2, (JSONObject) null);
                } else {
                    i = 5;
                    C18949a.m61865a().mo50362a("service_real_time_ad_monitor", 1, (JSONObject) null);
                }
                C18984a aVar4 = new C18984a();
                aVar4.mo50439a(84378473382L).mo50438a(i).mo50440a(C19044j.m62231a().f51469j);
                C18985b.m61973a();
                C18985b.m61977b(aVar4.mo50441a());
                C18956b.m61883a();
                C18956b.m61884a(1);
                return null;
            }
            C18949a.m61865a().mo50362a("service_real_time_ad_monitor", 0, (JSONObject) null);
        }
        if (C19025f.m62088B()) {
            this.f51476d = !C19062u.m62368a().mo50614c();
            if (this.f51476d) {
                C19062u.m62368a().mo50610b(true).mo50628j();
                list = m62266g(list);
            } else {
                list = m62267h(list);
            }
        }
        List f = m62265f(list);
        if (C19126e.m62680a(f)) {
            return null;
        }
        C19001b i2 = m62268i(f);
        if (!(this.f51477f == null || i2 == null)) {
            C18985b.m61973a();
            C18985b.m61975a(this.f51477f, i2);
        }
        this.f51477f = null;
        return i2;
    }

    /* renamed from: a */
    private static void m62251a(C19001b bVar, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("log_extra", bVar.mo50376p()).putOpt("is_ad_event", "1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("ad_position", str);
            jSONObject2.putOpt("error_code", Integer.valueOf(i));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.put("ad_fetch_time", bVar.mo50374f());
        } catch (Exception unused) {
        }
        C19025f.m62115a(bVar.mo50375n(), "splash_ad", "data_invalid", jSONObject);
    }

    /* renamed from: a */
    private boolean m62253a(long j) {
        return j - this.f51473a < C19044j.m62231a().f51463d;
    }

    /* renamed from: a */
    public static void m62252a(JSONArray jSONArray, boolean z, int i) {
        if (jSONArray != null && jSONArray.length() > 0) {
            C19063v.m62414a().f51513e = jSONArray.length();
            C19063v.m62414a().mo50643a(-1);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    new C19131i(jSONArray.getString(i2), z, i).executeOnExecutor(C19025f.m62189t(), new Void[0]);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private C19048m() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C19001b mo50545b() {
        return mo50544a(false);
    }

    /* renamed from: a */
    public static C19048m m62245a() {
        if (f51472e == null) {
            synchronized (C19048m.class) {
                if (f51472e == null) {
                    f51472e = new C19048m();
                }
            }
        }
        return f51472e;
    }

    /* renamed from: e */
    private List<C19001b> m62263e() {
        ArrayList arrayList = new ArrayList();
        List<C19001b> list = C19044j.m62231a().f51461b;
        if (!C19126e.m62680a(list)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C19001b bVar = (C19001b) it.next();
                if (bVar.mo50497y()) {
                    arrayList.add(bVar);
                    new StringBuilder("成功回捞 ad: ").append(bVar.mo50375n());
                    m62259c(bVar);
                    C19062u.m62368a().mo50605a(false).mo50628j();
                    break;
                }
                new StringBuilder("回捞失败——ad过期 ad: ").append(bVar.mo50375n());
            }
        }
        if (arrayList.size() > 0) {
            this.f51475c = ((C19001b) arrayList.get(0)).mo50375n();
        }
        return arrayList;
    }

    /* renamed from: d */
    private int m62261d() {
        if (C19129h.m62712a(C19062u.m62368a())) {
            if (C19025f.m62158e()) {
                C19134l.m62742a(C19025f.m62096J().getString(R.string.dwb));
            }
            m62246a((int) AdError.INTERNAL_ERROR_CODE, 2);
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C19025f.m62144b() && Math.abs(currentTimeMillis - C19025f.m62150d()) > 10000) {
            if (C19025f.m62158e()) {
                C19134l.m62742a(C19025f.m62096J().getString(R.string.dw_));
            }
            m62246a((int) AdError.CACHE_ERROR_CODE, 3);
            return 3;
        } else if (Math.abs(currentTimeMillis - C19025f.m62087A()) < C19044j.m62231a().f51464e) {
            if (C19025f.m62158e()) {
                C19134l.m62742a(C19025f.m62096J().getString(R.string.dwa));
            }
            m62246a((int) AdError.INTERNAL_ERROR_2003, 4);
            return 1;
        } else if (!m62253a(currentTimeMillis)) {
            return 4;
        } else {
            if (C19025f.m62158e()) {
                C19134l.m62742a(C19025f.m62096J().getString(R.string.dwe));
            }
            m62246a((int) AdError.INTERNAL_ERROR_2004, 5);
            return 2;
        }
    }

    /* renamed from: c */
    private C19001b m62257c() {
        C19001b bVar;
        if (C19063v.m62414a().f51516h) {
            return null;
        }
        C19001b b = C19022e.m62080a().mo50516b();
        if (b != null) {
            C19022e.m62080a().mo50517c();
            return b;
        }
        int d = m62261d();
        if (d != 4) {
            if (d == 0) {
                m62260c(true);
                C18985b.m61973a();
                C18985b.m61982d(new C18984a().mo50439a(84378473382L).mo50440a(C19044j.m62231a().f51469j).mo50438a(6).mo50441a());
            } else {
                C18985b.m61973a();
                C18985b.m61977b(new C18984a().mo50439a(84378473382L).mo50438a(2).mo50440a(C19044j.m62231a().f51469j).mo50441a());
            }
            return null;
        }
        m62260c(false);
        StringBuilder sb = new StringBuilder("UDPClient. getCurrentSplashAd ");
        sb.append(System.currentTimeMillis());
        sb.append("result :");
        sb.append(C19063v.m62414a().f51510b);
        if (C19063v.m62414a().f51510b != -1) {
            long j = C19063v.m62414a().f51515g;
            if (C19063v.m62414a().f51510b == 1) {
                m62248a(j, true);
                return null;
            } else if (C19063v.m62414a().f51510b == 2) {
                m62248a(j, false);
            }
        } else {
            if (!C19063v.m62414a().mo50649e()) {
                long j2 = C19044j.m62231a().f51465f;
                long j3 = C19044j.m62231a().f51466g;
                if (C19129h.m62708a(j2, j3)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= j2 && currentTimeMillis <= j3) {
                        if (C19025f.m62108V()) {
                            m62255b(true);
                        }
                        return null;
                    }
                }
            }
            if (C19025f.m62108V()) {
                m62255b(false);
            }
        }
        List<C19001b> list = C19044j.m62231a().f51460a;
        if (C19025f.m62135ad() || !C19126e.m62680a(list) || !C19062u.m62368a().mo50638s()) {
            List b2 = m62254b(list);
            if (!C19126e.m62680a(b2) || C19025f.m62135ad()) {
                if (C19025f.m62088B()) {
                    this.f51476d = !C19062u.m62368a().mo50614c();
                    bVar = m62244a(b2, this.f51476d);
                } else {
                    m62264e(b2);
                    bVar = m62243a(b2);
                }
                if (!(this.f51477f == null || bVar == null)) {
                    C18985b.m61973a();
                    C18985b.m61975a(this.f51477f, bVar);
                }
                this.f51477f = null;
                if (C19025f.m62135ad() && C19062u.m62368a().mo50638s()) {
                    C18985b.m61973a();
                    C18985b.m61977b(new C18984a().mo50439a(84378473382L).mo50438a(3).mo50440a(C19044j.m62231a().f51469j).mo50441a());
                    C18956b.m61883a();
                    C18956b.m61884a(1);
                }
                return bVar;
            }
            C18985b.m61973a().mo50444a(false);
            return null;
        }
        C18985b.m61973a();
        C18985b.m61977b(new C18984a().mo50439a(84378473382L).mo50438a(3).mo50440a(C19044j.m62231a().f51469j).mo50441a());
        C18956b.m61883a();
        C18956b.m61884a(1);
        return null;
    }

    /* renamed from: b */
    private void m62255b(boolean z) {
        m62249a(0, false, z, false);
    }

    /* renamed from: c */
    private static void m62260c(boolean z) {
        C19062u.m62368a().mo50617e().mo50628j();
        C19116a.m62645a().mo50824a(z);
    }

    /* renamed from: a */
    private C19001b m62243a(List<C19001b> list) {
        if (C19126e.m62680a(list)) {
            return null;
        }
        if (C19063v.m62414a().mo50648d()) {
            return m62262d(list);
        }
        C18949a.m61865a().mo50362a("service_real_time_show", 3, (JSONObject) null);
        return m62258c(list);
    }

    /* renamed from: c */
    private static void m62259c(C19001b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", bVar.mo50376p()).putOpt("ad_fetch_time", Long.valueOf(bVar.mo50374f()));
        } catch (Exception unused) {
        }
        C19025f.m62115a(bVar.mo50375n(), "splash_ad", "launch_miss", jSONObject);
    }

    /* renamed from: e */
    private static void m62264e(List<C19001b> list) {
        if (!C19126e.m62680a(list)) {
            C19001b bVar = (C19001b) list.get(0);
            if (bVar != null && bVar.mo50476a()) {
                HashMap hashMap = new HashMap();
                hashMap.put("show_expected", Integer.valueOf(bVar.f51290b));
                C19025f.m62119a(bVar, "splash_ad", "should_show", (Map<String, Object>) hashMap);
            }
        }
    }

    /* renamed from: g */
    private List<C19001b> m62266g(List<C19001b> list) {
        if (C19126e.m62680a(list)) {
            if (!C19025f.m62135ad()) {
                return null;
            }
            list = new ArrayList<>();
        }
        List<C19001b> arrayList = new ArrayList<>();
        for (C19001b bVar : list) {
            if (bVar.f51304p == 1) {
                arrayList.add(bVar);
            }
        }
        if (C19126e.m62680a(arrayList) && C19025f.m62135ad()) {
            arrayList = m62263e();
        }
        for (C19001b bVar2 : list) {
            if (bVar2.f51304p == 3) {
                arrayList.add(bVar2);
            }
        }
        if (C19025f.m62158e() && C19126e.m62680a(list)) {
            C19134l.m62742a(C19025f.m62096J().getString(R.string.dw7));
        }
        return arrayList;
    }

    /* renamed from: h */
    private static List<C19001b> m62267h(List<C19001b> list) {
        if (C19126e.m62680a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C19001b bVar : list) {
            if (bVar.f51304p != 1) {
                arrayList.add(bVar);
            } else {
                C18985b.m61973a().mo50443a(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(5005).mo50441a());
            }
        }
        if (C19025f.m62158e() && C19126e.m62680a(arrayList)) {
            C19134l.m62742a(C19025f.m62096J().getString(R.string.dwd));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static int m62242a(C19001b bVar) {
        if (bVar == null) {
            return 5006;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar.mo50480d() > currentTimeMillis) {
            if (C19025f.m62158e()) {
                C19134l.m62742a(C19025f.m62096J().getString(R.string.dwf, new Object[]{Long.valueOf(bVar.mo50375n())}));
            }
            return 5001;
        } else if (bVar.mo50481e() < currentTimeMillis) {
            if (C19025f.m62158e()) {
                C19134l.m62742a(C19025f.m62096J().getString(R.string.dw6, new Object[]{Long.valueOf(bVar.mo50375n())}));
            }
            return 5002;
        } else if (!bVar.f51303o) {
            return 5000;
        } else {
            if (C19025f.m62158e()) {
                C19134l.m62742a(C19025f.m62096J().getString(R.string.dw5, new Object[]{Long.valueOf(bVar.mo50375n())}));
            }
            return 5003;
        }
    }

    /* renamed from: b */
    private boolean m62256b(C19001b bVar) {
        boolean z;
        int r = bVar.mo50377r();
        if (r != 0) {
            switch (r) {
                case 2:
                    boolean a = C19129h.m62711a(bVar.f51302n, C19062u.m62368a());
                    if (a) {
                        return a;
                    }
                    m62250a(bVar, 2);
                    if (!C19025f.m62158e()) {
                        return a;
                    }
                    C19134l.m62742a(C19025f.m62096J().getString(R.string.dwg, new Object[]{Long.valueOf(bVar.mo50375n())}));
                    return a;
                case 3:
                    boolean a2 = C19129h.m62710a(bVar.f51287a, C19062u.m62368a());
                    if (!a2) {
                        m62250a(bVar, 1);
                    }
                    boolean a3 = C19129h.m62711a(bVar.f51302n, C19062u.m62368a());
                    if (!a3) {
                        m62250a(bVar, 2);
                    }
                    if (!a2 || !a3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || !C19025f.m62158e()) {
                        return z;
                    }
                    C19134l.m62742a(C19025f.m62096J().getString(R.string.dw9, new Object[]{Long.valueOf(bVar.mo50375n())}));
                    return z;
                case 4:
                    break;
                default:
                    return false;
            }
        }
        boolean a4 = C19129h.m62710a(bVar.f51287a, C19062u.m62368a());
        if (a4) {
            return a4;
        }
        m62250a(bVar, 1);
        if (!C19025f.m62158e()) {
            return a4;
        }
        C19134l.m62742a(C19025f.m62096J().getString(R.string.dw8, new Object[]{Long.valueOf(bVar.mo50375n())}));
        return a4;
    }

    /* renamed from: c */
    private C19001b m62258c(List<C19001b> list) {
        for (C19001b bVar : list) {
            if (bVar != null) {
                if (bVar.mo50489l()) {
                    if (!C19132j.m62736a(bVar.mo50380x()) && C19025f.m62094H() != null) {
                        if (C19025f.m62094H().mo50383a(bVar, false)) {
                            this.f51473a = System.currentTimeMillis();
                            C18985b.m61973a();
                            C18985b.m61976a(bVar, "topview_show_confirmed");
                            return bVar;
                        }
                        if (this.f51477f == null) {
                            this.f51477f = bVar;
                        }
                        C18985b.m61973a();
                        C18985b.m61976a(bVar, "topview_show_rejected");
                    }
                } else if (bVar.mo50490m()) {
                    if (C19025f.m62094H() != null && !C19132j.m62736a(bVar.mo50380x())) {
                        C18985b.m61973a();
                        C18985b.m61976a(bVar, "topview_search_show_rejected");
                    }
                } else if (!bVar.mo50476a()) {
                    continue;
                } else if (m62256b(bVar)) {
                    return bVar;
                } else {
                    if (this.f51475c == bVar.mo50375n()) {
                        C18985b.m61973a();
                        C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(4004).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                    }
                }
            }
        }
        C18956b.m61883a();
        C18956b.m61884a(6);
        return null;
    }

    /* renamed from: i */
    private C19001b m62268i(List<C19001b> list) {
        C19001b bVar;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (C19001b) it.next();
            if (bVar != null) {
                if (!bVar.mo50489l()) {
                    if (!bVar.mo50490m()) {
                        boolean a = bVar.mo50476a();
                        boolean b = m62256b(bVar);
                        if (a && b) {
                            break;
                        } else if (!b && !TextUtils.isEmpty(bVar.mo50470B()) && !TextUtils.isEmpty(this.f51474b) && bVar.mo50470B().equals(this.f51474b)) {
                            C18985b.m61973a();
                            C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(4004).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                        }
                    } else if (C19025f.m62094H() != null && !TextUtils.isEmpty(bVar.mo50380x())) {
                        C18985b.m61973a();
                        C18985b.m61976a(bVar, "topview_search_show_rejected");
                    }
                } else if (!C19132j.m62736a(bVar.mo50380x()) && C19025f.m62094H() != null) {
                    if (C19025f.m62094H().mo50383a(bVar, false)) {
                        this.f51473a = System.currentTimeMillis();
                        C18985b.m61973a();
                        C18985b.m61976a(bVar, "topview_show_confirmed");
                        return bVar;
                    }
                    if (this.f51477f == null) {
                        this.f51477f = bVar;
                    }
                    C18985b.m61973a();
                    C18985b.m61976a(bVar, "topview_show_rejected");
                }
            }
        }
        return bVar;
    }

    /* renamed from: b */
    private List<C19001b> m62254b(List<C19001b> list) {
        if (C19126e.m62680a(list)) {
            if (C19025f.m62158e()) {
                C19134l.m62742a(C19025f.m62096J().getString(R.string.dwc));
            }
            return null;
        }
        this.f51475c = ((C19001b) list.get(0)).mo50375n();
        C18985b.m61973a().mo50445b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C19001b bVar = (C19001b) list.get(i);
            if (bVar != null) {
                if (bVar.f51300l != null && !bVar.f51300l.isEmpty()) {
                    for (int i2 = 0; i2 < bVar.f51300l.size(); i2++) {
                        C19001b bVar2 = (C19001b) bVar.f51300l.get(i2);
                        if (bVar2 != null) {
                            int b = bVar.mo50477b();
                            if (b != 2000) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i);
                                sb.append("_");
                                sb.append(i2);
                                m62251a(bVar2, b, sb.toString());
                                if (i == 0) {
                                    C18985b.m61973a();
                                    C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(b).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                                }
                            } else {
                                int a = m62242a(bVar2);
                                if (a == 5000) {
                                    arrayList.add(bVar2);
                                } else if (i == 0) {
                                    C18985b.m61973a();
                                    C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(a).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                                }
                            }
                        }
                    }
                }
                int b2 = bVar.mo50477b();
                if (bVar.mo50379w() != 0 || b2 == 2000) {
                    int a2 = m62242a(bVar);
                    if (a2 == 5000) {
                        arrayList.add(bVar);
                    } else if (i == 0) {
                        C18985b.m61973a();
                        C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(a2).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                    }
                } else {
                    m62251a(bVar, b2, String.valueOf(i));
                    if (i == 0) {
                        C18985b.m61973a();
                        C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(b2).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private C19001b m62262d(List<C19001b> list) {
        LinkedHashMap c = C19063v.m62414a().mo50647c();
        if (c != null && c.size() > 0) {
            boolean z = false;
            for (Entry entry : c.entrySet()) {
                Long l = (Long) entry.getKey();
                String str = (String) entry.getValue();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C19001b bVar = (C19001b) it.next();
                    if (bVar != null && bVar.mo50375n() == l.longValue()) {
                        if (bVar.mo50489l()) {
                            if (!C19132j.m62736a(bVar.mo50380x()) && C19025f.m62094H() != null) {
                                if (C19025f.m62094H().mo50383a(bVar, false)) {
                                    this.f51473a = System.currentTimeMillis();
                                    C18985b.m61973a();
                                    C18985b.m61976a(bVar, "topview_show_confirmed");
                                    return bVar;
                                }
                                if (this.f51477f == null) {
                                    this.f51477f = bVar;
                                }
                                C18985b.m61973a();
                                C18985b.m61976a(bVar, "topview_show_rejected");
                            }
                        } else if (!bVar.mo50490m()) {
                            boolean a = bVar.mo50476a();
                            boolean b = m62256b(bVar);
                            if (!a || !b) {
                                if (!b && this.f51475c == bVar.mo50375n()) {
                                    C18985b.m61973a();
                                    C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(4004).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                                }
                                z = true;
                            } else {
                                C19001b bVar2 = (C19001b) bVar.clone();
                                bVar2.f51308t = true;
                                bVar2.f51295g = str;
                                C18949a.m61865a().mo50362a("service_real_time_show", 0, (JSONObject) null);
                                return bVar2;
                            }
                        } else if (C19025f.m62094H() != null && !TextUtils.isEmpty(bVar.mo50380x())) {
                            C18985b.m61973a();
                            C18985b.m61976a(bVar, "topview_search_show_rejected");
                        }
                    }
                }
            }
            if (!z) {
                m62247a(1, 1, true);
            }
        } else if (c != null) {
            m62247a(4, 2, true);
        }
        return null;
    }

    /* renamed from: f */
    private List<C19001b> m62265f(List<C19001b> list) {
        if (C19126e.m62680a(list)) {
            if (C19025f.m62158e()) {
                C19134l.m62742a(C19025f.m62096J().getString(R.string.dwc));
            }
            return null;
        }
        if (!TextUtils.isEmpty(((C19001b) list.get(0)).mo50470B())) {
            this.f51474b = ((C19001b) list.get(0)).mo50470B();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C19001b bVar = (C19001b) list.get(i);
            if (bVar != null) {
                if (bVar.f51300l != null && !bVar.f51300l.isEmpty()) {
                    for (int i2 = 0; i2 < bVar.f51300l.size(); i2++) {
                        C19001b bVar2 = (C19001b) bVar.f51300l.get(i2);
                        if (bVar2 != null) {
                            int b = bVar.mo50477b();
                            if (b != 2000) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i);
                                sb.append("_");
                                sb.append(i2);
                                m62251a(bVar2, b, sb.toString());
                                if (i == 0) {
                                    C18985b.m61973a();
                                    C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(b).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                                }
                            } else {
                                int a = m62242a(bVar2);
                                if (a == 5000) {
                                    arrayList.add(bVar2);
                                } else if (i == 0) {
                                    C18985b.m61973a();
                                    C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(a).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                                }
                            }
                        }
                    }
                }
                int b2 = bVar.mo50477b();
                if (bVar.mo50379w() != 0 || b2 == 2000) {
                    int a2 = m62242a(bVar);
                    if (a2 == 5000) {
                        arrayList.add(bVar);
                    } else if (i == 0) {
                        C18985b.m61973a();
                        C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(a2).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                    }
                } else {
                    m62251a(bVar, b2, String.valueOf(i));
                    if (i == 0) {
                        C18985b.m61973a();
                        C18985b.m61979c(new C18984a().mo50439a(bVar.mo50375n()).mo50442b(b2).mo50440a(bVar.mo50376p()).mo50438a(1).mo50441a());
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m62246a(int i, int i2) {
        C18956b.m61883a();
        C18956b.m61884a(i2);
    }

    /* renamed from: a */
    private void m62248a(long j, boolean z) {
        m62249a(j, true, false, z);
    }

    /* renamed from: a */
    private C19001b m62244a(List<C19001b> list, boolean z) {
        if (z) {
            C19062u.m62368a().mo50610b(true).mo50628j();
            List g = m62266g(list);
            m62264e(g);
            return m62243a(g);
        }
        List h = m62267h(list);
        m62264e(h);
        return m62243a(h);
    }

    /* renamed from: a */
    private static void m62250a(C19001b bVar, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", bVar.mo50376p());
            JSONObject jSONObject2 = new JSONObject();
            String str = "";
            String str2 = "";
            switch (i) {
                case 1:
                    str = "not_download_image";
                    str2 = C19129h.m62695a(bVar.f51287a);
                    break;
                case 2:
                    str = "not_download_video";
                    str2 = C19129h.m62696a(bVar.f51302n);
                    break;
            }
            jSONObject2.putOpt("reason", str);
            jSONObject2.putOpt("url", str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.mo50374f()));
        } catch (Exception unused) {
        }
        C19025f.m62115a(bVar.mo50375n(), "splash_ad", "not_showing_reason", jSONObject);
    }

    /* renamed from: a */
    private static void m62247a(int i, int i2, boolean z) {
        C18985b.m61973a();
        C18985b.m61982d(new C18984a().mo50439a(84378473382L).mo50438a(i).mo50440a("{}").mo50441a());
        C18985b.m61973a().mo50446c();
        C18949a.m61865a().mo50362a("service_real_time_show", i2, (JSONObject) null);
    }

    /* renamed from: a */
    private static void m62249a(long j, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1");
            String str4 = "status";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject2.putOpt(str4, str);
            if (z) {
                jSONObject2.putOpt("duration", Long.valueOf(j));
                String str5 = "stop_show";
                if (z3) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                jSONObject2.putOpt(str5, str3);
            } else {
                String str6 = "is_penalty_period";
                if (z2) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                jSONObject2.putOpt(str6, str2);
            }
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (Exception unused) {
        }
        C19025f.m62115a(84378473382L, "splash_ad", "stop_showing_monitor", jSONObject);
    }
}
