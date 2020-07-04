package com.p280ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.abtest.EnableHotSearchAwemeBillboardExperiment;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27013b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.HotSearchImageSectionDecoration;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder */
public class HotSearchImageViewHolder extends C1293v implements GenericLifecycleObserver {

    /* renamed from: a */
    public String f69503a;

    /* renamed from: b */
    public C27013b f69504b;

    /* renamed from: c */
    boolean f69505c = true;

    /* renamed from: d */
    private C0043i f69506d;

    /* renamed from: e */
    private C26390a f69507e;

    /* renamed from: f */
    private List<HotSearchItem> f69508f;

    /* renamed from: g */
    private long f69509g;
    ImageView ivMore;
    View mHotSearchBoardView;
    RecyclerView mHotSearchCardView;
    DmtTextView mTitle;
    DmtTextView mViewMoreTextView;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder$a */
    class C26390a extends C1262a<C1293v> {

        /* renamed from: b */
        private List<HotSearchItem> f69513b;

        public final int getItemCount() {
            return 6;
        }

        /* renamed from: a */
        private void m86842a() {
            this.f69513b = new ArrayList();
            for (int i = 0; i < 6; i++) {
                this.f69513b.add(HotSearchItem.Companion.createPlaceHolder());
            }
        }

        C26390a() {
            m86842a();
        }

        /* renamed from: a */
        public final void mo67969a(List<HotSearchItem> list) {
            if (!C6307b.m19566a((Collection<T>) list)) {
                if (this.f69513b == null) {
                    this.f69513b = new ArrayList();
                }
                this.f69513b.clear();
                this.f69513b.addAll(list);
            }
        }

        public final void onBindViewHolder(C1293v vVar, int i) {
            ((HotSearchImageItemNewViewHolder) vVar).mo67960a((HotSearchItem) this.f69513b.get(i), i);
        }

        public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return HotSearchImageItemNewViewHolder.m86817a(viewGroup, HotSearchImageViewHolder.this.f69503a, HotSearchImageViewHolder.this.f69504b);
        }
    }

    /* renamed from: a */
    public final String mo67963a() {
        if (TextUtils.equals("hot_search_section_discovery", this.f69503a)) {
            return "discovery";
        }
        return this.f69503a;
    }

    /* renamed from: c */
    public final void mo67967c() {
        ((C24877b) C24877b.f65602l.mo65136a(this.itemView.getContext())).mo65116a(this.itemView, this.f69506d);
    }

    /* renamed from: b */
    public final void mo67966b() {
        if (!C6900g.m21454b().mo16943d()) {
            C10761a.m31403c((Context) AwemeApplication.m21341a(), this.itemView.getResources().getString(R.string.cjs)).mo25750a();
        }
        this.itemView.getContext();
        if (m86831f()) {
            SharePrefCache.inst().getIsShowRankingIndicator().mo59871a(Boolean.valueOf(false));
        }
    }

    /* renamed from: f */
    private static boolean m86831f() {
        if (!((Boolean) SharePrefCache.inst().getIsShowRankingIndicator().mo59877d()).booleanValue() || !((Boolean) SharePrefCache.inst().getIsHotSearchAwemeBillboardEnable().mo59877d()).booleanValue() || !C6384b.m19835a().mo15292a(EnableHotSearchAwemeBillboardExperiment.class, true, "enable_hotsearch_aweme_billboard", C6384b.m19835a().mo15295d().enable_hotsearch_aweme_billboard, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m86830e() {
        if ("hot_search_section_search".equals(this.f69503a)) {
            this.mTitle.setTextSize(1, 17.0f);
            this.mTitle.setCompoundDrawablePadding(0);
            this.mTitle.setCompoundDrawables(null, null, null, null);
            this.mTitle.setTextColor(this.mTitle.getContext().getResources().getColor(R.color.lt));
            this.mViewMoreTextView.setTextColor(this.mViewMoreTextView.getContext().getResources().getColor(R.color.a53));
            this.ivMore.setImageResource(R.drawable.afi);
            LayoutParams layoutParams = (LayoutParams) this.ivMore.getLayoutParams();
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(0);
            } else {
                layoutParams.leftMargin = 0;
            }
            this.ivMore.setLayoutParams(layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mHotSearchBoardView.getLayoutParams();
            marginLayoutParams.topMargin = C23486n.m77122a(10.0d);
            marginLayoutParams.bottomMargin = C23486n.m77122a(16.0d);
            this.mHotSearchBoardView.setLayoutParams(marginLayoutParams);
        }
        this.mHotSearchCardView.setLayoutManager(new WrapGridLayoutManager(this.itemView.getContext(), 3) {
            /* renamed from: e */
            public final boolean mo5438e() {
                return false;
            }

            /* renamed from: f */
            public final boolean mo5441f() {
                return false;
            }
        });
        ShapeDrawable a = m86826a(this.itemView.getContext());
        int b = (int) C9738o.m28708b(this.itemView.getContext(), 6.0f);
        a.setIntrinsicWidth(b);
        a.setIntrinsicHeight(b);
        this.mHotSearchCardView.mo5525a((C1272h) new HotSearchImageSectionDecoration(a, a));
        this.f69507e = new C26390a();
        this.mHotSearchCardView.setAdapter(this.f69507e);
        this.mHotSearchBoardView.setOnTouchListener(new C27009an() {
            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                C6907h.m21524a("hot_search_icon", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("enter_from", HotSearchImageViewHolder.this.mo67963a()).mo59973a("enter_method", "click_read_more").f60753a);
                HotSearchImageViewHolder.this.mo67966b();
            }
        });
        this.mTitle.setOnClickListener(new C26488h(this));
        this.f69506d.getLifecycle().mo55a(this);
    }

    /* renamed from: d */
    public final void mo67968d() {
        String str;
        if (System.currentTimeMillis() - this.f69509g >= 2000) {
            this.f69509g = System.currentTimeMillis();
            C6907h.m21524a("hot_search_icon", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("enter_from", mo67963a()).f60753a);
            int i = 0;
            while (i < this.f69508f.size()) {
                HotSearchItem hotSearchItem = (HotSearchItem) this.f69508f.get(i);
                String str2 = "hot_search_keyword";
                C22984d a = C22984d.m75611a().mo59973a("action_type", "show").mo59973a("key_word", hotSearchItem.getWord());
                String str3 = "key_word_type";
                if (hotSearchItem.getType() == 1) {
                    str = "tag";
                } else {
                    str = "general_word";
                }
                i++;
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59970a(POIService.KEY_ORDER, i).mo59973a("enter_from", this.f69503a).f60753a);
            }
        }
    }

    /* renamed from: a */
    private static ShapeDrawable m86826a(Context context) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        shapeDrawable.getPaint().setColor(context.getResources().getColor(R.color.e9));
        return shapeDrawable;
    }

    /* renamed from: a */
    private void m86829a(boolean z) {
        String str;
        if (TextUtils.equals(this.f69503a, "hot_search_section_search")) {
            str = "hot_search_keyword_show";
        } else {
            str = "hot_search_keyword_show_detail";
        }
        for (int i = 0; i < this.f69508f.size(); i++) {
            HotSearchItem hotSearchItem = (HotSearchItem) this.f69508f.get(i);
            if (hotSearchItem.isAd() && (!hotSearchItem.getHasSentMob() || z)) {
                hotSearchItem.setHasSentMob(true);
                C24962g.m81952a((C24939aj) new C26489i(hotSearchItem), hotSearchItem.getAdData().getTrackUrl(), true);
                C24958f.m81905a().mo65266a("result_ad").mo65276b(str).mo65283e(this.f69503a).mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
                C24958f.m81905a().mo65266a("result_ad").mo65276b("show").mo65286h(hotSearchItem.getAdData().getLogExtra()).mo65264a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).mo65270a(this.itemView.getContext());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67964a(View view) {
        C6907h.m21524a("hot_search_icon", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("enter_from", mo67963a()).mo59973a("enter_method", "click_hot_search").f60753a);
        mo67966b();
    }

    /* renamed from: a */
    public final void mo67965a(List<HotSearchItem> list) {
        if ("hot_search_section_discovery".equals(this.f69503a)) {
            mo67967c();
        }
        if (!C6307b.m19566a((Collection<T>) list) && !list.equals(HotSearchWordViewHolder.f69515g)) {
            ArrayList arrayList = new ArrayList(this.f69508f);
            this.f69508f.clear();
            boolean z = true;
            for (int i = 0; i < Math.min(list.size(), 6); i++) {
                HotSearchItem hotSearchItem = (HotSearchItem) list.get(i);
                if (arrayList.size() != 6 || hotSearchItem != arrayList.get(i)) {
                    z = false;
                }
                this.f69508f.add(hotSearchItem);
            }
            if (!z) {
                this.f69507e.mo67969a(this.f69508f);
                this.f69507e.notifyDataSetChanged();
                mo67968d();
                m86829a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        if (event.equals(Event.ON_RESUME)) {
            if (!this.f69505c && C0991u.m4170G(this.itemView)) {
                m86829a(true);
            }
            this.f69505c = false;
        }
    }

    private HotSearchImageViewHolder(View view, String str, C27013b bVar, C0043i iVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f69508f = new ArrayList();
        this.f69503a = str;
        this.f69504b = bVar;
        this.f69506d = iVar;
        m86830e();
    }

    /* renamed from: a */
    public static HotSearchImageViewHolder m86827a(ViewGroup viewGroup, String str, C27013b bVar, C0043i iVar) {
        return new HotSearchImageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wj, viewGroup, false), str, bVar, iVar);
    }
}
