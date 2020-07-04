package com.p280ss.android.ugc.aweme.share.gif.p1537ui;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity_ViewBinding */
public class VideoShare2GifPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VideoShare2GifPreviewActivity f99098a;

    /* renamed from: b */
    private View f99099b;

    public void unbind() {
        VideoShare2GifPreviewActivity videoShare2GifPreviewActivity = this.f99098a;
        if (videoShare2GifPreviewActivity != null) {
            this.f99098a = null;
            videoShare2GifPreviewActivity.gifImageView = null;
            videoShare2GifPreviewActivity.llShareContainer = null;
            videoShare2GifPreviewActivity.tvShareTitle = null;
            this.f99099b.setOnClickListener(null);
            this.f99099b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VideoShare2GifPreviewActivity_ViewBinding(final VideoShare2GifPreviewActivity videoShare2GifPreviewActivity, View view) {
        this.f99098a = videoShare2GifPreviewActivity;
        videoShare2GifPreviewActivity.gifImageView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b9j, "field 'gifImageView'", RemoteImageView.class);
        videoShare2GifPreviewActivity.llShareContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bse, "field 'llShareContainer'", LinearLayout.class);
        videoShare2GifPreviewActivity.tvShareTitle = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e1u, "field 'tvShareTitle'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.dqq, "method 'handleUiClickEvent'");
        this.f99099b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoShare2GifPreviewActivity.handleUiClickEvent(view);
            }
        });
    }
}
