package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import kotlin.TypeCastException;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$onViewCreated$$inlined$apply$lambda$3 */
public final class JediAwemeListFragment$onViewCreated$$inlined$apply$lambda$3 extends C1241a {

    /* renamed from: c */
    final /* synthetic */ JediAwemeAdapter f94017c;

    /* renamed from: d */
    final /* synthetic */ JediAwemeListFragment f94018d;

    /* renamed from: a */
    public final int mo5386a(int i) {
        C1273i iVar;
        if (!((Boolean) this.f94017c.mo90806b(4).invoke(Integer.valueOf(i))).booleanValue()) {
            return 1;
        }
        RecyclerView recyclerView = this.f94018d.f93943g;
        if (recyclerView != null) {
            iVar = recyclerView.getLayoutManager();
        } else {
            iVar = null;
        }
        if (iVar != null) {
            return ((GridLayoutManager) iVar).f4716b;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
    }

    JediAwemeListFragment$onViewCreated$$inlined$apply$lambda$3(JediAwemeAdapter jediAwemeAdapter, JediAwemeListFragment jediAwemeListFragment) {
        this.f94017c = jediAwemeAdapter;
        this.f94018d = jediAwemeListFragment;
    }
}
