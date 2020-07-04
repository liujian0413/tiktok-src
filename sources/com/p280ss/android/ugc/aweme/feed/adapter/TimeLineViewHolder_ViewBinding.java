package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.TimeLineViewHolder_ViewBinding */
public class TimeLineViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TimeLineViewHolder f74084a;

    public void unbind() {
        TimeLineViewHolder timeLineViewHolder = this.f74084a;
        if (timeLineViewHolder != null) {
            this.f74084a = null;
            timeLineViewHolder.mDescribeView = null;
            timeLineViewHolder.mAvHeadView = null;
            timeLineViewHolder.mTvLocation = null;
            timeLineViewHolder.txtDistance = null;
            timeLineViewHolder.mTvName = null;
            timeLineViewHolder.tagLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TimeLineViewHolder_ViewBinding(TimeLineViewHolder timeLineViewHolder, View view) {
        this.f74084a = timeLineViewHolder;
        timeLineViewHolder.mDescribeView = (TextView) Utils.findRequiredViewAsType(view, R.id.c1f, "field 'mDescribeView'", TextView.class);
        timeLineViewHolder.mAvHeadView = (SmartAvatarImageView) Utils.findRequiredViewAsType(view, R.id.ic, "field 'mAvHeadView'", SmartAvatarImageView.class);
        timeLineViewHolder.mTvLocation = (TextView) Utils.findRequiredViewAsType(view, R.id.buj, "field 'mTvLocation'", TextView.class);
        timeLineViewHolder.txtDistance = (TextView) Utils.findRequiredViewAsType(view, R.id.e6k, "field 'txtDistance'", TextView.class);
        timeLineViewHolder.mTvName = (TextView) Utils.findRequiredViewAsType(view, R.id.b45, "field 'mTvName'", TextView.class);
        timeLineViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.dg3, "field 'tagLayout'", TagLayout.class);
    }
}
