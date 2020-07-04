package com.p280ss.android.ugc.aweme.shortvideo.p1588r;

import com.google.common.base.C17427g;
import com.p280ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.p280ss.android.ugc.aweme.common.LogPbBean;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r.f */
public final class C40253f implements C17427g<SearchChallengeList, AVSearchChallengeList> {
    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m128607a((SearchChallengeList) obj);
    }

    /* renamed from: a */
    public static AVSearchChallengeList m128607a(SearchChallengeList searchChallengeList) {
        if (searchChallengeList == null) {
            return null;
        }
        AVSearchChallengeList aVSearchChallengeList = new AVSearchChallengeList();
        aVSearchChallengeList.items = C40254g.m128610a(searchChallengeList.items);
        aVSearchChallengeList.cursor = searchChallengeList.cursor;
        aVSearchChallengeList.hasMore = searchChallengeList.hasMore;
        aVSearchChallengeList.isMatch = searchChallengeList.isMatch;
        aVSearchChallengeList.isDisabled = searchChallengeList.isDisabled;
        aVSearchChallengeList.keyword = searchChallengeList.keyword;
        if (searchChallengeList.logPb != null) {
            aVSearchChallengeList.logPb = new LogPbBean();
            aVSearchChallengeList.logPb.setImprId(searchChallengeList.logPb.getImprId());
        }
        return aVSearchChallengeList;
    }
}
