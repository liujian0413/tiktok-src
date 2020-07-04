package com.p280ss.android.ugc.aweme.views;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.views.DmtLoadingDialog_ViewBinding */
public class DmtLoadingDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DmtLoadingDialog f112241a;

    public void unbind() {
        DmtLoadingDialog dmtLoadingDialog = this.f112241a;
        if (dmtLoadingDialog != null) {
            this.f112241a = null;
            dmtLoadingDialog.mMainLayout = null;
            dmtLoadingDialog.mProgressbar = null;
            dmtLoadingDialog.mContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DmtLoadingDialog_ViewBinding(DmtLoadingDialog dmtLoadingDialog, View view) {
        this.f112241a = dmtLoadingDialog;
        dmtLoadingDialog.mMainLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bwm, "field 'mMainLayout'", LinearLayout.class);
        dmtLoadingDialog.mProgressbar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.cl2, "field 'mProgressbar'", ProgressBar.class);
        dmtLoadingDialog.mContent = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.bu3, "field 'mContent'", DmtTextView.class);
    }
}
