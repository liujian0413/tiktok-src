package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicTabView_ViewBinding */
public final class MusicTabView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicTabView f88454a;

    public final void unbind() {
        MusicTabView musicTabView = this.f88454a;
        if (musicTabView != null) {
            this.f88454a = null;
            musicTabView.tabLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicTabView_ViewBinding(MusicTabView musicTabView, View view) {
        this.f88454a = musicTabView;
        musicTabView.tabLayout = (DmtTabLayout) Utils.findRequiredViewAsType(view, R.id.c20, "field 'tabLayout'", DmtTabLayout.class);
    }
}
