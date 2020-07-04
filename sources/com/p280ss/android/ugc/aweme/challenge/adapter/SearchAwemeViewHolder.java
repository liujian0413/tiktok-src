package com.p280ss.android.ugc.aweme.challenge.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.challenge.model.Segment;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23659b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.SearchAwemeViewHolder */
public class SearchAwemeViewHolder extends C1293v {

    /* renamed from: a */
    public SearchChallenge f62399a;
    TextView mDescView;
    TextView mJoinCountView;
    TextView mTitleView;
    int margin;

    public SearchAwemeViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (SearchAwemeViewHolder.this.f62399a != null) {
                    if (SearchAwemeViewHolder.this.f62399a.challenge != null) {
                        C6907h.onEvent(MobClick.obtain().setEventName("challenge_add").setLabelName("publish").setValue(SearchAwemeViewHolder.this.f62399a.challenge.getCid()).setJsonObject(C6869c.m21381a().mo16887a("search_keyword", SearchAwemeViewHolder.this.mTitleView.getText().toString()).mo16888b()));
                    }
                    if (SearchAwemeViewHolder.this.f62399a.isFake) {
                        C42961az.m136380a(new C23659b(1, SearchAwemeViewHolder.this.f62399a.challenge));
                    } else if (SearchAwemeViewHolder.this.f62399a.challenge != null) {
                        C42961az.m136380a(new C23659b(SearchAwemeViewHolder.this.f62399a.challenge));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo61584a(SearchChallenge searchChallenge) {
        if (searchChallenge != null) {
            this.f62399a = searchChallenge;
            Challenge challenge = this.f62399a.challenge;
            if (challenge != null) {
                if (!this.f62399a.isFake || TextUtils.isEmpty(challenge.getChallengeName())) {
                    if (challenge != null && !TextUtils.isEmpty(challenge.getChallengeName())) {
                        SpannableString spannableString = new SpannableString(challenge.getChallengeName());
                        if (this.f62399a.segments != null) {
                            for (Segment segment : this.f62399a.segments) {
                                if (segment != null) {
                                    spannableString = m77593a(spannableString, segment.begin, segment.end + 1);
                                }
                            }
                        }
                        this.mTitleView.setText(spannableString);
                    }
                    if (TextUtils.isEmpty(challenge.getDesc())) {
                        this.mTitleView.setPadding(0, 0, 0, this.margin);
                        this.mDescView.setVisibility(8);
                    } else {
                        this.mTitleView.setPadding(0, 0, 0, 0);
                        this.mDescView.setVisibility(0);
                        this.mDescView.setText(challenge.getDesc());
                    }
                    this.mJoinCountView.setText(this.itemView.getResources().getString(R.string.bwz, new Object[]{C30537o.m99738a((long) challenge.getUserCount())}));
                } else {
                    SpannableString spannableString2 = new SpannableString(challenge.getChallengeName());
                    this.mTitleView.setText(m77593a(spannableString2, 0, spannableString2.length()));
                    this.mDescView.setText(R.string.b_8);
                    this.mJoinCountView.setText(R.string.bbv);
                }
            }
        }
    }

    /* renamed from: a */
    private SpannableString m77593a(SpannableString spannableString, int i, int i2) {
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i2 || max >= spannableString.length() || i2 > spannableString.length()) {
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(this.itemView.getResources().getColor(R.color.a71)), max, i2, 17);
        return spannableString;
    }
}
