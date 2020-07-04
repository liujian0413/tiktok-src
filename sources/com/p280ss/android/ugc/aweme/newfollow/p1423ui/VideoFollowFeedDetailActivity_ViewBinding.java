package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity_ViewBinding */
public class VideoFollowFeedDetailActivity_ViewBinding extends AbsFollowFeedDetailActivity_ViewBinding {

    /* renamed from: a */
    private VideoFollowFeedDetailActivity f89078a;

    public void unbind() {
        VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = this.f89078a;
        if (videoFollowFeedDetailActivity != null) {
            this.f89078a = null;
            videoFollowFeedDetailActivity.mIvMusicIcon = null;
            videoFollowFeedDetailActivity.mTvMusicOriginal = null;
            videoFollowFeedDetailActivity.mMusicTitleLayout = null;
            videoFollowFeedDetailActivity.mMusicTitleView = null;
            videoFollowFeedDetailActivity.mMusicLayout = null;
            videoFollowFeedDetailActivity.mLoadingView = null;
            videoFollowFeedDetailActivity.mIvPlay = null;
            videoFollowFeedDetailActivity.mIvPause = null;
            videoFollowFeedDetailActivity.mPlayStatusLayout = null;
            videoFollowFeedDetailActivity.mInteractStickers = null;
            videoFollowFeedDetailActivity.mAdDownloadButton = null;
            videoFollowFeedDetailActivity.mAdDownloadButtonPercent = null;
            videoFollowFeedDetailActivity.mAdDownloadButtonSize = null;
            videoFollowFeedDetailActivity.mAdDownloadButtonDetail = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VideoFollowFeedDetailActivity_ViewBinding(VideoFollowFeedDetailActivity videoFollowFeedDetailActivity, View view) {
        super(videoFollowFeedDetailActivity, view);
        this.f89078a = videoFollowFeedDetailActivity;
        videoFollowFeedDetailActivity.mIvMusicIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.c1e, "field 'mIvMusicIcon'", ImageView.class);
        videoFollowFeedDetailActivity.mTvMusicOriginal = (TextView) Utils.findRequiredViewAsType(view, R.id.c1l, "field 'mTvMusicOriginal'", TextView.class);
        videoFollowFeedDetailActivity.mMusicTitleLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.bih, "field 'mMusicTitleLayout'", ViewGroup.class);
        videoFollowFeedDetailActivity.mMusicTitleView = (MarqueeView) Utils.findRequiredViewAsType(view, R.id.c24, "field 'mMusicTitleView'", MarqueeView.class);
        videoFollowFeedDetailActivity.mMusicLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.big, "field 'mMusicLayout'", ViewGroup.class);
        videoFollowFeedDetailActivity.mLoadingView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b_w, "field 'mLoadingView'", ImageView.class);
        videoFollowFeedDetailActivity.mIvPlay = (ImageView) Utils.findRequiredViewAsType(view, R.id.bb4, "field 'mIvPlay'", ImageView.class);
        videoFollowFeedDetailActivity.mIvPause = (ImageView) Utils.findRequiredViewAsType(view, R.id.bau, "field 'mIvPause'", ImageView.class);
        videoFollowFeedDetailActivity.mPlayStatusLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.bj1, "field 'mPlayStatusLayout'", ViewGroup.class);
        videoFollowFeedDetailActivity.mInteractStickers = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.b2b, "field 'mInteractStickers'", ViewGroup.class);
        videoFollowFeedDetailActivity.mAdDownloadButton = (ViewGroup) Utils.findOptionalViewAsType(view, R.id.br, "field 'mAdDownloadButton'", ViewGroup.class);
        videoFollowFeedDetailActivity.mAdDownloadButtonPercent = (TextView) Utils.findOptionalViewAsType(view, R.id.btx, "field 'mAdDownloadButtonPercent'", TextView.class);
        videoFollowFeedDetailActivity.mAdDownloadButtonSize = (TextView) Utils.findOptionalViewAsType(view, R.id.btz, "field 'mAdDownloadButtonSize'", TextView.class);
        videoFollowFeedDetailActivity.mAdDownloadButtonDetail = (ImageView) Utils.findOptionalViewAsType(view, R.id.aap, "field 'mAdDownloadButtonDetail'", ImageView.class);
    }
}
