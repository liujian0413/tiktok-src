package com.p280ss.android.ugc.aweme.livewallpaper.p1370ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity_ViewBinding */
public class LocalLiveWallPaperActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LocalLiveWallPaperActivity f85045a;

    /* renamed from: b */
    private View f85046b;

    public void unbind() {
        LocalLiveWallPaperActivity localLiveWallPaperActivity = this.f85045a;
        if (localLiveWallPaperActivity != null) {
            this.f85045a = null;
            localLiveWallPaperActivity.mTitle = null;
            localLiveWallPaperActivity.mWallPapersRecyclerView = null;
            localLiveWallPaperActivity.mLayoutEmpty = null;
            this.f85046b.setOnClickListener(null);
            this.f85046b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LocalLiveWallPaperActivity_ViewBinding(final LocalLiveWallPaperActivity localLiveWallPaperActivity, View view) {
        this.f85045a = localLiveWallPaperActivity;
        localLiveWallPaperActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        localLiveWallPaperActivity.mWallPapersRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cqp, "field 'mWallPapersRecyclerView'", RecyclerView.class);
        localLiveWallPaperActivity.mLayoutEmpty = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.bhe, "field 'mLayoutEmpty'", ViewGroup.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "method 'exit'");
        this.f85046b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                localLiveWallPaperActivity.exit(view);
            }
        });
    }
}
