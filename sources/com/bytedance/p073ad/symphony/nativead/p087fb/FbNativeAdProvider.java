package com.bytedance.p073ad.symphony.nativead.p087fb;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.p073ad.symphony.C2114c;
import com.bytedance.p073ad.symphony.nativead.p087fb.C2183d.C2184a;
import com.bytedance.p073ad.symphony.p076b.C2113d;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.p084g.C2157b.C2158a;
import com.bytedance.p073ad.symphony.p085h.C2159a;
import com.bytedance.p073ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.p073ad.symphony.util.C2205h;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.C13098Ad;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.bytedance.ad.symphony.nativead.fb.FbNativeAdProvider */
public class FbNativeAdProvider extends AbsNativeAdProvider {
    public String getTag() {
        StringBuilder sb = new StringBuilder("FbNativeAdProvider[");
        sb.append(getProviderId());
        sb.append("]");
        return sb.toString();
    }

    public FbNativeAdProvider(Context context, C2142a aVar, C2113d dVar) {
        super(context, aVar, dVar);
    }

    public void loadAdAsync(String str, C2143b bVar, C2159a aVar, C2158a aVar2) {
        getTag();
        new StringBuilder("type-->").append(str);
        if (!C2114c.m9318c()) {
            if (aVar2 != null) {
                aVar2.mo7839a(bVar.f7284a, "GDPR FORBIDDEN");
            }
            return;
        }
        if (C2114c.m9317b() && !C6319n.m19593a(this.mAdConfig.f7282g)) {
            AdSettings.addTestDevice(this.mAdConfig.f7282g);
            getTag();
            new StringBuilder("use test mode,device id:").append(this.mAdConfig.f7282g);
        }
        getTag();
        StringBuilder sb = new StringBuilder("request placementType ");
        sb.append(str);
        sb.append(",use real pid:");
        sb.append(bVar.f7284a);
        NativeAd nativeAd = new NativeAd(this.mContext, bVar.f7284a);
        final String str2 = str;
        final C2158a aVar3 = aVar2;
        final C2143b bVar2 = bVar;
        final NativeAd nativeAd2 = nativeAd;
        C21751 r1 = new NativeAdListener() {
            public final void onAdClicked(C13098Ad ad) {
            }

            public final void onLoggingImpression(C13098Ad ad) {
            }

            public final void onMediaDownloaded(C13098Ad ad) {
            }

            public final void onAdLoaded(C13098Ad ad) {
                C2205h.m9518a();
                FbNativeAdProvider.this.getTag();
                new StringBuilder("ad load SUCCESS, type-->").append(str2);
                FbNativeAdProvider.this.runOnAdThread(new Runnable() {
                    public final void run() {
                        C2184a a = C2183d.m9496a(nativeAd2);
                        C2179b bVar = new C2179b(FbNativeAdProvider.this.mContext, FbNativeAdProvider.this.mAdConfig, bVar2, nativeAd2, a.f7411a, a.f7412b, str2);
                        FbNativeAdProvider.this.addToPool(str2, bVar);
                        FbNativeAdProvider.this.cancelTimeoutCheck(str2);
                        if (aVar3 != null) {
                            aVar3.mo7843c(bVar2.f7284a);
                        }
                    }
                });
            }

            public final void onError(C13098Ad ad, final AdError adError) {
                FbNativeAdProvider.this.runOnAdThread(new Runnable() {
                    public final void run() {
                        FbNativeAdProvider.this.cancelTimeoutCheck(str2);
                        if (aVar3 != null) {
                            aVar3.mo7839a(bVar2.f7284a, String.valueOf(adError.getErrorCode()));
                        }
                    }
                });
            }
        };
        nativeAd.setAdListener(r1);
        startTimeoutCheck(str, aVar2);
        nativeAd.loadAd();
    }
}
