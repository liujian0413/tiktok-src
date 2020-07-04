package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDcdCar;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.c */
final /* synthetic */ class C35043c implements OnClickListener {

    /* renamed from: a */
    private final PoiDcdProductViewHolder f91641a;

    /* renamed from: b */
    private final PoiDcdCar f91642b;

    /* renamed from: c */
    private final PoiSimpleBundle f91643c;

    /* renamed from: d */
    private final String f91644d;

    C35043c(PoiDcdProductViewHolder poiDcdProductViewHolder, PoiDcdCar poiDcdCar, PoiSimpleBundle poiSimpleBundle, String str) {
        this.f91641a = poiDcdProductViewHolder;
        this.f91642b = poiDcdCar;
        this.f91643c = poiSimpleBundle;
        this.f91644d = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91641a.mo88800b(this.f91642b, this.f91643c, this.f91644d, view);
    }
}
