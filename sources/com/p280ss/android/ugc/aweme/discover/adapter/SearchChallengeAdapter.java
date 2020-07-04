package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.discover.abtest.HashTagSearchMultiInfoStyleExperiment;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengeAdapter */
public class SearchChallengeAdapter extends SearchBaseAdapter<SearchChallenge> {
    public SearchChallengeAdapter(C26501r rVar, String str) {
        super(rVar, str);
    }

    /* renamed from: b */
    public final void mo61148b(C1293v vVar, int i) {
        ((SearchChallengeViewHolder) vVar).mo68029a((SearchChallenge) this.f67539l.get(i), this.f69666f);
    }

    /* renamed from: b */
    public final C1293v mo61146b(ViewGroup viewGroup, int i) {
        SearchChallengeViewHolder searchChallengeViewHolder;
        if (C6384b.m19835a().mo15287a(HashTagSearchMultiInfoStyleExperiment.class, true, "hashtag_search_multi_info_style", C6384b.m19835a().mo15295d().hashtag_search_multi_info_style, 0) == 0) {
            searchChallengeViewHolder = SearchChallengeViewHolder.m86973a(viewGroup, this.f69666f, null, "chanllenge_tab");
        } else {
            searchChallengeViewHolder = SearchChallengenNewViewHolder.m86985b(viewGroup, this.f69666f, null, "chanllenge_tab");
        }
        searchChallengeViewHolder.f69672g = "search_result";
        return searchChallengeViewHolder;
    }
}
