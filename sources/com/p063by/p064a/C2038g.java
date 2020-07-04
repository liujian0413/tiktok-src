package com.p063by.p064a;

import android.content.Context;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.g */
public final class C2038g implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        context.getResources();
        AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -1, -1);
        adHalfWebPageMaskLayer.setId(R.id.dq);
        if (viewGroup != null) {
            adHalfWebPageMaskLayer.setLayoutParams(a);
            if (z) {
                viewGroup.addView(adHalfWebPageMaskLayer);
            }
        }
        C1444a.m7242a(adHalfWebPageMaskLayer);
        return adHalfWebPageMaskLayer;
    }
}
