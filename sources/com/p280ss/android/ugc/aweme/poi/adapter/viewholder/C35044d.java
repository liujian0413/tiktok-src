package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDcdCar;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.d */
final /* synthetic */ class C35044d implements OnClickListener {

    /* renamed from: a */
    private final PoiDcdProductViewHolder f91645a;

    /* renamed from: b */
    private final PoiDcdCar f91646b;

    /* renamed from: c */
    private final PoiSimpleBundle f91647c;

    /* renamed from: d */
    private final String f91648d;

    C35044d(PoiDcdProductViewHolder poiDcdProductViewHolder, PoiDcdCar poiDcdCar, PoiSimpleBundle poiSimpleBundle, String str) {
        this.f91645a = poiDcdProductViewHolder;
        this.f91646b = poiDcdCar;
        this.f91647c = poiSimpleBundle;
        this.f91648d = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91645a.mo88798a(this.f91646b, this.f91647c, this.f91648d, view);
    }
}
