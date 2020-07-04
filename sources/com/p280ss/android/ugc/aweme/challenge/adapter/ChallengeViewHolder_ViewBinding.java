package com.p280ss.android.ugc.aweme.challenge.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.ChallengeViewHolder_ViewBinding */
public class ChallengeViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChallengeViewHolder f62384a;

    public void unbind() {
        ChallengeViewHolder challengeViewHolder = this.f62384a;
        if (challengeViewHolder != null) {
            this.f62384a = null;
            challengeViewHolder.mTitleView = null;
            challengeViewHolder.mDescView = null;
            challengeViewHolder.mJoinCountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChallengeViewHolder_ViewBinding(ChallengeViewHolder challengeViewHolder, View view) {
        this.f62384a = challengeViewHolder;
        challengeViewHolder.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        challengeViewHolder.mDescView = (TextView) Utils.findRequiredViewAsType(view, R.id.a7e, "field 'mDescView'", TextView.class);
        challengeViewHolder.mJoinCountView = (TextView) Utils.findRequiredViewAsType(view, R.id.bf8, "field 'mJoinCountView'", TextView.class);
        challengeViewHolder.margin = view.getContext().getResources().getDimensionPixelSize(R.dimen.cx);
    }
}
