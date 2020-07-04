package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
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
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.widget.flowlayout.C43554a;
import com.p280ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.p280ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedWordViewHolder */
public final class RelatedWordViewHolder extends BaseWordViewHolder<RelatedSearchWordItem> {

    /* renamed from: i */
    public static final C26432a f69657i = new C26432a(null);

    /* renamed from: g */
    public RecommendWordMob f69658g;

    /* renamed from: h */
    public SearchResultParam f69659h;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedWordViewHolder$a */
    public static final class C26432a {
        private C26432a() {
        }

        public /* synthetic */ C26432a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedWordViewHolder$b */
    public static final class C26433b extends C43554a<RelatedSearchWordItem> {

        /* renamed from: a */
        final /* synthetic */ RelatedWordViewHolder f69660a;

        /* renamed from: b */
        final /* synthetic */ List f69661b;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.RelatedWordViewHolder$b$a */
        public static final class C26434a extends C27009an {

            /* renamed from: a */
            final /* synthetic */ C26433b f69662a;

            /* renamed from: b */
            final /* synthetic */ RelatedSearchWordItem f69663b;

            /* renamed from: c */
            final /* synthetic */ int f69664c;

            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                String str;
                String str2;
                String str3;
                C7573i.m23587b(view, "view");
                C7573i.m23587b(motionEvent, "event");
                C26612d.f70187a.mo68302a(3);
                String a = SearchContext.m87922a(3);
                C6907h.m21524a("related_search_keywords", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("search_keyword", this.f69663b.getRelatedWord()).mo59970a(POIService.KEY_ORDER, this.f69664c + 1).mo59973a("enter_from", "general_search").mo59973a("log_pb", C28199ae.m92689a().mo71791a(a)).f60753a);
                C26779d a2 = new C26778c().mo68556a(this.f69663b.getWord());
                C22984d a3 = C22984d.m75611a().mo59973a("search_id", a);
                String str4 = "query_id";
                RecommendWordMob recommendWordMob = this.f69662a.f69660a.f69658g;
                String str5 = null;
                if (recommendWordMob != null) {
                    str = recommendWordMob.getQueryId();
                } else {
                    str = null;
                }
                C22984d a4 = a3.mo59973a(str4, str);
                String str6 = "query";
                SearchResultParam searchResultParam = this.f69662a.f69660a.f69659h;
                if (searchResultParam != null) {
                    str2 = searchResultParam.getKeyword();
                } else {
                    str2 = null;
                }
                C22984d a5 = a4.mo59973a(str6, str2).mo59970a("rank", this.f69662a.f69660a.getAdapterPosition());
                String str7 = "source";
                SearchResultParam searchResultParam2 = this.f69662a.f69660a.f69659h;
                if (searchResultParam2 != null) {
                    str3 = searchResultParam2.getEnterFrom();
                } else {
                    str3 = null;
                }
                C22984d a6 = a5.mo59973a(str7, str3);
                String str8 = "info";
                RecommendWordMob recommendWordMob2 = this.f69662a.f69660a.f69658g;
                if (recommendWordMob2 != null) {
                    str5 = recommendWordMob2.getInfo();
                }
                a2.mo85246a(a6.mo59973a(str8, str5).f60753a).mo85252e();
                SearchResultParam enterFrom = new SearchResultParam().setSearchFrom(4).setKeyword(this.f69663b.getRelatedWord()).setEnterFrom("related_search_keyword");
                C7573i.m23582a((Object) enterFrom, "param");
                C42961az.m136380a(new C26575b(enterFrom));
            }

            C26434a(C26433b bVar, RelatedSearchWordItem relatedSearchWordItem, int i) {
                this.f69662a = bVar;
                this.f69663b = relatedSearchWordItem;
                this.f69664c = i;
            }
        }

        C26433b(RelatedWordViewHolder relatedWordViewHolder, List list, List list2) {
            this.f69660a = relatedWordViewHolder;
            this.f69661b = list;
            super(list2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View mo67958a(FlowLayout flowLayout, int i, RelatedSearchWordItem relatedSearchWordItem) {
            C7573i.m23587b(flowLayout, "parent");
            C7573i.m23587b(relatedSearchWordItem, "item");
            View view = this.f69660a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.wm, flowLayout, false);
            TextView textView = (TextView) inflate.findViewById(R.id.dvv);
            C7573i.m23582a((Object) textView, "word");
            textView.setText(relatedSearchWordItem.getRelatedWord());
            inflate.setOnTouchListener(new C26434a(this, relatedSearchWordItem, i));
            C7573i.m23582a((Object) inflate, "root");
            return inflate;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo67916b(List<? extends RelatedSearchWordItem> list) {
        C7573i.m23587b(list, "list");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67912a() {
        TextView textView = this.f69427a;
        C7573i.m23582a((Object) textView, "mTitle");
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        textView.setText(view.getResources().getString(R.string.de4));
        View view2 = this.f69431e;
        View view3 = this.itemView;
        C7573i.m23582a((Object) view3, "itemView");
        view2.setBackgroundColor(view3.getResources().getColor(R.color.a4o));
        View view4 = this.f69431e;
        C7573i.m23582a((Object) view4, "mDecoration");
        LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            View view5 = this.itemView;
            C7573i.m23582a((Object) view5, "itemView");
            layoutParams2.setMargins(0, (int) C9738o.m28708b(view5.getContext(), 24.0f), 0, 0);
            View view6 = this.f69431e;
            C7573i.m23582a((Object) view6, "mDecoration");
            view6.setLayoutParams(layoutParams2);
            C23487o.m77140a(this.f69430d, 8);
            C23487o.m77140a(this.f69428b, 8);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: b */
    public final void mo67915b() {
        String str;
        String str2;
        String str3;
        String str4;
        super.mo67917c();
        C26777b bVar = new C26777b();
        TagFlowLayout tagFlowLayout = this.f69429c;
        C7573i.m23582a((Object) tagFlowLayout, "mTagGroup");
        C26777b a = bVar.mo68551a(Integer.valueOf(tagFlowLayout.getVisibleViewCount()));
        RecommendWordMob recommendWordMob = this.f69658g;
        String str5 = null;
        if (recommendWordMob != null) {
            str = recommendWordMob.getWordsSource();
        } else {
            str = null;
        }
        C26777b a2 = a.mo68552a(str);
        C22984d a3 = C22984d.m75611a().mo59973a("search_id", SearchContext.m87922a(3));
        String str6 = "query_id";
        RecommendWordMob recommendWordMob2 = this.f69658g;
        if (recommendWordMob2 != null) {
            str2 = recommendWordMob2.getQueryId();
        } else {
            str2 = null;
        }
        C22984d a4 = a3.mo59973a(str6, str2);
        String str7 = "query";
        SearchResultParam searchResultParam = this.f69659h;
        if (searchResultParam != null) {
            str3 = searchResultParam.getKeyword();
        } else {
            str3 = null;
        }
        C22984d a5 = a4.mo59973a(str7, str3).mo59970a("rank", getAdapterPosition());
        String str8 = "source";
        SearchResultParam searchResultParam2 = this.f69659h;
        if (searchResultParam2 != null) {
            str4 = searchResultParam2.getEnterFrom();
        } else {
            str4 = null;
        }
        C22984d a6 = a5.mo59973a(str8, str4);
        String str9 = "info";
        RecommendWordMob recommendWordMob3 = this.f69658g;
        if (recommendWordMob3 != null) {
            str5 = recommendWordMob3.getInfo();
        }
        a2.mo85246a(a6.mo59973a(str9, str5).f60753a).mo85252e();
    }

    /* renamed from: c */
    public final void mo67918c(List<? extends RelatedSearchWordItem> list) {
        C7573i.m23587b(list, "list");
        this.f69432f = list;
        TagFlowLayout tagFlowLayout = this.f69429c;
        C7573i.m23582a((Object) tagFlowLayout, "mTagGroup");
        tagFlowLayout.setAdapter(new C26433b(this, list, list));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo67913a(RelatedSearchWordItem relatedSearchWordItem, int i) {
        String str;
        String str2;
        String str3;
        C7573i.m23587b(relatedSearchWordItem, "item");
        String a = SearchContext.m87922a(3);
        C6907h.m21524a("related_search_keywords", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("search_keyword", relatedSearchWordItem.getRelatedWord()).mo59970a(POIService.KEY_ORDER, i + 1).mo59973a("enter_from", "general_search").mo59973a("log_pb", C28199ae.m92689a().mo71791a(a)).f60753a);
        String str4 = null;
        C26779d a2 = new C26779d(null, 1, null).mo68556a(relatedSearchWordItem.getWord());
        C22984d a3 = C22984d.m75611a().mo59973a("search_id", a);
        String str5 = "query_id";
        RecommendWordMob recommendWordMob = this.f69658g;
        if (recommendWordMob != null) {
            str = recommendWordMob.getQueryId();
        } else {
            str = null;
        }
        C22984d a4 = a3.mo59973a(str5, str);
        String str6 = "query";
        SearchResultParam searchResultParam = this.f69659h;
        if (searchResultParam != null) {
            str2 = searchResultParam.getKeyword();
        } else {
            str2 = null;
        }
        C22984d a5 = a4.mo59973a(str6, str2).mo59970a("rank", getAdapterPosition());
        String str7 = "source";
        SearchResultParam searchResultParam2 = this.f69659h;
        if (searchResultParam2 != null) {
            str3 = searchResultParam2.getEnterFrom();
        } else {
            str3 = null;
        }
        C22984d a6 = a5.mo59973a(str7, str3);
        String str8 = "info";
        RecommendWordMob recommendWordMob2 = this.f69658g;
        if (recommendWordMob2 != null) {
            str4 = recommendWordMob2.getInfo();
        }
        a2.mo85246a(a6.mo59973a(str8, str4).f60753a).mo85252e();
    }
}
