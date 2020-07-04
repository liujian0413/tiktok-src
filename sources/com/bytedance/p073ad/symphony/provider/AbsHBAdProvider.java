package com.bytedance.p073ad.symphony.provider;

import android.content.Context;
import com.bytedance.p073ad.symphony.p074a.p075a.C2086c;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.bytedance.p073ad.symphony.p076b.C2113d;
import com.bytedance.p073ad.symphony.p078c.C2117b;
import com.bytedance.p073ad.symphony.p078c.C2117b.C2118a;
import com.bytedance.p073ad.symphony.p078c.C2117b.C2119b;
import com.bytedance.p073ad.symphony.p078c.C2117b.C2120c;
import com.bytedance.p073ad.symphony.p078c.C2117b.C2121d;
import com.bytedance.p073ad.symphony.p078c.C2117b.C2122e;
import com.bytedance.p073ad.symphony.p078c.C2117b.C2123f;
import com.bytedance.p073ad.symphony.p078c.C2129h;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;

/* renamed from: com.bytedance.ad.symphony.provider.AbsHBAdProvider */
public abstract class AbsHBAdProvider extends AbsNativeAdProvider implements C2197c {
    /* access modifiers changed from: protected */
    public void sendBidRequestEvent(String str) {
        sendEvent(new C2118a(str));
    }

    private void sendEvent(C2117b bVar) {
        bVar.mo7810a();
        bVar.f7234e = getProviderId();
        bVar.f7232c = getPlacementId(bVar.f7233d);
        C2129h.m9335a(bVar);
    }

    public String getBidId(String str) {
        C2087d dVar = (C2087d) this.mAdPool.get(str);
        if (dVar instanceof C2086c) {
            return ((C2086c) dVar).mo7774n();
        }
        return "";
    }

    public double getMaxPrice(String str) {
        C2087d dVar = (C2087d) this.mAdPool.get(str);
        if (!(dVar instanceof C2086c) || dVar.mo7750a()) {
            return 0.0d;
        }
        return ((C2086c) dVar).mo7772l();
    }

    /* access modifiers changed from: protected */
    public void sendCreativeRequestEvent(String str, String str2) {
        C2120c cVar = new C2120c(str);
        cVar.f7235f = str2;
        sendEvent(cVar);
    }

    /* access modifiers changed from: protected */
    public void sendLossNoticeEvent(String str, String str2) {
        C2122e eVar = new C2122e(str);
        eVar.f7235f = str2;
        sendEvent(eVar);
    }

    /* access modifiers changed from: protected */
    public void sendWinNoticeEvent(String str, String str2) {
        C2123f fVar = new C2123f(str);
        fVar.f7235f = str2;
        sendEvent(fVar);
    }

    public AbsHBAdProvider(Context context, C2142a aVar, C2113d dVar) {
        super(context, aVar, dVar);
    }

    /* access modifiers changed from: protected */
    public void sendBidResponseEvent(String str, String str2, String str3) {
        C2119b bVar = new C2119b(str);
        if (str2 != null) {
            bVar.f7231b = str2;
            bVar.f7230a = "failed";
        } else {
            bVar.f7230a = "succeed";
            bVar.f7235f = str3;
        }
        sendEvent(bVar);
    }

    public void sendCreativeResponseEvent(String str, String str2, String str3) {
        C2121d dVar = new C2121d(str);
        if (str2 != null) {
            dVar.f7231b = str2;
            dVar.f7230a = "failed";
        } else {
            dVar.f7230a = "succeed";
        }
        dVar.f7235f = str3;
        sendEvent(dVar);
    }
}
