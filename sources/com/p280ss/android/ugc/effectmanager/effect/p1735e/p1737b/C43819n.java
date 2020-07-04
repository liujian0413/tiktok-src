package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43730b;
import com.p280ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43793j;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.n */
public final class C43819n extends C43727d {

    /* renamed from: a */
    private C43680a f113433a;

    /* renamed from: b */
    private C43834g f113434b = this.f113433a.f113068a;

    /* renamed from: g */
    private C43719a f113435g = this.f113434b.f113528s;

    /* renamed from: h */
    private C43721c f113436h = this.f113434b.f113532w;

    /* renamed from: i */
    private String f113437i;

    /* renamed from: a */
    public final void mo105685a() {
        InputStream b = this.f113435g.mo105735b(C43730b.m138578b(this.f113434b.f113515f, this.f113437i));
        if (b == null) {
            mo105769a(22, new C43793j(null, new C43726c(10004)));
            return;
        }
        PanelInfoResponse panelInfoResponse = (PanelInfoResponse) this.f113436h.mo70689a(b, PanelInfoResponse.class);
        if (panelInfoResponse == null || !panelInfoResponse.checkValue()) {
            mo105769a(22, new C43793j(null, new C43726c(10004)));
        } else {
            mo105769a(22, new C43793j(panelInfoResponse.data, null));
        }
        C43729a.m138574a(b);
    }

    public C43819n(C43680a aVar, String str, String str2, Handler handler) {
        super(handler, str2, "NETWORK");
        this.f113437i = str;
        this.f113433a = aVar;
    }
}
