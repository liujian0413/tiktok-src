package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43799p;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.u */
public final class C43826u extends C43727d {

    /* renamed from: a */
    private C43719a f113493a;

    /* renamed from: b */
    private C43721c f113494b;

    /* renamed from: g */
    private HashMap<String, String> f113495g = new HashMap<>();

    /* renamed from: h */
    private String f113496h;

    /* renamed from: a */
    public final void mo105685a() {
        this.f113493a.mo105732a("updatetime", this.f113494b.mo70690a(this.f113495g));
        mo105769a(51, new C43799p(this.f113496h, null));
    }

    public C43826u(Handler handler, C43680a aVar, String str, HashMap<String, String> hashMap) {
        super(handler, str);
        this.f113493a = aVar.f113068a.f113528s;
        this.f113494b = aVar.f113068a.f113532w;
        this.f113495g.putAll(hashMap);
        this.f113496h = str;
    }
}
