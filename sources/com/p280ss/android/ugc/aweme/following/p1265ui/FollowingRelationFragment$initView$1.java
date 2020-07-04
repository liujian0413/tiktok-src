package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.support.design.widget.AppBarLayout;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.BooleanRef;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$initView$1 */
public final class FollowingRelationFragment$initView$1 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ FollowingRelationFragment f78178a;

    /* renamed from: b */
    final /* synthetic */ WrapLinearLayoutManager f78179b;

    /* renamed from: c */
    final /* synthetic */ BooleanRef f78180c;

    FollowingRelationFragment$initView$1(FollowingRelationFragment followingRelationFragment, WrapLinearLayoutManager wrapLinearLayoutManager, BooleanRef booleanRef) {
        this.f78178a = followingRelationFragment;
        this.f78179b = wrapLinearLayoutManager;
        this.f78180c = booleanRef;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LayoutParams layoutParams;
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (this.f78179b.mo5446k() == 0) {
            ((AppBarLayout) this.f78178a.mo60553a((int) R.id.gl)).mo1224a(true, true);
        }
        if (this.f78180c.element) {
            this.f78180c.element = false;
            int m = this.f78179b.mo5448m() + 1;
            RecyclerView recyclerView2 = (RecyclerView) this.f78178a.mo60553a((int) R.id.cxi);
            C7573i.m23582a((Object) recyclerView2, "rv_list");
            C1262a adapter = recyclerView2.getAdapter();
            if (adapter != null && m == adapter.getItemCount()) {
                LinearLayout linearLayout = (LinearLayout) this.f78178a.mo60553a((int) R.id.d0y);
                if (linearLayout != null) {
                    layoutParams = linearLayout.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
                    if (layoutParams2 != null) {
                        layoutParams2.f1291a = 0;
                    }
                    LinearLayout linearLayout2 = (LinearLayout) this.f78178a.mo60553a((int) R.id.d0y);
                    if (linearLayout2 != null) {
                        linearLayout2.setLayoutParams(layoutParams2);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.design.widget.AppBarLayout.LayoutParams");
                }
            }
        }
    }
}
