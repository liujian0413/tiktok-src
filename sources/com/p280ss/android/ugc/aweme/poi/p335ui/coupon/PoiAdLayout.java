package com.p280ss.android.ugc.aweme.poi.p335ui.coupon;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.AdCard;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35005a.C35006a;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35007b;
import com.p280ss.android.ugc.aweme.poi.utils.C35444d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.PoiAdLayout */
public class PoiAdLayout extends RelativeLayout {

    /* renamed from: a */
    private RelativeLayout f92522a;

    /* renamed from: b */
    private CircleImageView f92523b;

    /* renamed from: c */
    private TextView f92524c;

    /* renamed from: d */
    private TextView f92525d;

    /* renamed from: e */
    private TextView f92526e;

    /* renamed from: f */
    private TextView f92527f;

    /* renamed from: g */
    private TextView f92528g;

    /* renamed from: h */
    private TextView f92529h;

    /* renamed from: i */
    private TextView f92530i;

    /* renamed from: j */
    private boolean f92531j;

    public PoiAdLayout(Context context) {
        this(context, null);
    }

    public PoiAdLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m113945a(AwemeRawAd awemeRawAd, String str) {
        if (!this.f92531j) {
            this.f92531j = true;
            C35444d.m114488a(getContext(), awemeRawAd, str);
        }
    }

    public PoiAdLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a9t, this);
        this.f92522a = (RelativeLayout) findViewById(R.id.ccp);
        this.f92523b = (CircleImageView) findViewById(R.id.cco);
        this.f92524c = (TextView) findViewById(R.id.ccy);
        this.f92525d = (TextView) findViewById(R.id.cd0);
        this.f92526e = (TextView) findViewById(R.id.ccs);
        this.f92527f = (TextView) findViewById(R.id.ccx);
        this.f92528g = (TextView) findViewById(R.id.ccv);
        this.f92529h = (TextView) findViewById(R.id.ccu);
        this.f92530i = (TextView) findViewById(R.id.ccq);
    }

    /* renamed from: a */
    public final void mo89841a(AdCard adCard, String str, PoiSimpleBundle poiSimpleBundle) {
        if (adCard != null) {
            AwemeRawAd awemeAd = adCard.getAwemeAd();
            if (awemeAd != null) {
                C35007b.m113005c(new C35006a().mo88754b(poiSimpleBundle.getPoiId()).mo88752a("poi_page").mo88757e(poiSimpleBundle.getPreviousPage()).mo88761i(str).mo88750a(poiSimpleBundle).mo88758f("click_button").mo88753a());
                this.f92522a.setVisibility(0);
                C23323e.m76524b(this.f92523b, awemeAd.getAvatarIcon());
                this.f92524c.setText(awemeAd.getSource());
                this.f92525d.setText(awemeAd.getTitle());
                this.f92530i.setText(awemeAd.getButtonText());
                if (TextUtils.isEmpty(awemeAd.getFeatureLabel())) {
                    this.f92526e.setVisibility(8);
                } else {
                    this.f92526e.setVisibility(0);
                    this.f92526e.setText(awemeAd.getFeatureLabel());
                }
                String price = awemeAd.getPrice();
                if (TextUtils.isEmpty(price)) {
                    this.f92527f.setVisibility(8);
                    this.f92528g.setVisibility(8);
                    this.f92529h.setVisibility(8);
                } else {
                    this.f92527f.setText(price);
                    if (TextUtils.isEmpty(awemeAd.getOriginPrice())) {
                        this.f92528g.setVisibility(8);
                    } else {
                        this.f92529h.setText(awemeAd.getOriginPrice());
                        this.f92529h.getPaint().setFlags(16);
                    }
                }
                this.f92522a.setOnClickListener(new C35309f(this, poiSimpleBundle, str, awemeAd));
                if (TextUtils.isEmpty(poiSimpleBundle.getAwemeId())) {
                    m113945a(awemeAd, poiSimpleBundle.getPoiId());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89840a(PoiSimpleBundle poiSimpleBundle, String str, AwemeRawAd awemeRawAd, View view) {
        C35007b.m113006d(new C35006a().mo88754b(poiSimpleBundle.getPoiId()).mo88752a("poi_page").mo88757e(poiSimpleBundle.getPreviousPage()).mo88761i(str).mo88758f("click_button").mo88753a());
        C35444d.m114487a(getContext(), ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(poiSimpleBundle.getAwemeId()), "reserve", poiSimpleBundle.getPoiId());
        if (!C35444d.m114490a(getContext(), awemeRawAd.getOpenUrl(), false)) {
            if (C35444d.m114489a(getContext(), awemeRawAd.getWebUrl(), awemeRawAd.getWebTitle()) && TextUtils.isEmpty(poiSimpleBundle.getAwemeId())) {
                C35444d.m114492b(getContext(), awemeRawAd, poiSimpleBundle.getPoiId());
                C35444d.m114496d(getContext(), awemeRawAd, poiSimpleBundle.getPoiId());
            }
        } else if (TextUtils.isEmpty(poiSimpleBundle.getAwemeId())) {
            C35444d.m114492b(getContext(), awemeRawAd, poiSimpleBundle.getPoiId());
            C35444d.m114494c(getContext(), awemeRawAd, poiSimpleBundle.getPoiId());
        }
    }
}
