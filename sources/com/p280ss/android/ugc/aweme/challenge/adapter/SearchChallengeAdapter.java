package com.p280ss.android.ugc.aweme.challenge.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.SearchChallengeAdapter */
public class SearchChallengeAdapter extends BaseAdapter<SearchChallenge> {
    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((SearchAwemeViewHolder) vVar).mo61584a((SearchChallenge) this.f67539l.get(i));
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new SearchAwemeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sr, viewGroup, false));
    }
}
