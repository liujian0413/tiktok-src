package com.p280ss.android.ugc.aweme.miniapp;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity_ViewBinding */
public class RecentlyUsedMicroAppActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecentlyUsedMicroAppActivity f86951a;

    public void unbind() {
        RecentlyUsedMicroAppActivity recentlyUsedMicroAppActivity = this.f86951a;
        if (recentlyUsedMicroAppActivity != null) {
            this.f86951a = null;
            recentlyUsedMicroAppActivity.mStatusView = null;
            recentlyUsedMicroAppActivity.mListView = null;
            recentlyUsedMicroAppActivity.mTextTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecentlyUsedMicroAppActivity_ViewBinding(RecentlyUsedMicroAppActivity recentlyUsedMicroAppActivity, View view) {
        this.f86951a = recentlyUsedMicroAppActivity;
        recentlyUsedMicroAppActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        recentlyUsedMicroAppActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bnf, "field 'mListView'", RecyclerView.class);
        recentlyUsedMicroAppActivity.mTextTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTextTitleBar'", TextTitleBar.class);
    }
}
