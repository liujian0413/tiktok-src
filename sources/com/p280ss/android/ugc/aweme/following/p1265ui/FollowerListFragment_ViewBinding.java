package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerListFragment_ViewBinding */
public class FollowerListFragment_ViewBinding extends SimpleUserFragment_ViewBinding {

    /* renamed from: a */
    private FollowerListFragment f78051a;

    /* renamed from: b */
    private View f78052b;

    public void unbind() {
        FollowerListFragment followerListFragment = this.f78051a;
        if (followerListFragment != null) {
            this.f78051a = null;
            followerListFragment.viewFansDivider = null;
            followerListFragment.imgAddFriends = null;
            this.f78052b.setOnClickListener(null);
            this.f78052b = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowerListFragment_ViewBinding(final FollowerListFragment followerListFragment, View view) {
        super(followerListFragment, view);
        this.f78051a = followerListFragment;
        followerListFragment.viewFansDivider = Utils.findRequiredView(view, R.id.aib, "field 'viewFansDivider'");
        View findRequiredView = Utils.findRequiredView(view, R.id.e7, "field 'imgAddFriends' and method 'onViewClicked'");
        followerListFragment.imgAddFriends = (ImageView) Utils.castView(findRequiredView, R.id.e7, "field 'imgAddFriends'", ImageView.class);
        this.f78052b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                followerListFragment.onViewClicked();
            }
        });
    }
}
