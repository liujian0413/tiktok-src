package com.bytedance.p073ad.symphony.provider;

import com.bytedance.p073ad.symphony.p074a.C2092b;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p084g.C2157b.C2158a;
import com.bytedance.p073ad.symphony.p085h.C2159a;

/* renamed from: com.bytedance.ad.symphony.provider.b */
public interface C2195b<AD extends C2092b> {

    /* renamed from: com.bytedance.ad.symphony.provider.b$a */
    public interface C2196a {
        /* renamed from: a */
        void mo7796a(String str);

        /* renamed from: a */
        void mo7797a(String str, String str2, int i, double d);

        /* renamed from: a */
        void mo7798a(String str, String str2, int i, String str3, double d);
    }

    AD getNextAd(String str);

    String getPlacementId(String str);

    int getProviderId();

    boolean hasValidAd(String str);

    void setAdConfig(C2142a aVar);

    void tryPreloadAd(String str, C2159a aVar, C2158a aVar2);
}
