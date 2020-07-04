package com.p280ss.android.ugc.aweme.favorites.viewholder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.ChallengeCollectViewHolder_ViewBinding */
public class ChallengeCollectViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChallengeCollectViewHolder f73336a;

    /* renamed from: b */
    private View f73337b;

    public void unbind() {
        ChallengeCollectViewHolder challengeCollectViewHolder = this.f73336a;
        if (challengeCollectViewHolder != null) {
            this.f73336a = null;
            challengeCollectViewHolder.mNameView = null;
            challengeCollectViewHolder.mCoverView = null;
            challengeCollectViewHolder.mRightView = null;
            challengeCollectViewHolder.mTopView = null;
            challengeCollectViewHolder.challengeItemll = null;
            challengeCollectViewHolder.txtUserCount = null;
            this.f73337b.setOnClickListener(null);
            this.f73337b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChallengeCollectViewHolder_ViewBinding(final ChallengeCollectViewHolder challengeCollectViewHolder, View view) {
        this.f73336a = challengeCollectViewHolder;
        challengeCollectViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, R.id.uj, "field 'mNameView'", TextView.class);
        challengeCollectViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.czm, "field 'mCoverView'", RemoteImageView.class);
        challengeCollectViewHolder.mRightView = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.cuu, "field 'mRightView'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.bss, "field 'mTopView' and method 'onClick'");
        challengeCollectViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView, R.id.bss, "field 'mTopView'", LinearLayout.class);
        this.f73337b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                challengeCollectViewHolder.onClick(view);
            }
        });
        challengeCollectViewHolder.challengeItemll = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.uh, "field 'challengeItemll'", LinearLayout.class);
        challengeCollectViewHolder.txtUserCount = (TextView) Utils.findRequiredViewAsType(view, R.id.e4f, "field 'txtUserCount'", TextView.class);
    }
}
