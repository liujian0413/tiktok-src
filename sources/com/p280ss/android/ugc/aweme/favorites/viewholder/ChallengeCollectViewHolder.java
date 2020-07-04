package com.p280ss.android.ugc.aweme.favorites.viewholder;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a.C27753a;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27754b;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.ChallengeCollectViewHolder */
public class ChallengeCollectViewHolder extends C1293v implements OnClickListener, C27753a {

    /* renamed from: a */
    private Challenge f73334a;

    /* renamed from: b */
    private Activity f73335b;
    LinearLayout challengeItemll;
    RemoteImageView mCoverView;
    TextView mNameView;
    RelativeLayout mRightView;
    LinearLayout mTopView;
    TextView txtUserCount;

    /* renamed from: a */
    public final void mo71237a() {
        if (this.f73334a != null) {
            C27752a.m90968a(1, this.f73334a.getCid());
        }
    }

    public ChallengeCollectViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.bss) {
            C27754b.m90993a(this.f73335b, this.f73334a, "collection_tag", "");
        }
    }

    /* renamed from: a */
    public final void mo71301a(Challenge challenge, Activity activity) {
        int i;
        if (challenge != null) {
            this.f73335b = activity;
            this.f73334a = challenge;
            if (challenge.getCoverItem() != null) {
                C23323e.m76524b(this.mCoverView, challenge.getCoverItem());
            } else {
                C23323e.m76503a(this.mCoverView, (int) R.drawable.b71);
            }
            this.mNameView.setText(this.f73334a.getChallengeName());
            if (challenge.getViewCount() >= 0) {
                i = R.string.zb;
            } else {
                i = R.string.bwz;
            }
            this.txtUserCount.setText(this.itemView.getResources().getString(i, new Object[]{C30537o.m99738a(challenge.getDisplayCount())}));
            mo71237a();
        }
    }
}
