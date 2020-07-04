package com.p280ss.android.ugc.aweme.music.adapter;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.ChallengeTitleViewHolder_ViewBinding */
public class ChallengeTitleViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChallengeTitleViewHolder f87970a;

    public void unbind() {
        ChallengeTitleViewHolder challengeTitleViewHolder = this.f87970a;
        if (challengeTitleViewHolder != null) {
            this.f87970a = null;
            challengeTitleViewHolder.title = null;
            challengeTitleViewHolder.rootLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChallengeTitleViewHolder_ViewBinding(ChallengeTitleViewHolder challengeTitleViewHolder, View view) {
        this.f87970a = challengeTitleViewHolder;
        challengeTitleViewHolder.title = (TextView) Utils.findRequiredViewAsType(view, R.id.un, "field 'title'", TextView.class);
        challengeTitleViewHolder.rootLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.uo, "field 'rootLayout'", LinearLayout.class);
    }
}
