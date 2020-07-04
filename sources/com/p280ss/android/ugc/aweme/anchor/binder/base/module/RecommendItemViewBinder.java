package com.p280ss.android.ugc.aweme.anchor.binder.base.module;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22528c;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder.BaseItemViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.RecommendItemViewBinder */
public final class RecommendItemViewBinder extends BaseItemViewBinder<C22528c, RecommendHolder> {

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.RecommendItemViewBinder$RecommendHolder */
    public final class RecommendHolder extends BaseItemViewHolder {

        /* renamed from: b */
        public final DmtTextView f60040b;

        /* renamed from: c */
        final /* synthetic */ RecommendItemViewBinder f60041c;

        public RecommendHolder(RecommendItemViewBinder recommendItemViewBinder, View view) {
            C7573i.m23587b(view, "itemView");
            this.f60041c = recommendItemViewBinder;
            super(recommendItemViewBinder, view);
            View findViewById = view.findViewById(R.id.e7d);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.txt_title)");
            this.f60040b = (DmtTextView) findViewById;
        }
    }

    /* renamed from: a */
    private static void m74523a(RecommendHolder recommendHolder, C22528c cVar) {
        C7573i.m23587b(recommendHolder, "holder");
        C7573i.m23587b(cVar, "module");
    }

    public RecommendItemViewBinder(Activity activity) {
        super(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public RecommendHolder mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.t6, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…mmend_add, parent, false)");
        return new RecommendHolder(this, inflate);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m74523a((RecommendHolder) vVar, (C22528c) obj);
    }
}
