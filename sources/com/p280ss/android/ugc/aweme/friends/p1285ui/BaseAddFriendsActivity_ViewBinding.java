package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.NormalTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.BaseAddFriendsActivity_ViewBinding */
public class BaseAddFriendsActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseAddFriendsActivity f79086a;

    public void unbind() {
        BaseAddFriendsActivity baseAddFriendsActivity = this.f79086a;
        if (baseAddFriendsActivity != null) {
            this.f79086a = null;
            baseAddFriendsActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseAddFriendsActivity_ViewBinding(BaseAddFriendsActivity baseAddFriendsActivity, View view) {
        this.f79086a = baseAddFriendsActivity;
        baseAddFriendsActivity.mTitleBar = (NormalTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", NormalTitleBar.class);
    }
}
