package com.p280ss.android.ugc.aweme.music;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.OriginMusicListFragment_ViewBinding */
public class OriginMusicListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OriginMusicListFragment f87883a;

    public void unbind() {
        OriginMusicListFragment originMusicListFragment = this.f87883a;
        if (originMusicListFragment != null) {
            this.f87883a = null;
            originMusicListFragment.mListView = null;
            originMusicListFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public OriginMusicListFragment_ViewBinding(OriginMusicListFragment originMusicListFragment, View view) {
        this.f87883a = originMusicListFragment;
        originMusicListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cxs, "field 'mListView'", RecyclerView.class);
        originMusicListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
    }
}
