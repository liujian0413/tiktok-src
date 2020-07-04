package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.support.p022v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment_ViewBinding */
public class NewMusicTabFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NewMusicTabFragment f63184a;

    public void unbind() {
        NewMusicTabFragment newMusicTabFragment = this.f63184a;
        if (newMusicTabFragment != null) {
            this.f63184a = null;
            newMusicTabFragment.mDmtStatusView = null;
            newMusicTabFragment.tabLayout = null;
            newMusicTabFragment.mVpFragmentContainer = null;
            newMusicTabFragment.mScrollableLayout = null;
            newMusicTabFragment.mVwDivideLine = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NewMusicTabFragment_ViewBinding(NewMusicTabFragment newMusicTabFragment, View view) {
        this.f63184a = newMusicTabFragment;
        newMusicTabFragment.mDmtStatusView = (DmtStatusView) Utils.findOptionalViewAsType(view, R.id.dav, "field 'mDmtStatusView'", DmtStatusView.class);
        newMusicTabFragment.tabLayout = (DmtTabLayout) Utils.findOptionalViewAsType(view, R.id.dfo, "field 'tabLayout'", DmtTabLayout.class);
        newMusicTabFragment.mVpFragmentContainer = (ViewPager) Utils.findRequiredViewAsType(view, R.id.ama, "field 'mVpFragmentContainer'", ViewPager.class);
        newMusicTabFragment.mScrollableLayout = (ScrollableLayout) Utils.findOptionalViewAsType(view, R.id.czg, "field 'mScrollableLayout'", ScrollableLayout.class);
        newMusicTabFragment.mVwDivideLine = view.findViewById(R.id.a9o);
    }
}
