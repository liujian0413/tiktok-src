package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.support.design.widget.AppBarLayout;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity_ViewBinding */
public class IAddFriendsActivity_ViewBinding extends BaseAddFriendsActivity_ViewBinding {

    /* renamed from: a */
    private IAddFriendsActivity f79169a;

    /* renamed from: b */
    private View f79170b;

    /* renamed from: c */
    private View f79171c;

    public void unbind() {
        IAddFriendsActivity iAddFriendsActivity = this.f79169a;
        if (iAddFriendsActivity != null) {
            this.f79169a = null;
            iAddFriendsActivity.mRefreshLayout = null;
            iAddFriendsActivity.mRecyclerView = null;
            iAddFriendsActivity.mStatusView = null;
            iAddFriendsActivity.mSearchLayout = null;
            iAddFriendsActivity.mAppBarLayout = null;
            iAddFriendsActivity.mEditSearch = null;
            iAddFriendsActivity.mTvSearchHit = null;
            iAddFriendsActivity.mTvSearchBtn = null;
            iAddFriendsActivity.mBtnSearchClear = null;
            this.f79170b.setOnClickListener(null);
            this.f79170b = null;
            this.f79171c.setOnClickListener(null);
            this.f79171c = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public IAddFriendsActivity_ViewBinding(final IAddFriendsActivity iAddFriendsActivity, View view) {
        super(iAddFriendsActivity, view);
        this.f79169a = iAddFriendsActivity;
        iAddFriendsActivity.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.cp6, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        iAddFriendsActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cp8, "field 'mRecyclerView'", RecyclerView.class);
        iAddFriendsActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        iAddFriendsActivity.mSearchLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bjl, "field 'mSearchLayout'", LinearLayout.class);
        iAddFriendsActivity.mAppBarLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, R.id.gm, "field 'mAppBarLayout'", AppBarLayout.class);
        iAddFriendsActivity.mEditSearch = (DmtEditText) Utils.findRequiredViewAsType(view, R.id.agn, "field 'mEditSearch'", DmtEditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.e1f, "field 'mTvSearchHit' and method 'searchUser'");
        iAddFriendsActivity.mTvSearchHit = (DmtTextView) Utils.castView(findRequiredView, R.id.e1f, "field 'mTvSearchHit'", DmtTextView.class);
        this.f79170b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                iAddFriendsActivity.searchUser();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e1b, "field 'mTvSearchBtn' and method 'searchUser'");
        iAddFriendsActivity.mTvSearchBtn = (DmtTextView) Utils.castView(findRequiredView2, R.id.e1b, "field 'mTvSearchBtn'", DmtTextView.class);
        this.f79171c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                iAddFriendsActivity.searchUser();
            }
        });
        iAddFriendsActivity.mBtnSearchClear = (ImageButton) Utils.findRequiredViewAsType(view, R.id.pw, "field 'mBtnSearchClear'", ImageButton.class);
        iAddFriendsActivity.mSearchHitString = view.getContext().getResources().getString(R.string.dkc);
    }
}
