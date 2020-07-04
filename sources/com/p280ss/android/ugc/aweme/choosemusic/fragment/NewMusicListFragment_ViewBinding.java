package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment_ViewBinding */
public class NewMusicListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NewMusicListFragment f63146a;

    public void unbind() {
        NewMusicListFragment newMusicListFragment = this.f63146a;
        if (newMusicListFragment != null) {
            this.f63146a = null;
            newMusicListFragment.mListView = null;
            newMusicListFragment.mStatusView = null;
            newMusicListFragment.mBackgroundView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NewMusicListFragment_ViewBinding(NewMusicListFragment newMusicListFragment, View view) {
        this.f63146a = newMusicListFragment;
        newMusicListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bn5, "field 'mListView'", RecyclerView.class);
        newMusicListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        newMusicListFragment.mBackgroundView = Utils.findRequiredView(view, R.id.brs, "field 'mBackgroundView'");
    }
}
