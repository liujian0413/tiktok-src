package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarBorderView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedAvatarView_ViewBinding */
public class FeedAvatarView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedAvatarView f75662a;

    /* renamed from: b */
    private View f75663b;

    /* renamed from: c */
    private View f75664c;

    /* renamed from: d */
    private View f75665d;

    public void unbind() {
        FeedAvatarView feedAvatarView = this.f75662a;
        if (feedAvatarView != null) {
            this.f75662a = null;
            feedAvatarView.mAvatarView = null;
            feedAvatarView.mAvatarLoadingView = null;
            feedAvatarView.mAvatarLiveView = null;
            feedAvatarView.mAvatarBorderView = null;
            feedAvatarView.mAvatarDeco = null;
            feedAvatarView.mFollowContainerView = null;
            feedAvatarView.ivFakeUserLink = null;
            feedAvatarView.mFollowView = null;
            feedAvatarView.mAvatarDecoration = null;
            this.f75663b.setOnClickListener(null);
            this.f75663b = null;
            this.f75664c.setOnClickListener(null);
            this.f75664c = null;
            this.f75665d.setOnClickListener(null);
            this.f75665d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedAvatarView_ViewBinding(final FeedAvatarView feedAvatarView, View view) {
        this.f75662a = feedAvatarView;
        View findRequiredView = Utils.findRequiredView(view, R.id.e8m, "field 'mAvatarView' and method 'onClick'");
        feedAvatarView.mAvatarView = (SmartAvatarBorderView) Utils.castView(findRequiredView, R.id.e8m, "field 'mAvatarView'", SmartAvatarBorderView.class);
        this.f75663b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                feedAvatarView.onClick(view);
            }
        });
        feedAvatarView.mAvatarLoadingView = (AnimationImageView) Utils.findRequiredViewAsType(view, R.id.j6, "field 'mAvatarLoadingView'", AnimationImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e8s, "field 'mAvatarLiveView' and method 'onClick'");
        feedAvatarView.mAvatarLiveView = (AvatarImageWithLive) Utils.castView(findRequiredView2, R.id.e8s, "field 'mAvatarLiveView'", AvatarImageWithLive.class);
        this.f75664c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                feedAvatarView.onClick(view);
            }
        });
        feedAvatarView.mAvatarBorderView = (LiveCircleView) Utils.findRequiredViewAsType(view, R.id.e8o, "field 'mAvatarBorderView'", LiveCircleView.class);
        feedAvatarView.mAvatarDeco = (RemoteImageView) Utils.findOptionalViewAsType(view, R.id.in, "field 'mAvatarDeco'", RemoteImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.anm, "field 'mFollowContainerView' and method 'onClick'");
        feedAvatarView.mFollowContainerView = (RelativeLayout) Utils.castView(findRequiredView3, R.id.anm, "field 'mFollowContainerView'", RelativeLayout.class);
        this.f75665d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                feedAvatarView.onClick(view);
            }
        });
        feedAvatarView.ivFakeUserLink = (ImageView) Utils.findRequiredViewAsType(view, R.id.b95, "field 'ivFakeUserLink'", ImageView.class);
        feedAvatarView.mFollowView = (AnimationImageView) Utils.findRequiredViewAsType(view, R.id.anj, "field 'mFollowView'", AnimationImageView.class);
        feedAvatarView.mAvatarDecoration = (ImageView) Utils.findRequiredViewAsType(view, R.id.b99, "field 'mAvatarDecoration'", ImageView.class);
        feedAvatarView.avatarSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.h2);
    }
}
