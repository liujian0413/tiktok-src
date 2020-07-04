package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.DiscoverMusicFragment_ViewBinding */
public class DiscoverMusicFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DiscoverMusicFragment f63100a;

    public void unbind() {
        DiscoverMusicFragment discoverMusicFragment = this.f63100a;
        if (discoverMusicFragment != null) {
            this.f63100a = null;
            discoverMusicFragment.mListView = null;
            discoverMusicFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DiscoverMusicFragment_ViewBinding(DiscoverMusicFragment discoverMusicFragment, View view) {
        this.f63100a = discoverMusicFragment;
        discoverMusicFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bn5, "field 'mListView'", RecyclerView.class);
        discoverMusicFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
    }
}
