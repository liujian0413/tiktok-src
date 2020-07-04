package com.p280ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.abtest.GuideSearchItemLenSettings;
import com.p280ss.android.ugc.aweme.discover.abtest.GuideSearchUIOptimization;
import com.p280ss.android.ugc.aweme.discover.mob.C26799t.C26800a;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p280ss.android.ugc.aweme.discover.model.GuideSearchWordKt;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26574a;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView */
public final class GuideSearchHeadView extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f71815a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GuideSearchHeadView.class), "listView", "getListView()Landroid/support/v7/widget/RecyclerView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GuideSearchHeadView.class), "adapter", "getAdapter()Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView$GuideSearchAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GuideSearchHeadView.class), "layoutManager", "getLayoutManager()Landroid/support/v7/widget/LinearLayoutManager;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GuideSearchHeadView.class), "alreadyMobWords", "getAlreadyMobWords()Ljava/util/HashSet;"))};

    /* renamed from: b */
    private final C7541d f71816b;

    /* renamed from: c */
    private final C7541d f71817c;

    /* renamed from: d */
    private final C7541d f71818d;

    /* renamed from: e */
    private final C7541d f71819e;

    /* renamed from: f */
    private int f71820f;

    /* renamed from: g */
    private String f71821g;

    /* renamed from: h */
    private String f71822h;

    /* renamed from: i */
    private C27276d f71823i;

    /* renamed from: j */
    private boolean f71824j;

    /* renamed from: k */
    private HashMap f71825k;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$GuideSearchAdapter */
    public final class GuideSearchAdapter extends C1262a<C1293v> {

        /* renamed from: a */
        public List<GuideSearchWord> f71826a;

        /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$GuideSearchAdapter$a */
        static final class C27262a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ GuideSearchAdapter f71828a;

            /* renamed from: b */
            final /* synthetic */ int f71829b;

            C27262a(GuideSearchAdapter guideSearchAdapter, int i) {
                this.f71828a = guideSearchAdapter;
                this.f71829b = i;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                GuideSearchHeadView guideSearchHeadView = GuideSearchHeadView.this;
                String str = "trending_words_click";
                List<GuideSearchWord> list = this.f71828a.f71826a;
                if (list == null) {
                    C7573i.m23580a();
                }
                guideSearchHeadView.mo70024a(str, (GuideSearchWord) list.get(this.f71829b), this.f71829b);
                C26612d.f70187a.mo68302a(2);
                if (!GuideSearchHeadView.this.getNewStyle()) {
                    List<GuideSearchWord> list2 = this.f71828a.f71826a;
                    if (list2 == null) {
                        C7573i.m23580a();
                    }
                    String word = ((GuideSearchWord) list2.get(this.f71829b)).getWord();
                    if (word == null) {
                        C7573i.m23580a();
                    }
                    C42961az.m136380a(new C26574a(word));
                    return;
                }
                List<GuideSearchWord> list3 = this.f71828a.f71826a;
                if (list3 == null) {
                    C7573i.m23580a();
                }
                int i = 0;
                for (Object next : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C7525m.m23465b();
                    }
                    GuideSearchWord guideSearchWord = (GuideSearchWord) next;
                    if (guideSearchWord.getSelected() && i != this.f71829b) {
                        guideSearchWord.setSelected(false);
                        this.f71828a.notifyItemChanged(i);
                    } else if (i == this.f71829b) {
                        guideSearchWord.setSelected(true);
                        this.f71828a.notifyItemChanged(i);
                    }
                    i = i2;
                }
                GuideSearchAdapter guideSearchAdapter = this.f71828a;
                C7573i.m23582a((Object) view, "it");
                guideSearchAdapter.mo70032a(view);
                List<GuideSearchWord> list4 = this.f71828a.f71826a;
                if (list4 == null) {
                    C7573i.m23580a();
                }
                GuideSearchWord guideSearchWord2 = (GuideSearchWord) list4.get(this.f71829b);
                C27276d itemClickListener = GuideSearchHeadView.this.getItemClickListener();
                if (itemClickListener != null) {
                    itemClickListener.mo69688a(guideSearchWord2);
                }
            }
        }

        public final int getItemCount() {
            if (this.f71826a == null) {
                return 0;
            }
            List<GuideSearchWord> list = this.f71826a;
            if (list == null) {
                C7573i.m23580a();
            }
            return list.size();
        }

        public GuideSearchAdapter() {
        }

        /* renamed from: a */
        public final void mo70033a(List<GuideSearchWord> list) {
            this.f71826a = list;
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public final void mo70032a(View view) {
            RecyclerView listView = GuideSearchHeadView.this.getListView();
            C7573i.m23582a((Object) listView, "listView");
            GuideSearchHeadView.this.getListView().mo5521a((int) ((view.getX() + (((float) view.getWidth()) * 0.5f)) - (((float) listView.getWidth()) * 0.5f)), 0);
        }

        public final void onViewAttachedToWindow(C1293v vVar) {
            C7573i.m23587b(vVar, "holder");
            GuideSearchWord guideSearchWord = ((GuideSearchViewHolder) vVar).f71831b;
            if (guideSearchWord != null) {
                List<GuideSearchWord> list = this.f71826a;
                if (list != null) {
                    int indexOf = list.indexOf(guideSearchWord);
                    if (!GuideSearchHeadView.this.getAlreadyMobWords().contains(guideSearchWord)) {
                        GuideSearchHeadView.this.getAlreadyMobWords().add(guideSearchWord);
                        GuideSearchHeadView.this.mo70024a("trending_words_show", guideSearchWord, indexOf);
                    }
                }
            }
        }

        public final void onBindViewHolder(C1293v vVar, int i) {
            C7573i.m23587b(vVar, "holder");
            GuideSearchViewHolder guideSearchViewHolder = (GuideSearchViewHolder) vVar;
            List<GuideSearchWord> list = this.f71826a;
            if (list == null) {
                C7573i.m23580a();
            }
            guideSearchViewHolder.mo70035a((GuideSearchWord) list.get(i), GuideSearchHeadView.this.getNewStyle());
            vVar.itemView.setOnClickListener(new C27262a(this, i));
        }

        public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wg, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…arch_word, parent, false)");
            return new GuideSearchViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$GuideSearchViewHolder */
    public static final class GuideSearchViewHolder extends C1293v {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f71830a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GuideSearchViewHolder.class), "selectedTextColor", "getSelectedTextColor()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GuideSearchViewHolder.class), "unselectedTextColor", "getUnselectedTextColor()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GuideSearchViewHolder.class), "unselectedBackground", "getUnselectedBackground()Landroid/graphics/drawable/Drawable;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GuideSearchViewHolder.class), "selectedBackground", "getSelectedBackground()Landroid/graphics/drawable/Drawable;"))};

        /* renamed from: b */
        public GuideSearchWord f71831b;

        /* renamed from: c */
        private final C7541d f71832c;

        /* renamed from: d */
        private final C7541d f71833d;

        /* renamed from: e */
        private final C7541d f71834e;

        /* renamed from: f */
        private final C7541d f71835f;

        /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$GuideSearchViewHolder$a */
        static final class C27263a extends Lambda implements C7561a<Drawable> {

            /* renamed from: a */
            final /* synthetic */ View f71836a;

            C27263a(View view) {
                this.f71836a = view;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Drawable invoke() {
                Context context = this.f71836a.getContext();
                C7573i.m23582a((Object) context, "itemView.context");
                return context.getResources().getDrawable(R.drawable.my);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$GuideSearchViewHolder$b */
        static final class C27264b extends Lambda implements C7561a<Integer> {

            /* renamed from: a */
            final /* synthetic */ View f71837a;

            C27264b(View view) {
                this.f71837a = view;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(m89303a());
            }

            /* renamed from: a */
            private int m89303a() {
                Context context = this.f71837a.getContext();
                C7573i.m23582a((Object) context, "itemView.context");
                return context.getResources().getColor(R.color.se);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$GuideSearchViewHolder$c */
        static final class C27265c extends Lambda implements C7561a<Drawable> {

            /* renamed from: a */
            final /* synthetic */ View f71838a;

            C27265c(View view) {
                this.f71838a = view;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Drawable invoke() {
                Context context = this.f71838a.getContext();
                C7573i.m23582a((Object) context, "itemView.context");
                return context.getResources().getDrawable(R.drawable.mx);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$GuideSearchViewHolder$d */
        static final class C27266d extends Lambda implements C7561a<Integer> {

            /* renamed from: a */
            final /* synthetic */ View f71839a;

            C27266d(View view) {
                this.f71839a = view;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(m89305a());
            }

            /* renamed from: a */
            private int m89305a() {
                Context context = this.f71839a.getContext();
                C7573i.m23582a((Object) context, "itemView.context");
                return context.getResources().getColor(R.color.a3o);
            }
        }

        /* renamed from: a */
        private final int m89297a() {
            return ((Number) this.f71832c.getValue()).intValue();
        }

        /* renamed from: b */
        private final int m89298b() {
            return ((Number) this.f71833d.getValue()).intValue();
        }

        /* renamed from: c */
        private final Drawable m89299c() {
            return (Drawable) this.f71834e.getValue();
        }

        /* renamed from: d */
        private final Drawable m89300d() {
            return (Drawable) this.f71835f.getValue();
        }

        public GuideSearchViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            this.f71832c = C27275c.m89323a(new C27264b(view));
            this.f71833d = C27275c.m89323a(new C27266d(view));
            this.f71834e = C27275c.m89323a(new C27265c(view));
            this.f71835f = C27275c.m89323a(new C27263a(view));
        }

        /* renamed from: a */
        public final void mo70035a(GuideSearchWord guideSearchWord, boolean z) {
            C7573i.m23587b(guideSearchWord, "word");
            this.f71831b = guideSearchWord;
            View view = this.itemView;
            if (view != null) {
                ((DmtTextView) view).setText(guideSearchWord.getWord());
                if (z) {
                    if (guideSearchWord.getSelected()) {
                        ((DmtTextView) this.itemView).setTextColor(m89297a());
                        this.itemView.setBackground(m89300d());
                        return;
                    }
                    ((DmtTextView) this.itemView).setTextColor(m89298b());
                    this.itemView.setBackground(m89299c());
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$SpaceItemDecoration */
    public static final class SpaceItemDecoration extends C1272h {

        /* renamed from: a */
        private final int f71840a;

        public SpaceItemDecoration(int i) {
            this.f71840a = i;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
            C7573i.m23587b(rect, "outRect");
            C7573i.m23587b(view, "view");
            C7573i.m23587b(recyclerView, "parent");
            C7573i.m23587b(sVar, "state");
            if (RecyclerView.m5892f(view) == 0) {
                rect.left = this.f71840a;
            }
            rect.right = this.f71840a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$a */
    static final class C27267a extends Lambda implements C7561a<GuideSearchAdapter> {

        /* renamed from: a */
        final /* synthetic */ GuideSearchHeadView f71841a;

        C27267a(GuideSearchHeadView guideSearchHeadView) {
            this.f71841a = guideSearchHeadView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GuideSearchAdapter invoke() {
            return new GuideSearchAdapter();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$b */
    static final class C27268b extends Lambda implements C7561a<HashSet<GuideSearchWord>> {

        /* renamed from: a */
        public static final C27268b f71842a = new C27268b();

        C27268b() {
            super(0);
        }

        /* renamed from: a */
        private static HashSet<GuideSearchWord> m89307a() {
            return new HashSet<>();
        }

        public final /* synthetic */ Object invoke() {
            return m89307a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$c */
    static final class C27269c extends Lambda implements C7561a<LinearLayoutManager> {

        /* renamed from: a */
        final /* synthetic */ Context f71843a;

        C27269c(Context context) {
            this.f71843a = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayoutManager invoke() {
            return new LinearLayoutManager(this.f71843a, 0, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$d */
    static final class C27270d extends Lambda implements C7561a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ GuideSearchHeadView f71844a;

        C27270d(GuideSearchHeadView guideSearchHeadView) {
            this.f71844a = guideSearchHeadView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecyclerView invoke() {
            return (RecyclerView) this.f71844a.mo70023a((int) R.id.cqp);
        }
    }

    public GuideSearchHeadView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GuideSearchHeadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final GuideSearchAdapter getAdapter() {
        return (GuideSearchAdapter) this.f71817c.getValue();
    }

    private final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.f71818d.getValue();
    }

    /* renamed from: a */
    public final View mo70023a(int i) {
        if (this.f71825k == null) {
            this.f71825k = new HashMap();
        }
        View view = (View) this.f71825k.get(Integer.valueOf(R.id.cqp));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.cqp);
        this.f71825k.put(Integer.valueOf(R.id.cqp), findViewById);
        return findViewById;
    }

    public final HashSet<GuideSearchWord> getAlreadyMobWords() {
        return (HashSet) this.f71819e.getValue();
    }

    public final C27276d getItemClickListener() {
        return this.f71823i;
    }

    public final RecyclerView getListView() {
        return (RecyclerView) this.f71816b.getValue();
    }

    public final boolean getNewStyle() {
        return this.f71824j;
    }

    public final void setItemClickListener(C27276d dVar) {
        this.f71823i = dVar;
    }

    public final void setNewStyle(boolean z) {
        this.f71824j = z;
    }

    /* renamed from: a */
    private final void m89291a(List<GuideSearchWord> list) {
        C6907h.m21524a("trending_show", (Map) C22984d.m75611a().mo59970a("words_num", list.size()).mo59973a("words_source", "guide_search").mo59973a("query", this.f71822h).mo59973a("search_id", SearchContext.m87922a(C26800a.m87997a(this.f71821g))).mo59973a("search_subtab_name", this.f71821g).f60753a);
    }

    /* renamed from: a */
    private final List<GuideSearchWord> m89290a(List<GuideSearchWord> list, boolean z) {
        String str;
        List<GuideSearchWord> d = C7525m.m23509d((Collection<? extends T>) list);
        for (GuideSearchWord guideSearchWord : d) {
            String word = guideSearchWord.getWord();
            if (word == null) {
                C7573i.m23580a();
            }
            if (word.length() <= this.f71820f - 1 || this.f71820f - 1 <= 0) {
                str = guideSearchWord.getWord();
            } else {
                StringBuilder sb = new StringBuilder();
                String word2 = guideSearchWord.getWord();
                if (word2 == null) {
                    C7573i.m23580a();
                }
                int i = this.f71820f - 1;
                if (word2 != null) {
                    String substring = word2.substring(0, i);
                    C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append("...");
                    str = sb.toString();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            guideSearchWord.setWord(str);
        }
        if (z) {
            d.add(0, GuideSearchWordKt.createTabForAll());
        }
        return d;
    }

    public GuideSearchHeadView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f71816b = C27275c.m89323a(new C27270d(this));
        this.f71817c = C27275c.m89323a(new C27267a(this));
        this.f71818d = C27275c.m89323a(new C27269c(context));
        this.f71819e = C27275c.m89323a(C27268b.f71842a);
        this.f71820f = C10292j.m30480a().mo25012a(GuideSearchItemLenSettings.class, "guide_search_item_len", C6384b.m19835a().mo15294c().getGuideSearchItemLen());
        LayoutInflater.from(context).inflate(R.layout.b3b, this, true);
        RecyclerView listView = getListView();
        C7573i.m23582a((Object) listView, "listView");
        listView.setLayoutManager(getLayoutManager());
        RecyclerView listView2 = getListView();
        C7573i.m23582a((Object) listView2, "listView");
        listView2.setAdapter(getAdapter());
        getListView().mo5525a((C1272h) new SpaceItemDecoration((int) C9738o.m28708b(getContext(), 12.0f)));
        if (this.f71820f == 0) {
            this.f71820f = 7;
        }
    }

    /* renamed from: a */
    public final void mo70024a(String str, GuideSearchWord guideSearchWord, int i) {
        C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("group_id", guideSearchWord.getId()).mo59973a("words_source", "guide_search").mo59970a("words_position", i).mo59973a("words_content", guideSearchWord.getWord()).mo59973a("query", this.f71822h).mo59973a("search_id", SearchContext.m87922a(C26800a.m87997a(this.f71821g))).mo59973a("search_subtab_name", this.f71821g).f60753a);
    }

    /* renamed from: a */
    public final void mo70025a(List<GuideSearchWord> list, String str, String str2) {
        C7573i.m23587b(list, "wordList");
        C7573i.m23587b(str, "originalKeyword");
        setVisibility(0);
        boolean z = true;
        if (C10292j.m30480a().mo25012a(GuideSearchUIOptimization.class, "search_new_gs_style", C6384b.m19835a().mo15294c().getSearchNewGsStyle()) != 1) {
            z = false;
        }
        this.f71824j = z;
        getAdapter().mo70033a(m89290a(list, this.f71824j));
        getListView().mo5541b(0);
        getAlreadyMobWords().clear();
        this.f71822h = str;
        this.f71821g = str2;
        if (!C6307b.m19566a((Collection<T>) list)) {
            m89291a(list);
        }
    }

    public /* synthetic */ GuideSearchHeadView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
