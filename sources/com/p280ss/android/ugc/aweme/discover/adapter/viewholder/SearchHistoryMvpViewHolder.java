package com.p280ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27014c;
import com.p280ss.android.ugc.aweme.widget.flowlayout.C43554a;
import com.p280ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.p280ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryMvpViewHolder */
public final class SearchHistoryMvpViewHolder extends C1293v {

    /* renamed from: b */
    public static final C26512a f69927b = new C26512a(null);

    /* renamed from: a */
    public C27014c f69928a;

    /* renamed from: c */
    private final View f69929c;

    /* renamed from: d */
    private final TagFlowLayout f69930d;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryMvpViewHolder$a */
    public static final class C26512a {
        private C26512a() {
        }

        public /* synthetic */ C26512a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchHistoryMvpViewHolder m87185a(ViewGroup viewGroup, C27014c cVar) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2g, viewGroup, false);
            C7573i.m23582a((Object) inflate, "inflate");
            return new SearchHistoryMvpViewHolder(inflate, cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryMvpViewHolder$b */
    public static final class C26513b extends C43554a<SearchHistory> {

        /* renamed from: a */
        final /* synthetic */ SearchHistoryMvpViewHolder f69931a;

        /* renamed from: b */
        final /* synthetic */ List f69932b;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryMvpViewHolder$b$a */
        public static final class C26514a extends C27009an {

            /* renamed from: a */
            final /* synthetic */ C26513b f69933a;

            /* renamed from: b */
            final /* synthetic */ SearchHistory f69934b;

            /* renamed from: c */
            final /* synthetic */ int f69935c;

            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                C7573i.m23587b(view, "view");
                C7573i.m23587b(motionEvent, "event");
                C27014c cVar = this.f69933a.f69931a.f69928a;
                if (cVar != null) {
                    cVar.mo69713a(this.f69934b, this.f69935c);
                }
            }

            C26514a(C26513b bVar, SearchHistory searchHistory, int i) {
                this.f69933a = bVar;
                this.f69934b = searchHistory;
                this.f69935c = i;
            }
        }

        C26513b(SearchHistoryMvpViewHolder searchHistoryMvpViewHolder, List list, List list2) {
            this.f69931a = searchHistoryMvpViewHolder;
            this.f69932b = list;
            super(list2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View mo67958a(FlowLayout flowLayout, int i, SearchHistory searchHistory) {
            C7573i.m23587b(flowLayout, "parent");
            C7573i.m23587b(searchHistory, "item");
            View view = this.f69931a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.wm, flowLayout, false);
            TextView textView = (TextView) inflate.findViewById(R.id.dvv);
            C7573i.m23582a((Object) textView, "word");
            textView.setText(searchHistory.keyword);
            inflate.setOnTouchListener(new C26514a(this, searchHistory, i));
            C7573i.m23582a((Object) inflate, "root");
            return inflate;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryMvpViewHolder$c */
    static final class C26515c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchHistoryMvpViewHolder f69936a;

        C26515c(SearchHistoryMvpViewHolder searchHistoryMvpViewHolder) {
            this.f69936a = searchHistoryMvpViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27014c cVar = this.f69936a.f69928a;
            if (cVar != null) {
                cVar.mo69718l();
            }
        }
    }

    /* renamed from: a */
    public final void mo68139a(List<? extends SearchHistory> list) {
        C7573i.m23587b(list, "histories");
        this.f69930d.setAdapter(new C26513b(this, list, list));
        this.f69929c.setOnClickListener(new C26515c(this));
    }

    public SearchHistoryMvpViewHolder(View view, C27014c cVar) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f69928a = cVar;
        View findViewById = view.findViewById(R.id.wr);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.clear_history)");
        this.f69929c = findViewById;
        View findViewById2 = view.findViewById(R.id.dg2);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.tag_history)");
        this.f69930d = (TagFlowLayout) findViewById2;
    }
}
