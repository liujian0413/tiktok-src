package com.p280ss.android.ugc.aweme.commercialize.search;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchCommerceInfoStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchCommerceViewMoreAdapter */
public final class SearchCommerceViewMoreAdapter extends C1262a<SearchCommerceViewMoreViewHolder> {

    /* renamed from: a */
    public final List<SearchCommerceInfoStruct> f66099a;

    /* renamed from: b */
    public final C7562b<String, C7581n> f66100b;

    /* renamed from: c */
    private final C7562b<SearchCommerceInfoStruct, C7581n> f66101c;

    /* renamed from: d */
    private final C7562b<SearchCommerceInfoStruct, C7581n> f66102d;

    public final int getItemCount() {
        return this.f66099a.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(SearchCommerceViewMoreViewHolder searchCommerceViewMoreViewHolder, int i) {
        C7573i.m23587b(searchCommerceViewMoreViewHolder, "holder");
        searchCommerceViewMoreViewHolder.mo65531a((SearchCommerceInfoStruct) this.f66099a.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public SearchCommerceViewMoreViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a_o, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new SearchCommerceViewMoreViewHolder(inflate, this.f66100b, this.f66101c, this.f66102d);
    }

    public SearchCommerceViewMoreAdapter(List<? extends SearchCommerceInfoStruct> list, C7562b<? super String, C7581n> bVar, C7562b<? super SearchCommerceInfoStruct, C7581n> bVar2, C7562b<? super SearchCommerceInfoStruct, C7581n> bVar3) {
        C7573i.m23587b(list, "list");
        C7573i.m23587b(bVar, "click");
        C7573i.m23587b(bVar2, "mobViewMoreShow");
        C7573i.m23587b(bVar3, "mobViewMoreClick");
        this.f66099a = list;
        this.f66100b = bVar;
        this.f66101c = bVar2;
        this.f66102d = bVar3;
    }
}
