package com.p280ss.android.ugc.aweme.challenge.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.ChallengeAdapter */
public class ChallengeAdapter extends BaseAdapter<Challenge> {
    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((ChallengeViewHolder) vVar).mo61575a((Challenge) this.f67539l.get(i));
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new ChallengeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sr, viewGroup, false));
    }
}
