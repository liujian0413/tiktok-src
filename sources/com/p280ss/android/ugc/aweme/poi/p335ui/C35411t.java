package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.multirows.PoiDetailMultiRowsFragment;
import com.p280ss.android.ugc.aweme.poi.utils.C35462r;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.t */
public final class C35411t {

    /* renamed from: a */
    public static final C35411t f92884a = new C35411t();

    private C35411t() {
    }

    /* renamed from: a */
    public static final void m114384a(Context context, Bundle bundle) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(bundle, "bundle");
    }

    /* renamed from: a */
    public static final void m114385a(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "supplierId");
    }

    /* renamed from: a */
    public static final void m114386a(Context context, List<Object> list, LinearLayout linearLayout) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(linearLayout, "poiServiceItemContainer");
    }

    /* renamed from: a */
    public static final Fragment m114383a(PoiBundle poiBundle) {
        PoiDetailMultiRowsFragment poiDetailMultiRowsFragment;
        C7573i.m23587b(poiBundle, "poiBundle");
        try {
            poiDetailMultiRowsFragment = (PoiDetailMultiRowsFragment) C35462r.m114550a(poiBundle, PoiDetailMultiRowsFragment.class);
        } catch (Exception unused) {
            poiDetailMultiRowsFragment = null;
        }
        return poiDetailMultiRowsFragment;
    }
}
