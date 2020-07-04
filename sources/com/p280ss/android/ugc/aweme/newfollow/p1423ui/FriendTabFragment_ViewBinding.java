package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.support.p022v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment_ViewBinding */
public class FriendTabFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FriendTabFragment f89043a;

    public void unbind() {
        FriendTabFragment friendTabFragment = this.f89043a;
        if (friendTabFragment != null) {
            this.f89043a = null;
            friendTabFragment.mViewPager = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FriendTabFragment_ViewBinding(FriendTabFragment friendTabFragment, View view) {
        this.f89043a = friendTabFragment;
        friendTabFragment.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.edp, "field 'mViewPager'", ViewPager.class);
    }
}
