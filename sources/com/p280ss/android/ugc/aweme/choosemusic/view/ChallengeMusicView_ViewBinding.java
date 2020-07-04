package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView_ViewBinding */
public class ChallengeMusicView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChallengeMusicView f63275a;

    public void unbind() {
        ChallengeMusicView challengeMusicView = this.f63275a;
        if (challengeMusicView != null) {
            this.f63275a = null;
            challengeMusicView.mVgContainer = null;
            challengeMusicView.mTvwContent = null;
            challengeMusicView.mLlMusicContainer = null;
            challengeMusicView.mVwDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChallengeMusicView_ViewBinding(ChallengeMusicView challengeMusicView, View view) {
        this.f63275a = challengeMusicView;
        challengeMusicView.mVgContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bqn, "field 'mVgContainer'", LinearLayout.class);
        challengeMusicView.mTvwContent = (TextView) Utils.findRequiredViewAsType(view, R.id.e4w, "field 'mTvwContent'", TextView.class);
        challengeMusicView.mLlMusicContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bqo, "field 'mLlMusicContainer'", LinearLayout.class);
        challengeMusicView.mVwDivider = Utils.findRequiredView(view, R.id.ef7, "field 'mVwDivider'");
    }
}
