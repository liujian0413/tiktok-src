package com.p280ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchHistoryItemViewHolder;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27014c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryLinesViewHolder */
public final class SearchHistoryLinesViewHolder extends C1293v {

    /* renamed from: b */
    public static final C26511a f69918b = new C26511a(null);

    /* renamed from: a */
    public List<? extends SearchHistory> f69919a = C7525m.m23461a();

    /* renamed from: c */
    private RecyclerView f69920c;

    /* renamed from: d */
    private final C1262a<SearchHistoryItemViewHolder> f69921d;

    /* renamed from: e */
    private DmtTextView f69922e;

    /* renamed from: f */
    private ViewGroup f69923f;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryLinesViewHolder$a */
    public static final class C26511a {
        private C26511a() {
        }

        public /* synthetic */ C26511a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchHistoryLinesViewHolder m87183a(ViewGroup viewGroup, C27014c cVar) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a73, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new SearchHistoryLinesViewHolder(inflate, cVar);
        }
    }

    /* renamed from: a */
    private static boolean m87178a() {
        if (!C6399b.m19944t() || !C26654b.m87580h() || !C26533a.m87231b() || !C26533a.m87229a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo68138a(List<? extends SearchHistory> list) {
        C7573i.m23587b(list, "list");
        this.f69919a = list;
        if (!m87178a()) {
            this.f69923f.setVisibility(8);
        } else {
            this.f69923f.setVisibility(0);
        }
        this.f69921d.notifyDataSetChanged();
    }

    public SearchHistoryLinesViewHolder(final View view, final C27014c cVar) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f69921d = new C1262a<SearchHistoryItemViewHolder>(this) {

            /* renamed from: a */
            final /* synthetic */ SearchHistoryLinesViewHolder f69924a;

            public final int getItemCount() {
                return this.f69924a.f69919a.size();
            }

            {
                this.f69924a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public SearchHistoryItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C7573i.m23587b(viewGroup, "parent");
                SearchHistoryItemViewHolder a = SearchHistoryItemViewHolder.m86990a(viewGroup, cVar);
                C7573i.m23582a((Object) a, "SearchHistoryItemViewHol…te(parent, actionHandler)");
                return a;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onBindViewHolder(SearchHistoryItemViewHolder searchHistoryItemViewHolder, int i) {
                C7573i.m23587b(searchHistoryItemViewHolder, "viewholder");
                searchHistoryItemViewHolder.mo68038a((SearchHistory) this.f69924a.f69919a.get(i), i);
            }
        };
        View findViewById = view.findViewById(R.id.bng);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.listview)");
        this.f69920c = (RecyclerView) findViewById;
        this.f69920c.setAdapter(this.f69921d);
        this.f69920c.setLayoutManager(new LinearLayoutManager(view.getContext()) {
            /* renamed from: f */
            public final boolean mo5441f() {
                return false;
            }
        });
        if (C6399b.m19945u()) {
            LayoutParams layoutParams = this.f69920c.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = C23486n.m77122a(12.0d);
                this.f69920c.setLayoutParams(marginLayoutParams);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        View findViewById2 = view.findViewById(R.id.ecm);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.view_decoration_text)");
        this.f69922e = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ecl);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.view_decoration_ll)");
        this.f69923f = (ViewGroup) findViewById3;
    }
}
