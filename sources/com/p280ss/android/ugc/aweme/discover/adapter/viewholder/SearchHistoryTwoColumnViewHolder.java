package com.p280ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchIntermediateStyleExperiment;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27014c;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryTwoColumnViewHolder */
public final class SearchHistoryTwoColumnViewHolder extends C1293v implements OnClickListener {

    /* renamed from: a */
    public static final int f69937a;

    /* renamed from: b */
    public static final C26516a f69938b = new C26516a(null);

    /* renamed from: c */
    private final RecyclerView f69939c;

    /* renamed from: d */
    private final DmtTextView f69940d;

    /* renamed from: e */
    private final DmtTextView f69941e;

    /* renamed from: f */
    private final ImageView f69942f;

    /* renamed from: g */
    private final ImageView f69943g;

    /* renamed from: h */
    private final DmtTextView f69944h;

    /* renamed from: i */
    private final C26517b f69945i = new C26517b();

    /* renamed from: j */
    private List<? extends SearchHistory> f69946j;

    /* renamed from: k */
    private final C27014c f69947k;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryTwoColumnViewHolder$a */
    public static final class C26516a {
        private C26516a() {
        }

        /* renamed from: a */
        public static int m87192a() {
            return SearchHistoryTwoColumnViewHolder.f69937a;
        }

        public /* synthetic */ C26516a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchHistoryTwoColumnViewHolder m87193a(ViewGroup viewGroup, C27014c cVar) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2h, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new SearchHistoryTwoColumnViewHolder(inflate, cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryTwoColumnViewHolder$b */
    static final class C26517b extends C1262a<C26519c> {

        /* renamed from: e */
        public static final C26518a f69948e = new C26518a(null);

        /* renamed from: a */
        public C27014c f69949a;

        /* renamed from: b */
        public int f69950b;

        /* renamed from: c */
        public final List<SearchHistory> f69951c = new ArrayList();

        /* renamed from: d */
        public final List<SearchHistory> f69952d = new ArrayList();

        /* renamed from: f */
        private int f69953f;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryTwoColumnViewHolder$b$a */
        public static final class C26518a {
            private C26518a() {
            }

            public /* synthetic */ C26518a(C7571f fVar) {
                this();
            }
        }

        public final int getItemCount() {
            return this.f69951c.size();
        }

        /* renamed from: b */
        public final void mo68145b() {
            this.f69950b = 0;
            m87196b(this.f69952d);
        }

        /* renamed from: c */
        public final void mo68146c() {
            this.f69953f = this.f69950b;
            this.f69950b = 2;
            m87196b(this.f69952d);
        }

        /* renamed from: d */
        public final void mo68147d() {
            this.f69950b = this.f69953f;
            m87196b(this.f69952d);
        }

        /* renamed from: a */
        public final void mo68143a() {
            this.f69950b = 1;
            m87196b(this.f69952d);
        }

        /* renamed from: b */
        private final void m87196b(List<? extends SearchHistory> list) {
            this.f69951c.clear();
            switch (this.f69950b) {
                case 0:
                    if (list != null) {
                        if (list.size() <= C26516a.m87192a()) {
                            this.f69951c.addAll(list);
                            break;
                        } else {
                            this.f69951c.addAll(list.subList(0, C26516a.m87192a()));
                            break;
                        }
                    }
                    break;
                case 1:
                    if (list != null) {
                        this.f69951c.addAll(list);
                        break;
                    }
                    break;
                default:
                    if (list != null) {
                        this.f69951c.addAll(list);
                        break;
                    }
                    break;
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public final void mo68144a(List<? extends SearchHistory> list) {
            this.f69952d.clear();
            if (list != null) {
                this.f69952d.addAll(list);
            }
            m87196b(this.f69952d);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C26519c onCreateViewHolder(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "parent");
            return C26520a.m87204a(viewGroup, this.f69949a);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(C26519c cVar, int i) {
            boolean z;
            C7573i.m23587b(cVar, "holder");
            SearchHistory searchHistory = (SearchHistory) this.f69951c.get(i);
            if (this.f69950b == 2) {
                z = true;
            } else {
                z = false;
            }
            cVar.mo68148a(searchHistory, i, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryTwoColumnViewHolder$c */
    static final class C26519c extends C1293v {

        /* renamed from: b */
        public static final C26520a f69954b = new C26520a(null);

        /* renamed from: a */
        public final C27014c f69955a;

        /* renamed from: c */
        private final DmtTextView f69956c;

        /* renamed from: d */
        private final ImageView f69957d;

        /* renamed from: e */
        private final ViewGroup f69958e;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryTwoColumnViewHolder$c$a */
        public static final class C26520a {
            private C26520a() {
            }

            public /* synthetic */ C26520a(C7571f fVar) {
                this();
            }

            /* renamed from: a */
            public static C26519c m87204a(ViewGroup viewGroup, C27014c cVar) {
                C7573i.m23587b(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2d, viewGroup, false);
                C7573i.m23582a((Object) inflate, "view");
                return new C26519c(inflate, viewGroup, cVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryTwoColumnViewHolder$c$b */
        static final class C26521b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C26519c f69959a;

            /* renamed from: b */
            final /* synthetic */ boolean f69960b;

            /* renamed from: c */
            final /* synthetic */ SearchHistory f69961c;

            /* renamed from: d */
            final /* synthetic */ int f69962d;

            C26521b(C26519c cVar, boolean z, SearchHistory searchHistory, int i) {
                this.f69959a = cVar;
                this.f69960b = z;
                this.f69961c = searchHistory;
                this.f69962d = i;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f69960b) {
                    C27014c cVar = this.f69959a.f69955a;
                    if (cVar != null) {
                        cVar.mo69716b(this.f69961c, this.f69962d);
                    }
                } else {
                    C27014c cVar2 = this.f69959a.f69955a;
                    if (cVar2 != null) {
                        cVar2.mo69713a(this.f69961c, this.f69962d);
                    }
                }
            }
        }

        /* renamed from: a */
        private final void m87202a() {
            int i;
            ViewGroup viewGroup = this.f69958e;
            if (viewGroup != null) {
                C1273i layoutManager = ((RecyclerView) viewGroup).getLayoutManager();
                if (layoutManager != null) {
                    int a = ((GridLayoutManager) layoutManager).f4721g.mo5387a(getAdapterPosition(), 2);
                    View view = this.itemView;
                    C7573i.m23582a((Object) view, "itemView");
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        if (C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) == 3) {
                            i = C23486n.m77122a(8.0d);
                        } else {
                            i = C23486n.m77122a(16.0d);
                        }
                        if (a % 2 == 0) {
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = i;
                        } else {
                            marginLayoutParams.leftMargin = i;
                            marginLayoutParams.rightMargin = 0;
                        }
                        View view2 = this.itemView;
                        C7573i.m23582a((Object) view2, "itemView");
                        view2.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
        }

        public C26519c(View view, ViewGroup viewGroup, C27014c cVar) {
            C7573i.m23587b(view, "itemView");
            C7573i.m23587b(viewGroup, "parent");
            super(view);
            this.f69958e = viewGroup;
            this.f69955a = cVar;
            this.f69956c = (DmtTextView) view.findViewById(R.id.e38);
            this.f69957d = (ImageView) view.findViewById(R.id.b8a);
            if (C26654b.m87573a()) {
                this.f69956c.setTextColor(view.getResources().getColor(R.color.iv));
            }
        }

        /* renamed from: a */
        public final void mo68148a(SearchHistory searchHistory, int i, boolean z) {
            int i2;
            C7573i.m23587b(searchHistory, "item");
            m87202a();
            ImageView imageView = this.f69957d;
            C7573i.m23582a((Object) imageView, "deleteView");
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            DmtTextView dmtTextView = this.f69956c;
            C7573i.m23582a((Object) dmtTextView, "textView");
            dmtTextView.setText(searchHistory.keyword);
            this.itemView.setOnClickListener(new C26521b(this, z, searchHistory, i));
        }
    }

    /* renamed from: b */
    private static void m87190b() {
        C6907h.m21524a("search_history", (Map) C22984d.m75611a().mo59973a("action_type", "show_all").f60753a);
    }

    static {
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        Integer searchHistoryCollapseNum = a.getSearchHistoryCollapseNum();
        C7573i.m23582a((Object) searchHistoryCollapseNum, "SettingsReader.get().searchHistoryCollapseNum");
        f69937a = searchHistoryCollapseNum.intValue();
    }

    /* renamed from: a */
    private final void m87189a() {
        int i;
        List<? extends SearchHistory> list = this.f69946j;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i <= f69937a || this.f69945i.f69950b == 2) {
            this.f69943g.setVisibility(8);
        } else {
            this.f69943g.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo68141a(List<? extends SearchHistory> list) {
        this.f69946j = list;
        this.f69945i.mo68144a(list);
        m87189a();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        int id = view.getId();
        if (id == R.id.b8a) {
            this.f69942f.setVisibility(4);
            this.f69940d.setVisibility(0);
            this.f69941e.setVisibility(0);
            this.f69943g.setVisibility(8);
            this.f69945i.mo68146c();
            return;
        }
        if (id == R.id.dt2) {
            C27014c cVar = this.f69947k;
            if (cVar != null) {
                cVar.mo69718l();
            }
        } else if (id == R.id.dti) {
            this.f69942f.setVisibility(0);
            this.f69940d.setVisibility(8);
            this.f69941e.setVisibility(8);
            this.f69945i.mo68147d();
            m87189a();
        } else if (id == R.id.b61 || id == R.id.e3f) {
            if (this.f69945i.f69950b == 0) {
                this.f69945i.mo68143a();
                this.f69943g.setImageResource(R.drawable.a8e);
                if (this.f69943g.getVisibility() == 0) {
                    m87190b();
                }
            } else if (this.f69945i.f69950b == 1) {
                this.f69945i.mo68145b();
                this.f69943g.setImageResource(R.drawable.a8b);
            }
        }
    }

    public SearchHistoryTwoColumnViewHolder(View view, C27014c cVar) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f69947k = cVar;
        View findViewById = view.findViewById(R.id.cqp);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.recycler_view)");
        this.f69939c = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.dti);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.tv_done)");
        this.f69940d = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dt2);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.tv_delete_all)");
        this.f69941e = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.b8a);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.iv_delete)");
        this.f69942f = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.b61);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.iv_arrow)");
        this.f69943g = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.e3f);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.tv_title)");
        this.f69944h = (DmtTextView) findViewById6;
        this.f69939c.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
        this.f69939c.setAdapter(this.f69945i);
        this.f69945i.f69949a = this.f69947k;
        OnClickListener onClickListener = this;
        this.f69942f.setOnClickListener(onClickListener);
        this.f69941e.setOnClickListener(onClickListener);
        this.f69940d.setOnClickListener(onClickListener);
        this.f69944h.setOnClickListener(onClickListener);
        this.f69943g.setOnClickListener(onClickListener);
        if (C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) != 0 || C26654b.m87573a()) {
            this.f69944h.setTextSize(15.0f);
            this.f69944h.setTypeface(null, 1);
            this.f69944h.setTextColor(view.getResources().getColor(R.color.ayf));
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).bottomMargin = (int) C20505c.m68010a(view.getContext(), 3.0f);
                View findViewById7 = view.findViewById(R.id.d1c);
                C7573i.m23582a((Object) findViewById7, "itemView.findViewById<Vi…(R.id.search_nav_divider)");
                findViewById7.setVisibility(0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
