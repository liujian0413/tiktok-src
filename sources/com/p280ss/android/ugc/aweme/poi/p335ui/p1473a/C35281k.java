package com.p280ss.android.ugc.aweme.poi.p335ui.p1473a;

import android.os.Handler;
import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.model.C34146c;
import com.p280ss.android.ugc.aweme.poi.C35086h;
import com.p280ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p280ss.android.ugc.aweme.poi.bean.C35071c;
import com.p280ss.android.ugc.aweme.poi.bean.PoiDcdProductItem;
import com.p280ss.android.ugc.aweme.poi.model.AdCard;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.utils.C35456o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a.k */
public final class C35281k extends C25640a<C35284m> {

    /* renamed from: a */
    static final PoiFeedApi f92490a = ((PoiFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiFeedApi.class));

    /* renamed from: b */
    private int f92491b;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.a.k$a */
    static class C35282a implements C1591g<Object, Void> {

        /* renamed from: a */
        Handler f92492a;

        /* renamed from: b */
        int f92493b = 0;

        /* renamed from: c */
        int f92494c;

        /* renamed from: d */
        long f92495d;

        /* renamed from: a */
        private static void m113920a(PoiDetail poiDetail) {
            if (poiDetail.getPoiActivityInfo() != null && poiDetail.getPoiActivityInfo().getAdCard() != null) {
                AdCard adCard = poiDetail.getPoiActivityInfo().getAdCard();
                if (!C6307b.m19566a((Collection<T>) adCard.getRawDatas())) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : adCard.getRawDatas()) {
                        AwemeRawAd awemeRawAd = AdCard.getAwemeRawAd(str);
                        if (awemeRawAd != null) {
                            if (awemeRawAd.isNewStyleAd()) {
                                arrayList.add(awemeRawAd);
                            } else {
                                adCard.setRawData(str);
                            }
                        }
                    }
                    poiDetail.parseAdRawData();
                    if (!C6307b.m19566a((Collection<T>) arrayList)) {
                        poiDetail.setAwemeRawAds(arrayList);
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Object> hVar) {
            C35071c cVar;
            if (this.f92492a == null) {
                return null;
            }
            Message obtainMessage = this.f92492a.obtainMessage(this.f92493b);
            if (!hVar.mo6887c() && !hVar.mo6889d()) {
                obtainMessage.obj = null;
                Object e = hVar.mo6890e();
                if (e != null && (e instanceof PoiDetail)) {
                    PoiDetail poiDetail = (PoiDetail) e;
                    if (poiDetail == null || C6319n.m19593a(poiDetail.getPoiId())) {
                        obtainMessage.obj = null;
                        C35456o.m114535a();
                        this.f92492a.sendMessage(obtainMessage);
                        return null;
                    }
                    if (poiDetail != null) {
                        C34146c cVar2 = new C34146c();
                        ArrayList arrayList = new ArrayList();
                        new ArrayList();
                        poiDetail.setFeedType(this.f92494c);
                        arrayList.add(0, poiDetail);
                        if (poiDetail.hasValidProduct()) {
                            arrayList.add(new PoiDcdProductItem(poiDetail.productInfo, poiDetail.getPoiId()));
                        }
                        if (!C6307b.m19566a((Collection<T>) poiDetail.getRecommendPhoto())) {
                            cVar = new C35071c(poiDetail.getPoiType());
                            cVar.f91726d = poiDetail.getRecommendTitle();
                            cVar.f91724b = poiDetail.getRecommendPhoto();
                            cVar.f91728f = poiDetail.getPoiId();
                        } else {
                            cVar = null;
                        }
                        if (poiDetail.isUseNewDetailStyle()) {
                            if (cVar != null) {
                                cVar.f91727e = false;
                                arrayList.add(cVar);
                            }
                        } else if (cVar != null) {
                            arrayList.add(cVar);
                        }
                        if (this.f92495d > 0) {
                            poiDetail.setDuration(System.currentTimeMillis() - this.f92495d);
                        }
                        m113920a(poiDetail);
                        cVar2.f88979a = arrayList;
                        obtainMessage.obj = new C35284m(cVar2.f88979a);
                    } else {
                        obtainMessage.obj = null;
                        C35456o.m114535a();
                    }
                    this.f92492a.sendMessage(obtainMessage);
                    return null;
                }
            }
            obtainMessage.obj = null;
            C35456o.m114535a();
            this.f92492a.sendMessage(obtainMessage);
            return null;
        }

        C35282a(Handler handler, int i, int i2, long j) {
            this.f92492a = handler;
            this.f92494c = i2;
            this.f92495d = j;
        }
    }

    /* renamed from: a */
    private int m113918a() {
        switch (this.f92491b) {
            case 65440:
                return 1;
            case 65441:
                return 2;
            default:
                return 0;
        }
    }

    public C35281k(int i) {
        this.f92491b = i;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        int i;
        C35086h hVar = objArr[0];
        String str = hVar.f91750a;
        String str2 = hVar.f91753d;
        String str3 = hVar.f91754e;
        int i2 = hVar.f91755f;
        String str4 = hVar.f91752c;
        Aweme rawAdAwemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(str4);
        long currentTimeMillis = System.currentTimeMillis();
        PoiFeedApi poiFeedApi = f92490a;
        String str5 = "all";
        int a = m113918a();
        if (rawAdAwemeById == null || !rawAdAwemeById.isAd()) {
            i = 0;
        } else {
            i = 1;
        }
        C1592h poiDetail = poiFeedApi.getPoiDetail(str, str2, str3, str5, a, i2, i, str4);
        C35282a aVar = new C35282a(this.mHandler, 0, this.f92491b, currentTimeMillis);
        poiDetail.mo6876a((C1591g<TResult, TContinuationResult>) aVar, (Executor) C1592h.f5957a);
        return true;
    }
}
