package com.p280ss.android.ugc.aweme.shortvideo.cut.gif;

import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment_ViewBinding */
public class Video2GifCutFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private Video2GifCutFragment f100717a;

    /* renamed from: b */
    private View f100718b;

    public void unbind() {
        Video2GifCutFragment video2GifCutFragment = this.f100717a;
        if (video2GifCutFragment != null) {
            this.f100717a = null;
            video2GifCutFragment.textureVideoView = null;
            video2GifCutFragment.ivPlay = null;
            video2GifCutFragment.flVideoContainer = null;
            video2GifCutFragment.videoEditView = null;
            video2GifCutFragment.tvSelectedTime = null;
            this.f100718b.setOnClickListener(null);
            this.f100718b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public Video2GifCutFragment_ViewBinding(final Video2GifCutFragment video2GifCutFragment, View view) {
        this.f100717a = video2GifCutFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.dij, "field 'textureVideoView' and method 'resolveUiClick'");
        video2GifCutFragment.textureVideoView = (TextureView) Utils.castView(findRequiredView, R.id.dij, "field 'textureVideoView'", TextureView.class);
        this.f100718b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                video2GifCutFragment.resolveUiClick(view);
            }
        });
        video2GifCutFragment.ivPlay = (ImageView) Utils.findRequiredViewAsType(view, R.id.ccc, "field 'ivPlay'", ImageView.class);
        video2GifCutFragment.flVideoContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.an7, "field 'flVideoContainer'", FrameLayout.class);
        video2GifCutFragment.videoEditView = (VideoEditView) Utils.findRequiredViewAsType(view, R.id.eak, "field 'videoEditView'", VideoEditView.class);
        video2GifCutFragment.tvSelectedTime = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e3_, "field 'tvSelectedTime'", DmtTextView.class);
    }
}
