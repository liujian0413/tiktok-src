package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity_ViewBinding */
public class InviteUserListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InviteUserListActivity f79252a;

    /* renamed from: b */
    private View f79253b;

    /* renamed from: c */
    private View f79254c;

    /* renamed from: d */
    private View f79255d;

    public void unbind() {
        InviteUserListActivity inviteUserListActivity = this.f79252a;
        if (inviteUserListActivity != null) {
            this.f79252a = null;
            inviteUserListActivity.mTitleBar = null;
            inviteUserListActivity.mInviteText = null;
            inviteUserListActivity.mStatusView = null;
            inviteUserListActivity.mRefreshLayout = null;
            inviteUserListActivity.mListView = null;
            inviteUserListActivity.mTitleView = null;
            this.f79253b.setOnClickListener(null);
            this.f79253b = null;
            this.f79254c.setOnClickListener(null);
            this.f79254c = null;
            this.f79255d.setOnClickListener(null);
            this.f79255d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InviteUserListActivity_ViewBinding(final InviteUserListActivity inviteUserListActivity, View view) {
        this.f79252a = inviteUserListActivity;
        inviteUserListActivity.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", ButtonTitleBar.class);
        inviteUserListActivity.mInviteText = (TextView) Utils.findRequiredViewAsType(view, R.id.b2x, "field 'mInviteText'", TextView.class);
        inviteUserListActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        inviteUserListActivity.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.cr7, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        inviteUserListActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bnf, "field 'mListView'", RecyclerView.class);
        inviteUserListActivity.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b2t, "method 'onClick'");
        this.f79253b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                inviteUserListActivity.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ct5, "method 'onClick'");
        this.f79254c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                inviteUserListActivity.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.jo, "method 'back'");
        this.f79255d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                inviteUserListActivity.back();
            }
        });
    }
}
