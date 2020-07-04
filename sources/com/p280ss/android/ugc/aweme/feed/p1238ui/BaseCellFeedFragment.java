package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.BaseCellFeedFragment */
public abstract class BaseCellFeedFragment extends FeedFragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rm, viewGroup, false);
    }
}
