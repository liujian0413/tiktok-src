package com.p280ss.android.ugc.aweme.movie.view;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.adapter.DetailAwemeViewHolder;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p280ss.android.ugc.aweme.setting.C7213d;

/* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailAwemeViewHolder */
public class MovieDetailAwemeViewHolder extends DetailAwemeViewHolder {
    public MovieDetailAwemeViewHolder(View view, String str, C23685d dVar) {
        super(view, str, dVar);
    }

    /* renamed from: a */
    public final void mo61579a(Aweme aweme, int i, boolean z) {
        super.mo61579a(aweme, i, z);
        if (C7213d.m22500a().mo18803bo().isMovieLikeShow()) {
            mo61578a(aweme);
        }
        if (!C6399b.m19944t() || !aweme.isPgcShow()) {
            if (aweme.getOriginAuthor() != null) {
                this.f62394e.setVisibility(0);
                if (!TextUtils.isEmpty(aweme.getLabelOriginAuthorText())) {
                    this.f62394e.setText(aweme.getLabelOriginAuthorText());
                }
                this.f62392c.setVisibility(4);
            } else if (aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null && TextUtils.equals(this.f62391b, "challenge") && aweme.getIsTop() == 1) {
                if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                    this.f62393d.setVisibility(8);
                    this.f62392c.setVisibility(0);
                    C23323e.m76506a(this.f62392c, aweme.getLabelTop(), (int) C9738o.m28708b(this.f62390a, 6.0f), (int) C9738o.m28708b(this.f62390a, 6.0f));
                } else {
                    this.f62393d.setVisibility(0);
                    this.f62392c.setVisibility(8);
                    m77588a(this.f62393d, (AwemeTextLabelModel) aweme.getTextTopLabels().get(0));
                }
            }
        } else if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
            this.f62393d.setVisibility(0);
            this.f62392c.setVisibility(8);
            m77588a(this.f62393d, (AwemeTextLabelModel) aweme.getTextTopLabels().get(0));
        }
    }
}
