package com.p280ss.android.ugc.aweme.legoImp.inflate;

import android.content.Context;
import android.view.View.OnClickListener;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.base.widget.BaseRecyclerView;
import com.p280ss.android.ugc.aweme.lego.LegoInflate;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.IMainBottomInflate */
public interface IMainBottomInflate extends LegoInflate {
    BaseRecyclerView getBaseRecyclerView(Context context);

    DmtStatusView getDmtStatusView(Context context, OnClickListener onClickListener);
}
