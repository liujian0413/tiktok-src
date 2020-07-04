package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter;
import com.p280ss.android.ugc.aweme.poi.bean.PoiRecommendPoiFeed;
import com.p280ss.android.ugc.aweme.poi.p335ui.SpaceDecoration;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendPoiViewHolder */
public final class PoiRecommendPoiViewHolder extends C1293v {

    /* renamed from: a */
    private final Context f91598a;

    /* renamed from: b */
    private final DmtTextView f91599b;

    /* renamed from: c */
    private final DmtTextView f91600c;

    /* renamed from: d */
    private final RecyclerView f91601d;

    /* renamed from: e */
    private final View f91602e;

    /* renamed from: f */
    private final View f91603f;

    /* renamed from: g */
    private RecommendPoiAdapter f91604g;

    /* renamed from: h */
    private boolean f91605h;

    /* renamed from: i */
    private WrapLinearLayoutManager f91606i;

    /* renamed from: j */
    private List<? extends SimplePoiInfoStruct> f91607j;

    /* renamed from: k */
    private Integer f91608k;

    /* renamed from: l */
    private PoiSimpleBundle f91609l;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendPoiViewHolder$a */
    static final class C35038a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiRecommendPoiFeed f91610a;

        /* renamed from: b */
        final /* synthetic */ PoiSimpleBundle f91611b;

        C35038a(PoiRecommendPoiFeed poiRecommendPoiFeed, PoiSimpleBundle poiSimpleBundle) {
            this.f91610a = poiRecommendPoiFeed;
            this.f91611b = poiSimpleBundle;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            String a = C35454m.m114520a(this.f91610a.getRecommendType().intValue());
            PoiSimpleBundle poiSimpleBundle = this.f91611b;
            String str2 = "click_more_recommend_poi";
            C22984d a2 = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "click").mo59973a("poi_channel", C33230ac.m107214b());
            String str3 = "poi_id";
            PoiSimpleBundle poiSimpleBundle2 = this.f91611b;
            String str4 = null;
            if (poiSimpleBundle2 != null) {
                str = poiSimpleBundle2.getPoiId();
            } else {
                str = null;
            }
            C35454m.m114523a(poiSimpleBundle, str2, a2.mo59973a(str3, str).mo59973a("city_info", C33230ac.m107204a()).mo59973a("content_type", a));
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "poi_page");
            bundle.putString("enter_method", "click_poi_explore_more_card");
            String str5 = "id";
            PoiSimpleBundle poiSimpleBundle3 = this.f91611b;
            if (poiSimpleBundle3 != null) {
                str4 = poiSimpleBundle3.getPoiId();
            }
            bundle.putString(str5, str4);
            bundle.putInt("recommend_type", this.f91610a.getRecommendType().intValue());
            bundle.putString("recommend_title", this.f91610a.title());
            bundle.putString("content_type", a);
        }
    }

    /* renamed from: a */
    public final void mo88832a() {
        Integer num;
        Integer num2;
        String str;
        if (this.f91608k != null && this.f91607j != null) {
            WrapLinearLayoutManager wrapLinearLayoutManager = this.f91606i;
            if (wrapLinearLayoutManager != null) {
                num = Integer.valueOf(wrapLinearLayoutManager.mo5445j());
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                WrapLinearLayoutManager wrapLinearLayoutManager2 = this.f91606i;
                if (wrapLinearLayoutManager2 != null) {
                    num2 = Integer.valueOf(wrapLinearLayoutManager2.mo5447l());
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    int i = intValue2 - 1;
                    if (intValue >= 0 && i >= intValue) {
                        List<? extends SimplePoiInfoStruct> list = this.f91607j;
                        if (list == null) {
                            C7573i.m23580a();
                        }
                        if (intValue2 < list.size() && intValue <= intValue2) {
                            while (true) {
                                PoiSimpleBundle poiSimpleBundle = this.f91609l;
                                if (poiSimpleBundle != null) {
                                    str = poiSimpleBundle.getPoiId();
                                } else {
                                    str = null;
                                }
                                Integer num3 = this.f91608k;
                                if (num3 == null) {
                                    C7573i.m23580a();
                                }
                                m113135a(str, num3.intValue());
                                if (intValue == intValue2) {
                                    break;
                                }
                                intValue++;
                            }
                        }
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public PoiRecommendPoiViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f91598a = context;
        View findViewById = view.findViewById(R.id.cgc);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.poi_recommend_title)");
        this.f91599b = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.cgb);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.poi_recommend_subtitle)");
        this.f91600c = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.cga);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.poi_recommend_list)");
        this.f91601d = (RecyclerView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cg_);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.…oi_recommend_divider_top)");
        this.f91602e = findViewById4;
        View findViewById5 = view.findViewById(R.id.cg9);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.poi_recommend_divider)");
        this.f91603f = findViewById5;
    }

    /* renamed from: a */
    private final void m113135a(String str, int i) {
        C35454m.m114523a(this.f91609l, "poi_explore_card", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "show").mo59973a("poi_channel", C33230ac.m107214b()).mo59973a("poi_id", str).mo59973a("city_info", C33230ac.m107204a()).mo59973a("content_type", C35454m.m114520a(i)));
    }

    /* renamed from: a */
    public final void mo88833a(PoiRecommendPoiFeed poiRecommendPoiFeed, PoiSimpleBundle poiSimpleBundle) {
        C7573i.m23587b(poiRecommendPoiFeed, "poiRecommendItem");
        this.f91599b.setText(poiRecommendPoiFeed.title());
        if (!poiRecommendPoiFeed.hasMore()) {
            this.f91600c.setVisibility(8);
        } else {
            this.f91600c.setVisibility(0);
            this.f91600c.setOnClickListener(new C35038a(poiRecommendPoiFeed, poiSimpleBundle));
        }
        this.f91607j = poiRecommendPoiFeed.list();
        this.f91608k = Integer.valueOf(poiRecommendPoiFeed.getRecommendType().intValue());
        this.f91609l = poiSimpleBundle;
        if (!this.f91605h) {
            this.f91606i = new WrapLinearLayoutManager(this.f91598a, 0, false);
            this.f91601d.setLayoutManager(this.f91606i);
            this.f91601d.mo5525a((C1272h) new SpaceDecoration(this.f91598a.getResources().getDimensionPixelOffset(R.dimen.lj), C23486n.m77122a(6.0d)));
            this.f91605h = true;
        }
        this.f91601d.mo5528a((C1281m) new PoiRecommendPoiViewHolder$bind$2(poiSimpleBundle, poiRecommendPoiFeed));
        this.f91604g = new RecommendPoiAdapter(this.f91607j, poiSimpleBundle, poiRecommendPoiFeed.getRecommendType(), poiRecommendPoiFeed.title());
        this.f91601d.setAdapter(this.f91604g);
        if (poiRecommendPoiFeed.getHideDivider()) {
            this.f91603f.setVisibility(8);
        } else {
            this.f91603f.setVisibility(0);
        }
        if (poiRecommendPoiFeed.getHideTopDivider()) {
            this.f91602e.setVisibility(8);
        } else {
            this.f91602e.setVisibility(0);
        }
    }
}
