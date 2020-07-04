package com.bytedance.p073ad.symphony.nativead.p087fb.p088hb;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.p073ad.symphony.C2114c;
import com.bytedance.p073ad.symphony.C2140e;
import com.bytedance.p073ad.symphony.nativead.p087fb.C2179b;
import com.bytedance.p073ad.symphony.nativead.p087fb.C2183d;
import com.bytedance.p073ad.symphony.nativead.p087fb.C2183d.C2184a;
import com.bytedance.p073ad.symphony.p074a.p075a.C2086c;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.bytedance.p073ad.symphony.p076b.C2113d;
import com.bytedance.p073ad.symphony.p081e.C2148b;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.p084g.C2157b.C2158a;
import com.bytedance.p073ad.symphony.p085h.C2159a;
import com.bytedance.p073ad.symphony.provider.AbsHBAdProvider;
import com.bytedance.p073ad.symphony.util.C2205h;
import com.facebook.ads.AdError;
import com.facebook.ads.C13098Ad;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.bidding.C13202a;
import com.facebook.bidding.C13202a.C13203a;
import com.facebook.bidding.C13230b;
import com.facebook.bidding.FBAdBidFormat;

/* renamed from: com.bytedance.ad.symphony.nativead.fb.hb.FbHbAdProvider */
public class FbHbAdProvider extends AbsHBAdProvider {
    public String getTag() {
        StringBuilder sb = new StringBuilder("FbHbNativeAdProvider[");
        sb.append(getProviderId());
        sb.append("]");
        return sb.toString();
    }

    public void markBidLoss(String str) {
        C2087d dVar = (C2087d) this.mAdPool.get(str);
        if (dVar instanceof C2179b) {
            notifyBidResult(((C2179b) dVar).f7400q, false, str);
        }
    }

    public void onAdFill(C2087d dVar) {
        super.onAdFill(dVar);
        if (dVar != null && (dVar instanceof C2179b)) {
            C2148b b = dVar.mo7751b();
            String str = "";
            if (b != null) {
                str = b.f7300b;
            }
            notifyBidResult(((C2179b) dVar).f7400q, true, str);
        }
    }

    public boolean needPreload(String str) {
        long j;
        C2087d dVar = (C2087d) this.mAdPool.get(str);
        if (C2140e.m9361b() != null) {
            j = C2140e.m9361b().f7295b;
        } else {
            j = 300000;
        }
        if (!(dVar instanceof C2086c) || System.currentTimeMillis() - ((C2086c) dVar).mo7773m() >= j) {
            return true;
        }
        return false;
    }

    public FbHbAdProvider(Context context, C2142a aVar, C2113d dVar) {
        super(context, aVar, dVar);
    }

    public void notifyBidResult(C13230b bVar, boolean z, String str) {
        if (bVar != null) {
            if (z) {
                bVar.mo32419a();
                sendWinNoticeEvent(str, bVar.mo32422d());
            } else {
                bVar.mo32420b();
                sendLossNoticeEvent(str, bVar.mo32422d());
            }
            getTag();
            new StringBuilder("bid ").append(z);
        }
    }

    public void handleBidResponse(C13230b bVar, String str, C2143b bVar2, C2158a aVar) {
        if (bVar.mo32421c().booleanValue()) {
            handleBidResponseSuccess(bVar, str, bVar2, aVar);
        } else {
            handleBidResponseFail(bVar, str, bVar2, aVar);
        }
    }

    private void handleBidResponseFail(C13230b bVar, String str, C2143b bVar2, C2158a aVar) {
        String valueOf = String.valueOf(bVar.mo32426h());
        if (aVar != null) {
            aVar.mo7839a(bVar2.f7284a, valueOf);
        }
        sendBidResponseEvent(str, valueOf, null);
        getTag();
        StringBuilder sb = new StringBuilder(" error-->");
        sb.append(bVar.mo32426h());
        sb.append("type-->");
        sb.append(str);
    }

    private void loadAd(String str, C2143b bVar, C13230b bVar2, C2158a aVar) {
        final String e = bVar2.mo32423e();
        NativeAd nativeAd = new NativeAd(this.mContext, bVar2.mo32423e());
        final String str2 = str;
        final C13230b bVar3 = bVar2;
        final C2158a aVar2 = aVar;
        final NativeAd nativeAd2 = nativeAd;
        final C2143b bVar4 = bVar;
        C21882 r0 = new NativeAdListener() {
            public final void onAdClicked(C13098Ad ad) {
            }

            public final void onLoggingImpression(C13098Ad ad) {
            }

            public final void onMediaDownloaded(C13098Ad ad) {
            }

            public final void onAdLoaded(C13098Ad ad) {
                C2205h.m9518a();
                FbHbAdProvider.this.runOnAdThread(new Runnable() {
                    public final void run() {
                        C2087d dVar = (C2087d) FbHbAdProvider.this.mAdPool.get(str2);
                        if ((dVar instanceof C2179b) && !dVar.mo7750a()) {
                            FbHbAdProvider.this.notifyBidResult(((C2179b) dVar).f7400q, false, str2);
                        }
                        if (C2140e.m9361b() != null && C2140e.m9361b().f7297d) {
                            FbHbAdProvider.this.notifyBidResult(bVar3, false, str2);
                        }
                        C2184a a = C2183d.m9496a(nativeAd2);
                        C2179b bVar = new C2179b(FbHbAdProvider.this.mContext, FbHbAdProvider.this.mAdConfig, bVar4, nativeAd2, a.f7411a, a.f7412b, bVar3, str2, System.currentTimeMillis());
                        FbHbAdProvider.this.addToPool(str2, bVar);
                        FbHbAdProvider.this.cancelTimeoutCheck(str2);
                        if (aVar2 != null) {
                            aVar2.mo7843c(e);
                        }
                        FbHbAdProvider.this.sendCreativeResponseEvent(str2, null, bVar3.mo32422d());
                    }
                });
            }

            public final void onError(C13098Ad ad, final AdError adError) {
                C2205h.m9518a();
                FbHbAdProvider.this.runOnAdThread(new Runnable() {
                    public final void run() {
                        FbHbAdProvider.this.cancelTimeoutCheck(str2);
                        FbHbAdProvider.this.notifyBidResult(bVar3, false, str2);
                        String valueOf = String.valueOf(adError.getErrorCode());
                        if (aVar2 != null) {
                            aVar2.mo7839a(e, valueOf);
                        }
                        FbHbAdProvider.this.sendCreativeResponseEvent(str2, valueOf, bVar3.mo32422d());
                        FbHbAdProvider.this.getTag();
                        new StringBuilder("Fb header-bidding Ad load failed, errorCode-->").append(valueOf);
                    }
                });
            }
        };
        nativeAd.setAdListener(r0);
        startTimeoutCheck(str, aVar);
        sendCreativeRequestEvent(str, bVar2.mo32422d());
        nativeAd.loadAdFromBid(bVar2.mo32424f());
    }

    private void handleBidResponseSuccess(C13230b bVar, String str, C2143b bVar2, C2158a aVar) {
        double g = bVar.mo32425g();
        getTag();
        StringBuilder sb = new StringBuilder("price-->");
        sb.append(g);
        sb.append(", oldAd price-->");
        sb.append(getMaxPrice(str));
        sendBidResponseEvent(str, null, bVar.mo32422d());
        if (g < getMaxPrice(str)) {
            if (aVar != null) {
                aVar.mo7839a(bVar2.f7284a, "bidding_failed");
            }
            notifyBidResult(bVar, false, str);
        } else if (g < bVar2.f7289f) {
            if (aVar != null) {
                aVar.mo7839a(bVar2.f7284a, "local_threshold_fail");
            }
            notifyBidResult(bVar, false, str);
        } else {
            loadAd(str, bVar2, bVar, aVar);
        }
    }

    public void loadAdAsync(final String str, final C2143b bVar, C2159a aVar, final C2158a aVar2) {
        if (!C2114c.m9318c()) {
            if (aVar2 != null) {
                aVar2.mo7839a(bVar.f7284a, "GDPR FORBIDDEN");
            }
            return;
        }
        C13202a aVar3 = new C13202a(this.mContext, this.mAdConfig.f7280e, bVar.f7284a, FBAdBidFormat.NATIVE);
        if (C2114c.m9317b() && !C6319n.m19593a(this.mAdConfig.f7282g) && this.mAdConfig.f7282g.equals("1")) {
            aVar3.mo32397a(true);
            getTag();
            new StringBuilder("use debug mode,tesKey:").append(this.mAdConfig.f7282g);
        }
        getTag();
        StringBuilder sb = new StringBuilder("request placementType ");
        sb.append(str);
        sb.append(",use real pid:");
        sb.append(bVar.f7284a);
        sendBidRequestEvent(str);
        aVar3.mo32399a((C13203a) new C13203a() {
            /* renamed from: a */
            public final void mo7903a(final C13230b bVar) {
                FbHbAdProvider.this.runOnAdThread(new Runnable() {
                    public final void run() {
                        FbHbAdProvider.this.handleBidResponse(bVar, str, bVar, aVar2);
                    }
                });
            }
        });
    }
}
