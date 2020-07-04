package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateUserInfoDialog_ViewBinding */
public class UpdateUserInfoDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UpdateUserInfoDialog f95274a;

    public void unbind() {
        UpdateUserInfoDialog updateUserInfoDialog = this.f95274a;
        if (updateUserInfoDialog != null) {
            this.f95274a = null;
            updateUserInfoDialog.mNickNameEditText = null;
            updateUserInfoDialog.mConfirmUpdate = null;
            updateUserInfoDialog.mClose = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UpdateUserInfoDialog_ViewBinding(UpdateUserInfoDialog updateUserInfoDialog, View view) {
        this.f95274a = updateUserInfoDialog;
        updateUserInfoDialog.mNickNameEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.c4b, "field 'mNickNameEditText'", EditText.class);
        updateUserInfoDialog.mConfirmUpdate = (TextView) Utils.findRequiredViewAsType(view, R.id.a12, "field 'mConfirmUpdate'", TextView.class);
        updateUserInfoDialog.mClose = (ImageView) Utils.findRequiredViewAsType(view, R.id.xq, "field 'mClose'", ImageView.class);
    }
}
