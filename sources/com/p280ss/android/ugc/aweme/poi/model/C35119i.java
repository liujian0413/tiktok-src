package com.p280ss.android.ugc.aweme.poi.model;

import android.os.Handler;
import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34146c;
import com.p280ss.android.ugc.aweme.poi.bean.C35071c;
import com.p280ss.android.ugc.aweme.poi.bean.C35073e;
import com.p280ss.android.ugc.aweme.poi.bean.PoiBannerItem;
import com.p280ss.android.ugc.aweme.poi.bean.PoiCategoryTitle;
import com.p280ss.android.ugc.aweme.poi.bean.PoiDcdProductItem;
import com.p280ss.android.ugc.aweme.poi.utils.C35456o;
import com.p280ss.android.ugc.aweme.poi.utils.C35456o.C35459a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.i */
public final class C35119i implements C1591g<List<Object>, Void> {

    /* renamed from: a */
    Handler f91869a;

    /* renamed from: b */
    int f91870b = TextExtraStruct.TYPE_CUSTOM;

    /* renamed from: c */
    int f91871c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void then(C1592h<List<Object>> hVar) {
        C35071c cVar;
        if (this.f91869a == null) {
            return null;
        }
        Message obtainMessage = this.f91869a.obtainMessage(this.f91870b);
        if (!hVar.mo6887c()) {
            if (hVar.mo6889d()) {
                obtainMessage.obj = hVar.mo6891f();
                C35456o.m114535a();
            } else {
                obtainMessage.obj = null;
                List list = (List) hVar.mo6890e();
                if (list != null && list.size() == 4) {
                    PoiDetail poiDetail = null;
                    PoiQRDetailStruct poiQRDetailStruct = null;
                    C35110f fVar = null;
                    C35106c cVar2 = null;
                    for (Object next : list) {
                        if (next instanceof PoiDetail) {
                            poiDetail = (PoiDetail) next;
                        } else if (next instanceof C35106c) {
                            cVar2 = (C35106c) next;
                        } else if (next instanceof PoiQRDetailStruct) {
                            poiQRDetailStruct = (PoiQRDetailStruct) next;
                        } else if (next instanceof C35110f) {
                            fVar = (C35110f) next;
                        }
                    }
                    if (poiDetail == null || C6319n.m19593a(poiDetail.getPoiId())) {
                        obtainMessage.obj = null;
                        C35456o.m114535a();
                        this.f91869a.sendMessage(obtainMessage);
                        return null;
                    } else if (poiDetail != null) {
                        C34146c cVar3 = new C34146c();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        boolean isDestination = poiDetail.isDestination();
                        poiDetail.isCertificated();
                        poiDetail.setPoiActivityResponse(poiQRDetailStruct);
                        poiDetail.setFeedType(this.f91871c);
                        boolean z = false;
                        arrayList.add(0, poiDetail);
                        if (poiDetail.hasValidProduct()) {
                            arrayList.add(new PoiDcdProductItem(poiDetail.productInfo, poiDetail.getPoiId()));
                        }
                        if (isDestination || C6307b.m19566a((Collection<T>) poiDetail.getRecommendPhoto())) {
                            cVar = null;
                        } else {
                            cVar = new C35071c(poiDetail.getPoiType());
                            cVar.f91726d = poiDetail.getRecommendTitle();
                            cVar.f91724b = poiDetail.getRecommendPhoto();
                            cVar.f91728f = poiDetail.getPoiId();
                        }
                        boolean z2 = true;
                        if (!isDestination && poiDetail.isUseNewDetailStyle()) {
                            if (cVar != null) {
                                cVar.f91727e = false;
                                arrayList.add(cVar);
                            }
                            if (fVar != null && fVar.mo89366a() > 0) {
                                poiDetail.setActs(new PoiBannerItem(fVar.f91836a).setPoiId(poiDetail.getPoiId()));
                            }
                            List list2 = poiDetail.get3rdCommentList();
                            if (!C6307b.m19566a((Collection<T>) list2)) {
                                list2.size();
                                arrayList.add(new PoiCategoryTitle(false, true));
                                PoiComment poiComment = (PoiComment) list2.get(0);
                                poiComment.setCommentId("1");
                                poiComment.setHasDivider(true);
                                arrayList.add(poiComment);
                            }
                        } else if (cVar != null) {
                            arrayList.add(cVar);
                        }
                        C35459a aVar = new C35459a();
                        aVar.f92969b = poiDetail.getDuration();
                        aVar.f92970c = poiDetail.getRequestId();
                        aVar.f92968a = "poi_detail";
                        arrayList2.add(aVar);
                        if (fVar != null && fVar.mo89366a() > 0) {
                            poiDetail.setActs(new PoiBannerItem(fVar.f91836a).setPoiId(poiDetail.getPoiId()));
                        }
                        if (cVar2 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            cVar3.f88982d = cVar2.f91791b;
                            cVar3.f88980b = (long) cVar2.f91792c;
                            cVar3.f88981c = (long) cVar2.f91792c;
                            if (!C6307b.m19566a((Collection<T>) cVar2.f91790a)) {
                                int i = 0;
                                for (Aweme aweme : cVar2.f91790a) {
                                    if (C21740a.m72694j(aweme)) {
                                        FollowFeed followFeed = new FollowFeed(aweme);
                                        followFeed.setRequestId(cVar2.getRequestId());
                                        arrayList3.add(followFeed);
                                        if (!z && i == 2) {
                                            C35073e a = m113326a(poiDetail, true);
                                            if (a != null) {
                                                arrayList3.add(a);
                                                z = true;
                                            }
                                        }
                                        i++;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else {
                                z2 = false;
                            }
                            C35459a aVar2 = new C35459a();
                            aVar2.f92969b = cVar2.f91794e;
                            aVar2.f92970c = cVar2.getRequestId();
                            aVar2.f92968a = "poi_aweme";
                            arrayList2.add(aVar2);
                        } else {
                            z2 = false;
                        }
                        if (!z) {
                            C35073e a2 = m113326a(poiDetail, z2);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        poiDetail.parseAdRawData();
                        C35456o.m114539a((List<C35459a>) arrayList2);
                        cVar3.f88979a = arrayList;
                        obtainMessage.obj = cVar3;
                    } else {
                        obtainMessage.obj = null;
                        C35456o.m114535a();
                    }
                }
            }
            this.f91869a.sendMessage(obtainMessage);
            return null;
        }
        obtainMessage.obj = null;
        C35456o.m114535a();
        this.f91869a.sendMessage(obtainMessage);
        return null;
    }

    /* renamed from: a */
    private static C35073e m113326a(PoiDetail poiDetail, boolean z) {
        if (poiDetail.getPoiActivityInfo() == null || poiDetail.getPoiActivityInfo().getAdCard() == null) {
            return null;
        }
        AdCard adCard = poiDetail.getPoiActivityInfo().getAdCard();
        if (C6307b.m19566a((Collection<T>) adCard.getRawDatas())) {
            return null;
        }
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
        if (C6307b.m19566a((Collection<T>) arrayList)) {
            return null;
        }
        C35073e eVar = new C35073e(arrayList, adCard.getTitle(), z);
        eVar.f91732a = arrayList;
        return eVar;
    }

    public C35119i(Handler handler, int i, int i2) {
        this.f91869a = handler;
        this.f91871c = i2;
    }
}
