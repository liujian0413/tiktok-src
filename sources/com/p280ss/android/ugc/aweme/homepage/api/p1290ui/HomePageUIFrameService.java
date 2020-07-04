package com.p280ss.android.ugc.aweme.homepage.api.p1290ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter.C23435a;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.Triple;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService */
public interface HomePageUIFrameService {
    void addTabToMainPageFragment(TabChangeManager tabChangeManager, Intent intent);

    void afterTabChangedInMainPageFragment(String str);

    C23435a getBuilderForFragmentInHomePageActivity();

    Triple<String[], int[], String[]> getContentForMainFragment(Context context);

    int getCount(int i);

    Class<? extends Activity> getHomePageInflateActivityClass();

    Fragment getItemForPagerInMainFragment(AbsFragment absFragment, int i, String str);

    int getItemPosition(Object obj);

    String getSecondTabDesc(Context context);

    String getTagForCurrentTabInMainPageFragment(TabChangeManager tabChangeManager, String str, String str2);

    void runInTabHostRunnable(AbsFragment absFragment);

    void setTitleTabVisibility(boolean z);
}
