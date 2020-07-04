package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder_ViewBinding */
public class SearchChallengeViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchChallengeViewHolder f69684a;

    public void unbind() {
        SearchChallengeViewHolder searchChallengeViewHolder = this.f69684a;
        if (searchChallengeViewHolder != null) {
            this.f69684a = null;
            searchChallengeViewHolder.mTvChallengeName = null;
            searchChallengeViewHolder.mTvPartCnt = null;
            searchChallengeViewHolder.cardViewStub = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchChallengeViewHolder_ViewBinding(SearchChallengeViewHolder searchChallengeViewHolder, View view) {
        this.f69684a = searchChallengeViewHolder;
        searchChallengeViewHolder.mTvChallengeName = (TextView) Utils.findRequiredViewAsType(view, R.id.drb, "field 'mTvChallengeName'", TextView.class);
        searchChallengeViewHolder.mTvPartCnt = (TextView) Utils.findRequiredViewAsType(view, R.id.dz5, "field 'mTvPartCnt'", TextView.class);
        searchChallengeViewHolder.cardViewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.d0i, "field 'cardViewStub'", ViewStub.class);
    }
}
