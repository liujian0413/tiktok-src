package com.p280ss.android.ugc.aweme.challenge.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23659b;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.ChallengeViewHolder */
public class ChallengeViewHolder extends C1293v {

    /* renamed from: a */
    public Challenge f62382a;
    TextView mDescView;
    TextView mJoinCountView;
    TextView mTitleView;
    int margin;

    public ChallengeViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ChallengeViewHolder.this.f62382a != null) {
                    C42961az.m136380a(new C23659b(ChallengeViewHolder.this.f62382a));
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo61575a(Challenge challenge) {
        if (challenge != null) {
            this.f62382a = challenge;
            this.mTitleView.setText(this.f62382a.getChallengeName());
            if (TextUtils.isEmpty(this.f62382a.getDesc())) {
                this.mTitleView.setPadding(0, 0, 0, this.margin);
                this.mDescView.setVisibility(8);
            } else {
                this.mTitleView.setPadding(0, 0, 0, 0);
                this.mDescView.setVisibility(0);
                this.mDescView.setText(this.f62382a.getDesc());
            }
            this.mJoinCountView.setText(this.itemView.getResources().getString(R.string.bwy, new Object[]{C30537o.m99738a((long) this.f62382a.getUserCount())}));
        }
    }
}
