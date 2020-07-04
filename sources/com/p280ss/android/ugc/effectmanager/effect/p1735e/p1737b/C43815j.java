package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43730b;
import com.p280ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43785b;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.j */
public final class C43815j extends C43727d {

    /* renamed from: a */
    private C43680a f113407a;

    /* renamed from: b */
    private C43719a f113408b;

    /* renamed from: g */
    private C43721c f113409g;

    /* renamed from: h */
    private String f113410h;

    /* renamed from: i */
    private boolean f113411i = false;

    /* renamed from: a */
    public final void mo105685a() {
        InputStream b = this.f113408b.mo105735b(C43730b.m138576a(this.f113407a.f113068a.f113515f, this.f113410h));
        if (b == null) {
            mo105769a(14, new C43785b(new EffectChannelResponse(this.f113410h), new C43726c(10004)));
            return;
        }
        EffectChannelModel effectChannelModel = (EffectChannelModel) this.f113409g.mo70689a(b, EffectChannelModel.class);
        if (effectChannelModel == null) {
            mo105769a(14, new C43785b(new EffectChannelResponse(this.f113410h), new C43726c(10004)));
        } else if (!effectChannelModel.checkValued()) {
            mo105769a(14, new C43785b(new EffectChannelResponse(this.f113410h), new C43726c(10004)));
        } else {
            mo105769a(14, new C43785b(new BuildEffectChannelResponse(this.f113410h, this.f113407a.f113068a.f113519j.getAbsolutePath(), true).buildChannelResponse(effectChannelModel), null));
        }
        C43729a.m138574a(b);
    }

    public C43815j(C43680a aVar, String str, String str2, Handler handler, boolean z) {
        super(handler, str2, "NETWORK");
        this.f113410h = str;
        this.f113407a = aVar;
        this.f113408b = this.f113407a.f113068a.f113528s;
        this.f113409g = this.f113407a.f113068a.f113532w;
    }
}
