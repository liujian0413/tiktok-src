package com.p280ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchGuessWordItemViewHolder;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27012a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.GuessWordLineViewHolder */
public final class GuessWordLineViewHolder extends C1293v {

    /* renamed from: b */
    public static final C26508a f69908b = new C26508a(null);

    /* renamed from: a */
    public List<Word> f69909a = C7525m.m23461a();

    /* renamed from: c */
    private RecyclerView f69910c;

    /* renamed from: d */
    private final C1262a<SearchGuessWordItemViewHolder> f69911d;

    /* renamed from: e */
    private DmtTextView f69912e;

    /* renamed from: f */
    private ViewGroup f69913f;

    /* renamed from: g */
    private View f69914g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.GuessWordLineViewHolder$a */
    public static final class C26508a {
        private C26508a() {
        }

        public /* synthetic */ C26508a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static GuessWordLineViewHolder m87177a(ViewGroup viewGroup, C27012a aVar) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a73, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new GuessWordLineViewHolder(inflate, aVar);
        }
    }

    /* renamed from: a */
    private static boolean m87172a() {
        if (C26654b.m87580h() || !C26533a.m87229a() || !C26533a.m87231b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo68137a(List<Word> list) {
        C7573i.m23587b(list, "list");
        if (C7573i.m23585a((Object) list, (Object) GuessWordsViewHolder.f69487h)) {
            this.f69913f.setVisibility(8);
            return;
        }
        this.f69909a = list;
        C26533a.m87230b(!this.f69909a.isEmpty());
        if (!m87172a()) {
            this.f69913f.setVisibility(8);
        } else {
            this.f69913f.setVisibility(0);
        }
        if (!C26654b.m87580h()) {
            this.f69910c.setPadding(0, 0, 0, (int) C9738o.m28708b(this.f69910c.getContext(), 48.0f));
            this.f69910c.setClipToPadding(false);
        }
        this.f69914g.setVisibility(8);
        int size = list.size();
        if ((!list.isEmpty()) && !((Word) C7525m.m23511f(list)).isShowed()) {
            C6907h.m21524a("trending_show", (Map) C22984d.m75611a().mo59970a("words_num", size).mo59973a("words_source", "recom_search").f60753a);
        }
        this.f69911d.notifyDataSetChanged();
    }

    public GuessWordLineViewHolder(final View view, final C27012a aVar) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f69911d = new C1262a<SearchGuessWordItemViewHolder>(this) {

            /* renamed from: a */
            final /* synthetic */ GuessWordLineViewHolder f69915a;

            public final int getItemCount() {
                return this.f69915a.f69909a.size();
            }

            {
                this.f69915a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onBindViewHolder(SearchGuessWordItemViewHolder searchGuessWordItemViewHolder, int i) {
                C7573i.m23587b(searchGuessWordItemViewHolder, "viewholder");
                searchGuessWordItemViewHolder.mo68036a((Word) this.f69915a.f69909a.get(i), i);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public SearchGuessWordItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C7573i.m23587b(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2r, viewGroup, false);
                C7573i.m23582a((Object) inflate, "v");
                return new SearchGuessWordItemViewHolder(inflate, aVar);
            }
        };
        View findViewById = view.findViewById(R.id.bng);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.listview)");
        this.f69910c = (RecyclerView) findViewById;
        this.f69910c.setAdapter(this.f69911d);
        View findViewById2 = view.findViewById(R.id.eck);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.view_decoration)");
        this.f69914g = findViewById2;
        this.f69910c.setLayoutManager(new LinearLayoutManager(view.getContext()) {
            /* renamed from: f */
            public final boolean mo5441f() {
                return false;
            }
        });
        View findViewById3 = view.findViewById(R.id.ecm);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.view_decoration_text)");
        this.f69912e = (DmtTextView) findViewById3;
        this.f69912e.setText(this.f69912e.getResources().getString(R.string.aro));
        View findViewById4 = view.findViewById(R.id.ecl);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.view_decoration_ll)");
        this.f69913f = (ViewGroup) findViewById4;
    }
}
