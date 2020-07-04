package com.p280ss.android.ugc.aweme.themechange.base;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView$init$1 */
public final class AVDmtPanelRecyleView$init$1 extends C1272h {

    /* renamed from: a */
    final /* synthetic */ AVDmtPanelRecyleView f109580a;

    AVDmtPanelRecyleView$init$1(AVDmtPanelRecyleView aVDmtPanelRecyleView) {
        this.f109580a = aVDmtPanelRecyleView;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        int f = RecyclerView.m5892f(view);
        if (f != -1) {
            if (f == 0) {
                if (this.f109580a.mo61102n()) {
                    rect.right = this.f109580a.f109578N;
                } else {
                    rect.left = this.f109580a.f109578N;
                }
            }
            C1262a adapter = recyclerView.getAdapter();
            if (adapter == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) adapter, "parent.adapter!!");
            if (f == adapter.getItemCount() - 1) {
                if (this.f109580a.mo61102n()) {
                    rect.left = this.f109580a.f109579O;
                } else {
                    rect.right = this.f109580a.f109579O;
                }
            } else if (this.f109580a.mo61102n()) {
                rect.left = this.f109580a.f109577M;
            } else {
                rect.right = this.f109580a.f109577M;
            }
        }
    }
}
