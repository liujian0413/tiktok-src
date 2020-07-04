package com.p280ss.android.ugc.aweme.anchor.binder.base.module;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22528c;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.EmptyItemViewBinder */
public final class EmptyItemViewBinder extends BaseItemViewBinder<C22528c, C1293v> {

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.EmptyItemViewBinder$EmptyItemViewHolder */
    public final class EmptyItemViewHolder extends C1293v {

        /* renamed from: a */
        final /* synthetic */ EmptyItemViewBinder f60037a;

        public EmptyItemViewHolder(EmptyItemViewBinder emptyItemViewBinder, View view) {
            C7573i.m23587b(view, "itemView");
            this.f60037a = emptyItemViewBinder;
            super(view);
        }
    }

    /* renamed from: a */
    private static void m74513a(C1293v vVar, C22528c cVar) {
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(cVar, "module");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m74513a(vVar, (C22528c) obj);
    }

    /* renamed from: a */
    public final C1293v mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "parent");
        return new EmptyItemViewHolder(this, new View(this.f60023b));
    }
}
