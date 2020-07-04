package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43796m;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.r */
public final class C43823r extends C43727d {

    /* renamed from: a */
    private C43719a f113468a;

    /* renamed from: b */
    private C43721c f113469b;

    /* renamed from: g */
    private String f113470g;

    /* renamed from: h */
    private String f113471h;

    /* renamed from: a */
    public final void mo105685a() {
        InputStream b = this.f113468a.mo105735b("updatetime");
        if (b == null) {
            mo105769a(52, new C43796m(this.f113470g, this.f113471h, null, new C43726c(10009)));
            return;
        }
        try {
            HashMap hashMap = (HashMap) this.f113469b.mo70689a(b, HashMap.class);
            if (hashMap != null) {
                mo105769a(52, new C43796m(this.f113470g, this.f113471h, hashMap, null));
            } else {
                mo105769a(52, new C43796m(this.f113470g, this.f113471h, null, new C43726c((Exception) new IllegalStateException("local file destroy"))));
            }
        } catch (Exception e) {
            mo105769a(52, new C43796m(this.f113470g, this.f113471h, null, new C43726c(e)));
        } finally {
            C43729a.m138574a(b);
        }
    }

    public C43823r(Handler handler, C43680a aVar, String str, String str2, String str3) {
        super(handler, str);
        this.f113468a = aVar.f113068a.f113528s;
        this.f113469b = aVar.f113068a.f113532w;
        this.f113470g = str2;
        this.f113471h = str3;
    }
}
