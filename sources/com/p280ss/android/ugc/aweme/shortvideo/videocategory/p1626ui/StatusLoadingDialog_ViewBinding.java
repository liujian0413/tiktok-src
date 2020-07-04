package com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.StatusLoadingDialog_ViewBinding */
public final class StatusLoadingDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StatusLoadingDialog f108193a;

    public final void unbind() {
        StatusLoadingDialog statusLoadingDialog = this.f108193a;
        if (statusLoadingDialog != null) {
            this.f108193a = null;
            statusLoadingDialog.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StatusLoadingDialog_ViewBinding(StatusLoadingDialog statusLoadingDialog, View view) {
        this.f108193a = statusLoadingDialog;
        statusLoadingDialog.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
