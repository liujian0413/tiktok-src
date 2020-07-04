package com.p280ss.android.ugc.aweme.anchor.binder.base.module;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22528c;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder.BaseItemViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.RecentlyItemViewBinder */
public final class RecentlyItemViewBinder extends BaseItemViewBinder<C22528c, RecentlyHolder> {

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.RecentlyItemViewBinder$RecentlyHolder */
    public final class RecentlyHolder extends BaseItemViewHolder {

        /* renamed from: b */
        final /* synthetic */ RecentlyItemViewBinder f60039b;

        public RecentlyHolder(RecentlyItemViewBinder recentlyItemViewBinder, View view) {
            C7573i.m23587b(view, "itemView");
            this.f60039b = recentlyItemViewBinder;
            super(recentlyItemViewBinder, view);
        }
    }

    /* renamed from: a */
    private static void m74519a(RecentlyHolder recentlyHolder, C22528c cVar) {
        C7573i.m23587b(recentlyHolder, "holder");
        C7573i.m23587b(cVar, "module");
    }

    public RecentlyItemViewBinder(Activity activity) {
        super(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public RecentlyHolder mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.t3, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…ently_add, parent, false)");
        return new RecentlyHolder(this, inflate);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m74519a((RecentlyHolder) vVar, (C22528c) obj);
    }
}
