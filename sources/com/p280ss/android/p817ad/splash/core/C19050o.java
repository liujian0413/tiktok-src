package com.p280ss.android.p817ad.splash.core;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.p817ad.splash.C19115e;
import com.p280ss.android.p817ad.splash.C19142i;
import com.p280ss.android.p817ad.splash.C19142i.C19145b;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p828c.C19002c;
import com.p280ss.android.p817ad.splash.core.p828c.C19004d;
import com.p280ss.android.p817ad.splash.core.p828c.C19004d.C19005a;
import com.p280ss.android.p817ad.splash.p824b.C18956b;
import com.p280ss.android.p817ad.splash.p825c.C18958a;
import com.p280ss.android.p817ad.splash.p836g.C19126e;
import com.p280ss.android.p817ad.splash.p836g.C19129h;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import com.p280ss.android.p817ad.splash.p836g.C19138o;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.o */
final class C19050o implements C19049n {

    /* renamed from: a */
    private C19115e f51478a;

    /* renamed from: b */
    private volatile boolean f51479b;

    /* renamed from: c */
    private long f51480c;

    /* renamed from: d */
    private View f51481d;

    /* renamed from: c */
    public final void mo50552c() {
        this.f51480c = System.currentTimeMillis();
    }

    /* renamed from: d */
    private void m62282d() {
        this.f51479b = true;
        C19053q.m62298i().f51485a = false;
    }

    /* renamed from: a */
    public final void mo50546a() {
        if (!this.f51479b) {
            m62282d();
            C18956b.m61883a().mo50373e();
            this.f51478a.mo50822a(this.f51481d);
        }
    }

    /* renamed from: b */
    public final void mo50549b() {
        if (!this.f51479b) {
            m62282d();
            C18956b.m61883a().mo50373e();
            this.f51478a.mo50822a(this.f51481d);
        }
    }

    /* renamed from: b */
    public final void mo50550b(C19001b bVar) {
        this.f51478a.mo50821a(bVar.mo50375n(), bVar.mo50376p());
    }

    /* renamed from: a */
    public final void mo50547a(C19001b bVar) {
        if (!this.f51479b) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (bVar.mo50377r() == 0 || bVar.mo50377r() == 4) {
                    jSONObject.putOpt("show_time", Long.valueOf(System.currentTimeMillis() - this.f51480c));
                }
                if (!C19132j.m62736a(bVar.mo50376p())) {
                    jSONObject.putOpt("log_extra", bVar.mo50376p());
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.mo50374f());
            } catch (Exception unused) {
                jSONObject = null;
            }
            C19025f.m62115a(bVar.mo50375n(), "splash_ad", "skip", jSONObject);
            C18956b.m61883a().mo50373e();
            m62282d();
            this.f51478a.mo50822a(this.f51481d);
        }
    }

    public C19050o(View view, C19115e eVar) {
        this.f51481d = view;
        this.f51478a = eVar;
    }

    /* renamed from: a */
    private static void m62280a(C19001b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_fetch_time", bVar.mo50374f());
            if (!C19132j.m62736a(bVar.mo50376p())) {
                jSONObject.put("log_extra", bVar.mo50376p());
            }
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException unused) {
            jSONObject = null;
        }
        C19025f.m62115a(bVar.mo50375n(), "splash_ad", str, jSONObject);
    }

    /* renamed from: b */
    public final boolean mo50551b(C19001b bVar, C19002c cVar) {
        boolean z = this.f51479b;
        List<C19145b> a = m62278a(bVar.mo50491o(), bVar.f51292d, bVar.mo50492q());
        if (!C19126e.m62681b(a)) {
            return false;
        }
        C19142i A = bVar.mo50469A();
        A.f51741j = a;
        this.f51478a.mo50823a(this.f51481d, A);
        m62281c(bVar, cVar);
        m62282d();
        return true;
    }

    /* renamed from: c */
    private static void m62281c(C19001b bVar, C19002c cVar) {
        JSONObject jSONObject;
        String str;
        try {
            Point point = cVar.f51317c;
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("click_x", Integer.valueOf(point.x));
            jSONObject2.putOpt("click_y", Integer.valueOf(point.y));
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
            jSONObject.put("ad_fetch_time", bVar.mo50374f());
            if (!C19132j.m62736a(bVar.mo50376p())) {
                jSONObject.put("log_extra", bVar.mo50376p());
            }
            jSONObject.putOpt("is_ad_event", "1");
        } catch (Exception unused) {
            jSONObject = null;
        }
        long n = bVar.mo50375n();
        String str2 = "splash_ad";
        if (cVar.f51316b) {
            str = "click";
        } else {
            str = "banner_click";
        }
        C19025f.m62115a(n, str2, str, jSONObject);
        if (bVar.f51302n != null) {
            C19025f.m62093G().mo50524b(null, bVar.mo50375n(), bVar.mo50378v(), bVar.mo50376p(), true, -1, null);
        }
    }

    /* renamed from: a */
    private void m62279a(C18958a aVar, C19002c cVar) {
        C19002c cVar2 = cVar;
        JSONObject jSONObject = new JSONObject();
        try {
            Point point = cVar2.f51317c;
            JSONObject jSONObject2 = new JSONObject();
            int i = 1;
            if (cVar2.f51315a >= 0 && aVar.mo50377r() == 4) {
                jSONObject2.putOpt("pic_position", Integer.valueOf(cVar2.f51315a + 1));
            }
            jSONObject2.putOpt("click_x", Integer.valueOf(point.x));
            jSONObject2.putOpt("click_y", Integer.valueOf(point.y));
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
            String str = "area";
            if (cVar2.f51315a >= 0) {
                i = 0;
            }
            jSONObject.putOpt(str, Integer.valueOf(i));
            jSONObject.putOpt("log_extra", aVar.mo50376p());
            jSONObject.putOpt("is_ad_event", "1");
            try {
                jSONObject.putOpt("show_time", Long.valueOf(System.currentTimeMillis() - this.f51480c));
                jSONObject.put("ad_fetch_time", aVar.mo50374f());
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
        C19025f.m62115a(aVar.mo50375n(), "splash_ad", "click", jSONObject);
        C19025f.m62093G().mo50524b(null, aVar.mo50375n(), aVar.mo50378v(), aVar.mo50376p(), true, -1, null);
    }

    /* renamed from: a */
    public final void mo50548a(C19001b bVar, C19002c cVar) {
        String str;
        String str2;
        String o;
        boolean z = this.f51479b;
        C19004d dVar = null;
        if (bVar.mo50377r() == 4 && cVar.f51315a >= 0) {
            List t = bVar.mo50494t();
            List s = bVar.mo50493s();
            if (t == null || t.size() <= cVar.f51315a) {
                str2 = null;
            } else {
                str2 = (String) t.get(cVar.f51315a);
            }
            if (s == null || s.size() <= cVar.f51315a) {
                str = null;
            } else {
                str = (String) s.get(cVar.f51315a);
            }
        } else if (bVar.f51298j != 3 || cVar.f51315a >= 0) {
            str2 = bVar.mo50491o();
            str = bVar.mo50492q();
        } else {
            if (C19129h.m62719b(bVar.mo50483g())) {
                o = bVar.mo50483g();
                dVar = new C19005a().mo50505a(bVar.mo50472D()).mo50506a();
            } else {
                o = bVar.mo50491o();
            }
            str = bVar.mo50492q();
        }
        if (cVar.f51319e) {
            m62280a(bVar, cVar.f51318d);
        }
        List<C19145b> a = m62278a(str2, bVar.f51292d, str);
        if (C19126e.m62681b(a)) {
            C19142i A = bVar.mo50469A();
            A.f51741j = a;
            A.f51742k = dVar;
            this.f51478a.mo50823a(this.f51481d, A);
            m62279a((C18958a) bVar, cVar);
            m62282d();
        }
    }

    /* renamed from: a */
    private static List<C19145b> m62278a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && C19129h.m62719b(str)) {
            int a = C19129h.m62693a(str);
            if (a == 3 || a == 4) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(new C19145b(str3, a));
                }
            } else if (a != 0) {
                if (a != 5) {
                    arrayList.add(new C19145b(str, a));
                } else if (C19025f.m62193x() != null && C19025f.m62193x().mo50854a()) {
                    arrayList.add(new C19145b(str, 1));
                }
            }
        }
        if (C19138o.m62754b(str2) && C19025f.m62193x() != null && C19025f.m62193x().mo50854a()) {
            arrayList.add(new C19145b(str2, 5));
        }
        if (C19138o.m62753a(str3)) {
            arrayList.add(new C19145b(str3, 2));
        }
        return arrayList;
    }
}
