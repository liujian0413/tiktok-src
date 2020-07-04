package com.p280ss.android.ugc.aweme.followrequest;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.followrequest.FollowRequestActivity_ViewBinding */
public class FollowRequestActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FollowRequestActivity f78431a;

    /* renamed from: b */
    private View f78432b;

    public void unbind() {
        FollowRequestActivity followRequestActivity = this.f78431a;
        if (followRequestActivity != null) {
            this.f78431a = null;
            followRequestActivity.mTitleBar = null;
            followRequestActivity.mRecyclerView = null;
            followRequestActivity.mStatusView = null;
            followRequestActivity.mListStatusView = null;
            this.f78432b.setOnClickListener(null);
            this.f78432b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowRequestActivity_ViewBinding(final FollowRequestActivity followRequestActivity, View view) {
        this.f78431a = followRequestActivity;
        followRequestActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        followRequestActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cs6, "field 'mRecyclerView'", RecyclerView.class);
        followRequestActivity.mStatusView = Utils.findRequiredView(view, R.id.dal, "field 'mStatusView'");
        followRequestActivity.mListStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.anx, "field 'mListStatusView'", DmtStatusView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "method 'back'");
        this.f78432b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                followRequestActivity.back();
            }
        });
    }
}
