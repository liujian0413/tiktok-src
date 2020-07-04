package com.p280ss.android.ugc.aweme.music.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.ChallengeTitleViewHolder */
public class ChallengeTitleViewHolder extends C1293v {

    /* renamed from: a */
    private Context f87969a;
    LinearLayout rootLayout;
    TextView title;

    public ChallengeTitleViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f87969a = view.getContext();
    }

    /* renamed from: a */
    private void m108724a(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.itemView.getLayoutParams();
        if (z) {
            layoutParams.height = -2;
            layoutParams.width = -1;
            this.itemView.setVisibility(0);
        } else {
            this.itemView.setVisibility(8);
            layoutParams.height = 0;
            layoutParams.width = 0;
        }
        this.itemView.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo86125a(Challenge challenge) {
        if (challenge == null || challenge.getConnectMusics() == null || challenge.getConnectMusics().isEmpty()) {
            m108724a(false);
            this.rootLayout.setVisibility(8);
            this.itemView.setVisibility(8);
            return;
        }
        m108724a(true);
        this.rootLayout.setVisibility(0);
        this.title.setText(challenge.getChallengeName());
    }
}
