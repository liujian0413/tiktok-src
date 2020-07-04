package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerifyAndLive;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchUserViewHolder_ViewBinding */
public class SearchUserViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchUserViewHolder f69838a;

    public void unbind() {
        SearchUserViewHolder searchUserViewHolder = this.f69838a;
        if (searchUserViewHolder != null) {
            this.f69838a = null;
            searchUserViewHolder.mIvAvator = null;
            searchUserViewHolder.mLiveCircle = null;
            searchUserViewHolder.mBtnFollow = null;
            searchUserViewHolder.mTvUsername = null;
            searchUserViewHolder.mTvAwemeId = null;
            searchUserViewHolder.mTvFansCnt = null;
            searchUserViewHolder.mTvDesc = null;
            searchUserViewHolder.mTvRecommendReason = null;
            searchUserViewHolder.cardViewStub = null;
            searchUserViewHolder.mLiveTag = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchUserViewHolder_ViewBinding(SearchUserViewHolder searchUserViewHolder, View view) {
        this.f69838a = searchUserViewHolder;
        searchUserViewHolder.mIvAvator = (AvatarImageWithVerifyAndLive) Utils.findRequiredViewAsType(view, R.id.b64, "field 'mIvAvator'", AvatarImageWithVerifyAndLive.class);
        searchUserViewHolder.mLiveCircle = (LiveCircleView) Utils.findRequiredViewAsType(view, R.id.b3w, "field 'mLiveCircle'", LiveCircleView.class);
        searchUserViewHolder.mBtnFollow = (FollowUserBtn) Utils.findRequiredViewAsType(view, R.id.q5, "field 'mBtnFollow'", FollowUserBtn.class);
        searchUserViewHolder.mTvUsername = (TextView) Utils.findRequiredViewAsType(view, R.id.e4l, "field 'mTvUsername'", TextView.class);
        searchUserViewHolder.mTvAwemeId = (TextView) Utils.findRequiredViewAsType(view, R.id.dqo, "field 'mTvAwemeId'", TextView.class);
        searchUserViewHolder.mTvFansCnt = (TextView) Utils.findRequiredViewAsType(view, R.id.duc, "field 'mTvFansCnt'", TextView.class);
        searchUserViewHolder.mTvDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.dt5, "field 'mTvDesc'", TextView.class);
        searchUserViewHolder.mTvRecommendReason = (TextView) Utils.findRequiredViewAsType(view, R.id.e0c, "field 'mTvRecommendReason'", TextView.class);
        searchUserViewHolder.cardViewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.d0h, "field 'cardViewStub'", ViewStub.class);
        searchUserViewHolder.mLiveTag = (ImageView) Utils.findRequiredViewAsType(view, R.id.axg, "field 'mLiveTag'", ImageView.class);
    }
}
