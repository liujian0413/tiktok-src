package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.SimpleUserFragment_ViewBinding */
public class SimpleUserFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SimpleUserFragment f78193a;

    public void unbind() {
        SimpleUserFragment simpleUserFragment = this.f78193a;
        if (simpleUserFragment != null) {
            this.f78193a = null;
            simpleUserFragment.mTitleBar = null;
            simpleUserFragment.mListView = null;
            simpleUserFragment.mStatusView = null;
            simpleUserFragment.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SimpleUserFragment_ViewBinding(SimpleUserFragment simpleUserFragment, View view) {
        this.f78193a = simpleUserFragment;
        simpleUserFragment.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        simpleUserFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bng, "field 'mListView'", RecyclerView.class);
        simpleUserFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        simpleUserFragment.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.cr7, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
    }
}
