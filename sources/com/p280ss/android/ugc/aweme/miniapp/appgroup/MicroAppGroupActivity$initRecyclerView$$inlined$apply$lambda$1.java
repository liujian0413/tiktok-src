package com.p280ss.android.ugc.aweme.miniapp.appgroup;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import com.p280ss.android.ugc.aweme.miniapp.appgroup.C33371d.C33372a;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$initRecyclerView$$inlined$apply$lambda$1 */
public final class MicroAppGroupActivity$initRecyclerView$$inlined$apply$lambda$1 extends C1241a {

    /* renamed from: c */
    final /* synthetic */ GridLayoutManager f87173c;

    /* renamed from: d */
    final /* synthetic */ MicroAppGroupActivity f87174d;

    /* renamed from: a */
    public final int mo5386a(int i) {
        int itemViewType = this.f87174d.mo85544g().getItemViewType(i);
        if (itemViewType == C33372a.m107935a() || itemViewType == C33372a.m107936b() || itemViewType == C33372a.m107938d()) {
            return this.f87173c.f4716b;
        }
        if (itemViewType == C33372a.m107937c() || itemViewType == C33372a.m107939e()) {
            return 1;
        }
        return 0;
    }

    MicroAppGroupActivity$initRecyclerView$$inlined$apply$lambda$1(GridLayoutManager gridLayoutManager, MicroAppGroupActivity microAppGroupActivity) {
        this.f87173c = gridLayoutManager;
        this.f87174d = microAppGroupActivity;
    }
}
