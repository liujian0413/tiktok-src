package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.bean.C35073e;
import com.p280ss.android.ugc.aweme.poi.utils.C35444d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiSingleTourProductViewHolder */
public final class PoiSingleTourProductViewHolder extends C1293v {

    /* renamed from: a */
    private final Context f91622a;

    /* renamed from: b */
    private final DmtTextView f91623b;

    /* renamed from: c */
    private final View f91624c;

    /* renamed from: d */
    private boolean f91625d;

    /* renamed from: e */
    private final C35054m f91626e;

    public PoiSingleTourProductViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f91622a = context;
        View findViewById = view.findViewById(R.id.chg);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.poi_tour_product_title)");
        this.f91623b = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.che);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.…tour_product_divider_top)");
        this.f91624c = findViewById2;
        this.f91626e = new C35054m(view);
    }

    /* renamed from: a */
    public final void mo88836a(C35073e eVar, PoiSimpleBundle poiSimpleBundle) {
        int i;
        CharSequence charSequence;
        C7573i.m23587b(eVar, "ad");
        View view = this.f91624c;
        if (eVar.f91734c) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        this.f91623b.setText(eVar.f91733b);
        C35054m mVar = this.f91626e;
        List<? extends AwemeRawAd> list = eVar.f91732a;
        if (list == null) {
            C7573i.m23580a();
        }
        mVar.mo88848a((AwemeRawAd) list.get(0), poiSimpleBundle);
        if (!this.f91625d) {
            String str = null;
            if (poiSimpleBundle != null) {
                charSequence = poiSimpleBundle.getAwemeId();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                Context context = this.f91622a;
                AwemeRawAd b = eVar.mo88905b();
                if (poiSimpleBundle != null) {
                    str = poiSimpleBundle.getPoiId();
                }
                C35444d.m114488a(context, b, str);
            }
            this.f91625d = true;
        }
    }
}
