package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingListFragment_ViewBinding */
public class FollowingListFragment_ViewBinding extends SimpleUserFragment_ViewBinding {

    /* renamed from: a */
    private FollowingListFragment f78112a;

    /* renamed from: b */
    private View f78113b;

    public void unbind() {
        FollowingListFragment followingListFragment = this.f78112a;
        if (followingListFragment != null) {
            this.f78112a = null;
            followingListFragment.imgAddFriends = null;
            followingListFragment.mVSpit = null;
            followingListFragment.mEnablePushNoticeView = null;
            this.f78113b.setOnClickListener(null);
            this.f78113b = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowingListFragment_ViewBinding(final FollowingListFragment followingListFragment, View view) {
        super(followingListFragment, view);
        this.f78112a = followingListFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.e7, "field 'imgAddFriends' and method 'onViewClicked'");
        followingListFragment.imgAddFriends = (ImageView) Utils.castView(findRequiredView, R.id.e7, "field 'imgAddFriends'", ImageView.class);
        this.f78113b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                followingListFragment.onViewClicked();
            }
        });
        followingListFragment.mVSpit = Utils.findRequiredView(view, R.id.e_g, "field 'mVSpit'");
        followingListFragment.mEnablePushNoticeView = (NoticeView) Utils.findRequiredViewAsType(view, R.id.asi, "field 'mEnablePushNoticeView'", NoticeView.class);
    }
}
