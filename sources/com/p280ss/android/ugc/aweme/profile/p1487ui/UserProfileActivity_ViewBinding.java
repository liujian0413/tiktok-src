package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.SlideSwitchLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileActivity_ViewBinding */
public class UserProfileActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UserProfileActivity f95304a;

    public void unbind() {
        UserProfileActivity userProfileActivity = this.f95304a;
        if (userProfileActivity != null) {
            this.f95304a = null;
            userProfileActivity.mProfileLayout = null;
            userProfileActivity.mSlideSwitchLayout = null;
            userProfileActivity.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UserProfileActivity_ViewBinding(UserProfileActivity userProfileActivity, View view) {
        this.f95304a = userProfileActivity;
        userProfileActivity.mProfileLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ed5, "field 'mProfileLayout'", LinearLayout.class);
        userProfileActivity.mSlideSwitchLayout = (SlideSwitchLayout) Utils.findRequiredViewAsType(view, R.id.d7q, "field 'mSlideSwitchLayout'", SlideSwitchLayout.class);
        userProfileActivity.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
