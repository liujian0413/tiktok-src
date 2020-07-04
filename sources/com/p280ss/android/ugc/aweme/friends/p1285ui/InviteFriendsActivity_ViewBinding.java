package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity_ViewBinding */
public class InviteFriendsActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InviteFriendsActivity f79235a;

    public void unbind() {
        InviteFriendsActivity inviteFriendsActivity = this.f79235a;
        if (inviteFriendsActivity != null) {
            this.f79235a = null;
            inviteFriendsActivity.mListView = null;
            inviteFriendsActivity.mTitleBar = null;
            inviteFriendsActivity.mStatusView = null;
            inviteFriendsActivity.mRefreshLayout = null;
            inviteFriendsActivity.mBtnFloatInviteAll = null;
            inviteFriendsActivity.mBtnFloatInviteAllContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InviteFriendsActivity_ViewBinding(InviteFriendsActivity inviteFriendsActivity, View view) {
        this.f79235a = inviteFriendsActivity;
        inviteFriendsActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bnf, "field 'mListView'", RecyclerView.class);
        inviteFriendsActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        inviteFriendsActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        inviteFriendsActivity.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.cr7, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        inviteFriendsActivity.mBtnFloatInviteAll = (TextView) Utils.findRequiredViewAsType(view, R.id.anb, "field 'mBtnFloatInviteAll'", TextView.class);
        inviteFriendsActivity.mBtnFloatInviteAllContainer = Utils.findRequiredView(view, R.id.anc, "field 'mBtnFloatInviteAllContainer'");
    }
}
