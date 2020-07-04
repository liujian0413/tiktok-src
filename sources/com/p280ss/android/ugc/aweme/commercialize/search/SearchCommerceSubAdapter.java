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

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchCommerceSubAdapter */
public final class SearchCommerceSubAdapter extends C1262a<SearchCommerceSubViewHolder> {

    /* renamed from: a */
    public final List<SearchCommerceInfoStruct> f66087a;

    /* renamed from: b */
    public final C7562b<String, C7581n> f66088b;

    /* renamed from: c */
    private final C7562b<SearchCommerceInfoStruct, C7581n> f66089c;

    /* renamed from: d */
    private final C7562b<SearchCommerceInfoStruct, C7581n> f66090d;

    public final int getItemCount() {
        return this.f66087a.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(SearchCommerceSubViewHolder searchCommerceSubViewHolder, int i) {
        C7573i.m23587b(searchCommerceSubViewHolder, "holder");
        searchCommerceSubViewHolder.mo65529a((SearchCommerceInfoStruct) this.f66087a.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public SearchCommerceSubViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a_t, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new SearchCommerceSubViewHolder(inflate, this.f66088b, this.f66089c, this.f66090d);
    }
}
