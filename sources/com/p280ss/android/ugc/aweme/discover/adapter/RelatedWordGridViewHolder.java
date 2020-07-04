package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.abtest.GeneralSearchIsStaggered;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26777b;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26778c;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26779d;
import com.p280ss.android.ugc.aweme.discover.model.RelatedSearchWordItem;
import com.p280ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26575b;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.C37388a;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedWordGridViewHolder */
public final class RelatedWordGridViewHolder extends C1293v {

    /* renamed from: d */
    public static final C26429a f69646d = new C26429a(null);

    /* renamed from: a */
    public RecommendWordMob f69647a;

    /* renamed from: b */
    public SearchResultParam f69648b;

    /* renamed from: c */
    public final RecyclerView f69649c;

    /* renamed from: e */
    private LinearLayout f69650e;

    /* renamed from: f */
    private final TextView f69651f;

    /* renamed from: g */
    private List<? extends RelatedSearchWordItem> f69652g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedWordGridViewHolder$a */
    public static final class C26429a {
        private C26429a() {
        }

        public /* synthetic */ C26429a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static RelatedWordGridViewHolder m86958a(ViewGroup viewGroup, RecyclerView recyclerView) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(recyclerView, "rv");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a25, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new RelatedWordGridViewHolder(inflate, recyclerView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedWordGridViewHolder$b */
    static final class C26430b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RelatedWordGridViewHolder f69653a;

        C26430b(RelatedWordGridViewHolder relatedWordGridViewHolder) {
            this.f69653a = relatedWordGridViewHolder;
        }

        public final void run() {
            this.f69653a.mo68024a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedWordGridViewHolder$c */
    public static final class C26431c extends C27009an {

        /* renamed from: a */
        final /* synthetic */ RelatedWordGridViewHolder f69654a;

        /* renamed from: b */
        final /* synthetic */ RelatedSearchWordItem f69655b;

        /* renamed from: c */
        final /* synthetic */ int f69656c;

        /* renamed from: b */
        public final void mo67959b(View view, MotionEvent motionEvent) {
            String str;
            String str2;
            String str3;
            String str4;
            C7573i.m23587b(motionEvent, "event");
            C26612d.f70187a.mo68302a(3);
            String a = SearchContext.m87922a(3);
            String a2 = C28199ae.m92689a().mo71791a(a);
            C6907h.m21524a("related_search_keywords", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("search_keyword", this.f69655b.getRelatedWord()).mo59970a(POIService.KEY_ORDER, this.f69656c + 1).mo59973a("enter_from", "general_search").mo59973a("log_pb", a2).mo59973a("search_id", a).mo59973a("impr_id", a).f60753a);
            C26779d g = new C26778c().mo68556a(this.f69655b.getWord()).mo68557a(Integer.valueOf(this.f69656c)).mo68563f(a).mo68564g(a2);
            SearchResultParam searchResultParam = this.f69654a.f69648b;
            String str5 = null;
            if (searchResultParam != null) {
                str = searchResultParam.getKeyword();
            } else {
                str = null;
            }
            C26779d d = g.mo68561d(str);
            C22984d a3 = C22984d.m75611a().mo59973a("search_id", a);
            String str6 = "query_id";
            RecommendWordMob recommendWordMob = this.f69654a.f69647a;
            if (recommendWordMob != null) {
                str2 = recommendWordMob.getQueryId();
            } else {
                str2 = null;
            }
            C22984d a4 = a3.mo59973a(str6, str2);
            String str7 = "query";
            SearchResultParam searchResultParam2 = this.f69654a.f69648b;
            if (searchResultParam2 != null) {
                str3 = searchResultParam2.getKeyword();
            } else {
                str3 = null;
            }
            C22984d a5 = a4.mo59973a(str7, str3).mo59970a("rank", this.f69654a.getAdapterPosition());
            String str8 = "source";
            SearchResultParam searchResultParam3 = this.f69654a.f69648b;
            if (searchResultParam3 != null) {
                str4 = searchResultParam3.getEnterFrom();
            } else {
                str4 = null;
            }
            C22984d a6 = a5.mo59973a(str8, str4);
            String str9 = "info";
            RecommendWordMob recommendWordMob2 = this.f69654a.f69647a;
            if (recommendWordMob2 != null) {
                str5 = recommendWordMob2.getInfo();
            }
            d.mo85246a(a6.mo59973a(str9, str5).f60753a).mo85252e();
            SearchResultParam enterFrom = new SearchResultParam().setSearchFrom(4).setKeyword(this.f69655b.getRelatedWord()).setEnterFrom("related_search_keyword");
            if (C6399b.m19945u()) {
                C7573i.m23582a((Object) enterFrom, "param");
                C42961az.m136380a(new C26575b(enterFrom));
                return;
            }
            C37385g gVar = C37385g.f97617a;
            View view2 = this.f69654a.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            Context context = view2.getContext();
            C7573i.m23582a((Object) enterFrom, "param");
            C37388a aVar = new C37388a(context, enterFrom, null, null, null, null);
            gVar.launchSearchPage(aVar);
        }

        C26431c(RelatedWordGridViewHolder relatedWordGridViewHolder, RelatedSearchWordItem relatedSearchWordItem, int i) {
            this.f69654a = relatedWordGridViewHolder;
            this.f69655b = relatedSearchWordItem;
            this.f69656c = i;
        }
    }

    /* renamed from: a */
    public final void mo68024a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String a = SearchContext.m87922a(3);
        String a2 = C28199ae.m92689a().mo71791a(a);
        List<? extends RelatedSearchWordItem> list = this.f69652g;
        if (list == null) {
            C7573i.m23580a();
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            List<? extends RelatedSearchWordItem> list2 = this.f69652g;
            if (list2 == null) {
                C7573i.m23580a();
            }
            if (i < list2.size()) {
                List<? extends RelatedSearchWordItem> list3 = this.f69652g;
                if (list3 == null) {
                    C7573i.m23580a();
                }
                m86953a((RelatedSearchWordItem) list3.get(i), i, a, a2);
                i++;
            } else {
                return;
            }
        }
        C26777b a3 = new C26777b().mo68551a(Integer.valueOf(size));
        RecommendWordMob recommendWordMob = this.f69647a;
        String str6 = null;
        if (recommendWordMob != null) {
            str = recommendWordMob.getWordsSource();
        } else {
            str = null;
        }
        C26777b d = a3.mo68552a(str).mo68554c(a).mo68555d(a2);
        SearchResultParam searchResultParam = this.f69648b;
        if (searchResultParam != null) {
            str2 = searchResultParam.getKeyword();
        } else {
            str2 = null;
        }
        C26777b b = d.mo68553b(str2);
        C22984d a4 = C22984d.m75611a().mo59973a("search_id", a);
        String str7 = "query_id";
        RecommendWordMob recommendWordMob2 = this.f69647a;
        if (recommendWordMob2 != null) {
            str3 = recommendWordMob2.getQueryId();
        } else {
            str3 = null;
        }
        C22984d a5 = a4.mo59973a(str7, str3);
        String str8 = "query";
        SearchResultParam searchResultParam2 = this.f69648b;
        if (searchResultParam2 != null) {
            str4 = searchResultParam2.getKeyword();
        } else {
            str4 = null;
        }
        C22984d a6 = a5.mo59973a(str8, str4).mo59970a("rank", getAdapterPosition());
        String str9 = "source";
        SearchResultParam searchResultParam3 = this.f69648b;
        if (searchResultParam3 != null) {
            str5 = searchResultParam3.getEnterFrom();
        } else {
            str5 = null;
        }
        C22984d a7 = a6.mo59973a(str9, str5);
        String str10 = "info";
        RecommendWordMob recommendWordMob3 = this.f69647a;
        if (recommendWordMob3 != null) {
            str6 = recommendWordMob3.getInfo();
        }
        b.mo85246a(a7.mo59973a(str10, str6).f60753a).mo85252e();
    }

    public RelatedWordGridViewHolder(View view, RecyclerView recyclerView) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(recyclerView, "rv");
        super(view);
        this.f69649c = recyclerView;
        View findViewById = view.findViewById(R.id.dik);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tg_hot_search)");
        this.f69650e = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.e3f);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.tv_title)");
        this.f69651f = (TextView) findViewById2;
        if (C6399b.m19944t()) {
            this.f69651f.setCompoundDrawables(null, null, null, null);
            return;
        }
        if (C6384b.m19835a().mo15292a(GeneralSearchIsStaggered.class, true, "general_search_is_staggered", C6384b.m19835a().mo15295d().general_search_is_staggered, false)) {
            view.setBackgroundResource(R.drawable.s2);
        }
    }

    /* renamed from: b */
    private final int m86955b(List<? extends RelatedSearchWordItem> list, int i) {
        int i2;
        float f;
        if (C6384b.m19835a().mo15292a(GeneralSearchIsStaggered.class, true, "general_search_is_staggered", C6384b.m19835a().mo15295d().general_search_is_staggered, false)) {
            i2 = 309;
        } else {
            C1293v e = this.f69649c.mo5572e(i - 1);
            if (e == null) {
                return Math.min(list.size(), 5);
            }
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            Context context = view.getContext();
            View view2 = e.itemView;
            C7573i.m23582a((Object) view2, "lastViewHolder.itemView");
            i2 = C9738o.m28714c(context, (float) view2.getMeasuredHeight());
        }
        float f2 = ((float) i2) - 58.0f;
        if (C6399b.m19945u()) {
            f = 12.0f;
        } else {
            f = 18.0f;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            float f3 = f2 - 32.0f;
            if (f3 < 24.0f) {
                break;
            }
            i3++;
            f2 = f3 - f;
        }
        return i3;
    }

    /* renamed from: a */
    private final void m86954a(List<? extends RelatedSearchWordItem> list, int i) {
        float f;
        this.f69650e.removeAllViews();
        int b = m86955b(list, i);
        this.f69652g = list.subList(0, b);
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        Context context = view.getContext();
        if (C6399b.m19945u()) {
            f = 12.0f;
        } else {
            f = 18.0f;
        }
        float b2 = C9738o.m28708b(context, f);
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        float b3 = C9738o.m28708b(view2.getContext(), 24.0f);
        List<? extends RelatedSearchWordItem> list2 = this.f69652g;
        if (list2 != null) {
            int i2 = 0;
            for (Object next : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C7525m.m23465b();
                }
                View a = m86952a((ViewGroup) this.f69650e, i2, (RelatedSearchWordItem) next);
                if (i3 == b) {
                    LayoutParams layoutParams = a.getLayoutParams();
                    if (layoutParams != null) {
                        ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, (int) b3);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                } else {
                    LayoutParams layoutParams2 = a.getLayoutParams();
                    if (layoutParams2 != null) {
                        ((LinearLayout.LayoutParams) layoutParams2).setMargins(0, 0, 0, (int) b2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                }
                this.f69650e.addView(a);
                i2 = i3;
            }
        }
    }

    /* renamed from: a */
    public final void mo68025a(C26754d dVar, SearchResultParam searchResultParam, int i) {
        C7573i.m23587b(dVar, "mixFeed");
        this.f69647a = dVar.f70550x;
        this.f69648b = searchResultParam;
        List<RelatedSearchWordItem> list = dVar.f70534h;
        if (C6307b.m19566a((Collection<T>) list)) {
            C23487o.m77140a(this.itemView, 8);
            return;
        }
        C7573i.m23582a((Object) list, "list");
        m86954a(list, i);
        this.f69650e.post(new C26430b(this));
    }

    /* renamed from: a */
    private View m86952a(ViewGroup viewGroup, int i, RelatedSearchWordItem relatedSearchWordItem) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(relatedSearchWordItem, "item");
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.xx, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.dvv);
        C7573i.m23582a((Object) textView, "word");
        textView.setText(relatedSearchWordItem.getRelatedWord());
        inflate.setOnTouchListener(new C26431c(this, relatedSearchWordItem, i));
        C7573i.m23582a((Object) inflate, "root");
        return inflate;
    }

    /* renamed from: a */
    private final void m86953a(RelatedSearchWordItem relatedSearchWordItem, int i, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        C6907h.m21524a("related_search_keywords", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("search_keyword", relatedSearchWordItem.getRelatedWord()).mo59970a(POIService.KEY_ORDER, i + 1).mo59973a("enter_from", "general_search").mo59973a("log_pb", str2).mo59973a("search_id", str).mo59973a("impr_id", str).f60753a);
        String str7 = null;
        C26779d g = new C26779d(null, 1, null).mo68556a(relatedSearchWordItem.getWord()).mo68557a(Integer.valueOf(i)).mo68563f(str).mo68564g(str2);
        SearchResultParam searchResultParam = this.f69648b;
        if (searchResultParam != null) {
            str3 = searchResultParam.getKeyword();
        } else {
            str3 = null;
        }
        C26779d d = g.mo68561d(str3);
        C22984d a = C22984d.m75611a().mo59973a("search_id", str);
        String str8 = "query_id";
        RecommendWordMob recommendWordMob = this.f69647a;
        if (recommendWordMob != null) {
            str4 = recommendWordMob.getQueryId();
        } else {
            str4 = null;
        }
        C22984d a2 = a.mo59973a(str8, str4);
        String str9 = "query";
        SearchResultParam searchResultParam2 = this.f69648b;
        if (searchResultParam2 != null) {
            str5 = searchResultParam2.getKeyword();
        } else {
            str5 = null;
        }
        C22984d a3 = a2.mo59973a(str9, str5).mo59970a("rank", getAdapterPosition());
        String str10 = "source";
        SearchResultParam searchResultParam3 = this.f69648b;
        if (searchResultParam3 != null) {
            str6 = searchResultParam3.getEnterFrom();
        } else {
            str6 = null;
        }
        C22984d a4 = a3.mo59973a(str10, str6);
        String str11 = "info";
        RecommendWordMob recommendWordMob2 = this.f69647a;
        if (recommendWordMob2 != null) {
            str7 = recommendWordMob2.getInfo();
        }
        d.mo85246a(a4.mo59973a(str11, str7).f60753a).mo85252e();
    }
}
