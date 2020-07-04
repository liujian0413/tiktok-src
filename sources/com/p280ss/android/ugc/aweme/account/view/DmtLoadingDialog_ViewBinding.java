package com.p280ss.android.ugc.aweme.account.view;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.view.DmtLoadingDialog_ViewBinding */
public class DmtLoadingDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DmtLoadingDialog f59623a;

    public void unbind() {
        DmtLoadingDialog dmtLoadingDialog = this.f59623a;
        if (dmtLoadingDialog != null) {
            this.f59623a = null;
            dmtLoadingDialog.mMainLayout = null;
            dmtLoadingDialog.mProgressbar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DmtLoadingDialog_ViewBinding(DmtLoadingDialog dmtLoadingDialog, View view) {
        this.f59623a = dmtLoadingDialog;
        dmtLoadingDialog.mMainLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bwm, "field 'mMainLayout'", LinearLayout.class);
        dmtLoadingDialog.mProgressbar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.cl2, "field 'mProgressbar'", ProgressBar.class);
    }
}
