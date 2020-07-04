package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateNickNameDialog_ViewBinding */
public class UpdateNickNameDialog_ViewBinding extends UpdateUserInfoDialog_ViewBinding {

    /* renamed from: a */
    private UpdateNickNameDialog f95268a;

    public void unbind() {
        UpdateNickNameDialog updateNickNameDialog = this.f95268a;
        if (updateNickNameDialog != null) {
            this.f95268a = null;
            updateNickNameDialog.mPolicyDes = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UpdateNickNameDialog_ViewBinding(UpdateNickNameDialog updateNickNameDialog, View view) {
        super(updateNickNameDialog, view);
        this.f95268a = updateNickNameDialog;
        updateNickNameDialog.mPolicyDes = (TextView) Utils.findRequiredViewAsType(view, R.id.chz, "field 'mPolicyDes'", TextView.class);
    }
}
