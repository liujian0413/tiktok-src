package com.p280ss.android.ugc.aweme.commercialize.link;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.ChallengeViewAdapter */
public final class ChallengeViewAdapter extends C1262a<ChallengeViewHolder> {

    /* renamed from: a */
    public List<? extends Challenge> f65231a;

    /* renamed from: b */
    private final C24794k f65232b;

    public final int getItemCount() {
        return this.f65231a.size();
    }

    /* renamed from: a */
    public final void mo64769a(List<? extends Challenge> list) {
        C7573i.m23587b(list, "list");
        this.f65231a = list;
        notifyDataSetChanged();
    }

    public ChallengeViewAdapter(List<? extends Challenge> list, C24794k kVar) {
        C7573i.m23587b(list, "list");
        C7573i.m23587b(kVar, "challengeCallback");
        this.f65231a = list;
        this.f65232b = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ChallengeViewHolder challengeViewHolder, int i) {
        C7573i.m23587b(challengeViewHolder, "holder");
        challengeViewHolder.mo64770a(i, (Challenge) this.f65231a.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ChallengeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a_k, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        return new ChallengeViewHolder(inflate, this.f65232b);
    }
}
