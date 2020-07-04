package com.p280ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.familiar.p965a.C21712c;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e;
import com.p280ss.android.ugc.aweme.poi.nearby.p1464b.C35132b;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.s */
public final class C26168s {
    /* renamed from: a */
    public static C26134am m86028a(FeedParam feedParam, C25673a aVar, JediViewModel jediViewModel) {
        String from = feedParam.getFrom();
        if (!TextUtils.isEmpty(from)) {
            char c = 65535;
            switch (from.hashCode()) {
                case -2084096361:
                    if (from.equals("from_profile_self")) {
                        c = 6;
                        break;
                    }
                    break;
                case -2011014904:
                    if (from.equals("poi_leaderboard")) {
                        c = 13;
                        break;
                    }
                    break;
                case -1799782064:
                    if (from.equals("from_music")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1718955055:
                    if (from.equals("from_time_line")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1696805560:
                    if (from.equals("from_follow_page")) {
                        c = 20;
                        break;
                    }
                    break;
                case -1244326859:
                    if (from.equals("from_poi")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1157522096:
                    if (from.equals("from_familiar_tab")) {
                        c = 24;
                        break;
                    }
                    break;
                case -738947461:
                    if (from.equals("from_commerce_banner")) {
                        c = 23;
                        break;
                    }
                    break;
                case -401059353:
                    if (from.equals("poi_map")) {
                        c = 1;
                        break;
                    }
                    break;
                case -262584970:
                    if (from.equals("from_commerce_bill_share")) {
                        c = 19;
                        break;
                    }
                    break;
                case -185728731:
                    if (from.equals("from_profile_other")) {
                        c = 5;
                        break;
                    }
                    break;
                case 53372288:
                    if (from.equals("from_commerce_seed")) {
                        c = 18;
                        break;
                    }
                    break;
                case 54656180:
                    if (from.equals("from_nearby")) {
                        c = 10;
                        break;
                    }
                    break;
                case 80178893:
                    if (from.equals("from_chat")) {
                        c = 21;
                        break;
                    }
                    break;
                case 333392226:
                    if (from.equals("from_poi_spu_rate_aweme_rn")) {
                        c = 2;
                        break;
                    }
                    break;
                case 451899419:
                    if (from.equals("poi_grid")) {
                        c = 15;
                        break;
                    }
                    break;
                case 452211125:
                    if (from.equals("poi_rate")) {
                        c = 17;
                        break;
                    }
                    break;
                case 503071540:
                    if (from.equals("from_music_children_mode")) {
                        c = 7;
                        break;
                    }
                    break;
                case 829313944:
                    if (from.equals("poi_street")) {
                        c = 14;
                        break;
                    }
                    break;
                case 890576754:
                    if (from.equals("from_challenge_children_mode")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1217392887:
                    if (from.equals("from_window_following")) {
                        c = 9;
                        break;
                    }
                    break;
                case 1237096694:
                    if (from.equals("poi_multi_colums")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1671103942:
                    if (from.equals("from_no_request")) {
                        c = 22;
                        break;
                    }
                    break;
                case 1803864987:
                    if (from.equals("from_poi_detail")) {
                        c = 12;
                        break;
                    }
                    break;
                case 1967980776:
                    if (from.equals("poi_rate_list")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return ((IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class)).newDetailPageOperator(aVar);
                case 1:
                    return ((IPoiService) ServiceManager.get().getService(IPoiService.class)).newDetailPoiNearbyHotAwemeOperator(aVar);
                case 2:
                    return ((IPoiService) ServiceManager.get().getService(IPoiService.class)).newDetailPoiSpuRateAwemeOperator(feedParam.getSpuId(), feedParam.getPageSize(), feedParam.getPoiId(), aVar);
                case 3:
                    return ((IPoiService) ServiceManager.get().getService(IPoiService.class)).newDetailPoiRateOperator(aVar);
                case 4:
                    return new C26124ag(aVar);
                case 5:
                case 6:
                    return C36102u.f94392a.newDetailPageOperator(aVar, TextUtils.equals(from, "from_profile_self"), feedParam.getUid());
                case 7:
                    return new C26165p(feedParam.getIds());
                case 8:
                    return new C26143c(feedParam.getIds());
                case 9:
                    return new C26126ai(aVar);
                case 10:
                    return new C26167r(aVar);
                case 11:
                    return ((IPoiService) ServiceManager.get().getService(IPoiService.class)).newDetailPoiOperator(aVar);
                case 12:
                    return ((IPoiService) ServiceManager.get().getService(IPoiService.class)).newDetailPoiFeedOperator(aVar);
                case 13:
                    return ((IPoiService) ServiceManager.get().getService(IPoiService.class)).newDetailPoiRankListOperator(aVar);
                case 14:
                    return new C35132b(aVar);
                case 15:
                case 16:
                    return ((IPoiService) ServiceManager.get().getService(IPoiService.class)).newDetailPoiGridFeedOperator(aVar);
                case 17:
                    return ((IPoiService) ServiceManager.get().getService(IPoiService.class)).newDetailPoiRateFeedOperator(aVar);
                case 18:
                    return C24436a.m80356a().newCommercePreviewOperator(aVar, feedParam);
                case 19:
                    return C24436a.m80356a().newCommerceBillShareOperator(aVar, feedParam);
                case 20:
                    return new C26150j(aVar);
                case 21:
                    C32009e c2 = C28503s.m93685c();
                    C28503s.m93684b(c2);
                    if (c2 != null) {
                        return new C26128ak(c2);
                    }
                    return new C26145e();
                case 22:
                    return new C26139ap(aVar);
                case 23:
                    return new C26147g();
                case 24:
                    return new C26149i((C21712c) aVar);
                default:
                    C26134am a = BusinessComponentServiceUtils.getDetailPageOperatorProvider().mo67700a(from, feedParam, aVar, jediViewModel);
                    if (a != null) {
                        return a;
                    }
                    break;
            }
        }
        if (!TextUtils.isEmpty(feedParam.getIds()) || !TextUtils.isEmpty(feedParam.getPushParams())) {
            return new C26142b(feedParam.getIds());
        }
        return new C26147g();
    }
}
