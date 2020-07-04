package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.app.Activity;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$onViewCreated$8 */
public final class AtFriendsFragment$onViewCreated$8 extends FrescoRecycleViewScrollListener {

    /* renamed from: a */
    final /* synthetic */ AtFriendsFragment f79082a;

    /* renamed from: b */
    final /* synthetic */ View f79083b;

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        ((IndexView) this.f79082a.mo76466c(R.id.b0k)).setRecycleViewPos(AtFriendsFragment.m98545a(this.f79082a).mo5445j());
        C25713b.m84474a((Activity) this.f79082a.getActivity(), (View) (DmtEditText) this.f79082a.mo76466c(R.id.czp));
    }

    AtFriendsFragment$onViewCreated$8(AtFriendsFragment atFriendsFragment, View view, Context context) {
        this.f79082a = atFriendsFragment;
        this.f79083b = view;
        super(context);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (((float) i2) > C9738o.m28708b(this.f79082a.getContext(), 10.0f)) {
            C25713b.m84474a((Activity) this.f79082a.getActivity(), (View) (DmtEditText) this.f79082a.mo76466c(R.id.czp));
        }
    }
}
