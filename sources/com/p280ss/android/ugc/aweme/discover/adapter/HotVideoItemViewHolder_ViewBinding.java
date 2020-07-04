package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotVideoItemViewHolder_ViewBinding */
public class HotVideoItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HotVideoItemViewHolder f69526a;

    public void unbind() {
        HotVideoItemViewHolder hotVideoItemViewHolder = this.f69526a;
        if (hotVideoItemViewHolder != null) {
            this.f69526a = null;
            hotVideoItemViewHolder.mCover = null;
            hotVideoItemViewHolder.mText = null;
            hotVideoItemViewHolder.mRank = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotVideoItemViewHolder_ViewBinding(HotVideoItemViewHolder hotVideoItemViewHolder, View view) {
        this.f69526a = hotVideoItemViewHolder;
        hotVideoItemViewHolder.mCover = (AnimatedImageView) Utils.findRequiredViewAsType(view, R.id.b_c, "field 'mCover'", AnimatedImageView.class);
        hotVideoItemViewHolder.mText = (TextView) Utils.findRequiredViewAsType(view, R.id.dzp, "field 'mText'", TextView.class);
        hotVideoItemViewHolder.mRank = (TextView) Utils.findRequiredViewAsType(view, R.id.e09, "field 'mRank'", TextView.class);
    }
}
