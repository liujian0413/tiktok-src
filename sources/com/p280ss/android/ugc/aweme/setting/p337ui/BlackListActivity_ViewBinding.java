package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.BlackListActivity_ViewBinding */
public class BlackListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BlackListActivity f98370a;

    /* renamed from: b */
    private View f98371b;

    public void unbind() {
        BlackListActivity blackListActivity = this.f98370a;
        if (blackListActivity != null) {
            this.f98370a = null;
            blackListActivity.mTitle = null;
            blackListActivity.mBack = null;
            blackListActivity.mStatusView = null;
            blackListActivity.mRecyclerView = null;
            this.f98371b.setOnClickListener(null);
            this.f98371b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BlackListActivity_ViewBinding(final BlackListActivity blackListActivity, View view) {
        this.f98370a = blackListActivity;
        blackListActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "field 'mBack' and method 'back'");
        blackListActivity.mBack = (ImageView) Utils.castView(findRequiredView, R.id.jo, "field 'mBack'", ImageView.class);
        this.f98371b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                blackListActivity.back();
            }
        });
        blackListActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.mp, "field 'mStatusView'", DmtStatusView.class);
        blackListActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.mo, "field 'mRecyclerView'", RecyclerView.class);
    }
}
