package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.DmtStatusViewDialog_ViewBinding */
public class DmtStatusViewDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DmtStatusViewDialog f94582a;

    public void unbind() {
        DmtStatusViewDialog dmtStatusViewDialog = this.f94582a;
        if (dmtStatusViewDialog != null) {
            this.f94582a = null;
            dmtStatusViewDialog.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DmtStatusViewDialog_ViewBinding(DmtStatusViewDialog dmtStatusViewDialog, View view) {
        this.f94582a = dmtStatusViewDialog;
        dmtStatusViewDialog.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
