package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity_ViewBinding */
public class ProfileCoverLibActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileCoverLibActivity f95002a;

    public void unbind() {
        ProfileCoverLibActivity profileCoverLibActivity = this.f95002a;
        if (profileCoverLibActivity != null) {
            this.f95002a = null;
            profileCoverLibActivity.mTitleBar = null;
            profileCoverLibActivity.mCoverRecycleView = null;
            profileCoverLibActivity.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileCoverLibActivity_ViewBinding(ProfileCoverLibActivity profileCoverLibActivity, View view) {
        this.f95002a = profileCoverLibActivity;
        profileCoverLibActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        profileCoverLibActivity.mCoverRecycleView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cx_, "field 'mCoverRecycleView'", RecyclerView.class);
        profileCoverLibActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
    }
}
