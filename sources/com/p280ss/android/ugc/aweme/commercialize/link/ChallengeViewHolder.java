package com.p280ss.android.ugc.aweme.commercialize.link;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailActivity;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailActivity.C23709a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.ChallengeViewHolder */
public final class ChallengeViewHolder extends C1293v {

    /* renamed from: a */
    public Challenge f65233a;

    /* renamed from: b */
    public int f65234b;

    /* renamed from: c */
    public final C24794k f65235c;

    public ChallengeViewHolder(final View view, C24794k kVar) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(kVar, "challengeCallback");
        super(view);
        this.f65235c = kVar;
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ ChallengeViewHolder f65236a;

            {
                this.f65236a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                Challenge challenge = this.f65236a.f65233a;
                if (challenge != null) {
                    C23709a aVar = ChallengeDetailActivity.f62498b;
                    Context context = view.getContext();
                    C7573i.m23582a((Object) context, "itemView.context");
                    String cid = challenge.getCid();
                    C7573i.m23582a((Object) cid, "it.cid");
                    aVar.mo61686a(context, cid, "general_search", 0, false);
                    this.f65236a.f65235c.mo64824a(this.f65236a.f65234b);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo64770a(int i, Challenge challenge) {
        C7573i.m23587b(challenge, "challenge");
        this.f65234b = i;
        this.f65233a = challenge;
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.u6);
        C7573i.m23582a((Object) dmtTextView, "itemView.challengeName");
        StringBuilder sb = new StringBuilder("#");
        sb.append(challenge.getChallengeName());
        dmtTextView.setText(sb.toString());
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        DmtTextView dmtTextView2 = (DmtTextView) view2.findViewById(R.id.ec9);
        C7573i.m23582a((Object) dmtTextView2, "itemView.viewCount");
        View view3 = this.itemView;
        C7573i.m23582a((Object) view3, "itemView");
        dmtTextView2.setText(view3.getContext().getString(R.string.zb, new Object[]{C30537o.m99738a(challenge.getViewCount())}));
        View view4 = this.itemView;
        C7573i.m23582a((Object) view4, "itemView");
        C23323e.m76514a((RemoteImageView) view4.findViewById(R.id.ck4), challenge.getChallengeProfileUrl());
        this.f65235c.mo64825b(i);
    }
}
