package com.p280ss.android.ugc.aweme.anchor.binder.base.module;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22528c;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.EmptyRecommendItemViewBinder */
public final class EmptyRecommendItemViewBinder extends BaseItemViewBinder<C22528c, C1293v> {

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.EmptyRecommendItemViewBinder$EmptyRecommendItemViewBinder reason: collision with other inner class name */
    public final class C48895EmptyRecommendItemViewBinder extends C1293v {

        /* renamed from: a */
        final /* synthetic */ EmptyRecommendItemViewBinder f60038a;

        public C48895EmptyRecommendItemViewBinder(EmptyRecommendItemViewBinder emptyRecommendItemViewBinder, View view) {
            C7573i.m23587b(view, "itemView");
            this.f60038a = emptyRecommendItemViewBinder;
            super(view);
        }
    }

    /* renamed from: a */
    private static void m74516a(C1293v vVar, C22528c cVar) {
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(cVar, "module");
    }

    public EmptyRecommendItemViewBinder(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m74516a(vVar, (C22528c) obj);
    }

    /* renamed from: a */
    public final C1293v mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.t7, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…end_empty, parent, false)");
        return new C48895EmptyRecommendItemViewBinder(this, inflate);
    }
}
