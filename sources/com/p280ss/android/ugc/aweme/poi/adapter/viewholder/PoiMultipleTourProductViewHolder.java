package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.bean.C35073e;
import com.p280ss.android.ugc.aweme.poi.p335ui.SpaceDecoration;
import com.p280ss.android.ugc.aweme.poi.utils.C35444d;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiMultipleTourProductViewHolder */
public final class PoiMultipleTourProductViewHolder extends C1293v {

    /* renamed from: a */
    public PoiSimpleBundle f91528a;

    /* renamed from: b */
    private final Context f91529b;

    /* renamed from: c */
    private final View f91530c;

    /* renamed from: d */
    private final DmtTextView f91531d;

    /* renamed from: e */
    private final RecyclerView f91532e;

    /* renamed from: f */
    private C35073e f91533f;

    /* renamed from: g */
    private LinearLayoutManager f91534g;

    /* renamed from: a */
    public final void mo88808a() {
        Integer num;
        Integer num2;
        String str;
        C35073e eVar = this.f91533f;
        if (!(eVar == null || eVar.f91732a == null)) {
            LinearLayoutManager linearLayoutManager = this.f91534g;
            if (linearLayoutManager != null) {
                num = Integer.valueOf(linearLayoutManager.mo5445j());
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                LinearLayoutManager linearLayoutManager2 = this.f91534g;
                if (linearLayoutManager2 != null) {
                    num2 = Integer.valueOf(linearLayoutManager2.mo5447l());
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    int i = intValue2 - 1;
                    if (intValue >= 0 && i >= intValue) {
                        C35073e eVar2 = this.f91533f;
                        if (eVar2 == null) {
                            C7573i.m23580a();
                        }
                        List<? extends AwemeRawAd> list = eVar2.f91732a;
                        if (list == null) {
                            C7573i.m23580a();
                        }
                        if (intValue2 < list.size() && intValue <= intValue2) {
                            while (true) {
                                PoiSimpleBundle poiSimpleBundle = this.f91528a;
                                if (poiSimpleBundle != null) {
                                    str = poiSimpleBundle.getPoiId();
                                } else {
                                    str = null;
                                }
                                C35073e eVar3 = this.f91533f;
                                if (eVar3 == null) {
                                    C7573i.m23580a();
                                }
                                List<? extends AwemeRawAd> list2 = eVar3.f91732a;
                                if (list2 == null) {
                                    C7573i.m23580a();
                                }
                                String creativeIdStr = ((AwemeRawAd) list2.get(intValue)).getCreativeIdStr();
                                C7573i.m23582a((Object) creativeIdStr, "mAd!!.products!![i].creativeIdStr");
                                m113084a(str, creativeIdStr);
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

    public PoiMultipleTourProductViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f91529b = context;
        View findViewById = view.findViewById(R.id.che);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.…tour_product_divider_top)");
        this.f91530c = findViewById;
        View findViewById2 = view.findViewById(R.id.chg);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.poi_tour_product_title)");
        this.f91531d = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.chf);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.poi_tour_product_list)");
        this.f91532e = (RecyclerView) findViewById3;
    }

    /* renamed from: a */
    private final void m113084a(String str, String str2) {
        if (str != null) {
            C35454m.m114523a(this.f91528a, "show_poi_product", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "show").mo59973a("poi_id", str).mo59973a("poi_posititon", "poi_page").mo59973a("product_id", str2));
        }
    }

    /* renamed from: a */
    public final void mo88809a(C35073e eVar, PoiSimpleBundle poiSimpleBundle) {
        int i;
        CharSequence charSequence;
        C7573i.m23587b(eVar, "ad");
        if (this.f91533f == null) {
            this.f91528a = poiSimpleBundle;
            this.f91533f = eVar;
            View view = this.f91530c;
            if (eVar.f91734c) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            this.f91531d.setText(eVar.f91733b);
            this.f91534g = new LinearLayoutManager(this.f91529b, 0, false);
            this.f91532e.setLayoutManager(this.f91534g);
            int dimensionPixelOffset = this.f91529b.getResources().getDimensionPixelOffset(R.dimen.lj);
            this.f91532e.mo5525a((C1272h) new SpaceDecoration(dimensionPixelOffset, dimensionPixelOffset));
            RecyclerView recyclerView = this.f91532e;
            Context context = this.f91529b;
            C35073e eVar2 = this.f91533f;
            if (eVar2 == null) {
                C7573i.m23580a();
            }
            List<? extends AwemeRawAd> list = eVar2.f91732a;
            if (list == null) {
                C7573i.m23580a();
            }
            recyclerView.setAdapter(new PoiTourProductAdapter(context, list, poiSimpleBundle));
            this.f91532e.mo5528a((C1281m) new PoiMultipleTourProductViewHolder$bind$1(this, poiSimpleBundle));
            String str = null;
            if (poiSimpleBundle != null) {
                charSequence = poiSimpleBundle.getAwemeId();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                Context context2 = this.f91529b;
                AwemeRawAd b = eVar.mo88905b();
                if (poiSimpleBundle != null) {
                    str = poiSimpleBundle.getPoiId();
                }
                C35444d.m114488a(context2, b, str);
            }
        }
    }
}
