package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.discover.abtest.HashTagSearchMultiInfoStyleExperiment;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchChallengenNewViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27022aw.C27024a;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ax */
public final class C27025ax extends C27022aw<List<SearchChallenge>> {

    /* renamed from: h */
    private final boolean f71316h;

    /* renamed from: a */
    public final void mo69744a(List<SearchChallenge> list, SearchResultParam searchResultParam, boolean z) {
        SearchChallengeViewHolder searchChallengeViewHolder;
        super.mo69744a(list, searchResultParam, z);
        this.f71313f.removeAllViews();
        for (SearchChallenge searchChallenge : list) {
            if (C6384b.m19835a().mo15287a(HashTagSearchMultiInfoStyleExperiment.class, true, "hashtag_search_multi_info_style", C6384b.m19835a().mo15295d().hashtag_search_multi_info_style, 0) != 0 || this.f71316h) {
                searchChallengeViewHolder = SearchChallengenNewViewHolder.m86985b(this.f71313f, searchResultParam.getKeyword(), null, "challenge");
            } else {
                searchChallengeViewHolder = SearchChallengeViewHolder.m86973a(this.f71313f, searchResultParam.getKeyword(), null, "challenge");
            }
            searchChallengeViewHolder.f69672g = "general_search";
            searchChallengeViewHolder.mo68029a(searchChallenge, searchResultParam.getKeyword());
            searchChallengeViewHolder.mo67896a(new C26501r(true));
            this.f71313f.addView(searchChallengeViewHolder.itemView);
        }
    }

    public C27025ax(View view, Context context, boolean z, C27024a aVar) {
        int i;
        super(view, context, aVar);
        this.f71316h = z;
        DmtTextView dmtTextView = this.f71310c;
        if (C6399b.m19947w()) {
            i = R.string.z3;
        } else {
            i = R.string.yl;
        }
        dmtTextView.setText(i);
        if (!C6399b.m19944t() && !z) {
            this.f71311d.setText(R.string.ht);
        }
    }
}
