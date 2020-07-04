package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.favorites.viewholder.ChallengeCollectViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.CollectChallengeAdapter */
public class CollectChallengeAdapter extends BaseAdapter<Challenge> {

    /* renamed from: a */
    private Activity f73078a;

    public CollectChallengeAdapter(Activity activity) {
        this.f73078a = activity;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new ChallengeCollectViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ts, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((ChallengeCollectViewHolder) vVar).mo71301a((Challenge) mo62312a().get(i), this.f73078a);
    }
}
