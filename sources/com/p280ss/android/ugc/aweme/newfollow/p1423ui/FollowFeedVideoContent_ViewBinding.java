package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPlayerProgressbar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FollowFeedVideoContent_ViewBinding */
public class FollowFeedVideoContent_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FollowFeedVideoContent f89041a;

    public void unbind() {
        FollowFeedVideoContent followFeedVideoContent = this.f89041a;
        if (followFeedVideoContent != null) {
            this.f89041a = null;
            followFeedVideoContent.mContainer = null;
            followFeedVideoContent.mCover = null;
            followFeedVideoContent.mProgressbar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowFeedVideoContent_ViewBinding(FollowFeedVideoContent followFeedVideoContent, View view) {
        this.f89041a = followFeedVideoContent;
        followFeedVideoContent.mContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ebz, "field 'mContainer'", ViewGroup.class);
        followFeedVideoContent.mCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b7x, "field 'mCover'", RemoteImageView.class);
        followFeedVideoContent.mProgressbar = (VideoPlayerProgressbar) Utils.findRequiredViewAsType(view, R.id.eb_, "field 'mProgressbar'", VideoPlayerProgressbar.class);
    }
}
