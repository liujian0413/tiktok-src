package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView_ViewBinding */
public class BaseMusicListView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseMusicListView f63268a;

    public void unbind() {
        BaseMusicListView baseMusicListView = this.f63268a;
        if (baseMusicListView != null) {
            this.f63268a = null;
            baseMusicListView.mTitleBar = null;
            baseMusicListView.mRecyclerView = null;
            baseMusicListView.mStatusView = null;
            baseMusicListView.mTitleLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseMusicListView_ViewBinding(BaseMusicListView baseMusicListView, View view) {
        this.f63268a = baseMusicListView;
        baseMusicListView.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        baseMusicListView.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.c1h, "field 'mRecyclerView'", RecyclerView.class);
        baseMusicListView.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.c1y, "field 'mStatusView'", DmtStatusView.class);
        baseMusicListView.mTitleLayout = (LinearLayout) Utils.findOptionalViewAsType(view, R.id.c1i, "field 'mTitleLayout'", LinearLayout.class);
    }
}
