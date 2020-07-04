package com.p280ss.android.ugc.effectmanager;

import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43751a;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43752b;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43758h;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43761k;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43762l;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43763m;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43766p;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43767q;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43768r;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43771u;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.k */
public final class C43846k {

    /* renamed from: a */
    private Map<String, C43757g> f113585a = new HashMap();

    /* renamed from: b */
    private Map<String, C43751a> f113586b = new HashMap();

    /* renamed from: c */
    private Map<String, C43759i> f113587c = new HashMap();

    /* renamed from: d */
    private Map<String, C43758h> f113588d;

    /* renamed from: e */
    private Map<String, C43760j> f113589e = new HashMap();

    /* renamed from: f */
    private Map<String, C43766p> f113590f = new HashMap();

    /* renamed from: g */
    private Map<String, C43761k> f113591g = new HashMap();

    /* renamed from: h */
    private Map<String, C43771u> f113592h = new HashMap();

    /* renamed from: i */
    private Map<String, C43767q> f113593i = new HashMap();

    /* renamed from: j */
    private Map<String, C43763m> f113594j;

    /* renamed from: k */
    private Map<String, C43752b> f113595k;

    /* renamed from: l */
    private Map<String, C43756f> f113596l;

    /* renamed from: m */
    private Map<String, C43762l> f113597m;

    /* renamed from: n */
    private Map<String, C43768r> f113598n = new HashMap();

    /* renamed from: o */
    private Map<String, Object> f113599o;

    /* renamed from: a */
    public final void mo106044a(String str, C43771u uVar) {
        if (this.f113592h == null) {
            this.f113592h = new HashMap();
        }
        this.f113592h.put(str, uVar);
    }

    /* renamed from: a */
    public final void mo106043a(String str, C43767q qVar) {
        if (this.f113593i == null) {
            this.f113593i = new HashMap();
        }
        this.f113593i.put(str, qVar);
    }

    /* renamed from: a */
    public final void mo106039a(String str, C43761k kVar) {
        if (this.f113591g == null) {
            this.f113591g = new HashMap();
        }
        this.f113591g.put(str, kVar);
    }

    /* renamed from: a */
    public final void mo106042a(String str, C43766p pVar) {
        if (this.f113590f == null) {
            this.f113590f = new HashMap();
        }
        this.f113590f.put(str, pVar);
    }

    /* renamed from: a */
    public final void mo106040a(String str, C43762l lVar) {
        if (this.f113597m == null) {
            this.f113597m = new HashMap();
        }
        this.f113597m.put(str, lVar);
    }

    /* renamed from: a */
    public final void mo106041a(String str, C43763m mVar) {
        if (this.f113594j == null) {
            this.f113594j = new HashMap();
        }
        this.f113594j.put(str, mVar);
    }

    /* renamed from: a */
    public final void mo106037a(String str, C43759i iVar) {
        if (this.f113589e == null) {
            this.f113589e = new HashMap();
        }
        this.f113587c.put(str, iVar);
    }

    /* renamed from: a */
    public final void mo106038a(String str, C43760j jVar) {
        if (this.f113589e == null) {
            this.f113589e = new HashMap();
        }
        this.f113589e.put(str, jVar);
    }

    /* renamed from: a */
    public final void mo106031a() {
        for (String put : this.f113586b.keySet()) {
            this.f113586b.put(put, null);
        }
        for (String put2 : this.f113585a.keySet()) {
            this.f113585a.put(put2, null);
        }
        for (String put3 : this.f113587c.keySet()) {
            this.f113587c.put(put3, null);
        }
        for (String put4 : this.f113589e.keySet()) {
            this.f113589e.put(put4, null);
        }
        for (String put5 : this.f113590f.keySet()) {
            this.f113590f.put(put5, null);
        }
        for (String put6 : this.f113591g.keySet()) {
            this.f113591g.put(put6, null);
        }
        for (String put7 : this.f113593i.keySet()) {
            this.f113593i.put(put7, null);
        }
        for (String put8 : this.f113592h.keySet()) {
            this.f113592h.put(put8, null);
        }
        for (String put9 : this.f113598n.keySet()) {
            this.f113598n.put(put9, null);
        }
        if (this.f113594j != null) {
            this.f113594j.clear();
        }
    }

    /* renamed from: a */
    public final C43762l mo106029a(String str) {
        if (this.f113597m == null) {
            return null;
        }
        return (C43762l) this.f113597m.get(str);
    }

    /* renamed from: b */
    public final C43756f mo106045b(String str) {
        if (this.f113596l == null) {
            return null;
        }
        return (C43756f) this.f113596l.get(str);
    }

    /* renamed from: m */
    public final void mo106056m(String str) {
        if (this.f113593i != null) {
            this.f113593i.remove(str);
        }
    }

    /* renamed from: o */
    public final void mo106058o(String str) {
        if (this.f113592h != null) {
            this.f113592h.remove(str);
        }
    }

    /* renamed from: p */
    public final C43763m mo106059p(String str) {
        if (this.f113594j == null) {
            return null;
        }
        return (C43763m) this.f113594j.get(str);
    }

    /* renamed from: q */
    public final C43752b mo106060q(String str) {
        if (this.f113595k == null) {
            return null;
        }
        return (C43752b) this.f113595k.get(str);
    }

    /* renamed from: c */
    public final C43758h mo106046c(String str) {
        if (this.f113588d == null) {
            this.f113588d = new HashMap();
        }
        return (C43758h) this.f113588d.get(str);
    }

    /* renamed from: d */
    public final C43760j mo106047d(String str) {
        if (this.f113589e == null) {
            this.f113589e = new HashMap();
        }
        return (C43760j) this.f113589e.get(str);
    }

    /* renamed from: e */
    public final C43759i mo106048e(String str) {
        if (this.f113587c == null) {
            this.f113587c = new HashMap();
        }
        return (C43759i) this.f113587c.get(str);
    }

    /* renamed from: f */
    public final C43751a mo106049f(String str) {
        if (this.f113586b == null) {
            this.f113586b = new HashMap();
        }
        return (C43751a) this.f113586b.get(str);
    }

    /* renamed from: g */
    public final C43768r mo106050g(String str) {
        if (this.f113598n == null) {
            this.f113598n = new HashMap();
        }
        return (C43768r) this.f113598n.get(str);
    }

    /* renamed from: h */
    public final C43757g mo106051h(String str) {
        if (this.f113585a == null) {
            this.f113585a = new HashMap();
        }
        return (C43757g) this.f113585a.get(str);
    }

    /* renamed from: i */
    public final Object mo106052i(String str) {
        if (this.f113599o == null) {
            this.f113599o = new HashMap();
        }
        return this.f113599o.get(str);
    }

    /* renamed from: j */
    public final C43766p mo106053j(String str) {
        if (this.f113590f == null) {
            this.f113590f = new HashMap();
        }
        return (C43766p) this.f113590f.get(str);
    }

    /* renamed from: k */
    public final C43761k mo106054k(String str) {
        if (this.f113591g == null) {
            this.f113591g = new HashMap();
        }
        return (C43761k) this.f113591g.get(str);
    }

    /* renamed from: l */
    public final C43767q mo106055l(String str) {
        if (this.f113593i == null) {
            this.f113593i = new HashMap();
        }
        return (C43767q) this.f113593i.get(str);
    }

    /* renamed from: n */
    public final C43771u mo106057n(String str) {
        if (this.f113592h == null) {
            this.f113592h = new HashMap();
        }
        return (C43771u) this.f113592h.get(str);
    }

    /* renamed from: a */
    public final Object mo106030a(String str, Object obj) {
        if (this.f113599o == null) {
            this.f113599o = new HashMap();
        }
        return this.f113599o.put(str, obj);
    }

    /* renamed from: a */
    public final void mo106032a(String str, C43751a aVar) {
        if (this.f113586b == null) {
            this.f113586b = new HashMap();
        }
        this.f113586b.put(str, aVar);
    }

    /* renamed from: a */
    public final void mo106033a(String str, C43752b bVar) {
        if (this.f113595k == null) {
            this.f113595k = new HashMap();
        }
        this.f113595k.put(str, bVar);
    }

    /* renamed from: a */
    public final void mo106034a(String str, C43756f fVar) {
        if (this.f113596l == null) {
            this.f113596l = new HashMap();
        }
        this.f113596l.put(str, fVar);
    }

    /* renamed from: a */
    public final void mo106035a(String str, C43757g gVar) {
        if (this.f113585a == null) {
            this.f113585a = new HashMap();
        }
        this.f113585a.put(str, gVar);
    }

    /* renamed from: a */
    public final void mo106036a(String str, C43758h hVar) {
        if (this.f113588d == null) {
            this.f113588d = new HashMap();
        }
        this.f113588d.put(str, hVar);
    }
}
