package com.p280ss.android.ugc.aweme.setting.p337ui.widget;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.widget.StorageCleanLoadingDialog_ViewBinding */
public final class StorageCleanLoadingDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StorageCleanLoadingDialog f98786a;

    public final void unbind() {
        StorageCleanLoadingDialog storageCleanLoadingDialog = this.f98786a;
        if (storageCleanLoadingDialog != null) {
            this.f98786a = null;
            storageCleanLoadingDialog.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StorageCleanLoadingDialog_ViewBinding(StorageCleanLoadingDialog storageCleanLoadingDialog, View view) {
        this.f98786a = storageCleanLoadingDialog;
        storageCleanLoadingDialog.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
