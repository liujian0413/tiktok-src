package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity_ViewBinding */
public class BaseLoginOrRegisterActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseLoginOrRegisterActivity f58329a;

    public void unbind() {
        BaseLoginOrRegisterActivity baseLoginOrRegisterActivity = this.f58329a;
        if (baseLoginOrRegisterActivity != null) {
            this.f58329a = null;
            baseLoginOrRegisterActivity.mStatusView = null;
            baseLoginOrRegisterActivity.mFragmentContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseLoginOrRegisterActivity_ViewBinding(BaseLoginOrRegisterActivity baseLoginOrRegisterActivity, View view) {
        this.f58329a = baseLoginOrRegisterActivity;
        baseLoginOrRegisterActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        baseLoginOrRegisterActivity.mFragmentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.aoy, "field 'mFragmentContainer'", ViewGroup.class);
    }
}
