package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListFragment_ViewBinding */
public class MusicListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicListFragment f88383a;

    public void unbind() {
        MusicListFragment musicListFragment = this.f88383a;
        if (musicListFragment != null) {
            this.f88383a = null;
            musicListFragment.mListView = null;
            musicListFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicListFragment_ViewBinding(MusicListFragment musicListFragment, View view) {
        this.f88383a = musicListFragment;
        musicListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bn5, "field 'mListView'", RecyclerView.class);
        musicListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
    }
}
