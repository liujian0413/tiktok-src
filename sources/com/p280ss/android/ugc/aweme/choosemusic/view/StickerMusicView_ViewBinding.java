package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StickerMusicView_ViewBinding */
public class StickerMusicView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerMusicView f63299a;

    public void unbind() {
        StickerMusicView stickerMusicView = this.f63299a;
        if (stickerMusicView != null) {
            this.f63299a = null;
            stickerMusicView.mVgContainer = null;
            stickerMusicView.mLlMusicContainer = null;
            stickerMusicView.mTvwContent = null;
            stickerMusicView.mVwDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerMusicView_ViewBinding(StickerMusicView stickerMusicView, View view) {
        this.f63299a = stickerMusicView;
        stickerMusicView.mVgContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bqn, "field 'mVgContainer'", LinearLayout.class);
        stickerMusicView.mLlMusicContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bqo, "field 'mLlMusicContainer'", LinearLayout.class);
        stickerMusicView.mTvwContent = (TextView) Utils.findRequiredViewAsType(view, R.id.e4w, "field 'mTvwContent'", TextView.class);
        stickerMusicView.mVwDivider = Utils.findRequiredView(view, R.id.ef7, "field 'mVwDivider'");
    }
}
