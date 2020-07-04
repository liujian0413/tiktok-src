package com.bytedance.p073ad.symphony.p074a;

import android.content.Context;
import com.bytedance.p073ad.symphony.p078c.C2125d;
import com.bytedance.p073ad.symphony.p081e.C2148b;
import com.bytedance.p073ad.symphony.p081e.C2148b.C2150a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.util.SafeConcurrentHashMap;

/* renamed from: com.bytedance.ad.symphony.a.a */
public abstract class C2081a implements C2092b {

    /* renamed from: a */
    protected long f7167a = System.currentTimeMillis();

    /* renamed from: b */
    protected Context f7168b;

    /* renamed from: c */
    protected C2142a f7169c;

    /* renamed from: d */
    protected C2143b f7170d;

    /* renamed from: e */
    public C2125d f7171e = new C2125d();

    /* renamed from: f */
    protected C2148b f7172f;

    /* renamed from: g */
    protected String f7173g;

    /* renamed from: b */
    public final C2148b mo7751b() {
        return this.f7172f;
    }

    /* renamed from: a */
    public final boolean mo7750a() {
        if (System.currentTimeMillis() - this.f7167a > this.f7169c.f7277b) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private void mo7772l() {
        SafeConcurrentHashMap safeConcurrentHashMap = new SafeConcurrentHashMap(32);
        safeConcurrentHashMap.put("ad_provider_id", Integer.valueOf(this.f7169c.f7276a));
        safeConcurrentHashMap.put("ad_placement_type_prefix", this.f7170d.f7285b);
        safeConcurrentHashMap.put("ad_placement_type", this.f7173g);
        safeConcurrentHashMap.put("ad_placement_id", this.f7170d.f7284a);
        this.f7172f.f7304f = safeConcurrentHashMap;
    }

    public C2081a(Context context, C2142a aVar, C2143b bVar, String str) {
        this.f7168b = context.getApplicationContext();
        this.f7169c = aVar;
        this.f7170d = bVar;
        this.f7173g = str;
        if (!(aVar == null || bVar == null)) {
            this.f7172f = new C2150a().mo7831a(bVar.f7284a).mo7833b(str).mo7830a(aVar.f7276a).mo7832a();
        }
        mo7772l();
    }
}
