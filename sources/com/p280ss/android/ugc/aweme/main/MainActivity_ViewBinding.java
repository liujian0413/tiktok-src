package com.p280ss.android.ugc.aweme.main;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager;
import com.p280ss.android.ugc.aweme.feed.p1238ui.DisLikeAwemeLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.main.MainActivity_ViewBinding */
public class MainActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MainActivity f85652a;

    public void unbind() {
        MainActivity mainActivity = this.f85652a;
        if (mainActivity != null) {
            this.f85652a = null;
            mainActivity.mViewPager = null;
            mainActivity.mDisLikeAwemeLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MainActivity_ViewBinding(MainActivity mainActivity, View view) {
        this.f85652a = mainActivity;
        mainActivity.mViewPager = (ScrollableViewPager) Utils.findRequiredViewAsType(view, R.id.edp, "field 'mViewPager'", ScrollableViewPager.class);
        mainActivity.mDisLikeAwemeLayout = (DisLikeAwemeLayout) Utils.findRequiredViewAsType(view, R.id.a9j, "field 'mDisLikeAwemeLayout'", DisLikeAwemeLayout.class);
    }
}
