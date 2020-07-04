package com.p280ss.android.ugc.aweme.anchor.binder.base.module;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22526a;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22528c;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder.BaseItemViewHolder;
import com.p280ss.android.ugc.aweme.anchor.binder.base.cell.IconItemViewBinder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p1886me.drakeet.multitype.MultiTypeAdapter;

/* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.CollectionItemViewBinder */
public final class CollectionItemViewBinder extends BaseItemViewBinder<C22528c, CollectionHolder> {

    /* renamed from: c */
    public final MultiTypeAdapter f60033c = new MultiTypeAdapter();

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.CollectionItemViewBinder$CollectionHolder */
    public final class CollectionHolder extends BaseItemViewHolder {

        /* renamed from: b */
        public final RecyclerView f60034b;

        /* renamed from: c */
        final /* synthetic */ CollectionItemViewBinder f60035c;

        public CollectionHolder(CollectionItemViewBinder collectionItemViewBinder, View view) {
            C7573i.m23587b(view, "itemView");
            this.f60035c = collectionItemViewBinder;
            super(collectionItemViewBinder, view);
            View findViewById = view.findViewById(R.id.cqi);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.recycler_icons)");
            this.f60034b = (RecyclerView) findViewById;
            Context context = view.getContext();
            this.f60034b.setLayoutManager(new LinearLayoutManager(context, 0, false));
            this.f60034b.mo5525a((C1272h) new ItemDecorationSpace((int) C9738o.m28708b(context, 4.0f)));
            this.f60034b.setAdapter(collectionItemViewBinder.f60033c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.module.CollectionItemViewBinder$ItemDecorationSpace */
    public static final class ItemDecorationSpace extends C1272h {

        /* renamed from: a */
        public final int f60036a;

        public ItemDecorationSpace(int i) {
            this.f60036a = i;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
            C7573i.m23587b(rect, "outRect");
            C7573i.m23587b(view, "view");
            C7573i.m23587b(recyclerView, "parent");
            C7573i.m23587b(sVar, "state");
            rect.left = this.f60036a;
        }
    }

    public CollectionItemViewBinder(Activity activity) {
        super(activity);
        this.f60033c.mo120457a(C22526a.class, new IconItemViewBinder(activity));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public CollectionHolder mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.sw, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…ollection, parent, false)");
        return new CollectionHolder(this, inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21966a(CollectionHolder collectionHolder, C22528c cVar) {
        boolean z;
        C7573i.m23587b(collectionHolder, "holder");
        C7573i.m23587b(cVar, "module");
        Collection collection = cVar.f60012e;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            MultiTypeAdapter multiTypeAdapter = this.f60033c;
            List<C22526a> list = cVar.f60012e;
            if (list == null) {
                C7573i.m23580a();
            }
            multiTypeAdapter.mo11418a(list);
            this.f60033c.notifyItemRangeChanged(0, this.f60033c.f123129a.size());
        }
    }
}
