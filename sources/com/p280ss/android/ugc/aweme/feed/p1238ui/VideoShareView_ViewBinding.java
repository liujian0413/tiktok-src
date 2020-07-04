package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoShareView_ViewBinding */
public class VideoShareView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VideoShareView f75862a;

    /* renamed from: b */
    private View f75863b;

    /* renamed from: c */
    private View f75864c;

    /* renamed from: d */
    private View f75865d;

    public void unbind() {
        VideoShareView videoShareView = this.f75862a;
        if (videoShareView != null) {
            this.f75862a = null;
            videoShareView.shareIv = null;
            videoShareView.mShareCount = null;
            videoShareView.mShareContainerView = null;
            this.f75863b.setOnClickListener(null);
            this.f75863b = null;
            this.f75864c.setOnClickListener(null);
            this.f75864c = null;
            this.f75865d.setOnClickListener(null);
            this.f75865d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VideoShareView_ViewBinding(final VideoShareView videoShareView, View view) {
        this.f75862a = videoShareView;
        View findRequiredView = Utils.findRequiredView(view, R.id.d5a, "field 'shareIv' and method 'onClick'");
        videoShareView.shareIv = (RemoteImageView) Utils.castView(findRequiredView, R.id.d5a, "field 'shareIv'", RemoteImageView.class);
        this.f75863b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoShareView.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.d54, "field 'mShareCount' and method 'onClick'");
        videoShareView.mShareCount = (TextView) Utils.castView(findRequiredView2, R.id.d54, "field 'mShareCount'", TextView.class);
        this.f75864c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoShareView.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.d51, "field 'mShareContainerView' and method 'onClick'");
        videoShareView.mShareContainerView = findRequiredView3;
        this.f75865d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoShareView.onClick(view);
            }
        });
    }
}
