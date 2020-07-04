package com.p280ss.android.ugc.aweme.share.gif.p1537ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity_ViewBinding */
public class VideoShare2GifEditActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VideoShare2GifEditActivity f99092a;

    /* renamed from: b */
    private View f99093b;

    public void unbind() {
        if (this.f99092a != null) {
            this.f99092a = null;
            this.f99093b.setOnClickListener(null);
            this.f99093b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VideoShare2GifEditActivity_ViewBinding(final VideoShare2GifEditActivity videoShare2GifEditActivity, View view) {
        this.f99092a = videoShare2GifEditActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.jn, "method 'resolveUiClickEvent'");
        this.f99093b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoShare2GifEditActivity.resolveUiClickEvent(view);
            }
        });
    }
}
