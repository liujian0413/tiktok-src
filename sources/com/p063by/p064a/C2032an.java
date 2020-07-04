package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView;
import com.p280ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.NewVideoPlayerProgressbar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.an */
public final class C2032an implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 80;
        }
        if (viewGroup != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(frameLayout);
            }
        }
        AudioControlView audioControlView = new AudioControlView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        audioControlView.setId(R.id.hs);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 80;
        }
        audioControlView.setAlpha(0.0f);
        audioControlView.setForegroundColor(resources.getColor(R.color.ayn));
        audioControlView.setLayoutParams(layoutParams);
        if (audioControlView.getParent() == null) {
            frameLayout.addView(audioControlView);
        }
        LineProgressBar lineProgressBar = new LineProgressBar(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        lineProgressBar.setId(R.id.bm_);
        lineProgressBar.setLayoutParams(layoutParams2);
        if (lineProgressBar.getParent() == null) {
            frameLayout.addView(lineProgressBar);
        }
        NewVideoPlayerProgressbar newVideoPlayerProgressbar = new NewVideoPlayerProgressbar(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        newVideoPlayerProgressbar.setId(R.id.eb_);
        newVideoPlayerProgressbar.setReachedProgressBarHeight(TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        newVideoPlayerProgressbar.setReachedBarColor(resources.getColor(R.color.a50));
        newVideoPlayerProgressbar.setLayoutParams(layoutParams3);
        if (newVideoPlayerProgressbar.getParent() == null) {
            frameLayout.addView(newVideoPlayerProgressbar);
        }
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(audioControlView);
        C1444a.m7242a(lineProgressBar);
        C1444a.m7242a(newVideoPlayerProgressbar);
        return frameLayout;
    }
}
