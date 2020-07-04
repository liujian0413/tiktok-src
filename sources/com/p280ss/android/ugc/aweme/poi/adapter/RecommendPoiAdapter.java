package com.p280ss.android.ugc.aweme.poi.adapter;

import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.SquareImageView;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import com.p280ss.android.ugc.aweme.poi.p335ui.PoiDetailActivity;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter */
public final class RecommendPoiAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    private final List<SimplePoiInfoStruct> f91452a;

    /* renamed from: b */
    private final PoiSimpleBundle f91453b;

    /* renamed from: c */
    private final Integer f91454c;

    /* renamed from: d */
    private final String f91455d;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$ClickToMoreViewHolder */
    public static final class ClickToMoreViewHolder extends C1293v {

        /* renamed from: com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$ClickToMoreViewHolder$a */
        static final class C35010a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ PoiSimpleBundle f91456a;

            /* renamed from: b */
            final /* synthetic */ Integer f91457b;

            /* renamed from: c */
            final /* synthetic */ String f91458c;

            C35010a(PoiSimpleBundle poiSimpleBundle, Integer num, String str) {
                this.f91456a = poiSimpleBundle;
                this.f91457b = num;
                this.f91458c = str;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                PoiSimpleBundle poiSimpleBundle = this.f91456a;
                String str2 = "click_more_recommend_poi";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "click").mo59973a("poi_channel", C33230ac.m107214b());
                String str3 = "poi_id";
                PoiSimpleBundle poiSimpleBundle2 = this.f91456a;
                String str4 = null;
                if (poiSimpleBundle2 != null) {
                    str = poiSimpleBundle2.getPoiId();
                } else {
                    str = null;
                }
                C35454m.m114523a(poiSimpleBundle, str2, a.mo59973a(str3, str).mo59973a("city_info", C33230ac.m107204a()).mo59973a("content_type", C35454m.m114520a(this.f91457b.intValue())));
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", "poi_page");
                bundle.putString("enter_method", "click_poi_explore_more_card");
                String str5 = "id";
                PoiSimpleBundle poiSimpleBundle3 = this.f91456a;
                if (poiSimpleBundle3 != null) {
                    str4 = poiSimpleBundle3.getPoiId();
                }
                bundle.putString(str5, str4);
                bundle.putInt("recommend_type", this.f91457b.intValue());
                bundle.putString("recommend_title", this.f91458c);
            }
        }

        public ClickToMoreViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
        }

        /* renamed from: a */
        public final void mo88776a(String str, PoiSimpleBundle poiSimpleBundle, Integer num) {
            C7573i.m23587b(str, "title");
            C7573i.m23587b(num, "recommendType");
            this.itemView.setOnClickListener(new C35010a(poiSimpleBundle, num, str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$PoiItemViewHolder */
    public static final class PoiItemViewHolder extends C1293v {

        /* renamed from: a */
        private final ImageView f91459a;

        /* renamed from: b */
        private final SquareImageView f91460b;

        /* renamed from: c */
        private final DmtTextView f91461c;

        /* renamed from: d */
        private final DmtTextView f91462d;

        /* renamed from: e */
        private final DmtTextView f91463e;

        /* renamed from: com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$PoiItemViewHolder$a */
        static final class C35011a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ PoiItemViewHolder f91464a;

            /* renamed from: b */
            final /* synthetic */ PoiSimpleBundle f91465b;

            /* renamed from: c */
            final /* synthetic */ SimplePoiInfoStruct f91466c;

            /* renamed from: d */
            final /* synthetic */ Integer f91467d;

            C35011a(PoiItemViewHolder poiItemViewHolder, PoiSimpleBundle poiSimpleBundle, SimplePoiInfoStruct simplePoiInfoStruct, Integer num) {
                this.f91464a = poiItemViewHolder;
                this.f91465b = poiSimpleBundle;
                this.f91466c = simplePoiInfoStruct;
                this.f91467d = num;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                C35109e eVar = new C35109e();
                PoiSimpleBundle poiSimpleBundle = this.f91465b;
                if (poiSimpleBundle != null) {
                    str = poiSimpleBundle.getPoiId();
                } else {
                    str = null;
                }
                C35109e q = eVar.mo89362w(str).mo89352m("poi_page").mo89342c(this.f91466c.getPoiId()).mo89350k(this.f91466c.getPoiName()).mo89334a(this.f91466c).mo89364y(C35454m.m114520a(this.f91467d.intValue())).mo89356q("click_poi_explore_card");
                View view2 = this.f91464a.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                PoiDetailActivity.m113790a(view2.getContext(), q.mo89331a());
            }
        }

        public PoiItemViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.b4a);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.…item_poi_img_placeholder)");
            this.f91459a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.b4_);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.item_poi_img)");
            this.f91460b = (SquareImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.b4r);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.item_poi_title)");
            this.f91461c = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.b49);
            C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.item_poi_distance)");
            this.f91462d = (DmtTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.b4d);
            C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.item_poi_price)");
            this.f91463e = (DmtTextView) findViewById5;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0168  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x016d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo88778a(com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r18, com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle r19, java.lang.Integer r20) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                r3 = r20
                java.lang.String r4 = "recommendType"
                kotlin.jvm.internal.C7573i.m23587b(r3, r4)
                if (r1 != 0) goto L_0x0010
                return
            L_0x0010:
                android.view.View r4 = r0.itemView
                com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$PoiItemViewHolder$a r5 = new com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$PoiItemViewHolder$a
                r5.<init>(r0, r2, r1, r3)
                android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
                r4.setOnClickListener(r5)
                com.ss.android.ugc.aweme.base.ui.SquareImageView r4 = r0.f91460b
                r5 = 2131100712(0x7f060428, float:1.7813813E38)
                r4.setImageResource(r5)
                com.ss.android.ugc.aweme.base.model.UrlModel r4 = r18.getCover()
                r5 = 8
                r6 = 0
                if (r4 == 0) goto L_0x0054
                com.ss.android.ugc.aweme.base.model.UrlModel r4 = r18.getCover()
                java.lang.String r7 = "poi.cover"
                kotlin.jvm.internal.C7573i.m23582a(r4, r7)
                java.util.List r4 = r4.getUrlList()
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = com.bytedance.common.utility.collection.C6307b.m19566a(r4)
                if (r4 == 0) goto L_0x0043
                goto L_0x0054
            L_0x0043:
                android.widget.ImageView r4 = r0.f91459a
                r4.setVisibility(r5)
                com.ss.android.ugc.aweme.base.ui.SquareImageView r4 = r0.f91460b
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r4
                com.ss.android.ugc.aweme.base.model.UrlModel r7 = r18.getCover()
                com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r4, r7)
                goto L_0x0059
            L_0x0054:
                android.widget.ImageView r4 = r0.f91459a
                r4.setVisibility(r6)
            L_0x0059:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r0.f91461c
                java.lang.String r7 = r18.getPoiName()
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r4.setText(r7)
                com.ss.android.ugc.aweme.location.p r4 = com.p280ss.android.ugc.aweme.location.C32639p.C32640a.m105721a()
                com.ss.android.ugc.aweme.location.LocationResult r4 = r4.mo84021a()
                if (r4 == 0) goto L_0x00d3
                boolean r7 = r4.isValid()
                if (r7 == 0) goto L_0x00d3
                java.lang.String r7 = r18.getLatitude()
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 != 0) goto L_0x00d3
                java.lang.String r7 = r18.getLongitude()
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 == 0) goto L_0x008d
                goto L_0x00d3
            L_0x008d:
                double r9 = r4.getLatitude()
                double r11 = r4.getLongitude()
                java.lang.String r4 = r18.getLatitude()
                java.lang.Double r4 = java.lang.Double.valueOf(r4)
                if (r4 != 0) goto L_0x00a2
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00a2:
                double r13 = r4.doubleValue()
                java.lang.String r4 = r18.getLongitude()
                java.lang.Double r4 = java.lang.Double.valueOf(r4)
                if (r4 != 0) goto L_0x00b3
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00b3:
                double r15 = r4.doubleValue()
                android.view.View r4 = r0.itemView
                java.lang.String r7 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r4, r7)
                android.content.Context r8 = r4.getContext()
                java.lang.String r4 = com.p280ss.android.ugc.aweme.poi.utils.C35442b.m114473c(r8, r9, r11, r13, r15)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r0.f91462d
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r7.setText(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r0.f91462d
                r4.setVisibility(r6)
                goto L_0x00f5
            L_0x00d3:
                java.lang.String r4 = r18.getCity()
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 == 0) goto L_0x00e5
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r0.f91462d
                r4.setVisibility(r5)
                goto L_0x00f5
            L_0x00e5:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r0.f91462d
                java.lang.String r7 = r18.getCity()
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r4.setText(r7)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r0.f91462d
                r4.setVisibility(r6)
            L_0x00f5:
                double r7 = r18.getCost()
                int r1 = (int) r7
                if (r1 != 0) goto L_0x0102
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f91463e
                r1.setVisibility(r5)
                goto L_0x0144
            L_0x0102:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r0.f91463e
                android.view.View r5 = r0.itemView
                java.lang.String r7 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r5, r7)
                android.content.Context r5 = r5.getContext()
                java.lang.String r7 = "itemView.context"
                kotlin.jvm.internal.C7573i.m23582a(r5, r7)
                android.content.res.Resources r5 = r5.getResources()
                r7 = 2131825566(0x7f11139e, float:1.9283992E38)
                java.lang.String r5 = r5.getString(r7)
                java.lang.String r7 = "itemView.context.resourc…String(R.string.poi_cost)"
                kotlin.jvm.internal.C7573i.m23582a(r5, r7)
                r7 = 1
                java.lang.Object[] r8 = new java.lang.Object[r7]
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r8[r6] = r1
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r7)
                java.lang.String r1 = com.C1642a.m8034a(r5, r1)
                java.lang.String r5 = "java.lang.String.format(format, *args)"
                kotlin.jvm.internal.C7573i.m23582a(r1, r5)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r4.setText(r1)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f91463e
                r1.setVisibility(r6)
            L_0x0144:
                java.lang.String r1 = "poi_explore_card"
                com.ss.android.ugc.aweme.app.g.d r4 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r5 = "enter_from"
                java.lang.String r6 = "poi_page"
                com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
                java.lang.String r5 = "enter_method"
                java.lang.String r6 = "show"
                com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
                java.lang.String r5 = "poi_channel"
                java.lang.String r6 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107214b()
                com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
                java.lang.String r5 = "poi_id"
                if (r2 == 0) goto L_0x016d
                java.lang.String r6 = r19.getPoiId()
                goto L_0x016e
            L_0x016d:
                r6 = 0
            L_0x016e:
                com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
                java.lang.String r5 = "city_info"
                java.lang.String r6 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107204a()
                com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
                java.lang.String r5 = "content_type"
                int r3 = r20.intValue()
                java.lang.String r3 = com.p280ss.android.ugc.aweme.poi.utils.C35454m.m114520a(r3)
                com.ss.android.ugc.aweme.app.g.d r3 = r4.mo59973a(r5, r3)
                com.p280ss.android.ugc.aweme.poi.utils.C35454m.m114523a(r2, r1, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter.PoiItemViewHolder.mo88778a(com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct, com.ss.android.ugc.aweme.poi.PoiSimpleBundle, java.lang.Integer):void");
        }
    }

    public final int getItemCount() {
        List<SimplePoiInfoStruct> list = this.f91452a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int getItemViewType(int i) {
        List<SimplePoiInfoStruct> list = this.f91452a;
        if (list == null) {
            C7573i.m23580a();
        }
        if (((SimplePoiInfoStruct) list.get(i)).isValid()) {
            return 1;
        }
        return 2;
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        if (vVar instanceof PoiItemViewHolder) {
            PoiItemViewHolder poiItemViewHolder = (PoiItemViewHolder) vVar;
            List<SimplePoiInfoStruct> list = this.f91452a;
            if (list == null) {
                C7573i.m23580a();
            }
            poiItemViewHolder.mo88778a((SimplePoiInfoStruct) list.get(i), this.f91453b, this.f91454c);
            return;
        }
        if (vVar instanceof ClickToMoreViewHolder) {
            ((ClickToMoreViewHolder) vVar).mo88776a(this.f91455d, this.f91453b, this.f91454c);
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1m, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new PoiItemViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xz, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "view");
        return new ClickToMoreViewHolder(inflate2);
    }

    public RecommendPoiAdapter(List<? extends SimplePoiInfoStruct> list, PoiSimpleBundle poiSimpleBundle, Integer num, String str) {
        C7573i.m23587b(num, "recommendType");
        C7573i.m23587b(str, "title");
        this.f91452a = list;
        this.f91453b = poiSimpleBundle;
        this.f91454c = num;
        this.f91455d = str;
    }
}
