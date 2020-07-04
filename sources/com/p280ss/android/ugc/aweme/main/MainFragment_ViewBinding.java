package com.p280ss.android.ugc.aweme.main;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.CustomInterceptTouchEventFrameLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.FlippableViewPager;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainTabStrip;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.main.MainFragment_ViewBinding */
public class MainFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MainFragment f85693a;

    public void unbind() {
        MainFragment mainFragment = this.f85693a;
        if (mainFragment != null) {
            this.f85693a = null;
            mainFragment.mFlRootContainer = null;
            mainFragment.mFlContainerStoryPanel = null;
            mainFragment.mFlContentContainer = null;
            mainFragment.mSwipeRefreshLayoutWhenStoryOpen = null;
            mainFragment.mViewPager = null;
            mainFragment.mPagerTabStrip = null;
            mainFragment.mStatusBarView = null;
            mainFragment.mRlTabContainer = null;
            mainFragment.mTeenagerModeTitleBarStub = null;
            mainFragment.mXmasTreeViewStub = null;
            mainFragment.mVTabBg = null;
            mainFragment.mVolumeBtnStub = null;
            mainFragment.mTitleBarContainer = null;
            mainFragment.mTitleShadow = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MainFragment_ViewBinding(MainFragment mainFragment, View view) {
        this.f85693a = mainFragment;
        mainFragment.mFlRootContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.amt, "field 'mFlRootContainer'", ViewGroup.class);
        mainFragment.mFlContainerStoryPanel = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.am5, "field 'mFlContainerStoryPanel'", ViewGroup.class);
        mainFragment.mFlContentContainer = (CustomInterceptTouchEventFrameLayout) Utils.findRequiredViewAsType(view, R.id.am7, "field 'mFlContentContainer'", CustomInterceptTouchEventFrameLayout.class);
        mainFragment.mSwipeRefreshLayoutWhenStoryOpen = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.d9v, "field 'mSwipeRefreshLayoutWhenStoryOpen'", SwipeRefreshLayout.class);
        mainFragment.mViewPager = (FlippableViewPager) Utils.findRequiredViewAsType(view, R.id.edp, "field 'mViewPager'", FlippableViewPager.class);
        mainFragment.mPagerTabStrip = (MainTabStrip) Utils.findRequiredViewAsType(view, R.id.c_3, "field 'mPagerTabStrip'", MainTabStrip.class);
        mainFragment.mStatusBarView = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBarView'");
        mainFragment.mRlTabContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.cv5, "field 'mRlTabContainer'", FrameLayout.class);
        mainFragment.mTeenagerModeTitleBarStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.dgx, "field 'mTeenagerModeTitleBarStub'", ViewStub.class);
        mainFragment.mXmasTreeViewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.ef4, "field 'mXmasTreeViewStub'", ViewStub.class);
        mainFragment.mVTabBg = Utils.findRequiredView(view, R.id.e_i, "field 'mVTabBg'");
        mainFragment.mVolumeBtnStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.bwl, "field 'mVolumeBtnStub'", ViewStub.class);
        mainFragment.mTitleBarContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.dk2, "field 'mTitleBarContainer'", LinearLayout.class);
        mainFragment.mTitleShadow = (ImageView) Utils.findRequiredViewAsType(view, R.id.dkk, "field 'mTitleShadow'", ImageView.class);
    }
}
