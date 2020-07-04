package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.os.Bundle;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.poi.bean.PoiAwemePosition;
import com.p280ss.android.ugc.aweme.poi.model.C35105b;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import com.p280ss.android.ugc.aweme.poi.model.C35118h;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiPureAwemeFeedFragment */
public class PoiPureAwemeFeedFragment extends AbsPoiAwemeFeedFragment {

    /* renamed from: x */
    private PoiAwemePosition f92411x;

    /* renamed from: y */
    private String f92412y = "";

    /* renamed from: a */
    public final boolean mo89727a(PoiDetail poiDetail) {
        return false;
    }

    /* renamed from: g */
    public final int mo89734g() {
        return R.layout.pi;
    }

    /* renamed from: i */
    public final int mo89735i() {
        return 65440;
    }

    /* renamed from: s */
    public final C35386j mo89746s() {
        if (this.f92330f == null) {
            this.f92330f = new C35432v(this);
        }
        return this.f92330f;
    }

    /* renamed from: z */
    public final C35118h mo89748z() {
        return new C35105b(mo89735i());
    }

    /* renamed from: t */
    public final void mo73841t() {
        if (this.mUserVisibleHint && this.f75684m == -1) {
            this.f75684m = System.currentTimeMillis();
        }
    }

    /* renamed from: y */
    public final C35390l mo89747y() {
        if (this.f92329e == null) {
            this.f92329e = new C35433w(this.f92411x, this.f92412y);
        }
        return this.f92329e;
    }

    /* renamed from: u */
    public final void mo73842u() {
        if (this.mUserVisibleHint && this.f75684m != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f75684m;
            if (currentTimeMillis > 0) {
                C6726a.m20842a(new C35412u(this, currentTimeMillis));
            }
            this.f75684m = -1;
        }
    }

    /* renamed from: a */
    public final void mo73837a(Bundle bundle) {
        super.mo73837a(bundle);
        if (bundle != null) {
            this.f92411x = (PoiAwemePosition) bundle.getSerializable("EXTRA_POI_AWEME_POSITION");
            this.f92412y = bundle.getString("aweme_id", "");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo89776d(long j) {
        C6907h.m21517a(getContext(), "stay_time", this.f75685n, j, 0);
        mo73836a(j);
    }

    /* renamed from: a */
    public final void mo73836a(long j) {
        new C33248at().mo85138a(String.valueOf(j)).mo85139b(this.f75685n).mo85142e(this.f92334j).mo85141d("poi_video").mo85252e();
    }

    /* renamed from: a */
    public static PoiPureAwemeFeedFragment m113810a(String str, String str2, PoiAwemePosition poiAwemePosition, String str3) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("poi_bundle", new C35109e().mo89342c(str).mo89350k(str2).mo89331a());
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "poi_page");
        if (poiAwemePosition != null) {
            bundle.putSerializable("EXTRA_POI_AWEME_POSITION", poiAwemePosition);
        }
        bundle.putString("aweme_id", str3);
        PoiPureAwemeFeedFragment poiPureAwemeFeedFragment = new PoiPureAwemeFeedFragment();
        poiPureAwemeFeedFragment.setArguments(bundle);
        return poiPureAwemeFeedFragment;
    }
}
