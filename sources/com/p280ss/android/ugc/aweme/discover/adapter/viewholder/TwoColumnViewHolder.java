package com.p280ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.SingleTypeAdapter;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchIntermediateStyleExperiment;
import com.p280ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.SingleItemWithImageViewHolder.C26522a;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26610b;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27012a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27013b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder */
public final class TwoColumnViewHolder extends C1293v {

    /* renamed from: b */
    public static final int f69972b;

    /* renamed from: c */
    public static final C26524a f69973c = new C26524a(null);

    /* renamed from: a */
    public final boolean f69974a;

    /* renamed from: d */
    private final DmtTextView f69975d;

    /* renamed from: e */
    private final RecyclerView f69976e;

    /* renamed from: f */
    private final C26532c f69977f = new C26532c();

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder$a */
    public static final class C26524a {
        private C26524a() {
        }

        public /* synthetic */ C26524a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static TwoColumnViewHolder m87214a(ViewGroup viewGroup, boolean z) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2u, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new TwoColumnViewHolder(inflate, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder$b */
    static final class C26525b extends MultiTypeViewHolder<Object> {

        /* renamed from: e */
        public static final C26526a f69978e = new C26526a(null);

        /* renamed from: a */
        public C27013b f69979a;

        /* renamed from: b */
        public C27012a f69980b;

        /* renamed from: c */
        public String f69981c = "hot_search_section_search";

        /* renamed from: d */
        public final ViewGroup f69982d;

        /* renamed from: f */
        private final DmtTextView f69983f;

        /* renamed from: g */
        private final DmtTextView f69984g;

        /* renamed from: j */
        private final DmtTextView f69985j;

        /* renamed from: k */
        private final View f69986k;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder$b$a */
        public static final class C26526a {
            private C26526a() {
            }

            public /* synthetic */ C26526a(C7571f fVar) {
                this();
            }

            /* renamed from: a */
            public static C26525b m87222a(ViewGroup viewGroup) {
                C7573i.m23587b(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3u, viewGroup, false);
                C7573i.m23582a((Object) inflate, "view");
                return new C26525b(inflate, viewGroup);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder$b$b */
        static final class C26527b implements Runnable {

            /* renamed from: a */
            public static final C26527b f69987a = new C26527b();

            C26527b() {
            }

            public final void run() {
                C26610b.m87389d();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder$b$c */
        static final class C26528c implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C26525b f69988a;

            /* renamed from: b */
            final /* synthetic */ HotSearchItem f69989b;

            C26528c(C26525b bVar, HotSearchItem hotSearchItem) {
                this.f69988a = bVar;
                this.f69989b = hotSearchItem;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                Long l;
                String str3;
                ClickInstrumentation.onClick(view);
                if (this.f69989b.getType() == 0) {
                    C27013b bVar = this.f69988a.f69979a;
                    if (bVar != null) {
                        bVar.mo68315a(this.f69989b, this.f69988a.getAdapterPosition(), "hot_search_section_search");
                    }
                    C6907h.m21524a("hot_search_keyword", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("key_word", this.f69989b.getWord()).mo59973a("key_word_type", "general_word").mo59970a(POIService.KEY_ORDER, this.f69988a.getPosition() + 1).mo59973a("enter_from", this.f69988a.f69981c).f60753a);
                } else if (this.f69989b.getType() == 1) {
                    C6907h.m21524a("enter_tag_detail", (Map) C22984d.m75611a().mo59973a("tag_id", this.f69989b.getChallengeId()).mo59970a(POIService.KEY_ORDER, this.f69988a.getPosition() + 1).mo59973a("enter_from", this.f69988a.f69981c).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f69989b.getLogPb())).f60753a);
                    C6907h.m21524a("hot_search_keyword", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("key_word", this.f69989b.getWord()).mo59973a("key_word_type", "tag").mo59970a(POIService.KEY_ORDER, this.f69988a.getPosition() + 1).mo59973a("enter_from", this.f69988a.f69981c).f60753a);
                    StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                    sb.append(this.f69989b.getChallengeId());
                    C7195s.m22438a().mo18682a(sb.toString());
                }
                if (this.f69989b.isAd()) {
                    if (TextUtils.equals(this.f69988a.f69981c, "hot_search_section_search")) {
                        str = "hot_search_keyword_click";
                    } else {
                        str = "hot_search_keyword_click_detail";
                    }
                    final HotSearchAdData adData = this.f69989b.getAdData();
                    C24939aj r2 = new C24939aj() {
                        /* renamed from: a */
                        public final void mo63403a(String str, String str2, long j) {
                            if (adData != null) {
                                C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65264a(Long.valueOf(adData.getCreativeId())).mo65286h(adData.getLogExtra()).mo65279c(Long.valueOf(-1)).mo65278b();
                            }
                        }
                    };
                    HotSearchAdData adData2 = this.f69989b.getAdData();
                    if (adData2 == null) {
                        C7573i.m23580a();
                    }
                    C24962g.m81952a(r2, adData2.getClickTrackUrl(), true);
                    C24961b e = C24958f.m81905a().mo65266a("result_ad").mo65276b(str).mo65283e(this.f69988a.f69981c);
                    HotSearchAdData adData3 = this.f69989b.getAdData();
                    Long l2 = null;
                    if (adData3 != null) {
                        str2 = adData3.getLogExtra();
                    } else {
                        str2 = null;
                    }
                    C24961b h = e.mo65286h(str2);
                    HotSearchAdData adData4 = this.f69989b.getAdData();
                    if (adData4 != null) {
                        l = Long.valueOf(adData4.getCreativeId());
                    } else {
                        l = null;
                    }
                    C24961b a = h.mo65264a(l);
                    View view2 = this.f69988a.itemView;
                    C7573i.m23582a((Object) view2, "itemView");
                    a.mo65270a(view2.getContext());
                    C24961b b = C24958f.m81905a().mo65266a("result_ad").mo65276b("click");
                    HotSearchAdData adData5 = this.f69989b.getAdData();
                    if (adData5 != null) {
                        str3 = adData5.getLogExtra();
                    } else {
                        str3 = null;
                    }
                    C24961b h2 = b.mo65286h(str3);
                    HotSearchAdData adData6 = this.f69989b.getAdData();
                    if (adData6 != null) {
                        l2 = Long.valueOf(adData6.getCreativeId());
                    }
                    C24961b a2 = h2.mo65264a(l2);
                    View view3 = this.f69988a.itemView;
                    C7573i.m23582a((Object) view3, "itemView");
                    a2.mo65270a(view3.getContext());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder$b$d */
        static final class C26530d implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C26525b f69991a;

            /* renamed from: b */
            final /* synthetic */ int f69992b;

            /* renamed from: c */
            final /* synthetic */ Word f69993c;

            C26530d(C26525b bVar, int i, Word word) {
                this.f69991a = bVar;
                this.f69992b = i;
                this.f69993c = word;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C26612d.f70187a.mo68302a(5);
                C6907h.m21524a("trending_words_click", (Map) C22984d.m75611a().mo59970a("words_position", this.f69992b).mo59973a("words_source", "recom_search").mo59973a("words_content", this.f69993c.getWord()).mo59973a("group_id", this.f69993c.getId()).f60753a);
                C27012a aVar = this.f69991a.f69980b;
                if (aVar != null) {
                    aVar.handleGuessWordItemClick(this.f69993c, this.f69991a.getAdapterPosition());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder$b$e */
        static final class C26531e implements C24939aj {

            /* renamed from: a */
            final /* synthetic */ C26525b f69994a;

            /* renamed from: b */
            final /* synthetic */ HotSearchItem f69995b;

            C26531e(C26525b bVar, HotSearchItem hotSearchItem) {
                this.f69994a = bVar;
                this.f69995b = hotSearchItem;
            }

            /* renamed from: a */
            public final void mo63403a(String str, String str2, long j) {
                C24961b a = C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65261a(this.f69995b.getAdData());
                View view = this.f69994a.itemView;
                C7573i.m23582a((Object) view, "itemView");
                a.mo65270a(view.getContext());
            }
        }

        /* renamed from: a */
        private final void m87216a() {
            ViewGroup viewGroup = this.f69982d;
            if (viewGroup != null) {
                C1273i layoutManager = ((RecyclerView) viewGroup).getLayoutManager();
                if (layoutManager != null) {
                    int a = ((GridLayoutManager) layoutManager).f4721g.mo5387a(getAdapterPosition(), 2);
                    View view = this.itemView;
                    C7573i.m23582a((Object) view, "itemView");
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        if (a % 2 == 0) {
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = C23486n.m77122a(16.0d);
                        } else if (C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) == 2) {
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = C23486n.m77122a(16.0d);
                        } else {
                            marginLayoutParams.leftMargin = C23486n.m77122a(16.0d);
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

        /* renamed from: a */
        private final void m87219a(Word word) {
            if (!word.isShowed()) {
                word.setShowed(true);
                C6907h.m21524a("trending_words_show", (Map) C22984d.m75611a().mo59970a("words_position", getPosition()).mo59973a("words_source", "recom_search").mo59973a("words_content", word.getWord()).mo59973a("group_id", word.getId()).f60753a);
            }
        }

        /* renamed from: a */
        private final void m87218a(HotSearchItem hotSearchItem) {
            StringBuilder sb = new StringBuilder();
            if (hotSearchItem.getType() == 1) {
                sb.append("#");
            }
            sb.append(hotSearchItem.getWord());
            DmtTextView dmtTextView = this.f69985j;
            C7573i.m23582a((Object) dmtTextView, "numView");
            dmtTextView.setVisibility(8);
            DmtTextView dmtTextView2 = this.f69983f;
            C7573i.m23582a((Object) dmtTextView2, "textView");
            dmtTextView2.setText(sb.toString());
            if (hotSearchItem.getLabel() == 0) {
                DmtTextView dmtTextView3 = this.f69984g;
                C7573i.m23582a((Object) dmtTextView3, "tagView");
                dmtTextView3.setVisibility(8);
            } else {
                DmtTextView dmtTextView4 = this.f69984g;
                C7573i.m23582a((Object) dmtTextView4, "tagView");
                dmtTextView4.setVisibility(0);
            }
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            view.getContext();
            hotSearchItem.getLabel();
            this.itemView.setOnClickListener(new C26528c(this, hotSearchItem));
            m87220b(hotSearchItem);
        }

        /* renamed from: b */
        private final void m87220b(HotSearchItem hotSearchItem) {
            String str;
            String str2;
            if (!hotSearchItem.getHasSentMob()) {
                hotSearchItem.setHasSentMob(true);
                String str3 = "hot_search_keyword";
                C22984d a = C22984d.m75611a().mo59973a("action_type", "show").mo59973a("key_word", hotSearchItem.getWord());
                String str4 = "key_word_type";
                if (hotSearchItem.getType() == 1) {
                    str = "tag";
                } else {
                    str = "general_word";
                }
                C6907h.m21524a(str3, (Map) a.mo59973a(str4, str).mo59970a(POIService.KEY_ORDER, getPosition() + 1).mo59973a("enter_from", this.f69981c).f60753a);
                if (TextUtils.equals(this.f69981c, "hot_search_section_search")) {
                    str2 = "hot_search_keyword_show";
                } else {
                    str2 = "hot_search_keyword_show_detail";
                }
                if (hotSearchItem.isAd()) {
                    C24939aj eVar = new C26531e(this, hotSearchItem);
                    HotSearchAdData adData = hotSearchItem.getAdData();
                    if (adData == null) {
                        C7573i.m23580a();
                    }
                    C24962g.m81952a(eVar, adData.getTrackUrl(), true);
                    C24961b e = C24958f.m81905a().mo65266a("result_ad").mo65276b(str2).mo65283e(this.f69981c);
                    HotSearchAdData adData2 = hotSearchItem.getAdData();
                    if (adData2 == null) {
                        C7573i.m23580a();
                    }
                    C24961b h = e.mo65286h(adData2.getLogExtra());
                    HotSearchAdData adData3 = hotSearchItem.getAdData();
                    if (adData3 == null) {
                        C7573i.m23580a();
                    }
                    C24961b a2 = h.mo65264a(Long.valueOf(adData3.getCreativeId()));
                    View view = this.itemView;
                    C7573i.m23582a((Object) view, "itemView");
                    a2.mo65270a(view.getContext());
                    C24961b b = C24958f.m81905a().mo65266a("result_ad").mo65276b("show");
                    HotSearchAdData adData4 = hotSearchItem.getAdData();
                    if (adData4 == null) {
                        C7573i.m23580a();
                    }
                    C24961b h2 = b.mo65286h(adData4.getLogExtra());
                    HotSearchAdData adData5 = hotSearchItem.getAdData();
                    if (adData5 == null) {
                        C7573i.m23580a();
                    }
                    C24961b a3 = h2.mo65264a(Long.valueOf(adData5.getCreativeId()));
                    View view2 = this.itemView;
                    C7573i.m23582a((Object) view2, "itemView");
                    a3.mo65270a(view2.getContext());
                }
            }
        }

        public C26525b(View view, ViewGroup viewGroup) {
            C7573i.m23587b(view, "itemView");
            C7573i.m23587b(viewGroup, "parent");
            super(view);
            this.f69982d = viewGroup;
            this.f69983f = (DmtTextView) view.findViewById(R.id.e38);
            this.f69984g = (DmtTextView) view.findViewById(R.id.e30);
            this.f69985j = (DmtTextView) view.findViewById(R.id.dyv);
            this.f69986k = view.findViewById(R.id.cc4);
        }

        /* renamed from: a */
        private final void m87217a(int i, Word word) {
            int i2;
            if (C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) == 2) {
                DmtTextView dmtTextView = this.f69985j;
                C7573i.m23582a((Object) dmtTextView, "numView");
                dmtTextView.setVisibility(0);
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                view.getContext();
                i2 = 18;
            } else {
                i2 = 0;
            }
            if (word.getWord() == null) {
                View view2 = this.f69986k;
                C7573i.m23582a((Object) view2, "placeHolderView");
                view2.setVisibility(0);
                View view3 = this.f69986k;
                C7573i.m23582a((Object) view3, "placeHolderView");
                LayoutParams layoutParams = view3.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    View view4 = this.f69986k;
                    C7573i.m23582a((Object) view4, "placeHolderView");
                    float a = ((float) C9738o.m28691a(view4.getContext())) * 0.5f;
                    if ((i >> 1) % 2 == 0) {
                        View view5 = this.f69986k;
                        C7573i.m23582a((Object) view5, "placeHolderView");
                        marginLayoutParams.width = (int) (a - C9738o.m28708b(view5.getContext(), ((float) i2) + 32.0f));
                    } else {
                        View view6 = this.f69986k;
                        C7573i.m23582a((Object) view6, "placeHolderView");
                        marginLayoutParams.width = (int) (a - C9738o.m28708b(view6.getContext(), ((float) i2) + 64.0f));
                    }
                    if (C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) == 2) {
                        marginLayoutParams.leftMargin = C23486n.m77122a(34.0d);
                    }
                    View view7 = this.f69986k;
                    C7573i.m23582a((Object) view7, "placeHolderView");
                    view7.setLayoutParams(marginLayoutParams);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                View view8 = this.f69986k;
                C7573i.m23582a((Object) view8, "placeHolderView");
                view8.setVisibility(4);
                if (C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) == 2) {
                    DmtTextView dmtTextView2 = this.f69983f;
                    C7573i.m23582a((Object) dmtTextView2, "textView");
                    LayoutParams layoutParams2 = dmtTextView2.getLayoutParams();
                    if (layoutParams2 != null) {
                        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.leftMargin = C23486n.m77122a(34.0d);
                        DmtTextView dmtTextView3 = this.f69983f;
                        C7573i.m23582a((Object) dmtTextView3, "textView");
                        dmtTextView3.setLayoutParams(marginLayoutParams2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                word.getWordType();
                DmtTextView dmtTextView4 = this.f69983f;
                C7573i.m23582a((Object) dmtTextView4, "textView");
                dmtTextView4.getPaint().measureText(word.getWord());
                View view9 = this.itemView;
                C7573i.m23582a((Object) view9, "itemView");
                C9738o.m28708b(view9.getContext(), ((float) i2) + 36.0f);
            }
            DmtTextView dmtTextView5 = this.f69983f;
            C7573i.m23582a((Object) dmtTextView5, "textView");
            dmtTextView5.setText(word.getWord());
            if (C26654b.m87573a()) {
                DmtTextView dmtTextView6 = this.f69983f;
                View view10 = this.itemView;
                C7573i.m23582a((Object) view10, "itemView");
                dmtTextView6.setTextColor(view10.getResources().getColor(R.color.aa));
            }
            this.itemView.setOnClickListener(new C26530d(this, i, word));
            m87219a(word);
        }

        /* renamed from: a */
        public final void mo29214a(Object obj, int i) {
            C7573i.m23587b(obj, "item");
            m87216a();
            if (obj instanceof HotSearchItem) {
                m87218a((HotSearchItem) obj);
                return;
            }
            if (obj instanceof Word) {
                Word word = (Word) obj;
                m87217a(i, word);
                if (word.getWord() != null) {
                    this.itemView.post(C26527b.f69987a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder$c */
    static final class C26532c extends SingleTypeAdapter<Object> {

        /* renamed from: a */
        public C27013b f69996a;

        /* renamed from: b */
        public C27012a f69997b;

        /* renamed from: c */
        private final List<Object> f69998c = new ArrayList();

        public final int getItemCount() {
            return this.f69998c.size();
        }

        /* renamed from: a */
        public final void mo68158a(List<? extends Object> list) {
            this.f69998c.clear();
            if (list != null) {
                this.f69998c.addAll(list);
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public final MultiTypeViewHolder<Object> mo29312a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            if (this.f69996a == null && C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) == 3) {
                SingleItemWithImageViewHolder a = C26522a.m87209a(viewGroup);
                a.f69964a = this.f69997b;
                return a;
            }
            C26525b a2 = C26526a.m87222a(viewGroup);
            a2.f69979a = this.f69996a;
            a2.f69980b = this.f69997b;
            return a2;
        }

        /* renamed from: b */
        public final Object mo29203b(int i, boolean z) {
            return this.f69998c.get(i);
        }
    }

    static {
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        Integer searchMiddleRecommendWordsCount = a.getSearchMiddleRecommendWordsCount();
        C7573i.m23582a((Object) searchMiddleRecommendWordsCount, "SettingsReader.get().sea…MiddleRecommendWordsCount");
        f69972b = searchMiddleRecommendWordsCount.intValue();
    }

    /* renamed from: a */
    public final void mo68151a(C27012a aVar) {
        this.f69977f.f69997b = aVar;
    }

    /* renamed from: a */
    public final void mo68152a(C27013b bVar) {
        this.f69977f.f69996a = bVar;
    }

    /* renamed from: a */
    public final void mo68153a(List<HotSearchItem> list) {
        int i;
        List list2;
        if (!C7573i.m23585a((Object) list, (Object) HotSearchWordViewHolder.f69515g)) {
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            int min = Math.min(i, f69972b);
            C26532c cVar = this.f69977f;
            if (list != null) {
                list2 = list.subList(0, min);
            } else {
                list2 = null;
            }
            cVar.mo68158a(list2);
        }
    }

    /* renamed from: b */
    public final void mo68154b(List<Word> list) {
        int i;
        List list2;
        if (!C7573i.m23585a((Object) list, (Object) GuessWordsViewHolder.f69487h)) {
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            int min = Math.min(i, f69972b);
            C6907h.m21524a("trending_show", (Map) C22984d.m75611a().mo59970a("words_num", min).mo59973a("words_source", "recom_search").f60753a);
            C26532c cVar = this.f69977f;
            if (list != null) {
                list2 = list.subList(0, min);
            } else {
                list2 = null;
            }
            cVar.mo68158a(list2);
        }
    }

    public TwoColumnViewHolder(View view, boolean z) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f69974a = z;
        this.f69975d = (DmtTextView) view.findViewById(R.id.e3f);
        View findViewById = view.findViewById(R.id.cqp);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.recycler_view)");
        this.f69976e = (RecyclerView) findViewById;
        this.f69976e.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
        this.f69976e.setAdapter(this.f69977f);
        if (this.f69974a) {
            this.f69975d.setText(R.string.e9x);
        } else {
            this.f69975d.setText(R.string.bcs);
        }
        if (C26654b.m87573a()) {
            DmtTextView dmtTextView = this.f69975d;
            C7573i.m23582a((Object) dmtTextView, "titleView");
            dmtTextView.setVisibility(8);
            LayoutParams layoutParams = this.f69976e.getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).topMargin = (int) C9738o.m28708b(this.f69976e.getContext(), 12.0f);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (C6384b.m19835a().mo15287a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", C6384b.m19835a().mo15295d().double_column_search_history_style, 0) == 2) {
            LayoutParams layoutParams2 = this.f69976e.getLayoutParams();
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
