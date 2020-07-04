package com.p280ss.android.ugc.aweme.account.p982ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseAccountActivity_ViewBinding */
public class BaseAccountActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseAccountActivity f59353a;

    public void unbind() {
        BaseAccountActivity baseAccountActivity = this.f59353a;
        if (baseAccountActivity != null) {
            this.f59353a = null;
            baseAccountActivity.mRootContainer = null;
            baseAccountActivity.mStatusView = null;
            baseAccountActivity.mContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseAccountActivity_ViewBinding(BaseAccountActivity baseAccountActivity, View view) {
        this.f59353a = baseAccountActivity;
        baseAccountActivity.mRootContainer = (ViewGroup) Utils.findOptionalViewAsType(view, R.id.cwk, "field 'mRootContainer'", ViewGroup.class);
        baseAccountActivity.mStatusView = (DmtStatusView) Utils.findOptionalViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        baseAccountActivity.mContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.aoy, "field 'mContainer'", FrameLayout.class);
    }
}
