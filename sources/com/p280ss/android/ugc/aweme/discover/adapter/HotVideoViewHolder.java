package com.p280ss.android.ugc.aweme.discover.adapter;

import android.graphics.Rect;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.hotsearch.model.C30362a;
import com.p280ss.android.ugc.aweme.hotsearch.p1293a.C30352b;
import com.p280ss.android.ugc.aweme.hotsearch.p1294b.C30353a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder */
public class HotVideoViewHolder extends C1293v {

    /* renamed from: a */
    public String f69527a;

    /* renamed from: b */
    public C30352b<Aweme> f69528b;

    /* renamed from: c */
    public List<Aweme> f69529c = new ArrayList();

    /* renamed from: d */
    private C26396a f69530d;

    /* renamed from: e */
    private List<HotVideoItem> f69531e;

    /* renamed from: f */
    private LinearLayoutManager f69532f;
    View mLeftTitleView;
    RecyclerView mRecyclerView;
    View mRightArrowView;
    View mRightTitleView;
    View mYellowDotView;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder$a */
    class C26396a extends C1262a<C1293v> {

        /* renamed from: b */
        private List<HotVideoItem> f69536b;

        public final int getItemCount() {
            return this.f69536b.size();
        }

        C26396a() {
        }

        /* renamed from: a */
        public final void mo67981a(List<HotVideoItem> list) {
            if (!C6307b.m19566a((Collection<T>) list)) {
                if (this.f69536b == null) {
                    this.f69536b = new ArrayList();
                }
                this.f69536b.clear();
                this.f69536b.addAll(list);
            }
        }

        public final void onViewAttachedToWindow(C1293v vVar) {
            super.onViewAttachedToWindow(vVar);
            int adapterPosition = vVar.getAdapterPosition();
            if (!C6307b.m19566a((Collection<T>) this.f69536b) && this.f69536b.get(adapterPosition) != null && ((HotVideoItem) this.f69536b.get(adapterPosition)).getAweme() != null) {
                C6907h.m21524a("hot_search_video_keyword", (Map) new C22984d().mo59973a("group_id", ((HotVideoItem) this.f69536b.get(vVar.getAdapterPosition())).getAweme().getAid()).mo59973a("author_id", ((HotVideoItem) this.f69536b.get(vVar.getAdapterPosition())).getAweme().getAuthorUid()).mo59973a("action_type", "show").mo59973a("enter_from", "discovery").mo59970a(POIService.KEY_ORDER, vVar.getAdapterPosition() + 1).f60753a);
            }
        }

        public final void onBindViewHolder(C1293v vVar, int i) {
            ((HotVideoItemViewHolder) vVar).mo67974a((HotVideoItem) this.f69536b.get(i), i);
        }

        public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return HotVideoItemViewHolder.m86862a(viewGroup, HotVideoViewHolder.this.f69527a, HotVideoViewHolder.this.f69528b);
        }
    }

    /* renamed from: d */
    private void m86875d() {
        m86874c();
    }

    /* renamed from: b */
    private void m86873b() {
        this.itemView.getContext();
        if (this.mYellowDotView != null && this.mYellowDotView.isShown()) {
            SharePrefCache.inst().getIsShowRankingIndicator().mo59871a(Boolean.valueOf(false));
            m86874c();
        }
    }

    /* renamed from: c */
    private void m86874c() {
        C23487o.m77140a(this.mYellowDotView, 8);
        LayoutParams layoutParams = (LayoutParams) this.mRightArrowView.getLayoutParams();
        layoutParams.leftMargin = (int) C9738o.m28708b(this.itemView.getContext(), 5.0f);
        this.mRightArrowView.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m86872a() {
        this.f69532f = new WrapLinearLayoutManager(this.itemView.getContext(), 0, false);
        this.mRecyclerView.setLayoutManager(this.f69532f);
        this.mRecyclerView.mo5525a((C1272h) new C1272h() {
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                super.getItemOffsets(rect, view, recyclerView, sVar);
                rect.right = C23486n.m77122a(6.0d);
                if (recyclerView.getLayoutManager() != null && RecyclerView.m5892f(view) == recyclerView.getLayoutManager().mo5744A() - 1) {
                    rect.right = 0;
                }
            }
        });
        this.f69530d = new C26396a();
        this.mRecyclerView.setAdapter(this.f69530d);
        this.mLeftTitleView.setOnClickListener(new C26497n(this));
        this.mRightTitleView.setOnClickListener(new C26498o(this));
        this.f69528b = new C30352b<Aweme>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo67980a(Aweme aweme, int i) {
                C30353a.m99181a(aweme, i + 1, "click", 1);
                C30362a aVar = new C30362a();
                aVar.mo79934a(HotVideoViewHolder.this.f69529c);
                C28503s.m93679a((C25673a) aVar);
                C7195s a = C7195s.m22438a();
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(aweme.getAid());
                a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "discovery_hot_search_video").mo18694a("video_from", "from_hot_search_aweme").mo18695a());
            }
        };
    }

    private HotVideoViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f69531e = new ArrayList();
        m86872a();
    }

    /* renamed from: a */
    public static HotVideoViewHolder m86871a(ViewGroup viewGroup) {
        return new HotVideoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3s, viewGroup, false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo67979b(View view) {
        C6907h.m21524a("enter_hot_search_video_board", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").mo59973a("enter_method", "click_hot_search_video_today").f60753a);
        m86873b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67976a(View view) {
        C6907h.m21524a("enter_hot_search_video_board", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").mo59973a("enter_method", "click_more").f60753a);
        m86873b();
    }

    /* renamed from: a */
    public final void mo67977a(List<HotVideoItem> list) {
        if (!C6307b.m19566a((Collection<T>) list) && this.f69531e != list) {
            m86875d();
            this.f69531e = list;
            this.f69530d.mo67981a(this.f69531e);
            this.f69530d.notifyDataSetChanged();
            this.f69529c.clear();
            for (int i = 0; i < this.f69531e.size(); i++) {
                this.f69529c.add(((HotVideoItem) this.f69531e.get(i)).getAweme());
            }
        }
    }

    /* renamed from: a */
    public final void mo67978a(boolean z) {
        if (this.mRecyclerView != null && this.f69532f != null) {
            int l = this.f69532f.mo5447l();
            for (int j = this.f69532f.mo5445j(); j <= l; j++) {
                C1293v f = this.mRecyclerView.mo5575f(j);
                if (f != null) {
                    ((HotVideoItemViewHolder) f).mo67975a(z);
                }
            }
        }
    }
}
