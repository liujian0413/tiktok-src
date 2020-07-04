package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListActivity_ViewBinding */
public class MusicListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicListActivity f88362a;

    public void unbind() {
        MusicListActivity musicListActivity = this.f88362a;
        if (musicListActivity != null) {
            this.f88362a = null;
            musicListActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicListActivity_ViewBinding(MusicListActivity musicListActivity, View view) {
        this.f88362a = musicListActivity;
        musicListActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
    }
}
