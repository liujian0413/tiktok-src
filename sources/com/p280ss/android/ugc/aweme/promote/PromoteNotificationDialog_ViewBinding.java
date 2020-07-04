package com.p280ss.android.ugc.aweme.promote;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteNotificationDialog_ViewBinding */
public class PromoteNotificationDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PromoteNotificationDialog f96743a;

    public void unbind() {
        PromoteNotificationDialog promoteNotificationDialog = this.f96743a;
        if (promoteNotificationDialog != null) {
            this.f96743a = null;
            promoteNotificationDialog.mTvTitle = null;
            promoteNotificationDialog.mTvDesc = null;
            promoteNotificationDialog.mBtnJoin = null;
            promoteNotificationDialog.mBtnCancel = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PromoteNotificationDialog_ViewBinding(PromoteNotificationDialog promoteNotificationDialog, View view) {
        this.f96743a = promoteNotificationDialog;
        promoteNotificationDialog.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.e3f, "field 'mTvTitle'", TextView.class);
        promoteNotificationDialog.mTvDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.dt5, "field 'mTvDesc'", TextView.class);
        promoteNotificationDialog.mBtnJoin = Utils.findRequiredView(view, R.id.qh, "field 'mBtnJoin'");
        promoteNotificationDialog.mBtnCancel = Utils.findRequiredView(view, R.id.ps, "field 'mBtnCancel'");
    }
}
