package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.c */
public final class C2034c implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context);
        LayoutParams a = C1444a.m7241a(viewGroup, (int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics()));
        adHalfWebPageContainer.setId(R.id.dp);
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 81;
        }
        if (MarginLayoutParams.class.isInstance(a)) {
            ((MarginLayoutParams) a).bottomMargin = (int) TypedValue.applyDimension(1, -300.0f, resources.getDisplayMetrics());
        }
        if (viewGroup != null) {
            adHalfWebPageContainer.setLayoutParams(a);
            if (z) {
                viewGroup.addView(adHalfWebPageContainer);
            }
        }
        C1444a.m7242a(adHalfWebPageContainer);
        return adHalfWebPageContainer;
    }
}
