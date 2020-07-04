package com.p280ss.android.ugc.aweme.poi.p335ui.p1473a;

import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.agilelogger.utils.C19199d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.C35086h.C35087a;
import com.p280ss.android.ugc.aweme.poi.adapter.C35012a;
import com.p280ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.p280ss.android.ugc.aweme.poi.bean.C35069a;
import com.p280ss.android.ugc.aweme.poi.bean.C35073e;
import com.p280ss.android.ugc.aweme.poi.bean.PoiAwemePosition;
import com.p280ss.android.ugc.aweme.poi.bean.PoiBannerItem;
import com.p280ss.android.ugc.aweme.poi.bean.PoiRecommendPoiFeed;
import com.p280ss.android.ugc.aweme.poi.experiment.PoiQuestionPosExperiment;
import com.p280ss.android.ugc.aweme.poi.model.AdCard;
import com.p280ss.android.ugc.aweme.poi.model.C35110f;
import com.p280ss.android.ugc.aweme.poi.model.C35118h;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiQRDetailStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiQuestion;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35386j;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35386j.C35388a;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35390l;
import com.p280ss.android.ugc.aweme.poi.p335ui.PoiContentActivity;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35456o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a.b */
public final class C35272b extends C35390l implements C6310a, C35012a, C35277g, C35280j, C35285n {

    /* renamed from: A */
    protected C6309f f92465A;

    /* renamed from: B */
    private C35276f f92466B;

    /* renamed from: C */
    private C35283l f92467C;

    /* renamed from: D */
    private C35279i f92468D;

    /* renamed from: E */
    private List<C34145b> f92469E;

    /* renamed from: F */
    private C35284m f92470F;

    /* renamed from: G */
    private C35110f f92471G;

    /* renamed from: H */
    private boolean f92472H;

    /* renamed from: I */
    private boolean f92473I;

    /* renamed from: J */
    private boolean f92474J = true;

    /* renamed from: K */
    private PoiDetail f92475K;

    /* renamed from: L */
    private long f92476L;

    /* renamed from: M */
    private long f92477M;

    /* renamed from: N */
    private boolean f92478N;

    /* renamed from: O */
    private boolean f92479O;

    /* renamed from: w */
    protected View f92480w;

    /* renamed from: x */
    boolean f92481x;

    /* renamed from: y */
    boolean f92482y;

    /* renamed from: z */
    boolean f92483z;

    /* renamed from: l */
    public final C35012a mo89817l() {
        return this;
    }

    /* renamed from: a */
    public final void mo89812a(C35388a aVar, View view, C35386j jVar, C21743a aVar2) {
        super.mo89812a(aVar, view, jVar, aVar2);
        m113888s();
        m113889t();
        boolean z = false;
        this.f92481x = false;
        this.f92482y = false;
        if (this.f92481x || this.f92482y) {
            z = true;
        }
        this.f92483z = z;
        this.f92465A = new C6309f(this);
    }

    /* renamed from: a */
    public final void mo75152a(List<C34145b> list, boolean z) {
        if (isViewValid()) {
            this.f92836o = true;
            this.f92474J = z;
            if (!m113891v()) {
                if (this.f92469E == null) {
                    this.f92469E = new ArrayList();
                }
                if (list != null) {
                    this.f92469E.addAll(list);
                }
                return;
            }
            this.f92465A.removeMessages(TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN);
            if (this.f77427f != null) {
                List a = ((PoiAwemeFeedAdapter) this.f77427f).mo62312a();
                m113886a(a, list);
                ((C35271a) this.f92835n).mo89804a(a);
                ((PoiAwemeFeedAdapter) this.f77427f).mo58045a(((C35271a) this.f92835n).mo66539h().getItems());
                if (this.f92465A != null) {
                    this.f92465A.post(new C35273c(this, z));
                    return;
                }
                mo75162b(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo89813a(boolean z, String str, String str2, boolean z2) {
        if (this.f92465A != null) {
            this.f92480w.setVisibility(0);
            this.f92465A.sendEmptyMessageDelayed(TextExtraStruct.TYPE_CUSTOM, 500);
        } else {
            this.f77424c.mo25942f();
        }
        this.f92476L = System.currentTimeMillis();
        if (this.f92835n != null) {
            this.f92835n.mo56976a(Integer.valueOf(1), new C35087a().mo88937a(this.f92834m.getPoiId()).mo88945d(this.f92834m.getAwemeId()).mo88940b(3).mo88939a());
        }
        if (this.f92467C != null) {
            this.f92467C.mo56976a(new C35087a().mo88937a(this.f92834m.getPoiId()).mo88942b(str).mo88944c(str2).mo88935a(z ? 1 : 0).mo88945d(this.f92834m.getAwemeId()).mo88939a());
        }
        if (z2) {
            m113887r();
        }
        if (this.f92466B != null) {
            this.f92466B.mo56976a(new C35087a().mo88937a(this.f92834m.getPoiId()).mo88938a(this.f92841t.mo89732e()).mo88946e(this.f92841t.mo89733f()).mo88939a());
        }
        if (this.f92468D != null) {
            String d = TextUtils.isEmpty(C28290d.m93037a()) ? C28290d.m93043d() : C28290d.m93037a();
            long j = 0;
            try {
                if (!TextUtils.isEmpty(d)) {
                    j = Long.parseLong(d);
                }
            } catch (Exception unused) {
            }
            this.f92468D.mo56976a(new C35087a().mo88937a(this.f92834m.getPoiId()).mo88936a(j).mo88939a());
            return;
        }
        this.f92473I = true;
    }

    /* renamed from: a */
    public final void mo88780a(String str, String str2, boolean z, int i) {
        PoiAwemePosition poiAwemePosition = new PoiAwemePosition(2, 0);
        if (z) {
            C35454m.m114523a(this.f92834m, "click_poi_page_more_video", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("poi_id", this.f92834m.getPoiId()).mo59973a("enter_method", "click_video_more").mo59973a("poi_channel", this.f92834m.getPoiChannel()));
            PoiContentActivity.m113788a(getContext(), this.f92834m.getPoiId(), null, poiAwemePosition, str);
        }
    }

    /* renamed from: e */
    public final void mo75167e() {
        this.f92479O = true;
        m113890u();
    }

    /* renamed from: v */
    private boolean m113891v() {
        if (!this.f92473I || !this.f92472H) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final void mo89818o() {
        ((C35271a) this.f92835n).mo89803a((PoiQRDetailStruct) null);
    }

    /* renamed from: q */
    public final void mo89819q() {
        this.f92473I = true;
        this.f92477M = System.currentTimeMillis() - this.f92476L;
        m113892w();
    }

    /* renamed from: r */
    private void m113887r() {
        if (this.f92466B == null) {
            this.f92466B = new C35276f();
            this.f92466B.mo66537a(this);
            this.f92466B.mo66536a(new C35275e());
        }
    }

    /* renamed from: u */
    private void m113890u() {
        if (this.f92478N && this.f92479O) {
            ((PoiAwemeFeedAdapter) this.f77427f).ag_();
            bd_();
        }
    }

    public final void bw_() {
        if (this.f92465A != null) {
            this.f92465A.removeMessages(TextExtraStruct.TYPE_CUSTOM);
        }
        this.f77424c.mo25944h();
        C35456o.m114535a();
    }

    /* renamed from: s */
    private void m113888s() {
        if (this.f92467C == null) {
            this.f92467C = new C35283l();
            this.f92467C.mo66537a(this);
            this.f92467C.mo66536a(new C35281k(this.f92841t.mo89735i()));
        }
    }

    /* renamed from: t */
    private void m113889t() {
        if (!C30538p.m99745a() && this.f92468D == null) {
            this.f92468D = new C35279i();
            this.f92468D.mo66537a(this);
            this.f92468D.mo66536a(new C35278h());
        }
    }

    /* renamed from: x */
    private void m113893x() {
        mo75162b(this.f92474J);
        if (((C35271a) this.f92835n).f92463p) {
            ((PoiAwemeFeedAdapter) this.f77427f).mo66507h();
            return;
        }
        if (this.f92474J) {
            ((PoiAwemeFeedAdapter) this.f77427f).ag_();
        }
    }

    /* renamed from: w */
    private void m113892w() {
        if (isViewValid() && m113891v()) {
            if (this.f92465A != null) {
                this.f92480w.setVisibility(8);
                this.f92465A.removeMessages(TextExtraStruct.TYPE_CUSTOM);
                this.f92465A.sendEmptyMessageDelayed(TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN, 300);
            }
            List<C34145b> list = this.f92470F.f92496a;
            this.f92475K = (PoiDetail) list.get(0);
            this.f92841t.mo89727a(this.f92475K);
            this.f92841t.mo89745r();
            mo90111a(this.f92475K);
            if (this.f92471G != null && this.f92471G.mo89366a() > 0) {
                this.f92475K.setActs(new PoiBannerItem(this.f92471G.f91836a).setPoiId(this.f92475K.getPoiId()));
            }
            this.f77424c.mo25939d();
            if (this.f77427f != null) {
                if (this.f92469E != null) {
                    m113886a(list, this.f92469E);
                    this.f92469E.clear();
                }
                ((C35271a) this.f92835n).mo89804a(list);
                ((PoiAwemeFeedAdapter) this.f77427f).mo58045a(((C35271a) this.f92835n).mo89807w());
            }
            if (this.f92465A == null || this.f92469E != null) {
                mo75162b(this.f92474J);
                if (((C35271a) this.f92835n).f92463p) {
                    ((PoiAwemeFeedAdapter) this.f77427f).mo66507h();
                }
            }
            C35456o.m114537a(this.f92475K, Math.max(this.f92475K.getDuration(), this.f92477M));
            this.f92478N = true;
            m113890u();
        }
    }

    public final void bd_() {
        if (isViewValid() && this.f92835n != null && this.f92835n.mo66539h() != null) {
            if (((C35118h) this.f92835n.mo66539h()).isDataEmpty()) {
                if (((C35271a) this.f92835n).f92463p) {
                    this.f92835n.mo56976a(Integer.valueOf(1), new C35087a().mo88937a(this.f92834m.getPoiId()).mo88945d(this.f92834m.getAwemeId()).mo88940b(3).mo88939a());
                }
            } else if (((C35118h) this.f92835n.mo66539h()).isHasMore()) {
                this.f92835n.mo56976a(Integer.valueOf(4), new C35087a().mo88937a(this.f92834m.getPoiId()).mo88945d(this.f92834m.getAwemeId()).mo88940b(3).mo88939a());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo89815d(boolean z) {
        mo75162b(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo89816e(boolean z) {
        mo75162b(z);
    }

    /* renamed from: a */
    public final void mo89809a(PoiQRDetailStruct poiQRDetailStruct) {
        ((C35271a) this.f92835n).mo89803a(poiQRDetailStruct);
    }

    /* renamed from: a */
    public final void mo75134a(View view) {
        super.mo75134a(view);
        this.f92480w = view.findViewById(R.id.dao);
    }

    /* renamed from: a */
    public final void mo75133a(int i) {
        if (isViewValid()) {
            switch (i) {
                case 1:
                    if (this.f77427f != null) {
                        ((PoiAwemeFeedAdapter) this.f77427f).mo66507h();
                        return;
                    }
                    break;
                case 2:
                    if (this.f77427f != null && this.f92836o) {
                        ((PoiAwemeFeedAdapter) this.f77427f).ag_();
                        return;
                    }
                case 3:
                    if (this.f77427f != null) {
                        ((PoiAwemeFeedAdapter) this.f77427f).ah_();
                        break;
                    }
                    break;
            }
        }
    }

    public final void handleMsg(Message message) {
        switch (message.what) {
            case TextExtraStruct.TYPE_CUSTOM /*65281*/:
                this.f77424c.mo25942f();
                this.f92480w.setVisibility(8);
                return;
            case TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN /*65282*/:
                if (!this.f92836o) {
                    m113893x();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo89810a(C35110f fVar) {
        this.f92473I = true;
        this.f92471G = fVar;
        this.f92477M = System.currentTimeMillis() - this.f92476L;
        m113892w();
    }

    /* renamed from: a */
    public final void mo89811a(C35284m mVar) {
        if (mVar == null || C6307b.m19566a((Collection<T>) mVar.f92496a) || !(mVar.f92496a.get(0) instanceof PoiDetail)) {
            if (this.f92465A != null) {
                this.f92465A.removeMessages(TextExtraStruct.TYPE_CUSTOM);
            }
            this.f77424c.mo25944h();
            return;
        }
        this.f92470F = mVar;
        this.f92472H = true;
        m113892w();
    }

    /* renamed from: a */
    private static void m113885a(PoiDetail poiDetail, List<C34145b> list) {
        PoiQuestion question = poiDetail.getQuestion();
        long questionCount = poiDetail.getQuestionCount();
        if (questionCount >= 0) {
            if (questionCount <= 0 || question != null) {
                list.add(new C35069a(question, questionCount));
            }
        }
    }

    /* renamed from: b */
    public final void mo75161b(List<C34145b> list, boolean z) {
        if (isViewValid()) {
            if (this.f77427f != null) {
                ((PoiAwemeFeedAdapter) this.f77427f).mo61577b(list);
            }
            if (this.f92465A != null) {
                this.f92465A.post(new C35274d(this, z));
            } else {
                mo75162b(z);
            }
        }
    }

    /* renamed from: a */
    private static C35073e m113884a(PoiDetail poiDetail, boolean z) {
        if (poiDetail.getPoiActivityInfo() == null || poiDetail.getPoiActivityInfo().getAdCard() == null) {
            return null;
        }
        AdCard adCard = poiDetail.getPoiActivityInfo().getAdCard();
        if (C6307b.m19566a((Collection<T>) adCard.getRawDatas())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<AwemeRawAd> awemeRawAds = poiDetail.getAwemeRawAds();
        if (C19199d.m62924a(awemeRawAds)) {
            return null;
        }
        for (AwemeRawAd awemeRawAd : awemeRawAds) {
            if (awemeRawAd.isNewStyleAd()) {
                arrayList.add(awemeRawAd);
            }
        }
        if (C6307b.m19566a((Collection<T>) arrayList)) {
            return null;
        }
        C35073e eVar = new C35073e(arrayList, adCard.getTitle(), z);
        eVar.f91732a = arrayList;
        return eVar;
    }

    /* renamed from: a */
    private void m113886a(List<C34145b> list, List<C34145b> list2) {
        boolean z;
        List<C34145b> list3 = list;
        boolean z2 = false;
        if (!C6307b.m19566a((Collection<T>) list2)) {
            ArrayList arrayList = new ArrayList();
            boolean isCertificated = this.f92475K.isCertificated();
            int a = C6384b.m19835a().mo15287a(PoiQuestionPosExperiment.class, true, "poi_question_answering_position", C6384b.m19835a().mo15295d().poi_question_answering_position, 0);
            boolean z3 = false;
            int i = 0;
            boolean z4 = false;
            int i2 = 0;
            z = false;
            for (C34145b bVar : list2) {
                if (C21740a.m72694j(bVar.getAweme())) {
                    if (this.f92483z) {
                        if (isCertificated) {
                            if (i == 10) {
                                PoiRecommendPoiFeed a2 = m113883a(this.f92475K, PoiRecommendPoiFeed.Companion.getTYPE_NEARBY(), arrayList);
                                if (a2 != null) {
                                    a2.setHideTopDivider(z2);
                                    i2 = i + 1;
                                }
                                PoiRecommendPoiFeed a3 = m113883a(this.f92475K, PoiRecommendPoiFeed.Companion.getTYPE_EXPLORE(), arrayList);
                                if (!(a3 == null || i2 == i + 1)) {
                                    a3.setHideTopDivider(z2);
                                }
                                z3 = true;
                            }
                        } else if ((i == 1 && this.f92481x) || (i == 2 && this.f92482y)) {
                            PoiRecommendPoiFeed a4 = m113883a(this.f92475K, PoiRecommendPoiFeed.Companion.getTYPE_NEARBY(), arrayList);
                            if (a4 != null) {
                                a4.setHideTopDivider(z2);
                            }
                            z3 = true;
                        } else if ((i == 3 && this.f92481x) || (i == 6 && this.f92482y)) {
                            PoiRecommendPoiFeed a5 = m113883a(this.f92475K, PoiRecommendPoiFeed.Companion.getTYPE_EXPLORE(), arrayList);
                            if (a5 != null) {
                                a5.setHideTopDivider(z2);
                            }
                        }
                        z4 = true;
                    }
                    boolean z5 = !C6399b.m19944t();
                    if (this.f92475K.isQuestionShow() && z5 && i == a) {
                        m113885a(this.f92475K, (List<C34145b>) arrayList);
                    }
                    arrayList.add(bVar);
                    if (!z && i == 2) {
                        C35073e a6 = m113884a(this.f92475K, true);
                        if (a6 != null) {
                            arrayList.add(a6);
                            z = true;
                        }
                    }
                    i++;
                }
                z2 = false;
            }
            list3.addAll(arrayList);
            if (this.f92483z) {
                if (!z3) {
                    PoiRecommendPoiFeed a7 = m113883a(this.f92475K, PoiRecommendPoiFeed.Companion.getTYPE_NEARBY(), list3);
                    if (a7 != null) {
                        a7.setHideTopDivider(false);
                        i2 = i + 1;
                    }
                }
                if (!z4) {
                    PoiRecommendPoiFeed a8 = m113883a(this.f92475K, PoiRecommendPoiFeed.Companion.getTYPE_EXPLORE(), list3);
                    if (!(a8 == null || i2 == i + 1)) {
                        a8.setHideTopDivider(false);
                    }
                }
            }
            z2 = true;
        } else {
            z = false;
        }
        if (this.f92483z && !z2) {
            m113883a(this.f92475K, PoiRecommendPoiFeed.Companion.getTYPE_NEARBY(), list3);
            m113883a(this.f92475K, PoiRecommendPoiFeed.Companion.getTYPE_EXPLORE(), list3);
        }
        if (!z) {
            C35073e a9 = m113884a(this.f92475K, z2);
            if (a9 != null) {
                list3.add(a9);
            }
        }
    }

    /* renamed from: a */
    private static PoiRecommendPoiFeed m113883a(PoiDetail poiDetail, int i, List<C34145b> list) {
        PoiRecommendPoiFeed poiRecommendPoiFeed;
        if (i == PoiRecommendPoiFeed.Companion.getTYPE_NEARBY()) {
            if (poiDetail.hasRecomemndNearbyPoi()) {
                poiRecommendPoiFeed = new PoiRecommendPoiFeed(Integer.valueOf(PoiRecommendPoiFeed.Companion.getTYPE_NEARBY()), poiDetail.recommendPoiNearby);
                list.add(poiRecommendPoiFeed);
                if (poiRecommendPoiFeed != null && poiRecommendPoiFeed.hasMore()) {
                    poiRecommendPoiFeed.addNullItem();
                }
                return poiRecommendPoiFeed;
            }
        } else if (i == PoiRecommendPoiFeed.Companion.getTYPE_EXPLORE()) {
            if (poiDetail.hasRecomemndExplorePoi()) {
                poiRecommendPoiFeed = new PoiRecommendPoiFeed(Integer.valueOf(PoiRecommendPoiFeed.Companion.getTYPE_EXPLORE()), poiDetail.recommendPoiExplore);
                list.add(poiRecommendPoiFeed);
                poiRecommendPoiFeed.addNullItem();
                return poiRecommendPoiFeed;
            }
        } else if (i == PoiRecommendPoiFeed.Companion.getTYPE_HOTEL()) {
            if (poiDetail.hasRecomemndHotelPoi()) {
                poiRecommendPoiFeed = new PoiRecommendPoiFeed(Integer.valueOf(PoiRecommendPoiFeed.Companion.getTYPE_HOTEL()), poiDetail.recommendPoiHotel);
                list.add(poiRecommendPoiFeed);
                poiRecommendPoiFeed.addNullItem();
                return poiRecommendPoiFeed;
            }
        } else if (i == PoiRecommendPoiFeed.Companion.getTYPE_SCENE()) {
            if (poiDetail.hasRecomemndScenePoi()) {
                poiRecommendPoiFeed = new PoiRecommendPoiFeed(Integer.valueOf(PoiRecommendPoiFeed.Companion.getTYPE_SCENE()), poiDetail.recommendPoiScene);
                list.add(poiRecommendPoiFeed);
                poiRecommendPoiFeed.addNullItem();
                return poiRecommendPoiFeed;
            }
        } else if (i == PoiRecommendPoiFeed.Companion.getTYPE_FOOD() && poiDetail.hasRecomemndFoodPoi()) {
            poiRecommendPoiFeed = new PoiRecommendPoiFeed(Integer.valueOf(PoiRecommendPoiFeed.Companion.getTYPE_FOOD()), poiDetail.recommendPoiFood);
            list.add(poiRecommendPoiFeed);
            poiRecommendPoiFeed.addNullItem();
            return poiRecommendPoiFeed;
        }
        poiRecommendPoiFeed = null;
        poiRecommendPoiFeed.addNullItem();
        return poiRecommendPoiFeed;
    }
}
