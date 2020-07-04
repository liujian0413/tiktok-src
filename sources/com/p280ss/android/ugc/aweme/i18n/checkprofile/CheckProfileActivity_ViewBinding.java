package com.p280ss.android.ugc.aweme.i18n.checkprofile;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.CheckProfileActivity_ViewBinding */
public class CheckProfileActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CheckProfileActivity f79975a;

    public void unbind() {
        CheckProfileActivity checkProfileActivity = this.f79975a;
        if (checkProfileActivity != null) {
            this.f79975a = null;
            checkProfileActivity.mTitleBar = null;
            checkProfileActivity.mStatusBarView = null;
            checkProfileActivity.mStatusView = null;
            checkProfileActivity.mRecyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CheckProfileActivity_ViewBinding(CheckProfileActivity checkProfileActivity, View view) {
        this.f79975a = checkProfileActivity;
        checkProfileActivity.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.dke, "field 'mTitleBar'", ButtonTitleBar.class);
        checkProfileActivity.mStatusBarView = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBarView'");
        checkProfileActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        checkProfileActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cqq, "field 'mRecyclerView'", RecyclerView.class);
    }
}
