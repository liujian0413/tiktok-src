package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.SquareImageView;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.utils.C35444d;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.m */
public final class C35054m {

    /* renamed from: a */
    public final Context f91663a;

    /* renamed from: b */
    private final SquareImageView f91664b;

    /* renamed from: c */
    private final DmtTextView f91665c;

    /* renamed from: d */
    private final DmtTextView f91666d;

    /* renamed from: e */
    private final DmtTextView f91667e;

    /* renamed from: f */
    private final View f91668f;

    /* renamed from: g */
    private final DmtTextView f91669g;

    /* renamed from: h */
    private final View f91670h;

    /* renamed from: i */
    private final DmtTextView f91671i;

    /* renamed from: j */
    private final View f91672j;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.m$a */
    static final class C35055a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35054m f91673a;

        /* renamed from: b */
        final /* synthetic */ PoiSimpleBundle f91674b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f91675c;

        C35055a(C35054m mVar, PoiSimpleBundle poiSimpleBundle, AwemeRawAd awemeRawAd) {
            this.f91673a = mVar;
            this.f91674b = poiSimpleBundle;
            this.f91675c = awemeRawAd;
        }

        public final void onClick(View view) {
            String str;
            CharSequence charSequence;
            String str2;
            CharSequence charSequence2;
            String str3;
            ClickInstrumentation.onClick(view);
            PoiSimpleBundle poiSimpleBundle = this.f91674b;
            String str4 = "click_poi_product";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page");
            String str5 = "poi_id";
            PoiSimpleBundle poiSimpleBundle2 = this.f91674b;
            String str6 = null;
            if (poiSimpleBundle2 != null) {
                str = poiSimpleBundle2.getPoiId();
            } else {
                str = null;
            }
            C35454m.m114523a(poiSimpleBundle, str4, a.mo59973a(str5, str).mo59973a("product_id", this.f91675c.getCreativeIdStr()).mo59973a("poi_posititon", "poi_page"));
            Context context = this.f91673a.f91663a;
            String openUrl = this.f91675c.getOpenUrl();
            C7573i.m23582a((Object) openUrl, "ad.openUrl");
            if (!C35444d.m114490a(context, openUrl, false)) {
                Context context2 = this.f91673a.f91663a;
                String webUrl = this.f91675c.getWebUrl();
                C7573i.m23582a((Object) webUrl, "ad.webUrl");
                String webTitle = this.f91675c.getWebTitle();
                C7573i.m23582a((Object) webTitle, "ad.webTitle");
                if (C35444d.m114489a(context2, webUrl, webTitle)) {
                    PoiSimpleBundle poiSimpleBundle3 = this.f91674b;
                    if (poiSimpleBundle3 != null) {
                        charSequence2 = poiSimpleBundle3.getAwemeId();
                    } else {
                        charSequence2 = null;
                    }
                    if (TextUtils.isEmpty(charSequence2)) {
                        Context context3 = this.f91673a.f91663a;
                        AwemeRawAd awemeRawAd = this.f91675c;
                        PoiSimpleBundle poiSimpleBundle4 = this.f91674b;
                        if (poiSimpleBundle4 != null) {
                            str3 = poiSimpleBundle4.getPoiId();
                        } else {
                            str3 = null;
                        }
                        C35444d.m114492b(context3, awemeRawAd, str3);
                        Context context4 = this.f91673a.f91663a;
                        AwemeRawAd awemeRawAd2 = this.f91675c;
                        PoiSimpleBundle poiSimpleBundle5 = this.f91674b;
                        if (poiSimpleBundle5 != null) {
                            str6 = poiSimpleBundle5.getPoiId();
                        }
                        C35444d.m114496d(context4, awemeRawAd2, str6);
                    }
                }
            } else {
                PoiSimpleBundle poiSimpleBundle6 = this.f91674b;
                if (poiSimpleBundle6 != null) {
                    charSequence = poiSimpleBundle6.getAwemeId();
                } else {
                    charSequence = null;
                }
                if (TextUtils.isEmpty(charSequence)) {
                    Context context5 = this.f91673a.f91663a;
                    AwemeRawAd awemeRawAd3 = this.f91675c;
                    PoiSimpleBundle poiSimpleBundle7 = this.f91674b;
                    if (poiSimpleBundle7 != null) {
                        str2 = poiSimpleBundle7.getPoiId();
                    } else {
                        str2 = null;
                    }
                    C35444d.m114492b(context5, awemeRawAd3, str2);
                    Context context6 = this.f91673a.f91663a;
                    AwemeRawAd awemeRawAd4 = this.f91675c;
                    PoiSimpleBundle poiSimpleBundle8 = this.f91674b;
                    if (poiSimpleBundle8 != null) {
                        str6 = poiSimpleBundle8.getPoiId();
                    }
                    C35444d.m114494c(context6, awemeRawAd4, str6);
                }
            }
        }
    }

    public C35054m(View view) {
        C7573i.m23587b(view, "itemView");
        this.f91672j = view;
        Context context = this.f91672j.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f91663a = context;
        View findViewById = this.f91672j.findViewById(R.id.ch9);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.poi_tour_img)");
        this.f91664b = (SquareImageView) findViewById;
        View findViewById2 = this.f91672j.findViewById(R.id.chk);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.poi_tour_title)");
        this.f91665c = (DmtTextView) findViewById2;
        View findViewById3 = this.f91672j.findViewById(R.id.chh);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.poi_tour_tag1)");
        this.f91666d = (DmtTextView) findViewById3;
        View findViewById4 = this.f91672j.findViewById(R.id.chi);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.poi_tour_tag2)");
        this.f91667e = (DmtTextView) findViewById4;
        View findViewById5 = this.f91672j.findViewById(R.id.chj);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.poi_tour_tag2_divider)");
        this.f91668f = findViewById5;
        View findViewById6 = this.f91672j.findViewById(R.id.cha);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.poi_tour_price)");
        this.f91669g = (DmtTextView) findViewById6;
        View findViewById7 = this.f91672j.findViewById(R.id.chc);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.poi_tour_price_end)");
        this.f91670h = findViewById7;
        View findViewById8 = this.f91672j.findViewById(R.id.chb);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.….poi_tour_price_discount)");
        this.f91671i = (DmtTextView) findViewById8;
    }

    /* renamed from: a */
    public final void mo88848a(AwemeRawAd awemeRawAd, PoiSimpleBundle poiSimpleBundle) {
        String str;
        C7573i.m23587b(awemeRawAd, "ad");
        String str2 = "show_poi_product";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "show");
        String str3 = "poi_id";
        if (poiSimpleBundle != null) {
            str = poiSimpleBundle.getPoiId();
        } else {
            str = null;
        }
        C35454m.m114523a(poiSimpleBundle, str2, a.mo59973a(str3, str).mo59973a("poi_posititon", "poi_page").mo59973a("product_id", awemeRawAd.getCreativeIdStr()));
        this.f91672j.setOnClickListener(new C35055a(this, poiSimpleBundle, awemeRawAd));
        if (!C6307b.m19566a((Collection<T>) awemeRawAd.getImageList())) {
            C23323e.m76524b(this.f91664b, (UrlModel) awemeRawAd.getImageList().get(0));
        }
        this.f91665c.setText(awemeRawAd.getTitle());
        this.f91666d.setVisibility(8);
        this.f91667e.setVisibility(8);
        this.f91668f.setVisibility(8);
        if (!TextUtils.isEmpty(awemeRawAd.getFeatureLabel())) {
            try {
                String featureLabel = awemeRawAd.getFeatureLabel();
                C7573i.m23582a((Object) featureLabel, "ad.featureLabel");
                List b = C7634n.m23768b((CharSequence) featureLabel, new String[]{"|"}, false, 0);
                if (!C6307b.m19566a((Collection<T>) b)) {
                    this.f91666d.setVisibility(0);
                    this.f91666d.setText((CharSequence) b.get(0));
                    if (b.size() > 1) {
                        this.f91668f.setVisibility(0);
                        this.f91667e.setVisibility(0);
                        this.f91667e.setText((CharSequence) b.get(1));
                    }
                }
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
        if (TextUtils.isEmpty(awemeRawAd.getPrice())) {
            this.f91669g.setVisibility(8);
            this.f91670h.setVisibility(8);
        } else {
            this.f91669g.setVisibility(0);
            this.f91670h.setVisibility(0);
            this.f91669g.setText(awemeRawAd.getPrice());
        }
        if (TextUtils.isEmpty(awemeRawAd.getPromotionLabel())) {
            this.f91671i.setVisibility(8);
            return;
        }
        this.f91671i.setVisibility(0);
        this.f91671i.setText(awemeRawAd.getPromotionLabel());
    }
}
