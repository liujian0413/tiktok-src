package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderOld_ViewBinding */
public class FeedLiveViewHolderOld_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedLiveViewHolderOld f73982a;

    public void unbind() {
        FeedLiveViewHolderOld feedLiveViewHolderOld = this.f73982a;
        if (feedLiveViewHolderOld != null) {
            this.f73982a = null;
            feedLiveViewHolderOld.mLiveStub = null;
            feedLiveViewHolderOld.mCoverView = null;
            feedLiveViewHolderOld.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedLiveViewHolderOld_ViewBinding(FeedLiveViewHolderOld feedLiveViewHolderOld, View view) {
        this.f73982a = feedLiveViewHolderOld;
        feedLiveViewHolderOld.mLiveStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.c0v, "field 'mLiveStub'", ViewStub.class);
        feedLiveViewHolderOld.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.a4g, "field 'mCoverView'", RemoteImageView.class);
        feedLiveViewHolderOld.mRootView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.edc, "field 'mRootView'", FrameLayout.class);
    }
}
