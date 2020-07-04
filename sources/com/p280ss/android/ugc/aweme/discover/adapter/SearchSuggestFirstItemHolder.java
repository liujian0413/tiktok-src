package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSuggestFirstItemHolder */
public final class SearchSuggestFirstItemHolder extends C1293v {

    /* renamed from: b */
    public static final C26471a f69821b = new C26471a(null);

    /* renamed from: a */
    public final SearchSquareAdapter<?> f69822a;

    /* renamed from: c */
    private View f69823c;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSuggestFirstItemHolder$a */
    public static final class C26471a {
        private C26471a() {
        }

        public /* synthetic */ C26471a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchSuggestFirstItemHolder m87103a(ViewGroup viewGroup, SearchSquareAdapter<?> searchSquareAdapter) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(searchSquareAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2s, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new SearchSuggestFirstItemHolder(inflate, searchSquareAdapter);
        }
    }

    /* renamed from: a */
    public final void mo68093a() {
        if (C6399b.m19947w()) {
            this.f69823c.setAlpha(0.12f);
        } else {
            this.f69823c.setAlpha(0.2f);
        }
        if (this.f69822a.mo68069a() > 0) {
            this.f69823c.setVisibility(0);
        } else {
            this.f69823c.setVisibility(8);
        }
    }

    public SearchSuggestFirstItemHolder(View view, SearchSquareAdapter<?> searchSquareAdapter) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(searchSquareAdapter, "adapter");
        super(view);
        this.f69822a = searchSquareAdapter;
        View findViewById = view.findViewById(R.id.bmb);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.…line_upper_suggest_first)");
        this.f69823c = findViewById;
    }
}
