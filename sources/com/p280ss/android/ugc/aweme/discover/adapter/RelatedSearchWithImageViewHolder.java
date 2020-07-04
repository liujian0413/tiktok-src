package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26777b;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26778c;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26779d;
import com.p280ss.android.ugc.aweme.discover.model.RelatedSearchWordItem;
import com.p280ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26575b;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.C37388a;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedSearchWithImageViewHolder */
public final class RelatedSearchWithImageViewHolder extends C1293v {

    /* renamed from: a */
    public static final C26421a f69624a = new C26421a(null);

    /* renamed from: b */
    private final TextView f69625b;

    /* renamed from: c */
    private final RecyclerView f69626c;

    /* renamed from: d */
    private final C26424c f69627d = new C26424c();

    /* renamed from: e */
    private final List<RelatedSearchWordItem> f69628e = new ArrayList();

    /* renamed from: f */
    private RecommendWordMob f69629f;

    /* renamed from: g */
    private SearchResultParam f69630g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedSearchWithImageViewHolder$a */
    public static final class C26421a {
        private C26421a() {
        }

        public /* synthetic */ C26421a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static RelatedSearchWithImageViewHolder m86943a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1y, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new RelatedSearchWithImageViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedSearchWithImageViewHolder$b */
    static final class C26422b extends C1272h {

        /* renamed from: a */
        public static final C26423a f69631a = new C26423a(null);

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedSearchWithImageViewHolder$b$a */
        public static final class C26423a {
            private C26423a() {
            }

            public /* synthetic */ C26423a(C7571f fVar) {
                this();
            }
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
            C7573i.m23587b(rect, "outRect");
            C7573i.m23587b(view, "view");
            C7573i.m23587b(recyclerView, "parent");
            C7573i.m23587b(sVar, "state");
            int f = RecyclerView.m5892f(view);
            if (f == 0) {
                rect.left = C23486n.m77122a(16.0d);
                rect.right = C23486n.m77122a(4.0d);
            } else if (f == sVar.mo5870b() - 1) {
                rect.left = C23486n.m77122a(4.0d);
                rect.right = C23486n.m77122a(16.0d);
            } else {
                rect.left = C23486n.m77122a(4.0d);
                rect.right = C23486n.m77122a(4.0d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedSearchWithImageViewHolder$c */
    static final class C26424c extends C1262a<C26425d> {

        /* renamed from: a */
        public RecommendWordMob f69632a;

        /* renamed from: b */
        public SearchResultParam f69633b;

        /* renamed from: c */
        public int f69634c;

        /* renamed from: d */
        public final List<RelatedSearchWordItem> f69635d = new ArrayList();

        public final int getItemCount() {
            return this.f69635d.size();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onViewAttachedToWindow(C26425d dVar) {
            C7573i.m23587b(dVar, "holder");
            super.onViewAttachedToWindow(dVar);
            dVar.mo68020a();
        }

        /* renamed from: a */
        public final void mo68019a(List<? extends RelatedSearchWordItem> list) {
            Collection collection = list;
            if (!C6307b.m19566a(collection)) {
                this.f69635d.clear();
                List<RelatedSearchWordItem> list2 = this.f69635d;
                if (list == null) {
                    C7573i.m23580a();
                }
                list2.addAll(collection);
                notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C26425d onCreateViewHolder(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "parent");
            C26425d a = C26427a.m86951a(viewGroup);
            a.f69637a = this.f69632a;
            a.f69638b = this.f69633b;
            a.f69639c = this.f69634c;
            return a;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(C26425d dVar, int i) {
            C7573i.m23587b(dVar, "holder");
            dVar.mo68021a((RelatedSearchWordItem) this.f69635d.get(i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedSearchWithImageViewHolder$d */
    static final class C26425d extends C1293v {

        /* renamed from: e */
        public static final C26427a f69636e = new C26427a(null);

        /* renamed from: a */
        public RecommendWordMob f69637a;

        /* renamed from: b */
        public SearchResultParam f69638b;

        /* renamed from: c */
        public int f69639c;

        /* renamed from: d */
        public RelatedSearchWordItem f69640d;

        /* renamed from: f */
        private final RemoteImageView f69641f;

        /* renamed from: g */
        private final TextView f69642g;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedSearchWithImageViewHolder$d$a */
        public static final class C26427a {
            private C26427a() {
            }

            public /* synthetic */ C26427a(C7571f fVar) {
                this();
            }

            /* renamed from: a */
            public static C26425d m86951a(ViewGroup viewGroup) {
                C7573i.m23587b(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1z, viewGroup, false);
                C7573i.m23582a((Object) inflate, "itemView");
                return new C26425d(inflate);
            }
        }

        /* renamed from: a */
        public final void mo68020a() {
            String str;
            String str2;
            String str3;
            String str4;
            RelatedSearchWordItem relatedSearchWordItem = this.f69640d;
            if (relatedSearchWordItem == null) {
                C7573i.m23583a("mItem");
            }
            if (!relatedSearchWordItem.isMobShow) {
                RelatedSearchWordItem relatedSearchWordItem2 = this.f69640d;
                if (relatedSearchWordItem2 == null) {
                    C7573i.m23583a("mItem");
                }
                relatedSearchWordItem2.isMobShow = true;
                String a = SearchContext.m87922a(3);
                String a2 = C28199ae.m92689a().mo71791a(a);
                String str5 = "related_search_keywords";
                C22984d a3 = C22984d.m75611a().mo59973a("action_type", "show");
                String str6 = "search_keyword";
                RelatedSearchWordItem relatedSearchWordItem3 = this.f69640d;
                if (relatedSearchWordItem3 == null) {
                    C7573i.m23583a("mItem");
                }
                C6907h.m21524a(str5, (Map) a3.mo59973a(str6, relatedSearchWordItem3.getRelatedWord()).mo59970a(POIService.KEY_ORDER, getAdapterPosition() + 1).mo59973a("enter_from", "general_search").mo59973a("log_pb", a2).mo59973a("search_id", a).mo59973a("impr_id", a).f60753a);
                String str7 = null;
                C26779d dVar = new C26779d(null, 1, null);
                RelatedSearchWordItem relatedSearchWordItem4 = this.f69640d;
                if (relatedSearchWordItem4 == null) {
                    C7573i.m23583a("mItem");
                }
                C26779d g = dVar.mo68556a(relatedSearchWordItem4.getWord()).mo68557a(Integer.valueOf(getAdapterPosition())).mo68563f(a).mo68564g(a2);
                SearchResultParam searchResultParam = this.f69638b;
                if (searchResultParam != null) {
                    str = searchResultParam.getKeyword();
                } else {
                    str = null;
                }
                C26779d d = g.mo68561d(str);
                C22984d a4 = C22984d.m75611a().mo59973a("search_id", a);
                String str8 = "query_id";
                RecommendWordMob recommendWordMob = this.f69637a;
                if (recommendWordMob != null) {
                    str2 = recommendWordMob.getQueryId();
                } else {
                    str2 = null;
                }
                C22984d a5 = a4.mo59973a(str8, str2);
                String str9 = "query";
                SearchResultParam searchResultParam2 = this.f69638b;
                if (searchResultParam2 != null) {
                    str3 = searchResultParam2.getKeyword();
                } else {
                    str3 = null;
                }
                C22984d a6 = a5.mo59973a(str9, str3).mo59970a("rank", this.f69639c);
                String str10 = "source";
                SearchResultParam searchResultParam3 = this.f69638b;
                if (searchResultParam3 != null) {
                    str4 = searchResultParam3.getEnterFrom();
                } else {
                    str4 = null;
                }
                C22984d a7 = a6.mo59973a(str10, str4);
                String str11 = "info";
                RecommendWordMob recommendWordMob2 = this.f69637a;
                if (recommendWordMob2 != null) {
                    str7 = recommendWordMob2.getInfo();
                }
                d.mo85246a(a7.mo59973a(str11, str7).f60753a).mo85252e();
            }
        }

        /* renamed from: a */
        public static final /* synthetic */ RelatedSearchWordItem m86948a(C26425d dVar) {
            RelatedSearchWordItem relatedSearchWordItem = dVar.f69640d;
            if (relatedSearchWordItem == null) {
                C7573i.m23583a("mItem");
            }
            return relatedSearchWordItem;
        }

        public C26425d(final View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.ehd);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.word_cover)");
            this.f69641f = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.e0h);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.tv_related_word)");
            this.f69642g = (TextView) findViewById2;
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C26425d f69643a;

                {
                    this.f69643a = r1;
                }

                public final void onClick(View view) {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    ClickInstrumentation.onClick(view);
                    String a = SearchContext.m87922a(3);
                    String a2 = C28199ae.m92689a().mo71791a(a);
                    C6907h.m21524a("related_search_keywords", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("search_keyword", C26425d.m86948a(this.f69643a).getRelatedWord()).mo59970a(POIService.KEY_ORDER, this.f69643a.getAdapterPosition() + 1).mo59973a("enter_from", "general_search").mo59973a("log_pb", a2).mo59973a("search_id", a).mo59973a("impr_id", a).f60753a);
                    C26779d g = new C26778c().mo68556a(C26425d.m86948a(this.f69643a).getWord()).mo68557a(Integer.valueOf(this.f69643a.getAdapterPosition())).mo68563f(a).mo68564g(a2);
                    SearchResultParam searchResultParam = this.f69643a.f69638b;
                    String str5 = null;
                    if (searchResultParam != null) {
                        str = searchResultParam.getKeyword();
                    } else {
                        str = null;
                    }
                    C26779d d = g.mo68561d(str);
                    C22984d a3 = C22984d.m75611a().mo59973a("search_id", a);
                    String str6 = "query_id";
                    RecommendWordMob recommendWordMob = this.f69643a.f69637a;
                    if (recommendWordMob != null) {
                        str2 = recommendWordMob.getQueryId();
                    } else {
                        str2 = null;
                    }
                    C22984d a4 = a3.mo59973a(str6, str2);
                    String str7 = "query";
                    SearchResultParam searchResultParam2 = this.f69643a.f69638b;
                    if (searchResultParam2 != null) {
                        str3 = searchResultParam2.getKeyword();
                    } else {
                        str3 = null;
                    }
                    C22984d a5 = a4.mo59973a(str7, str3).mo59970a("rank", this.f69643a.f69639c);
                    String str8 = "source";
                    SearchResultParam searchResultParam3 = this.f69643a.f69638b;
                    if (searchResultParam3 != null) {
                        str4 = searchResultParam3.getEnterFrom();
                    } else {
                        str4 = null;
                    }
                    C22984d a6 = a5.mo59973a(str8, str4);
                    String str9 = "info";
                    RecommendWordMob recommendWordMob2 = this.f69643a.f69637a;
                    if (recommendWordMob2 != null) {
                        str5 = recommendWordMob2.getInfo();
                    }
                    d.mo85246a(a6.mo59973a(str9, str5).f60753a).mo85252e();
                    SearchResultParam enterFrom = new SearchResultParam().setSearchFrom(4).setKeyword(C26425d.m86948a(this.f69643a).getRelatedWord()).setEnterFrom("related_search_keyword");
                    if (C6399b.m19945u()) {
                        C7573i.m23582a((Object) enterFrom, "param");
                        C42961az.m136380a(new C26575b(enterFrom));
                        return;
                    }
                    C37385g gVar = C37385g.f97617a;
                    Context context = view.getContext();
                    C7573i.m23582a((Object) enterFrom, "param");
                    C37388a aVar = new C37388a(context, enterFrom, null, null, null, null);
                    gVar.launchSearchPage(aVar);
                }
            });
        }

        /* renamed from: a */
        public final void mo68021a(RelatedSearchWordItem relatedSearchWordItem) {
            C7573i.m23587b(relatedSearchWordItem, "item");
            this.f69640d = relatedSearchWordItem;
            this.f69642g.setText(relatedSearchWordItem.getRelatedWord());
            if (!TextUtils.isEmpty(relatedSearchWordItem.getRelatedImg())) {
                C13438a aVar = (C13438a) this.f69641f.getHierarchy();
                C7573i.m23582a((Object) aVar, "mWordCover.hierarchy");
                aVar.mo32896a(C13423b.f35599g);
                C23323e.m76514a(this.f69641f, relatedSearchWordItem.getRelatedImg());
                return;
            }
            C13438a aVar2 = (C13438a) this.f69641f.getHierarchy();
            C7573i.m23582a((Object) aVar2, "mWordCover.hierarchy");
            aVar2.mo32896a(C13423b.f35598f);
            C23323e.m76503a(this.f69641f, (int) R.drawable.b8j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedSearchWithImageViewHolder$e */
    static final class C26428e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RelatedSearchWithImageViewHolder f69645a;

        C26428e(RelatedSearchWithImageViewHolder relatedSearchWithImageViewHolder) {
            this.f69645a = relatedSearchWithImageViewHolder;
        }

        public final void run() {
            this.f69645a.mo68017a();
        }
    }

    /* renamed from: a */
    public final void mo68017a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String a = SearchContext.m87922a(3);
        C26777b c = new C26777b().mo68551a(Integer.valueOf(this.f69628e.size())).mo68555d(C28199ae.m92689a().mo71791a(a)).mo68554c(a);
        RecommendWordMob recommendWordMob = this.f69629f;
        String str6 = null;
        if (recommendWordMob != null) {
            str = recommendWordMob.getWordsSource();
        } else {
            str = null;
        }
        C26777b a2 = c.mo68552a(str);
        SearchResultParam searchResultParam = this.f69630g;
        if (searchResultParam != null) {
            str2 = searchResultParam.getKeyword();
        } else {
            str2 = null;
        }
        C26777b b = a2.mo68553b(str2);
        C22984d a3 = C22984d.m75611a().mo59973a("search_id", a);
        String str7 = "query_id";
        RecommendWordMob recommendWordMob2 = this.f69629f;
        if (recommendWordMob2 != null) {
            str3 = recommendWordMob2.getQueryId();
        } else {
            str3 = null;
        }
        C22984d a4 = a3.mo59973a(str7, str3);
        String str8 = "query";
        SearchResultParam searchResultParam2 = this.f69630g;
        if (searchResultParam2 != null) {
            str4 = searchResultParam2.getKeyword();
        } else {
            str4 = null;
        }
        C22984d a5 = a4.mo59973a(str8, str4).mo59970a("rank", getAdapterPosition());
        String str9 = "source";
        SearchResultParam searchResultParam3 = this.f69630g;
        if (searchResultParam3 != null) {
            str5 = searchResultParam3.getEnterFrom();
        } else {
            str5 = null;
        }
        C22984d a6 = a5.mo59973a(str9, str5);
        String str10 = "info";
        RecommendWordMob recommendWordMob3 = this.f69629f;
        if (recommendWordMob3 != null) {
            str6 = recommendWordMob3.getInfo();
        }
        b.mo85246a(a6.mo59973a(str10, str6).f60753a).mo85252e();
    }

    public RelatedSearchWithImageViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.e3f);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_title)");
        this.f69625b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bnf);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.list_view)");
        this.f69626c = (RecyclerView) findViewById2;
        this.f69626c.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        this.f69626c.setAdapter(this.f69627d);
        this.f69626c.mo5525a((C1272h) new C26422b());
    }

    /* renamed from: a */
    public final void mo68018a(C26754d dVar, SearchResultParam searchResultParam, int i) {
        C7573i.m23587b(dVar, "mixFeed");
        this.f69629f = dVar.f70550x;
        this.f69630g = searchResultParam;
        this.f69627d.f69632a = dVar.f70550x;
        this.f69627d.f69633b = searchResultParam;
        this.f69627d.f69634c = i;
        if (C6307b.m19566a((Collection<T>) dVar.f70534h)) {
            C23487o.m77140a(this.itemView, 8);
            return;
        }
        this.f69628e.clear();
        List<RelatedSearchWordItem> list = this.f69628e;
        List<RelatedSearchWordItem> list2 = dVar.f70534h;
        C7573i.m23582a((Object) list2, "mixFeed.relatedWordList");
        list.addAll(list2);
        this.f69627d.mo68019a(dVar.f70534h);
        this.f69626c.post(new C26428e(this));
    }
}
