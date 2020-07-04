package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.support.p022v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.UserFavoritesFragment_ViewBinding */
public class UserFavoritesFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UserFavoritesFragment f73330a;

    public void unbind() {
        UserFavoritesFragment userFavoritesFragment = this.f73330a;
        if (userFavoritesFragment != null) {
            this.f73330a = null;
            userFavoritesFragment.mTitleBar = null;
            userFavoritesFragment.mTabLayout = null;
            userFavoritesFragment.mViewPager = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UserFavoritesFragment_ViewBinding(UserFavoritesFragment userFavoritesFragment, View view) {
        this.f73330a = userFavoritesFragment;
        userFavoritesFragment.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        userFavoritesFragment.mTabLayout = (DmtTabLayout) Utils.findRequiredViewAsType(view, R.id.dfo, "field 'mTabLayout'", DmtTabLayout.class);
        userFavoritesFragment.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.edp, "field 'mViewPager'", ViewPager.class);
    }
}
