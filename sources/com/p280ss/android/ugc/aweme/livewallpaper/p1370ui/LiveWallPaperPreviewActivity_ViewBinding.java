package com.p280ss.android.ugc.aweme.livewallpaper.p1370ui;

import android.view.SurfaceView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity_ViewBinding */
public class LiveWallPaperPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LiveWallPaperPreviewActivity f85032a;

    /* renamed from: b */
    private View f85033b;

    /* renamed from: c */
    private View f85034c;

    /* renamed from: d */
    private View f85035d;

    public void unbind() {
        LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = this.f85032a;
        if (liveWallPaperPreviewActivity != null) {
            this.f85032a = null;
            liveWallPaperPreviewActivity.mPreviewSurface = null;
            this.f85033b.setOnClickListener(null);
            this.f85033b = null;
            this.f85034c.setOnClickListener(null);
            this.f85034c = null;
            this.f85035d.setOnClickListener(null);
            this.f85035d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LiveWallPaperPreviewActivity_ViewBinding(final LiveWallPaperPreviewActivity liveWallPaperPreviewActivity, View view) {
        this.f85032a = liveWallPaperPreviewActivity;
        liveWallPaperPreviewActivity.mPreviewSurface = (SurfaceView) Utils.findRequiredViewAsType(view, R.id.d48, "field 'mPreviewSurface'", SurfaceView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "method 'exit'");
        this.f85033b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                liveWallPaperPreviewActivity.exit(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e1q, "method 'setLiveWallPaper'");
        this.f85034c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                liveWallPaperPreviewActivity.setLiveWallPaper();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.baa, "method 'onClickMore'");
        this.f85035d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                liveWallPaperPreviewActivity.onClickMore();
            }
        });
    }
}
